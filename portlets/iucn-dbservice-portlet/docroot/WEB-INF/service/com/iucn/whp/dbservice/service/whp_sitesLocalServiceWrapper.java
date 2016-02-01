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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link whp_sitesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sitesLocalService
 * @generated
 */
public class whp_sitesLocalServiceWrapper implements whp_sitesLocalService,
	ServiceWrapper<whp_sitesLocalService> {
	public whp_sitesLocalServiceWrapper(
		whp_sitesLocalService whp_sitesLocalService) {
		_whp_sitesLocalService = whp_sitesLocalService;
	}

	/**
	* Adds the whp_sites to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites addwhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.addwhp_sites(whp_sites);
	}

	/**
	* Creates a new whp_sites with the primary key. Does not add the whp_sites to the database.
	*
	* @param site_id the primary key for the new whp_sites
	* @return the new whp_sites
	*/
	public com.iucn.whp.dbservice.model.whp_sites createwhp_sites(long site_id) {
		return _whp_sitesLocalService.createwhp_sites(site_id);
	}

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
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.deletewhp_sites(site_id);
	}

	/**
	* Deletes the whp_sites from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites deletewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.deletewhp_sites(whp_sites);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sitesLocalService.dynamicQuery();
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.dynamicQuery(dynamicQuery);
	}

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
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites fetchwhp_sites(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.fetchwhp_sites(site_id);
	}

	/**
	* Returns the whp_sites with the primary key.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites
	* @throws PortalException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites getwhp_sites(long site_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhp_sites(site_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getwhp_siteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhp_siteses(start, end);
	}

	/**
	* Returns the number of whp_siteses.
	*
	* @return the number of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sitesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhp_sitesesCount();
	}

	/**
	* Updates the whp_sites in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites updatewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.updatewhp_sites(whp_sites);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.updatewhp_sites(whp_sites, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sitesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sitesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sitesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the whp_site with the ID.
	*
	* @param siteID the primary key of the Site
	* @return the whp_sites with the SiteID
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites getSiteBySiteId(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getSiteBySiteId(siteId);
	}

	/**
	* Returns the whp_site.
	*
	* @param siteNameEn the name of the site in English
	* @return the whp_sites with the Site Name
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites getSiteByNameEn(
		java.lang.String siteNameEn)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getSiteByNameEn(siteNameEn);
	}

	/**
	* Returns the whp_site.
	*
	* @param wdpaid of the site
	* @return the whp_sites with the WDPAID
	* @throws PortalException if a Site with the WDPAID not found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites getSiteByWdpaId(long wdpaid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getSiteByWdpaId(wdpaid);
	}

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getSiteCountryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getSiteCountryBySiteId(siteId);
	}

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> getCountryListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getCountryListBySiteId(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getWhpSitesInscriptionCriteriaBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSitesInscriptionCriteriaBySiteId(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getWhpSitesInscriptionHistoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSitesInscriptionHistoryBySiteId(siteId);
	}

	/**
	* WHP Inscription criteria
	*/
	public java.util.List<com.iucn.whp.dbservice.model.inscription_criteria_lkp> getInscriptionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getInscriptionBySiteId(siteId);
	}

	/**
	* WHP Component***********
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhpSitesComponentBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesComponentBySiteId(siteId);
	}

	/**
	* WHP Visitor*************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhpSitesVisitorsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesVisitorsBySiteId(siteId);
	}

	/**
	* WHP Budget**************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhpSitesBudgetBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesBudgetBySiteId(siteId);
	}

	/**
	* WHP Soouv***************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhpSitesSoouvBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesSoouvBySiteId(siteId);
	}

	/**
	* WHP Dsocr***************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhpSitesDsocrBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesDsocrBySiteId(siteId);
	}

	/**
	* WHP indigenous_communities********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhpSitesIndigenousCommunitiesBySiteId1(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesIndigenousCommunitiesBySiteId1(siteId);
	}

	/**
	* contact_category*******************************
	*/
	public com.iucn.whp.dbservice.model.contact_category getContactCategoryByCategoryId(
		int categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getContactCategoryByCategoryId(categoryId);
	}

	/**
	* WHP_contact********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhpSitesContactBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getwhpSitesContactBySiteId(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_contact> getWhpContactListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpContactListBySiteId(siteId);
	}

	public com.iucn.whp.dbservice.model.iucn_region getIucnRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getIucnRegionCountry(cntid);
	}

	public java.util.List<com.iucn.whp.dbservice.model.iucn_region> getIucnRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getIucnRegionBySiteId(siteId);
	}

	public com.iucn.whp.dbservice.model.whp_sites updateMGMT_PLANflag(
		long siteid, boolean flag) {
		return _whp_sitesLocalService.updateMGMT_PLANflag(siteid, flag);
	}

	public com.iucn.whp.dbservice.model.whp_sites updatemissionflag(
		long siteid, boolean flag) {
		return _whp_sitesLocalService.updatemissionflag(siteid, flag);
	}

	public com.iucn.whp.dbservice.model.whp_sites updatesocflag(long siteid,
		boolean flag) {
		return _whp_sitesLocalService.updatesocflag(siteid, flag);
	}

	public com.iucn.whp.dbservice.model.whp_sites updatemeeflag(long siteid,
		boolean flag) {
		return _whp_sitesLocalService.updatemeeflag(siteid, flag);
	}

	public com.iucn.whp.dbservice.model.unesco_region getUnescoRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getUnescoRegionCountry(cntid);
	}

	public java.util.List<com.iucn.whp.dbservice.model.unesco_region> getUnescoRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getUnescoRegionBySiteId(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getAllActiveSites()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getAllActiveSites();
	}

	/**
	* WHP_DANGER LIST********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getWhpSiteDangerListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteDangerListBySiteId(siteId);
	}

	/**
	* WHP_IUCN RECOMANDATION****************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getWhpSiterecommendationListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiterecommendationListBySiteId(siteId);
	}

	/**
	* WHP_IUCN Boundry*******************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getWhpSiteBoundaryModificationBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteBoundaryModificationBySiteId(siteId);
	}

	/**
	* WHP_IUCN FlagshipSpecies********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getWhpSiteFlagshipSpeciesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteFlagshipSpeciesBySiteId(siteId);
	}

	/**
	* WHP_IUCN PA CATEGORY******************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getWhpSiteIUCNPACategoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteIUCNPACategoryBySiteId(siteId);
	}

	/**
	* WHP_IUCN OTHER DESIGNATIOM********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getWhpSiteOtherDesignationsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteOtherDesignationsBySiteId(siteId);
	}

	/**
	* mgmt**********************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getWhpSiteMgmtPlanStatesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteMgmtPlanStatesBySiteId(siteId);
	}

	/**
	* Mission*******************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getWhpSiteMissionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteMissionBySiteId(siteId);
	}

	/**
	* Mee***********************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getWhpSiteMeeBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteMeeBySiteId(siteId);
	}

	/**
	* Soc Reports********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getWhpSiteSocReportsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhpSiteSocReportsBySiteId(siteId);
	}

	/**
	* OtherDocs********************************
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> getDocs_SiteDataBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getDocs_SiteDataBySiteId(siteId);
	}

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
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.updateThumbnail(siteId, bytes);
	}

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
			com.liferay.portal.kernel.exception.SystemException {
		_whp_sitesLocalService.deleteThumbnail(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> getWhp_sitesByCustomQuery(
		java.lang.String query, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sitesLocalService.getWhp_sitesByCustomQuery(query, start,
			end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sitesLocalService getWrappedwhp_sitesLocalService() {
		return _whp_sitesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sitesLocalService(
		whp_sitesLocalService whp_sitesLocalService) {
		_whp_sitesLocalService = whp_sitesLocalService;
	}

	public whp_sitesLocalService getWrappedService() {
		return _whp_sitesLocalService;
	}

	public void setWrappedService(whp_sitesLocalService whp_sitesLocalService) {
		_whp_sitesLocalService = whp_sitesLocalService;
	}

	private whp_sitesLocalService _whp_sitesLocalService;
}