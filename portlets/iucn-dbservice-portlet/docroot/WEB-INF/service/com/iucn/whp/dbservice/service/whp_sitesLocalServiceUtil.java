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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the whp_sites local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_sitesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_sitesLocalService
 * @see com.iucn.whp.dbservice.service.base.whp_sitesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sitesLocalServiceImpl
 * @generated
 */
public class whp_sitesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sitesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the whp_sites to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites addwhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addwhp_sites(whp_sites);
	}

	/**
	* Creates a new whp_sites with the primary key. Does not add the whp_sites to the database.
	*
	* @param site_id the primary key for the new whp_sites
	* @return the new whp_sites
	*/
	public static com.iucn.whp.dbservice.model.whp_sites createwhp_sites(
		long site_id) {
		return getService().createwhp_sites(site_id);
	}

	/**
	* Deletes the whp_sites with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites that was removed
	* @throws PortalException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites deletewhp_sites(
		long site_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites(site_id);
	}

	/**
	* Deletes the whp_sites from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites deletewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites(whp_sites);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.iucn.whp.dbservice.model.whp_sites fetchwhp_sites(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchwhp_sites(site_id);
	}

	/**
	* Returns the whp_sites with the primary key.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites
	* @throws PortalException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites getwhp_sites(
		long site_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites(site_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> getwhp_siteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_siteses(start, end);
	}

	/**
	* Returns the number of whp_siteses.
	*
	* @return the number of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public static int getwhp_sitesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sitesesCount();
	}

	/**
	* Updates the whp_sites in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @return the whp_sites that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites updatewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites(whp_sites);
	}

	/**
	* Updates the whp_sites in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites the whp_sites
	* @param merge whether to merge the whp_sites with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites updatewhp_sites(
		com.iucn.whp.dbservice.model.whp_sites whp_sites, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites(whp_sites, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the whp_site with the ID.
	*
	* @param siteID the primary key of the Site
	* @return the whp_sites with the SiteID
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites getSiteBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSiteBySiteId(siteId);
	}

	/**
	* Returns the whp_site.
	*
	* @param siteNameEn the name of the site in English
	* @return the whp_sites with the Site Name
	* @throws PortalException if a Site with the SiteID not found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites getSiteByNameEn(
		java.lang.String siteNameEn)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSiteByNameEn(siteNameEn);
	}

	/**
	* Returns the whp_site.
	*
	* @param wdpaid of the site
	* @return the whp_sites with the WDPAID
	* @throws PortalException if a Site with the WDPAID not found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites getSiteByWdpaId(
		long wdpaid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSiteByWdpaId(wdpaid);
	}

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getSiteCountryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSiteCountryBySiteId(siteId);
	}

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.country_lkp> getCountryListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCountryListBySiteId(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getWhpSitesInscriptionCriteriaBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSitesInscriptionCriteriaBySiteId(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getWhpSitesInscriptionHistoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSitesInscriptionHistoryBySiteId(siteId);
	}

	/**
	* WHP Inscription criteria
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.inscription_criteria_lkp> getInscriptionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getInscriptionBySiteId(siteId);
	}

	/**
	* WHP Component***********
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhpSitesComponentBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesComponentBySiteId(siteId);
	}

	/**
	* WHP Visitor*************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhpSitesVisitorsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesVisitorsBySiteId(siteId);
	}

	/**
	* WHP Budget**************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhpSitesBudgetBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesBudgetBySiteId(siteId);
	}

	/**
	* WHP Soouv***************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhpSitesSoouvBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesSoouvBySiteId(siteId);
	}

	/**
	* WHP Dsocr***************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhpSitesDsocrBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesDsocrBySiteId(siteId);
	}

	/**
	* WHP indigenous_communities********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhpSitesIndigenousCommunitiesBySiteId1(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesIndigenousCommunitiesBySiteId1(siteId);
	}

	/**
	* contact_category*******************************
	*/
	public static com.iucn.whp.dbservice.model.contact_category getContactCategoryByCategoryId(
		int categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getContactCategoryByCategoryId(categoryId);
	}

	/**
	* WHP_contact********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhpSitesContactBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhpSitesContactBySiteId(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> getWhpContactListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpContactListBySiteId(siteId);
	}

	public static com.iucn.whp.dbservice.model.iucn_region getIucnRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIucnRegionCountry(cntid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> getIucnRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIucnRegionBySiteId(siteId);
	}

	public static com.iucn.whp.dbservice.model.whp_sites updateMGMT_PLANflag(
		long siteid, boolean flag) {
		return getService().updateMGMT_PLANflag(siteid, flag);
	}

	public static com.iucn.whp.dbservice.model.whp_sites updatemissionflag(
		long siteid, boolean flag) {
		return getService().updatemissionflag(siteid, flag);
	}

	public static com.iucn.whp.dbservice.model.whp_sites updatesocflag(
		long siteid, boolean flag) {
		return getService().updatesocflag(siteid, flag);
	}

	public static com.iucn.whp.dbservice.model.whp_sites updatemeeflag(
		long siteid, boolean flag) {
		return getService().updatemeeflag(siteid, flag);
	}

	public static com.iucn.whp.dbservice.model.unesco_region getUnescoRegionCountry(
		int cntid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUnescoRegionCountry(cntid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region> getUnescoRegionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUnescoRegionBySiteId(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> getAllActiveSites()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllActiveSites();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> getAllActiveSitesByUserId(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllActiveSitesByUserId(id);
	}

	/**
	* WHP_DANGER LIST********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getWhpSiteDangerListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteDangerListBySiteId(siteId);
	}

	/**
	* WHP_IUCN RECOMANDATION****************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getWhpSiterecommendationListBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiterecommendationListBySiteId(siteId);
	}

	/**
	* WHP_IUCN Boundry*******************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getWhpSiteBoundaryModificationBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteBoundaryModificationBySiteId(siteId);
	}

	/**
	* WHP_IUCN FlagshipSpecies********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getWhpSiteFlagshipSpeciesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteFlagshipSpeciesBySiteId(siteId);
	}

	/**
	* WHP_IUCN PA CATEGORY******************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getWhpSiteIUCNPACategoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteIUCNPACategoryBySiteId(siteId);
	}

	/**
	* WHP_IUCN OTHER DESIGNATIOM********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getWhpSiteOtherDesignationsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteOtherDesignationsBySiteId(siteId);
	}

	/**
	* mgmt**********************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getWhpSiteMgmtPlanStatesBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteMgmtPlanStatesBySiteId(siteId);
	}

	/**
	* Mission*******************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getWhpSiteMissionBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteMissionBySiteId(siteId);
	}

	/**
	* Mee***********************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getWhpSiteMeeBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteMeeBySiteId(siteId);
	}

	/**
	* Soc Reports********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getWhpSiteSocReportsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteSocReportsBySiteId(siteId);
	}

	/**
	* OtherDocs********************************
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> getDocs_SiteDataBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocs_SiteDataBySiteId(siteId);
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
	public static com.iucn.whp.dbservice.model.whp_sites updateThumbnail(
		long siteId, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateThumbnail(siteId, bytes);
	}

	/**
	* Deletes the user's portrait image.
	*
	* @param userId the primary key of the user
	* @throws PortalException if a user with the primary key could not be found
	or if the user's portrait could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteThumbnail(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteThumbnail(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> getWhp_sitesByCustomQuery(
		java.lang.String query, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhp_sitesByCustomQuery(query, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_sitesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_sitesLocalService.class.getName());

			if (invokableLocalService instanceof whp_sitesLocalService) {
				_service = (whp_sitesLocalService)invokableLocalService;
			}
			else {
				_service = new whp_sitesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(whp_sitesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_sitesLocalService service) {
	}

	private static whp_sitesLocalService _service;
}