package com.iucn.whp.sites;
import java.util.*;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.portal.kernel.exception.SystemException;

public class utils {

	public static Map<String, Long> getLangVersionDetails(long siteid){
		
		long tempSiteID = siteid;
		Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
		List<assessment_lang_lkp> assessment_langLkpList;
		try {
			assessment_langLkpList = assessment_lang_lkpLocalServiceUtil.findAll();
			Map<Long, String> assessment_lang_lkpMap = new HashMap<Long, String>();
			for (assessment_lang_lkp objassessment_lang_lkp : assessment_langLkpList) {
					assessment_lang_lkpMap.put(
						objassessment_lang_lkp.getLanguageid(),
						objassessment_lang_lkp.getLanguagecode());
			}
			
			List<site_assessment> lst_site_assessment = new ArrayList<site_assessment>();
			
			if (tempSiteID != 0 || tempSiteID != -1) {
				lst_site_assessment = site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(tempSiteID);
				if (!lst_site_assessment.isEmpty()) {
					for(site_assessment obj_site_assessment:lst_site_assessment){
						if(!obj_site_assessment.isIs_active()){
							long assessmentId = obj_site_assessment.getAssessment_id();
							List<assessment_lang_version> assessment_lang_versionlist = assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);

							if (!assessment_lang_versionlist.isEmpty()) {
								for (assessment_lang_version objassessment_lang_version : assessment_lang_versionlist) {
									
										String lang = assessment_lang_lkpMap.get(objassessment_lang_version.getLanguageid());
										assessmntVersionLangMap.put(lang,objassessment_lang_version.getAssessment_version_id());
									
								}
							}
						}
						
					}
					//site_assessment obj_site_assessment = lst_site_assessment.get(0);
					
				}
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assessmntVersionLangMap;
	}
	
	//// new method created by Sonil ...
	
	public Map<String, Long> findLangVersionMap(long site_id){
		
		Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
		List<assessment_lang_lkp> assessment_langLkpList;
		try{
			assessment_langLkpList = assessment_lang_lkpLocalServiceUtil.findAll();
			Map<Long, String> assessment_lang_lkpMap = new HashMap<Long, String>();
			for (assessment_lang_lkp objassessment_lang_lkp : assessment_langLkpList) {
					assessment_lang_lkpMap.put(
						objassessment_lang_lkp.getLanguageid(),
						objassessment_lang_lkp.getLanguagecode());
			}
			List<site_assessment> lst_site_assessment = new ArrayList<site_assessment>();
			if (site_id != 0 || site_id != -1) {
				lst_site_assessment = site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(site_id);
				if (!lst_site_assessment.isEmpty()) {
					for(site_assessment obj_site_assessment : lst_site_assessment){
						if(!obj_site_assessment.isArchived()){
							
							break;
						}
					}
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return assessmntVersionLangMap;
	}
	
	
}
