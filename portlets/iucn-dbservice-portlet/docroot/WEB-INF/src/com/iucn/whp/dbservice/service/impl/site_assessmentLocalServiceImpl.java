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

package com.iucn.whp.dbservice.service.impl;

import java.util.List;

import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.assessing_threats_potential;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.biodiversity_values;
import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.current_state_trend;
import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.current_threat_values;
import com.iucn.whp.dbservice.model.potential_threat_assessment_cat;
import com.iucn.whp.dbservice.model.prot_mgmt_overall;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;
import com.iucn.whp.dbservice.model.potential_threat_values;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.state_lkp;
import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.threat_summary_current;
import com.iucn.whp.dbservice.model.threat_summary_overall;
import com.iucn.whp.dbservice.model.threat_summary_potential;
import com.iucn.whp.dbservice.model.trend_lkp;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.base.site_assessmentLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.site_assessmentFinderUtil;
import com.iucn.whp.dbservice.service.persistence.site_assessmentUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the site_assessment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.site_assessmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.site_assessmentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil
 */
public class site_assessmentLocalServiceImpl
	extends site_assessmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil} to access the site_assessment local service.
	 */
	public List<site_assessment> getAllActiveSiteAssessment(){
		
		List<site_assessment> site_assessmentList=null;
		try {
			site_assessmentList=site_assessmentPersistence.findByAllActiveSiteAssessment(false);
		} catch (SystemException e) {
			site_assessmentList=null;
			e.printStackTrace();
		}
		return site_assessmentList;
	}

	
	/*-----------------------Get States------------------*/
	public List<state_lkp> getAllStates()
	throws PortalException, SystemException {
	return state_lkpPersistence.findAll();
	}
	
	/*-----------------------Get Trends------------------*/
	public List<trend_lkp> getAllTrends()
	throws PortalException, SystemException {
	return trend_lkpPersistence.findAll();
	}
	
	/*-----------------------Get Biodiversity Values------------------*/
	public List<biodiversity_values> getBiodiversityValuesByVersion(long versionId)
	throws PortalException, SystemException {
	return biodiversity_valuesPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Current State Trends------------------*/
	public List<current_state_trend> getCurrent_state_trendByVersion(long versionId)
	throws PortalException, SystemException {
	return current_state_trendPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Threat Categories------------------*/
	public List<threat_categories_lkp> getAllThreatCategories()
	throws PortalException, SystemException {
	return threat_categories_lkpPersistence.findAll();
	}
	
	/*-----------------------Get Threat ratings------------------*/
	public List<threat_rating_lkp> getAllThreatRating()
	throws PortalException, SystemException {
	return threat_rating_lkpPersistence.findAll();
	}
	
	/*-----------------------Get Threat sub Categories------------------*/
	public List<threat_subcategories_lkp> getAllThreatSubCategories()
	throws PortalException, SystemException {
	return threat_subcategories_lkpPersistence.findAll();
	}
	
	/*-----------------------Get Assessment_whvalues------------------*/
	public List<assessment_whvalues> getAssessment_whvaluesByVersion(long versionId)
	throws PortalException, SystemException {
	return assessment_whvaluesPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get State_trend_biodivvals------------------*/
	public List<state_trend_biodivvals> getStatetrendbiodivvalsByVersion(long versionId)
	throws PortalException, SystemException {
	return state_trend_biodivvalsPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get State_trend_whvalues------------------*/
	public List<state_trend_whvalues> getState_trend_whvaluesByVersion(long versionId)
	throws PortalException, SystemException {
	return state_trend_whvaluesPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Current Threat------------------*/
	public List<assessing_threats_current> getAssessingThreatsCurrentByVersion(long versionId)
	throws PortalException, SystemException {
	return assessing_threats_currentPersistence.findByassesment_version_id(versionId);
	}
	
	/*-----------------------Get Potential Threat------------------*/
	public List<assessing_threats_potential> getAssessingThreatsPotentialByVersion(long versionId)
	throws PortalException, SystemException {
	return assessing_threats_potentialPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Current Threat Summary------------------*/
	public List<threat_summary_current> getThreatSummaryCurrentByVersion(long versionId)
	throws PortalException, SystemException {
	return threat_summary_currentPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get OverAll Threat Summary------------------*/
	public List<threat_summary_overall> getThreatSummaryOverallByVersion(long versionId)
	throws PortalException, SystemException {
	return threat_summary_overallPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Potential Threat Summary------------------*/
	public List<threat_summary_potential> getThreatSummaryPotentialByVersion(long versionId)
	throws PortalException, SystemException {
	return threat_summary_potentialPersistence.findByassessment_version_id(versionId);
	}
	
	/*-----------------------Get Current Threat Assessment Categories------------------*/
	public List<current_threat_assessment_cat> getCurrentThreatAssessmentCatByThreatId(long threat_id)
	throws PortalException, SystemException {
	return current_threat_assessment_catPersistence.findBycurrent_threat_id(threat_id);
	}
	
	/*-----------------------Get Potential Threat Assessment Categories------------------*/
	public List<potential_threat_assessment_cat> getPotentialThreatAssessmentCatByThreatId(long threat_id)
	throws PortalException, SystemException {
	return potential_threat_assessment_catPersistence.findBypotential_threat_id(threat_id);
	}
	
	/*-----------------------Get Potential Threat Values------------------*/
	public List<potential_threat_values> getPotentialThreatValuesByThreatId(long threat_id)
	throws PortalException, SystemException {
	return potential_threat_valuesPersistence.findBypotential_threat_id(threat_id);
	}
	
	/*-----------------------Get Current Threat Values------------------*/
	public List<current_threat_values> getCurrentlThreatValuesByThreatId(long threat_id)
	throws PortalException, SystemException {
	return current_threat_valuesPersistence.findBycurrent_threat_id(threat_id);
	}
	
	public List<site_assessment> getActiveAssessmentBySiteId(long siteid){
		
		List<site_assessment> site_assessmentList=null;
		try {
			site_assessmentList=site_assessmentUtil.findBywip_siteids(siteid);
		} catch (SystemException e) {
			site_assessmentList=null;
			e.printStackTrace();
		}
		return site_assessmentList;
	}
	
	public List<site_assessment> getActiveAssessmentByUserId(long current_userid){
		
		List<site_assessment> site_assessmentList=null;
		try {
			site_assessmentList=site_assessmentUtil.findBycurrentuserid(current_userid);
		} catch (SystemException e) {
			site_assessmentList=null;
			e.printStackTrace();
		}
		return site_assessmentList;
	}
	
	
	public long getPublishedSiteAssessmentEntry(long siteId) throws SystemException{
			
			long assessmentId = 0;
			List<site_assessment> lst_site_assessment = site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteId);
			for(site_assessment obj_site_assessment : lst_site_assessment){
				
				List<assessment_lang_version> lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.
				findByAssessmentId(obj_site_assessment.getAssessment_id());
				/*if(obj_site_assessment.getSite_id() == siteId){
					//if(obj_site_assessment.isPublished()){
						assessmentId = obj_site_assessment.getAssessment_id();
						break;
					//}
				}*/
				
				for(assessment_lang_version objassessment_lang_version:lstassessment_lang_version){
					if(objassessment_lang_version.getPublished()){
						assessmentId = obj_site_assessment.getAssessment_id();
						break;
					}
					
				}
			}
			return assessmentId;
		}
	
	
public List<site_assessment> getAllActiveSiteAssessment(String query, int begin,int end){
		
		List<site_assessment> site_assessmentList=null;
		try {
			site_assessmentList=site_assessmentFinderUtil.findSite_assessmentByCustomQuery(query, begin, end);
		} catch (SystemException e) {
			site_assessmentList=null;
			e.printStackTrace();
		}
		return site_assessmentList;
	}

public List<site_assessment> siteAssessmentByFlag(boolean active,boolean archived){
	
	List<site_assessment> site_assessmentList=null;
	try {
		site_assessmentList=site_assessmentUtil.findBysiteAssessmentByFlag(active, archived);
	} catch (SystemException e) {
		site_assessmentList=null;
		e.printStackTrace();
	}
	return site_assessmentList;
}
	
	

	

	
	
}