/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.iucn.whp.dbservice.model.docs_customData;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil;
import com.iucn.whp.dbservice.service.docs_sitedataLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_meeLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalServiceUtil;
import com.liferay.portal.DuplicateLockException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.servlet.ServletResponseConstants;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.struts.PortletAction;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.WebKeys;
import com.liferay.portlet.asset.AssetCategoryException;
import com.liferay.portlet.asset.AssetTagException;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.DuplicateFolderNameException;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.NoSuchFolderException;
import com.liferay.portlet.documentlibrary.SourceFileNameException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
import com.sun.jmx.snmp.Timestamp;

/**
 * @author Brian Wing Shun Chan
 * @author Sergio González
 */
/**
 * @author Kamal.Upreti
 *
 */
/**
 * @author Kamal.Upreti
 *
 */
public class EditEntryAction extends PortletAction {

	@Override
	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		
		HttpServletResponse Response = PortalUtil.getHttpServletResponse(actionResponse);

		
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		try {
			if (cmd.equals(Constants.DELETE)) {
				deleteEntries(actionRequest);
			}
			else if (cmd.equals(Constants.CANCEL_CHECKOUT)) {
				cancelCheckedOutEntries(actionRequest);
			}
			else if (cmd.equals(Constants.CHECKIN)) {
				checkInEntries(actionRequest);
			}
			else if (cmd.equals(Constants.CHECKOUT)) {
				checkOutEntries(actionRequest);
			}
			else if (cmd.equals(Constants.MOVE)) {
				moveEntries(actionRequest);
			}
			

			WindowState windowState = actionRequest.getWindowState();

			if (!windowState.equals(LiferayWindowState.POP_UP)) {
				sendRedirect(actionRequest, actionResponse);
			}
			else {
				String redirect = PortalUtil.escapeRedirect(
					ParamUtil.getString(actionRequest, "redirect"));

				if (Validator.isNotNull(redirect)) {
					actionResponse.sendRedirect(redirect);
				}
			}
		}
		catch (Exception e) {
			if (e instanceof DuplicateLockException ||
				e instanceof NoSuchFileEntryException ||
				e instanceof NoSuchFolderException ||
				e instanceof PrincipalException) {

				if (e instanceof DuplicateLockException) {
					DuplicateLockException dle = (DuplicateLockException)e;

					SessionErrors.add(
						actionRequest, dle.getClass(), dle.getLock());
				}
				else {
					SessionErrors.add(actionRequest, e.getClass());
				}

				setForward(actionRequest, "portlet.document_library.error");
			}
			else if (e instanceof DuplicateFileException ||
					 e instanceof DuplicateFolderNameException ||
					 e instanceof NoSuchFolderException ||
					 e instanceof SourceFileNameException) {

				if (e instanceof DuplicateFileException) {
					HttpServletResponse response =
						PortalUtil.getHttpServletResponse(actionResponse);

					response.setStatus(
						ServletResponseConstants.SC_DUPLICATE_FILE_EXCEPTION);
				}

				SessionErrors.add(actionRequest, e.getClass());
			}
			else if (e instanceof AssetCategoryException ||
					 e instanceof AssetTagException) {

				SessionErrors.add(actionRequest, e.getClass(), e);
			}
			else {
				throw e;
			}
		}
	}

	@Override
	public ActionForward render(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws Exception {

		try {
			ActionUtil.getFileEntries(renderRequest);
			ActionUtil.getFileShortcuts(renderRequest);
			ActionUtil.getFolders(renderRequest);
		}
		catch (Exception e) {
			if (e instanceof NoSuchFileEntryException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass());

				return mapping.findForward("portlet.document_library.error");
			}
			else {
				throw e;
			}
		}

		String forward = "portlet.document_library.edit_entry";

		return mapping.findForward(getForward(renderRequest, forward));
	}

	protected void cancelCheckedOutEntries(ActionRequest actionRequest)
		throws Exception {

		long[] fileEntryIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

		for (long fileEntryId : fileEntryIds) {
			DLAppServiceUtil.cancelCheckOut(fileEntryId);
		}
	}

	protected void checkInEntries(ActionRequest actionRequest)
		throws Exception {

		long[] fileEntryIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		for (long fileEntryId : fileEntryIds) {
			DLAppServiceUtil.checkInFileEntry(
				fileEntryId, false, StringPool.BLANK, serviceContext);
		}
	}

	protected void checkOutEntries(ActionRequest actionRequest)
		throws Exception {

		long[] fileEntryIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		for (long fileEntryId : fileEntryIds) {
			DLAppServiceUtil.checkOutFileEntry(fileEntryId, serviceContext);
		}
	}

	protected void deleteEntries(ActionRequest actionRequest) throws Exception {
		long[] deleteFolderIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "folderIds"), 0L);

		for (long deleteFolderId : deleteFolderIds) {
			DLAppServiceUtil.deleteFolder(deleteFolderId);
		}

		// Delete file shortcuts before file entries. See LPS-21348.

		long[] deleteFileShortcutIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileShortcutIds"), 0L);

		for (long deleteFileShortcutId : deleteFileShortcutIds) {
			DLAppServiceUtil.deleteFileShortcut(deleteFileShortcutId);
		}

		long[] deleteFileEntryIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

		for (long deleteFileEntryId : deleteFileEntryIds) {
			FileEntry fileEntryobj=DLAppServiceUtil.getFileEntry(deleteFileEntryId);
			long siteId=getdocSiteid(fileEntryobj);
			 String category="";
			if(siteId!=-1)
			   category=doccategory(fileEntryobj);

			DLAppServiceUtil.deleteFileEntry(deleteFileEntryId);
			 if(!category.isEmpty())
				 removerelateddoclink(siteId, category, deleteFileEntryId);
			 removedocinfo(deleteFileEntryId);
			 removedocsitedata(deleteFileEntryId);

			
		}
	}

	
	
	

	protected void moveEntries(ActionRequest actionRequest) throws Exception {
		long newFolderId = ParamUtil.getLong(actionRequest, "newFolderId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			DLFileEntry.class.getName(), actionRequest);

		long[] folderIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "folderIds"), 0L);

		for (long folderId : folderIds) {
			DLAppServiceUtil.moveFolder(folderId, newFolderId, serviceContext);
		}

		long[] fileEntryIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

		for (long fileEntryId : fileEntryIds) {
			DLAppServiceUtil.moveFileEntry(
				fileEntryId, newFolderId, serviceContext);
		}

		long[] fileShortcutIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "fileShortcutIds"), 0L);

		for (long fileShortcutId : fileShortcutIds) {
			if (fileShortcutId == 0) {
				continue;
			}

			DLFileShortcut fileShortcut = DLAppServiceUtil.getFileShortcut(
				fileShortcutId);

			DLAppServiceUtil.updateFileShortcut(
				fileShortcutId, newFolderId, fileShortcut.getToFileEntryId(),
				serviceContext);
		}
	}
	
	
	private String doccategory(FileEntry fileEntry){
		String doccategory="";
		 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
		 try {
			DLFileVersion dlFileVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
			 long fileversionid = dlFileVersion.getFileVersionId();
			  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
			  
			          mapcategory =objDlfileentry.getFieldsMap(fileversionid);
			            if(mapcategory!=null){
					    Set<String>docfieldset=mapcategory.keySet();
						Iterator<String>docfieldsetItr=docfieldset.iterator();
						boolean outloop=true;
						             while(docfieldsetItr.hasNext()){
												 String fieldName=docfieldsetItr.next();
												 Fields field=mapcategory.get(fieldName);
												 Set<String> metatagnames=field.getNames();
											     Iterator<String> metatagnamesItr=metatagnames.iterator();
											     com.liferay.portlet.dynamicdatamapping.storage.Field  fieldd=null;
												while(metatagnamesItr.hasNext())
												{
													     String metatagnamesStr=metatagnamesItr.next();
													      if(metatagnamesStr.toLowerCase().contains("catg")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 doccategory =(String) fieldd.getValue();
													    	  doccategory =doccategory.replace("[\"","" );
														      doccategory =doccategory.replace("\"]","" );
													          outloop=false;
														       break;
												          }
										        }
												if(!outloop)
													break;
							  
					                    }
						
			
                
				  }
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	return doccategory;
	}
	private String doctype(FileEntry fileEntry){
		String doctype="";
		 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
		 try {
			DLFileVersion dlFileVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
			 long fileversionid = dlFileVersion.getFileVersionId();
			  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
			  
			  mapcategory =objDlfileentry.getFieldsMap(fileversionid);
			            if(mapcategory!=null){
					    Set<String>docfieldset=mapcategory.keySet();
						Iterator<String>docfieldsetItr=docfieldset.iterator();
						boolean outloop=true;
						             while(docfieldsetItr.hasNext()){
												 String fieldName=docfieldsetItr.next();
												 Fields field=mapcategory.get(fieldName);
												 Set<String> metatagnames=field.getNames();
											     Iterator<String> metatagnamesItr=metatagnames.iterator();
											     com.liferay.portlet.dynamicdatamapping.storage.Field  fieldd=null;
											     String date=null;
												while(metatagnamesItr.hasNext())
												{
													     String metatagnamesStr=metatagnamesItr.next();
													      if(metatagnamesStr.toLowerCase().contains("type")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 doctype =(String) fieldd.getValue();
													    	 doctype =doctype.replace("[\"","" );
													    	 doctype =doctype.replace("\"]","" );
													          outloop=false;
														       break;
														       
												          }
										        }
												if(!outloop)
													break;
							  
					                    }
						
			
                
				  }
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	return doctype;
	}
	
	public boolean addsitedata(String docurl,long siteid,Date publishdate,long versionId,long fileentryid,String docName){
		
		try {
			docs_sitedataLocalServiceUtil.adddocs_sitedata(siteid, docurl, publishdate, fileentryid, versionId, docName);
			
			return true;
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	private boolean updatedoclink(String docurl,long siteid,Date publishdate,String category,long fileentryid,String docName,long versionid) {
		
        //whp_sites_external_documentsLocalServiceUtil.addwhp_sites_external_documents(whp_sites_external_documents);
		if(category.equalsIgnoreCase("Management Plan")){
			whp_sites_mgmt_plan_stateLocalServiceUtil.addwhp_sites_mgmt_plan_state(siteid,docurl,publishdate,fileentryid,docName);
			whp_sitesLocalServiceUtil.updateMGMT_PLANflag(siteid,true);
        	return true;
		}
       if(category.equalsIgnoreCase("Management Effectiveness Evaluation")){
			try {
				whp_sites_meeLocalServiceUtil.addwhp_sites_mee(siteid,docurl,publishdate,fileentryid,docName);
				whp_sitesLocalServiceUtil.updatemeeflag(siteid,true);
				//whp_sites_meeLocalServiceUtil.a
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   return true;
       }
       if(category.equalsIgnoreCase("SOC report")){
			whp_sites_soc_reportsLocalServiceUtil.addwhp_sites_soc_reports(siteid,docurl,publishdate,fileentryid,docName);
			whp_sitesLocalServiceUtil.updatesocflag(siteid,true);
			//whp_sites_soc_reportsLocalServiceUtil.
    	   return true;
    	
      }
       if(category.equalsIgnoreCase("Reactive monitoring mission")){
    	  // type="Reactive monitoring";
    	   whp_sites_missionLocalServiceUtil.addwhp_sites_mgmt_mission(siteid, docurl, publishdate, fileentryid, 1,docName);
    	   whp_sitesLocalServiceUtil.updatemissionflag(siteid,true);
    	   return true;
      }
       if(category.equalsIgnoreCase("Advisory mission")){
			//type="Advisory";
    	   whp_sites_missionLocalServiceUtil.addwhp_sites_mgmt_mission(siteid, docurl, publishdate, fileentryid, 2,docName);
    	   whp_sitesLocalServiceUtil.updatemissionflag(siteid,true);
    	   return true;
      }
       
       
	    addsitedata(docurl,siteid,publishdate,versionid,fileentryid,docName);
	  
		return false;
	}
	public boolean updatedocinfo(Date upload_date,Date publish_date,long fileentryid,long versionid,String type,String category,String author){
		
		try {
			docs_customDataLocalServiceUtil.adddocs_customData(fileentryid, versionid, publish_date, upload_date, type, category, author);
			return true;
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean checkHighestversion(FileEntry fileobj,FileVersion version){
		try {
			long versionid=-1;
			List<FileVersion>fversions=fileobj.getFileVersions(1);
			for(int i=0;i<fversions.size();i++){
				 FileVersion fversion=fversions.get(i);
				 versionid= fversion.getFileVersionId();
				 if(versionid>version.getFileVersionId() || versionid==version.getFileVersionId())
					 return true;
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	      
		
	}
	private void removerelateddoclink(long siteId, String category,
			long deleteFileEntryId) {
		if(!category.isEmpty()){
				if(category.equalsIgnoreCase("Management Plan") ||category.equalsIgnoreCase("Other management plan")){
					
					whp_sites_mgmt_plan_stateLocalServiceUtil.removewhp_sites_mgmt_plan_state(deleteFileEntryId);
					whp_sitesLocalServiceUtil.updateMGMT_PLANflag(siteId,false);
		        	
				}
		       if(category.equalsIgnoreCase("Management Effectiveness Evaluation")){
		    	
					whp_sites_meeLocalServiceUtil.removewhp_sites_mee(deleteFileEntryId);
					whp_sitesLocalServiceUtil.updatemeeflag(siteId,false);
					
		    	   
		       }
		       if(category.equalsIgnoreCase("SOC report")){
					whp_sites_soc_reportsLocalServiceUtil.removewhp_sites_soc_reports(deleteFileEntryId);
					whp_sitesLocalServiceUtil.updatesocflag(siteId,false);
					
		    	
		      }
		       if(category.equalsIgnoreCase("Reactive monitoring mission")){
		    	   whp_sites_missionLocalServiceUtil.removewhp_sites_mission(deleteFileEntryId, 1);
		    	   whp_sitesLocalServiceUtil.updatemissionflag(siteId,false);
		      }
		       if(category.equalsIgnoreCase("Advisory mission")){
					//type="Advisory";
		    	   whp_sites_missionLocalServiceUtil.removewhp_sites_mission(deleteFileEntryId,2);
		    	   whp_sitesLocalServiceUtil.updatemissionflag(siteId,false);
		    	  
		    	  
		      }
		}
		
	}
	private void removedocinfo(long deleteFileEntryId) {
		  docs_customDataLocalServiceUtil.removedocs_customData(deleteFileEntryId);
		}
	private void removedocsitedata(long deleteFileEntryId) {
		  docs_sitedataLocalServiceUtil.removedocs_sitedata(deleteFileEntryId);
		}
		public boolean getcomvalue(FileEntry fileEntry,long docsiteId){
		    Object comFieldValues=null;
		   
			try {
				
				
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Full_COM");
				if(comFieldValues!=null){
				String full_comaval=comFieldValues.toString();
				if(!full_comaval.isEmpty() && full_comaval.toUpperCase().contains("COM")){
			    	 int comstartval=full_comaval.toUpperCase().indexOf("COM");
			    	 String comval=full_comaval.substring(0, comstartval);
			    	 if(fileEntry.getExpandoBridge().hasAttribute("COM")){
					    	fileEntry.getExpandoBridge().setAttribute("COM", comval);
					    }
			     }
				
			}
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    
		    return true;
		}

		private long getdocSiteid(FileEntry fileEntry){
			long siteId=-1;
			int a=0;
			try {
				Object docsitevalues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Site");            
				String [] cfValues = (String[]) docsitevalues ;
				String docsitename = (cfValues .length > 0 ? cfValues [0] : "");
				//whp_sitesLocalServiceUtil.
				if(docsitename.equalsIgnoreCase("Select Site")){
					//fileEntry.getExpandoBridge().setAttribute("Site", " ");
					return -1;
				}
				if(docsitename.isEmpty())
					return -1;
				whp_sites siteobj =whp_sitesLocalServiceUtil.getSiteByNameEn(docsitename);
				//whp_sites siteobj=whp_sitesUtil.findByname_en(docsitename);
				String NameSite=siteobj.getName_en();
				siteId=siteobj.getSite_id();
				
				} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Problem in getting siteid "+ e.getMessage());
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Problem in getting siteid "+ e.getMessage());
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Problem in getting siteid "+ e.getMessage());
			}
	        return siteId ;
		}
		


		public void serveResource(ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
				ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {

			
			
			String cmd = ParamUtil.getString(resourceRequest, "cmd");

		
			  if (cmd.equals("Export")) {
				  PortletSession session = resourceRequest.getPortletSession();
				 exportDocumentData(resourceRequest,resourceResponse);
				}
			
			  if (cmd.equals("Download")) {
				  PortletSession session = resourceRequest.getPortletSession();
				  downloadDocumentData(resourceRequest,resourceResponse);
				}
			

		}
		
		
		public static void exportDocumentData(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws NumberFormatException, PortalException, SystemException{


	        long file_id=0;

			String fileEntryIds=ParamUtil.getString(resourceRequest, "fileEntryIds");
			String[] fileentires = fileEntryIds.split(",");
			List<Long> tempResults =new ArrayList<Long>();

			
			if(!fileEntryIds.isEmpty())
			{
			if(fileentires[0].equals("true")){
				
			 for(int i=1;i<fileentires.length;i++)
	           {
	        	   DLFileEntry  FileEntry  =DLFileEntryLocalServiceUtil.getDLFileEntry(Long.parseLong(fileentires[i]));
	        	   file_id  =FileEntry.getFileEntryId();
	        	   tempResults.add(file_id);
	        	   
	           }
			}
			else
			{
				for(int i=0;i<fileentires.length;i++)
		           {
		        	   DLFileEntry  FileEntry  =DLFileEntryLocalServiceUtil.getDLFileEntry(Long.parseLong(fileentires[i]));
		        	   file_id  =FileEntry.getFileEntryId();
		        	   tempResults.add(file_id);
		        	   
		           }
			}
			}
			           
				try {
					
					
					 
					 
					HSSFWorkbook hwb = new HSSFWorkbook();
					HSSFSheet sheet = hwb.createSheet("Site Information");
					org.apache.poi.ss.usermodel.Font font = hwb.createFont();
					font.setFontHeightInPoints((short)11);
					font.setFontName("Arial");
					font.setItalic(false);
					font.setStrikeout(false);
					font.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
					CellStyle style = hwb.createCellStyle();

					style.setBorderBottom(CellStyle.BORDER_THIN);
					style.setBorderLeft(CellStyle.BORDER_THIN);
					style.setBorderTop(CellStyle.BORDER_THIN);
					style.setBorderRight(CellStyle.BORDER_THIN);

					style.setBorderBottom(CellStyle.BORDER_THIN);
					style.setBottomBorderColor(HSSFColor.BLACK.index);
					style.setFont(font);

					CellStyle filterStyle = hwb.createCellStyle();

					org.apache.poi.ss.usermodel.Font filterfont = hwb.createFont();
					filterfont.setFontHeightInPoints((short) 9);
					filterfont.setFontName("Courier New");
					filterfont.setItalic(false);
					filterfont.setStrikeout(false);
					filterfont.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
					filterStyle.setFont(filterfont);

					filterStyle.setBorderBottom(CellStyle.BORDER_THIN);
					filterStyle.setBorderLeft(CellStyle.BORDER_THIN);
					filterStyle.setBorderTop(CellStyle.BORDER_THIN);
					filterStyle.setBorderRight(CellStyle.BORDER_THIN);
					HSSFRow rowhead = sheet.createRow((short) 2);
					rowhead.createCell((short) 0).setCellValue("S.No.");
					rowhead.createCell((short) 1).setCellValue("Title ");
					rowhead.createCell((short) 2).setCellValue("Site Name ");
					rowhead.createCell((short) 3).setCellValue("Category Type");
					rowhead.createCell((short) 4).setCellValue("Com");
					rowhead.createCell((short) 5).setCellValue("Upload Date");
					rowhead.createCell((short) 6).setCellValue("File Type");
					

					int index = 3;
					int sno = 0;
				
					for(int i=0;i<tempResults.size();i++)
					
					{
								
						sno++;
						
						DLFileEntry objdlfileentry =DLFileEntryLocalServiceUtil.getDLFileEntry(tempResults.get(i));
						docs_customData objdocs_customData=null;
						try {
							objdocs_customData = docs_customDataLocalServiceUtil.getfileEntry(tempResults.get(i));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}

						String com="";
						if(objdocs_customData!=null){
							com=objdocs_customData.getCom();
						}
						 
						String siteName ="";
						 if(objdocs_customData!=null)
							{
							 siteName=objdocs_customData.getSite();
							}
						
						 
						 String doccategory="";
						 if(objdocs_customData!=null)
							{
							 doccategory=objdocs_customData.getCategory();
							}
						 
						 
							
						HSSFRow row = sheet.createRow((short) index);
						row.createCell((short) 0).setCellValue(sno);
						row.createCell((short) 1).setCellValue(objdlfileentry.getTitle());
						row.createCell((short) 2).setCellValue(siteName);
						row.createCell((short) 3).setCellValue(doccategory);
						row.createCell((short) 4).setCellValue(com);
						row.createCell((short) 5).setCellValue(objdlfileentry.getModifiedDate());
						row.createCell((short) 6).setCellValue(objdlfileentry.getMimeType());


						index++;

					}
					
					resourceResponse.setContentType("application/vnd.ms-excel");
					resourceResponse.addProperty("Content-Disposition", "attachment;filename=Document_Listing.xls");
					OutputStream fileOut = resourceResponse.getPortletOutputStream();
					hwb.write(fileOut);
					fileOut.close();


					

				} catch (Exception ex) {
					ex.printStackTrace();
				}

		
}
	
		
		public static void downloadDocumentData(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws NumberFormatException, PortalException, SystemException, IOException{
		
			
			
			 long file_id=0;

				String fileEntryIds=ParamUtil.getString(resourceRequest, "fileEntryIds");
				String[] fileentires = fileEntryIds.split(",");
				List<Long> tempResults =new ArrayList<Long>();

				
				if(!fileEntryIds.isEmpty())
				{
				if(fileentires[0].equals("true")){
					
				 for(int i=1;i<fileentires.length;i++)
		           {
		        	   DLFileEntry  FileEntry  =DLFileEntryLocalServiceUtil.getDLFileEntry(Long.parseLong(fileentires[i]));
		        	   file_id  =FileEntry.getFileEntryId();
		        	   tempResults.add(file_id);
		        	   
		           }
				}
				else
				{
					for(int i=0;i<fileentires.length;i++)
			           {
			        	   DLFileEntry  FileEntry  =DLFileEntryLocalServiceUtil.getDLFileEntry(Long.parseLong(fileentires[i]));
			        	   file_id  =FileEntry.getFileEntryId();
			        	   tempResults.add(file_id);
			        	   
			           }
				}
				}
			
			String ext="";
			String filename="";
			Map<String ,InputStream> zipmap= new HashMap<String, InputStream>();
			

			HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
			 
		       response.setContentType("application/force-download");
		       response.setHeader("Content-Transfer-Encoding", "binary");
			   response.setHeader("Content-disposition", "attachement; filename=Document.zip");

			
				for(int i=0;i<tempResults.size();i++)
				
			{
		        	   DLFileEntry  FileEntry  =DLFileEntryLocalServiceUtil.getDLFileEntry(tempResults.get(i));
		        	   
                         
		        	   filename=FileEntry.getTitle();
		        	   ext=FileEntry.getExtension();
		        	   
		        	   
		        	   InputStream inputStream;
					try {
						inputStream = DLFileEntryLocalServiceUtil.getFileAsStream(FileEntry.getUserId(), FileEntry.getFileEntryId(), FileEntry.getVersion());
						 zipmap.put(filename.trim()+"."+ext.trim(), inputStream);
					} catch (Exception e) {
					}
		        	   
		        	  
			}
				Set<String> fileNameset = zipmap.keySet();
				
				ZipOutputStream zipout= new ZipOutputStream(resourceResponse.getPortletOutputStream());
				
				Iterator<String> itr=fileNameset.iterator();
				
				while(itr.hasNext())
				{
					String tempFile=itr.next();
					
					InputStream inputStream1 =zipmap.get(tempFile);
					zipout.putNextEntry(new ZipEntry(tempFile));
					
		        	   try
		        	   {

		               byte[] b = new byte[1024];
		               int count;

		               while ((count = inputStream1.read(b)) > 0) {
		            	   zipout.write(b, 0, count);
		               }
		               
		               inputStream1.close();
		        	   }
		           catch (IOException ex) {
		           }
					   
		              	         
		           }
				
				


				 zipout.close();
				 
		}
}		