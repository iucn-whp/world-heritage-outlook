package com.iucn.whp.sites.utils;

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
import com.iucn.whp.dbservice.model.advance_query_site;
import com.iucn.whp.dbservice.model.assessment_lang_lkp;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.assessment_stages;
import com.iucn.whp.dbservice.model.assessment_status;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.flagship_species_lkp;
import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.iucn_pa_lkp_category;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;
import com.iucn.whp.dbservice.model.recommendation_type_lkp;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.trend_lkp;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.advance_query_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.advance_query_siteLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_stagesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_statusLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.flagship_species_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_pa_lkp_categoryLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_management_ratings_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.recommendation_type_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dto.SiteAdvanceQueryDTO;
import com.iucn.whp.dto.SiteAdvanceQueryDTO;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class SiteSearchUtil {
	
	/*************************************************************Advance Search Start here**************************************/
	
	//Getting sub category field 
    public static void getSubCategoryList(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	 
    	 String baseFieldValue=ParamUtil.getString(resourceRequest, "CATNAME");
    	
	     List<advance_query_site> selectedSubCatList=new ArrayList<advance_query_site>();
	     try{
	    	 if(baseFieldValue!=null && !baseFieldValue.isEmpty())
	    		 selectedSubCatList= advance_query_siteLocalServiceUtil.findBybase_tab_diplay_name(baseFieldValue);
		   
	    	if(selectedSubCatList!=null){
	    		//Collections.sort(countryList);
	    		Collections.sort(selectedSubCatList, new Comparator<advance_query_site>(){
	    		    public int compare(advance_query_site one, advance_query_site other) {
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

	    		 advance_query_site tempObject=selectedSubCatList.get(i);
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
	     advance_query_site objAdvance_query_site=null;
	     id=6;
	     Map<String,String> lkpValues=new HashMap<String, String>();
	     try{
	    	 if(id>0){
	    		 objAdvance_query_site= advance_query_siteLocalServiceUtil.getadvance_query_site(id);		
	    
	    	 if(objAdvance_query_site.getHas_lookup().equalsIgnoreCase("y")){
	    		 String lkpTableName=objAdvance_query_site.getLookup_table_name();
	    		 String lkp=objAdvance_query_site.getLookup_table_name()+"LocalServiceUtil";
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
    	advance_query_site objAdvance_query_site=null;
	     Map<String,String> lkpValues=new LinkedHashMap<String, String>();
	     try{
	    	 if(id>0){
	    		 objAdvance_query_site= advance_query_siteLocalServiceUtil.getadvance_query_site(id);		
	    
	    	 if(objAdvance_query_site.getHas_lookup().equalsIgnoreCase("y")){
	    		 String lkpTableName=objAdvance_query_site.getLookup_table_name();
	    		 if(lkpTableName.equalsIgnoreCase("whp_inscription_criteria_lkp")){
	    			 List<inscription_criteria_lkp> lstcriterialkp = inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	    			 Collections.sort(lstcriterialkp, new Comparator<inscription_criteria_lkp>(){
	    				    public int compare(inscription_criteria_lkp one, inscription_criteria_lkp other) {
	    				        return String.valueOf(one.getCriteria()).compareTo(String.valueOf(other.getCriteria()));
	    				    }
	    				});
	    			 for(inscription_criteria_lkp tempThreatCategory:lstcriterialkp){
	    				 lkpValues.put(tempThreatCategory.getCriteria_id()+"",tempThreatCategory.getCriteria());
	    			 }
	    		 }else if(lkpTableName.equalsIgnoreCase("whp_iucn_pa_lkp_category")){
	    			 List<iucn_pa_lkp_category> lstcategorylkp = iucn_pa_lkp_categoryLocalServiceUtil.getAllIucnPaCategory();
	    			 Collections.sort(lstcategorylkp, new Comparator<iucn_pa_lkp_category>(){
	    				    public int compare(iucn_pa_lkp_category one, iucn_pa_lkp_category other) {
	    				        return String.valueOf(one.getCategory()).compareTo(String.valueOf(other.getCategory()));
	    				    }
	    			 });
	    			 for(iucn_pa_lkp_category tempIUCNPACategory:lstcategorylkp){
	    				 lkpValues.put(tempIUCNPACategory.getIucn_pa_category_id()+"",tempIUCNPACategory.getCategory());
	    			 }
	    			 
	    		 }else if(lkpTableName.equalsIgnoreCase("whp_recommendation_type_lkp")){
	    			 List<recommendation_type_lkp> lstrecommlkp = recommendation_type_lkpLocalServiceUtil.getAllRecommendationType();
	    			 Collections.sort(lstrecommlkp, new Comparator<recommendation_type_lkp>(){
	    				    public int compare(recommendation_type_lkp one, recommendation_type_lkp other) {
	    				        return String.valueOf(one.getRecommendation()).compareTo(String.valueOf(other.getRecommendation()));
	    				    }
	    			 });
	    			 for(recommendation_type_lkp tempRecomm:lstrecommlkp){
	    				 lkpValues.put(tempRecomm.getRec_type_id()+"",tempRecomm.getRecommendation());
	    			 }
	    		 }else if(lkpTableName.equalsIgnoreCase("whp_flagship_species_lkp")){
	    			 List<flagship_species_lkp> lstflagshiplkp = flagship_species_lkpLocalServiceUtil.getAllFlagshipSpecies();
	    			 Collections.sort(lstflagshiplkp, new Comparator<flagship_species_lkp>(){
	    				    public int compare(flagship_species_lkp one, flagship_species_lkp other) {
	    				        return String.valueOf(one.getFlagship_species_name()).compareTo(String.valueOf(other.getFlagship_species_name()));
	    				    }
	    			 });
	    			 for(flagship_species_lkp tempflagship:lstflagshiplkp){
	    				 lkpValues.put(tempflagship.getFlagship_species_id()+"",tempflagship.getFlagship_species_name());
	    			 }
	    		 }else if(lkpTableName.equalsIgnoreCase("whp_country_lkp")){
	    			 List<country_lkp> lstcountrylkp = country_lkpLocalServiceUtil.getAllCountries();
	    			 Collections.sort(lstcountrylkp, new Comparator<country_lkp>(){
	    				 public int compare(country_lkp one, country_lkp other){
	    					 return String.valueOf(one.getName()).compareTo(String.valueOf(other.getName()));
	    				 }
	    			 });
	    			 for(country_lkp tempcountry_lkp : lstcountrylkp){
	    				 lkpValues.put(tempcountry_lkp.getCountryid()+"",tempcountry_lkp.getName());
	    				 //lkpValues.put(tempcountry_lkp.getName()+"",String.valueOf(tempcountry_lkp.getCountryid()));
	    			 }
	    		 }
	    	 }else if(objAdvance_query_site.getIsboolean().equalsIgnoreCase("y")){
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
    	List<Long> siteIdList=null;
    	if(whereClause!=null && whereClause.length>0){
    		
    		int fieldNo=whereClause.length;
        	
        	for(int i=0;i<fieldNo;i++){
        		try{
        		String[] fieldValues=whereClause[i].split(";;");
        		long id=Long.parseLong(fieldValues[0]);
        		String opt=fieldValues[1];
        		String value=fieldValues[2];
        		String operater=fieldValues[3];
        		        		
        		advance_query_site objAdvance_query_site= advance_query_siteLocalServiceUtil.getadvance_query_site(id);
        		
        		String sql="";
        		if(objAdvance_query_site!=null){
        			if(siteIdList==null){
        				siteIdList=new ArrayList<Long>();
        				sql=objAdvance_query_site.getCustom_sql();
        				sql=sql.replace("operatorVal=", opt);
        				if(opt.equalsIgnoreCase("like"))
        					sql=sql.replace("criteriaFieldVal", "'"+value+"%'");
        				else 
        					sql=sql.replace("criteriaFieldVal", "'"+value+"'");
        				System.out.println("sqlquery: "+sql);
        				/*	String customSql="select {whp_site_assessment.*} from whp_site_assessment ,whp_site_assessment_versions "+
        					"where whp_site_assessment.assessment_id=whp_site_assessment_versions.assessment_id "+
        					" and whp_site_assessment_versions.assessment_id in " +
        					" (select assessment_version_id from whp_assessing_threats_current where current_threat_id="+1+")";
        				*/	
        					List<whp_sites> site_infolst=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql,0,whp_sitesLocalServiceUtil.getwhp_sitesesCount());
        					 for(whp_sites tempsitelst:site_infolst){
        						 if(!siteIdList.contains(tempsitelst.getSite_id())){
        							 siteIdList.add(tempsitelst.getSite_id());
        						 }
        					 }
        			}
        			else{
        				
        				sql=objAdvance_query_site.getCustom_sql();
        				sql=sql.replace("operatorVal=", opt);
        				if(opt.equalsIgnoreCase("like"))
        					sql=sql.replace("criteriaFieldVal", "'%"+value+"%'");
        				else 
        					sql=sql.replace("criteriaFieldVal", "'"+value+"'");
        				System.out.println("sqlquery: "+sql);
        				List<whp_sites> site_infolst=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql,0,whp_sitesLocalServiceUtil.getwhp_sitesesCount());
        			
        				List<Long> tempSiteIdlst=new ArrayList<Long>();
        					 
        					 for(whp_sites tempsite:site_infolst){
        						 if(!tempSiteIdlst.contains(tempsite.getSite_id())){
        							 tempSiteIdlst.add(tempsite.getSite_id());
        						 }
        					 }
        					 
        					 if("or".equalsIgnoreCase(operater)){
        						 for(Long tempId:tempSiteIdlst){
            						 if(!siteIdList.contains(tempId)){
            							 siteIdList.add(tempId);
            						 }
            					 }
        					 }else if("AND".equalsIgnoreCase(operater)){
        						 List<Long> templst=new ArrayList<Long>() ;
            						 for(Long tempId:tempSiteIdlst){
                						 if(siteIdList.contains(tempId)){
                							 templst.add(tempId);
                						 }
                					 }
            						 siteIdList= templst;
            				 }
              			}
        		}
        		}catch(Exception e){
        			e.printStackTrace();
        		}
        		
        	}
    	}
    	return siteIdList;
    	
    	
    }
    
    

}
