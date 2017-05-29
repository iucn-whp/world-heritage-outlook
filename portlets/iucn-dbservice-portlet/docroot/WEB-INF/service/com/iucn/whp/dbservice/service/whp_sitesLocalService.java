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

package com.iucn.whp.dbservice.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the whp_sites local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_sitesLocalServiceUtil
 * @see com.iucn.whp.dbservice.service.base.whp_sitesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sitesLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface whp_sitesLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sitesLocalServiceUtil} to access the whp_sites local service. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sitesLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the whp_sites to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites addwhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new whp_sites with the primary key. Does not add the whp_sites to the database.
	*
	* @param site_id the primary key for the new whp_sites
	* @return the new whp_sites
	*/
	public com.iucn.whp.dbservice.model.whp_sites createwhp_sites(long site_id);

	/**
	* Deletes the whp_sites with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites that was removed
	* @throws PortalException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites deletewhp_sites(long site_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the whp_sites from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites deletewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.whp_sites fetchwhp_sites(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites with the primary key.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites
	* @throws PortalException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.whp_sites getwhp_sites(long site_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_siteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getwhp_siteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses.
	*
	* @return the number of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getwhp_sitesesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the whp_sites in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites updatewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the whp_sites in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @param merge whether to merge the whp_sites with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites updatewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* Returns the whp_site with the ID.
	*
	* @param siteID the primary key of the Site
	* @return the whp_sites with the SiteID
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.whp_sites getSiteBySiteId(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site.
	*
	* @param siteNameEn the name of the site in English
	* @return the whp_sites with the Site Name
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.whp_sites getSiteByNameEn(
		java.lang.String siteNameEn)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site.
	*
	* @param wdpaid of the site
	* @return the whp_sites with the WDPAID
	* @throws PortalException if a Site with the WDPAID not found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.whp_sites getSiteByWdpaId(long wdpaid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getSiteCountryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> getCountryListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getWhpSitesInscriptionCriteriaBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getWhpSitesInscriptionHistoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Inscription criteria
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.inscription_criteria_lkp> getInscriptionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Component***********
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhpSitesComponentBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Visitor*************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhpSitesVisitorsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Budget**************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhpSitesBudgetBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Soouv***************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhpSitesSoouvBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP Dsocr***************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhpSitesDsocrBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP indigenous_communities********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhpSitesIndigenousCommunitiesBySiteId1(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* contact_category*******************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.contact_category getContactCategoryByCategoryId(
		int categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_contact********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhpSitesContactBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_contact> getWhpContactListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.iucn_region getIucnRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.iucn_region> getIucnRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites updateMGMT_PLANflag(
		long siteid, boolean flag);

	public com.iucn.whp.dbservice.model.whp_sites updatemissionflag(
		long siteid, boolean flag);

	public com.iucn.whp.dbservice.model.whp_sites updatesocflag(long siteid,
		boolean flag);

	public com.iucn.whp.dbservice.model.whp_sites updatemeeflag(long siteid,
		boolean flag);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.unesco_region getUnescoRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region> getUnescoRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getAllActiveSites()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getAllActiveSitesByUserId(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_DANGER LIST********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getWhpSiteDangerListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_IUCN RECOMANDATION****************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getWhpSiterecommendationListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_IUCN Boundry*******************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getWhpSiteBoundaryModificationBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_IUCN FlagshipSpecies********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getWhpSiteFlagshipSpeciesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_IUCN PA CATEGORY******************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getWhpSiteIUCNPACategoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* WHP_IUCN OTHER DESIGNATIOM********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getWhpSiteOtherDesignationsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* mgmt**********************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getWhpSiteMgmtPlanStatesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Mission*******************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getWhpSiteMissionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Mee***********************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getWhpSiteMeeBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Soc Reports********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getWhpSiteSocReportsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* OtherDocs********************************
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> getDocs_SiteDataBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the site's thumbnail image.
	*
	* @param thumbnailId the primary key of the user
	* @param bytes the new thumbnail image data
	* @return the site
	* @throws PortalException if a site with the primary key could not be found
	or if the new thumbnail was invalid
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites updateThumbnail(long siteId,
		byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the user's portrait image.
	*
	* @param userId the primary key of the user
	* @throws PortalException if a user with the primary key could not be found
	or if the user's portrait could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteThumbnail(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getWhp_sitesByCustomQuery(
		java.lang.String query, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}