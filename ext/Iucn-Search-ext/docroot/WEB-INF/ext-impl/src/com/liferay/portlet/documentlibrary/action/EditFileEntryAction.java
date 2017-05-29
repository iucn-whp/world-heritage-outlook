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

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

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
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.ServletResponseConstants;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TempFileUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.struts.ActionConstants;
import com.liferay.portal.struts.PortletAction;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portal.util.PrefsPropsUtil;
import com.liferay.portal.util.WebKeys;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portlet.asset.AssetCategoryException;
import com.liferay.portlet.asset.AssetTagException;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.assetpublisher.util.AssetPublisherUtil;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.DuplicateFolderNameException;
import com.liferay.portlet.documentlibrary.FileExtensionException;
import com.liferay.portlet.documentlibrary.FileMimeTypeException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.InvalidFileEntryTypeException;
import com.liferay.portlet.documentlibrary.InvalidFileVersionException;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.NoSuchFileVersionException;
import com.liferay.portlet.documentlibrary.NoSuchFolderException;
import com.liferay.portlet.documentlibrary.SourceFileNameException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.dynamicdatamapping.StorageFieldRequiredException;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
import sun.java2d.SunGraphics2D;

/**
 * @author Brian Wing Shun Chan
 * @author Alexander Chow
 * @author Sergio Gonz�lez
 */
public class EditFileEntryAction extends PortletAction {

	@Override
	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		try {
			if (Validator.isNull(cmd)) {
				UploadException uploadException =
					(UploadException)actionRequest.getAttribute(
						WebKeys.UPLOAD_EXCEPTION);

				if (uploadException != null) {
					if (uploadException.isExceededSizeLimit()) {
						throw new FileSizeException(uploadException.getCause());
					}

					throw new PortalException(uploadException.getCause());
				}
			}
			else if (cmd.equals(Constants.ADD) ||
					 cmd.equals(Constants.UPDATE) ||
					 cmd.equals(Constants.UPDATE_AND_CHECKIN)) {

				updateFileEntry(portletConfig, actionRequest, actionResponse);
			}
			else if (cmd.equals(Constants.ADD_MULTIPLE)) {
				addMultipleFileEntries(actionRequest, actionResponse);
			}
			else if (cmd.equals(Constants.ADD_TEMP)) {
				addTempFileEntry(actionRequest);
			}
			else if (cmd.equals(Constants.DELETE)) {
				deleteFileEntry(actionRequest);
			}
			else if (cmd.equals(Constants.DELETE_TEMP)) {
				deleteTempFileEntry(actionRequest, actionResponse);
			}
			else if (cmd.equals(Constants.CANCEL_CHECKOUT)) {
				cancelFileEntriesCheckOut(actionRequest);
			}
			else if (cmd.equals(Constants.CHECKIN)) {
				checkInFileEntries(actionRequest);
			}
			else if (cmd.equals(Constants.CHECKOUT)) {
				checkOutFileEntries(actionRequest);
			}
			else if (cmd.equals(Constants.MOVE)) {
				moveFileEntries(actionRequest);
			}
			else if (cmd.equals(Constants.REVERT)) {
				revertFileEntry(actionRequest);
			}

			WindowState windowState = actionRequest.getWindowState();

			if (cmd.equals(Constants.ADD_TEMP) ||
				cmd.equals(Constants.DELETE_TEMP)) {

				setForward(actionRequest, ActionConstants.COMMON_NULL);
			}
			else if (cmd.equals(Constants.PREVIEW)) {
			}
			else if (!windowState.equals(LiferayWindowState.POP_UP)) {
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
				e instanceof InvalidFileVersionException ||
				e instanceof NoSuchFileEntryException ||
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
					 e instanceof FileExtensionException ||
					 e instanceof FileMimeTypeException ||
					 e instanceof FileNameException ||
					 e instanceof FileSizeException ||
					 e instanceof NoSuchFolderException ||
					 e instanceof SourceFileNameException ||
					 e instanceof StorageFieldRequiredException) {

				if (!cmd.equals(Constants.ADD_MULTIPLE) &&
					!cmd.equals(Constants.ADD_TEMP)) {

					SessionErrors.add(actionRequest, e.getClass());

					return;
				}

				if (e instanceof DuplicateFileException) {
					HttpServletResponse response =
						PortalUtil.getHttpServletResponse(actionResponse);

					response.setStatus(
						ServletResponseConstants.SC_DUPLICATE_FILE_EXCEPTION);
				}
				else if (e instanceof FileExtensionException) {
					HttpServletResponse response =
						PortalUtil.getHttpServletResponse(actionResponse);

					response.setStatus(
						ServletResponseConstants.SC_FILE_EXTENSION_EXCEPTION);
				}
				else if (e instanceof FileNameException) {
					HttpServletResponse response =
						PortalUtil.getHttpServletResponse(actionResponse);

					response.setStatus(
						ServletResponseConstants.SC_FILE_NAME_EXCEPTION);
				}
				else if (e instanceof FileSizeException) {
					HttpServletResponse response =
						PortalUtil.getHttpServletResponse(actionResponse);

					response.setStatus(
						ServletResponseConstants.SC_FILE_SIZE_EXCEPTION);
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
			ActionUtil.getFileEntry(renderRequest);
		}
		catch (Exception e) {
			if (e instanceof NoSuchFileEntryException ||
				e instanceof NoSuchFileVersionException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass());

				return mapping.findForward("portlet.document_library.error");
			}
			else {
				throw e;
			}
		}

		String forward = "portlet.document_library.edit_file_entry";

		return mapping.findForward(getForward(renderRequest, forward));
	}

	@Override
	public void serveResource(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		PortletContext portletContext = portletConfig.getPortletContext();

		PortletRequestDispatcher portletRequestDispatcher =
			portletContext.getRequestDispatcher(
				"/html/portlet/document_library/" +
					"upload_multiple_file_entries_resources.jsp");

		portletRequestDispatcher.include(resourceRequest, resourceResponse);
	}

	protected void addMultipleFileEntries(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		List<String> validFileNames = new ArrayList<String>();
		List<KeyValuePair> invalidFileNameKVPs = new ArrayList<KeyValuePair>();

		String[] selectedFileNames = ParamUtil.getParameterValues(
			actionRequest, "selectedFileName");
		

		for (String selectedFileName : selectedFileNames) {
			addMultipleFileEntries(
				actionRequest, actionResponse, selectedFileName, validFileNames,
				invalidFileNameKVPs);
		}

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (String validFileName : validFileNames) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject.put("added", Boolean.TRUE);
			jsonObject.put("fileName", validFileName);

			jsonArray.put(jsonObject);
		}

		for (KeyValuePair invalidFileNameKVP : invalidFileNameKVPs) {
			String fileName = invalidFileNameKVP.getKey();
			String errorMessage = invalidFileNameKVP.getValue();

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject.put("added", Boolean.FALSE);
			jsonObject.put("errorMessage", errorMessage);
			jsonObject.put("fileName", fileName);

			jsonArray.put(jsonObject);
		}

		writeJSON(actionRequest, actionResponse, jsonArray);
	}

	protected void addMultipleFileEntries(
			ActionRequest actionRequest, ActionResponse actionResponse,
			String selectedFileName, List<String> validFileNames,
			List<KeyValuePair> invalidFileNameKVPs)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long repositoryId = ParamUtil.getLong(actionRequest, "repositoryId");
		long folderId = ParamUtil.getLong(actionRequest, "folderId");
		String contentType = MimeTypesUtil.getContentType(selectedFileName);
		String description = ParamUtil.getString(actionRequest, "description");
		String changeLog = ParamUtil.getString(actionRequest, "changeLog");
		String sitename = ParamUtil.getString(actionRequest, "sitename");

		String tempFileName = TempFileUtil.getTempFileName(
			themeDisplay.getUserId(), selectedFileName, _TEMP_FOLDER_NAME);

		try {
			InputStream inputStream = TempFileUtil.getTempFileAsStream(
				tempFileName);
			long size = TempFileUtil.getTempFileSize(tempFileName);

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), actionRequest);

			FileEntry fileEntry = DLAppServiceUtil.addFileEntry(
				repositoryId, folderId, selectedFileName, contentType,
				selectedFileName, description, changeLog, inputStream, size,
				serviceContext);
			
			
			//************** for multiple documemt entry amit *********************************
			long groupId=fileEntry.getGroupId();
			String documentUrl=getdocUrl(selectedFileName,groupId,folderId,actionRequest.getServerName(),actionRequest.getServerPort());
		 	
		     long fileentryid=fileEntry.getFileEntryId();
		     long versionid=fileEntry.getFileVersion().getFileVersionId();
		         long docsiteId=getdocSiteid(fileEntry);
		         String com=getcomvalue(fileEntry);
		         String fulcom=getfull_com(fileEntry);
		         String authr=getauthor(fileEntry);
		         String cpyright=getcopyright(fileEntry);
		         //String sitename=getdocSiteName(fileEntry);
		         String language=getlanguage(fileEntry);
		         
		         
		         
		         
		         
			 try{
			 Date publish_date=getdocPublishDate(fileEntry);
				 Date upload_date=(Date)fileEntry.getCreateDate(); 
			
			 String category=doccategory(fileEntry);
			 
		 
			 
			 String type=doctype(fileEntry);
			 if(docsiteId!=-1){					
				 if(publish_date!=null && !category.isEmpty())
				 updatedoclink(documentUrl,docsiteId,publish_date,category,fileentryid,selectedFileName,versionid);
			 }
			if(!type.isEmpty() && !category.isEmpty())
			 updatedocinfo(upload_date, publish_date, fileentryid, versionid, type, category,authr,cpyright,com,fulcom,language,sitename);
				
			 }catch (Exception e){
				 
		 }

			AssetPublisherUtil.addAndStoreSelection(
				actionRequest, DLFileEntry.class.getName(),
				fileEntry.getFileEntryId(), -1);

			AssetPublisherUtil.addRecentFolderId(
				actionRequest, DLFileEntry.class.getName(), folderId);

			validFileNames.add(selectedFileName);

			return;
		}
		catch (Exception e) {
			String errorMessage = getAddMultipleFileEntriesErrorMessage(
				themeDisplay, e);

			invalidFileNameKVPs.add(
				new KeyValuePair(selectedFileName, errorMessage));
		}
		finally {
			TempFileUtil.deleteTempFile(tempFileName);
		}
	}

	protected void addTempFileEntry(ActionRequest actionRequest)
		throws Exception {

		UploadPortletRequest uploadPortletRequest =
			PortalUtil.getUploadPortletRequest(actionRequest);

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long folderId = ParamUtil.getLong(uploadPortletRequest, "folderId");
		String sourceFileName = uploadPortletRequest.getFileName("file");

		InputStream inputStream = null;

		try {
			inputStream = uploadPortletRequest.getFileAsStream("file");

			DLAppServiceUtil.addTempFileEntry(
				themeDisplay.getScopeGroupId(), folderId, sourceFileName,
				_TEMP_FOLDER_NAME, inputStream);
		}
		finally {
			StreamUtil.cleanUp(inputStream);
		}
	}

	protected void cancelFileEntriesCheckOut(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");

		if (fileEntryId > 0) {
			DLAppServiceUtil.cancelCheckOut(fileEntryId);
		}
		else {
			long[] fileEntryIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

			for (int i = 0; i < fileEntryIds.length; i++) {
				DLAppServiceUtil.cancelCheckOut(fileEntryIds[i]);
			}
		}
	}

	protected void checkInFileEntries(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (fileEntryId > 0) {
			DLAppServiceUtil.checkInFileEntry(
				fileEntryId, false, StringPool.BLANK, serviceContext);
		}
		else {
			long[] fileEntryIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

			for (int i = 0; i < fileEntryIds.length; i++) {
				DLAppServiceUtil.checkInFileEntry(
					fileEntryIds[i], false, StringPool.BLANK, serviceContext);
			}
		}
	}

	protected void checkOutFileEntries(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (fileEntryId > 0) {
			DLAppServiceUtil.checkOutFileEntry(fileEntryId, serviceContext);
		}
		else {
			long[] fileEntryIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

			for (int i = 0; i < fileEntryIds.length; i++) {
				DLAppServiceUtil.checkOutFileEntry(
					fileEntryIds[i], serviceContext);
			}
		}
	}

	protected void deleteFileEntry(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");
		String version = ParamUtil.getString(actionRequest, "version");

		if (fileEntryId == 0) {
			return;
		}
        //**********************************code added by Amit*******************************************
		FileEntry fileEntryobj=DLAppServiceUtil.getFileEntry(fileEntryId);
		long siteId=getdocSiteid(fileEntryobj);
		 String category="";
		if(siteId!=-1)
		   category=doccategory(fileEntryobj);
		//*****************************************************end here ********************************************
		if (Validator.isNotNull(version)) {
			
			
			   //***************************** this function is to check highestversion Amit************************
		       boolean flag=checkHighestversion(fileEntryobj,fileEntryobj.getFileVersion(version));
		       //******************************************************************************************
               DLAppServiceUtil.deleteFileVersion(fileEntryId, version);
               if(flag && !category.isEmpty())
                removerelateddoclink(siteId, category, fileEntryId);
               if(flag){
                   removedocinfo(fileEntryId);
                   removedocsitedata(fileEntryId);
               }
		}
		else {
			
			 DLAppServiceUtil.deleteFileEntry(fileEntryId);
             //****************************************code added by Amit ***************************
			 if(!category.isEmpty())
				 removerelateddoclink(siteId, category, fileEntryId);
			 removedocinfo(fileEntryId);
			 removedocsitedata(fileEntryId);
            //********************************************end here *****************************************
		}
	}

	protected void deleteTempFileEntry(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long folderId = ParamUtil.getLong(actionRequest, "folderId");
		String fileName = ParamUtil.getString(actionRequest, "fileName");

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		try {
			DLAppServiceUtil.deleteTempFileEntry(
				themeDisplay.getScopeGroupId(), folderId, fileName,
				_TEMP_FOLDER_NAME);

			jsonObject.put("deleted", Boolean.TRUE);
		}
		catch (Exception e) {
			String errorMessage = LanguageUtil.get(
				themeDisplay.getLocale(),
				"an-unexpected-error-occurred-while-deleting-the-file");

			jsonObject.put("deleted", Boolean.FALSE);
			jsonObject.put("errorMessage", errorMessage);
		}

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	protected String getAddMultipleFileEntriesErrorMessage(
			ThemeDisplay themeDisplay, Exception e)
		throws Exception {

		String errorMessage = null;

		if (e instanceof AssetCategoryException) {
			AssetCategoryException ace = (AssetCategoryException)e;

			AssetVocabulary assetVocabulary = ace.getVocabulary();

			String vocabularyTitle = StringPool.BLANK;

			if (assetVocabulary != null) {
				vocabularyTitle = assetVocabulary.getTitle(
					themeDisplay.getLocale());
			}

			if (ace.getType() == AssetCategoryException.AT_LEAST_ONE_CATEGORY) {
				errorMessage = LanguageUtil.format(
					themeDisplay.getLocale(),
					"please-select-at-least-one-category-for-x",
					vocabularyTitle);
			}
			else if (ace.getType() ==
						AssetCategoryException.TOO_MANY_CATEGORIES) {

				errorMessage = LanguageUtil.format(
					themeDisplay.getLocale(),
					"you-cannot-select-more-than-one-category-for-x",
					vocabularyTitle);
			}
		}
		else if (e instanceof DuplicateFileException) {
			errorMessage = LanguageUtil.get(
				themeDisplay.getLocale(),
				"the-folder-you-selected-already-has-an-entry-with-this-name." +
					"-please-select-a-different-folder");
		}
		else if (e instanceof FileExtensionException) {
			errorMessage = LanguageUtil.format(
				themeDisplay.getLocale(),
				"please-enter-a-file-with-a-valid-extension-x",
				StringUtil.merge(
					PrefsPropsUtil.getStringArray(
						PropsKeys.DL_FILE_EXTENSIONS, StringPool.COMMA)));
		}
		else if (e instanceof FileNameException) {
			errorMessage = LanguageUtil.get(
				themeDisplay.getLocale(),
				"please-enter-a-file-with-a-valid-file-name");
		}
		else if (e instanceof FileSizeException) {
			long maxSizeMB = PrefsPropsUtil.getLong(
				PropsKeys.DL_FILE_MAX_SIZE) / 1024 / 1024;

			errorMessage = LanguageUtil.format(
				themeDisplay.getLocale(),
				"file-size-is-larger-than-x-megabytes", maxSizeMB);
		}
		else if (e instanceof InvalidFileEntryTypeException) {
			errorMessage = LanguageUtil.get(
				themeDisplay.getLocale(),
				"the-document-type-you-selected-is-not-valid-for-this-folder");
		}
		else {
			errorMessage = LanguageUtil.get(
				themeDisplay.getLocale(),
				"an-unexpected-error-occurred-while-saving-your-document");
		}

		return errorMessage;
	}

	protected void moveFileEntries(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");
		long newFolderId = ParamUtil.getLong(actionRequest, "newFolderId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			DLFileEntry.class.getName(), actionRequest);

		if (fileEntryId > 0) {
			DLAppServiceUtil.moveFileEntry(
				fileEntryId, newFolderId, serviceContext);
		}
		else {
			long[] fileEntryIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "fileEntryIds"), 0L);

			for (int i = 0; i < fileEntryIds.length; i++) {
				DLAppServiceUtil.moveFileEntry(
					fileEntryIds[i], newFolderId, serviceContext);
			}
		}
	}

	protected void revertFileEntry(ActionRequest actionRequest)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");
		String version = ParamUtil.getString(actionRequest, "version");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			DLFileEntry.class.getName(), actionRequest);

		DLAppServiceUtil.revertFileEntry(fileEntryId, version, serviceContext);
	}

	protected void updateFileEntry(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		UploadPortletRequest uploadPortletRequest =
			PortalUtil.getUploadPortletRequest(actionRequest);

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String cmd = ParamUtil.getString(uploadPortletRequest, Constants.CMD);

		long fileEntryId = ParamUtil.getLong(
			uploadPortletRequest, "fileEntryId");

		long repositoryId = ParamUtil.getLong(
			uploadPortletRequest, "repositoryId");
		long folderId = ParamUtil.getLong(uploadPortletRequest, "folderId");
		String sourceFileName = uploadPortletRequest.getFileName("file");
		String title = ParamUtil.getString(uploadPortletRequest, "title");
		String description = ParamUtil.getString(
			uploadPortletRequest, "description");
		String changeLog = ParamUtil.getString(
			uploadPortletRequest, "changeLog");
		boolean majorVersion = ParamUtil.getBoolean(
			uploadPortletRequest, "majorVersion");
		String sitename = ParamUtil.getString(uploadPortletRequest, "sitename");
		

		if (folderId > 0) {
			Folder folder = DLAppServiceUtil.getFolder(folderId);

			if (folder.getGroupId() != themeDisplay.getScopeGroupId()) {
				throw new NoSuchFolderException();
			}
		}

		InputStream inputStream = null;

		try {
			String contentType = uploadPortletRequest.getContentType("file");

			long size = uploadPortletRequest.getSize("file");

			if (cmd.equals(Constants.ADD) && (size == 0)) {
				contentType = MimeTypesUtil.getContentType(title);
			}

			if (cmd.equals(Constants.ADD) || (size > 0)) {
				String portletName = portletConfig.getPortletName();

				if (portletName.equals(PortletKeys.MEDIA_GALLERY_DISPLAY)) {
					String portletResource = ParamUtil.getString(
						actionRequest, "portletResource");

					PortletPreferences portletPreferences = null;

					if (Validator.isNotNull(portletResource)) {
						PortletPreferencesFactoryUtil.getPortletSetup(
							actionRequest, portletResource);
					}
					else {
						portletPreferences = actionRequest.getPreferences();
					}

					String[] mimeTypes = DLUtil.getMediaGalleryMimeTypes(
						portletPreferences, actionRequest);

					if (Arrays.binarySearch(mimeTypes, contentType) < 0) {
						throw new FileMimeTypeException(contentType);
					}
				}
			}

			String copyR = ParamUtil.getString(uploadPortletRequest, "ExpandoAttribute--Copyright--");

            File uplFile = uploadPortletRequest.getFile("file");

            if (contentType != null && copyR != null && contentType.startsWith("image") && !copyR.isEmpty()) {
                try {
                    final BufferedImage image1 = ImageIO.read(uplFile);

                    Graphics g = image1.getGraphics();

                    int imgHeight = ((SunGraphics2D) g).getCompClip().getHeight();
                    int imgWidth = ((SunGraphics2D) g).getCompClip().getWidth();
                    float boundPercent = 0.07f;

                    Color c = new Color(0.0f,0f,0f, 0.6f);
                    g.setColor(c);
                    g.fillRect(0, imgHeight - Math.round(imgHeight*boundPercent), imgWidth, Math.round(imgHeight*boundPercent));

                    c = new Color(1.0f, 1.0f, 1.0f, 0.6f);
                    g.setColor(c);

                    g.setFont(g.getFont().deriveFont(imgHeight*boundPercent*0.7f));
                    FontMetrics fm = g.getFontMetrics();
                    int copyWidth = fm.stringWidth(copyR);

                    g.drawString(copyR, (imgWidth - copyWidth - Math.round(imgWidth*0.03f)), (imgHeight - Math.round(imgHeight*boundPercent*0.25f)));
                    g.dispose();

                    ImageIO.write(image1, contentType.substring(contentType.indexOf("/") + 1), uplFile);

                    size = uplFile.length();

                    //inputStream = new FileInputStream(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            inputStream = new FileInputStream(uplFile);

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), uploadPortletRequest);

			FileEntry fileEntry = null;
			String servername= actionRequest.getServerName();
		    int port = actionRequest.getServerPort();

			if (cmd.equals(Constants.ADD)) {

				// Add file entry

				fileEntry = DLAppServiceUtil.addFileEntry(
					repositoryId, folderId, sourceFileName, contentType, title,
					description, changeLog, inputStream, size, serviceContext);
				
//************************* code by Amit Start here *******this is for updating doclink and publish date of documents in iucn schema tables ************************************************
				 long groupId=fileEntry.getGroupId();
				    
			     String documentUrl=getdocUrl(title,groupId,folderId,servername,port);
	
			     long fileentryid=fileEntry.getFileEntryId();
			     long versionid=fileEntry.getFileVersion().getFileVersionId();
			         long docsiteId=getdocSiteid(fileEntry);
			         String com=getcomvalue(fileEntry);
			         String fulcom=getfull_com(fileEntry);
			         String authr=getauthor(fileEntry);
			         String cpyright=getcopyright(fileEntry);
			         //String sitename=getdocSiteName(fileEntry);
			         String language=getlanguage(fileEntry);
			         String doctype=getdoctype(fileEntry);
			         String doctype1=getdoctype1(fileEntry);
			         String doctype2=getdoctype2(fileEntry);
			         
			         String type_doc="";
			         
			         System.out.println(doctype);
			         
				 try{
					 Date publish_date=getdocPublishDate(fileEntry);
					 Date upload_date=(Date)fileEntry.getCreateDate(); 
					  Date upload_datewithouttime=getuploaddate(upload_date);
				 String category=doccategory(fileEntry);
				 String type=doctype(fileEntry);
				 String image=imgtype(fileEntry);	
				 String types=gettype(fileEntry);
			        System.out.println(types);
				
				 
				 if(!doctype.isEmpty()){
					 
					 type_doc=doctype;
			     	 }
				 else if(!doctype1.isEmpty())
				 {
					 type_doc=doctype1; 
				 }
				 else if(!doctype2.isEmpty())
				 {
					 type_doc=doctype2;
				 }
				 
				 
				    /*List<String> lstfirst = new ArrayList();
				    
				    lstfirst.add("Management Effectiveness Evaluation");
				    lstfirst.add("Other management plan");
				    lstfirst.add("Scientific article");
				    lstfirst.add("Grey literature");
				    lstfirst.add("Wildlife/habitat survey");
				    lstfirst.add("Legislation");
				    lstfirst.add("Map");
				    lstfirst.add("Picture");
				    lstfirst.add("Media article");
				    lstfirst.add("Management Plan");
				    
				    List<String> lstsecond = new ArrayList();
				    
				    lstsecond.add("Nomination inventory");
				    lstsecond.add("UNESCO Inventory of nomination");
				    lstsecond.add("Submitted map at inscription");
				    lstsecond.add("Revised maps");
				    lstsecond.add("Electronic boundary file");
				    lstsecond.add("Original proposed management plan");				   
				    lstsecond.add("Advisory Body Evaluation report");
				    lstsecond.add("WCMC Datasheet at inscription");
				    lstsecond.add("Committee decision reference number");
				    lstsecond.add("Statement of OUV");
				    lstsecond.add("Reactive monitoring mission");
				    lstsecond.add("Advisory mission");
				    lstsecond.add("State Party report");
				    lstsecond.add("UNESCO letter");
				    lstsecond.add("IUCN letter");
				    lstsecond.add("Responses to UNESCO or IUCN");
				    lstsecond.add("SOC report");
				    lstsecond.add("PR (Periodic Report) Questionnaires");
				    lstsecond.add("EIA and related documentation");
				    lstsecond.add("DSOCR (Corrective Measures)");
				    lstsecond.add("Committee decisions");
				    lstsecond.add("Nomination documents");
				    lstsecond.add("Management Effectiveness Evaluation");
				    lstsecond.add("Other management plan");
				    lstsecond.add("Scientific article");
				    lstsecond.add("Grey literature");
				    lstsecond.add("Wildlife/habitat survey");
				    lstsecond.add("Legislation");
				    lstsecond.add("Map");
				    lstsecond.add("Picture");
				    lstsecond.add("Media article");
				    lstsecond.add("Management Plan");

				    List<String> lstthird = new ArrayList();
                    
				    lstthird.add("Consultation questionnaire");
				    lstthird.add("Stakeholder letter");
				    lstthird.add("Stakeholder");
				    lstthird.add("Stakeholder email");
				    lstthird.add("IUCN/WHC internal email");
				    lstthird.add("Nomination inventory");
				    lstthird.add("UNESCO Inventory of nomination");
				    lstthird.add("Submitted map at inscription");
				    lstthird.add("Revised maps");
				    lstthird.add("Electronic boundary file");
				    lstthird.add("Original proposed management plan");				   
				    lstthird.add("Advisory Body Evaluation report");
				    lstthird.add("WCMC Datasheet at inscription");
				    lstthird.add("Committee decision reference number");
				    lstthird.add("Statement of OUV");
				    lstthird.add("Reactive monitoring mission");
				    lstthird.add("Advisory mission");
				    lstthird.add("State Party report");
				    lstthird.add("UNESCO letter");
				    lstthird.add("IUCN letter");
				    lstthird.add("Responses to UNESCO or IUCN");
				    lstthird.add("SOC report");
				    lstthird.add("PR (Periodic Report) Questionnaires");
				    lstthird.add("EIA and related documentation");
				    lstthird.add("DSOCR (Corrective Measures)");
				    lstthird.add("Committee decisions");
				    lstthird.add("Nomination documents");
				    lstthird.add("Management Effectiveness Evaluation");
				    lstthird.add("Other management plan");
				    lstthird.add("Scientific article");
				    lstthird.add("Grey literature");
				    lstthird.add("Wildlife/habitat survey");
				    lstthird.add("Legislation");
				    lstthird.add("Map");
				    lstthird.add("Picture");
				    lstthird.add("Media article");
				    lstthird.add("Management Plan");
				    
				   
					if(lstfirst.contains(type_doc)&& lstsecond.contains(type_doc) && lstthird.contains(type_doc))
					{
						types="Public";
					}
					else if(!lstfirst.contains(type_doc)&& lstsecond.contains(type_doc) && lstthird.contains(type_doc))
					{
						types="Official";
					}
					else if(!lstfirst.contains(type_doc)&& !lstsecond.contains(type_doc) && lstthird.contains(type_doc))
					{
						types="Confidential";
					}
					else
					{
						types="Public";
					}*/
				    
				    
				    
				 
				 if(docsiteId!=-1){
						
						 if(publish_date!=null && !category.isEmpty())
						 updatedoclink(documentUrl,docsiteId,publish_date,category,fileentryid,title,versionid);
				 }
				if(!type.isEmpty() && !category.isEmpty())
					updatedocinfo(upload_datewithouttime, publish_date, fileentryid, versionid, type, category,authr,cpyright,com,fulcom,language,sitename);
			
				
				if(!image.isEmpty() && category.isEmpty())
					updatedocinfo(upload_datewithouttime, publish_date, fileentryid, versionid, image, category,authr,cpyright,com,fulcom,language,sitename);
			
				
				if(!types.isEmpty() &&  !types.equals("Document") )
					updatedocinfo1(upload_datewithouttime, publish_date, fileentryid, versionid, types, type_doc,authr,cpyright,com,fulcom,language,sitename);
			
				
				 }catch(Exception ex){
					 ex.printStackTrace();
				 }
				 //for updating
				 
//****************************End here**********************************************************************			
				
				AssetPublisherUtil.addAndStoreSelection(
					actionRequest, DLFileEntry.class.getName(),
					fileEntry.getFileEntryId(), -1);
			}
			else if (cmd.equals(Constants.UPDATE_AND_CHECKIN)) {

				// Update file entry and checkin

				fileEntry = DLAppServiceUtil.updateFileEntryAndCheckIn(
					fileEntryId, sourceFileName, contentType, title,
					description, changeLog, majorVersion, inputStream, size,
					serviceContext);
//************************* code by Amit Start here *******this is for updating doclink and publish date of documents in iucn schema tables ************************************************/
				 long groupId=fileEntry.getGroupId();
			     String documentUrl=getdocUrl(title,groupId,folderId,servername,port);
			     long fileentryid=fileEntry.getFileEntryId();
			     long versionid=fileEntry.getFileVersion().getFileVersionId();
				 long docsiteId=getdocSiteid(fileEntry);
				 String com=getcomvalue(fileEntry);
		         String fulcom=getfull_com(fileEntry);
		         String authr=getauthor(fileEntry);
		         String cpyright=getcopyright(fileEntry);
		         //String sitename=getdocSiteName(fileEntry);
		         String language=getlanguage(fileEntry);
				 Date publish_date=getdocPublishDate(fileEntry);
				 Date upload_date=fileEntry.getCreateDate();
				 Date upload_datewithouttime=getuploaddate(upload_date);
				 String category=doccategory(fileEntry);
				 String type=doctype(fileEntry);
				 if(docsiteId!=-1){
						
						 if(publish_date!=null && !category.isEmpty())
						 updatedoclink(documentUrl,docsiteId,publish_date,category,fileentryid,title,versionid);
						
				 }
				 updatedocinfo(upload_datewithouttime, publish_date, fileentryid, versionid, type, category,authr,cpyright,com,fulcom,language,sitename);
//****************************End here**********************************************************************			
				
				
			}
			else {

				// Update file entry

				fileEntry = DLAppServiceUtil.updateFileEntry(
					fileEntryId, sourceFileName, contentType, title,
					description, changeLog, majorVersion, inputStream, size,
					serviceContext);
				 //for updating
				
//************************* code by Amit Start here *******this is for updating doclink and publish date of documents in iucn schema tables ************************************************
				 long groupId=fileEntry.getGroupId();
				 String oldcategory="";
				List<FileVersion>filelis= fileEntry.getFileVersions(0);
				List<String>fileversionlst= new ArrayList<String>();
				for(int vcnt=0;vcnt< filelis.size();vcnt++){
				 String filev=filelis.get(vcnt).getVersion();
				 fileversionlst.add(filev);
				
				}
				if(fileversionlst.size()>1){
				Collections.sort(fileversionlst);
				String olderfilev=fileversionlst.get(fileversionlst.size()-2);
				oldcategory=doccategory(fileEntry,fileEntry.getFileVersion(olderfilev).getFileVersionId());
				}
				
			     String documentUrl=getdocUrl(title,groupId,folderId,servername,port);
			     long fileentryid=fileEntry.getFileEntryId();
			     long versionid=fileEntry.getFileVersion().getFileVersionId();
				 long docsiteId=getdocSiteid(fileEntry);
				 String com=getcomvalue(fileEntry);
		         String fulcom=getfull_com(fileEntry);
		         String authr=getauthor(fileEntry);
		         String cpyright=getcopyright(fileEntry);
		         //String sitename=getdocSiteName(fileEntry);
		         String language=getlanguage(fileEntry);
				 Date publish_date=getdocPublishDate(fileEntry);
				 Date upload_date=fileEntry.getCreateDate();
				 
				 Date upload_datewithouttime=getuploaddate(upload_date);
				 upload_date.setTime(0);
			     String category=doccategory(fileEntry);
				 String type=doctype(fileEntry);
				 if(docsiteId!=-1){
						
						 if(publish_date!=null && !category.isEmpty())
						 updatedoclink(documentUrl,docsiteId,publish_date,category,fileentryid,title,versionid,oldcategory);
						 
				 }
				 System.out.println("Test---------------------");
				 
				 updatedocinfo(upload_datewithouttime, publish_date, fileentryid, versionid, type, category,authr,cpyright,com,fulcom,language,sitename);
				
				 
//****************************End here**********************************************************************			
			}

			AssetPublisherUtil.addRecentFolderId(
				actionRequest, DLFileEntry.class.getName(), folderId);
		}
		finally {
			StreamUtil.cleanUp(inputStream);
		}
	}

	private static final String _TEMP_FOLDER_NAME =
		EditFileEntryAction.class.getName();
	//********************************************* code by amit for IUCN DMS start here **********************************

	/**
	 * @param title
	 * @param groupId
	 * @param folderId
	 * @return
	 */
	private String getdocUrl1(String title,long groupId,long folderId){
		String docurl="http://localhost:8080" + "/documents/" + groupId+"/"+folderId+"/"
		+HttpUtil.getHttp().encodeURL(HtmlUtil.getHtml().unescape(title));
		//System.out.println(docurl);
		return docurl;
	}
	private String getdocUrl(String title,long groupId,long folderId,String server,int port){
		String docurl="http://" + server + ":" + port
			+ "/documents/" + groupId+"/"+folderId+"/"
		+HttpUtil.getHttp().encodeURL(HtmlUtil.getHtml().unescape(title));
		//System.out.println(docurl);
		return docurl;
	}
	/**
	 * @param fileEntry
	 * @return
	 */
	private long getdocSiteid(FileEntry fileEntry){
		long siteId=-1;
		int a=0;
		try {
			Object docsitevalues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Site");            
			String [] cfValues = (String[]) docsitevalues ;
			String docsitename = (cfValues .length > 0 ? cfValues [0] : "");
			//whp_sitesLocalServiceUtil.
			if(docsitename.equalsIgnoreCase("Select Site")){
				String []sitename=new String[1];
				sitename[0]="";
				fileEntry.getExpandoBridge().setAttribute("Site", sitename);
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
	
	/**
	 * @param fileEntry
	 * @return
	 */
	private Date getdocPublishDate(FileEntry fileEntry){
		Date docpulishDate=null;
		 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mappulishdate=null;
		 try {
			DLFileVersion dlFileVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
			 long fileversionid = dlFileVersion.getFileVersionId();
			  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
			  mappulishdate =objDlfileentry.getFieldsMap(fileversionid);
			            if(mappulishdate!=null){
					    Set<String>docfieldset=mappulishdate.keySet();
						Iterator<String>docfieldsetItr=docfieldset.iterator();
						boolean outloop=true;
						             while(docfieldsetItr.hasNext()){
												 String fieldName=docfieldsetItr.next();
												 Fields field=mappulishdate.get(fieldName);
												 Set<String> metatagnames=field.getNames();
											     Iterator<String> metatagnamesItr=metatagnames.iterator();
											     com.liferay.portlet.dynamicdatamapping.storage.Field  fieldd=null;
											     String date=null;
												while(metatagnamesItr.hasNext())
												{
													     String metatagnamesStr=metatagnamesItr.next();
													      if(metatagnamesStr.contains("date")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 docpulishDate =(Date) fieldd.getValue();
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
		
		
		
	return docpulishDate;
	}
	
	private String doccategory(FileEntry fileEntry){
		String doccategory="";
		 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
		 try {
			DLFileVersion dlFileVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
			 long fileversionid = dlFileVersion.getFileVersionId();
			  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
			  //DLFileEntryMetadata ds= DLFileEntryMetadataUtil.findByF_V(fileEntry.getFileEntryId(), fileEntry.getFileVersion().getFileVersionId());
			  
			  
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
													      if(metatagnamesStr.toLowerCase().contains("catg")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 doccategory =(String) fieldd.getValue();
													    	  doccategory =doccategory.replace("[\"","" );
														      doccategory =doccategory.replace("\"]","" );
														      if(doccategory.equalsIgnoreCase("Select")){
														    	  fieldd.setValue("");
														      }
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
	
	private String doccategory(FileEntry fileEntry,long fileversionid){
		String doccategory="";
		 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
		 try {
			//DLFileVersion dlFileVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
			 //long fileversionid = dlFileVersion.getFileVersionId();
			  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
//			  DLFileEntryMetadata ds= DLFileEntryMetadataUtil.findByF_V(fileEntry.getFileEntryId(), fileversionid);
//			  DDMStructure as=ds.getDDMStructure();
//			  com.liferay.portlet.dynamicdatamapping.storage.Field  fieldd1;
			  
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
													      if(metatagnamesStr.toLowerCase().contains("catg")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 doccategory =(String) fieldd.getValue();
													    	  doccategory =doccategory.replace("[\"","" );
														      doccategory =doccategory.replace("\"]","" );
														      if(doccategory.equalsIgnoreCase("Select")){
														    	  fieldd.setValue("");
														      }
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
	
	private String imgtype(FileEntry fileEntry){
		String imgtype="";
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
													      if(metatagnamesStr.toLowerCase().contains("image")){
													    	 fieldd=field.get(metatagnamesStr);
													    	 imgtype =(String) fieldd.getValue();
													    	 imgtype =imgtype.replace("[\"","" );
													    	 imgtype =imgtype.replace("\"]","" );
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
		
		
		
	return imgtype;
	}
	
	
	private String gettype(FileEntry fileEntry){
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
													      if(metatagnamesStr.toLowerCase().contains("document")){
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
	
	
	
	private boolean updatedoclink(String docurl,long siteid,Date publishdate,String category,long fileentryid,String docName,long versionid,String oldcategory) {
		if(!oldcategory.isEmpty())
			removerelateddoclink(siteid, oldcategory, fileentryid);
		
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
	public boolean updatedocinfo(Date upload_date,Date publish_date,long fileentryid,long versionid,String type,String category,String author,String cpyright,String com,String fullcom,String language,String sitename){
		
	
		
		try {
			//docs_customDataLocalServiceUtil.adddocs_customData(fileentryid, versionid, publish_date, upload_date, type, category, author);
			
			//docs_customDataLocalServiceUtil.a
			docs_customDataLocalServiceUtil.adddocs_customData1(fileentryid,versionid,publish_date,upload_date, type,category,author,sitename,com,fullcom,cpyright,language, sitename);
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
	public boolean updatedocinfo1(Date upload_date,Date publish_date,long fileentryid,long versionid,String types,String category,String author,String cpyright,String com,String fullcom,String language,String sitename){
		
		
		System.out.println(types.length());
		System.out.println(types.charAt(1));
		
		try {
			//docs_customDataLocalServiceUtil.adddocs_customData(fileentryid, versionid, publish_date, upload_date, type, category, author);
			
			//docs_customDataLocalServiceUtil.a
			docs_customDataLocalServiceUtil.adddocs_customData1(fileentryid,versionid,publish_date,upload_date, types,category,author,sitename,com,fullcom,cpyright,language, sitename);
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
	public Date getuploaddate(Date upload_date){
		
		Date update= new Date(upload_date.getYear(),upload_date.getMonth(),upload_date.getDate(),0,0,0);
		return update;
		
	}
	private void removedocsitedata(long deleteFileEntryId) {
		  docs_sitedataLocalServiceUtil.removedocs_sitedata(deleteFileEntryId);
		}
	public String getcomvalue(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String comval="";
		   
			try {
				
				
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Full_COM");
				if(comFieldValues!=null){
				String full_comaval=comFieldValues.toString();
				if(!full_comaval.isEmpty() && full_comaval.toUpperCase().contains("COM")){
			    	 int comstartval=full_comaval.toUpperCase().indexOf("COM");
			    	  comval=full_comaval.substring(0, comstartval);
			    	 if(fileEntry.getExpandoBridge().hasAttribute("COM")){
					    	fileEntry.getExpandoBridge().setAttribute("COM", comval);
					    	//DoocscustomDataStructure.
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
		    
		    return comval;
		}
			
		public String getfull_com(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String full_comaval="";
			try {
				
				
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Full_COM");
				if(comFieldValues!=null){
				 full_comaval=comFieldValues.toString();
				
				
			}
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    
		    return full_comaval;
		}
		public String getcopyright(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String copyrightval="";
			try {
				
				
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Copyright");
				if(comFieldValues!=null){
					copyrightval=comFieldValues.toString();
				
				
			}
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    
		    return copyrightval;
		}
		public String getauthor(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String authorval="";
			try {
				
				
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Author");
				if(comFieldValues!=null){
					authorval=comFieldValues.toString();
				
				
			}
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    
		    return authorval;
		}
		public String getlanguage(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String languageval="";
			try {
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Language");            
				String [] cfValues = (String[]) comFieldValues ;
				languageval = (cfValues .length > 0 ? cfValues [0] : "");
				
				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    
		    return languageval;
		}
		
		
		public String getdoctype(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String doctype="";
			try {
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Document type");            
				String [] cfValues = (String[]) comFieldValues ;
				doctype = (cfValues .length > 0 ? cfValues [0] : "");
				
				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Problem in getting siteid "+ e.getMessage());
			}
		    return doctype;
		}
		
	
		public String getdoctype1(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String doctype="";
			try {
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Document");            
				String [] cfValues = (String[]) comFieldValues ;
				doctype = (cfValues .length > 0 ? cfValues [0] : "");
				
				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Problem in getting siteid "+ e.getMessage());
			}
		    return doctype;
		}
		
		
		public String getdoctype2(FileEntry fileEntry){
		    Object comFieldValues=null;
		    String doctype="";
			try {
				comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Select Document");            
				String [] cfValues = (String[]) comFieldValues ;
				doctype = (cfValues .length > 0 ? cfValues [0] : "");
				
				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Problem in getting siteid "+ e.getMessage());
			}
		    return doctype;
		}
		
		private String  getdocSiteName(FileEntry fileEntry){
			long siteId=-1;
			String docsitename="";
			int a=0;
			try {
				Object docsitevalues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("Site");            
				String [] cfValues = (String[]) docsitevalues ;
				docsitename = (cfValues .length > 0 ? cfValues [0] : "");
				
				
				
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
	        return docsitename ;
		}
		
	
//**************************** end here***************************************************************
}





