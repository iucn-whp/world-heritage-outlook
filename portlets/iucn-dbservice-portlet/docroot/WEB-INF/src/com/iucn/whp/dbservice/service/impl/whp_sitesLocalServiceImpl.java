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

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.iucn.whp.dbservice.model.contact_category;
import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.docs_sitedata;
import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.iucn_region;
import com.iucn.whp.dbservice.model.unesco_region;
import com.iucn.whp.dbservice.model.unesco_region_country;
import com.iucn.whp.dbservice.model.whp_contact;
import com.iucn.whp.dbservice.model.whp_site_danger_list;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_boundary_modification;
import com.iucn.whp.dbservice.model.whp_sites_budget;
import com.iucn.whp.dbservice.model.whp_sites_component;
import com.iucn.whp.dbservice.model.whp_sites_contacts;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.model.whp_sites_dsocr;
import com.iucn.whp.dbservice.model.whp_sites_flagship_species;
import com.iucn.whp.dbservice.model.whp_sites_indigenous_communities;
import com.iucn.whp.dbservice.model.whp_sites_inscription_criteria;
import com.iucn.whp.dbservice.model.whp_sites_inscription_date;
import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;
import com.iucn.whp.dbservice.model.whp_sites_mee;
import com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state;
import com.iucn.whp.dbservice.model.whp_sites_mission;
import com.iucn.whp.dbservice.model.whp_sites_other_designations;
import com.iucn.whp.dbservice.model.whp_sites_soc_reports;
import com.iucn.whp.dbservice.model.whp_sites_soouv;
import com.iucn.whp.dbservice.model.whp_sites_visitors;
import com.iucn.whp.dbservice.service.base.whp_sitesLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.whp_sitesFinderUtil;
import com.liferay.portal.UserPortraitSizeException;
import com.liferay.portal.UserPortraitTypeException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.image.ImageBag;
import com.liferay.portal.kernel.image.ImageToolUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
//import com.liferay.portal.util.PropsValues;
import com.liferay.portlet.documentlibrary.ImageSizeException;


/**
 * The implementation of the whp_sites local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sitesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sitesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil
 */
public class whp_sitesLocalServiceImpl extends whp_sitesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil} to access the whp_sites local service.
	 */
	/**
	 * Returns the whp_site with the ID.
	 *
	 * @param  siteID the primary key of the Site
	 * @return the whp_sites with the SiteID
	 * @throws PortalException if a Site with the SiteID not found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites getSiteBySiteId(long siteId)
		throws PortalException, SystemException {

		return whp_sitesPersistence.findByPrimaryKey(siteId);
	}
	/**
	 * Returns the whp_site.
	 *
	 * @param  siteNameEn the name of the site in English
	 * @return the whp_sites with the Site Name
	 * @throws PortalException if a Site with the SiteID not found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites getSiteByNameEn(String siteNameEn)
	throws PortalException, SystemException {

	return whp_sitesPersistence.findBynameEn(siteNameEn);
}
	
	/**
	 * Returns the whp_site.
	 *
	 * @param  wdpaid of the site 
	 * @return the whp_sites with the WDPAID
	 * @throws PortalException if a Site with the WDPAID not found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites getSiteByWdpaId(long wdpaid)
	throws PortalException, SystemException {

	return whp_sitesPersistence.findBywdpaid(wdpaid);
}

	/**
	 * Returns the Countries associated with the siteID.
	 *
	 * @param  
	 * @return 
	 * @throws 
	 * @throws 
	 */
	public List<whp_sites_country> getSiteCountryBySiteId(long siteId)
		throws PortalException, SystemException {

		return whp_sitesPersistence.getwhp_sites_countries(siteId);
		
	}
	
	/**
	 * Returns the Countries associated with the siteID.
	 *
	 * @param  
	 * @return 
	 * @throws 
	 * @throws 
	 */	
	@SuppressWarnings("null")
	public List<country_lkp> getCountryListBySiteId(long siteId)
	throws PortalException, SystemException {
	List<country_lkp> countryLkp=new ArrayList<country_lkp>();
	List<whp_sites_country> siteCountries=getSiteCountryBySiteId(siteId);
	
	for (whp_sites_country siteCountry : siteCountries) {
		countryLkp.add(country_lkpPersistence.fetchByPrimaryKey(siteCountry.getCountryid()));
	}
		
	return countryLkp;
	
}
	public List<whp_sites_inscription_criteria> getWhpSitesInscriptionCriteriaBySiteId(long siteId)
	throws PortalException, SystemException {

	return whp_sitesPersistence.getwhp_sites_inscription_criterias(siteId);
	
	}

	public List<whp_sites_inscription_date> getWhpSitesInscriptionHistoryBySiteId(long siteId)
	throws PortalException, SystemException {

	return whp_sitesPersistence.getwhp_sites_inscription_dates(siteId);
	
	}
	/*********************************WHP Inscription criteria*********************************/
	@SuppressWarnings("null")
	public List<inscription_criteria_lkp> getInscriptionBySiteId(long siteId)
	throws PortalException, SystemException {
	
	List<inscription_criteria_lkp> objInscription_criteria_lkpp=new ArrayList<inscription_criteria_lkp>();
	
	List<whp_sites_inscription_criteria> sitesInscriptionCriterias=getWhpSitesInscriptionCriteriaBySiteId(siteId);
	
	for (whp_sites_inscription_criteria sitesInscriptionCriteria : sitesInscriptionCriterias) {
		objInscription_criteria_lkpp.add(inscription_criteria_lkpPersistence.fetchByPrimaryKey(sitesInscriptionCriteria.getCriteria_id()));
	}
		
	return objInscription_criteria_lkpp;
	
}
	/*********************************WHP Component*********************************/
	public List<whp_sites_component> getwhpSitesComponentBySiteId(long siteId)
	throws PortalException, SystemException {

	return whp_sitesPersistence.getwhp_sites_components(siteId);
	
	}
	/*********************************WHP Visitor*********************************/
	
	public List<whp_sites_visitors> getwhpSitesVisitorsBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_visitorses(siteId);
	
	}
	
	
/*********************************WHP Budget*********************************/
	
	public List<whp_sites_budget> getwhpSitesBudgetBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_budgets(siteId);
	
	}
	
/*********************************WHP Soouv*********************************/
	
	public List<whp_sites_soouv> getwhpSitesSoouvBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_soouvs(siteId);
	
	}
	
/*********************************WHP Dsocr*********************************/
	
	public List<whp_sites_dsocr> getwhpSitesDsocrBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_dsocrs(siteId);
	
	}	

/*********************************WHP indigenous_communities*********************************/
	
	public List<whp_sites_indigenous_communities> getwhpSitesIndigenousCommunitiesBySiteId1(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_indigenous_communitieses(siteId);
	
	}		
	
	/*********************************contact_category*********************************/	
	
	public contact_category getContactCategoryByCategoryId(int categoryId)
	throws PortalException, SystemException {
	return contact_categoryPersistence.fetchByPrimaryKey(categoryId);
	
	}
	
	
	/*********************************WHP_contact*********************************/	
	
	public List<whp_sites_contacts> getwhpSitesContactBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sitesPersistence.getwhp_sites_contactses(siteId);
	
	}
	
	
	public List<whp_contact> getWhpContactListBySiteId(long siteId)
			throws PortalException, SystemException {

		List<whp_contact> contacts = new ArrayList<whp_contact>();
		whp_contact contact = null;
		contact_category contactctg = null;
		List<whp_sites_contacts> siteContacts = getwhpSitesContactBySiteId(siteId);

		for (whp_sites_contacts siteContact : siteContacts) {

			contact = whp_contactPersistence.fetchByPrimaryKey(siteContact
					.getContactid());
			contactctg = getContactCategoryByCategoryId(contact.getCategoryid());
			contact.setContactCategory(contactctg);
			contacts.add(contact);
		}

		

		return contacts;

	}
	
	public iucn_region getIucnRegionCountry(int cntid)
	throws PortalException, SystemException {
		
		//List<iucn_region> iucnRegionLkp = new ArrayList<iucn_region>();
	
		iucn_region regionlkp = iucn_regionPersistence.fetchByPrimaryKey(iucn_region_countryPersistence.findBycountryid(cntid).getIucn_region_id());
		
		return regionlkp;
	}
	
	public List<iucn_region> getIucnRegionBySiteId(long siteId)
	throws PortalException, SystemException {
		
		List<country_lkp> lstcountry=getCountryListBySiteId(siteId);
		
		List<iucn_region> lstregion=new ArrayList<iucn_region>();
		
		for (country_lkp country : lstcountry) {
			
			lstregion.add(getIucnRegionCountry(country.getCountryid()));
		}
		
		return lstregion;
		
		
	}
	public whp_sites updateMGMT_PLANflag(long siteid,boolean flag){
		try {
			whp_sites sites_obj=whp_sitesPersistence.fetchByPrimaryKey(siteid);
			sites_obj.setManagement_plan(flag);
			return whp_sitesPersistence.update(sites_obj, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public whp_sites updatemissionflag(long siteid,boolean flag){
		try {
			whp_sites sites_obj=whp_sitesPersistence.fetchByPrimaryKey(siteid);
			sites_obj.setMissions(flag);
			return whp_sitesPersistence.update(sites_obj, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public whp_sites updatesocflag(long siteid,boolean flag){
		try {
			whp_sites sites_obj=whp_sitesPersistence.fetchByPrimaryKey(siteid);
			sites_obj.setSoc_reports(flag);
			return whp_sitesPersistence.update(sites_obj, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public whp_sites updatemeeflag(long siteid,boolean flag){
		try {
			whp_sites sites_obj=whp_sitesPersistence.fetchByPrimaryKey(siteid);
			sites_obj.setMee(flag);
			return whp_sitesPersistence.update(sites_obj, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public unesco_region getUnescoRegionCountry(int cntid)
	throws PortalException, SystemException {
		
		
		unesco_region unecoRegion= null;
		unesco_region_country unescoRegionCountry = null;
		try{
			unescoRegionCountry = unesco_region_countryPersistence.findBycountryid(cntid);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(unescoRegionCountry !=null)
			unecoRegion = unesco_regionPersistence.fetchByPrimaryKey(unescoRegionCountry.getUnesco_region_id());
		
		return unecoRegion;
	}
	
	
	public List<unesco_region> getUnescoRegionBySiteId(long siteId)
	throws PortalException, SystemException {
		
		List<country_lkp> lstcountry=getCountryListBySiteId(siteId);
		
		List<unesco_region> lstUnescoRegion=new ArrayList<unesco_region>();
		
		for (country_lkp country : lstcountry) {
			
			if(getUnescoRegionCountry(country.getCountryid())!=null)
					lstUnescoRegion.add(getUnescoRegionCountry(country.getCountryid()));
		}
		
		return lstUnescoRegion;
		
		
	}

	public List<whp_sites> getAllActiveSites() throws PortalException,
			SystemException {

		return whp_sitesPersistence.findByactiveSites(true);
	}
	
/*********************************WHP_DANGER LIST*********************************/
	
	public List<whp_site_danger_list> getWhpSiteDangerListBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_site_danger_listPersistence.findBysite_id(siteId);
	
	}		
	
	
/*********************************WHP_IUCN RECOMANDATION*********************************/
	
	public List<whp_sites_iucn_recommendation> getWhpSiterecommendationListBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_iucn_recommendationPersistence.findBysiteId(siteId);
	}
	
/*********************************WHP_IUCN Boundry*********************************/
	
	public List<whp_sites_boundary_modification> getWhpSiteBoundaryModificationBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_boundary_modificationPersistence.findBySiteId(siteId);	
	}
	
/*********************************WHP_IUCN FlagshipSpecies*********************************/
	
	public List<whp_sites_flagship_species> getWhpSiteFlagshipSpeciesBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_flagship_speciesPersistence.findBySiteID(siteId);
	}	
	
/*********************************WHP_IUCN PA CATEGORY*********************************/
	
	public List<whp_sites_iucn_pa_category> getWhpSiteIUCNPACategoryBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_iucn_pa_categoryPersistence.findBySiteId(siteId);
	}
	
	
/*********************************WHP_IUCN OTHER DESIGNATIOM*********************************/
	
	public List<whp_sites_other_designations> getWhpSiteOtherDesignationsBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_other_designationsPersistence.findBySiteId(siteId);
	}
		
/*********************************mgmt*********************************/
		
	public List<whp_sites_mgmt_plan_state> getWhpSiteMgmtPlanStatesBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_mgmt_plan_statePersistence.findBySiteId(siteId);
	}
	
	/*********************************Mission*********************************/
	
	public List<whp_sites_mission> getWhpSiteMissionBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_missionPersistence.findBySiteId(siteId);
	}
	
/*********************************Mee*********************************/
	
	public List<whp_sites_mee> getWhpSiteMeeBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_meePersistence.findBySiteId(siteId);
	}
/*********************************Soc Reports*********************************/
	
	public List<whp_sites_soc_reports> getWhpSiteSocReportsBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_soc_reportsPersistence.findBySiteId(siteId);
	}
	
/*********************************OtherDocs*********************************/
	
	public List<docs_sitedata> getDocs_SiteDataBySiteId(long siteId)
	throws PortalException, SystemException {
	return docs_sitedataPersistence.findBysiteid(siteId);
	}
	
	/**
	 * Updates the site's thumbnail image.
	 *
	 * @param  thumbnailId the primary key of the user
	 * @param  bytes the new thumbnail image data
	 * @return the site
	 * @throws PortalException if a site with the primary key could not be found
	 *         or if the new thumbnail was invalid
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites updateThumbnail(long siteId, byte[] bytes)
		throws PortalException, SystemException {

		whp_sites site = whp_sitesPersistence.findByPrimaryKey(siteId); 

		/*long imageMaxSize = PrefsPropsUtil.getLong(
			PropsKeys.USERS_IMAGE_MAX_SIZE);

		if ((imageMaxSize > 0) &&
			((bytes == null) || (bytes.length > imageMaxSize))) {

			throw new UserPortraitSizeException();
		}

		long thumbnailId = site.getThumbnailid();

		if (thumbnailId <= 0) {
			thumbnailId = counterLocalService.increment();

			site.setThumbnailid(thumbnailId);
		}

		try {
			ImageBag imageBag = ImageToolUtil.read(bytes);

			RenderedImage renderedImage = imageBag.getRenderedImage();

			if (renderedImage == null) {
				throw new UserPortraitTypeException();
			}

			renderedImage = ImageToolUtil.scale(
				renderedImage, PropsValues.USERS_IMAGE_MAX_HEIGHT,
				PropsValues.USERS_IMAGE_MAX_WIDTH);

			String contentType = imageBag.getType();

			imageLocalService.updateImage(
				thumbnailId,
				ImageToolUtil.getBytes(renderedImage, contentType));
		}
		catch (IOException ioe) {
			throw new ImageSizeException(ioe);
		}

		whp_sitesPersistence.update(site, false);*/
		
		return site;
	}
	/**
	 * Deletes the user's portrait image.
	 *
	 * @param  userId the primary key of the user
	 * @throws PortalException if a user with the primary key could not be found
	 *         or if the user's portrait could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteThumbnail(long siteId)
		throws PortalException, SystemException {

		whp_sites site = whp_sitesPersistence.findByPrimaryKey(siteId); 
		//User user = userPersistence.findByPrimaryKey(userId);

		long thumbnailId = site.getThumbnailid();

		if (thumbnailId > 0) {
			site.setThumbnailid(0);

			whp_sitesPersistence.update(site, false);

			imageLocalService.deleteImage(thumbnailId);
		}
	}
	
	
	public List<whp_sites> getWhp_sitesByCustomQuery(String query, int start,
			int end) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return whp_sitesFinderUtil.findByCustomQuery(query,start,end);
	}
	

}