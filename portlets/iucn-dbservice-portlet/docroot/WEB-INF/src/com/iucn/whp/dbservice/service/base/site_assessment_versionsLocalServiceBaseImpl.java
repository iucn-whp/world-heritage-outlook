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

package com.iucn.whp.dbservice.service.base;

import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.service.active_conservation_projectsLocalService;
import com.iucn.whp.dbservice.service.advance_query_assessmentLocalService;
import com.iucn.whp.dbservice.service.advance_query_siteLocalService;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalService;
import com.iucn.whp.dbservice.service.assessing_threats_potentialLocalService;
import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalService;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalService;
import com.iucn.whp.dbservice.service.assessment_stagesLocalService;
import com.iucn.whp.dbservice.service.assessment_statusLocalService;
import com.iucn.whp.dbservice.service.assessment_validationLocalService;
import com.iucn.whp.dbservice.service.assessment_whvaluesLocalService;
import com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalService;
import com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalService;
import com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalService;
import com.iucn.whp.dbservice.service.benefit_rating_lkpLocalService;
import com.iucn.whp.dbservice.service.benefitsLocalService;
import com.iucn.whp.dbservice.service.benefits_summaryLocalService;
import com.iucn.whp.dbservice.service.benefits_type_refLocalService;
import com.iucn.whp.dbservice.service.biodiversity_valuesLocalService;
import com.iucn.whp.dbservice.service.boundary_modification_type_lkpLocalService;
import com.iucn.whp.dbservice.service.conservation_outlookLocalService;
import com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalService;
import com.iucn.whp.dbservice.service.contact_categoryLocalService;
import com.iucn.whp.dbservice.service.country_lkpLocalService;
import com.iucn.whp.dbservice.service.current_state_trendLocalService;
import com.iucn.whp.dbservice.service.current_state_trend_valuesLocalService;
import com.iucn.whp.dbservice.service.current_threat_assessment_catLocalService;
import com.iucn.whp.dbservice.service.current_threat_valuesLocalService;
import com.iucn.whp.dbservice.service.danger_list_status_lkpLocalService;
import com.iucn.whp.dbservice.service.docs_customDataLocalService;
import com.iucn.whp.dbservice.service.docs_sitedataLocalService;
import com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalService;
import com.iucn.whp.dbservice.service.flagship_species_lkpLocalService;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalService;
import com.iucn.whp.dbservice.service.inscription_type_lkpLocalService;
import com.iucn.whp.dbservice.service.iucn_pa_lkp_categoryLocalService;
import com.iucn.whp.dbservice.service.iucn_regionLocalService;
import com.iucn.whp.dbservice.service.iucn_region_countryLocalService;
import com.iucn.whp.dbservice.service.key_conservation_issuesLocalService;
import com.iucn.whp.dbservice.service.key_conservation_scale_lkpLocalService;
import com.iucn.whp.dbservice.service.mission_lkpLocalService;
import com.iucn.whp.dbservice.service.negative_factors_level_impactLocalService;
import com.iucn.whp.dbservice.service.negative_factors_trendLocalService;
import com.iucn.whp.dbservice.service.other_designation_lkpLocalService;
import com.iucn.whp.dbservice.service.persistence.active_conservation_projectsPersistence;
import com.iucn.whp.dbservice.service.persistence.advance_query_assessmentPersistence;
import com.iucn.whp.dbservice.service.persistence.advance_query_sitePersistence;
import com.iucn.whp.dbservice.service.persistence.assessing_threats_currentPersistence;
import com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_lang_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_lang_versionPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_stagesPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_statusPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_validationPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_whvaluesPersistence;
import com.iucn.whp.dbservice.service.persistence.assessment_whvalues_whcriterionPersistence;
import com.iucn.whp.dbservice.service.persistence.benefit_checksubtype_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.benefit_checktype_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.benefit_rating_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.benefitsPersistence;
import com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistence;
import com.iucn.whp.dbservice.service.persistence.benefits_type_refPersistence;
import com.iucn.whp.dbservice.service.persistence.biodiversity_valuesPersistence;
import com.iucn.whp.dbservice.service.persistence.boundary_modification_type_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistence;
import com.iucn.whp.dbservice.service.persistence.conservation_outlook_rating_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.contact_categoryPersistence;
import com.iucn.whp.dbservice.service.persistence.country_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.current_state_trendPersistence;
import com.iucn.whp.dbservice.service.persistence.current_state_trend_valuesPersistence;
import com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catPersistence;
import com.iucn.whp.dbservice.service.persistence.current_threat_valuesPersistence;
import com.iucn.whp.dbservice.service.persistence.danger_list_status_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.docs_customDataFinder;
import com.iucn.whp.dbservice.service.persistence.docs_customDataPersistence;
import com.iucn.whp.dbservice.service.persistence.docs_sitedataPersistence;
import com.iucn.whp.dbservice.service.persistence.effective_prot_mgmt_iothreatsPersistence;
import com.iucn.whp.dbservice.service.persistence.flagship_species_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.inscription_criteria_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.inscription_type_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.iucn_pa_lkp_categoryPersistence;
import com.iucn.whp.dbservice.service.persistence.iucn_regionPersistence;
import com.iucn.whp.dbservice.service.persistence.iucn_region_countryPersistence;
import com.iucn.whp.dbservice.service.persistence.key_conservation_issuesPersistence;
import com.iucn.whp.dbservice.service.persistence.key_conservation_scale_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.mission_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.negative_factors_level_impactPersistence;
import com.iucn.whp.dbservice.service.persistence.negative_factors_trendPersistence;
import com.iucn.whp.dbservice.service.persistence.other_designation_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.potential_project_needsPersistence;
import com.iucn.whp.dbservice.service.persistence.potential_threat_assessment_catPersistence;
import com.iucn.whp.dbservice.service.persistence.potential_threat_valuesPersistence;
import com.iucn.whp.dbservice.service.persistence.prot_mgmt_best_practicesPersistence;
import com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistence;
import com.iucn.whp.dbservice.service.persistence.protection_managementPersistence;
import com.iucn.whp.dbservice.service.persistence.protection_management_ratings_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.protection_mgmt_checklist_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.recommendation_type_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.referencesPersistence;
import com.iucn.whp.dbservice.service.persistence.reinforced_monitoringPersistence;
import com.iucn.whp.dbservice.service.persistence.site_assessmentFinder;
import com.iucn.whp.dbservice.service.persistence.site_assessmentPersistence;
import com.iucn.whp.dbservice.service.persistence.site_assessment_versionsFinder;
import com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistence;
import com.iucn.whp.dbservice.service.persistence.sites_thematicPersistence;
import com.iucn.whp.dbservice.service.persistence.state_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsPersistence;
import com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesPersistence;
import com.iucn.whp.dbservice.service.persistence.thematic_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_categories_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_rating_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_subcategories_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_summary_currentPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_summary_overallPersistence;
import com.iucn.whp.dbservice.service.persistence.threat_summary_potentialPersistence;
import com.iucn.whp.dbservice.service.persistence.trend_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.unesco_regionPersistence;
import com.iucn.whp.dbservice.service.persistence.unesco_region_countryPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_contactPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_criteria_lkpPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_site_danger_listPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sitesFinder;
import com.iucn.whp.dbservice.service.persistence.whp_sitesPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_boundary_modificationPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_budgetPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_componentPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_contactsPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_countryPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_dsocrPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_external_documentsPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_flagship_speciesPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_indigenous_communitiesPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_criteriaPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_datePersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_pa_categoryPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_recommendationPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_meePersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_mgmt_plan_statePersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_missionPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_other_designationsPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_soc_reportsPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_soouvPersistence;
import com.iucn.whp.dbservice.service.persistence.whp_sites_visitorsPersistence;
import com.iucn.whp.dbservice.service.potential_project_needsLocalService;
import com.iucn.whp.dbservice.service.potential_threat_assessment_catLocalService;
import com.iucn.whp.dbservice.service.potential_threat_valuesLocalService;
import com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalService;
import com.iucn.whp.dbservice.service.prot_mgmt_overallLocalService;
import com.iucn.whp.dbservice.service.protection_managementLocalService;
import com.iucn.whp.dbservice.service.protection_management_ratings_lkpLocalService;
import com.iucn.whp.dbservice.service.protection_mgmt_checklist_lkpLocalService;
import com.iucn.whp.dbservice.service.recommendation_type_lkpLocalService;
import com.iucn.whp.dbservice.service.referencesLocalService;
import com.iucn.whp.dbservice.service.reinforced_monitoringLocalService;
import com.iucn.whp.dbservice.service.site_assessmentLocalService;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalService;
import com.iucn.whp.dbservice.service.sites_thematicLocalService;
import com.iucn.whp.dbservice.service.state_lkpLocalService;
import com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalService;
import com.iucn.whp.dbservice.service.state_trend_whvaluesLocalService;
import com.iucn.whp.dbservice.service.thematic_lkpLocalService;
import com.iucn.whp.dbservice.service.threat_categories_lkpLocalService;
import com.iucn.whp.dbservice.service.threat_rating_lkpLocalService;
import com.iucn.whp.dbservice.service.threat_subcategories_lkpLocalService;
import com.iucn.whp.dbservice.service.threat_summary_currentLocalService;
import com.iucn.whp.dbservice.service.threat_summary_overallLocalService;
import com.iucn.whp.dbservice.service.threat_summary_potentialLocalService;
import com.iucn.whp.dbservice.service.trend_lkpLocalService;
import com.iucn.whp.dbservice.service.unesco_regionLocalService;
import com.iucn.whp.dbservice.service.unesco_region_countryLocalService;
import com.iucn.whp.dbservice.service.whp_contactLocalService;
import com.iucn.whp.dbservice.service.whp_criteria_lkpLocalService;
import com.iucn.whp.dbservice.service.whp_site_danger_listLocalService;
import com.iucn.whp.dbservice.service.whp_site_danger_listService;
import com.iucn.whp.dbservice.service.whp_sitesLocalService;
import com.iucn.whp.dbservice.service.whp_sitesService;
import com.iucn.whp.dbservice.service.whp_sites_boundary_modificationLocalService;
import com.iucn.whp.dbservice.service.whp_sites_budgetLocalService;
import com.iucn.whp.dbservice.service.whp_sites_componentLocalService;
import com.iucn.whp.dbservice.service.whp_sites_contactsLocalService;
import com.iucn.whp.dbservice.service.whp_sites_countryLocalService;
import com.iucn.whp.dbservice.service.whp_sites_dsocrLocalService;
import com.iucn.whp.dbservice.service.whp_sites_external_documentsLocalService;
import com.iucn.whp.dbservice.service.whp_sites_flagship_speciesLocalService;
import com.iucn.whp.dbservice.service.whp_sites_indigenous_communitiesLocalService;
import com.iucn.whp.dbservice.service.whp_sites_inscription_criteriaLocalService;
import com.iucn.whp.dbservice.service.whp_sites_inscription_dateLocalService;
import com.iucn.whp.dbservice.service.whp_sites_iucn_pa_categoryLocalService;
import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationLocalService;
import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationService;
import com.iucn.whp.dbservice.service.whp_sites_meeLocalService;
import com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalService;
import com.iucn.whp.dbservice.service.whp_sites_missionLocalService;
import com.iucn.whp.dbservice.service.whp_sites_other_designationsLocalService;
import com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalService;
import com.iucn.whp.dbservice.service.whp_sites_soouvLocalService;
import com.iucn.whp.dbservice.service.whp_sites_visitorsLocalService;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the site_assessment_versions local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl}.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl
 * @see com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil
 * @generated
 */
public abstract class site_assessment_versionsLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements site_assessment_versionsLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil} to access the site_assessment_versions local service.
	 */

	/**
	 * Adds the site_assessment_versions to the database. Also notifies the appropriate model listeners.
	 *
	 * @param site_assessment_versions the site_assessment_versions
	 * @return the site_assessment_versions that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public site_assessment_versions addsite_assessment_versions(
		site_assessment_versions site_assessment_versions)
		throws SystemException {
		site_assessment_versions.setNew(true);

		return site_assessment_versionsPersistence.update(site_assessment_versions,
			false);
	}

	/**
	 * Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	 *
	 * @param assessment_version_id the primary key for the new site_assessment_versions
	 * @return the new site_assessment_versions
	 */
	public site_assessment_versions createsite_assessment_versions(
		long assessment_version_id) {
		return site_assessment_versionsPersistence.create(assessment_version_id);
	}

	/**
	 * Deletes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessment_version_id the primary key of the site_assessment_versions
	 * @return the site_assessment_versions that was removed
	 * @throws PortalException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public site_assessment_versions deletesite_assessment_versions(
		long assessment_version_id) throws PortalException, SystemException {
		return site_assessment_versionsPersistence.remove(assessment_version_id);
	}

	/**
	 * Deletes the site_assessment_versions from the database. Also notifies the appropriate model listeners.
	 *
	 * @param site_assessment_versions the site_assessment_versions
	 * @return the site_assessment_versions that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public site_assessment_versions deletesite_assessment_versions(
		site_assessment_versions site_assessment_versions)
		throws SystemException {
		return site_assessment_versionsPersistence.remove(site_assessment_versions);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(site_assessment_versions.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return site_assessment_versionsPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return site_assessment_versionsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return site_assessment_versionsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return site_assessment_versionsPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public site_assessment_versions fetchsite_assessment_versions(
		long assessment_version_id) throws SystemException {
		return site_assessment_versionsPersistence.fetchByPrimaryKey(assessment_version_id);
	}

	/**
	 * Returns the site_assessment_versions with the primary key.
	 *
	 * @param assessment_version_id the primary key of the site_assessment_versions
	 * @return the site_assessment_versions
	 * @throws PortalException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions getsite_assessment_versions(
		long assessment_version_id) throws PortalException, SystemException {
		return site_assessment_versionsPersistence.findByPrimaryKey(assessment_version_id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return site_assessment_versionsPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the site_assessment_versionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> getsite_assessment_versionses(
		int start, int end) throws SystemException {
		return site_assessment_versionsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of site_assessment_versionses.
	 *
	 * @return the number of site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public int getsite_assessment_versionsesCount() throws SystemException {
		return site_assessment_versionsPersistence.countAll();
	}

	/**
	 * Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param site_assessment_versions the site_assessment_versions
	 * @return the site_assessment_versions that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public site_assessment_versions updatesite_assessment_versions(
		site_assessment_versions site_assessment_versions)
		throws SystemException {
		return updatesite_assessment_versions(site_assessment_versions, true);
	}

	/**
	 * Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param site_assessment_versions the site_assessment_versions
	 * @param merge whether to merge the site_assessment_versions with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the site_assessment_versions that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public site_assessment_versions updatesite_assessment_versions(
		site_assessment_versions site_assessment_versions, boolean merge)
		throws SystemException {
		site_assessment_versions.setNew(false);

		return site_assessment_versionsPersistence.update(site_assessment_versions,
			merge);
	}

	/**
	 * Returns the active_conservation_projects local service.
	 *
	 * @return the active_conservation_projects local service
	 */
	public active_conservation_projectsLocalService getactive_conservation_projectsLocalService() {
		return active_conservation_projectsLocalService;
	}

	/**
	 * Sets the active_conservation_projects local service.
	 *
	 * @param active_conservation_projectsLocalService the active_conservation_projects local service
	 */
	public void setactive_conservation_projectsLocalService(
		active_conservation_projectsLocalService active_conservation_projectsLocalService) {
		this.active_conservation_projectsLocalService = active_conservation_projectsLocalService;
	}

	/**
	 * Returns the active_conservation_projects persistence.
	 *
	 * @return the active_conservation_projects persistence
	 */
	public active_conservation_projectsPersistence getactive_conservation_projectsPersistence() {
		return active_conservation_projectsPersistence;
	}

	/**
	 * Sets the active_conservation_projects persistence.
	 *
	 * @param active_conservation_projectsPersistence the active_conservation_projects persistence
	 */
	public void setactive_conservation_projectsPersistence(
		active_conservation_projectsPersistence active_conservation_projectsPersistence) {
		this.active_conservation_projectsPersistence = active_conservation_projectsPersistence;
	}

	/**
	 * Returns the advance_query_assessment local service.
	 *
	 * @return the advance_query_assessment local service
	 */
	public advance_query_assessmentLocalService getadvance_query_assessmentLocalService() {
		return advance_query_assessmentLocalService;
	}

	/**
	 * Sets the advance_query_assessment local service.
	 *
	 * @param advance_query_assessmentLocalService the advance_query_assessment local service
	 */
	public void setadvance_query_assessmentLocalService(
		advance_query_assessmentLocalService advance_query_assessmentLocalService) {
		this.advance_query_assessmentLocalService = advance_query_assessmentLocalService;
	}

	/**
	 * Returns the advance_query_assessment persistence.
	 *
	 * @return the advance_query_assessment persistence
	 */
	public advance_query_assessmentPersistence getadvance_query_assessmentPersistence() {
		return advance_query_assessmentPersistence;
	}

	/**
	 * Sets the advance_query_assessment persistence.
	 *
	 * @param advance_query_assessmentPersistence the advance_query_assessment persistence
	 */
	public void setadvance_query_assessmentPersistence(
		advance_query_assessmentPersistence advance_query_assessmentPersistence) {
		this.advance_query_assessmentPersistence = advance_query_assessmentPersistence;
	}

	/**
	 * Returns the advance_query_site local service.
	 *
	 * @return the advance_query_site local service
	 */
	public advance_query_siteLocalService getadvance_query_siteLocalService() {
		return advance_query_siteLocalService;
	}

	/**
	 * Sets the advance_query_site local service.
	 *
	 * @param advance_query_siteLocalService the advance_query_site local service
	 */
	public void setadvance_query_siteLocalService(
		advance_query_siteLocalService advance_query_siteLocalService) {
		this.advance_query_siteLocalService = advance_query_siteLocalService;
	}

	/**
	 * Returns the advance_query_site persistence.
	 *
	 * @return the advance_query_site persistence
	 */
	public advance_query_sitePersistence getadvance_query_sitePersistence() {
		return advance_query_sitePersistence;
	}

	/**
	 * Sets the advance_query_site persistence.
	 *
	 * @param advance_query_sitePersistence the advance_query_site persistence
	 */
	public void setadvance_query_sitePersistence(
		advance_query_sitePersistence advance_query_sitePersistence) {
		this.advance_query_sitePersistence = advance_query_sitePersistence;
	}

	/**
	 * Returns the assessing_threats_current local service.
	 *
	 * @return the assessing_threats_current local service
	 */
	public assessing_threats_currentLocalService getassessing_threats_currentLocalService() {
		return assessing_threats_currentLocalService;
	}

	/**
	 * Sets the assessing_threats_current local service.
	 *
	 * @param assessing_threats_currentLocalService the assessing_threats_current local service
	 */
	public void setassessing_threats_currentLocalService(
		assessing_threats_currentLocalService assessing_threats_currentLocalService) {
		this.assessing_threats_currentLocalService = assessing_threats_currentLocalService;
	}

	/**
	 * Returns the assessing_threats_current persistence.
	 *
	 * @return the assessing_threats_current persistence
	 */
	public assessing_threats_currentPersistence getassessing_threats_currentPersistence() {
		return assessing_threats_currentPersistence;
	}

	/**
	 * Sets the assessing_threats_current persistence.
	 *
	 * @param assessing_threats_currentPersistence the assessing_threats_current persistence
	 */
	public void setassessing_threats_currentPersistence(
		assessing_threats_currentPersistence assessing_threats_currentPersistence) {
		this.assessing_threats_currentPersistence = assessing_threats_currentPersistence;
	}

	/**
	 * Returns the assessing_threats_potential local service.
	 *
	 * @return the assessing_threats_potential local service
	 */
	public assessing_threats_potentialLocalService getassessing_threats_potentialLocalService() {
		return assessing_threats_potentialLocalService;
	}

	/**
	 * Sets the assessing_threats_potential local service.
	 *
	 * @param assessing_threats_potentialLocalService the assessing_threats_potential local service
	 */
	public void setassessing_threats_potentialLocalService(
		assessing_threats_potentialLocalService assessing_threats_potentialLocalService) {
		this.assessing_threats_potentialLocalService = assessing_threats_potentialLocalService;
	}

	/**
	 * Returns the assessing_threats_potential persistence.
	 *
	 * @return the assessing_threats_potential persistence
	 */
	public assessing_threats_potentialPersistence getassessing_threats_potentialPersistence() {
		return assessing_threats_potentialPersistence;
	}

	/**
	 * Sets the assessing_threats_potential persistence.
	 *
	 * @param assessing_threats_potentialPersistence the assessing_threats_potential persistence
	 */
	public void setassessing_threats_potentialPersistence(
		assessing_threats_potentialPersistence assessing_threats_potentialPersistence) {
		this.assessing_threats_potentialPersistence = assessing_threats_potentialPersistence;
	}

	/**
	 * Returns the assessment_lang_lkp local service.
	 *
	 * @return the assessment_lang_lkp local service
	 */
	public assessment_lang_lkpLocalService getassessment_lang_lkpLocalService() {
		return assessment_lang_lkpLocalService;
	}

	/**
	 * Sets the assessment_lang_lkp local service.
	 *
	 * @param assessment_lang_lkpLocalService the assessment_lang_lkp local service
	 */
	public void setassessment_lang_lkpLocalService(
		assessment_lang_lkpLocalService assessment_lang_lkpLocalService) {
		this.assessment_lang_lkpLocalService = assessment_lang_lkpLocalService;
	}

	/**
	 * Returns the assessment_lang_lkp persistence.
	 *
	 * @return the assessment_lang_lkp persistence
	 */
	public assessment_lang_lkpPersistence getassessment_lang_lkpPersistence() {
		return assessment_lang_lkpPersistence;
	}

	/**
	 * Sets the assessment_lang_lkp persistence.
	 *
	 * @param assessment_lang_lkpPersistence the assessment_lang_lkp persistence
	 */
	public void setassessment_lang_lkpPersistence(
		assessment_lang_lkpPersistence assessment_lang_lkpPersistence) {
		this.assessment_lang_lkpPersistence = assessment_lang_lkpPersistence;
	}

	/**
	 * Returns the assessment_lang_version local service.
	 *
	 * @return the assessment_lang_version local service
	 */
	public assessment_lang_versionLocalService getassessment_lang_versionLocalService() {
		return assessment_lang_versionLocalService;
	}

	/**
	 * Sets the assessment_lang_version local service.
	 *
	 * @param assessment_lang_versionLocalService the assessment_lang_version local service
	 */
	public void setassessment_lang_versionLocalService(
		assessment_lang_versionLocalService assessment_lang_versionLocalService) {
		this.assessment_lang_versionLocalService = assessment_lang_versionLocalService;
	}

	/**
	 * Returns the assessment_lang_version persistence.
	 *
	 * @return the assessment_lang_version persistence
	 */
	public assessment_lang_versionPersistence getassessment_lang_versionPersistence() {
		return assessment_lang_versionPersistence;
	}

	/**
	 * Sets the assessment_lang_version persistence.
	 *
	 * @param assessment_lang_versionPersistence the assessment_lang_version persistence
	 */
	public void setassessment_lang_versionPersistence(
		assessment_lang_versionPersistence assessment_lang_versionPersistence) {
		this.assessment_lang_versionPersistence = assessment_lang_versionPersistence;
	}

	/**
	 * Returns the assessment_stages local service.
	 *
	 * @return the assessment_stages local service
	 */
	public assessment_stagesLocalService getassessment_stagesLocalService() {
		return assessment_stagesLocalService;
	}

	/**
	 * Sets the assessment_stages local service.
	 *
	 * @param assessment_stagesLocalService the assessment_stages local service
	 */
	public void setassessment_stagesLocalService(
		assessment_stagesLocalService assessment_stagesLocalService) {
		this.assessment_stagesLocalService = assessment_stagesLocalService;
	}

	/**
	 * Returns the assessment_stages persistence.
	 *
	 * @return the assessment_stages persistence
	 */
	public assessment_stagesPersistence getassessment_stagesPersistence() {
		return assessment_stagesPersistence;
	}

	/**
	 * Sets the assessment_stages persistence.
	 *
	 * @param assessment_stagesPersistence the assessment_stages persistence
	 */
	public void setassessment_stagesPersistence(
		assessment_stagesPersistence assessment_stagesPersistence) {
		this.assessment_stagesPersistence = assessment_stagesPersistence;
	}

	/**
	 * Returns the assessment_status local service.
	 *
	 * @return the assessment_status local service
	 */
	public assessment_statusLocalService getassessment_statusLocalService() {
		return assessment_statusLocalService;
	}

	/**
	 * Sets the assessment_status local service.
	 *
	 * @param assessment_statusLocalService the assessment_status local service
	 */
	public void setassessment_statusLocalService(
		assessment_statusLocalService assessment_statusLocalService) {
		this.assessment_statusLocalService = assessment_statusLocalService;
	}

	/**
	 * Returns the assessment_status persistence.
	 *
	 * @return the assessment_status persistence
	 */
	public assessment_statusPersistence getassessment_statusPersistence() {
		return assessment_statusPersistence;
	}

	/**
	 * Sets the assessment_status persistence.
	 *
	 * @param assessment_statusPersistence the assessment_status persistence
	 */
	public void setassessment_statusPersistence(
		assessment_statusPersistence assessment_statusPersistence) {
		this.assessment_statusPersistence = assessment_statusPersistence;
	}

	/**
	 * Returns the assessment_validation local service.
	 *
	 * @return the assessment_validation local service
	 */
	public assessment_validationLocalService getassessment_validationLocalService() {
		return assessment_validationLocalService;
	}

	/**
	 * Sets the assessment_validation local service.
	 *
	 * @param assessment_validationLocalService the assessment_validation local service
	 */
	public void setassessment_validationLocalService(
		assessment_validationLocalService assessment_validationLocalService) {
		this.assessment_validationLocalService = assessment_validationLocalService;
	}

	/**
	 * Returns the assessment_validation persistence.
	 *
	 * @return the assessment_validation persistence
	 */
	public assessment_validationPersistence getassessment_validationPersistence() {
		return assessment_validationPersistence;
	}

	/**
	 * Sets the assessment_validation persistence.
	 *
	 * @param assessment_validationPersistence the assessment_validation persistence
	 */
	public void setassessment_validationPersistence(
		assessment_validationPersistence assessment_validationPersistence) {
		this.assessment_validationPersistence = assessment_validationPersistence;
	}

	/**
	 * Returns the assessment_whvalues local service.
	 *
	 * @return the assessment_whvalues local service
	 */
	public assessment_whvaluesLocalService getassessment_whvaluesLocalService() {
		return assessment_whvaluesLocalService;
	}

	/**
	 * Sets the assessment_whvalues local service.
	 *
	 * @param assessment_whvaluesLocalService the assessment_whvalues local service
	 */
	public void setassessment_whvaluesLocalService(
		assessment_whvaluesLocalService assessment_whvaluesLocalService) {
		this.assessment_whvaluesLocalService = assessment_whvaluesLocalService;
	}

	/**
	 * Returns the assessment_whvalues persistence.
	 *
	 * @return the assessment_whvalues persistence
	 */
	public assessment_whvaluesPersistence getassessment_whvaluesPersistence() {
		return assessment_whvaluesPersistence;
	}

	/**
	 * Sets the assessment_whvalues persistence.
	 *
	 * @param assessment_whvaluesPersistence the assessment_whvalues persistence
	 */
	public void setassessment_whvaluesPersistence(
		assessment_whvaluesPersistence assessment_whvaluesPersistence) {
		this.assessment_whvaluesPersistence = assessment_whvaluesPersistence;
	}

	/**
	 * Returns the assessment_whvalues_whcriterion local service.
	 *
	 * @return the assessment_whvalues_whcriterion local service
	 */
	public assessment_whvalues_whcriterionLocalService getassessment_whvalues_whcriterionLocalService() {
		return assessment_whvalues_whcriterionLocalService;
	}

	/**
	 * Sets the assessment_whvalues_whcriterion local service.
	 *
	 * @param assessment_whvalues_whcriterionLocalService the assessment_whvalues_whcriterion local service
	 */
	public void setassessment_whvalues_whcriterionLocalService(
		assessment_whvalues_whcriterionLocalService assessment_whvalues_whcriterionLocalService) {
		this.assessment_whvalues_whcriterionLocalService = assessment_whvalues_whcriterionLocalService;
	}

	/**
	 * Returns the assessment_whvalues_whcriterion persistence.
	 *
	 * @return the assessment_whvalues_whcriterion persistence
	 */
	public assessment_whvalues_whcriterionPersistence getassessment_whvalues_whcriterionPersistence() {
		return assessment_whvalues_whcriterionPersistence;
	}

	/**
	 * Sets the assessment_whvalues_whcriterion persistence.
	 *
	 * @param assessment_whvalues_whcriterionPersistence the assessment_whvalues_whcriterion persistence
	 */
	public void setassessment_whvalues_whcriterionPersistence(
		assessment_whvalues_whcriterionPersistence assessment_whvalues_whcriterionPersistence) {
		this.assessment_whvalues_whcriterionPersistence = assessment_whvalues_whcriterionPersistence;
	}

	/**
	 * Returns the benefit_checksubtype_lkp local service.
	 *
	 * @return the benefit_checksubtype_lkp local service
	 */
	public benefit_checksubtype_lkpLocalService getbenefit_checksubtype_lkpLocalService() {
		return benefit_checksubtype_lkpLocalService;
	}

	/**
	 * Sets the benefit_checksubtype_lkp local service.
	 *
	 * @param benefit_checksubtype_lkpLocalService the benefit_checksubtype_lkp local service
	 */
	public void setbenefit_checksubtype_lkpLocalService(
		benefit_checksubtype_lkpLocalService benefit_checksubtype_lkpLocalService) {
		this.benefit_checksubtype_lkpLocalService = benefit_checksubtype_lkpLocalService;
	}

	/**
	 * Returns the benefit_checksubtype_lkp persistence.
	 *
	 * @return the benefit_checksubtype_lkp persistence
	 */
	public benefit_checksubtype_lkpPersistence getbenefit_checksubtype_lkpPersistence() {
		return benefit_checksubtype_lkpPersistence;
	}

	/**
	 * Sets the benefit_checksubtype_lkp persistence.
	 *
	 * @param benefit_checksubtype_lkpPersistence the benefit_checksubtype_lkp persistence
	 */
	public void setbenefit_checksubtype_lkpPersistence(
		benefit_checksubtype_lkpPersistence benefit_checksubtype_lkpPersistence) {
		this.benefit_checksubtype_lkpPersistence = benefit_checksubtype_lkpPersistence;
	}

	/**
	 * Returns the benefit_checktype_lkp local service.
	 *
	 * @return the benefit_checktype_lkp local service
	 */
	public benefit_checktype_lkpLocalService getbenefit_checktype_lkpLocalService() {
		return benefit_checktype_lkpLocalService;
	}

	/**
	 * Sets the benefit_checktype_lkp local service.
	 *
	 * @param benefit_checktype_lkpLocalService the benefit_checktype_lkp local service
	 */
	public void setbenefit_checktype_lkpLocalService(
		benefit_checktype_lkpLocalService benefit_checktype_lkpLocalService) {
		this.benefit_checktype_lkpLocalService = benefit_checktype_lkpLocalService;
	}

	/**
	 * Returns the benefit_checktype_lkp persistence.
	 *
	 * @return the benefit_checktype_lkp persistence
	 */
	public benefit_checktype_lkpPersistence getbenefit_checktype_lkpPersistence() {
		return benefit_checktype_lkpPersistence;
	}

	/**
	 * Sets the benefit_checktype_lkp persistence.
	 *
	 * @param benefit_checktype_lkpPersistence the benefit_checktype_lkp persistence
	 */
	public void setbenefit_checktype_lkpPersistence(
		benefit_checktype_lkpPersistence benefit_checktype_lkpPersistence) {
		this.benefit_checktype_lkpPersistence = benefit_checktype_lkpPersistence;
	}

	/**
	 * Returns the benefit_rating_lkp local service.
	 *
	 * @return the benefit_rating_lkp local service
	 */
	public benefit_rating_lkpLocalService getbenefit_rating_lkpLocalService() {
		return benefit_rating_lkpLocalService;
	}

	/**
	 * Sets the benefit_rating_lkp local service.
	 *
	 * @param benefit_rating_lkpLocalService the benefit_rating_lkp local service
	 */
	public void setbenefit_rating_lkpLocalService(
		benefit_rating_lkpLocalService benefit_rating_lkpLocalService) {
		this.benefit_rating_lkpLocalService = benefit_rating_lkpLocalService;
	}

	/**
	 * Returns the benefit_rating_lkp persistence.
	 *
	 * @return the benefit_rating_lkp persistence
	 */
	public benefit_rating_lkpPersistence getbenefit_rating_lkpPersistence() {
		return benefit_rating_lkpPersistence;
	}

	/**
	 * Sets the benefit_rating_lkp persistence.
	 *
	 * @param benefit_rating_lkpPersistence the benefit_rating_lkp persistence
	 */
	public void setbenefit_rating_lkpPersistence(
		benefit_rating_lkpPersistence benefit_rating_lkpPersistence) {
		this.benefit_rating_lkpPersistence = benefit_rating_lkpPersistence;
	}

	/**
	 * Returns the benefits local service.
	 *
	 * @return the benefits local service
	 */
	public benefitsLocalService getbenefitsLocalService() {
		return benefitsLocalService;
	}

	/**
	 * Sets the benefits local service.
	 *
	 * @param benefitsLocalService the benefits local service
	 */
	public void setbenefitsLocalService(
		benefitsLocalService benefitsLocalService) {
		this.benefitsLocalService = benefitsLocalService;
	}

	/**
	 * Returns the benefits persistence.
	 *
	 * @return the benefits persistence
	 */
	public benefitsPersistence getbenefitsPersistence() {
		return benefitsPersistence;
	}

	/**
	 * Sets the benefits persistence.
	 *
	 * @param benefitsPersistence the benefits persistence
	 */
	public void setbenefitsPersistence(benefitsPersistence benefitsPersistence) {
		this.benefitsPersistence = benefitsPersistence;
	}

	/**
	 * Returns the benefits_summary local service.
	 *
	 * @return the benefits_summary local service
	 */
	public benefits_summaryLocalService getbenefits_summaryLocalService() {
		return benefits_summaryLocalService;
	}

	/**
	 * Sets the benefits_summary local service.
	 *
	 * @param benefits_summaryLocalService the benefits_summary local service
	 */
	public void setbenefits_summaryLocalService(
		benefits_summaryLocalService benefits_summaryLocalService) {
		this.benefits_summaryLocalService = benefits_summaryLocalService;
	}

	/**
	 * Returns the benefits_summary persistence.
	 *
	 * @return the benefits_summary persistence
	 */
	public benefits_summaryPersistence getbenefits_summaryPersistence() {
		return benefits_summaryPersistence;
	}

	/**
	 * Sets the benefits_summary persistence.
	 *
	 * @param benefits_summaryPersistence the benefits_summary persistence
	 */
	public void setbenefits_summaryPersistence(
		benefits_summaryPersistence benefits_summaryPersistence) {
		this.benefits_summaryPersistence = benefits_summaryPersistence;
	}

	/**
	 * Returns the benefits_type_ref local service.
	 *
	 * @return the benefits_type_ref local service
	 */
	public benefits_type_refLocalService getbenefits_type_refLocalService() {
		return benefits_type_refLocalService;
	}

	/**
	 * Sets the benefits_type_ref local service.
	 *
	 * @param benefits_type_refLocalService the benefits_type_ref local service
	 */
	public void setbenefits_type_refLocalService(
		benefits_type_refLocalService benefits_type_refLocalService) {
		this.benefits_type_refLocalService = benefits_type_refLocalService;
	}

	/**
	 * Returns the benefits_type_ref persistence.
	 *
	 * @return the benefits_type_ref persistence
	 */
	public benefits_type_refPersistence getbenefits_type_refPersistence() {
		return benefits_type_refPersistence;
	}

	/**
	 * Sets the benefits_type_ref persistence.
	 *
	 * @param benefits_type_refPersistence the benefits_type_ref persistence
	 */
	public void setbenefits_type_refPersistence(
		benefits_type_refPersistence benefits_type_refPersistence) {
		this.benefits_type_refPersistence = benefits_type_refPersistence;
	}

	/**
	 * Returns the biodiversity_values local service.
	 *
	 * @return the biodiversity_values local service
	 */
	public biodiversity_valuesLocalService getbiodiversity_valuesLocalService() {
		return biodiversity_valuesLocalService;
	}

	/**
	 * Sets the biodiversity_values local service.
	 *
	 * @param biodiversity_valuesLocalService the biodiversity_values local service
	 */
	public void setbiodiversity_valuesLocalService(
		biodiversity_valuesLocalService biodiversity_valuesLocalService) {
		this.biodiversity_valuesLocalService = biodiversity_valuesLocalService;
	}

	/**
	 * Returns the biodiversity_values persistence.
	 *
	 * @return the biodiversity_values persistence
	 */
	public biodiversity_valuesPersistence getbiodiversity_valuesPersistence() {
		return biodiversity_valuesPersistence;
	}

	/**
	 * Sets the biodiversity_values persistence.
	 *
	 * @param biodiversity_valuesPersistence the biodiversity_values persistence
	 */
	public void setbiodiversity_valuesPersistence(
		biodiversity_valuesPersistence biodiversity_valuesPersistence) {
		this.biodiversity_valuesPersistence = biodiversity_valuesPersistence;
	}

	/**
	 * Returns the boundary_modification_type_lkp local service.
	 *
	 * @return the boundary_modification_type_lkp local service
	 */
	public boundary_modification_type_lkpLocalService getboundary_modification_type_lkpLocalService() {
		return boundary_modification_type_lkpLocalService;
	}

	/**
	 * Sets the boundary_modification_type_lkp local service.
	 *
	 * @param boundary_modification_type_lkpLocalService the boundary_modification_type_lkp local service
	 */
	public void setboundary_modification_type_lkpLocalService(
		boundary_modification_type_lkpLocalService boundary_modification_type_lkpLocalService) {
		this.boundary_modification_type_lkpLocalService = boundary_modification_type_lkpLocalService;
	}

	/**
	 * Returns the boundary_modification_type_lkp persistence.
	 *
	 * @return the boundary_modification_type_lkp persistence
	 */
	public boundary_modification_type_lkpPersistence getboundary_modification_type_lkpPersistence() {
		return boundary_modification_type_lkpPersistence;
	}

	/**
	 * Sets the boundary_modification_type_lkp persistence.
	 *
	 * @param boundary_modification_type_lkpPersistence the boundary_modification_type_lkp persistence
	 */
	public void setboundary_modification_type_lkpPersistence(
		boundary_modification_type_lkpPersistence boundary_modification_type_lkpPersistence) {
		this.boundary_modification_type_lkpPersistence = boundary_modification_type_lkpPersistence;
	}

	/**
	 * Returns the conservation_outlook local service.
	 *
	 * @return the conservation_outlook local service
	 */
	public conservation_outlookLocalService getconservation_outlookLocalService() {
		return conservation_outlookLocalService;
	}

	/**
	 * Sets the conservation_outlook local service.
	 *
	 * @param conservation_outlookLocalService the conservation_outlook local service
	 */
	public void setconservation_outlookLocalService(
		conservation_outlookLocalService conservation_outlookLocalService) {
		this.conservation_outlookLocalService = conservation_outlookLocalService;
	}

	/**
	 * Returns the conservation_outlook persistence.
	 *
	 * @return the conservation_outlook persistence
	 */
	public conservation_outlookPersistence getconservation_outlookPersistence() {
		return conservation_outlookPersistence;
	}

	/**
	 * Sets the conservation_outlook persistence.
	 *
	 * @param conservation_outlookPersistence the conservation_outlook persistence
	 */
	public void setconservation_outlookPersistence(
		conservation_outlookPersistence conservation_outlookPersistence) {
		this.conservation_outlookPersistence = conservation_outlookPersistence;
	}

	/**
	 * Returns the conservation_outlook_rating_lkp local service.
	 *
	 * @return the conservation_outlook_rating_lkp local service
	 */
	public conservation_outlook_rating_lkpLocalService getconservation_outlook_rating_lkpLocalService() {
		return conservation_outlook_rating_lkpLocalService;
	}

	/**
	 * Sets the conservation_outlook_rating_lkp local service.
	 *
	 * @param conservation_outlook_rating_lkpLocalService the conservation_outlook_rating_lkp local service
	 */
	public void setconservation_outlook_rating_lkpLocalService(
		conservation_outlook_rating_lkpLocalService conservation_outlook_rating_lkpLocalService) {
		this.conservation_outlook_rating_lkpLocalService = conservation_outlook_rating_lkpLocalService;
	}

	/**
	 * Returns the conservation_outlook_rating_lkp persistence.
	 *
	 * @return the conservation_outlook_rating_lkp persistence
	 */
	public conservation_outlook_rating_lkpPersistence getconservation_outlook_rating_lkpPersistence() {
		return conservation_outlook_rating_lkpPersistence;
	}

	/**
	 * Sets the conservation_outlook_rating_lkp persistence.
	 *
	 * @param conservation_outlook_rating_lkpPersistence the conservation_outlook_rating_lkp persistence
	 */
	public void setconservation_outlook_rating_lkpPersistence(
		conservation_outlook_rating_lkpPersistence conservation_outlook_rating_lkpPersistence) {
		this.conservation_outlook_rating_lkpPersistence = conservation_outlook_rating_lkpPersistence;
	}

	/**
	 * Returns the contact_category local service.
	 *
	 * @return the contact_category local service
	 */
	public contact_categoryLocalService getcontact_categoryLocalService() {
		return contact_categoryLocalService;
	}

	/**
	 * Sets the contact_category local service.
	 *
	 * @param contact_categoryLocalService the contact_category local service
	 */
	public void setcontact_categoryLocalService(
		contact_categoryLocalService contact_categoryLocalService) {
		this.contact_categoryLocalService = contact_categoryLocalService;
	}

	/**
	 * Returns the contact_category persistence.
	 *
	 * @return the contact_category persistence
	 */
	public contact_categoryPersistence getcontact_categoryPersistence() {
		return contact_categoryPersistence;
	}

	/**
	 * Sets the contact_category persistence.
	 *
	 * @param contact_categoryPersistence the contact_category persistence
	 */
	public void setcontact_categoryPersistence(
		contact_categoryPersistence contact_categoryPersistence) {
		this.contact_categoryPersistence = contact_categoryPersistence;
	}

	/**
	 * Returns the country_lkp local service.
	 *
	 * @return the country_lkp local service
	 */
	public country_lkpLocalService getcountry_lkpLocalService() {
		return country_lkpLocalService;
	}

	/**
	 * Sets the country_lkp local service.
	 *
	 * @param country_lkpLocalService the country_lkp local service
	 */
	public void setcountry_lkpLocalService(
		country_lkpLocalService country_lkpLocalService) {
		this.country_lkpLocalService = country_lkpLocalService;
	}

	/**
	 * Returns the country_lkp persistence.
	 *
	 * @return the country_lkp persistence
	 */
	public country_lkpPersistence getcountry_lkpPersistence() {
		return country_lkpPersistence;
	}

	/**
	 * Sets the country_lkp persistence.
	 *
	 * @param country_lkpPersistence the country_lkp persistence
	 */
	public void setcountry_lkpPersistence(
		country_lkpPersistence country_lkpPersistence) {
		this.country_lkpPersistence = country_lkpPersistence;
	}

	/**
	 * Returns the current_state_trend local service.
	 *
	 * @return the current_state_trend local service
	 */
	public current_state_trendLocalService getcurrent_state_trendLocalService() {
		return current_state_trendLocalService;
	}

	/**
	 * Sets the current_state_trend local service.
	 *
	 * @param current_state_trendLocalService the current_state_trend local service
	 */
	public void setcurrent_state_trendLocalService(
		current_state_trendLocalService current_state_trendLocalService) {
		this.current_state_trendLocalService = current_state_trendLocalService;
	}

	/**
	 * Returns the current_state_trend persistence.
	 *
	 * @return the current_state_trend persistence
	 */
	public current_state_trendPersistence getcurrent_state_trendPersistence() {
		return current_state_trendPersistence;
	}

	/**
	 * Sets the current_state_trend persistence.
	 *
	 * @param current_state_trendPersistence the current_state_trend persistence
	 */
	public void setcurrent_state_trendPersistence(
		current_state_trendPersistence current_state_trendPersistence) {
		this.current_state_trendPersistence = current_state_trendPersistence;
	}

	/**
	 * Returns the current_state_trend_values local service.
	 *
	 * @return the current_state_trend_values local service
	 */
	public current_state_trend_valuesLocalService getcurrent_state_trend_valuesLocalService() {
		return current_state_trend_valuesLocalService;
	}

	/**
	 * Sets the current_state_trend_values local service.
	 *
	 * @param current_state_trend_valuesLocalService the current_state_trend_values local service
	 */
	public void setcurrent_state_trend_valuesLocalService(
		current_state_trend_valuesLocalService current_state_trend_valuesLocalService) {
		this.current_state_trend_valuesLocalService = current_state_trend_valuesLocalService;
	}

	/**
	 * Returns the current_state_trend_values persistence.
	 *
	 * @return the current_state_trend_values persistence
	 */
	public current_state_trend_valuesPersistence getcurrent_state_trend_valuesPersistence() {
		return current_state_trend_valuesPersistence;
	}

	/**
	 * Sets the current_state_trend_values persistence.
	 *
	 * @param current_state_trend_valuesPersistence the current_state_trend_values persistence
	 */
	public void setcurrent_state_trend_valuesPersistence(
		current_state_trend_valuesPersistence current_state_trend_valuesPersistence) {
		this.current_state_trend_valuesPersistence = current_state_trend_valuesPersistence;
	}

	/**
	 * Returns the current_threat_assessment_cat local service.
	 *
	 * @return the current_threat_assessment_cat local service
	 */
	public current_threat_assessment_catLocalService getcurrent_threat_assessment_catLocalService() {
		return current_threat_assessment_catLocalService;
	}

	/**
	 * Sets the current_threat_assessment_cat local service.
	 *
	 * @param current_threat_assessment_catLocalService the current_threat_assessment_cat local service
	 */
	public void setcurrent_threat_assessment_catLocalService(
		current_threat_assessment_catLocalService current_threat_assessment_catLocalService) {
		this.current_threat_assessment_catLocalService = current_threat_assessment_catLocalService;
	}

	/**
	 * Returns the current_threat_assessment_cat persistence.
	 *
	 * @return the current_threat_assessment_cat persistence
	 */
	public current_threat_assessment_catPersistence getcurrent_threat_assessment_catPersistence() {
		return current_threat_assessment_catPersistence;
	}

	/**
	 * Sets the current_threat_assessment_cat persistence.
	 *
	 * @param current_threat_assessment_catPersistence the current_threat_assessment_cat persistence
	 */
	public void setcurrent_threat_assessment_catPersistence(
		current_threat_assessment_catPersistence current_threat_assessment_catPersistence) {
		this.current_threat_assessment_catPersistence = current_threat_assessment_catPersistence;
	}

	/**
	 * Returns the current_threat_values local service.
	 *
	 * @return the current_threat_values local service
	 */
	public current_threat_valuesLocalService getcurrent_threat_valuesLocalService() {
		return current_threat_valuesLocalService;
	}

	/**
	 * Sets the current_threat_values local service.
	 *
	 * @param current_threat_valuesLocalService the current_threat_values local service
	 */
	public void setcurrent_threat_valuesLocalService(
		current_threat_valuesLocalService current_threat_valuesLocalService) {
		this.current_threat_valuesLocalService = current_threat_valuesLocalService;
	}

	/**
	 * Returns the current_threat_values persistence.
	 *
	 * @return the current_threat_values persistence
	 */
	public current_threat_valuesPersistence getcurrent_threat_valuesPersistence() {
		return current_threat_valuesPersistence;
	}

	/**
	 * Sets the current_threat_values persistence.
	 *
	 * @param current_threat_valuesPersistence the current_threat_values persistence
	 */
	public void setcurrent_threat_valuesPersistence(
		current_threat_valuesPersistence current_threat_valuesPersistence) {
		this.current_threat_valuesPersistence = current_threat_valuesPersistence;
	}

	/**
	 * Returns the danger_list_status_lkp local service.
	 *
	 * @return the danger_list_status_lkp local service
	 */
	public danger_list_status_lkpLocalService getdanger_list_status_lkpLocalService() {
		return danger_list_status_lkpLocalService;
	}

	/**
	 * Sets the danger_list_status_lkp local service.
	 *
	 * @param danger_list_status_lkpLocalService the danger_list_status_lkp local service
	 */
	public void setdanger_list_status_lkpLocalService(
		danger_list_status_lkpLocalService danger_list_status_lkpLocalService) {
		this.danger_list_status_lkpLocalService = danger_list_status_lkpLocalService;
	}

	/**
	 * Returns the danger_list_status_lkp persistence.
	 *
	 * @return the danger_list_status_lkp persistence
	 */
	public danger_list_status_lkpPersistence getdanger_list_status_lkpPersistence() {
		return danger_list_status_lkpPersistence;
	}

	/**
	 * Sets the danger_list_status_lkp persistence.
	 *
	 * @param danger_list_status_lkpPersistence the danger_list_status_lkp persistence
	 */
	public void setdanger_list_status_lkpPersistence(
		danger_list_status_lkpPersistence danger_list_status_lkpPersistence) {
		this.danger_list_status_lkpPersistence = danger_list_status_lkpPersistence;
	}

	/**
	 * Returns the docs_custom data local service.
	 *
	 * @return the docs_custom data local service
	 */
	public docs_customDataLocalService getdocs_customDataLocalService() {
		return docs_customDataLocalService;
	}

	/**
	 * Sets the docs_custom data local service.
	 *
	 * @param docs_customDataLocalService the docs_custom data local service
	 */
	public void setdocs_customDataLocalService(
		docs_customDataLocalService docs_customDataLocalService) {
		this.docs_customDataLocalService = docs_customDataLocalService;
	}

	/**
	 * Returns the docs_custom data persistence.
	 *
	 * @return the docs_custom data persistence
	 */
	public docs_customDataPersistence getdocs_customDataPersistence() {
		return docs_customDataPersistence;
	}

	/**
	 * Sets the docs_custom data persistence.
	 *
	 * @param docs_customDataPersistence the docs_custom data persistence
	 */
	public void setdocs_customDataPersistence(
		docs_customDataPersistence docs_customDataPersistence) {
		this.docs_customDataPersistence = docs_customDataPersistence;
	}

	/**
	 * Returns the docs_custom data finder.
	 *
	 * @return the docs_custom data finder
	 */
	public docs_customDataFinder getdocs_customDataFinder() {
		return docs_customDataFinder;
	}

	/**
	 * Sets the docs_custom data finder.
	 *
	 * @param docs_customDataFinder the docs_custom data finder
	 */
	public void setdocs_customDataFinder(
		docs_customDataFinder docs_customDataFinder) {
		this.docs_customDataFinder = docs_customDataFinder;
	}

	/**
	 * Returns the docs_sitedata local service.
	 *
	 * @return the docs_sitedata local service
	 */
	public docs_sitedataLocalService getdocs_sitedataLocalService() {
		return docs_sitedataLocalService;
	}

	/**
	 * Sets the docs_sitedata local service.
	 *
	 * @param docs_sitedataLocalService the docs_sitedata local service
	 */
	public void setdocs_sitedataLocalService(
		docs_sitedataLocalService docs_sitedataLocalService) {
		this.docs_sitedataLocalService = docs_sitedataLocalService;
	}

	/**
	 * Returns the docs_sitedata persistence.
	 *
	 * @return the docs_sitedata persistence
	 */
	public docs_sitedataPersistence getdocs_sitedataPersistence() {
		return docs_sitedataPersistence;
	}

	/**
	 * Sets the docs_sitedata persistence.
	 *
	 * @param docs_sitedataPersistence the docs_sitedata persistence
	 */
	public void setdocs_sitedataPersistence(
		docs_sitedataPersistence docs_sitedataPersistence) {
		this.docs_sitedataPersistence = docs_sitedataPersistence;
	}

	/**
	 * Returns the effective_prot_mgmt_iothreats local service.
	 *
	 * @return the effective_prot_mgmt_iothreats local service
	 */
	public effective_prot_mgmt_iothreatsLocalService geteffective_prot_mgmt_iothreatsLocalService() {
		return effective_prot_mgmt_iothreatsLocalService;
	}

	/**
	 * Sets the effective_prot_mgmt_iothreats local service.
	 *
	 * @param effective_prot_mgmt_iothreatsLocalService the effective_prot_mgmt_iothreats local service
	 */
	public void seteffective_prot_mgmt_iothreatsLocalService(
		effective_prot_mgmt_iothreatsLocalService effective_prot_mgmt_iothreatsLocalService) {
		this.effective_prot_mgmt_iothreatsLocalService = effective_prot_mgmt_iothreatsLocalService;
	}

	/**
	 * Returns the effective_prot_mgmt_iothreats persistence.
	 *
	 * @return the effective_prot_mgmt_iothreats persistence
	 */
	public effective_prot_mgmt_iothreatsPersistence geteffective_prot_mgmt_iothreatsPersistence() {
		return effective_prot_mgmt_iothreatsPersistence;
	}

	/**
	 * Sets the effective_prot_mgmt_iothreats persistence.
	 *
	 * @param effective_prot_mgmt_iothreatsPersistence the effective_prot_mgmt_iothreats persistence
	 */
	public void seteffective_prot_mgmt_iothreatsPersistence(
		effective_prot_mgmt_iothreatsPersistence effective_prot_mgmt_iothreatsPersistence) {
		this.effective_prot_mgmt_iothreatsPersistence = effective_prot_mgmt_iothreatsPersistence;
	}

	/**
	 * Returns the flagship_species_lkp local service.
	 *
	 * @return the flagship_species_lkp local service
	 */
	public flagship_species_lkpLocalService getflagship_species_lkpLocalService() {
		return flagship_species_lkpLocalService;
	}

	/**
	 * Sets the flagship_species_lkp local service.
	 *
	 * @param flagship_species_lkpLocalService the flagship_species_lkp local service
	 */
	public void setflagship_species_lkpLocalService(
		flagship_species_lkpLocalService flagship_species_lkpLocalService) {
		this.flagship_species_lkpLocalService = flagship_species_lkpLocalService;
	}

	/**
	 * Returns the flagship_species_lkp persistence.
	 *
	 * @return the flagship_species_lkp persistence
	 */
	public flagship_species_lkpPersistence getflagship_species_lkpPersistence() {
		return flagship_species_lkpPersistence;
	}

	/**
	 * Sets the flagship_species_lkp persistence.
	 *
	 * @param flagship_species_lkpPersistence the flagship_species_lkp persistence
	 */
	public void setflagship_species_lkpPersistence(
		flagship_species_lkpPersistence flagship_species_lkpPersistence) {
		this.flagship_species_lkpPersistence = flagship_species_lkpPersistence;
	}

	/**
	 * Returns the inscription_criteria_lkp local service.
	 *
	 * @return the inscription_criteria_lkp local service
	 */
	public inscription_criteria_lkpLocalService getinscription_criteria_lkpLocalService() {
		return inscription_criteria_lkpLocalService;
	}

	/**
	 * Sets the inscription_criteria_lkp local service.
	 *
	 * @param inscription_criteria_lkpLocalService the inscription_criteria_lkp local service
	 */
	public void setinscription_criteria_lkpLocalService(
		inscription_criteria_lkpLocalService inscription_criteria_lkpLocalService) {
		this.inscription_criteria_lkpLocalService = inscription_criteria_lkpLocalService;
	}

	/**
	 * Returns the inscription_criteria_lkp persistence.
	 *
	 * @return the inscription_criteria_lkp persistence
	 */
	public inscription_criteria_lkpPersistence getinscription_criteria_lkpPersistence() {
		return inscription_criteria_lkpPersistence;
	}

	/**
	 * Sets the inscription_criteria_lkp persistence.
	 *
	 * @param inscription_criteria_lkpPersistence the inscription_criteria_lkp persistence
	 */
	public void setinscription_criteria_lkpPersistence(
		inscription_criteria_lkpPersistence inscription_criteria_lkpPersistence) {
		this.inscription_criteria_lkpPersistence = inscription_criteria_lkpPersistence;
	}

	/**
	 * Returns the inscription_type_lkp local service.
	 *
	 * @return the inscription_type_lkp local service
	 */
	public inscription_type_lkpLocalService getinscription_type_lkpLocalService() {
		return inscription_type_lkpLocalService;
	}

	/**
	 * Sets the inscription_type_lkp local service.
	 *
	 * @param inscription_type_lkpLocalService the inscription_type_lkp local service
	 */
	public void setinscription_type_lkpLocalService(
		inscription_type_lkpLocalService inscription_type_lkpLocalService) {
		this.inscription_type_lkpLocalService = inscription_type_lkpLocalService;
	}

	/**
	 * Returns the inscription_type_lkp persistence.
	 *
	 * @return the inscription_type_lkp persistence
	 */
	public inscription_type_lkpPersistence getinscription_type_lkpPersistence() {
		return inscription_type_lkpPersistence;
	}

	/**
	 * Sets the inscription_type_lkp persistence.
	 *
	 * @param inscription_type_lkpPersistence the inscription_type_lkp persistence
	 */
	public void setinscription_type_lkpPersistence(
		inscription_type_lkpPersistence inscription_type_lkpPersistence) {
		this.inscription_type_lkpPersistence = inscription_type_lkpPersistence;
	}

	/**
	 * Returns the iucn_pa_lkp_category local service.
	 *
	 * @return the iucn_pa_lkp_category local service
	 */
	public iucn_pa_lkp_categoryLocalService getiucn_pa_lkp_categoryLocalService() {
		return iucn_pa_lkp_categoryLocalService;
	}

	/**
	 * Sets the iucn_pa_lkp_category local service.
	 *
	 * @param iucn_pa_lkp_categoryLocalService the iucn_pa_lkp_category local service
	 */
	public void setiucn_pa_lkp_categoryLocalService(
		iucn_pa_lkp_categoryLocalService iucn_pa_lkp_categoryLocalService) {
		this.iucn_pa_lkp_categoryLocalService = iucn_pa_lkp_categoryLocalService;
	}

	/**
	 * Returns the iucn_pa_lkp_category persistence.
	 *
	 * @return the iucn_pa_lkp_category persistence
	 */
	public iucn_pa_lkp_categoryPersistence getiucn_pa_lkp_categoryPersistence() {
		return iucn_pa_lkp_categoryPersistence;
	}

	/**
	 * Sets the iucn_pa_lkp_category persistence.
	 *
	 * @param iucn_pa_lkp_categoryPersistence the iucn_pa_lkp_category persistence
	 */
	public void setiucn_pa_lkp_categoryPersistence(
		iucn_pa_lkp_categoryPersistence iucn_pa_lkp_categoryPersistence) {
		this.iucn_pa_lkp_categoryPersistence = iucn_pa_lkp_categoryPersistence;
	}

	/**
	 * Returns the iucn_region local service.
	 *
	 * @return the iucn_region local service
	 */
	public iucn_regionLocalService getiucn_regionLocalService() {
		return iucn_regionLocalService;
	}

	/**
	 * Sets the iucn_region local service.
	 *
	 * @param iucn_regionLocalService the iucn_region local service
	 */
	public void setiucn_regionLocalService(
		iucn_regionLocalService iucn_regionLocalService) {
		this.iucn_regionLocalService = iucn_regionLocalService;
	}

	/**
	 * Returns the iucn_region persistence.
	 *
	 * @return the iucn_region persistence
	 */
	public iucn_regionPersistence getiucn_regionPersistence() {
		return iucn_regionPersistence;
	}

	/**
	 * Sets the iucn_region persistence.
	 *
	 * @param iucn_regionPersistence the iucn_region persistence
	 */
	public void setiucn_regionPersistence(
		iucn_regionPersistence iucn_regionPersistence) {
		this.iucn_regionPersistence = iucn_regionPersistence;
	}

	/**
	 * Returns the iucn_region_country local service.
	 *
	 * @return the iucn_region_country local service
	 */
	public iucn_region_countryLocalService getiucn_region_countryLocalService() {
		return iucn_region_countryLocalService;
	}

	/**
	 * Sets the iucn_region_country local service.
	 *
	 * @param iucn_region_countryLocalService the iucn_region_country local service
	 */
	public void setiucn_region_countryLocalService(
		iucn_region_countryLocalService iucn_region_countryLocalService) {
		this.iucn_region_countryLocalService = iucn_region_countryLocalService;
	}

	/**
	 * Returns the iucn_region_country persistence.
	 *
	 * @return the iucn_region_country persistence
	 */
	public iucn_region_countryPersistence getiucn_region_countryPersistence() {
		return iucn_region_countryPersistence;
	}

	/**
	 * Sets the iucn_region_country persistence.
	 *
	 * @param iucn_region_countryPersistence the iucn_region_country persistence
	 */
	public void setiucn_region_countryPersistence(
		iucn_region_countryPersistence iucn_region_countryPersistence) {
		this.iucn_region_countryPersistence = iucn_region_countryPersistence;
	}

	/**
	 * Returns the key_conservation_issues local service.
	 *
	 * @return the key_conservation_issues local service
	 */
	public key_conservation_issuesLocalService getkey_conservation_issuesLocalService() {
		return key_conservation_issuesLocalService;
	}

	/**
	 * Sets the key_conservation_issues local service.
	 *
	 * @param key_conservation_issuesLocalService the key_conservation_issues local service
	 */
	public void setkey_conservation_issuesLocalService(
		key_conservation_issuesLocalService key_conservation_issuesLocalService) {
		this.key_conservation_issuesLocalService = key_conservation_issuesLocalService;
	}

	/**
	 * Returns the key_conservation_issues persistence.
	 *
	 * @return the key_conservation_issues persistence
	 */
	public key_conservation_issuesPersistence getkey_conservation_issuesPersistence() {
		return key_conservation_issuesPersistence;
	}

	/**
	 * Sets the key_conservation_issues persistence.
	 *
	 * @param key_conservation_issuesPersistence the key_conservation_issues persistence
	 */
	public void setkey_conservation_issuesPersistence(
		key_conservation_issuesPersistence key_conservation_issuesPersistence) {
		this.key_conservation_issuesPersistence = key_conservation_issuesPersistence;
	}

	/**
	 * Returns the key_conservation_scale_lkp local service.
	 *
	 * @return the key_conservation_scale_lkp local service
	 */
	public key_conservation_scale_lkpLocalService getkey_conservation_scale_lkpLocalService() {
		return key_conservation_scale_lkpLocalService;
	}

	/**
	 * Sets the key_conservation_scale_lkp local service.
	 *
	 * @param key_conservation_scale_lkpLocalService the key_conservation_scale_lkp local service
	 */
	public void setkey_conservation_scale_lkpLocalService(
		key_conservation_scale_lkpLocalService key_conservation_scale_lkpLocalService) {
		this.key_conservation_scale_lkpLocalService = key_conservation_scale_lkpLocalService;
	}

	/**
	 * Returns the key_conservation_scale_lkp persistence.
	 *
	 * @return the key_conservation_scale_lkp persistence
	 */
	public key_conservation_scale_lkpPersistence getkey_conservation_scale_lkpPersistence() {
		return key_conservation_scale_lkpPersistence;
	}

	/**
	 * Sets the key_conservation_scale_lkp persistence.
	 *
	 * @param key_conservation_scale_lkpPersistence the key_conservation_scale_lkp persistence
	 */
	public void setkey_conservation_scale_lkpPersistence(
		key_conservation_scale_lkpPersistence key_conservation_scale_lkpPersistence) {
		this.key_conservation_scale_lkpPersistence = key_conservation_scale_lkpPersistence;
	}

	/**
	 * Returns the mission_lkp local service.
	 *
	 * @return the mission_lkp local service
	 */
	public mission_lkpLocalService getmission_lkpLocalService() {
		return mission_lkpLocalService;
	}

	/**
	 * Sets the mission_lkp local service.
	 *
	 * @param mission_lkpLocalService the mission_lkp local service
	 */
	public void setmission_lkpLocalService(
		mission_lkpLocalService mission_lkpLocalService) {
		this.mission_lkpLocalService = mission_lkpLocalService;
	}

	/**
	 * Returns the mission_lkp persistence.
	 *
	 * @return the mission_lkp persistence
	 */
	public mission_lkpPersistence getmission_lkpPersistence() {
		return mission_lkpPersistence;
	}

	/**
	 * Sets the mission_lkp persistence.
	 *
	 * @param mission_lkpPersistence the mission_lkp persistence
	 */
	public void setmission_lkpPersistence(
		mission_lkpPersistence mission_lkpPersistence) {
		this.mission_lkpPersistence = mission_lkpPersistence;
	}

	/**
	 * Returns the negative_factors_level_impact local service.
	 *
	 * @return the negative_factors_level_impact local service
	 */
	public negative_factors_level_impactLocalService getnegative_factors_level_impactLocalService() {
		return negative_factors_level_impactLocalService;
	}

	/**
	 * Sets the negative_factors_level_impact local service.
	 *
	 * @param negative_factors_level_impactLocalService the negative_factors_level_impact local service
	 */
	public void setnegative_factors_level_impactLocalService(
		negative_factors_level_impactLocalService negative_factors_level_impactLocalService) {
		this.negative_factors_level_impactLocalService = negative_factors_level_impactLocalService;
	}

	/**
	 * Returns the negative_factors_level_impact persistence.
	 *
	 * @return the negative_factors_level_impact persistence
	 */
	public negative_factors_level_impactPersistence getnegative_factors_level_impactPersistence() {
		return negative_factors_level_impactPersistence;
	}

	/**
	 * Sets the negative_factors_level_impact persistence.
	 *
	 * @param negative_factors_level_impactPersistence the negative_factors_level_impact persistence
	 */
	public void setnegative_factors_level_impactPersistence(
		negative_factors_level_impactPersistence negative_factors_level_impactPersistence) {
		this.negative_factors_level_impactPersistence = negative_factors_level_impactPersistence;
	}

	/**
	 * Returns the negative_factors_trend local service.
	 *
	 * @return the negative_factors_trend local service
	 */
	public negative_factors_trendLocalService getnegative_factors_trendLocalService() {
		return negative_factors_trendLocalService;
	}

	/**
	 * Sets the negative_factors_trend local service.
	 *
	 * @param negative_factors_trendLocalService the negative_factors_trend local service
	 */
	public void setnegative_factors_trendLocalService(
		negative_factors_trendLocalService negative_factors_trendLocalService) {
		this.negative_factors_trendLocalService = negative_factors_trendLocalService;
	}

	/**
	 * Returns the negative_factors_trend persistence.
	 *
	 * @return the negative_factors_trend persistence
	 */
	public negative_factors_trendPersistence getnegative_factors_trendPersistence() {
		return negative_factors_trendPersistence;
	}

	/**
	 * Sets the negative_factors_trend persistence.
	 *
	 * @param negative_factors_trendPersistence the negative_factors_trend persistence
	 */
	public void setnegative_factors_trendPersistence(
		negative_factors_trendPersistence negative_factors_trendPersistence) {
		this.negative_factors_trendPersistence = negative_factors_trendPersistence;
	}

	/**
	 * Returns the other_designation_lkp local service.
	 *
	 * @return the other_designation_lkp local service
	 */
	public other_designation_lkpLocalService getother_designation_lkpLocalService() {
		return other_designation_lkpLocalService;
	}

	/**
	 * Sets the other_designation_lkp local service.
	 *
	 * @param other_designation_lkpLocalService the other_designation_lkp local service
	 */
	public void setother_designation_lkpLocalService(
		other_designation_lkpLocalService other_designation_lkpLocalService) {
		this.other_designation_lkpLocalService = other_designation_lkpLocalService;
	}

	/**
	 * Returns the other_designation_lkp persistence.
	 *
	 * @return the other_designation_lkp persistence
	 */
	public other_designation_lkpPersistence getother_designation_lkpPersistence() {
		return other_designation_lkpPersistence;
	}

	/**
	 * Sets the other_designation_lkp persistence.
	 *
	 * @param other_designation_lkpPersistence the other_designation_lkp persistence
	 */
	public void setother_designation_lkpPersistence(
		other_designation_lkpPersistence other_designation_lkpPersistence) {
		this.other_designation_lkpPersistence = other_designation_lkpPersistence;
	}

	/**
	 * Returns the potential_project_needs local service.
	 *
	 * @return the potential_project_needs local service
	 */
	public potential_project_needsLocalService getpotential_project_needsLocalService() {
		return potential_project_needsLocalService;
	}

	/**
	 * Sets the potential_project_needs local service.
	 *
	 * @param potential_project_needsLocalService the potential_project_needs local service
	 */
	public void setpotential_project_needsLocalService(
		potential_project_needsLocalService potential_project_needsLocalService) {
		this.potential_project_needsLocalService = potential_project_needsLocalService;
	}

	/**
	 * Returns the potential_project_needs persistence.
	 *
	 * @return the potential_project_needs persistence
	 */
	public potential_project_needsPersistence getpotential_project_needsPersistence() {
		return potential_project_needsPersistence;
	}

	/**
	 * Sets the potential_project_needs persistence.
	 *
	 * @param potential_project_needsPersistence the potential_project_needs persistence
	 */
	public void setpotential_project_needsPersistence(
		potential_project_needsPersistence potential_project_needsPersistence) {
		this.potential_project_needsPersistence = potential_project_needsPersistence;
	}

	/**
	 * Returns the potential_threat_assessment_cat local service.
	 *
	 * @return the potential_threat_assessment_cat local service
	 */
	public potential_threat_assessment_catLocalService getpotential_threat_assessment_catLocalService() {
		return potential_threat_assessment_catLocalService;
	}

	/**
	 * Sets the potential_threat_assessment_cat local service.
	 *
	 * @param potential_threat_assessment_catLocalService the potential_threat_assessment_cat local service
	 */
	public void setpotential_threat_assessment_catLocalService(
		potential_threat_assessment_catLocalService potential_threat_assessment_catLocalService) {
		this.potential_threat_assessment_catLocalService = potential_threat_assessment_catLocalService;
	}

	/**
	 * Returns the potential_threat_assessment_cat persistence.
	 *
	 * @return the potential_threat_assessment_cat persistence
	 */
	public potential_threat_assessment_catPersistence getpotential_threat_assessment_catPersistence() {
		return potential_threat_assessment_catPersistence;
	}

	/**
	 * Sets the potential_threat_assessment_cat persistence.
	 *
	 * @param potential_threat_assessment_catPersistence the potential_threat_assessment_cat persistence
	 */
	public void setpotential_threat_assessment_catPersistence(
		potential_threat_assessment_catPersistence potential_threat_assessment_catPersistence) {
		this.potential_threat_assessment_catPersistence = potential_threat_assessment_catPersistence;
	}

	/**
	 * Returns the potential_threat_values local service.
	 *
	 * @return the potential_threat_values local service
	 */
	public potential_threat_valuesLocalService getpotential_threat_valuesLocalService() {
		return potential_threat_valuesLocalService;
	}

	/**
	 * Sets the potential_threat_values local service.
	 *
	 * @param potential_threat_valuesLocalService the potential_threat_values local service
	 */
	public void setpotential_threat_valuesLocalService(
		potential_threat_valuesLocalService potential_threat_valuesLocalService) {
		this.potential_threat_valuesLocalService = potential_threat_valuesLocalService;
	}

	/**
	 * Returns the potential_threat_values persistence.
	 *
	 * @return the potential_threat_values persistence
	 */
	public potential_threat_valuesPersistence getpotential_threat_valuesPersistence() {
		return potential_threat_valuesPersistence;
	}

	/**
	 * Sets the potential_threat_values persistence.
	 *
	 * @param potential_threat_valuesPersistence the potential_threat_values persistence
	 */
	public void setpotential_threat_valuesPersistence(
		potential_threat_valuesPersistence potential_threat_valuesPersistence) {
		this.potential_threat_valuesPersistence = potential_threat_valuesPersistence;
	}

	/**
	 * Returns the prot_mgmt_best_practices local service.
	 *
	 * @return the prot_mgmt_best_practices local service
	 */
	public prot_mgmt_best_practicesLocalService getprot_mgmt_best_practicesLocalService() {
		return prot_mgmt_best_practicesLocalService;
	}

	/**
	 * Sets the prot_mgmt_best_practices local service.
	 *
	 * @param prot_mgmt_best_practicesLocalService the prot_mgmt_best_practices local service
	 */
	public void setprot_mgmt_best_practicesLocalService(
		prot_mgmt_best_practicesLocalService prot_mgmt_best_practicesLocalService) {
		this.prot_mgmt_best_practicesLocalService = prot_mgmt_best_practicesLocalService;
	}

	/**
	 * Returns the prot_mgmt_best_practices persistence.
	 *
	 * @return the prot_mgmt_best_practices persistence
	 */
	public prot_mgmt_best_practicesPersistence getprot_mgmt_best_practicesPersistence() {
		return prot_mgmt_best_practicesPersistence;
	}

	/**
	 * Sets the prot_mgmt_best_practices persistence.
	 *
	 * @param prot_mgmt_best_practicesPersistence the prot_mgmt_best_practices persistence
	 */
	public void setprot_mgmt_best_practicesPersistence(
		prot_mgmt_best_practicesPersistence prot_mgmt_best_practicesPersistence) {
		this.prot_mgmt_best_practicesPersistence = prot_mgmt_best_practicesPersistence;
	}

	/**
	 * Returns the prot_mgmt_overall local service.
	 *
	 * @return the prot_mgmt_overall local service
	 */
	public prot_mgmt_overallLocalService getprot_mgmt_overallLocalService() {
		return prot_mgmt_overallLocalService;
	}

	/**
	 * Sets the prot_mgmt_overall local service.
	 *
	 * @param prot_mgmt_overallLocalService the prot_mgmt_overall local service
	 */
	public void setprot_mgmt_overallLocalService(
		prot_mgmt_overallLocalService prot_mgmt_overallLocalService) {
		this.prot_mgmt_overallLocalService = prot_mgmt_overallLocalService;
	}

	/**
	 * Returns the prot_mgmt_overall persistence.
	 *
	 * @return the prot_mgmt_overall persistence
	 */
	public prot_mgmt_overallPersistence getprot_mgmt_overallPersistence() {
		return prot_mgmt_overallPersistence;
	}

	/**
	 * Sets the prot_mgmt_overall persistence.
	 *
	 * @param prot_mgmt_overallPersistence the prot_mgmt_overall persistence
	 */
	public void setprot_mgmt_overallPersistence(
		prot_mgmt_overallPersistence prot_mgmt_overallPersistence) {
		this.prot_mgmt_overallPersistence = prot_mgmt_overallPersistence;
	}

	/**
	 * Returns the protection_management local service.
	 *
	 * @return the protection_management local service
	 */
	public protection_managementLocalService getprotection_managementLocalService() {
		return protection_managementLocalService;
	}

	/**
	 * Sets the protection_management local service.
	 *
	 * @param protection_managementLocalService the protection_management local service
	 */
	public void setprotection_managementLocalService(
		protection_managementLocalService protection_managementLocalService) {
		this.protection_managementLocalService = protection_managementLocalService;
	}

	/**
	 * Returns the protection_management persistence.
	 *
	 * @return the protection_management persistence
	 */
	public protection_managementPersistence getprotection_managementPersistence() {
		return protection_managementPersistence;
	}

	/**
	 * Sets the protection_management persistence.
	 *
	 * @param protection_managementPersistence the protection_management persistence
	 */
	public void setprotection_managementPersistence(
		protection_managementPersistence protection_managementPersistence) {
		this.protection_managementPersistence = protection_managementPersistence;
	}

	/**
	 * Returns the protection_management_ratings_lkp local service.
	 *
	 * @return the protection_management_ratings_lkp local service
	 */
	public protection_management_ratings_lkpLocalService getprotection_management_ratings_lkpLocalService() {
		return protection_management_ratings_lkpLocalService;
	}

	/**
	 * Sets the protection_management_ratings_lkp local service.
	 *
	 * @param protection_management_ratings_lkpLocalService the protection_management_ratings_lkp local service
	 */
	public void setprotection_management_ratings_lkpLocalService(
		protection_management_ratings_lkpLocalService protection_management_ratings_lkpLocalService) {
		this.protection_management_ratings_lkpLocalService = protection_management_ratings_lkpLocalService;
	}

	/**
	 * Returns the protection_management_ratings_lkp persistence.
	 *
	 * @return the protection_management_ratings_lkp persistence
	 */
	public protection_management_ratings_lkpPersistence getprotection_management_ratings_lkpPersistence() {
		return protection_management_ratings_lkpPersistence;
	}

	/**
	 * Sets the protection_management_ratings_lkp persistence.
	 *
	 * @param protection_management_ratings_lkpPersistence the protection_management_ratings_lkp persistence
	 */
	public void setprotection_management_ratings_lkpPersistence(
		protection_management_ratings_lkpPersistence protection_management_ratings_lkpPersistence) {
		this.protection_management_ratings_lkpPersistence = protection_management_ratings_lkpPersistence;
	}

	/**
	 * Returns the protection_mgmt_checklist_lkp local service.
	 *
	 * @return the protection_mgmt_checklist_lkp local service
	 */
	public protection_mgmt_checklist_lkpLocalService getprotection_mgmt_checklist_lkpLocalService() {
		return protection_mgmt_checklist_lkpLocalService;
	}

	/**
	 * Sets the protection_mgmt_checklist_lkp local service.
	 *
	 * @param protection_mgmt_checklist_lkpLocalService the protection_mgmt_checklist_lkp local service
	 */
	public void setprotection_mgmt_checklist_lkpLocalService(
		protection_mgmt_checklist_lkpLocalService protection_mgmt_checklist_lkpLocalService) {
		this.protection_mgmt_checklist_lkpLocalService = protection_mgmt_checklist_lkpLocalService;
	}

	/**
	 * Returns the protection_mgmt_checklist_lkp persistence.
	 *
	 * @return the protection_mgmt_checklist_lkp persistence
	 */
	public protection_mgmt_checklist_lkpPersistence getprotection_mgmt_checklist_lkpPersistence() {
		return protection_mgmt_checklist_lkpPersistence;
	}

	/**
	 * Sets the protection_mgmt_checklist_lkp persistence.
	 *
	 * @param protection_mgmt_checklist_lkpPersistence the protection_mgmt_checklist_lkp persistence
	 */
	public void setprotection_mgmt_checklist_lkpPersistence(
		protection_mgmt_checklist_lkpPersistence protection_mgmt_checklist_lkpPersistence) {
		this.protection_mgmt_checklist_lkpPersistence = protection_mgmt_checklist_lkpPersistence;
	}

	/**
	 * Returns the recommendation_type_lkp local service.
	 *
	 * @return the recommendation_type_lkp local service
	 */
	public recommendation_type_lkpLocalService getrecommendation_type_lkpLocalService() {
		return recommendation_type_lkpLocalService;
	}

	/**
	 * Sets the recommendation_type_lkp local service.
	 *
	 * @param recommendation_type_lkpLocalService the recommendation_type_lkp local service
	 */
	public void setrecommendation_type_lkpLocalService(
		recommendation_type_lkpLocalService recommendation_type_lkpLocalService) {
		this.recommendation_type_lkpLocalService = recommendation_type_lkpLocalService;
	}

	/**
	 * Returns the recommendation_type_lkp persistence.
	 *
	 * @return the recommendation_type_lkp persistence
	 */
	public recommendation_type_lkpPersistence getrecommendation_type_lkpPersistence() {
		return recommendation_type_lkpPersistence;
	}

	/**
	 * Sets the recommendation_type_lkp persistence.
	 *
	 * @param recommendation_type_lkpPersistence the recommendation_type_lkp persistence
	 */
	public void setrecommendation_type_lkpPersistence(
		recommendation_type_lkpPersistence recommendation_type_lkpPersistence) {
		this.recommendation_type_lkpPersistence = recommendation_type_lkpPersistence;
	}

	/**
	 * Returns the references local service.
	 *
	 * @return the references local service
	 */
	public referencesLocalService getreferencesLocalService() {
		return referencesLocalService;
	}

	/**
	 * Sets the references local service.
	 *
	 * @param referencesLocalService the references local service
	 */
	public void setreferencesLocalService(
		referencesLocalService referencesLocalService) {
		this.referencesLocalService = referencesLocalService;
	}

	/**
	 * Returns the references persistence.
	 *
	 * @return the references persistence
	 */
	public referencesPersistence getreferencesPersistence() {
		return referencesPersistence;
	}

	/**
	 * Sets the references persistence.
	 *
	 * @param referencesPersistence the references persistence
	 */
	public void setreferencesPersistence(
		referencesPersistence referencesPersistence) {
		this.referencesPersistence = referencesPersistence;
	}

	/**
	 * Returns the reinforced_monitoring local service.
	 *
	 * @return the reinforced_monitoring local service
	 */
	public reinforced_monitoringLocalService getreinforced_monitoringLocalService() {
		return reinforced_monitoringLocalService;
	}

	/**
	 * Sets the reinforced_monitoring local service.
	 *
	 * @param reinforced_monitoringLocalService the reinforced_monitoring local service
	 */
	public void setreinforced_monitoringLocalService(
		reinforced_monitoringLocalService reinforced_monitoringLocalService) {
		this.reinforced_monitoringLocalService = reinforced_monitoringLocalService;
	}

	/**
	 * Returns the reinforced_monitoring persistence.
	 *
	 * @return the reinforced_monitoring persistence
	 */
	public reinforced_monitoringPersistence getreinforced_monitoringPersistence() {
		return reinforced_monitoringPersistence;
	}

	/**
	 * Sets the reinforced_monitoring persistence.
	 *
	 * @param reinforced_monitoringPersistence the reinforced_monitoring persistence
	 */
	public void setreinforced_monitoringPersistence(
		reinforced_monitoringPersistence reinforced_monitoringPersistence) {
		this.reinforced_monitoringPersistence = reinforced_monitoringPersistence;
	}

	/**
	 * Returns the site_assessment local service.
	 *
	 * @return the site_assessment local service
	 */
	public site_assessmentLocalService getsite_assessmentLocalService() {
		return site_assessmentLocalService;
	}

	/**
	 * Sets the site_assessment local service.
	 *
	 * @param site_assessmentLocalService the site_assessment local service
	 */
	public void setsite_assessmentLocalService(
		site_assessmentLocalService site_assessmentLocalService) {
		this.site_assessmentLocalService = site_assessmentLocalService;
	}

	/**
	 * Returns the site_assessment persistence.
	 *
	 * @return the site_assessment persistence
	 */
	public site_assessmentPersistence getsite_assessmentPersistence() {
		return site_assessmentPersistence;
	}

	/**
	 * Sets the site_assessment persistence.
	 *
	 * @param site_assessmentPersistence the site_assessment persistence
	 */
	public void setsite_assessmentPersistence(
		site_assessmentPersistence site_assessmentPersistence) {
		this.site_assessmentPersistence = site_assessmentPersistence;
	}

	/**
	 * Returns the site_assessment finder.
	 *
	 * @return the site_assessment finder
	 */
	public site_assessmentFinder getsite_assessmentFinder() {
		return site_assessmentFinder;
	}

	/**
	 * Sets the site_assessment finder.
	 *
	 * @param site_assessmentFinder the site_assessment finder
	 */
	public void setsite_assessmentFinder(
		site_assessmentFinder site_assessmentFinder) {
		this.site_assessmentFinder = site_assessmentFinder;
	}

	/**
	 * Returns the site_assessment_versions local service.
	 *
	 * @return the site_assessment_versions local service
	 */
	public site_assessment_versionsLocalService getsite_assessment_versionsLocalService() {
		return site_assessment_versionsLocalService;
	}

	/**
	 * Sets the site_assessment_versions local service.
	 *
	 * @param site_assessment_versionsLocalService the site_assessment_versions local service
	 */
	public void setsite_assessment_versionsLocalService(
		site_assessment_versionsLocalService site_assessment_versionsLocalService) {
		this.site_assessment_versionsLocalService = site_assessment_versionsLocalService;
	}

	/**
	 * Returns the site_assessment_versions persistence.
	 *
	 * @return the site_assessment_versions persistence
	 */
	public site_assessment_versionsPersistence getsite_assessment_versionsPersistence() {
		return site_assessment_versionsPersistence;
	}

	/**
	 * Sets the site_assessment_versions persistence.
	 *
	 * @param site_assessment_versionsPersistence the site_assessment_versions persistence
	 */
	public void setsite_assessment_versionsPersistence(
		site_assessment_versionsPersistence site_assessment_versionsPersistence) {
		this.site_assessment_versionsPersistence = site_assessment_versionsPersistence;
	}

	/**
	 * Returns the site_assessment_versions finder.
	 *
	 * @return the site_assessment_versions finder
	 */
	public site_assessment_versionsFinder getsite_assessment_versionsFinder() {
		return site_assessment_versionsFinder;
	}

	/**
	 * Sets the site_assessment_versions finder.
	 *
	 * @param site_assessment_versionsFinder the site_assessment_versions finder
	 */
	public void setsite_assessment_versionsFinder(
		site_assessment_versionsFinder site_assessment_versionsFinder) {
		this.site_assessment_versionsFinder = site_assessment_versionsFinder;
	}

	/**
	 * Returns the sites_thematic local service.
	 *
	 * @return the sites_thematic local service
	 */
	public sites_thematicLocalService getsites_thematicLocalService() {
		return sites_thematicLocalService;
	}

	/**
	 * Sets the sites_thematic local service.
	 *
	 * @param sites_thematicLocalService the sites_thematic local service
	 */
	public void setsites_thematicLocalService(
		sites_thematicLocalService sites_thematicLocalService) {
		this.sites_thematicLocalService = sites_thematicLocalService;
	}

	/**
	 * Returns the sites_thematic persistence.
	 *
	 * @return the sites_thematic persistence
	 */
	public sites_thematicPersistence getsites_thematicPersistence() {
		return sites_thematicPersistence;
	}

	/**
	 * Sets the sites_thematic persistence.
	 *
	 * @param sites_thematicPersistence the sites_thematic persistence
	 */
	public void setsites_thematicPersistence(
		sites_thematicPersistence sites_thematicPersistence) {
		this.sites_thematicPersistence = sites_thematicPersistence;
	}

	/**
	 * Returns the state_lkp local service.
	 *
	 * @return the state_lkp local service
	 */
	public state_lkpLocalService getstate_lkpLocalService() {
		return state_lkpLocalService;
	}

	/**
	 * Sets the state_lkp local service.
	 *
	 * @param state_lkpLocalService the state_lkp local service
	 */
	public void setstate_lkpLocalService(
		state_lkpLocalService state_lkpLocalService) {
		this.state_lkpLocalService = state_lkpLocalService;
	}

	/**
	 * Returns the state_lkp persistence.
	 *
	 * @return the state_lkp persistence
	 */
	public state_lkpPersistence getstate_lkpPersistence() {
		return state_lkpPersistence;
	}

	/**
	 * Sets the state_lkp persistence.
	 *
	 * @param state_lkpPersistence the state_lkp persistence
	 */
	public void setstate_lkpPersistence(
		state_lkpPersistence state_lkpPersistence) {
		this.state_lkpPersistence = state_lkpPersistence;
	}

	/**
	 * Returns the state_trend_biodivvals local service.
	 *
	 * @return the state_trend_biodivvals local service
	 */
	public state_trend_biodivvalsLocalService getstate_trend_biodivvalsLocalService() {
		return state_trend_biodivvalsLocalService;
	}

	/**
	 * Sets the state_trend_biodivvals local service.
	 *
	 * @param state_trend_biodivvalsLocalService the state_trend_biodivvals local service
	 */
	public void setstate_trend_biodivvalsLocalService(
		state_trend_biodivvalsLocalService state_trend_biodivvalsLocalService) {
		this.state_trend_biodivvalsLocalService = state_trend_biodivvalsLocalService;
	}

	/**
	 * Returns the state_trend_biodivvals persistence.
	 *
	 * @return the state_trend_biodivvals persistence
	 */
	public state_trend_biodivvalsPersistence getstate_trend_biodivvalsPersistence() {
		return state_trend_biodivvalsPersistence;
	}

	/**
	 * Sets the state_trend_biodivvals persistence.
	 *
	 * @param state_trend_biodivvalsPersistence the state_trend_biodivvals persistence
	 */
	public void setstate_trend_biodivvalsPersistence(
		state_trend_biodivvalsPersistence state_trend_biodivvalsPersistence) {
		this.state_trend_biodivvalsPersistence = state_trend_biodivvalsPersistence;
	}

	/**
	 * Returns the state_trend_whvalues local service.
	 *
	 * @return the state_trend_whvalues local service
	 */
	public state_trend_whvaluesLocalService getstate_trend_whvaluesLocalService() {
		return state_trend_whvaluesLocalService;
	}

	/**
	 * Sets the state_trend_whvalues local service.
	 *
	 * @param state_trend_whvaluesLocalService the state_trend_whvalues local service
	 */
	public void setstate_trend_whvaluesLocalService(
		state_trend_whvaluesLocalService state_trend_whvaluesLocalService) {
		this.state_trend_whvaluesLocalService = state_trend_whvaluesLocalService;
	}

	/**
	 * Returns the state_trend_whvalues persistence.
	 *
	 * @return the state_trend_whvalues persistence
	 */
	public state_trend_whvaluesPersistence getstate_trend_whvaluesPersistence() {
		return state_trend_whvaluesPersistence;
	}

	/**
	 * Sets the state_trend_whvalues persistence.
	 *
	 * @param state_trend_whvaluesPersistence the state_trend_whvalues persistence
	 */
	public void setstate_trend_whvaluesPersistence(
		state_trend_whvaluesPersistence state_trend_whvaluesPersistence) {
		this.state_trend_whvaluesPersistence = state_trend_whvaluesPersistence;
	}

	/**
	 * Returns the thematic_lkp local service.
	 *
	 * @return the thematic_lkp local service
	 */
	public thematic_lkpLocalService getthematic_lkpLocalService() {
		return thematic_lkpLocalService;
	}

	/**
	 * Sets the thematic_lkp local service.
	 *
	 * @param thematic_lkpLocalService the thematic_lkp local service
	 */
	public void setthematic_lkpLocalService(
		thematic_lkpLocalService thematic_lkpLocalService) {
		this.thematic_lkpLocalService = thematic_lkpLocalService;
	}

	/**
	 * Returns the thematic_lkp persistence.
	 *
	 * @return the thematic_lkp persistence
	 */
	public thematic_lkpPersistence getthematic_lkpPersistence() {
		return thematic_lkpPersistence;
	}

	/**
	 * Sets the thematic_lkp persistence.
	 *
	 * @param thematic_lkpPersistence the thematic_lkp persistence
	 */
	public void setthematic_lkpPersistence(
		thematic_lkpPersistence thematic_lkpPersistence) {
		this.thematic_lkpPersistence = thematic_lkpPersistence;
	}

	/**
	 * Returns the threat_categories_lkp local service.
	 *
	 * @return the threat_categories_lkp local service
	 */
	public threat_categories_lkpLocalService getthreat_categories_lkpLocalService() {
		return threat_categories_lkpLocalService;
	}

	/**
	 * Sets the threat_categories_lkp local service.
	 *
	 * @param threat_categories_lkpLocalService the threat_categories_lkp local service
	 */
	public void setthreat_categories_lkpLocalService(
		threat_categories_lkpLocalService threat_categories_lkpLocalService) {
		this.threat_categories_lkpLocalService = threat_categories_lkpLocalService;
	}

	/**
	 * Returns the threat_categories_lkp persistence.
	 *
	 * @return the threat_categories_lkp persistence
	 */
	public threat_categories_lkpPersistence getthreat_categories_lkpPersistence() {
		return threat_categories_lkpPersistence;
	}

	/**
	 * Sets the threat_categories_lkp persistence.
	 *
	 * @param threat_categories_lkpPersistence the threat_categories_lkp persistence
	 */
	public void setthreat_categories_lkpPersistence(
		threat_categories_lkpPersistence threat_categories_lkpPersistence) {
		this.threat_categories_lkpPersistence = threat_categories_lkpPersistence;
	}

	/**
	 * Returns the threat_rating_lkp local service.
	 *
	 * @return the threat_rating_lkp local service
	 */
	public threat_rating_lkpLocalService getthreat_rating_lkpLocalService() {
		return threat_rating_lkpLocalService;
	}

	/**
	 * Sets the threat_rating_lkp local service.
	 *
	 * @param threat_rating_lkpLocalService the threat_rating_lkp local service
	 */
	public void setthreat_rating_lkpLocalService(
		threat_rating_lkpLocalService threat_rating_lkpLocalService) {
		this.threat_rating_lkpLocalService = threat_rating_lkpLocalService;
	}

	/**
	 * Returns the threat_rating_lkp persistence.
	 *
	 * @return the threat_rating_lkp persistence
	 */
	public threat_rating_lkpPersistence getthreat_rating_lkpPersistence() {
		return threat_rating_lkpPersistence;
	}

	/**
	 * Sets the threat_rating_lkp persistence.
	 *
	 * @param threat_rating_lkpPersistence the threat_rating_lkp persistence
	 */
	public void setthreat_rating_lkpPersistence(
		threat_rating_lkpPersistence threat_rating_lkpPersistence) {
		this.threat_rating_lkpPersistence = threat_rating_lkpPersistence;
	}

	/**
	 * Returns the threat_subcategories_lkp local service.
	 *
	 * @return the threat_subcategories_lkp local service
	 */
	public threat_subcategories_lkpLocalService getthreat_subcategories_lkpLocalService() {
		return threat_subcategories_lkpLocalService;
	}

	/**
	 * Sets the threat_subcategories_lkp local service.
	 *
	 * @param threat_subcategories_lkpLocalService the threat_subcategories_lkp local service
	 */
	public void setthreat_subcategories_lkpLocalService(
		threat_subcategories_lkpLocalService threat_subcategories_lkpLocalService) {
		this.threat_subcategories_lkpLocalService = threat_subcategories_lkpLocalService;
	}

	/**
	 * Returns the threat_subcategories_lkp persistence.
	 *
	 * @return the threat_subcategories_lkp persistence
	 */
	public threat_subcategories_lkpPersistence getthreat_subcategories_lkpPersistence() {
		return threat_subcategories_lkpPersistence;
	}

	/**
	 * Sets the threat_subcategories_lkp persistence.
	 *
	 * @param threat_subcategories_lkpPersistence the threat_subcategories_lkp persistence
	 */
	public void setthreat_subcategories_lkpPersistence(
		threat_subcategories_lkpPersistence threat_subcategories_lkpPersistence) {
		this.threat_subcategories_lkpPersistence = threat_subcategories_lkpPersistence;
	}

	/**
	 * Returns the threat_summary_current local service.
	 *
	 * @return the threat_summary_current local service
	 */
	public threat_summary_currentLocalService getthreat_summary_currentLocalService() {
		return threat_summary_currentLocalService;
	}

	/**
	 * Sets the threat_summary_current local service.
	 *
	 * @param threat_summary_currentLocalService the threat_summary_current local service
	 */
	public void setthreat_summary_currentLocalService(
		threat_summary_currentLocalService threat_summary_currentLocalService) {
		this.threat_summary_currentLocalService = threat_summary_currentLocalService;
	}

	/**
	 * Returns the threat_summary_current persistence.
	 *
	 * @return the threat_summary_current persistence
	 */
	public threat_summary_currentPersistence getthreat_summary_currentPersistence() {
		return threat_summary_currentPersistence;
	}

	/**
	 * Sets the threat_summary_current persistence.
	 *
	 * @param threat_summary_currentPersistence the threat_summary_current persistence
	 */
	public void setthreat_summary_currentPersistence(
		threat_summary_currentPersistence threat_summary_currentPersistence) {
		this.threat_summary_currentPersistence = threat_summary_currentPersistence;
	}

	/**
	 * Returns the threat_summary_overall local service.
	 *
	 * @return the threat_summary_overall local service
	 */
	public threat_summary_overallLocalService getthreat_summary_overallLocalService() {
		return threat_summary_overallLocalService;
	}

	/**
	 * Sets the threat_summary_overall local service.
	 *
	 * @param threat_summary_overallLocalService the threat_summary_overall local service
	 */
	public void setthreat_summary_overallLocalService(
		threat_summary_overallLocalService threat_summary_overallLocalService) {
		this.threat_summary_overallLocalService = threat_summary_overallLocalService;
	}

	/**
	 * Returns the threat_summary_overall persistence.
	 *
	 * @return the threat_summary_overall persistence
	 */
	public threat_summary_overallPersistence getthreat_summary_overallPersistence() {
		return threat_summary_overallPersistence;
	}

	/**
	 * Sets the threat_summary_overall persistence.
	 *
	 * @param threat_summary_overallPersistence the threat_summary_overall persistence
	 */
	public void setthreat_summary_overallPersistence(
		threat_summary_overallPersistence threat_summary_overallPersistence) {
		this.threat_summary_overallPersistence = threat_summary_overallPersistence;
	}

	/**
	 * Returns the threat_summary_potential local service.
	 *
	 * @return the threat_summary_potential local service
	 */
	public threat_summary_potentialLocalService getthreat_summary_potentialLocalService() {
		return threat_summary_potentialLocalService;
	}

	/**
	 * Sets the threat_summary_potential local service.
	 *
	 * @param threat_summary_potentialLocalService the threat_summary_potential local service
	 */
	public void setthreat_summary_potentialLocalService(
		threat_summary_potentialLocalService threat_summary_potentialLocalService) {
		this.threat_summary_potentialLocalService = threat_summary_potentialLocalService;
	}

	/**
	 * Returns the threat_summary_potential persistence.
	 *
	 * @return the threat_summary_potential persistence
	 */
	public threat_summary_potentialPersistence getthreat_summary_potentialPersistence() {
		return threat_summary_potentialPersistence;
	}

	/**
	 * Sets the threat_summary_potential persistence.
	 *
	 * @param threat_summary_potentialPersistence the threat_summary_potential persistence
	 */
	public void setthreat_summary_potentialPersistence(
		threat_summary_potentialPersistence threat_summary_potentialPersistence) {
		this.threat_summary_potentialPersistence = threat_summary_potentialPersistence;
	}

	/**
	 * Returns the trend_lkp local service.
	 *
	 * @return the trend_lkp local service
	 */
	public trend_lkpLocalService gettrend_lkpLocalService() {
		return trend_lkpLocalService;
	}

	/**
	 * Sets the trend_lkp local service.
	 *
	 * @param trend_lkpLocalService the trend_lkp local service
	 */
	public void settrend_lkpLocalService(
		trend_lkpLocalService trend_lkpLocalService) {
		this.trend_lkpLocalService = trend_lkpLocalService;
	}

	/**
	 * Returns the trend_lkp persistence.
	 *
	 * @return the trend_lkp persistence
	 */
	public trend_lkpPersistence gettrend_lkpPersistence() {
		return trend_lkpPersistence;
	}

	/**
	 * Sets the trend_lkp persistence.
	 *
	 * @param trend_lkpPersistence the trend_lkp persistence
	 */
	public void settrend_lkpPersistence(
		trend_lkpPersistence trend_lkpPersistence) {
		this.trend_lkpPersistence = trend_lkpPersistence;
	}

	/**
	 * Returns the unesco_region local service.
	 *
	 * @return the unesco_region local service
	 */
	public unesco_regionLocalService getunesco_regionLocalService() {
		return unesco_regionLocalService;
	}

	/**
	 * Sets the unesco_region local service.
	 *
	 * @param unesco_regionLocalService the unesco_region local service
	 */
	public void setunesco_regionLocalService(
		unesco_regionLocalService unesco_regionLocalService) {
		this.unesco_regionLocalService = unesco_regionLocalService;
	}

	/**
	 * Returns the unesco_region persistence.
	 *
	 * @return the unesco_region persistence
	 */
	public unesco_regionPersistence getunesco_regionPersistence() {
		return unesco_regionPersistence;
	}

	/**
	 * Sets the unesco_region persistence.
	 *
	 * @param unesco_regionPersistence the unesco_region persistence
	 */
	public void setunesco_regionPersistence(
		unesco_regionPersistence unesco_regionPersistence) {
		this.unesco_regionPersistence = unesco_regionPersistence;
	}

	/**
	 * Returns the unesco_region_country local service.
	 *
	 * @return the unesco_region_country local service
	 */
	public unesco_region_countryLocalService getunesco_region_countryLocalService() {
		return unesco_region_countryLocalService;
	}

	/**
	 * Sets the unesco_region_country local service.
	 *
	 * @param unesco_region_countryLocalService the unesco_region_country local service
	 */
	public void setunesco_region_countryLocalService(
		unesco_region_countryLocalService unesco_region_countryLocalService) {
		this.unesco_region_countryLocalService = unesco_region_countryLocalService;
	}

	/**
	 * Returns the unesco_region_country persistence.
	 *
	 * @return the unesco_region_country persistence
	 */
	public unesco_region_countryPersistence getunesco_region_countryPersistence() {
		return unesco_region_countryPersistence;
	}

	/**
	 * Sets the unesco_region_country persistence.
	 *
	 * @param unesco_region_countryPersistence the unesco_region_country persistence
	 */
	public void setunesco_region_countryPersistence(
		unesco_region_countryPersistence unesco_region_countryPersistence) {
		this.unesco_region_countryPersistence = unesco_region_countryPersistence;
	}

	/**
	 * Returns the whp_contact local service.
	 *
	 * @return the whp_contact local service
	 */
	public whp_contactLocalService getwhp_contactLocalService() {
		return whp_contactLocalService;
	}

	/**
	 * Sets the whp_contact local service.
	 *
	 * @param whp_contactLocalService the whp_contact local service
	 */
	public void setwhp_contactLocalService(
		whp_contactLocalService whp_contactLocalService) {
		this.whp_contactLocalService = whp_contactLocalService;
	}

	/**
	 * Returns the whp_contact persistence.
	 *
	 * @return the whp_contact persistence
	 */
	public whp_contactPersistence getwhp_contactPersistence() {
		return whp_contactPersistence;
	}

	/**
	 * Sets the whp_contact persistence.
	 *
	 * @param whp_contactPersistence the whp_contact persistence
	 */
	public void setwhp_contactPersistence(
		whp_contactPersistence whp_contactPersistence) {
		this.whp_contactPersistence = whp_contactPersistence;
	}

	/**
	 * Returns the whp_criteria_lkp local service.
	 *
	 * @return the whp_criteria_lkp local service
	 */
	public whp_criteria_lkpLocalService getwhp_criteria_lkpLocalService() {
		return whp_criteria_lkpLocalService;
	}

	/**
	 * Sets the whp_criteria_lkp local service.
	 *
	 * @param whp_criteria_lkpLocalService the whp_criteria_lkp local service
	 */
	public void setwhp_criteria_lkpLocalService(
		whp_criteria_lkpLocalService whp_criteria_lkpLocalService) {
		this.whp_criteria_lkpLocalService = whp_criteria_lkpLocalService;
	}

	/**
	 * Returns the whp_criteria_lkp persistence.
	 *
	 * @return the whp_criteria_lkp persistence
	 */
	public whp_criteria_lkpPersistence getwhp_criteria_lkpPersistence() {
		return whp_criteria_lkpPersistence;
	}

	/**
	 * Sets the whp_criteria_lkp persistence.
	 *
	 * @param whp_criteria_lkpPersistence the whp_criteria_lkp persistence
	 */
	public void setwhp_criteria_lkpPersistence(
		whp_criteria_lkpPersistence whp_criteria_lkpPersistence) {
		this.whp_criteria_lkpPersistence = whp_criteria_lkpPersistence;
	}

	/**
	 * Returns the whp_site_danger_list local service.
	 *
	 * @return the whp_site_danger_list local service
	 */
	public whp_site_danger_listLocalService getwhp_site_danger_listLocalService() {
		return whp_site_danger_listLocalService;
	}

	/**
	 * Sets the whp_site_danger_list local service.
	 *
	 * @param whp_site_danger_listLocalService the whp_site_danger_list local service
	 */
	public void setwhp_site_danger_listLocalService(
		whp_site_danger_listLocalService whp_site_danger_listLocalService) {
		this.whp_site_danger_listLocalService = whp_site_danger_listLocalService;
	}

	/**
	 * Returns the whp_site_danger_list remote service.
	 *
	 * @return the whp_site_danger_list remote service
	 */
	public whp_site_danger_listService getwhp_site_danger_listService() {
		return whp_site_danger_listService;
	}

	/**
	 * Sets the whp_site_danger_list remote service.
	 *
	 * @param whp_site_danger_listService the whp_site_danger_list remote service
	 */
	public void setwhp_site_danger_listService(
		whp_site_danger_listService whp_site_danger_listService) {
		this.whp_site_danger_listService = whp_site_danger_listService;
	}

	/**
	 * Returns the whp_site_danger_list persistence.
	 *
	 * @return the whp_site_danger_list persistence
	 */
	public whp_site_danger_listPersistence getwhp_site_danger_listPersistence() {
		return whp_site_danger_listPersistence;
	}

	/**
	 * Sets the whp_site_danger_list persistence.
	 *
	 * @param whp_site_danger_listPersistence the whp_site_danger_list persistence
	 */
	public void setwhp_site_danger_listPersistence(
		whp_site_danger_listPersistence whp_site_danger_listPersistence) {
		this.whp_site_danger_listPersistence = whp_site_danger_listPersistence;
	}

	/**
	 * Returns the whp_sites local service.
	 *
	 * @return the whp_sites local service
	 */
	public whp_sitesLocalService getwhp_sitesLocalService() {
		return whp_sitesLocalService;
	}

	/**
	 * Sets the whp_sites local service.
	 *
	 * @param whp_sitesLocalService the whp_sites local service
	 */
	public void setwhp_sitesLocalService(
		whp_sitesLocalService whp_sitesLocalService) {
		this.whp_sitesLocalService = whp_sitesLocalService;
	}

	/**
	 * Returns the whp_sites remote service.
	 *
	 * @return the whp_sites remote service
	 */
	public whp_sitesService getwhp_sitesService() {
		return whp_sitesService;
	}

	/**
	 * Sets the whp_sites remote service.
	 *
	 * @param whp_sitesService the whp_sites remote service
	 */
	public void setwhp_sitesService(whp_sitesService whp_sitesService) {
		this.whp_sitesService = whp_sitesService;
	}

	/**
	 * Returns the whp_sites persistence.
	 *
	 * @return the whp_sites persistence
	 */
	public whp_sitesPersistence getwhp_sitesPersistence() {
		return whp_sitesPersistence;
	}

	/**
	 * Sets the whp_sites persistence.
	 *
	 * @param whp_sitesPersistence the whp_sites persistence
	 */
	public void setwhp_sitesPersistence(
		whp_sitesPersistence whp_sitesPersistence) {
		this.whp_sitesPersistence = whp_sitesPersistence;
	}

	/**
	 * Returns the whp_sites finder.
	 *
	 * @return the whp_sites finder
	 */
	public whp_sitesFinder getwhp_sitesFinder() {
		return whp_sitesFinder;
	}

	/**
	 * Sets the whp_sites finder.
	 *
	 * @param whp_sitesFinder the whp_sites finder
	 */
	public void setwhp_sitesFinder(whp_sitesFinder whp_sitesFinder) {
		this.whp_sitesFinder = whp_sitesFinder;
	}

	/**
	 * Returns the whp_sites_boundary_modification local service.
	 *
	 * @return the whp_sites_boundary_modification local service
	 */
	public whp_sites_boundary_modificationLocalService getwhp_sites_boundary_modificationLocalService() {
		return whp_sites_boundary_modificationLocalService;
	}

	/**
	 * Sets the whp_sites_boundary_modification local service.
	 *
	 * @param whp_sites_boundary_modificationLocalService the whp_sites_boundary_modification local service
	 */
	public void setwhp_sites_boundary_modificationLocalService(
		whp_sites_boundary_modificationLocalService whp_sites_boundary_modificationLocalService) {
		this.whp_sites_boundary_modificationLocalService = whp_sites_boundary_modificationLocalService;
	}

	/**
	 * Returns the whp_sites_boundary_modification persistence.
	 *
	 * @return the whp_sites_boundary_modification persistence
	 */
	public whp_sites_boundary_modificationPersistence getwhp_sites_boundary_modificationPersistence() {
		return whp_sites_boundary_modificationPersistence;
	}

	/**
	 * Sets the whp_sites_boundary_modification persistence.
	 *
	 * @param whp_sites_boundary_modificationPersistence the whp_sites_boundary_modification persistence
	 */
	public void setwhp_sites_boundary_modificationPersistence(
		whp_sites_boundary_modificationPersistence whp_sites_boundary_modificationPersistence) {
		this.whp_sites_boundary_modificationPersistence = whp_sites_boundary_modificationPersistence;
	}

	/**
	 * Returns the whp_sites_budget local service.
	 *
	 * @return the whp_sites_budget local service
	 */
	public whp_sites_budgetLocalService getwhp_sites_budgetLocalService() {
		return whp_sites_budgetLocalService;
	}

	/**
	 * Sets the whp_sites_budget local service.
	 *
	 * @param whp_sites_budgetLocalService the whp_sites_budget local service
	 */
	public void setwhp_sites_budgetLocalService(
		whp_sites_budgetLocalService whp_sites_budgetLocalService) {
		this.whp_sites_budgetLocalService = whp_sites_budgetLocalService;
	}

	/**
	 * Returns the whp_sites_budget persistence.
	 *
	 * @return the whp_sites_budget persistence
	 */
	public whp_sites_budgetPersistence getwhp_sites_budgetPersistence() {
		return whp_sites_budgetPersistence;
	}

	/**
	 * Sets the whp_sites_budget persistence.
	 *
	 * @param whp_sites_budgetPersistence the whp_sites_budget persistence
	 */
	public void setwhp_sites_budgetPersistence(
		whp_sites_budgetPersistence whp_sites_budgetPersistence) {
		this.whp_sites_budgetPersistence = whp_sites_budgetPersistence;
	}

	/**
	 * Returns the whp_sites_component local service.
	 *
	 * @return the whp_sites_component local service
	 */
	public whp_sites_componentLocalService getwhp_sites_componentLocalService() {
		return whp_sites_componentLocalService;
	}

	/**
	 * Sets the whp_sites_component local service.
	 *
	 * @param whp_sites_componentLocalService the whp_sites_component local service
	 */
	public void setwhp_sites_componentLocalService(
		whp_sites_componentLocalService whp_sites_componentLocalService) {
		this.whp_sites_componentLocalService = whp_sites_componentLocalService;
	}

	/**
	 * Returns the whp_sites_component persistence.
	 *
	 * @return the whp_sites_component persistence
	 */
	public whp_sites_componentPersistence getwhp_sites_componentPersistence() {
		return whp_sites_componentPersistence;
	}

	/**
	 * Sets the whp_sites_component persistence.
	 *
	 * @param whp_sites_componentPersistence the whp_sites_component persistence
	 */
	public void setwhp_sites_componentPersistence(
		whp_sites_componentPersistence whp_sites_componentPersistence) {
		this.whp_sites_componentPersistence = whp_sites_componentPersistence;
	}

	/**
	 * Returns the whp_sites_contacts local service.
	 *
	 * @return the whp_sites_contacts local service
	 */
	public whp_sites_contactsLocalService getwhp_sites_contactsLocalService() {
		return whp_sites_contactsLocalService;
	}

	/**
	 * Sets the whp_sites_contacts local service.
	 *
	 * @param whp_sites_contactsLocalService the whp_sites_contacts local service
	 */
	public void setwhp_sites_contactsLocalService(
		whp_sites_contactsLocalService whp_sites_contactsLocalService) {
		this.whp_sites_contactsLocalService = whp_sites_contactsLocalService;
	}

	/**
	 * Returns the whp_sites_contacts persistence.
	 *
	 * @return the whp_sites_contacts persistence
	 */
	public whp_sites_contactsPersistence getwhp_sites_contactsPersistence() {
		return whp_sites_contactsPersistence;
	}

	/**
	 * Sets the whp_sites_contacts persistence.
	 *
	 * @param whp_sites_contactsPersistence the whp_sites_contacts persistence
	 */
	public void setwhp_sites_contactsPersistence(
		whp_sites_contactsPersistence whp_sites_contactsPersistence) {
		this.whp_sites_contactsPersistence = whp_sites_contactsPersistence;
	}

	/**
	 * Returns the whp_sites_country local service.
	 *
	 * @return the whp_sites_country local service
	 */
	public whp_sites_countryLocalService getwhp_sites_countryLocalService() {
		return whp_sites_countryLocalService;
	}

	/**
	 * Sets the whp_sites_country local service.
	 *
	 * @param whp_sites_countryLocalService the whp_sites_country local service
	 */
	public void setwhp_sites_countryLocalService(
		whp_sites_countryLocalService whp_sites_countryLocalService) {
		this.whp_sites_countryLocalService = whp_sites_countryLocalService;
	}

	/**
	 * Returns the whp_sites_country persistence.
	 *
	 * @return the whp_sites_country persistence
	 */
	public whp_sites_countryPersistence getwhp_sites_countryPersistence() {
		return whp_sites_countryPersistence;
	}

	/**
	 * Sets the whp_sites_country persistence.
	 *
	 * @param whp_sites_countryPersistence the whp_sites_country persistence
	 */
	public void setwhp_sites_countryPersistence(
		whp_sites_countryPersistence whp_sites_countryPersistence) {
		this.whp_sites_countryPersistence = whp_sites_countryPersistence;
	}

	/**
	 * Returns the whp_sites_dsocr local service.
	 *
	 * @return the whp_sites_dsocr local service
	 */
	public whp_sites_dsocrLocalService getwhp_sites_dsocrLocalService() {
		return whp_sites_dsocrLocalService;
	}

	/**
	 * Sets the whp_sites_dsocr local service.
	 *
	 * @param whp_sites_dsocrLocalService the whp_sites_dsocr local service
	 */
	public void setwhp_sites_dsocrLocalService(
		whp_sites_dsocrLocalService whp_sites_dsocrLocalService) {
		this.whp_sites_dsocrLocalService = whp_sites_dsocrLocalService;
	}

	/**
	 * Returns the whp_sites_dsocr persistence.
	 *
	 * @return the whp_sites_dsocr persistence
	 */
	public whp_sites_dsocrPersistence getwhp_sites_dsocrPersistence() {
		return whp_sites_dsocrPersistence;
	}

	/**
	 * Sets the whp_sites_dsocr persistence.
	 *
	 * @param whp_sites_dsocrPersistence the whp_sites_dsocr persistence
	 */
	public void setwhp_sites_dsocrPersistence(
		whp_sites_dsocrPersistence whp_sites_dsocrPersistence) {
		this.whp_sites_dsocrPersistence = whp_sites_dsocrPersistence;
	}

	/**
	 * Returns the whp_sites_external_documents local service.
	 *
	 * @return the whp_sites_external_documents local service
	 */
	public whp_sites_external_documentsLocalService getwhp_sites_external_documentsLocalService() {
		return whp_sites_external_documentsLocalService;
	}

	/**
	 * Sets the whp_sites_external_documents local service.
	 *
	 * @param whp_sites_external_documentsLocalService the whp_sites_external_documents local service
	 */
	public void setwhp_sites_external_documentsLocalService(
		whp_sites_external_documentsLocalService whp_sites_external_documentsLocalService) {
		this.whp_sites_external_documentsLocalService = whp_sites_external_documentsLocalService;
	}

	/**
	 * Returns the whp_sites_external_documents persistence.
	 *
	 * @return the whp_sites_external_documents persistence
	 */
	public whp_sites_external_documentsPersistence getwhp_sites_external_documentsPersistence() {
		return whp_sites_external_documentsPersistence;
	}

	/**
	 * Sets the whp_sites_external_documents persistence.
	 *
	 * @param whp_sites_external_documentsPersistence the whp_sites_external_documents persistence
	 */
	public void setwhp_sites_external_documentsPersistence(
		whp_sites_external_documentsPersistence whp_sites_external_documentsPersistence) {
		this.whp_sites_external_documentsPersistence = whp_sites_external_documentsPersistence;
	}

	/**
	 * Returns the whp_sites_flagship_species local service.
	 *
	 * @return the whp_sites_flagship_species local service
	 */
	public whp_sites_flagship_speciesLocalService getwhp_sites_flagship_speciesLocalService() {
		return whp_sites_flagship_speciesLocalService;
	}

	/**
	 * Sets the whp_sites_flagship_species local service.
	 *
	 * @param whp_sites_flagship_speciesLocalService the whp_sites_flagship_species local service
	 */
	public void setwhp_sites_flagship_speciesLocalService(
		whp_sites_flagship_speciesLocalService whp_sites_flagship_speciesLocalService) {
		this.whp_sites_flagship_speciesLocalService = whp_sites_flagship_speciesLocalService;
	}

	/**
	 * Returns the whp_sites_flagship_species persistence.
	 *
	 * @return the whp_sites_flagship_species persistence
	 */
	public whp_sites_flagship_speciesPersistence getwhp_sites_flagship_speciesPersistence() {
		return whp_sites_flagship_speciesPersistence;
	}

	/**
	 * Sets the whp_sites_flagship_species persistence.
	 *
	 * @param whp_sites_flagship_speciesPersistence the whp_sites_flagship_species persistence
	 */
	public void setwhp_sites_flagship_speciesPersistence(
		whp_sites_flagship_speciesPersistence whp_sites_flagship_speciesPersistence) {
		this.whp_sites_flagship_speciesPersistence = whp_sites_flagship_speciesPersistence;
	}

	/**
	 * Returns the whp_sites_indigenous_communities local service.
	 *
	 * @return the whp_sites_indigenous_communities local service
	 */
	public whp_sites_indigenous_communitiesLocalService getwhp_sites_indigenous_communitiesLocalService() {
		return whp_sites_indigenous_communitiesLocalService;
	}

	/**
	 * Sets the whp_sites_indigenous_communities local service.
	 *
	 * @param whp_sites_indigenous_communitiesLocalService the whp_sites_indigenous_communities local service
	 */
	public void setwhp_sites_indigenous_communitiesLocalService(
		whp_sites_indigenous_communitiesLocalService whp_sites_indigenous_communitiesLocalService) {
		this.whp_sites_indigenous_communitiesLocalService = whp_sites_indigenous_communitiesLocalService;
	}

	/**
	 * Returns the whp_sites_indigenous_communities persistence.
	 *
	 * @return the whp_sites_indigenous_communities persistence
	 */
	public whp_sites_indigenous_communitiesPersistence getwhp_sites_indigenous_communitiesPersistence() {
		return whp_sites_indigenous_communitiesPersistence;
	}

	/**
	 * Sets the whp_sites_indigenous_communities persistence.
	 *
	 * @param whp_sites_indigenous_communitiesPersistence the whp_sites_indigenous_communities persistence
	 */
	public void setwhp_sites_indigenous_communitiesPersistence(
		whp_sites_indigenous_communitiesPersistence whp_sites_indigenous_communitiesPersistence) {
		this.whp_sites_indigenous_communitiesPersistence = whp_sites_indigenous_communitiesPersistence;
	}

	/**
	 * Returns the whp_sites_inscription_criteria local service.
	 *
	 * @return the whp_sites_inscription_criteria local service
	 */
	public whp_sites_inscription_criteriaLocalService getwhp_sites_inscription_criteriaLocalService() {
		return whp_sites_inscription_criteriaLocalService;
	}

	/**
	 * Sets the whp_sites_inscription_criteria local service.
	 *
	 * @param whp_sites_inscription_criteriaLocalService the whp_sites_inscription_criteria local service
	 */
	public void setwhp_sites_inscription_criteriaLocalService(
		whp_sites_inscription_criteriaLocalService whp_sites_inscription_criteriaLocalService) {
		this.whp_sites_inscription_criteriaLocalService = whp_sites_inscription_criteriaLocalService;
	}

	/**
	 * Returns the whp_sites_inscription_criteria persistence.
	 *
	 * @return the whp_sites_inscription_criteria persistence
	 */
	public whp_sites_inscription_criteriaPersistence getwhp_sites_inscription_criteriaPersistence() {
		return whp_sites_inscription_criteriaPersistence;
	}

	/**
	 * Sets the whp_sites_inscription_criteria persistence.
	 *
	 * @param whp_sites_inscription_criteriaPersistence the whp_sites_inscription_criteria persistence
	 */
	public void setwhp_sites_inscription_criteriaPersistence(
		whp_sites_inscription_criteriaPersistence whp_sites_inscription_criteriaPersistence) {
		this.whp_sites_inscription_criteriaPersistence = whp_sites_inscription_criteriaPersistence;
	}

	/**
	 * Returns the whp_sites_inscription_date local service.
	 *
	 * @return the whp_sites_inscription_date local service
	 */
	public whp_sites_inscription_dateLocalService getwhp_sites_inscription_dateLocalService() {
		return whp_sites_inscription_dateLocalService;
	}

	/**
	 * Sets the whp_sites_inscription_date local service.
	 *
	 * @param whp_sites_inscription_dateLocalService the whp_sites_inscription_date local service
	 */
	public void setwhp_sites_inscription_dateLocalService(
		whp_sites_inscription_dateLocalService whp_sites_inscription_dateLocalService) {
		this.whp_sites_inscription_dateLocalService = whp_sites_inscription_dateLocalService;
	}

	/**
	 * Returns the whp_sites_inscription_date persistence.
	 *
	 * @return the whp_sites_inscription_date persistence
	 */
	public whp_sites_inscription_datePersistence getwhp_sites_inscription_datePersistence() {
		return whp_sites_inscription_datePersistence;
	}

	/**
	 * Sets the whp_sites_inscription_date persistence.
	 *
	 * @param whp_sites_inscription_datePersistence the whp_sites_inscription_date persistence
	 */
	public void setwhp_sites_inscription_datePersistence(
		whp_sites_inscription_datePersistence whp_sites_inscription_datePersistence) {
		this.whp_sites_inscription_datePersistence = whp_sites_inscription_datePersistence;
	}

	/**
	 * Returns the whp_sites_iucn_pa_category local service.
	 *
	 * @return the whp_sites_iucn_pa_category local service
	 */
	public whp_sites_iucn_pa_categoryLocalService getwhp_sites_iucn_pa_categoryLocalService() {
		return whp_sites_iucn_pa_categoryLocalService;
	}

	/**
	 * Sets the whp_sites_iucn_pa_category local service.
	 *
	 * @param whp_sites_iucn_pa_categoryLocalService the whp_sites_iucn_pa_category local service
	 */
	public void setwhp_sites_iucn_pa_categoryLocalService(
		whp_sites_iucn_pa_categoryLocalService whp_sites_iucn_pa_categoryLocalService) {
		this.whp_sites_iucn_pa_categoryLocalService = whp_sites_iucn_pa_categoryLocalService;
	}

	/**
	 * Returns the whp_sites_iucn_pa_category persistence.
	 *
	 * @return the whp_sites_iucn_pa_category persistence
	 */
	public whp_sites_iucn_pa_categoryPersistence getwhp_sites_iucn_pa_categoryPersistence() {
		return whp_sites_iucn_pa_categoryPersistence;
	}

	/**
	 * Sets the whp_sites_iucn_pa_category persistence.
	 *
	 * @param whp_sites_iucn_pa_categoryPersistence the whp_sites_iucn_pa_category persistence
	 */
	public void setwhp_sites_iucn_pa_categoryPersistence(
		whp_sites_iucn_pa_categoryPersistence whp_sites_iucn_pa_categoryPersistence) {
		this.whp_sites_iucn_pa_categoryPersistence = whp_sites_iucn_pa_categoryPersistence;
	}

	/**
	 * Returns the whp_sites_iucn_recommendation local service.
	 *
	 * @return the whp_sites_iucn_recommendation local service
	 */
	public whp_sites_iucn_recommendationLocalService getwhp_sites_iucn_recommendationLocalService() {
		return whp_sites_iucn_recommendationLocalService;
	}

	/**
	 * Sets the whp_sites_iucn_recommendation local service.
	 *
	 * @param whp_sites_iucn_recommendationLocalService the whp_sites_iucn_recommendation local service
	 */
	public void setwhp_sites_iucn_recommendationLocalService(
		whp_sites_iucn_recommendationLocalService whp_sites_iucn_recommendationLocalService) {
		this.whp_sites_iucn_recommendationLocalService = whp_sites_iucn_recommendationLocalService;
	}

	/**
	 * Returns the whp_sites_iucn_recommendation remote service.
	 *
	 * @return the whp_sites_iucn_recommendation remote service
	 */
	public whp_sites_iucn_recommendationService getwhp_sites_iucn_recommendationService() {
		return whp_sites_iucn_recommendationService;
	}

	/**
	 * Sets the whp_sites_iucn_recommendation remote service.
	 *
	 * @param whp_sites_iucn_recommendationService the whp_sites_iucn_recommendation remote service
	 */
	public void setwhp_sites_iucn_recommendationService(
		whp_sites_iucn_recommendationService whp_sites_iucn_recommendationService) {
		this.whp_sites_iucn_recommendationService = whp_sites_iucn_recommendationService;
	}

	/**
	 * Returns the whp_sites_iucn_recommendation persistence.
	 *
	 * @return the whp_sites_iucn_recommendation persistence
	 */
	public whp_sites_iucn_recommendationPersistence getwhp_sites_iucn_recommendationPersistence() {
		return whp_sites_iucn_recommendationPersistence;
	}

	/**
	 * Sets the whp_sites_iucn_recommendation persistence.
	 *
	 * @param whp_sites_iucn_recommendationPersistence the whp_sites_iucn_recommendation persistence
	 */
	public void setwhp_sites_iucn_recommendationPersistence(
		whp_sites_iucn_recommendationPersistence whp_sites_iucn_recommendationPersistence) {
		this.whp_sites_iucn_recommendationPersistence = whp_sites_iucn_recommendationPersistence;
	}

	/**
	 * Returns the whp_sites_mee local service.
	 *
	 * @return the whp_sites_mee local service
	 */
	public whp_sites_meeLocalService getwhp_sites_meeLocalService() {
		return whp_sites_meeLocalService;
	}

	/**
	 * Sets the whp_sites_mee local service.
	 *
	 * @param whp_sites_meeLocalService the whp_sites_mee local service
	 */
	public void setwhp_sites_meeLocalService(
		whp_sites_meeLocalService whp_sites_meeLocalService) {
		this.whp_sites_meeLocalService = whp_sites_meeLocalService;
	}

	/**
	 * Returns the whp_sites_mee persistence.
	 *
	 * @return the whp_sites_mee persistence
	 */
	public whp_sites_meePersistence getwhp_sites_meePersistence() {
		return whp_sites_meePersistence;
	}

	/**
	 * Sets the whp_sites_mee persistence.
	 *
	 * @param whp_sites_meePersistence the whp_sites_mee persistence
	 */
	public void setwhp_sites_meePersistence(
		whp_sites_meePersistence whp_sites_meePersistence) {
		this.whp_sites_meePersistence = whp_sites_meePersistence;
	}

	/**
	 * Returns the whp_sites_mgmt_plan_state local service.
	 *
	 * @return the whp_sites_mgmt_plan_state local service
	 */
	public whp_sites_mgmt_plan_stateLocalService getwhp_sites_mgmt_plan_stateLocalService() {
		return whp_sites_mgmt_plan_stateLocalService;
	}

	/**
	 * Sets the whp_sites_mgmt_plan_state local service.
	 *
	 * @param whp_sites_mgmt_plan_stateLocalService the whp_sites_mgmt_plan_state local service
	 */
	public void setwhp_sites_mgmt_plan_stateLocalService(
		whp_sites_mgmt_plan_stateLocalService whp_sites_mgmt_plan_stateLocalService) {
		this.whp_sites_mgmt_plan_stateLocalService = whp_sites_mgmt_plan_stateLocalService;
	}

	/**
	 * Returns the whp_sites_mgmt_plan_state persistence.
	 *
	 * @return the whp_sites_mgmt_plan_state persistence
	 */
	public whp_sites_mgmt_plan_statePersistence getwhp_sites_mgmt_plan_statePersistence() {
		return whp_sites_mgmt_plan_statePersistence;
	}

	/**
	 * Sets the whp_sites_mgmt_plan_state persistence.
	 *
	 * @param whp_sites_mgmt_plan_statePersistence the whp_sites_mgmt_plan_state persistence
	 */
	public void setwhp_sites_mgmt_plan_statePersistence(
		whp_sites_mgmt_plan_statePersistence whp_sites_mgmt_plan_statePersistence) {
		this.whp_sites_mgmt_plan_statePersistence = whp_sites_mgmt_plan_statePersistence;
	}

	/**
	 * Returns the whp_sites_mission local service.
	 *
	 * @return the whp_sites_mission local service
	 */
	public whp_sites_missionLocalService getwhp_sites_missionLocalService() {
		return whp_sites_missionLocalService;
	}

	/**
	 * Sets the whp_sites_mission local service.
	 *
	 * @param whp_sites_missionLocalService the whp_sites_mission local service
	 */
	public void setwhp_sites_missionLocalService(
		whp_sites_missionLocalService whp_sites_missionLocalService) {
		this.whp_sites_missionLocalService = whp_sites_missionLocalService;
	}

	/**
	 * Returns the whp_sites_mission persistence.
	 *
	 * @return the whp_sites_mission persistence
	 */
	public whp_sites_missionPersistence getwhp_sites_missionPersistence() {
		return whp_sites_missionPersistence;
	}

	/**
	 * Sets the whp_sites_mission persistence.
	 *
	 * @param whp_sites_missionPersistence the whp_sites_mission persistence
	 */
	public void setwhp_sites_missionPersistence(
		whp_sites_missionPersistence whp_sites_missionPersistence) {
		this.whp_sites_missionPersistence = whp_sites_missionPersistence;
	}

	/**
	 * Returns the whp_sites_other_designations local service.
	 *
	 * @return the whp_sites_other_designations local service
	 */
	public whp_sites_other_designationsLocalService getwhp_sites_other_designationsLocalService() {
		return whp_sites_other_designationsLocalService;
	}

	/**
	 * Sets the whp_sites_other_designations local service.
	 *
	 * @param whp_sites_other_designationsLocalService the whp_sites_other_designations local service
	 */
	public void setwhp_sites_other_designationsLocalService(
		whp_sites_other_designationsLocalService whp_sites_other_designationsLocalService) {
		this.whp_sites_other_designationsLocalService = whp_sites_other_designationsLocalService;
	}

	/**
	 * Returns the whp_sites_other_designations persistence.
	 *
	 * @return the whp_sites_other_designations persistence
	 */
	public whp_sites_other_designationsPersistence getwhp_sites_other_designationsPersistence() {
		return whp_sites_other_designationsPersistence;
	}

	/**
	 * Sets the whp_sites_other_designations persistence.
	 *
	 * @param whp_sites_other_designationsPersistence the whp_sites_other_designations persistence
	 */
	public void setwhp_sites_other_designationsPersistence(
		whp_sites_other_designationsPersistence whp_sites_other_designationsPersistence) {
		this.whp_sites_other_designationsPersistence = whp_sites_other_designationsPersistence;
	}

	/**
	 * Returns the whp_sites_soc_reports local service.
	 *
	 * @return the whp_sites_soc_reports local service
	 */
	public whp_sites_soc_reportsLocalService getwhp_sites_soc_reportsLocalService() {
		return whp_sites_soc_reportsLocalService;
	}

	/**
	 * Sets the whp_sites_soc_reports local service.
	 *
	 * @param whp_sites_soc_reportsLocalService the whp_sites_soc_reports local service
	 */
	public void setwhp_sites_soc_reportsLocalService(
		whp_sites_soc_reportsLocalService whp_sites_soc_reportsLocalService) {
		this.whp_sites_soc_reportsLocalService = whp_sites_soc_reportsLocalService;
	}

	/**
	 * Returns the whp_sites_soc_reports persistence.
	 *
	 * @return the whp_sites_soc_reports persistence
	 */
	public whp_sites_soc_reportsPersistence getwhp_sites_soc_reportsPersistence() {
		return whp_sites_soc_reportsPersistence;
	}

	/**
	 * Sets the whp_sites_soc_reports persistence.
	 *
	 * @param whp_sites_soc_reportsPersistence the whp_sites_soc_reports persistence
	 */
	public void setwhp_sites_soc_reportsPersistence(
		whp_sites_soc_reportsPersistence whp_sites_soc_reportsPersistence) {
		this.whp_sites_soc_reportsPersistence = whp_sites_soc_reportsPersistence;
	}

	/**
	 * Returns the whp_sites_soouv local service.
	 *
	 * @return the whp_sites_soouv local service
	 */
	public whp_sites_soouvLocalService getwhp_sites_soouvLocalService() {
		return whp_sites_soouvLocalService;
	}

	/**
	 * Sets the whp_sites_soouv local service.
	 *
	 * @param whp_sites_soouvLocalService the whp_sites_soouv local service
	 */
	public void setwhp_sites_soouvLocalService(
		whp_sites_soouvLocalService whp_sites_soouvLocalService) {
		this.whp_sites_soouvLocalService = whp_sites_soouvLocalService;
	}

	/**
	 * Returns the whp_sites_soouv persistence.
	 *
	 * @return the whp_sites_soouv persistence
	 */
	public whp_sites_soouvPersistence getwhp_sites_soouvPersistence() {
		return whp_sites_soouvPersistence;
	}

	/**
	 * Sets the whp_sites_soouv persistence.
	 *
	 * @param whp_sites_soouvPersistence the whp_sites_soouv persistence
	 */
	public void setwhp_sites_soouvPersistence(
		whp_sites_soouvPersistence whp_sites_soouvPersistence) {
		this.whp_sites_soouvPersistence = whp_sites_soouvPersistence;
	}

	/**
	 * Returns the whp_sites_visitors local service.
	 *
	 * @return the whp_sites_visitors local service
	 */
	public whp_sites_visitorsLocalService getwhp_sites_visitorsLocalService() {
		return whp_sites_visitorsLocalService;
	}

	/**
	 * Sets the whp_sites_visitors local service.
	 *
	 * @param whp_sites_visitorsLocalService the whp_sites_visitors local service
	 */
	public void setwhp_sites_visitorsLocalService(
		whp_sites_visitorsLocalService whp_sites_visitorsLocalService) {
		this.whp_sites_visitorsLocalService = whp_sites_visitorsLocalService;
	}

	/**
	 * Returns the whp_sites_visitors persistence.
	 *
	 * @return the whp_sites_visitors persistence
	 */
	public whp_sites_visitorsPersistence getwhp_sites_visitorsPersistence() {
		return whp_sites_visitorsPersistence;
	}

	/**
	 * Sets the whp_sites_visitors persistence.
	 *
	 * @param whp_sites_visitorsPersistence the whp_sites_visitors persistence
	 */
	public void setwhp_sites_visitorsPersistence(
		whp_sites_visitorsPersistence whp_sites_visitorsPersistence) {
		this.whp_sites_visitorsPersistence = whp_sites_visitorsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("com.iucn.whp.dbservice.model.site_assessment_versions",
			site_assessment_versionsLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.iucn.whp.dbservice.model.site_assessment_versions");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return site_assessment_versions.class;
	}

	protected String getModelClassName() {
		return site_assessment_versions.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = site_assessment_versionsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = active_conservation_projectsLocalService.class)
	protected active_conservation_projectsLocalService active_conservation_projectsLocalService;
	@BeanReference(type = active_conservation_projectsPersistence.class)
	protected active_conservation_projectsPersistence active_conservation_projectsPersistence;
	@BeanReference(type = advance_query_assessmentLocalService.class)
	protected advance_query_assessmentLocalService advance_query_assessmentLocalService;
	@BeanReference(type = advance_query_assessmentPersistence.class)
	protected advance_query_assessmentPersistence advance_query_assessmentPersistence;
	@BeanReference(type = advance_query_siteLocalService.class)
	protected advance_query_siteLocalService advance_query_siteLocalService;
	@BeanReference(type = advance_query_sitePersistence.class)
	protected advance_query_sitePersistence advance_query_sitePersistence;
	@BeanReference(type = assessing_threats_currentLocalService.class)
	protected assessing_threats_currentLocalService assessing_threats_currentLocalService;
	@BeanReference(type = assessing_threats_currentPersistence.class)
	protected assessing_threats_currentPersistence assessing_threats_currentPersistence;
	@BeanReference(type = assessing_threats_potentialLocalService.class)
	protected assessing_threats_potentialLocalService assessing_threats_potentialLocalService;
	@BeanReference(type = assessing_threats_potentialPersistence.class)
	protected assessing_threats_potentialPersistence assessing_threats_potentialPersistence;
	@BeanReference(type = assessment_lang_lkpLocalService.class)
	protected assessment_lang_lkpLocalService assessment_lang_lkpLocalService;
	@BeanReference(type = assessment_lang_lkpPersistence.class)
	protected assessment_lang_lkpPersistence assessment_lang_lkpPersistence;
	@BeanReference(type = assessment_lang_versionLocalService.class)
	protected assessment_lang_versionLocalService assessment_lang_versionLocalService;
	@BeanReference(type = assessment_lang_versionPersistence.class)
	protected assessment_lang_versionPersistence assessment_lang_versionPersistence;
	@BeanReference(type = assessment_stagesLocalService.class)
	protected assessment_stagesLocalService assessment_stagesLocalService;
	@BeanReference(type = assessment_stagesPersistence.class)
	protected assessment_stagesPersistence assessment_stagesPersistence;
	@BeanReference(type = assessment_statusLocalService.class)
	protected assessment_statusLocalService assessment_statusLocalService;
	@BeanReference(type = assessment_statusPersistence.class)
	protected assessment_statusPersistence assessment_statusPersistence;
	@BeanReference(type = assessment_validationLocalService.class)
	protected assessment_validationLocalService assessment_validationLocalService;
	@BeanReference(type = assessment_validationPersistence.class)
	protected assessment_validationPersistence assessment_validationPersistence;
	@BeanReference(type = assessment_whvaluesLocalService.class)
	protected assessment_whvaluesLocalService assessment_whvaluesLocalService;
	@BeanReference(type = assessment_whvaluesPersistence.class)
	protected assessment_whvaluesPersistence assessment_whvaluesPersistence;
	@BeanReference(type = assessment_whvalues_whcriterionLocalService.class)
	protected assessment_whvalues_whcriterionLocalService assessment_whvalues_whcriterionLocalService;
	@BeanReference(type = assessment_whvalues_whcriterionPersistence.class)
	protected assessment_whvalues_whcriterionPersistence assessment_whvalues_whcriterionPersistence;
	@BeanReference(type = benefit_checksubtype_lkpLocalService.class)
	protected benefit_checksubtype_lkpLocalService benefit_checksubtype_lkpLocalService;
	@BeanReference(type = benefit_checksubtype_lkpPersistence.class)
	protected benefit_checksubtype_lkpPersistence benefit_checksubtype_lkpPersistence;
	@BeanReference(type = benefit_checktype_lkpLocalService.class)
	protected benefit_checktype_lkpLocalService benefit_checktype_lkpLocalService;
	@BeanReference(type = benefit_checktype_lkpPersistence.class)
	protected benefit_checktype_lkpPersistence benefit_checktype_lkpPersistence;
	@BeanReference(type = benefit_rating_lkpLocalService.class)
	protected benefit_rating_lkpLocalService benefit_rating_lkpLocalService;
	@BeanReference(type = benefit_rating_lkpPersistence.class)
	protected benefit_rating_lkpPersistence benefit_rating_lkpPersistence;
	@BeanReference(type = benefitsLocalService.class)
	protected benefitsLocalService benefitsLocalService;
	@BeanReference(type = benefitsPersistence.class)
	protected benefitsPersistence benefitsPersistence;
	@BeanReference(type = benefits_summaryLocalService.class)
	protected benefits_summaryLocalService benefits_summaryLocalService;
	@BeanReference(type = benefits_summaryPersistence.class)
	protected benefits_summaryPersistence benefits_summaryPersistence;
	@BeanReference(type = benefits_type_refLocalService.class)
	protected benefits_type_refLocalService benefits_type_refLocalService;
	@BeanReference(type = benefits_type_refPersistence.class)
	protected benefits_type_refPersistence benefits_type_refPersistence;
	@BeanReference(type = biodiversity_valuesLocalService.class)
	protected biodiversity_valuesLocalService biodiversity_valuesLocalService;
	@BeanReference(type = biodiversity_valuesPersistence.class)
	protected biodiversity_valuesPersistence biodiversity_valuesPersistence;
	@BeanReference(type = boundary_modification_type_lkpLocalService.class)
	protected boundary_modification_type_lkpLocalService boundary_modification_type_lkpLocalService;
	@BeanReference(type = boundary_modification_type_lkpPersistence.class)
	protected boundary_modification_type_lkpPersistence boundary_modification_type_lkpPersistence;
	@BeanReference(type = conservation_outlookLocalService.class)
	protected conservation_outlookLocalService conservation_outlookLocalService;
	@BeanReference(type = conservation_outlookPersistence.class)
	protected conservation_outlookPersistence conservation_outlookPersistence;
	@BeanReference(type = conservation_outlook_rating_lkpLocalService.class)
	protected conservation_outlook_rating_lkpLocalService conservation_outlook_rating_lkpLocalService;
	@BeanReference(type = conservation_outlook_rating_lkpPersistence.class)
	protected conservation_outlook_rating_lkpPersistence conservation_outlook_rating_lkpPersistence;
	@BeanReference(type = contact_categoryLocalService.class)
	protected contact_categoryLocalService contact_categoryLocalService;
	@BeanReference(type = contact_categoryPersistence.class)
	protected contact_categoryPersistence contact_categoryPersistence;
	@BeanReference(type = country_lkpLocalService.class)
	protected country_lkpLocalService country_lkpLocalService;
	@BeanReference(type = country_lkpPersistence.class)
	protected country_lkpPersistence country_lkpPersistence;
	@BeanReference(type = current_state_trendLocalService.class)
	protected current_state_trendLocalService current_state_trendLocalService;
	@BeanReference(type = current_state_trendPersistence.class)
	protected current_state_trendPersistence current_state_trendPersistence;
	@BeanReference(type = current_state_trend_valuesLocalService.class)
	protected current_state_trend_valuesLocalService current_state_trend_valuesLocalService;
	@BeanReference(type = current_state_trend_valuesPersistence.class)
	protected current_state_trend_valuesPersistence current_state_trend_valuesPersistence;
	@BeanReference(type = current_threat_assessment_catLocalService.class)
	protected current_threat_assessment_catLocalService current_threat_assessment_catLocalService;
	@BeanReference(type = current_threat_assessment_catPersistence.class)
	protected current_threat_assessment_catPersistence current_threat_assessment_catPersistence;
	@BeanReference(type = current_threat_valuesLocalService.class)
	protected current_threat_valuesLocalService current_threat_valuesLocalService;
	@BeanReference(type = current_threat_valuesPersistence.class)
	protected current_threat_valuesPersistence current_threat_valuesPersistence;
	@BeanReference(type = danger_list_status_lkpLocalService.class)
	protected danger_list_status_lkpLocalService danger_list_status_lkpLocalService;
	@BeanReference(type = danger_list_status_lkpPersistence.class)
	protected danger_list_status_lkpPersistence danger_list_status_lkpPersistence;
	@BeanReference(type = docs_customDataLocalService.class)
	protected docs_customDataLocalService docs_customDataLocalService;
	@BeanReference(type = docs_customDataPersistence.class)
	protected docs_customDataPersistence docs_customDataPersistence;
	@BeanReference(type = docs_customDataFinder.class)
	protected docs_customDataFinder docs_customDataFinder;
	@BeanReference(type = docs_sitedataLocalService.class)
	protected docs_sitedataLocalService docs_sitedataLocalService;
	@BeanReference(type = docs_sitedataPersistence.class)
	protected docs_sitedataPersistence docs_sitedataPersistence;
	@BeanReference(type = effective_prot_mgmt_iothreatsLocalService.class)
	protected effective_prot_mgmt_iothreatsLocalService effective_prot_mgmt_iothreatsLocalService;
	@BeanReference(type = effective_prot_mgmt_iothreatsPersistence.class)
	protected effective_prot_mgmt_iothreatsPersistence effective_prot_mgmt_iothreatsPersistence;
	@BeanReference(type = flagship_species_lkpLocalService.class)
	protected flagship_species_lkpLocalService flagship_species_lkpLocalService;
	@BeanReference(type = flagship_species_lkpPersistence.class)
	protected flagship_species_lkpPersistence flagship_species_lkpPersistence;
	@BeanReference(type = inscription_criteria_lkpLocalService.class)
	protected inscription_criteria_lkpLocalService inscription_criteria_lkpLocalService;
	@BeanReference(type = inscription_criteria_lkpPersistence.class)
	protected inscription_criteria_lkpPersistence inscription_criteria_lkpPersistence;
	@BeanReference(type = inscription_type_lkpLocalService.class)
	protected inscription_type_lkpLocalService inscription_type_lkpLocalService;
	@BeanReference(type = inscription_type_lkpPersistence.class)
	protected inscription_type_lkpPersistence inscription_type_lkpPersistence;
	@BeanReference(type = iucn_pa_lkp_categoryLocalService.class)
	protected iucn_pa_lkp_categoryLocalService iucn_pa_lkp_categoryLocalService;
	@BeanReference(type = iucn_pa_lkp_categoryPersistence.class)
	protected iucn_pa_lkp_categoryPersistence iucn_pa_lkp_categoryPersistence;
	@BeanReference(type = iucn_regionLocalService.class)
	protected iucn_regionLocalService iucn_regionLocalService;
	@BeanReference(type = iucn_regionPersistence.class)
	protected iucn_regionPersistence iucn_regionPersistence;
	@BeanReference(type = iucn_region_countryLocalService.class)
	protected iucn_region_countryLocalService iucn_region_countryLocalService;
	@BeanReference(type = iucn_region_countryPersistence.class)
	protected iucn_region_countryPersistence iucn_region_countryPersistence;
	@BeanReference(type = key_conservation_issuesLocalService.class)
	protected key_conservation_issuesLocalService key_conservation_issuesLocalService;
	@BeanReference(type = key_conservation_issuesPersistence.class)
	protected key_conservation_issuesPersistence key_conservation_issuesPersistence;
	@BeanReference(type = key_conservation_scale_lkpLocalService.class)
	protected key_conservation_scale_lkpLocalService key_conservation_scale_lkpLocalService;
	@BeanReference(type = key_conservation_scale_lkpPersistence.class)
	protected key_conservation_scale_lkpPersistence key_conservation_scale_lkpPersistence;
	@BeanReference(type = mission_lkpLocalService.class)
	protected mission_lkpLocalService mission_lkpLocalService;
	@BeanReference(type = mission_lkpPersistence.class)
	protected mission_lkpPersistence mission_lkpPersistence;
	@BeanReference(type = negative_factors_level_impactLocalService.class)
	protected negative_factors_level_impactLocalService negative_factors_level_impactLocalService;
	@BeanReference(type = negative_factors_level_impactPersistence.class)
	protected negative_factors_level_impactPersistence negative_factors_level_impactPersistence;
	@BeanReference(type = negative_factors_trendLocalService.class)
	protected negative_factors_trendLocalService negative_factors_trendLocalService;
	@BeanReference(type = negative_factors_trendPersistence.class)
	protected negative_factors_trendPersistence negative_factors_trendPersistence;
	@BeanReference(type = other_designation_lkpLocalService.class)
	protected other_designation_lkpLocalService other_designation_lkpLocalService;
	@BeanReference(type = other_designation_lkpPersistence.class)
	protected other_designation_lkpPersistence other_designation_lkpPersistence;
	@BeanReference(type = potential_project_needsLocalService.class)
	protected potential_project_needsLocalService potential_project_needsLocalService;
	@BeanReference(type = potential_project_needsPersistence.class)
	protected potential_project_needsPersistence potential_project_needsPersistence;
	@BeanReference(type = potential_threat_assessment_catLocalService.class)
	protected potential_threat_assessment_catLocalService potential_threat_assessment_catLocalService;
	@BeanReference(type = potential_threat_assessment_catPersistence.class)
	protected potential_threat_assessment_catPersistence potential_threat_assessment_catPersistence;
	@BeanReference(type = potential_threat_valuesLocalService.class)
	protected potential_threat_valuesLocalService potential_threat_valuesLocalService;
	@BeanReference(type = potential_threat_valuesPersistence.class)
	protected potential_threat_valuesPersistence potential_threat_valuesPersistence;
	@BeanReference(type = prot_mgmt_best_practicesLocalService.class)
	protected prot_mgmt_best_practicesLocalService prot_mgmt_best_practicesLocalService;
	@BeanReference(type = prot_mgmt_best_practicesPersistence.class)
	protected prot_mgmt_best_practicesPersistence prot_mgmt_best_practicesPersistence;
	@BeanReference(type = prot_mgmt_overallLocalService.class)
	protected prot_mgmt_overallLocalService prot_mgmt_overallLocalService;
	@BeanReference(type = prot_mgmt_overallPersistence.class)
	protected prot_mgmt_overallPersistence prot_mgmt_overallPersistence;
	@BeanReference(type = protection_managementLocalService.class)
	protected protection_managementLocalService protection_managementLocalService;
	@BeanReference(type = protection_managementPersistence.class)
	protected protection_managementPersistence protection_managementPersistence;
	@BeanReference(type = protection_management_ratings_lkpLocalService.class)
	protected protection_management_ratings_lkpLocalService protection_management_ratings_lkpLocalService;
	@BeanReference(type = protection_management_ratings_lkpPersistence.class)
	protected protection_management_ratings_lkpPersistence protection_management_ratings_lkpPersistence;
	@BeanReference(type = protection_mgmt_checklist_lkpLocalService.class)
	protected protection_mgmt_checklist_lkpLocalService protection_mgmt_checklist_lkpLocalService;
	@BeanReference(type = protection_mgmt_checklist_lkpPersistence.class)
	protected protection_mgmt_checklist_lkpPersistence protection_mgmt_checklist_lkpPersistence;
	@BeanReference(type = recommendation_type_lkpLocalService.class)
	protected recommendation_type_lkpLocalService recommendation_type_lkpLocalService;
	@BeanReference(type = recommendation_type_lkpPersistence.class)
	protected recommendation_type_lkpPersistence recommendation_type_lkpPersistence;
	@BeanReference(type = referencesLocalService.class)
	protected referencesLocalService referencesLocalService;
	@BeanReference(type = referencesPersistence.class)
	protected referencesPersistence referencesPersistence;
	@BeanReference(type = reinforced_monitoringLocalService.class)
	protected reinforced_monitoringLocalService reinforced_monitoringLocalService;
	@BeanReference(type = reinforced_monitoringPersistence.class)
	protected reinforced_monitoringPersistence reinforced_monitoringPersistence;
	@BeanReference(type = site_assessmentLocalService.class)
	protected site_assessmentLocalService site_assessmentLocalService;
	@BeanReference(type = site_assessmentPersistence.class)
	protected site_assessmentPersistence site_assessmentPersistence;
	@BeanReference(type = site_assessmentFinder.class)
	protected site_assessmentFinder site_assessmentFinder;
	@BeanReference(type = site_assessment_versionsLocalService.class)
	protected site_assessment_versionsLocalService site_assessment_versionsLocalService;
	@BeanReference(type = site_assessment_versionsPersistence.class)
	protected site_assessment_versionsPersistence site_assessment_versionsPersistence;
	@BeanReference(type = site_assessment_versionsFinder.class)
	protected site_assessment_versionsFinder site_assessment_versionsFinder;
	@BeanReference(type = sites_thematicLocalService.class)
	protected sites_thematicLocalService sites_thematicLocalService;
	@BeanReference(type = sites_thematicPersistence.class)
	protected sites_thematicPersistence sites_thematicPersistence;
	@BeanReference(type = state_lkpLocalService.class)
	protected state_lkpLocalService state_lkpLocalService;
	@BeanReference(type = state_lkpPersistence.class)
	protected state_lkpPersistence state_lkpPersistence;
	@BeanReference(type = state_trend_biodivvalsLocalService.class)
	protected state_trend_biodivvalsLocalService state_trend_biodivvalsLocalService;
	@BeanReference(type = state_trend_biodivvalsPersistence.class)
	protected state_trend_biodivvalsPersistence state_trend_biodivvalsPersistence;
	@BeanReference(type = state_trend_whvaluesLocalService.class)
	protected state_trend_whvaluesLocalService state_trend_whvaluesLocalService;
	@BeanReference(type = state_trend_whvaluesPersistence.class)
	protected state_trend_whvaluesPersistence state_trend_whvaluesPersistence;
	@BeanReference(type = thematic_lkpLocalService.class)
	protected thematic_lkpLocalService thematic_lkpLocalService;
	@BeanReference(type = thematic_lkpPersistence.class)
	protected thematic_lkpPersistence thematic_lkpPersistence;
	@BeanReference(type = threat_categories_lkpLocalService.class)
	protected threat_categories_lkpLocalService threat_categories_lkpLocalService;
	@BeanReference(type = threat_categories_lkpPersistence.class)
	protected threat_categories_lkpPersistence threat_categories_lkpPersistence;
	@BeanReference(type = threat_rating_lkpLocalService.class)
	protected threat_rating_lkpLocalService threat_rating_lkpLocalService;
	@BeanReference(type = threat_rating_lkpPersistence.class)
	protected threat_rating_lkpPersistence threat_rating_lkpPersistence;
	@BeanReference(type = threat_subcategories_lkpLocalService.class)
	protected threat_subcategories_lkpLocalService threat_subcategories_lkpLocalService;
	@BeanReference(type = threat_subcategories_lkpPersistence.class)
	protected threat_subcategories_lkpPersistence threat_subcategories_lkpPersistence;
	@BeanReference(type = threat_summary_currentLocalService.class)
	protected threat_summary_currentLocalService threat_summary_currentLocalService;
	@BeanReference(type = threat_summary_currentPersistence.class)
	protected threat_summary_currentPersistence threat_summary_currentPersistence;
	@BeanReference(type = threat_summary_overallLocalService.class)
	protected threat_summary_overallLocalService threat_summary_overallLocalService;
	@BeanReference(type = threat_summary_overallPersistence.class)
	protected threat_summary_overallPersistence threat_summary_overallPersistence;
	@BeanReference(type = threat_summary_potentialLocalService.class)
	protected threat_summary_potentialLocalService threat_summary_potentialLocalService;
	@BeanReference(type = threat_summary_potentialPersistence.class)
	protected threat_summary_potentialPersistence threat_summary_potentialPersistence;
	@BeanReference(type = trend_lkpLocalService.class)
	protected trend_lkpLocalService trend_lkpLocalService;
	@BeanReference(type = trend_lkpPersistence.class)
	protected trend_lkpPersistence trend_lkpPersistence;
	@BeanReference(type = unesco_regionLocalService.class)
	protected unesco_regionLocalService unesco_regionLocalService;
	@BeanReference(type = unesco_regionPersistence.class)
	protected unesco_regionPersistence unesco_regionPersistence;
	@BeanReference(type = unesco_region_countryLocalService.class)
	protected unesco_region_countryLocalService unesco_region_countryLocalService;
	@BeanReference(type = unesco_region_countryPersistence.class)
	protected unesco_region_countryPersistence unesco_region_countryPersistence;
	@BeanReference(type = whp_contactLocalService.class)
	protected whp_contactLocalService whp_contactLocalService;
	@BeanReference(type = whp_contactPersistence.class)
	protected whp_contactPersistence whp_contactPersistence;
	@BeanReference(type = whp_criteria_lkpLocalService.class)
	protected whp_criteria_lkpLocalService whp_criteria_lkpLocalService;
	@BeanReference(type = whp_criteria_lkpPersistence.class)
	protected whp_criteria_lkpPersistence whp_criteria_lkpPersistence;
	@BeanReference(type = whp_site_danger_listLocalService.class)
	protected whp_site_danger_listLocalService whp_site_danger_listLocalService;
	@BeanReference(type = whp_site_danger_listService.class)
	protected whp_site_danger_listService whp_site_danger_listService;
	@BeanReference(type = whp_site_danger_listPersistence.class)
	protected whp_site_danger_listPersistence whp_site_danger_listPersistence;
	@BeanReference(type = whp_sitesLocalService.class)
	protected whp_sitesLocalService whp_sitesLocalService;
	@BeanReference(type = whp_sitesService.class)
	protected whp_sitesService whp_sitesService;
	@BeanReference(type = whp_sitesPersistence.class)
	protected whp_sitesPersistence whp_sitesPersistence;
	@BeanReference(type = whp_sitesFinder.class)
	protected whp_sitesFinder whp_sitesFinder;
	@BeanReference(type = whp_sites_boundary_modificationLocalService.class)
	protected whp_sites_boundary_modificationLocalService whp_sites_boundary_modificationLocalService;
	@BeanReference(type = whp_sites_boundary_modificationPersistence.class)
	protected whp_sites_boundary_modificationPersistence whp_sites_boundary_modificationPersistence;
	@BeanReference(type = whp_sites_budgetLocalService.class)
	protected whp_sites_budgetLocalService whp_sites_budgetLocalService;
	@BeanReference(type = whp_sites_budgetPersistence.class)
	protected whp_sites_budgetPersistence whp_sites_budgetPersistence;
	@BeanReference(type = whp_sites_componentLocalService.class)
	protected whp_sites_componentLocalService whp_sites_componentLocalService;
	@BeanReference(type = whp_sites_componentPersistence.class)
	protected whp_sites_componentPersistence whp_sites_componentPersistence;
	@BeanReference(type = whp_sites_contactsLocalService.class)
	protected whp_sites_contactsLocalService whp_sites_contactsLocalService;
	@BeanReference(type = whp_sites_contactsPersistence.class)
	protected whp_sites_contactsPersistence whp_sites_contactsPersistence;
	@BeanReference(type = whp_sites_countryLocalService.class)
	protected whp_sites_countryLocalService whp_sites_countryLocalService;
	@BeanReference(type = whp_sites_countryPersistence.class)
	protected whp_sites_countryPersistence whp_sites_countryPersistence;
	@BeanReference(type = whp_sites_dsocrLocalService.class)
	protected whp_sites_dsocrLocalService whp_sites_dsocrLocalService;
	@BeanReference(type = whp_sites_dsocrPersistence.class)
	protected whp_sites_dsocrPersistence whp_sites_dsocrPersistence;
	@BeanReference(type = whp_sites_external_documentsLocalService.class)
	protected whp_sites_external_documentsLocalService whp_sites_external_documentsLocalService;
	@BeanReference(type = whp_sites_external_documentsPersistence.class)
	protected whp_sites_external_documentsPersistence whp_sites_external_documentsPersistence;
	@BeanReference(type = whp_sites_flagship_speciesLocalService.class)
	protected whp_sites_flagship_speciesLocalService whp_sites_flagship_speciesLocalService;
	@BeanReference(type = whp_sites_flagship_speciesPersistence.class)
	protected whp_sites_flagship_speciesPersistence whp_sites_flagship_speciesPersistence;
	@BeanReference(type = whp_sites_indigenous_communitiesLocalService.class)
	protected whp_sites_indigenous_communitiesLocalService whp_sites_indigenous_communitiesLocalService;
	@BeanReference(type = whp_sites_indigenous_communitiesPersistence.class)
	protected whp_sites_indigenous_communitiesPersistence whp_sites_indigenous_communitiesPersistence;
	@BeanReference(type = whp_sites_inscription_criteriaLocalService.class)
	protected whp_sites_inscription_criteriaLocalService whp_sites_inscription_criteriaLocalService;
	@BeanReference(type = whp_sites_inscription_criteriaPersistence.class)
	protected whp_sites_inscription_criteriaPersistence whp_sites_inscription_criteriaPersistence;
	@BeanReference(type = whp_sites_inscription_dateLocalService.class)
	protected whp_sites_inscription_dateLocalService whp_sites_inscription_dateLocalService;
	@BeanReference(type = whp_sites_inscription_datePersistence.class)
	protected whp_sites_inscription_datePersistence whp_sites_inscription_datePersistence;
	@BeanReference(type = whp_sites_iucn_pa_categoryLocalService.class)
	protected whp_sites_iucn_pa_categoryLocalService whp_sites_iucn_pa_categoryLocalService;
	@BeanReference(type = whp_sites_iucn_pa_categoryPersistence.class)
	protected whp_sites_iucn_pa_categoryPersistence whp_sites_iucn_pa_categoryPersistence;
	@BeanReference(type = whp_sites_iucn_recommendationLocalService.class)
	protected whp_sites_iucn_recommendationLocalService whp_sites_iucn_recommendationLocalService;
	@BeanReference(type = whp_sites_iucn_recommendationService.class)
	protected whp_sites_iucn_recommendationService whp_sites_iucn_recommendationService;
	@BeanReference(type = whp_sites_iucn_recommendationPersistence.class)
	protected whp_sites_iucn_recommendationPersistence whp_sites_iucn_recommendationPersistence;
	@BeanReference(type = whp_sites_meeLocalService.class)
	protected whp_sites_meeLocalService whp_sites_meeLocalService;
	@BeanReference(type = whp_sites_meePersistence.class)
	protected whp_sites_meePersistence whp_sites_meePersistence;
	@BeanReference(type = whp_sites_mgmt_plan_stateLocalService.class)
	protected whp_sites_mgmt_plan_stateLocalService whp_sites_mgmt_plan_stateLocalService;
	@BeanReference(type = whp_sites_mgmt_plan_statePersistence.class)
	protected whp_sites_mgmt_plan_statePersistence whp_sites_mgmt_plan_statePersistence;
	@BeanReference(type = whp_sites_missionLocalService.class)
	protected whp_sites_missionLocalService whp_sites_missionLocalService;
	@BeanReference(type = whp_sites_missionPersistence.class)
	protected whp_sites_missionPersistence whp_sites_missionPersistence;
	@BeanReference(type = whp_sites_other_designationsLocalService.class)
	protected whp_sites_other_designationsLocalService whp_sites_other_designationsLocalService;
	@BeanReference(type = whp_sites_other_designationsPersistence.class)
	protected whp_sites_other_designationsPersistence whp_sites_other_designationsPersistence;
	@BeanReference(type = whp_sites_soc_reportsLocalService.class)
	protected whp_sites_soc_reportsLocalService whp_sites_soc_reportsLocalService;
	@BeanReference(type = whp_sites_soc_reportsPersistence.class)
	protected whp_sites_soc_reportsPersistence whp_sites_soc_reportsPersistence;
	@BeanReference(type = whp_sites_soouvLocalService.class)
	protected whp_sites_soouvLocalService whp_sites_soouvLocalService;
	@BeanReference(type = whp_sites_soouvPersistence.class)
	protected whp_sites_soouvPersistence whp_sites_soouvPersistence;
	@BeanReference(type = whp_sites_visitorsLocalService.class)
	protected whp_sites_visitorsLocalService whp_sites_visitorsLocalService;
	@BeanReference(type = whp_sites_visitorsPersistence.class)
	protected whp_sites_visitorsPersistence whp_sites_visitorsPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private site_assessment_versionsLocalServiceClpInvoker _clpInvoker = new site_assessment_versionsLocalServiceClpInvoker();
}