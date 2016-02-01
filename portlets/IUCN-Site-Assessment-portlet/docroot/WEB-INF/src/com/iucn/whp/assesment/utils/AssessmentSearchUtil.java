package com.iucn.whp.assesment.utils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.iucn.whp.dbservice.model.advance_query_assessment;
import com.iucn.whp.dbservice.model.assessment_lang_lkp;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.assessment_stages;
import com.iucn.whp.dbservice.model.assessment_status;
import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;
import com.iucn.whp.dbservice.model.benefit_checktype_lkp;
import com.iucn.whp.dbservice.model.benefit_rating_lkp;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.key_conservation_scale_lkp;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.state_lkp;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.trend_lkp;
import com.iucn.whp.dbservice.model.whp_criteria_lkp;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.advance_query_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_stagesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_statusLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.key_conservation_scale_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_management_ratings_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dto.SiteAssessmentDTO;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class AssessmentSearchUtil {
	
	public static List<SiteAssessmentDTO> getSiteAssessment(String siteName,int statusID,int stageID,  int countryId, int userId){
		
		List<SiteAssessmentDTO> siteAssessmentDTOList=null;
		List<site_assessment> site_assessmentList=null;
		String query="SELECT {whp_site_assessment.*} FROM whp_site_assessment ";
		List<String> andCriteria = new ArrayList<String>();
		StringBuffer sqlBuilder_AND =null;
		String joinQuery=null;
		
		if (!andCriteria.isEmpty() && andCriteria.size()>0) {
       	 sqlBuilder_AND=new StringBuffer();
          	 sqlBuilder_AND.append(andCriteria.remove(0) + " ");
            for (String criterion : andCriteria) {
           	 sqlBuilder_AND.append(" AND "+criterion);
            }
        }
		if(siteName!=null || countryId==0){
			//creating query
			joinQuery =  "JOIN whp_whp_sites " +
	                    "ON whp_site_assessment.site_id = whp_whp_sites.site_id ";
	    }
		
		
		//creating where clause
		if(Validator.isNotNull(siteName)){
			andCriteria.add("lower(whp_whp_sites.name_en) LIKE '"+siteName.toLowerCase().trim()+"%'");
		}
		if(Validator.isNotNull(stageID) && stageID>0){
			andCriteria.add("whp_site_assessment.current_stageid="+stageID+"");
		}
		if(Validator.isNotNull(statusID) && statusID>0){
			andCriteria.add("whp_site_assessment.status_id="+statusID+"");
		}
		if(Validator.isNotNull(countryId) && countryId>0){
			
			String regionQueryStr = "select distinct (wws.site_id) from whp_whp_sites wws"+ 
			" left join whp_whp_sites_country sc on sc.site_id = wws.site_id"+
			" left join whp_unesco_region_country wrc on sc.countryid = wrc.countryid"+
			" where wrc.unesco_region_id = ";
			andCriteria.add("whp_whp_sites.site_id in( "+regionQueryStr+countryId+")");
			
		}
		if(userId>0){
			if(!AssessmentPermissionUtil.isAdminOrWhpStaffUser(userId)){
				andCriteria.add("whp_site_assessment.current_userid="+userId+"");
			}
			
		}
		andCriteria.add("whp_site_assessment.archived is false");
		
		StringBuffer sqlBuilder = new StringBuffer(query);
	        
	       if(joinQuery!=null){
	    	   sqlBuilder.append(joinQuery);
	       }
	       
	        if (!andCriteria.isEmpty() && andCriteria.size()>0) {
	        	 sqlBuilder_AND=new StringBuffer();
	           	 sqlBuilder_AND.append(andCriteria.remove(0) + " ");
	             for (String criterion : andCriteria) {
	            	 sqlBuilder_AND.append(" AND "+criterion);
	             }
	         }
	        
	        if(sqlBuilder_AND!=null){
	        	 sqlBuilder.append(" WHERE ");
	        	 if(sqlBuilder_AND!=null){
	        	     sqlBuilder.append(sqlBuilder_AND);
	        		
	        	 }
	         }
	       //  String sql = sqlBuilder.toString();
		String customSql=sqlBuilder.toString();
		System.out.println("customSql"+customSql);
		
		try {
			site_assessmentList=site_assessmentLocalServiceUtil.getAllActiveSiteAssessment(customSql,0,10000 );
			if(site_assessmentList!=null){
				siteAssessmentDTOList=getSiteAssessmentDTOFromSite_assessmentList(site_assessmentList);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return siteAssessmentDTOList;
	}
	
	public static List<SiteAssessmentDTO> getSiteAssessmentDTOFromSite_assessmentList(List<site_assessment> site_assessmentList) throws PortalException, SystemException{
		List<SiteAssessmentDTO> siteAssessmentDTOList=new ArrayList<SiteAssessmentDTO>();
			//setting value of site assessment
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
			
			String currentVersionCode="0.0";
			
			for(site_assessment objSite_assessment : site_assessmentList){
				
				site_assessment_versions currentSite_assessment_versions=null;
				 
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
						currentVersionCode=currentSite_assessment_versions.getVersion_code()+"";
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
						assessmentLang="";
				}
				
				
				SiteAssessmentDTO tempSiteAssessmentDTO=new SiteAssessmentDTO();
				tempSiteAssessmentDTO.setSite_Assessment(objSite_assessment);
				tempSiteAssessmentDTO.setSite_AssessmentVersions(currentSite_assessment_versions);
				tempSiteAssessmentDTO.setCurrent_Stage(assessment_stagesMap.get(objSite_assessment.getCurrent_stageid()));
				tempSiteAssessmentDTO.setCurrent_Status(assessment_statusMap.get(objSite_assessment.getStatus_id()));
				tempSiteAssessmentDTO.setCurrentUser(AssessmentActionUtil.getUserNameByUserId(objSite_assessment.getCurrent_userid()));
				tempSiteAssessmentDTO.setAssessmentId(objSite_assessment.getAssessment_id());
				tempSiteAssessmentDTO.setSiteName(objwhp_sites.getName_en());
				tempSiteAssessmentDTO.setLanguages(assessmentLang);
				tempSiteAssessmentDTO.setCurrentVersion(currentVersionCode);
				siteAssessmentDTOList.add(tempSiteAssessmentDTO);
				
			}
			return siteAssessmentDTOList;
		
	}
	
	
	/*************************************************************Advance Search Start here**************************************/
	
	//Getting sub category field 
    public static void getSubCategoryList(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	 
    	 String baseFieldValue=ParamUtil.getString(resourceRequest, "CATNAME");
    	
	     List<advance_query_assessment> selectedSubCatList=new ArrayList<advance_query_assessment>();
	     try{
	    	 if(baseFieldValue!=null && !baseFieldValue.isEmpty())
	    		 selectedSubCatList= advance_query_assessmentLocalServiceUtil.findBybase_tab_diplay_name(baseFieldValue);
		   
	    	if(selectedSubCatList!=null){
	    		//Collections.sort(countryList);
	    		Collections.sort(selectedSubCatList, new Comparator<advance_query_assessment>(){
	    		    public int compare(advance_query_assessment one, advance_query_assessment other) {
	    		        return one.getBase_tab_field_disp().compareTo(other.getBase_tab_field_disp());
	    		    }
	    		});
	    	}
	    		
	     }catch(Exception ex){
	    	 ex.printStackTrace();
	     }
	    
	     
	     try {
	    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
	    	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
	    	 JSONObject cell=null;
	    	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	
	    	 for(int i=0;i<selectedSubCatList.size();i++){

	    	 advance_query_assessment tempObject=selectedSubCatList.get(i);
	    	 cell=JSONFactoryUtil.createJSONObject();
	    	 cell.put("id", tempObject.getId());
	    	 cell.put("name", tempObject.getBase_tab_field_disp());
	    	 recordsjsonArray.put(cell);
	    	 }
	    	 recordsjsonObject.put("rows",recordsjsonArray);
	    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
	    	// System.out.println(recordsjsonObject.toString());
	    	 } catch (Exception e) {
	    	 // TODO Auto-generated catch block
	    		 e.printStackTrace();
	    	 }
    }
    
    //check values of selected lkp
  //Getting sub category field 
    public static void getUniqueValuesForSearch(ResourceRequest resourceRequest, 
    		ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	 
    	 long id=ParamUtil.getLong(resourceRequest, "UID");
	     advance_query_assessment objAdvance_query_assessment=null;
	     id=6;
	     Map<String,String> lkpValues=new HashMap<String, String>();
	     try{
	    	 if(id>0){
	    		 objAdvance_query_assessment= advance_query_assessmentLocalServiceUtil.getadvance_query_assessment(id);		
	    
	    	 if(objAdvance_query_assessment.getHas_lookup().equalsIgnoreCase("y")){
	    		 String lkpTableName=objAdvance_query_assessment.getLookup_table_name();
	    		 String lkp=objAdvance_query_assessment.getLookup_table_name()+"LocalServiceUtil";
	    		// Method aa=Class.forName(lkp).getMethod("findAll");
	    	// }
	    	 
	    	Class cls = Class.forName("com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil");
	 		Object obj = cls.newInstance();
	  
	 		//Class abc=Class.forName("com.iucn.whp.dbservice.model.assessment_lang_lkpModel");
	 		//call the printIt method
	 		Method method = cls.getDeclaredMethod("findAll");
	 		Object aa=method.invoke(obj, null);
	 		//method.getReturnType();
	 		Class aabb=method.getReturnType();
	 		System.out.println(aa);
	 		Object aa11=ClpSerializer.translateOutput(aa);
	 		System.out.println(aa11);
	 		List lst=(List)aa11;
	 		
	 		
	 		for(Object temp:lst){
	 			try{
	 			Class lkpClass=temp.getClass();
	 			/*
	 			 * 
	 			 //accessing private field
	 			 Field field = aClass.getDeclaredField("_languageid");
	 			System.out.println("field::"+field);
	 			field.setAccessible(true);
	 			Object value = field.get(temp);
	 			System.out.println("value::"+value);*/
	 			
	 			
	 			Method idMethod = lkpClass.getDeclaredMethod("getLanguageid");
		 		Object idValueObj=idMethod.invoke(temp, null);
		 		String idValue=String.valueOf(idValueObj);
		 		lkpValues.put(idValue,idValue);
	 			//field.set(objetInstance, value);
	 			}catch(Exception ex){
	 				ex.printStackTrace();
	 				
	 			}
	 			
	 		}
	    	 } 
	    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
	    	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
	    	 JSONObject cell=null;
	    	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	
	    	 Iterator iterator=lkpValues.entrySet().iterator();
	    	 
	    	 if(lkpValues!=null && lkpValues.size()>0){
	    	 while(iterator.hasNext()){
	    		 Map.Entry entry = (Map.Entry) iterator.next();
	    		 String key = (String)entry.getKey();
	    		    String value = (String)entry.getValue();
	    		 cell=JSONFactoryUtil.createJSONObject();
		    	 cell.put("id", key);
		    	 cell.put("name", value);
		    	 recordsjsonArray.put(cell);
	    	 }
	    	 }else{
	    		 recordsjsonArray.put(cell); 
	    	 }
	    	 
	    	 
	    	 recordsjsonObject.put("rows",recordsjsonArray);
	    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
	       }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }
    
    
    public static void getLookUpValues(ResourceRequest resourceRequest, 
	ResourceResponse resourceResponse) throws PortletException, IOException{
    	long id=ParamUtil.getLong(resourceRequest, "UID");
	     advance_query_assessment objAdvance_query_assessment=null;
	     Map<String,String> lkpValues=new LinkedHashMap<String, String>();
	     try{
	    	 if(id>0){
	    		 objAdvance_query_assessment= advance_query_assessmentLocalServiceUtil.getadvance_query_assessment(id);		
	    
	    	 if(objAdvance_query_assessment.getHas_lookup().equalsIgnoreCase("y")){
	    		 String lkpTableName=objAdvance_query_assessment.getLookup_table_name();
	    		
	    		 if(lkpTableName.equalsIgnoreCase("whp_threat_categories_lkp")){
	    			 List<threat_categories_lkp> lstThreatCategory=site_assessmentLocalServiceUtil.getAllThreatCategories();
	    			 Collections.sort(lstThreatCategory, new Comparator<threat_categories_lkp>(){
	    				    public int compare(threat_categories_lkp one, threat_categories_lkp other) {
	    				        return String.valueOf(one.getThreat_category()).compareTo(String.valueOf(other.getThreat_category()));
	    				    }
	    				});
	    			 for(threat_categories_lkp tempThreatCategory:lstThreatCategory){
	    				 lkpValues.put(tempThreatCategory.getThreatCategoryid()+"",tempThreatCategory.getThreat_category());
	    			 }
	    		 }else  if(lkpTableName.equalsIgnoreCase("whp_threat_subcategories_lkp")){
	    			 List<threat_subcategories_lkp> lstThreatSubCategoryTemp = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
	    			 Collections.sort(lstThreatSubCategoryTemp, new Comparator<threat_subcategories_lkp>(){
	    				    public int compare(threat_subcategories_lkp one, threat_subcategories_lkp other) {
	    				        return String.valueOf(one.getThreat_sub_category()).compareTo(String.valueOf(other.getThreat_sub_category()));
	    				    }
	    				});
	    			 for(threat_subcategories_lkp tempThreatCategory:lstThreatSubCategoryTemp){
	    				 lkpValues.put(tempThreatCategory.getId()+"",tempThreatCategory.getThreat_sub_category());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_threat_rating_lkp")){
	    			 List<threat_rating_lkp> lstThreatRating = site_assessmentLocalServiceUtil.getAllThreatRating();
	    			 Collections.sort(lstThreatRating, new Comparator<threat_rating_lkp>(){
	    				    public int compare(threat_rating_lkp one, threat_rating_lkp other) {
	    				        return String.valueOf(one.getRating()).compareTo(String.valueOf(other.getRating()));
	    				    }
	    				});
	    			 for(threat_rating_lkp tempThreatCategory:lstThreatRating){
	    				 lkpValues.put(tempThreatCategory.getId()+"",tempThreatCategory.getRating());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_protection_management_ratings_lkp")){
	    			 List<protection_management_ratings_lkp> protection_management_ratings_lkpList =protection_management_ratings_lkpLocalServiceUtil.findAll();
	    			 Collections.sort(protection_management_ratings_lkpList, new Comparator<protection_management_ratings_lkp>(){
	    				    public int compare(protection_management_ratings_lkp one, protection_management_ratings_lkp other) {
	    				        return String.valueOf(one.getPm_rating()).compareTo(String.valueOf(other.getPm_rating()));
	    				    }
	    				});
	    			 for(protection_management_ratings_lkp tempThreatCategory:protection_management_ratings_lkpList){
	    				 lkpValues.put(tempThreatCategory.getId()+"",tempThreatCategory.getPm_rating());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_trend_lkp")){
	    			 List<trend_lkp> lstTrends = site_assessmentLocalServiceUtil.getAllTrends();
	    			 Collections.sort(lstTrends, new Comparator<trend_lkp>(){
	    				    public int compare(trend_lkp one, trend_lkp other) {
	    				        return String.valueOf(one.getTrend()).compareTo(String.valueOf(other.getTrend()));
	    				    }
	    				});
	    			 for(trend_lkp tempThreatCategory:lstTrends){
	    				 lkpValues.put(tempThreatCategory.getTrend_id()+"",tempThreatCategory.getTrend());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_state_lkp")){
	    			 List<state_lkp> lstStates = site_assessmentLocalServiceUtil.getAllStates();
	    			 Collections.sort(lstStates, new Comparator<state_lkp>(){
	    				    public int compare(state_lkp one, state_lkp other) {
	    				        return String.valueOf(one.getState()).compareTo(String.valueOf(other.getState()));
	    				    }
	    				});
	    			 for(state_lkp tempThreatCategory:lstStates){
	    				 lkpValues.put(tempThreatCategory.getState_id()+"",tempThreatCategory.getState());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_conservation_outlook_rating_lkp")){
	    			 List<conservation_outlook_rating_lkp> lstconservationratinglkp = conservation_outlookLocalServiceUtil.getconservationoutlookrating();
	    			 Collections.sort(lstconservationratinglkp, new Comparator<conservation_outlook_rating_lkp>(){
	    				    public int compare(conservation_outlook_rating_lkp one, conservation_outlook_rating_lkp other) {
	    				        return String.valueOf(one.getCo_rating()).compareTo(String.valueOf(other.getCo_rating()));
	    				    }
	    				});
	    			 for(conservation_outlook_rating_lkp tempThreatCategory:lstconservationratinglkp){
	    				 lkpValues.put(tempThreatCategory.getCo_rating_id()+"",tempThreatCategory.getCo_rating());
	    			 }
	    		 } 
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_inscription_criteria_lkp")){
	    			 List<inscription_criteria_lkp> lstcriterialkp = inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	    			 Collections.sort(lstcriterialkp, new Comparator<inscription_criteria_lkp>(){
	    				    public int compare(inscription_criteria_lkp one, inscription_criteria_lkp other) {
	    				        return String.valueOf(one.getCriteria()).compareTo(String.valueOf(other.getCriteria()));
	    				    }
	    				});
	    			 for(inscription_criteria_lkp tempThreatCategory:lstcriterialkp){
	    				 lkpValues.put(tempThreatCategory.getCriteria_id()+"",tempThreatCategory.getCriteria());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_key_conservation_scale_lkp")){
	    			 List<key_conservation_scale_lkp> lstconservationscalelkp = key_conservation_issuesLocalServiceUtil.getAllconversionScale();
	    			 Collections.sort(lstconservationscalelkp, new Comparator<key_conservation_scale_lkp>(){
	    				    public int compare(key_conservation_scale_lkp one, key_conservation_scale_lkp other) {
	    				        return String.valueOf(one.getScale()).compareTo(String.valueOf(other.getScale()));
	    				    }
	    				});
	    			 for(key_conservation_scale_lkp tempThreatCategory:lstconservationscalelkp){
	    				 lkpValues.put(tempThreatCategory.getScale_id()+"",tempThreatCategory.getScale());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_benefit_checktype_lkp")){
	    			 List<benefit_checktype_lkp> lstbenefittypelkp = benefit_checktype_lkpLocalServiceUtil.findAll();
	    			 Collections.sort(lstbenefittypelkp, new Comparator<benefit_checktype_lkp>(){
	    				    public int compare(benefit_checktype_lkp one, benefit_checktype_lkp other) {
	    				        return String.valueOf(one.getBenefit_checktype()).compareTo(String.valueOf(other.getBenefit_checktype()));
	    				    }
	    				});
	    			 for(benefit_checktype_lkp tempThreatCategory:lstbenefittypelkp){
	    				 lkpValues.put(tempThreatCategory.getBenefit_id()+"",tempThreatCategory.getBenefit_checktype());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_benefit_checksubtype_lkp")){
	    			 List<benefit_checksubtype_lkp> lstbenefitsubtypelkp = benefit_checksubtype_lkpLocalServiceUtil.findAll();
	    			 Collections.sort(lstbenefitsubtypelkp, new Comparator<benefit_checksubtype_lkp>(){
	    				    public int compare(benefit_checksubtype_lkp one, benefit_checksubtype_lkp other) {
	    				        return String.valueOf(one.getBenefit_checksubtype()).compareTo(String.valueOf(other.getBenefit_checksubtype()));
	    				    }
	    				});
	    			 for(benefit_checksubtype_lkp tempThreatCategory:lstbenefitsubtypelkp){
	    				 lkpValues.put(tempThreatCategory.getSubbenefit_id()+"",tempThreatCategory.getBenefit_checksubtype());
	    			 }
	    		 }
	    		 else  if(lkpTableName.equalsIgnoreCase("whp_benefit_rating_lkp")){
	    			 List<benefit_rating_lkp> lstbenefitratinglkp = benefit_rating_lkpLocalServiceUtil.findAll();
	    			 Collections.sort(lstbenefitratinglkp, new Comparator<benefit_rating_lkp>(){
	    				    public int compare(benefit_rating_lkp one, benefit_rating_lkp other) {
	    				        return String.valueOf(one.getRating()).compareTo(String.valueOf(other.getRating()));
	    				    }
	    				});
	    			 for(benefit_rating_lkp tempThreatCategory:lstbenefitratinglkp){
	    				 lkpValues.put(tempThreatCategory.getId()+"",tempThreatCategory.getRating());
	    			 }
	    		 }
	    		 
	    	 }else if(objAdvance_query_assessment.getIsboolean().equalsIgnoreCase("y")){
	    		 lkpValues.put("true", "True");
	    		 lkpValues.put("false", "False");
	    	 }
	    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
	    	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
	    	 JSONObject cell=null;
	    	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	
	    	 Iterator iterator=lkpValues.entrySet().iterator();
	    	 
	    	 if(lkpValues!=null && lkpValues.size()>0){
	    	 while(iterator.hasNext()){
	    		 Map.Entry entry = (Map.Entry) iterator.next();
	    		 String key = (String)entry.getKey();
	    		    String value = (String)entry.getValue();
	    		 cell=JSONFactoryUtil.createJSONObject();
		    	 cell.put("id", key);
		    	 cell.put("name", value);
		    	 recordsjsonArray.put(cell);
	    	 }
	    	 }else{
	    		 if(cell!=null)
	    			 recordsjsonArray.put(cell); 
	    	 }
	    	 
	    	 
	    	 recordsjsonObject.put("rows",recordsjsonArray);
	    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
	       }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    	
    }
    
    public static List<Long> runQuery(String[] whereClause){
    	List<Long> assessmentIdList=null;
    	if(whereClause!=null && whereClause.length>0){
    		
    		int fieldNo=whereClause.length;
        	
        	for(int i=0;i<fieldNo;i++){
        		try{
        		String[] fieldValues=whereClause[i].split(";;");
        		long id=Long.parseLong(fieldValues[0]);
        		String opt=fieldValues[1];
        		String value=fieldValues[2];
        		String operater=fieldValues[3];
        		        		
        		advance_query_assessment objAdvance_query_assessment= advance_query_assessmentLocalServiceUtil.
        		getadvance_query_assessment(id);
        		
        		String sql="";
        		if(objAdvance_query_assessment!=null){
        			if(assessmentIdList==null){
        				assessmentIdList=new ArrayList<Long>();
        				sql=objAdvance_query_assessment.getCustom_sql();
        				sql=sql.replace("operatorVal=", opt);
        				if(opt.equalsIgnoreCase("like"))
        					sql=sql.replace("criteriaFieldVal", "'%"+value+"%'");
        				else 
        					sql=sql.replace("criteriaFieldVal", "'"+value+"'");
        				System.out.println("sqlquery: "+sql);
        				/*	String customSql="select {whp_site_assessment.*} from whp_site_assessment ,whp_site_assessment_versions "+
        					"where whp_site_assessment.assessment_id=whp_site_assessment_versions.assessment_id "+
        					" and whp_site_assessment_versions.assessment_id in " +
        					" (select assessment_version_id from whp_assessing_threats_current where current_threat_id="+1+")";
        				*/	
        					List<site_assessment_versions> site_assessment_versionslst = null;
							try {
								site_assessment_versionslst = site_assessment_versionsLocalServiceUtil.
								 findSite_assessment_versionsByCustomQuery(sql,0,site_assessment_versionsLocalServiceUtil.getsite_assessment_versionsesCount());
								for(site_assessment_versions tempsite_assessment_versionslst:site_assessment_versionslst){
	        						 if(!assessmentIdList.contains(tempsite_assessment_versionslst.getAssessment_id())){
	        							 assessmentIdList.add(tempsite_assessment_versionslst.getAssessment_id());
	        						 }
	        					 }
							} catch (Exception e) {
								// TODO Auto-generated catch block
								//System.out.println(e.getMessage());
								
							}
        					 
        			}
        			else{
        				
        				sql=objAdvance_query_assessment.getCustom_sql();
        				sql=sql.replace("operatorVal=", opt);
        				if(opt.equalsIgnoreCase("like"))
        					sql=sql.replace("criteriaFieldVal", "'%"+value+"%'");
        				else 
        					sql=sql.replace("criteriaFieldVal", "'"+value+"'");
        				System.out.println("sqlquery: "+sql);
        					 List<site_assessment_versions> site_assessment_versionslst=site_assessment_versionsLocalServiceUtil.
        					 findSite_assessment_versionsByCustomQuery(sql,0,site_assessment_versionsLocalServiceUtil.getsite_assessment_versionsesCount());
        			
        				List<Long> tempAssessmetIdlst=new ArrayList<Long>();
        					 
        					 for(site_assessment_versions tempsite_assessment_versionslst:site_assessment_versionslst){
        						 if(!tempAssessmetIdlst.contains(tempsite_assessment_versionslst.getAssessment_id())){
        							 tempAssessmetIdlst.add(tempsite_assessment_versionslst.getAssessment_id());
        						 }
        					 }
        					 
        					 if("or".equalsIgnoreCase(operater)){
        						 for(Long tempId:tempAssessmetIdlst){
            						 if(!assessmentIdList.contains(tempId)){
            							 assessmentIdList.add(tempId);
            						 }
            					 }
        					 }else if("AND".equalsIgnoreCase(operater)){
        						 List<Long> templst=new ArrayList<Long>();
            						 for(Long tempId:tempAssessmetIdlst){
                						 if(assessmentIdList.contains(tempId)){
                							 templst.add(tempId);
                						 }
                					 }
            						 assessmentIdList= templst;
            				 }
              			}
        		}
        		}catch(Exception e){
        			e.printStackTrace();
        		}
        		
        	}
    	}
    	return assessmentIdList;
    	
    	
    }
    
    

}
