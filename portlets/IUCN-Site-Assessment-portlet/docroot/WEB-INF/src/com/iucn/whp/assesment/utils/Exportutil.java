package com.iucn.whp.assesment.utils;

import java.io.OutputStream;
import java.util.*;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;


import com.iucn.whp.dbservice.model.assessment_lang_lkp;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.assessment_stages;
import com.iucn.whp.dbservice.model.assessment_status;
import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkpClp;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_stagesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_statusLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;

public class Exportutil {
	
	
	public static void exportData(ResourceRequest resourceRequest, ResourceResponse resourceResponse){
		
		

		try {
			String strassessment=resourceRequest.getParameter("whp_assessmentList");
			String[] assessment_id=strassessment.split(",");
			List<site_assessment> tempResults  =new ArrayList<site_assessment>();
			
			for(int k=0;k<assessment_id.length;k++){
				site_assessment temwhp_sites_assessment=site_assessmentLocalServiceUtil.getsite_assessment(Long.parseLong(assessment_id[k]));
					
				tempResults.add(temwhp_sites_assessment);
			}

			HSSFWorkbook hwb = new HSSFWorkbook();
			HSSFSheet sheet = hwb.createSheet("Site Information");
			// Create a new font and alter it.
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

			/* creating the cell style for the filter values */
			CellStyle filterStyle = hwb.createCellStyle();

			org.apache.poi.ss.usermodel.Font filterfont = hwb.createFont();
			filterfont.setFontHeightInPoints((short) 9);
			filterfont.setFontName("Courier New");
			//filterStyle.setFillBackgroundColor();
			filterfont.setItalic(false);
			filterfont.setStrikeout(false);
			filterfont.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
			filterStyle.setFont(filterfont);

			filterStyle.setBorderBottom(CellStyle.BORDER_THIN);
			filterStyle.setBorderLeft(CellStyle.BORDER_THIN);
			filterStyle.setBorderTop(CellStyle.BORDER_THIN);
			filterStyle.setBorderRight(CellStyle.BORDER_THIN);
			HSSFRow rowhead = sheet.createRow((short) 2);
			rowhead.createCell((short) 0).setCellValue("sno");
			rowhead.createCell((short) 1).setCellValue("Assessment Id");
			rowhead.createCell((short) 2).setCellValue("Site Name");
			rowhead.createCell((short) 3).setCellValue("Current Status");
			rowhead.createCell((short) 4).setCellValue("Current Stage");
			rowhead.createCell((short) 5).setCellValue("Current User)");
			rowhead.createCell((short) 6).setCellValue("Initiation Date");
			rowhead.createCell((short) 7).setCellValue("Version");
			rowhead.createCell((short) 8).setCellValue("Language");
			rowhead.createCell((short) 8).setCellValue("Assessment Language");
			rowhead.createCell((short) 9).setCellValue("Conservation Rating");
			


			
			List<assessment_stages> assessment_stagesList=assessment_stagesLocalServiceUtil.findAll();
			List<assessment_status> assessment_statusList=assessment_statusLocalServiceUtil.findAll();
			List<assessment_lang_lkp> assessment_langLkpList=assessment_lang_lkpLocalServiceUtil.findAll();
			
			Map<Long,String> assessment_statusMap=new HashMap<Long,String>();
			for(assessment_status objAssessment_status : assessment_statusList){
				assessment_statusMap.put(objAssessment_status.getStatusid(),objAssessment_status.getStatus());
			}
			
			Map<Long,String> assessment_stagesMap=new HashMap<Long,String>();
			for(assessment_stages objassessment_stages : assessment_stagesList){
				assessment_stagesMap.put(objassessment_stages.getStageid(),objassessment_stages.getStage());
			}
			
			Map<Long,String> assessment_lang_lkpMap=new HashMap<Long,String>();
			for(assessment_lang_lkp objassessment_lang_lkp : assessment_langLkpList){
				assessment_lang_lkpMap.put(objassessment_lang_lkp.getLanguageid(),objassessment_lang_lkp.getLanguagecode());
			}
			
			
			int index = 3;
			int sno = 0;
				
			double currentVersionCode=0l;
			
			for(int i=0;i<tempResults.size();i++)
			{
				
				sno++;
				
				site_assessment_versions currentSite_assessment_versions=null;
				 
				site_assessment objSite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(tempResults.get(i).getAssessment_id());
				long siteAssessmentId=objSite_assessment.getAssessment_id();
				List<site_assessment_versions> site_assessment_versionsList=site_assessment_versionsLocalServiceUtil.findByAssessmentId(siteAssessmentId);
				
				if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
					Collections.sort(site_assessment_versionsList, new Comparator<site_assessment_versions>(){
					    public int compare(site_assessment_versions one, site_assessment_versions other) {
					        return String.valueOf(other.getAssessment_version_id()).compareTo(String.valueOf(one.getAssessment_version_id()));
					    }
					});
					if(site_assessment_versionsList!=null){
						currentSite_assessment_versions=site_assessment_versionsList.get(0);
						currentVersionCode=currentSite_assessment_versions.getVersion_code();
					}
					
				}
				whp_sites objwhp_sites=whp_sitesLocalServiceUtil.getSiteBySiteId(objSite_assessment.getSite_id());
				
				List<assessment_lang_version> lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.findByAssessmentId(siteAssessmentId);
				
				String assessmentLang=null;
				if(lstassessment_lang_version!=null){
					for(assessment_lang_version  objassessment_lang_version:lstassessment_lang_version){
						if(assessmentLang==null){
							assessmentLang=assessment_lang_lkpMap.get(objassessment_lang_version.getLanguageid());
						}else{
							assessmentLang=assessmentLang+", "+assessment_lang_lkpMap.get(objassessment_lang_version.getLanguageid());
						}
					}
				}else{
					if(objSite_assessment.getBase_langid()>0)
					assessmentLang=assessment_lang_lkpMap.get(objSite_assessment.getBase_langid());
					else
						assessmentLang="N.A";
				}
				
				
				List<conservation_outlook>  lstconservation_out =new ArrayList<conservation_outlook>();
				conservation_outlook_rating_lkp objoutlook_rating_lkp= new conservation_outlook_rating_lkpClp();
				String rating ="N.A";
				List<assessment_lang_version> assessment_lang_versionlist = assessment_lang_versionLocalServiceUtil.findByAssessmentId(tempResults.get(i).getAssessment_id());

				if (!assessment_lang_versionlist.isEmpty()) {
					for (assessment_lang_version objassessment_lang_version : assessment_lang_versionlist) {
						if (objassessment_lang_version.getPublished()) {
						long asses_mentid=objassessment_lang_version.getAssessment_version_id();
						if(asses_mentid!=-1)
						{
		    				
						lstconservation_out=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(asses_mentid);
			          
						if(lstconservation_out!=null && !lstconservation_out.isEmpty())
						{
							for(int in=0;in<lstconservation_out.size();in++)
							{
								objoutlook_rating_lkp=	conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(lstconservation_out.get(in).getRating());
								
								rating=	objoutlook_rating_lkp.getCo_rating();
								
							}
						}
						
						}
					}
				}
			}
				
				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(sno);
				row.createCell((short) 1).setCellValue(objSite_assessment.getAssessment_id());
				row.createCell((short) 2).setCellValue(objwhp_sites.getName_en().toString());
				row.createCell((short) 3).setCellValue(assessment_statusMap.get((objSite_assessment.getStatus_id())));
				row.createCell((short) 4).setCellValue(assessment_stagesMap.get(objSite_assessment.getCurrent_stageid()));
				row.createCell((short) 5).setCellValue(AssessmentActionUtil.getUserNameByUserId(objSite_assessment.getCurrent_userid()));
				row.createCell((short) 6).setCellValue(objSite_assessment.getInitiation_date().toString());
				row.createCell((short) 7).setCellValue(currentVersionCode);
				row.createCell((short) 8).setCellValue(assessmentLang);
				row.createCell((short) 9).setCellValue(rating);

				
				index++;
				
			}
				
			
			
			
		
			
			resourceResponse.setContentType("application/vnd.ms-excel");
			resourceResponse.addProperty("Content-Disposition", "attachment;filename=SiteAssessmentDetails.xls");
			OutputStream fileOut = resourceResponse.getPortletOutputStream();
			hwb.write(fileOut);
			fileOut.close();
			
			


		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
