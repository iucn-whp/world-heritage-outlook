package com.iucn.whp.assesment.utils;

import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfWriter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.*;
import java.util.List;

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

public static void exportPdf(ResourceRequest resourceRequest,ResourceResponse resourceResponse) {
		
	
	
		long siteid = Long.parseLong(resourceRequest.getParameter("SITE_ID"));
		double version_id= Double.parseDouble(resourceRequest.getParameter("VERSION_ID"));
	 	long lastass_version_id =(long) version_id;
	 	
	 	
	 	String Imagefinalstring = "";
	 	
	 	
	  Font font1 = new Font(Font.TIMES_ROMAN, 20,  Font.BOLD);
	  Font font2 = new Font(Font.TIMES_ROMAN, 18,  Font.BOLD);
	  Font font3 = new Font(Font.TIMES_ROMAN, 16,  Font.BOLD);
	  Font font4 = new Font(Font.TIMES_ROMAN, 13,  Font.BOLD);
	  Font font5 = new Font(Font.ITALIC, 13,  Font.ITALIC);
	  
	 	

		try {                
            
            com.lowagie.text.Document document = new com.lowagie.text.Document();
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            PdfWriter.getInstance(document, baos);
            
            document.open();
         
            
             whp_sites objSite = whp_sitesLocalServiceUtil.getSiteBySiteId(siteid);
             
              
            
            String Sitename=objSite.getName_en();
            
            if(!Sitename.isEmpty()){
            	
            	Paragraph para_state=new Paragraph("Sitename:-",font2);
		       	 para_state.add(new Chunk(Sitename,FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE)));
		       	 document.add(para_state);
}
            document.add(Chunk.NEWLINE);
            
            String sitedesc=objSite.getDescription();
            
          if(!sitedesc.isEmpty()){
            	 
		       	 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Site Description:-",FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(sitedesc));
		         document.add(comb);

		         
            
            }else
            {
            	 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Site Description:-",FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk("No Description Avilable"));
		         document.add(comb);

            }
            
            
           
           
          document.add(Chunk.NEWLINE);
          
            
/*            String imageUrl = resourceRequest.getContextPath()+"/images/sampleimg22.jpg";
*/            /*String path=resourceRequest.getScheme()+"://"+resourceRequest.getServerName()+":"+Integer.toString(resourceRequest.getServerPort())+resourceRequest.getContextPath();
            System.out.println(path);
            Image image = Image.getInstance(new URL(path));
            image.scaleAbsolute(150f, 150f);
            document.add(image);*/
            
           // whp_sites selectedSite = whp_sitesLocalServiceUtil.getSiteByWdpaId(selWdpaid);
            
            ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
    		
    		FileEntry fe = null;
    		long thumbnailId = 0;
    		
    		if(objSite.getThumbnailid() !=0 && objSite.getThumbnailid() > 0){
    			thumbnailId = objSite.getThumbnailid();
    			try{
    				if(DLAppServiceUtil.getFileEntry(thumbnailId)!=null){
    					fe = DLAppServiceUtil.getFileEntry(thumbnailId);
    				}
    			}catch(Exception e){
    				e.printStackTrace();
    			}
    			
    			try {
    				if(DLUtil.getFileEntryImage(fe,themeDisplay) != null){
    					String feString = DLUtil.getFileEntryImage(fe,themeDisplay);
    					String feUuid = fe.getUuid();
    					
    					String strPortalURL = themeDisplay.getPortalURL();
    					String strScopeGroupId = String.valueOf(themeDisplay.getScopeGroupId()); 
    					
    					Imagefinalstring = "";
    					Imagefinalstring = strPortalURL + "/c/document_library/get_file?uuid=" + feUuid + "&groupId=" + strScopeGroupId;
    				}
    			} catch(NullPointerException npe) {
    				npe.printStackTrace();
    			}
    			
    		}
            
            
    		if(Imagefinalstring.isEmpty())
    		{
            
            /*URL img = resourceRequest.getPortletSession().getPortletContext().getResource("/images/sampleimg22.jpg");  
            img.getProtocol();
            */
            String url_ =resourceRequest.getPortletSession().getPortletContext().getResource("/images/sampleimg22.jpg").toString();
                       
            /*Image image = Image.getInstance(img.getPath());
            image.scaleAbsolute(500f, 650f);
            document.add(image);*/
           
            Image image = Image.getInstance(new URL(url_));
/*            image.setAbsolutePosition(150f, 150f);
*/	         image.scaleToFit(500f, 800f); 
            document.add(image);
            
            
    		}
    		else
    		{
    			try{
		          Image image = Image.getInstance(new URL(Imagefinalstring));
/*		          image.setAbsolutePosition(150f, 150f);
*/		          image.scaleToFit(500f, 800f);
		          document.add(image);
    			}
    			catch(Exception e)
    			{
    				e.printStackTrace();
    			}
        
    		}

			document.add(Chunk.NEWLINE);

			//start status gauge
			List<conservation_outlook> conservationOutlooks = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id);

			int rating = 0;
			String pathToPic;

			if (!conservationOutlooks.isEmpty()) {
				rating = (int) (long) conservationOutlooks.get(0).getRating();
			}

			switch (rating) {
				case 1 : {
					pathToPic = "/images/status_good.png";
					break;
				}
				case 2 : {
					pathToPic = "/images/status_goodwithSomeConcerns.png";
					break;
				}
				case 3 : {
					pathToPic = "/images/status_significantconcern.png";
					break;
				}
				case 4 : {
					pathToPic = "/images/status_critical.png";
					break;
				}
				case 5 : {
					pathToPic = "/images/status_datadeficient.png";
					break;
				}
				default: {
					pathToPic = "/images/status_datadeficient.png";
				}
			}

			String statusUrl = resourceRequest.getPortletSession().getPortletContext().getResource(pathToPic).toString();

			Image image = Image.getInstance(new URL(statusUrl));
            image.setAbsolutePosition(140f, 50f);
	        image.scaleToFit(300f, 300f);
			document.add(image);
			//end status gauge

          
    		document.newPage();
            document.add(new Paragraph("Conservation Outlook",font1));
            
            
            document.add(Chunk.NEWLINE);
            
            String str_conservation_outlook_rating = "";
             String justificationconout=""; 
            
            if(!conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id).isEmpty()){
    			
				
				List<conservation_outlook> lst_conserv_outlook = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id);
				conservation_outlook obj_conservation_outlook = lst_conserv_outlook.get(0);
			   justificationconout = obj_conservation_outlook.getJustification();
				
				long conservation_outlook_rating = obj_conservation_outlook.getRating();
				
				if(conservation_outlook_rating > 0){
					conservation_outlook_rating_lkp obj_conservation_outlook_rating_lkp = conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(conservation_outlook_rating);
					str_conservation_outlook_rating = obj_conservation_outlook_rating_lkp.getCo_rating();
				}
				
            }
             if(!str_conservation_outlook_rating.isEmpty()){
            	 
            	 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(str_conservation_outlook_rating));
		         document.add(comb);
		         
		       	 
            	 }else {
            		 Paragraph comb=new Paragraph(); 
            		 comb.add(new Chunk("No Data Avilable"));
            		 document.add(comb);
    		         
				}
             if(!justificationconout.isEmpty()){
 
            	 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(justificationconout));
		         document.add(comb);
		         
             }

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
         
            
            document.add(new Paragraph("Current state and Trend of values",font4));
            
         

            String statewh="";
            String trendwh="";
            String stateValuejustification="";
            
			if(!state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
				
				
				
				List<state_trend_whvalues> lst_state_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id);
				state_trend_whvalues obj_state_trend_whvalues = lst_state_trend_whvalues.get(0);
				stateValuejustification = obj_state_trend_whvalues.getJustification();
				
				state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_whvalues.getState_id());
				trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_whvalues.getTrend_id());
				statewh=objstate_lkp.getState();
				trendwh=objtrend_lkp.getTrend();
			}
			
			 if(!statewh.isEmpty()){
				 
		       	Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(statewh));
		         document.add(comb);
		         
				 
				 }
			 if(!trendwh.isEmpty()){
				 
		     	Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Trend:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(trendwh));
		         document.add(comb);
				 
			 }
			 if(!stateValuejustification.isEmpty()){
				 
				 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(stateValuejustification));
		         document.add(comb);
		         
				 
			 }
			 
			 
			 document.add(Chunk.NEWLINE);
			 
			 
			document.add(new Paragraph("Overall Threats",font4));
			 
			String str_overall_rating = "";
			String threat_overall_summary="";
			 
			if(!threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id).isEmpty()){
				List<threat_summary_overall> lst_threat_summary_overall = threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id);
				threat_summary_overall obj_threat_summary_overall = lst_threat_summary_overall.get(0);
			   threat_overall_summary = obj_threat_summary_overall.getOverall_threat();
				
				long overall_rating = obj_threat_summary_overall.getThreat_rating();
				
				if(overall_rating > 0){
					threat_rating_lkp objOverall_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(overall_rating);
					str_overall_rating = objOverall_threat_rating_lkp.getRating();
				}
				
			}
			
			if(!str_overall_rating.isEmpty()){
				
				 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Overall Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(str_overall_rating));
		         document.add(comb);
			}
			
			if(!threat_overall_summary.isEmpty()){
				 
		       	 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Summary:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(threat_overall_summary));
		         document.add(comb);
		         
			}
			 
			 
			document.add(Chunk.NEWLINE);
			document.add(Chunk.NEWLINE);
			 
			document.add(new Paragraph("Protection and Management",font4));
			 
			String str_prot_overall_rating = "";
			String prot_overall_justification ="";
			if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
				
				List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
				prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
				 prot_overall_justification = obj_prot_mgmt_overall.getJustification();
				long prot_overall_rating = obj_prot_mgmt_overall.getRating();
				
				if(prot_overall_rating > 0){
					protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
					str_prot_overall_rating = objprotection_management_ratings_lkp.getPm_rating();
				}
			}
			
			 if(!str_prot_overall_rating.isEmpty()){
				 
				 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(str_prot_overall_rating));
		         document.add(comb);
				 
				 }
			 if(!prot_overall_justification.isEmpty()){
				 
				 Paragraph comb=new Paragraph(); 
		         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
		         comb.add(new Chunk(prot_overall_justification));
		         document.add(comb);
			 }
			 
			document.add(Chunk.NEWLINE);
			
			document.add(new Paragraph("Assessment Information",font1));
					
			document.add(Chunk.NEWLINE);
			
			
			document.add(new Paragraph("Value",font2));
			
			document.add(Chunk.NEWLINE);

			document.add(new Paragraph("World Heritage Values",font3));
			
			
			String svJustification = "";
			String state_string = "";
			String trend_string = "";
 				  	if(!state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
 				  		List<state_trend_whvalues> lst_state_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id);
 						state_trend_whvalues obj_state_trend_whvalues = lst_state_trend_whvalues.get(0);
 						svJustification = obj_state_trend_whvalues.getJustification();
 						
 						long state_id = obj_state_trend_whvalues.getState_id();
 						
 						if(state_id > 0){
 							state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_whvalues.getState_id());
 							state_string = objstate_lkp.getState();
 						}
 						long trend_id = obj_state_trend_whvalues.getTrend_id();
 						if(trend_id > 0){
 							trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_whvalues.getTrend_id());
 							trend_string = objtrend_lkp.getTrend();
 						}
 						
 				  	}
 				  	
			
 				    if(!state_string.isEmpty()){
 				    	
 				    	 Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(state_string));
				         document.add(comb);
				         
 				    	}
 				    
 					if(!trend_string.isEmpty()){
 						
 						Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("Trend:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(trend_string));
				         document.add(comb);
 						
 					}
/* 					 document.add(new Paragraph(svJustification));
*/			
 					document.add(Chunk.NEWLINE);
			          
 					if(!assessment_whvaluesLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id).isEmpty() && !state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
			    		List<assessment_whvalues> lst_assessment_whvalues = assessment_whvaluesLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id);
				    		List<current_state_trend>  	lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(lastass_version_id);
                    
				    		int a=1;
              			
              			for(assessment_whvalues objassessment_whvalues : lst_assessment_whvalues){
							String values = objassessment_whvalues.getValues();
							String description_str = objassessment_whvalues.getDescription();
							String justi_of_assessmnt = "";
							//long vnId = objassessment_whvalues.getVn();
							long whvalueid=objassessment_whvalues.getWhvalues_id();
							//long state_trend_whval_id = 0;
							long curre_statevn=0;
							long state_id = 0;
							long trend_id = 0;
							
							
							
							String str_trend_id = "";
							String str_state_id = "";
							
							
							
							 
							 for(current_state_trend  objcur_state_trend:lstcurrent_state_trend)
							 {
							    curre_statevn=objcur_state_trend.getVn();
							 if(whvalueid==curre_statevn)
							 {
								 justi_of_assessmnt = objcur_state_trend.getJustification();
									state_id = objcur_state_trend.getState_id();
									trend_id = objcur_state_trend.getTrend_id();
									break;
							 }
							 }
							 
							if(state_id!=0){
							
								state_lkp obj_state_lkp = state_lkpLocalServiceUtil.fetchstate_lkp(state_id);
								str_state_id = obj_state_lkp.getState();
							}
							if(trend_id!=0){
								
								trend_lkp obj_trend_lkp = trend_lkpLocalServiceUtil.fetchtrend_lkp(trend_id);
								str_trend_id = obj_trend_lkp.getTrend();
							}
			 
							
							   
								 
							     if(!values.isEmpty()){ document.add(new Paragraph(a+": " + values,font4));}
							     if(!str_state_id.isEmpty()){
							      	 
							    	 Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk(str_state_id));
							         document.add(comb);
							         
							       }
			 					 if(!str_trend_id.isEmpty()){
			 						 
							       	 Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("Trend:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk(str_trend_id));
							         document.add(comb);
							         
			 						 			 					 
			 					 }
			  					 if(!description_str.isEmpty()){
			  						
			  						 Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("Description:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk(description_str));
							         document.add(comb);
			  						 
			  					 }
			  					 a++;
			  					 document.add(Chunk.NEWLINE);
			  					 
							
              			}
              			
 					}
			 
			 
 					document.add(new Paragraph("Other Biodiversity values",font3));
 					
                     
 					String bioJustification = "";
					String biostate_string = "";
					String biotrend_string = "";
		 				  	if(!state_trend_biodivvalsLocalServiceUtil.getEntriesFromAssessment_versionId(lastass_version_id).isEmpty()){
		 				  		List<state_trend_biodivvals> lst_state_trend_biodivvals =state_trend_biodivvalsLocalServiceUtil.getEntriesFromAssessment_versionId(lastass_version_id);
		 				  		state_trend_biodivvals obj_state_trend_biodivvals=lst_state_trend_biodivvals.get(0);
		 				  		
		 				  		long state_id=obj_state_trend_biodivvals.getState_id();
		 				  		
		 				  		if(state_id > 0){
		 							state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_biodivvals.getState_id());
		 							biostate_string = objstate_lkp.getState();
		 						}
		 				  		
		 				  		long trend_id=obj_state_trend_biodivvals.getTrend_id();
		 				  		
		 				  		if(trend_id > 0){
		 							trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_biodivvals.getTrend_id());
		 							trend_string = objtrend_lkp.getTrend();
		 						}
		 				  	}
		 				  	
		 				  	
		 				     if(!biostate_string.isEmpty()){
		 				    	
		 				    	 Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(biostate_string));
						         document.add(comb);
		 				    	 
		 				     }
		 					 if(!biotrend_string.isEmpty()){
		 						 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Trend:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(biotrend_string));
						         document.add(comb);
		 					 }
		 					 
		 					 
		 					document.add(Chunk.NEWLINE);
		 					document.add(Chunk.NEWLINE);
		 					
		 					
		 				if(!biodiversity_valuesLocalServiceUtil.getValeusByAssessment_VersionId(lastass_version_id).isEmpty()){
						  		List<biodiversity_values> lstbiodiversity_values = biodiversity_valuesLocalServiceUtil.getValeusByAssessment_VersionId(lastass_version_id);
					    		List<current_state_trend>  	lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(lastass_version_id);
					    		
					    		int b=1;

						  		for(biodiversity_values biodiversity_Values_obj : lstbiodiversity_values){
							  		String biodiversity_descrpt = biodiversity_Values_obj.getDescription();
							  		String value_bio=biodiversity_Values_obj.getValue();
							  		String justificationasmnt="";
							  		 long current_statevn=0;
							  		 
							  		 long satateid=0;
							  		 long tradeid=0;
							  		 
							  		 String strstate_id="";
							  		  String strtrend_id="";
							  		
							  		long bio_id=biodiversity_Values_obj.getId();
							  		
							  		 for(current_state_trend  objcur_state_trend:lstcurrent_state_trend)
									 {
							  			current_statevn=objcur_state_trend.getVn();
									 if(bio_id==current_statevn)
									 {
										 justificationasmnt = objcur_state_trend.getJustification();
										 satateid = objcur_state_trend.getState_id();
										 tradeid = objcur_state_trend.getTrend_id();
											break;
									 }
									 }
							  		 
							  		if(satateid!=0){
										
										state_lkp obj_state_lkp = state_lkpLocalServiceUtil.fetchstate_lkp(satateid);
										strstate_id = obj_state_lkp.getState();
									}
									if(tradeid!=0){
										trend_lkp obj_trend_lkp = trend_lkpLocalServiceUtil.fetchtrend_lkp(tradeid);
										strtrend_id = obj_trend_lkp.getTrend();
									}
							  		
									
									if(!value_bio.isEmpty()){ document.add(new Paragraph(b+": " +value_bio,font4));}
								    if(!strstate_id.isEmpty()){
								    	
								    	Paragraph comb=new Paragraph(); 
								         comb.add(new Chunk("State:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
								         comb.add(new Chunk(strstate_id));
								         document.add(comb);
								    	}
				 					if(!strtrend_id.isEmpty()){
				 										 						
								       	Paragraph comb=new Paragraph(); 
								         comb.add(new Chunk("Trend:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
								         comb.add(new Chunk(strtrend_id));
								         document.add(comb);
				 					}
				 					if(!biodiversity_descrpt.isEmpty()){
				 						 
								     	Paragraph comb=new Paragraph(); 
								         comb.add(new Chunk("Description:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
								         comb.add(new Chunk(biodiversity_descrpt));
								         document.add(comb);
								         
				 						}
				  					b++;
				 					document.add(Chunk.NEWLINE);

									
						  		}
						  		
		 					}
		 					
		 					
		 				    document.add(Chunk.NEWLINE);
		 					
		 					document.add(new Paragraph("Threats",font2));
		 					document.add(Chunk.NEWLINE);
		 					document.add(new Paragraph("Current Threats",font3));
		 					
		 					document.add(Chunk.NEWLINE);
 					
		 					
			 if(!assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(lastass_version_id).isEmpty()){
		     		List<assessing_threats_current> lst_assessing_threats_current = assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(lastass_version_id);
		     		int c=1;
					for(assessing_threats_current obj_assessing_threats_current : lst_assessing_threats_current){
						long current_threat_id = obj_assessing_threats_current.getCurrent_threat_id();
						String current_justification = obj_assessing_threats_current.getJustification();
						long curr_threat_rating = obj_assessing_threats_current.getThreat_rating_id();
						
						
						String str_curr_threat_rating = "";
						if(curr_threat_rating > 0){
							threat_rating_lkp obj_curr_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.fetchthreat_rating_lkp(curr_threat_rating);
							str_curr_threat_rating = obj_curr_threat_rating_lkp.getRating();
						}
						
						List<current_threat_assessment_cat> lst_current_threat_assessment_cat = current_threat_assessment_catLocalServiceUtil.getEntriesByCurrent_threat_id(current_threat_id);
						for(current_threat_assessment_cat obj_current_threat_assessment_cat : lst_current_threat_assessment_cat){
							long curr_sub_cat_id = obj_current_threat_assessment_cat.getSub_cat_id();
							
							String str_curr_sub_cat = "";
							if(curr_sub_cat_id > 0){
								threat_subcategories_lkp obj_curr_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(curr_sub_cat_id);
								str_curr_sub_cat = obj_curr_threat_subcategories_lkp.getThreat_sub_category();
							}
							
							if(!str_curr_sub_cat.isEmpty()){document.add(new Paragraph(c+": " + str_curr_sub_cat,font4));}
							if(!str_curr_threat_rating.isEmpty()){
								
						       	 Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Threat Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_curr_threat_rating));
						         document.add(comb);
						         
								
								}
							if(!current_justification.isEmpty()){
							   	 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(current_justification));
						         document.add(comb);
								
							}
							c++;
							document.add(Chunk.NEWLINE);
							
							
						}
					}
			 }
			 
			 
			 document.add(Chunk.NEWLINE);
			
			 
			 document.add(new Paragraph("Potential Threats",font3));
			 
			 
			 if(!assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id).isEmpty() ) {
       			List<assessing_threats_potential> lst_assessing_threats_potential = assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id);
       			int d=1;
       			for(assessing_threats_potential obj_assessing_threats_potential : lst_assessing_threats_potential){
               		long potential_threat_id = obj_assessing_threats_potential.getPotential_threat_id();
               		String potential_justification = obj_assessing_threats_potential.getJustification();
               		long pot_threat_rating = obj_assessing_threats_potential.getThreat_rating();
               		
               		
               		String str_pot_threat_rating = "";
               		if(pot_threat_rating > 0){
               			threat_rating_lkp obj_pot_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.fetchthreat_rating_lkp(pot_threat_rating);
							str_pot_threat_rating = obj_pot_threat_rating_lkp.getRating();
               		}
						
               		String str_pot_sub_cat = "";
               		
						List<potential_threat_assessment_cat> lst_potential_threat_assessment_cat = potential_threat_assessment_catLocalServiceUtil.getEntriesByPotential_threat_id(potential_threat_id);
							for(potential_threat_assessment_cat obj_potential_threat_assessment_cat : lst_potential_threat_assessment_cat){
								long pot_sub_cat_id = obj_potential_threat_assessment_cat.getSub_cat_id();
								
								
								if(pot_sub_cat_id > 0){
									threat_subcategories_lkp obj_pot_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil.fetchthreat_subcategories_lkp(pot_sub_cat_id);
									str_pot_sub_cat = obj_pot_threat_subcategories_lkp.getThreat_sub_category();
								}
								
							}
							
							
						   if(!str_pot_sub_cat.isEmpty()){ document.add(new Paragraph(d+": "+ str_pot_sub_cat,font4));}
						   if(!str_pot_threat_rating.isEmpty()){
							   
							     Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Threat Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_pot_threat_rating));
						         document.add(comb);
						         
						   
							   }
						   if(!potential_justification.isEmpty()) {
							   	 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(potential_justification));
						         document.add(comb);
						         
							   }
						   
						   document.add(Chunk.NEWLINE);
							
       			  }
       			
			 }
			 
			 
			 
			 
             document.add(Chunk.NEWLINE);
			 document.add(new Paragraph("Protection and management",font2));
			 document.add(Chunk.NEWLINE);
			
			     String str_prot_overall_rating2 = "";
				String prot_overall_justification2 ="";
					if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
						List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
						prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
					prot_overall_justification2 = obj_prot_mgmt_overall.getJustification();
						
						long prot_overall_rating = obj_prot_mgmt_overall.getRating();
						
						if(prot_overall_rating > 0){
							protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
							str_prot_overall_rating2 = objprotection_management_ratings_lkp.getPm_rating();
						}
						
					}
					
					if(!str_prot_overall_rating2.isEmpty()){
						
										       	 
				       	Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("Overall Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(str_prot_overall_rating2));
				         document.add(comb);
				       	
						}
					if(!prot_overall_justification2.isEmpty()){
						
						
						Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("Justification:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(prot_overall_justification2));
				         document.add(comb);
				       	 
					}
					
					document.add(Chunk.NEWLINE);
					
					
					
					
					
					document.add(new Paragraph("Protection and management value",font3));
					document.add(Chunk.NEWLINE);
					
					
					if(!protection_managementLocalServiceUtil.findByAssessementVersionId(lastass_version_id).isEmpty()){
						List<protection_management> lst_protection_management = protection_managementLocalServiceUtil.findByAssessementVersionId(lastass_version_id);
						int e=1;
						for(protection_management obj_protection_management : lst_protection_management){
							long topic_Id = obj_protection_management.getTopic_id();
							String protection_justification = obj_protection_management.getJustification();
							long protection_rating_id = obj_protection_management.getRating();
							
							
							String str_topic = "";
							if(topic_Id > 0){
								protection_mgmt_checklist_lkp obj_protection_mgmt_checklist_lkp = protection_mgmt_checklist_lkpLocalServiceUtil.fetchprotection_mgmt_checklist_lkp(topic_Id);
								str_topic = obj_protection_mgmt_checklist_lkp.getTopic();
							}
							
							String str_protect_rating = "";
							if(protection_rating_id > 0){
								protection_management_ratings_lkp obj_protection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.fetchprotection_management_ratings_lkp(protection_rating_id);
								str_protect_rating = obj_protection_management_ratings_lkp.getPm_rating();
							}
					
							
							if(!str_topic.isEmpty()){document.add(new Paragraph(e +": "+ str_topic,font4));}
							if(!str_protect_rating.isEmpty()){
								 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Protection Rating:-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_protect_rating));
						         document.add(comb);
								
								}
							if(!protection_justification.isEmpty()){
								 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Justification :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(protection_justification));
						         document.add(comb);
						       	 
								}
							e++;
							document.add(Chunk.NEWLINE);
							
							
						}
					}
					
				
					
					document.add(new Paragraph("Assessment of the effectiveness of protection and management in addressing threats outside the site",font3));
					document.add(Chunk.NEWLINE);
					
					String outsidejustification122="";
					String outsiderating12="";
					if(!effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(lastass_version_id).isEmpty())
					{
					 List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(lastass_version_id);
					 effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreats=effective_prot_mgmt_iothreatsList.get(0);
					 outsidejustification122=objeffective_prot_mgmt_iothreats.getJustification();
					  
					 long prot_outside_threat_rating=objeffective_prot_mgmt_iothreats.getRating();
					 
					 if(prot_outside_threat_rating > 0){
							protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_outside_threat_rating);
							outsiderating12 = objprotection_management_ratings_lkp.getPm_rating();
						}
					  
					}
					
					if(!outsiderating12.isEmpty())
					{
						
						Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("Rating :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(outsiderating12));
				         document.add(comb);
						
					}
					
					
					if(!outsidejustification122.isEmpty())
					{
						
						Paragraph comb=new Paragraph(); 
				         comb.add(new Chunk("Justification :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
				         comb.add(new Chunk(outsidejustification122));
				         document.add(comb);
						
					}
					
					
					document.add(Chunk.NEWLINE);
					
					
					
					document.add(new Paragraph("Best Practice Examples",font3));
					document.add(Chunk.NEWLINE);
					
					
					
					 String prot_mgmt_best_descrp="";
						if(!prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id).isEmpty()){
							List<prot_mgmt_best_practices> lst_prot_mgmt_best_practices = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id);
							prot_mgmt_best_practices obj_prot_mgmt_best_practices = lst_prot_mgmt_best_practices.get(0);
							 prot_mgmt_best_descrp = obj_prot_mgmt_best_practices.getDescription();
						}
						
						
					  if(!prot_mgmt_best_descrp.isEmpty())
					  {
						  Paragraph comb=new Paragraph(); 
					         comb.add(new Chunk("Justification :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
					         comb.add(new Chunk(prot_mgmt_best_descrp));
					         document.add(comb);
					  }
					  else
					  {
						
						  Paragraph comb=new Paragraph(); 
					         comb.add(new Chunk("Justification :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
					         comb.add(new Chunk("no Jstification avilable"));
					         document.add(comb);
					  }
						
					
					  
					  document.add(Chunk.NEWLINE);
					  
					  
					  
					document.add(new Paragraph("Additional Information",font1));
					
					document.add(Chunk.NEWLINE);
					document.add(new Paragraph("Key Conservation Issues",font2));
					
					document.add(Chunk.NEWLINE);
					
					
					String key_conservation_issue="";
					String key_conser_description="";
					String str_scale = "";
					
					
					if(!key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(lastass_version_id).isEmpty()){
						List<key_conservation_issues> lst_key_conservation_issues = key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(lastass_version_id);
						int f=1;
						for(key_conservation_issues obj_key_conservation_issues : lst_key_conservation_issues){
							key_conservation_issue = obj_key_conservation_issues.getKey_conservation_issues();
							key_conser_description = obj_key_conservation_issues.getDescription();
							long key_scale_id = obj_key_conservation_issues.getScale();
							
							
							
							if(key_scale_id > 0){
								key_conservation_scale_lkp obj_key_conservation_scale_lkp = key_conservation_scale_lkpLocalServiceUtil.fetchkey_conservation_scale_lkp(key_scale_id);
								str_scale = obj_key_conservation_scale_lkp.getScale();
							}
						
						
						if(!key_conservation_issue.isEmpty()){document.add(new Paragraph(f+": " +key_conservation_issue,font4));}
						if(!str_scale.isEmpty()){
							
					       	Paragraph comb=new Paragraph(); 
					         comb.add(new Chunk("Scale :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
					         comb.add(new Chunk(str_scale));
					         document.add(comb);
					         
							}
						if(!key_conser_description.isEmpty()){
							
							Paragraph comb=new Paragraph(); 
					         comb.add(new Chunk("Description :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
					         comb.add(new Chunk(key_conser_description));
					         document.add(comb);
					         
					       	 
							}
						f++;
						document.add(Chunk.NEWLINE);
						}
					}
					
					
					
					document.add(new Paragraph("Benefits",font2));
					document.add(Chunk.NEWLINE);
					
					String str_bene_checkType = "";
					String str_wider_comm = "";
					String str_com_winth_site = "";
					String str_com_outsd_site = "";
					
					if(!benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id).isEmpty()){
						List<benefits> lst_benefits = benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id);
						int g=1;
						for(benefits obj_benefits : lst_benefits){
							long benefits_id = obj_benefits.getBenefits_id();
							String benefits_summary = obj_benefits.getSummary();
							long com_outsd_site = obj_benefits.getCommunity_outside_site();
							long com_winth_site = obj_benefits.getCommunity_within_site();
							long wider_comm = obj_benefits.getWider_community();
							
							
							
							if(com_outsd_site > 0){
								benefit_rating_lkp obj_benefit_rating_lkp_outside = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_outsd_site);
								str_com_outsd_site = obj_benefit_rating_lkp_outside.getRating();
							}
							
							
							if(com_winth_site > 0){
								benefit_rating_lkp obj_benefit_rating_lkp_within = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_winth_site);
								str_com_winth_site = obj_benefit_rating_lkp_within.getRating();
							}
							
							
							if(wider_comm > 0){
								benefit_rating_lkp obj_benefit_rating_lkp_wider = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(wider_comm);
								str_wider_comm = obj_benefit_rating_lkp_wider.getRating();
							}
							
							List<benefits_type_ref> lst_benefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(benefits_id);
							
							
							for(benefits_type_ref obj_benefits_type_ref : lst_benefits_type_ref){
								
								
								long benefit_checktypeId = obj_benefits_type_ref.getBenefit_checktype();
								long benefit_checksubTypeId = obj_benefits_type_ref.getBenefit_checksubtype();
								
								
								
								if(benefit_checktypeId > 0){
									benefit_checktype_lkp obj_benefit_checktype_lkp = benefit_checktype_lkpLocalServiceUtil.fetchbenefit_checktype_lkp(benefit_checktypeId);
									str_bene_checkType = obj_benefit_checktype_lkp.getBenefit_checktype();
								}
							
							}
							
							
							if(!str_bene_checkType.isEmpty()){document.add(new Paragraph(g+": "+str_bene_checkType,font4));}
							if(!str_com_winth_site.isEmpty()){
								
													       	 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Community within site :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_com_winth_site));
						         document.add(comb);
								
								}else
								{
								 	Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("Community within site :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk("Not avilable"));
							         document.add(comb);
								}
							
							if(!str_com_outsd_site.isEmpty()){
								
														       	 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Community outside site :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_com_outsd_site));
						         document.add(comb);
						         
								
								}else
								{
									Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("Community outside site :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk("Not avilable"));
							         document.add(comb);
								}
							
							if(!str_com_winth_site.isEmpty()){
														       	 
						     	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Wider Community :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(str_com_winth_site));
						         document.add(comb);
						         
								
							   }else
							   {
								   Paragraph comb=new Paragraph(); 
							         comb.add(new Chunk("Wider Community :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
							         comb.add(new Chunk("Not avilable"));
							         document.add(comb);
						       }
							
							if(!benefits_summary.isEmpty()){
										       	 
						       	Paragraph comb=new Paragraph(); 
						         comb.add(new Chunk("Summary :-",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, Font.DEFAULTSIZE))); ;
						         comb.add(new Chunk(benefits_summary));
						         document.add(comb);
						       	 
								}
							
							g++;
							document.add(Chunk.NEWLINE);
							
							
							
						}
					}
					
					
					document.newPage();
					 
					document.add(Chunk.NEWLINE);
					
					document.add(new Paragraph("Projects",font2));
					
					
					

				      Table datatable = new Table(4);
				      int headerwidths[] = {10, 25, 35,35};
				      datatable.setWidths(headerwidths);
				      datatable.setWidth(110);
				      datatable.setPadding(2);

				      Cell cell = new Cell(new Phrase("Active Conservation Projects ", FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD)));
				      /*cell.setHorizontalAlignment(Element.ALIGN_CENTER);*/
				     /* cell.setLeading(30)*/;
				      cell.setColspan(4);
				      cell.setBorder(Rectangle.NO_BORDER);
				      cell.setBackgroundColor(new Color(0xC0, 0xC0, 0xC0));
				      datatable.addCell(cell);

				      datatable.setDefaultCellBorderWidth(1);
				      datatable.setDefaultHorizontalAlignment(1);
				      datatable.addCell("N.O");
				      datatable.addCell("Organization/individuals");
				      datatable.addCell("Brief description of Active Projects");
				      datatable.addCell("Contact Details");
				      datatable.endHeaders();
				      datatable.setDefaultCellBorderWidth(1);

				      int id=1;
				      
				      System.out.println("1........................................");
				 if(!active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(lastass_version_id).isEmpty()){
							List<active_conservation_projects> lst_active_conservation_projects = active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(lastass_version_id);
							for(active_conservation_projects obj_active_conservation_projects : lst_active_conservation_projects){
								long acpid = obj_active_conservation_projects.getAcpid();
								String description = obj_active_conservation_projects.getDescription();
								String org_individual = obj_active_conservation_projects.getOrganization_individual();
								String contact_details = obj_active_conservation_projects.getContact_details();
								 
								
								
							        datatable.addCell(id+"");
							        datatable.addCell(description);
							        datatable.addCell(org_individual);
							        datatable.addCell(contact_details);
							        id++;
								
															
							}
					
				      }else{
							
							datatable.addCell("No Data Avilable");
						}

					
            
				      datatable.setCellsFitPage(true);
				      document.add(datatable);
				      
				      
				      
				      document.newPage();
				      
				      document.add(new Paragraph("Active Conservation Projects ",font3));
				      
				      
				      
				      Table datatable2 = new Table(4);
				      int headerwidths2[] = {10, 25, 35,35};
				      datatable2.setWidths(headerwidths2);
				      datatable2.setWidth(110);
				      datatable2.setPadding(2);

				      Cell cell2 = new Cell(new Phrase("Brief description of Active Projects", FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD)));
				      /*cell.setHorizontalAlignment(Element.ALIGN_CENTER);*/
				     /* cell.setLeading(30)*/;
				     cell2.setColspan(4);
				     cell2.setBorder(Rectangle.NO_BORDER);
				     cell2.setBackgroundColor(new Color(0xC0, 0xC0, 0xC0));
				      datatable2.addCell(cell2);

				      datatable2.setDefaultCellBorderWidth(1);
				      datatable2.setDefaultHorizontalAlignment(1);
				      datatable2.addCell("N.O");
				      datatable2.addCell("Organization/individuals");
				      datatable2.addCell("Brief description of Active Projects");
				      datatable2.addCell("Contact Details");
				      datatable2.endHeaders();
				      datatable2.setDefaultCellBorderWidth(1);
				      
				      

						 int j=1;
						
							if(!potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(lastass_version_id).isEmpty()){
								List<potential_project_needs> lst_potential_project_needs = potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(lastass_version_id);
								for(potential_project_needs obj_potential_project_needs : lst_potential_project_needs){
									long ppn_id = obj_potential_project_needs.getPpn_id();
									String potential_org_individual = obj_potential_project_needs.getOrganization_individual();
									String potential_description = obj_potential_project_needs.getDescription();
									String potential_contactdetails = obj_potential_project_needs.getContact_details();
				      
									

									datatable2.addCell(j+"");
									datatable2.addCell(potential_org_individual);
									datatable2.addCell(potential_description);
									datatable2.addCell(potential_contactdetails);
							        j++;
								
									
									
									
									
								}
							}else
							{
								datatable2.addCell("No Data Avilable");
							}
							
				      
				      
				      

							datatable2.setCellsFitPage(true);
						    document.add(datatable2);
				      
				      
						    
							
							document.newPage();
									      
							document.add(new Paragraph("References",font3));
				      
						    
						    
						    

						      Table datatable3 = new Table(2);
						      int headerwidths3[] = {10,100 };
						      datatable3.setWidths(headerwidths3);
						      datatable3.setWidth(110);
						      datatable3.setPadding(2);

						      Cell cell3 = new Cell(new Phrase("References", FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD)));
						      /*cell.setHorizontalAlignment(Element.ALIGN_CENTER);*/
						     /* cell.setLeading(30)*/;
						     cell3.setColspan(2);
						     cell3.setBorder(Rectangle.NO_BORDER);
						     cell3.setBackgroundColor(new Color(0xC0, 0xC0, 0xC0));
						      datatable2.addCell(cell3);

						      datatable3.setDefaultCellBorderWidth(1);
						      datatable3.setDefaultHorizontalAlignment(1);
						      datatable3.addCell("Rn0");
						      datatable3.addCell("References");
						      datatable3.endHeaders();
						      datatable3.setDefaultCellBorderWidth(1);
						      
						      
						      
						      int k=1;
								if(!referencesLocalServiceUtil.findByAssessmentId(lastass_version_id).isEmpty()){
									List<references> lst_references = referencesLocalServiceUtil.findByAssessmentId(lastass_version_id);
									for(references obj_references : lst_references){
										long rn_value = obj_references.getRn();
										String str_references = obj_references.getReferences();
										//rn_str = rn_str.concat(String.valueOf(rn_value));	
										String rn_value_str = String.valueOf(rn_value);
										
										
										datatable3.addCell(k+"");
										datatable3.addCell(str_references);
									    k++;
									
										
										
									}
								}else
								{
									datatable3.addCell("No Data Avilable");
								}
						
				
					
								datatable3.setCellsFitPage(true);
							    document.add(datatable3);
					
					
        
					
					
					
				      
			 
            document.close();
            
            
            resourceResponse.setContentType("application/pdf");
            resourceResponse.addProperty(HttpHeaders.CACHE_CONTROL, "max-age=3600, must-revalidate");
            
            resourceResponse.setContentLength(baos.size());
            
            OutputStream out = resourceResponse.getPortletOutputStream();
            baos.writeTo(out);
            
            out.flush();
            out.close();
	} catch (Exception e2) {
           
		e2.printStackTrace();
	
	}
		
	}

}
