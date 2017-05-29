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

import com.iucn.whp.dbservice.model.active_conservation_projectsClp;
import com.iucn.whp.dbservice.model.advance_query_assessmentClp;
import com.iucn.whp.dbservice.model.advance_query_siteClp;
import com.iucn.whp.dbservice.model.assessing_threats_currentClp;
import com.iucn.whp.dbservice.model.assessing_threats_potentialClp;
import com.iucn.whp.dbservice.model.assessment_lang_lkpClp;
import com.iucn.whp.dbservice.model.assessment_lang_versionClp;
import com.iucn.whp.dbservice.model.assessment_stagesClp;
import com.iucn.whp.dbservice.model.assessment_statusClp;
import com.iucn.whp.dbservice.model.assessment_validationClp;
import com.iucn.whp.dbservice.model.assessment_whvaluesClp;
import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterionClp;
import com.iucn.whp.dbservice.model.benefit_checksubtype_lkpClp;
import com.iucn.whp.dbservice.model.benefit_checktype_lkpClp;
import com.iucn.whp.dbservice.model.benefit_rating_lkpClp;
import com.iucn.whp.dbservice.model.benefitsClp;
import com.iucn.whp.dbservice.model.benefits_summaryClp;
import com.iucn.whp.dbservice.model.benefits_type_refClp;
import com.iucn.whp.dbservice.model.biodiversity_valuesClp;
import com.iucn.whp.dbservice.model.boundary_modification_type_lkpClp;
import com.iucn.whp.dbservice.model.conservation_outlookClp;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkpClp;
import com.iucn.whp.dbservice.model.contact_categoryClp;
import com.iucn.whp.dbservice.model.country_lkpClp;
import com.iucn.whp.dbservice.model.current_state_trendClp;
import com.iucn.whp.dbservice.model.current_state_trend_valuesClp;
import com.iucn.whp.dbservice.model.current_threat_assessment_catClp;
import com.iucn.whp.dbservice.model.current_threat_valuesClp;
import com.iucn.whp.dbservice.model.danger_list_status_lkpClp;
import com.iucn.whp.dbservice.model.docs_customDataClp;
import com.iucn.whp.dbservice.model.docs_sitedataClp;
import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreatsClp;
import com.iucn.whp.dbservice.model.flagship_species_lkpClp;
import com.iucn.whp.dbservice.model.inscription_criteria_lkpClp;
import com.iucn.whp.dbservice.model.inscription_type_lkpClp;
import com.iucn.whp.dbservice.model.iucn_pa_lkp_categoryClp;
import com.iucn.whp.dbservice.model.iucn_regionClp;
import com.iucn.whp.dbservice.model.iucn_region_countryClp;
import com.iucn.whp.dbservice.model.key_conservation_issuesClp;
import com.iucn.whp.dbservice.model.key_conservation_scale_lkpClp;
import com.iucn.whp.dbservice.model.mission_lkpClp;
import com.iucn.whp.dbservice.model.negative_factors_level_impactClp;
import com.iucn.whp.dbservice.model.negative_factors_trendClp;
import com.iucn.whp.dbservice.model.other_designation_lkpClp;
import com.iucn.whp.dbservice.model.potential_project_needsClp;
import com.iucn.whp.dbservice.model.potential_threat_assessment_catClp;
import com.iucn.whp.dbservice.model.potential_threat_valuesClp;
import com.iucn.whp.dbservice.model.prot_mgmt_best_practicesClp;
import com.iucn.whp.dbservice.model.prot_mgmt_overallClp;
import com.iucn.whp.dbservice.model.protection_managementClp;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkpClp;
import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkpClp;
import com.iucn.whp.dbservice.model.recommendation_type_lkpClp;
import com.iucn.whp.dbservice.model.referencesClp;
import com.iucn.whp.dbservice.model.reinforced_monitoringClp;
import com.iucn.whp.dbservice.model.site_assessmentClp;
import com.iucn.whp.dbservice.model.site_assessment_versionsClp;
import com.iucn.whp.dbservice.model.sites_thematicClp;
import com.iucn.whp.dbservice.model.state_lkpClp;
import com.iucn.whp.dbservice.model.state_trend_biodivvalsClp;
import com.iucn.whp.dbservice.model.state_trend_whvaluesClp;
import com.iucn.whp.dbservice.model.thematic_lkpClp;
import com.iucn.whp.dbservice.model.threat_categories_lkpClp;
import com.iucn.whp.dbservice.model.threat_rating_lkpClp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkpClp;
import com.iucn.whp.dbservice.model.threat_summary_currentClp;
import com.iucn.whp.dbservice.model.threat_summary_overallClp;
import com.iucn.whp.dbservice.model.threat_summary_potentialClp;
import com.iucn.whp.dbservice.model.trend_lkpClp;
import com.iucn.whp.dbservice.model.unesco_regionClp;
import com.iucn.whp.dbservice.model.unesco_region_countryClp;
import com.iucn.whp.dbservice.model.whp_contactClp;
import com.iucn.whp.dbservice.model.whp_criteria_lkpClp;
import com.iucn.whp.dbservice.model.whp_site_danger_listClp;
import com.iucn.whp.dbservice.model.whp_sitesClp;
import com.iucn.whp.dbservice.model.whp_sites_boundary_modificationClp;
import com.iucn.whp.dbservice.model.whp_sites_budgetClp;
import com.iucn.whp.dbservice.model.whp_sites_componentClp;
import com.iucn.whp.dbservice.model.whp_sites_contactsClp;
import com.iucn.whp.dbservice.model.whp_sites_countryClp;
import com.iucn.whp.dbservice.model.whp_sites_dsocrClp;
import com.iucn.whp.dbservice.model.whp_sites_external_documentsClp;
import com.iucn.whp.dbservice.model.whp_sites_flagship_speciesClp;
import com.iucn.whp.dbservice.model.whp_sites_indigenous_communitiesClp;
import com.iucn.whp.dbservice.model.whp_sites_inscription_criteriaClp;
import com.iucn.whp.dbservice.model.whp_sites_inscription_dateClp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_categoryClp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendationClp;
import com.iucn.whp.dbservice.model.whp_sites_meeClp;
import com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_stateClp;
import com.iucn.whp.dbservice.model.whp_sites_missionClp;
import com.iucn.whp.dbservice.model.whp_sites_other_designationsClp;
import com.iucn.whp.dbservice.model.whp_sites_soc_reportsClp;
import com.iucn.whp.dbservice.model.whp_sites_soouvClp;
import com.iucn.whp.dbservice.model.whp_sites_visitorsClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"iucn-dbservice-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"iucn-dbservice-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "iucn-dbservice-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					active_conservation_projectsClp.class.getName())) {
			return translateInputactive_conservation_projects(oldModel);
		}

		if (oldModelClassName.equals(
					advance_query_assessmentClp.class.getName())) {
			return translateInputadvance_query_assessment(oldModel);
		}

		if (oldModelClassName.equals(advance_query_siteClp.class.getName())) {
			return translateInputadvance_query_site(oldModel);
		}

		if (oldModelClassName.equals(
					assessing_threats_currentClp.class.getName())) {
			return translateInputassessing_threats_current(oldModel);
		}

		if (oldModelClassName.equals(
					assessing_threats_potentialClp.class.getName())) {
			return translateInputassessing_threats_potential(oldModel);
		}

		if (oldModelClassName.equals(assessment_lang_lkpClp.class.getName())) {
			return translateInputassessment_lang_lkp(oldModel);
		}

		if (oldModelClassName.equals(assessment_lang_versionClp.class.getName())) {
			return translateInputassessment_lang_version(oldModel);
		}

		if (oldModelClassName.equals(assessment_stagesClp.class.getName())) {
			return translateInputassessment_stages(oldModel);
		}

		if (oldModelClassName.equals(assessment_statusClp.class.getName())) {
			return translateInputassessment_status(oldModel);
		}

		if (oldModelClassName.equals(assessment_validationClp.class.getName())) {
			return translateInputassessment_validation(oldModel);
		}

		if (oldModelClassName.equals(assessment_whvaluesClp.class.getName())) {
			return translateInputassessment_whvalues(oldModel);
		}

		if (oldModelClassName.equals(
					assessment_whvalues_whcriterionClp.class.getName())) {
			return translateInputassessment_whvalues_whcriterion(oldModel);
		}

		if (oldModelClassName.equals(
					benefit_checksubtype_lkpClp.class.getName())) {
			return translateInputbenefit_checksubtype_lkp(oldModel);
		}

		if (oldModelClassName.equals(benefit_checktype_lkpClp.class.getName())) {
			return translateInputbenefit_checktype_lkp(oldModel);
		}

		if (oldModelClassName.equals(benefit_rating_lkpClp.class.getName())) {
			return translateInputbenefit_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(benefitsClp.class.getName())) {
			return translateInputbenefits(oldModel);
		}

		if (oldModelClassName.equals(benefits_summaryClp.class.getName())) {
			return translateInputbenefits_summary(oldModel);
		}

		if (oldModelClassName.equals(benefits_type_refClp.class.getName())) {
			return translateInputbenefits_type_ref(oldModel);
		}

		if (oldModelClassName.equals(biodiversity_valuesClp.class.getName())) {
			return translateInputbiodiversity_values(oldModel);
		}

		if (oldModelClassName.equals(
					boundary_modification_type_lkpClp.class.getName())) {
			return translateInputboundary_modification_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(conservation_outlookClp.class.getName())) {
			return translateInputconservation_outlook(oldModel);
		}

		if (oldModelClassName.equals(
					conservation_outlook_rating_lkpClp.class.getName())) {
			return translateInputconservation_outlook_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(contact_categoryClp.class.getName())) {
			return translateInputcontact_category(oldModel);
		}

		if (oldModelClassName.equals(country_lkpClp.class.getName())) {
			return translateInputcountry_lkp(oldModel);
		}

		if (oldModelClassName.equals(current_state_trendClp.class.getName())) {
			return translateInputcurrent_state_trend(oldModel);
		}

		if (oldModelClassName.equals(
					current_state_trend_valuesClp.class.getName())) {
			return translateInputcurrent_state_trend_values(oldModel);
		}

		if (oldModelClassName.equals(
					current_threat_assessment_catClp.class.getName())) {
			return translateInputcurrent_threat_assessment_cat(oldModel);
		}

		if (oldModelClassName.equals(current_threat_valuesClp.class.getName())) {
			return translateInputcurrent_threat_values(oldModel);
		}

		if (oldModelClassName.equals(danger_list_status_lkpClp.class.getName())) {
			return translateInputdanger_list_status_lkp(oldModel);
		}

		if (oldModelClassName.equals(docs_customDataClp.class.getName())) {
			return translateInputdocs_customData(oldModel);
		}

		if (oldModelClassName.equals(docs_sitedataClp.class.getName())) {
			return translateInputdocs_sitedata(oldModel);
		}

		if (oldModelClassName.equals(
					effective_prot_mgmt_iothreatsClp.class.getName())) {
			return translateInputeffective_prot_mgmt_iothreats(oldModel);
		}

		if (oldModelClassName.equals(flagship_species_lkpClp.class.getName())) {
			return translateInputflagship_species_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					inscription_criteria_lkpClp.class.getName())) {
			return translateInputinscription_criteria_lkp(oldModel);
		}

		if (oldModelClassName.equals(inscription_type_lkpClp.class.getName())) {
			return translateInputinscription_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(iucn_pa_lkp_categoryClp.class.getName())) {
			return translateInputiucn_pa_lkp_category(oldModel);
		}

		if (oldModelClassName.equals(iucn_regionClp.class.getName())) {
			return translateInputiucn_region(oldModel);
		}

		if (oldModelClassName.equals(iucn_region_countryClp.class.getName())) {
			return translateInputiucn_region_country(oldModel);
		}

		if (oldModelClassName.equals(key_conservation_issuesClp.class.getName())) {
			return translateInputkey_conservation_issues(oldModel);
		}

		if (oldModelClassName.equals(
					key_conservation_scale_lkpClp.class.getName())) {
			return translateInputkey_conservation_scale_lkp(oldModel);
		}

		if (oldModelClassName.equals(mission_lkpClp.class.getName())) {
			return translateInputmission_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					negative_factors_level_impactClp.class.getName())) {
			return translateInputnegative_factors_level_impact(oldModel);
		}

		if (oldModelClassName.equals(negative_factors_trendClp.class.getName())) {
			return translateInputnegative_factors_trend(oldModel);
		}

		if (oldModelClassName.equals(other_designation_lkpClp.class.getName())) {
			return translateInputother_designation_lkp(oldModel);
		}

		if (oldModelClassName.equals(potential_project_needsClp.class.getName())) {
			return translateInputpotential_project_needs(oldModel);
		}

		if (oldModelClassName.equals(
					potential_threat_assessment_catClp.class.getName())) {
			return translateInputpotential_threat_assessment_cat(oldModel);
		}

		if (oldModelClassName.equals(potential_threat_valuesClp.class.getName())) {
			return translateInputpotential_threat_values(oldModel);
		}

		if (oldModelClassName.equals(
					prot_mgmt_best_practicesClp.class.getName())) {
			return translateInputprot_mgmt_best_practices(oldModel);
		}

		if (oldModelClassName.equals(prot_mgmt_overallClp.class.getName())) {
			return translateInputprot_mgmt_overall(oldModel);
		}

		if (oldModelClassName.equals(protection_managementClp.class.getName())) {
			return translateInputprotection_management(oldModel);
		}

		if (oldModelClassName.equals(
					protection_management_ratings_lkpClp.class.getName())) {
			return translateInputprotection_management_ratings_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					protection_mgmt_checklist_lkpClp.class.getName())) {
			return translateInputprotection_mgmt_checklist_lkp(oldModel);
		}

		if (oldModelClassName.equals(recommendation_type_lkpClp.class.getName())) {
			return translateInputrecommendation_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(referencesClp.class.getName())) {
			return translateInputreferences(oldModel);
		}

		if (oldModelClassName.equals(reinforced_monitoringClp.class.getName())) {
			return translateInputreinforced_monitoring(oldModel);
		}

		if (oldModelClassName.equals(site_assessmentClp.class.getName())) {
			return translateInputsite_assessment(oldModel);
		}

		if (oldModelClassName.equals(
					site_assessment_versionsClp.class.getName())) {
			return translateInputsite_assessment_versions(oldModel);
		}

		if (oldModelClassName.equals(sites_thematicClp.class.getName())) {
			return translateInputsites_thematic(oldModel);
		}

		if (oldModelClassName.equals(state_lkpClp.class.getName())) {
			return translateInputstate_lkp(oldModel);
		}

		if (oldModelClassName.equals(state_trend_biodivvalsClp.class.getName())) {
			return translateInputstate_trend_biodivvals(oldModel);
		}

		if (oldModelClassName.equals(state_trend_whvaluesClp.class.getName())) {
			return translateInputstate_trend_whvalues(oldModel);
		}

		if (oldModelClassName.equals(thematic_lkpClp.class.getName())) {
			return translateInputthematic_lkp(oldModel);
		}

		if (oldModelClassName.equals(threat_categories_lkpClp.class.getName())) {
			return translateInputthreat_categories_lkp(oldModel);
		}

		if (oldModelClassName.equals(threat_rating_lkpClp.class.getName())) {
			return translateInputthreat_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					threat_subcategories_lkpClp.class.getName())) {
			return translateInputthreat_subcategories_lkp(oldModel);
		}

		if (oldModelClassName.equals(threat_summary_currentClp.class.getName())) {
			return translateInputthreat_summary_current(oldModel);
		}

		if (oldModelClassName.equals(threat_summary_overallClp.class.getName())) {
			return translateInputthreat_summary_overall(oldModel);
		}

		if (oldModelClassName.equals(
					threat_summary_potentialClp.class.getName())) {
			return translateInputthreat_summary_potential(oldModel);
		}

		if (oldModelClassName.equals(trend_lkpClp.class.getName())) {
			return translateInputtrend_lkp(oldModel);
		}

		if (oldModelClassName.equals(unesco_regionClp.class.getName())) {
			return translateInputunesco_region(oldModel);
		}

		if (oldModelClassName.equals(unesco_region_countryClp.class.getName())) {
			return translateInputunesco_region_country(oldModel);
		}

		if (oldModelClassName.equals(whp_contactClp.class.getName())) {
			return translateInputwhp_contact(oldModel);
		}

		if (oldModelClassName.equals(whp_criteria_lkpClp.class.getName())) {
			return translateInputwhp_criteria_lkp(oldModel);
		}

		if (oldModelClassName.equals(whp_site_danger_listClp.class.getName())) {
			return translateInputwhp_site_danger_list(oldModel);
		}

		if (oldModelClassName.equals(whp_sitesClp.class.getName())) {
			return translateInputwhp_sites(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_boundary_modificationClp.class.getName())) {
			return translateInputwhp_sites_boundary_modification(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_budgetClp.class.getName())) {
			return translateInputwhp_sites_budget(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_componentClp.class.getName())) {
			return translateInputwhp_sites_component(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_contactsClp.class.getName())) {
			return translateInputwhp_sites_contacts(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_countryClp.class.getName())) {
			return translateInputwhp_sites_country(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_dsocrClp.class.getName())) {
			return translateInputwhp_sites_dsocr(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_external_documentsClp.class.getName())) {
			return translateInputwhp_sites_external_documents(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_flagship_speciesClp.class.getName())) {
			return translateInputwhp_sites_flagship_species(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_indigenous_communitiesClp.class.getName())) {
			return translateInputwhp_sites_indigenous_communities(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_inscription_criteriaClp.class.getName())) {
			return translateInputwhp_sites_inscription_criteria(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_inscription_dateClp.class.getName())) {
			return translateInputwhp_sites_inscription_date(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_iucn_pa_categoryClp.class.getName())) {
			return translateInputwhp_sites_iucn_pa_category(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_iucn_recommendationClp.class.getName())) {
			return translateInputwhp_sites_iucn_recommendation(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_meeClp.class.getName())) {
			return translateInputwhp_sites_mee(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_mgmt_plan_stateClp.class.getName())) {
			return translateInputwhp_sites_mgmt_plan_state(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_missionClp.class.getName())) {
			return translateInputwhp_sites_mission(oldModel);
		}

		if (oldModelClassName.equals(
					whp_sites_other_designationsClp.class.getName())) {
			return translateInputwhp_sites_other_designations(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_soc_reportsClp.class.getName())) {
			return translateInputwhp_sites_soc_reports(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_soouvClp.class.getName())) {
			return translateInputwhp_sites_soouv(oldModel);
		}

		if (oldModelClassName.equals(whp_sites_visitorsClp.class.getName())) {
			return translateInputwhp_sites_visitors(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputactive_conservation_projects(
		BaseModel<?> oldModel) {
		active_conservation_projectsClp oldClpModel = (active_conservation_projectsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getactive_conservation_projectsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputadvance_query_assessment(
		BaseModel<?> oldModel) {
		advance_query_assessmentClp oldClpModel = (advance_query_assessmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getadvance_query_assessmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputadvance_query_site(BaseModel<?> oldModel) {
		advance_query_siteClp oldClpModel = (advance_query_siteClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getadvance_query_siteRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessing_threats_current(
		BaseModel<?> oldModel) {
		assessing_threats_currentClp oldClpModel = (assessing_threats_currentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessing_threats_currentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessing_threats_potential(
		BaseModel<?> oldModel) {
		assessing_threats_potentialClp oldClpModel = (assessing_threats_potentialClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessing_threats_potentialRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_lang_lkp(
		BaseModel<?> oldModel) {
		assessment_lang_lkpClp oldClpModel = (assessment_lang_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_lang_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_lang_version(
		BaseModel<?> oldModel) {
		assessment_lang_versionClp oldClpModel = (assessment_lang_versionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_lang_versionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_stages(BaseModel<?> oldModel) {
		assessment_stagesClp oldClpModel = (assessment_stagesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_stagesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_status(BaseModel<?> oldModel) {
		assessment_statusClp oldClpModel = (assessment_statusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_statusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_validation(
		BaseModel<?> oldModel) {
		assessment_validationClp oldClpModel = (assessment_validationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_validationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_whvalues(
		BaseModel<?> oldModel) {
		assessment_whvaluesClp oldClpModel = (assessment_whvaluesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_whvaluesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputassessment_whvalues_whcriterion(
		BaseModel<?> oldModel) {
		assessment_whvalues_whcriterionClp oldClpModel = (assessment_whvalues_whcriterionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getassessment_whvalues_whcriterionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefit_checksubtype_lkp(
		BaseModel<?> oldModel) {
		benefit_checksubtype_lkpClp oldClpModel = (benefit_checksubtype_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefit_checksubtype_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefit_checktype_lkp(
		BaseModel<?> oldModel) {
		benefit_checktype_lkpClp oldClpModel = (benefit_checktype_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefit_checktype_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefit_rating_lkp(BaseModel<?> oldModel) {
		benefit_rating_lkpClp oldClpModel = (benefit_rating_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefit_rating_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefits(BaseModel<?> oldModel) {
		benefitsClp oldClpModel = (benefitsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefitsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefits_summary(BaseModel<?> oldModel) {
		benefits_summaryClp oldClpModel = (benefits_summaryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefits_summaryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbenefits_type_ref(BaseModel<?> oldModel) {
		benefits_type_refClp oldClpModel = (benefits_type_refClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbenefits_type_refRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputbiodiversity_values(
		BaseModel<?> oldModel) {
		biodiversity_valuesClp oldClpModel = (biodiversity_valuesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbiodiversity_valuesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputboundary_modification_type_lkp(
		BaseModel<?> oldModel) {
		boundary_modification_type_lkpClp oldClpModel = (boundary_modification_type_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getboundary_modification_type_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputconservation_outlook(
		BaseModel<?> oldModel) {
		conservation_outlookClp oldClpModel = (conservation_outlookClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getconservation_outlookRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputconservation_outlook_rating_lkp(
		BaseModel<?> oldModel) {
		conservation_outlook_rating_lkpClp oldClpModel = (conservation_outlook_rating_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getconservation_outlook_rating_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcontact_category(BaseModel<?> oldModel) {
		contact_categoryClp oldClpModel = (contact_categoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcontact_categoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcountry_lkp(BaseModel<?> oldModel) {
		country_lkpClp oldClpModel = (country_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcountry_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcurrent_state_trend(
		BaseModel<?> oldModel) {
		current_state_trendClp oldClpModel = (current_state_trendClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcurrent_state_trendRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcurrent_state_trend_values(
		BaseModel<?> oldModel) {
		current_state_trend_valuesClp oldClpModel = (current_state_trend_valuesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcurrent_state_trend_valuesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcurrent_threat_assessment_cat(
		BaseModel<?> oldModel) {
		current_threat_assessment_catClp oldClpModel = (current_threat_assessment_catClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcurrent_threat_assessment_catRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcurrent_threat_values(
		BaseModel<?> oldModel) {
		current_threat_valuesClp oldClpModel = (current_threat_valuesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcurrent_threat_valuesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputdanger_list_status_lkp(
		BaseModel<?> oldModel) {
		danger_list_status_lkpClp oldClpModel = (danger_list_status_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getdanger_list_status_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputdocs_customData(BaseModel<?> oldModel) {
		docs_customDataClp oldClpModel = (docs_customDataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getdocs_customDataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputdocs_sitedata(BaseModel<?> oldModel) {
		docs_sitedataClp oldClpModel = (docs_sitedataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getdocs_sitedataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputeffective_prot_mgmt_iothreats(
		BaseModel<?> oldModel) {
		effective_prot_mgmt_iothreatsClp oldClpModel = (effective_prot_mgmt_iothreatsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.geteffective_prot_mgmt_iothreatsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputflagship_species_lkp(
		BaseModel<?> oldModel) {
		flagship_species_lkpClp oldClpModel = (flagship_species_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getflagship_species_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputinscription_criteria_lkp(
		BaseModel<?> oldModel) {
		inscription_criteria_lkpClp oldClpModel = (inscription_criteria_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getinscription_criteria_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputinscription_type_lkp(
		BaseModel<?> oldModel) {
		inscription_type_lkpClp oldClpModel = (inscription_type_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getinscription_type_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputiucn_pa_lkp_category(
		BaseModel<?> oldModel) {
		iucn_pa_lkp_categoryClp oldClpModel = (iucn_pa_lkp_categoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getiucn_pa_lkp_categoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputiucn_region(BaseModel<?> oldModel) {
		iucn_regionClp oldClpModel = (iucn_regionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getiucn_regionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputiucn_region_country(
		BaseModel<?> oldModel) {
		iucn_region_countryClp oldClpModel = (iucn_region_countryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getiucn_region_countryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputkey_conservation_issues(
		BaseModel<?> oldModel) {
		key_conservation_issuesClp oldClpModel = (key_conservation_issuesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getkey_conservation_issuesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputkey_conservation_scale_lkp(
		BaseModel<?> oldModel) {
		key_conservation_scale_lkpClp oldClpModel = (key_conservation_scale_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getkey_conservation_scale_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputmission_lkp(BaseModel<?> oldModel) {
		mission_lkpClp oldClpModel = (mission_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getmission_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnegative_factors_level_impact(
		BaseModel<?> oldModel) {
		negative_factors_level_impactClp oldClpModel = (negative_factors_level_impactClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnegative_factors_level_impactRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnegative_factors_trend(
		BaseModel<?> oldModel) {
		negative_factors_trendClp oldClpModel = (negative_factors_trendClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnegative_factors_trendRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputother_designation_lkp(
		BaseModel<?> oldModel) {
		other_designation_lkpClp oldClpModel = (other_designation_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getother_designation_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpotential_project_needs(
		BaseModel<?> oldModel) {
		potential_project_needsClp oldClpModel = (potential_project_needsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpotential_project_needsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpotential_threat_assessment_cat(
		BaseModel<?> oldModel) {
		potential_threat_assessment_catClp oldClpModel = (potential_threat_assessment_catClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpotential_threat_assessment_catRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpotential_threat_values(
		BaseModel<?> oldModel) {
		potential_threat_valuesClp oldClpModel = (potential_threat_valuesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpotential_threat_valuesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprot_mgmt_best_practices(
		BaseModel<?> oldModel) {
		prot_mgmt_best_practicesClp oldClpModel = (prot_mgmt_best_practicesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprot_mgmt_best_practicesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprot_mgmt_overall(BaseModel<?> oldModel) {
		prot_mgmt_overallClp oldClpModel = (prot_mgmt_overallClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprot_mgmt_overallRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprotection_management(
		BaseModel<?> oldModel) {
		protection_managementClp oldClpModel = (protection_managementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprotection_managementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprotection_management_ratings_lkp(
		BaseModel<?> oldModel) {
		protection_management_ratings_lkpClp oldClpModel = (protection_management_ratings_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprotection_management_ratings_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprotection_mgmt_checklist_lkp(
		BaseModel<?> oldModel) {
		protection_mgmt_checklist_lkpClp oldClpModel = (protection_mgmt_checklist_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprotection_mgmt_checklist_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputrecommendation_type_lkp(
		BaseModel<?> oldModel) {
		recommendation_type_lkpClp oldClpModel = (recommendation_type_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getrecommendation_type_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputreferences(BaseModel<?> oldModel) {
		referencesClp oldClpModel = (referencesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getreferencesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputreinforced_monitoring(
		BaseModel<?> oldModel) {
		reinforced_monitoringClp oldClpModel = (reinforced_monitoringClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getreinforced_monitoringRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsite_assessment(BaseModel<?> oldModel) {
		site_assessmentClp oldClpModel = (site_assessmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsite_assessmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsite_assessment_versions(
		BaseModel<?> oldModel) {
		site_assessment_versionsClp oldClpModel = (site_assessment_versionsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsite_assessment_versionsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsites_thematic(BaseModel<?> oldModel) {
		sites_thematicClp oldClpModel = (sites_thematicClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsites_thematicRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputstate_lkp(BaseModel<?> oldModel) {
		state_lkpClp oldClpModel = (state_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getstate_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputstate_trend_biodivvals(
		BaseModel<?> oldModel) {
		state_trend_biodivvalsClp oldClpModel = (state_trend_biodivvalsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getstate_trend_biodivvalsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputstate_trend_whvalues(
		BaseModel<?> oldModel) {
		state_trend_whvaluesClp oldClpModel = (state_trend_whvaluesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getstate_trend_whvaluesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthematic_lkp(BaseModel<?> oldModel) {
		thematic_lkpClp oldClpModel = (thematic_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthematic_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_categories_lkp(
		BaseModel<?> oldModel) {
		threat_categories_lkpClp oldClpModel = (threat_categories_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_categories_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_rating_lkp(BaseModel<?> oldModel) {
		threat_rating_lkpClp oldClpModel = (threat_rating_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_rating_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_subcategories_lkp(
		BaseModel<?> oldModel) {
		threat_subcategories_lkpClp oldClpModel = (threat_subcategories_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_subcategories_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_summary_current(
		BaseModel<?> oldModel) {
		threat_summary_currentClp oldClpModel = (threat_summary_currentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_summary_currentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_summary_overall(
		BaseModel<?> oldModel) {
		threat_summary_overallClp oldClpModel = (threat_summary_overallClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_summary_overallRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputthreat_summary_potential(
		BaseModel<?> oldModel) {
		threat_summary_potentialClp oldClpModel = (threat_summary_potentialClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getthreat_summary_potentialRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtrend_lkp(BaseModel<?> oldModel) {
		trend_lkpClp oldClpModel = (trend_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrend_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputunesco_region(BaseModel<?> oldModel) {
		unesco_regionClp oldClpModel = (unesco_regionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getunesco_regionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputunesco_region_country(
		BaseModel<?> oldModel) {
		unesco_region_countryClp oldClpModel = (unesco_region_countryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getunesco_region_countryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_contact(BaseModel<?> oldModel) {
		whp_contactClp oldClpModel = (whp_contactClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_contactRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_criteria_lkp(BaseModel<?> oldModel) {
		whp_criteria_lkpClp oldClpModel = (whp_criteria_lkpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_criteria_lkpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_site_danger_list(
		BaseModel<?> oldModel) {
		whp_site_danger_listClp oldClpModel = (whp_site_danger_listClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_site_danger_listRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites(BaseModel<?> oldModel) {
		whp_sitesClp oldClpModel = (whp_sitesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sitesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_boundary_modification(
		BaseModel<?> oldModel) {
		whp_sites_boundary_modificationClp oldClpModel = (whp_sites_boundary_modificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_boundary_modificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_budget(BaseModel<?> oldModel) {
		whp_sites_budgetClp oldClpModel = (whp_sites_budgetClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_budgetRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_component(
		BaseModel<?> oldModel) {
		whp_sites_componentClp oldClpModel = (whp_sites_componentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_componentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_contacts(BaseModel<?> oldModel) {
		whp_sites_contactsClp oldClpModel = (whp_sites_contactsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_contactsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_country(BaseModel<?> oldModel) {
		whp_sites_countryClp oldClpModel = (whp_sites_countryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_countryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_dsocr(BaseModel<?> oldModel) {
		whp_sites_dsocrClp oldClpModel = (whp_sites_dsocrClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_dsocrRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_external_documents(
		BaseModel<?> oldModel) {
		whp_sites_external_documentsClp oldClpModel = (whp_sites_external_documentsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_external_documentsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_flagship_species(
		BaseModel<?> oldModel) {
		whp_sites_flagship_speciesClp oldClpModel = (whp_sites_flagship_speciesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_flagship_speciesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_indigenous_communities(
		BaseModel<?> oldModel) {
		whp_sites_indigenous_communitiesClp oldClpModel = (whp_sites_indigenous_communitiesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_indigenous_communitiesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_inscription_criteria(
		BaseModel<?> oldModel) {
		whp_sites_inscription_criteriaClp oldClpModel = (whp_sites_inscription_criteriaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_inscription_criteriaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_inscription_date(
		BaseModel<?> oldModel) {
		whp_sites_inscription_dateClp oldClpModel = (whp_sites_inscription_dateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_inscription_dateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_iucn_pa_category(
		BaseModel<?> oldModel) {
		whp_sites_iucn_pa_categoryClp oldClpModel = (whp_sites_iucn_pa_categoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_iucn_pa_categoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_iucn_recommendation(
		BaseModel<?> oldModel) {
		whp_sites_iucn_recommendationClp oldClpModel = (whp_sites_iucn_recommendationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_iucn_recommendationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_mee(BaseModel<?> oldModel) {
		whp_sites_meeClp oldClpModel = (whp_sites_meeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_meeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_mgmt_plan_state(
		BaseModel<?> oldModel) {
		whp_sites_mgmt_plan_stateClp oldClpModel = (whp_sites_mgmt_plan_stateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_mgmt_plan_stateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_mission(BaseModel<?> oldModel) {
		whp_sites_missionClp oldClpModel = (whp_sites_missionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_missionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_other_designations(
		BaseModel<?> oldModel) {
		whp_sites_other_designationsClp oldClpModel = (whp_sites_other_designationsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_other_designationsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_soc_reports(
		BaseModel<?> oldModel) {
		whp_sites_soc_reportsClp oldClpModel = (whp_sites_soc_reportsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_soc_reportsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_soouv(BaseModel<?> oldModel) {
		whp_sites_soouvClp oldClpModel = (whp_sites_soouvClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_soouvRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwhp_sites_visitors(BaseModel<?> oldModel) {
		whp_sites_visitorsClp oldClpModel = (whp_sites_visitorsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getwhp_sites_visitorsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.active_conservation_projectsImpl")) {
			return translateOutputactive_conservation_projects(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.advance_query_assessmentImpl")) {
			return translateOutputadvance_query_assessment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.advance_query_siteImpl")) {
			return translateOutputadvance_query_site(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl")) {
			return translateOutputassessing_threats_current(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl")) {
			return translateOutputassessing_threats_potential(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_lang_lkpImpl")) {
			return translateOutputassessment_lang_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl")) {
			return translateOutputassessment_lang_version(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_stagesImpl")) {
			return translateOutputassessment_stages(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_statusImpl")) {
			return translateOutputassessment_status(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_validationImpl")) {
			return translateOutputassessment_validation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl")) {
			return translateOutputassessment_whvalues(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionImpl")) {
			return translateOutputassessment_whvalues_whcriterion(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl")) {
			return translateOutputbenefit_checksubtype_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefit_checktype_lkpImpl")) {
			return translateOutputbenefit_checktype_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefit_rating_lkpImpl")) {
			return translateOutputbenefit_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefitsImpl")) {
			return translateOutputbenefits(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefits_summaryImpl")) {
			return translateOutputbenefits_summary(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.benefits_type_refImpl")) {
			return translateOutputbenefits_type_ref(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl")) {
			return translateOutputbiodiversity_values(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.boundary_modification_type_lkpImpl")) {
			return translateOutputboundary_modification_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.conservation_outlookImpl")) {
			return translateOutputconservation_outlook(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.conservation_outlook_rating_lkpImpl")) {
			return translateOutputconservation_outlook_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.contact_categoryImpl")) {
			return translateOutputcontact_category(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.country_lkpImpl")) {
			return translateOutputcountry_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.current_state_trendImpl")) {
			return translateOutputcurrent_state_trend(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl")) {
			return translateOutputcurrent_state_trend_values(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl")) {
			return translateOutputcurrent_threat_assessment_cat(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl")) {
			return translateOutputcurrent_threat_values(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.danger_list_status_lkpImpl")) {
			return translateOutputdanger_list_status_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.docs_customDataImpl")) {
			return translateOutputdocs_customData(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.docs_sitedataImpl")) {
			return translateOutputdocs_sitedata(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsImpl")) {
			return translateOutputeffective_prot_mgmt_iothreats(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.flagship_species_lkpImpl")) {
			return translateOutputflagship_species_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.inscription_criteria_lkpImpl")) {
			return translateOutputinscription_criteria_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.inscription_type_lkpImpl")) {
			return translateOutputinscription_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.iucn_pa_lkp_categoryImpl")) {
			return translateOutputiucn_pa_lkp_category(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.iucn_regionImpl")) {
			return translateOutputiucn_region(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.iucn_region_countryImpl")) {
			return translateOutputiucn_region_country(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.key_conservation_issuesImpl")) {
			return translateOutputkey_conservation_issues(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.key_conservation_scale_lkpImpl")) {
			return translateOutputkey_conservation_scale_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.mission_lkpImpl")) {
			return translateOutputmission_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.negative_factors_level_impactImpl")) {
			return translateOutputnegative_factors_level_impact(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.negative_factors_trendImpl")) {
			return translateOutputnegative_factors_trend(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.other_designation_lkpImpl")) {
			return translateOutputother_designation_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.potential_project_needsImpl")) {
			return translateOutputpotential_project_needs(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catImpl")) {
			return translateOutputpotential_threat_assessment_cat(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.potential_threat_valuesImpl")) {
			return translateOutputpotential_threat_values(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl")) {
			return translateOutputprot_mgmt_best_practices(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.prot_mgmt_overallImpl")) {
			return translateOutputprot_mgmt_overall(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.protection_managementImpl")) {
			return translateOutputprotection_management(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.protection_management_ratings_lkpImpl")) {
			return translateOutputprotection_management_ratings_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpImpl")) {
			return translateOutputprotection_mgmt_checklist_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.recommendation_type_lkpImpl")) {
			return translateOutputrecommendation_type_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.referencesImpl")) {
			return translateOutputreferences(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl")) {
			return translateOutputreinforced_monitoring(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.site_assessmentImpl")) {
			return translateOutputsite_assessment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl")) {
			return translateOutputsite_assessment_versions(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.sites_thematicImpl")) {
			return translateOutputsites_thematic(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.state_lkpImpl")) {
			return translateOutputstate_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl")) {
			return translateOutputstate_trend_biodivvals(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.state_trend_whvaluesImpl")) {
			return translateOutputstate_trend_whvalues(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.thematic_lkpImpl")) {
			return translateOutputthematic_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_categories_lkpImpl")) {
			return translateOutputthreat_categories_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_rating_lkpImpl")) {
			return translateOutputthreat_rating_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpImpl")) {
			return translateOutputthreat_subcategories_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_summary_currentImpl")) {
			return translateOutputthreat_summary_current(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl")) {
			return translateOutputthreat_summary_overall(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.threat_summary_potentialImpl")) {
			return translateOutputthreat_summary_potential(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.trend_lkpImpl")) {
			return translateOutputtrend_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.unesco_regionImpl")) {
			return translateOutputunesco_region(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.unesco_region_countryImpl")) {
			return translateOutputunesco_region_country(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_contactImpl")) {
			return translateOutputwhp_contact(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_criteria_lkpImpl")) {
			return translateOutputwhp_criteria_lkp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_site_danger_listImpl")) {
			return translateOutputwhp_site_danger_list(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sitesImpl")) {
			return translateOutputwhp_sites(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl")) {
			return translateOutputwhp_sites_boundary_modification(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_budgetImpl")) {
			return translateOutputwhp_sites_budget(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_componentImpl")) {
			return translateOutputwhp_sites_component(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_contactsImpl")) {
			return translateOutputwhp_sites_contacts(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl")) {
			return translateOutputwhp_sites_country(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_dsocrImpl")) {
			return translateOutputwhp_sites_dsocr(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsImpl")) {
			return translateOutputwhp_sites_external_documents(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesImpl")) {
			return translateOutputwhp_sites_flagship_species(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl")) {
			return translateOutputwhp_sites_indigenous_communities(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaImpl")) {
			return translateOutputwhp_sites_inscription_criteria(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateImpl")) {
			return translateOutputwhp_sites_inscription_date(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl")) {
			return translateOutputwhp_sites_iucn_pa_category(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationImpl")) {
			return translateOutputwhp_sites_iucn_recommendation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_meeImpl")) {
			return translateOutputwhp_sites_mee(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateImpl")) {
			return translateOutputwhp_sites_mgmt_plan_state(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl")) {
			return translateOutputwhp_sites_mission(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsImpl")) {
			return translateOutputwhp_sites_other_designations(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl")) {
			return translateOutputwhp_sites_soc_reports(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_soouvImpl")) {
			return translateOutputwhp_sites_soouv(oldModel);
		}

		if (oldModelClassName.equals(
					"com.iucn.whp.dbservice.model.impl.whp_sites_visitorsImpl")) {
			return translateOutputwhp_sites_visitors(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException")) {
			return new com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchadvance_query_assessmentException")) {
			return new com.iucn.whp.dbservice.NoSuchadvance_query_assessmentException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchadvance_query_siteException")) {
			return new com.iucn.whp.dbservice.NoSuchadvance_query_siteException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessing_threats_currentException")) {
			return new com.iucn.whp.dbservice.NoSuchassessing_threats_currentException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException")) {
			return new com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_lang_versionException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_lang_versionException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_stagesException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_stagesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_statusException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_statusException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_validationException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_validationException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_whvaluesException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_whvaluesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException")) {
			return new com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbenefit_rating_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefit_rating_lkpException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuchbenefitsException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefitsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbenefits_summaryException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefits_summaryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbenefits_type_refException")) {
			return new com.iucn.whp.dbservice.NoSuchbenefits_type_refException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException")) {
			return new com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchconservation_outlookException")) {
			return new com.iucn.whp.dbservice.NoSuchconservation_outlookException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcontact_categoryException")) {
			return new com.iucn.whp.dbservice.NoSuchcontact_categoryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcountry_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchcountry_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcurrent_state_trendException")) {
			return new com.iucn.whp.dbservice.NoSuchcurrent_state_trendException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException")) {
			return new com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException")) {
			return new com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException")) {
			return new com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchdanger_list_status_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchdanger_list_status_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchdocs_customDataException")) {
			return new com.iucn.whp.dbservice.NoSuchdocs_customDataException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchdocs_sitedataException")) {
			return new com.iucn.whp.dbservice.NoSuchdocs_sitedataException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException")) {
			return new com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchflagship_species_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchflagship_species_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchinscription_criteria_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchinscription_criteria_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchinscription_type_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchinscription_type_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException")) {
			return new com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchiucn_regionException")) {
			return new com.iucn.whp.dbservice.NoSuchiucn_regionException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchiucn_region_countryException")) {
			return new com.iucn.whp.dbservice.NoSuchiucn_region_countryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException")) {
			return new com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchkey_conservation_scale_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchkey_conservation_scale_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchmission_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchmission_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException")) {
			return new com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchnegative_factors_trendException")) {
			return new com.iucn.whp.dbservice.NoSuchnegative_factors_trendException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchother_designation_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchother_designation_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchpotential_project_needsException")) {
			return new com.iucn.whp.dbservice.NoSuchpotential_project_needsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchpotential_threat_assessment_catException")) {
			return new com.iucn.whp.dbservice.NoSuchpotential_threat_assessment_catException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException")) {
			return new com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException")) {
			return new com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException")) {
			return new com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchprotection_managementException")) {
			return new com.iucn.whp.dbservice.NoSuchprotection_managementException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchprotection_management_ratings_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchprotection_management_ratings_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchrecommendation_type_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchrecommendation_type_lkpException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuchreferencesException")) {
			return new com.iucn.whp.dbservice.NoSuchreferencesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchreinforced_monitoringException")) {
			return new com.iucn.whp.dbservice.NoSuchreinforced_monitoringException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchsite_assessmentException")) {
			return new com.iucn.whp.dbservice.NoSuchsite_assessmentException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException")) {
			return new com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchsites_thematicException")) {
			return new com.iucn.whp.dbservice.NoSuchsites_thematicException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuchstate_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchstate_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException")) {
			return new com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException")) {
			return new com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthematic_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchthematic_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_rating_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_rating_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_summary_currentException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_summary_currentException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_summary_overallException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_summary_overallException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchthreat_summary_potentialException")) {
			return new com.iucn.whp.dbservice.NoSuchthreat_summary_potentialException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuchtrend_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuchtrend_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchunesco_regionException")) {
			return new com.iucn.whp.dbservice.NoSuchunesco_regionException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuchunesco_region_countryException")) {
			return new com.iucn.whp.dbservice.NoSuchunesco_region_countryException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuch_contactException")) {
			return new com.iucn.whp.dbservice.NoSuch_contactException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_criteria_lkpException")) {
			return new com.iucn.whp.dbservice.NoSuch_criteria_lkpException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_site_danger_listException")) {
			return new com.iucn.whp.dbservice.NoSuch_site_danger_listException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuch_sitesException")) {
			return new com.iucn.whp.dbservice.NoSuch_sitesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_budgetException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_budgetException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_componentException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_componentException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_contactsException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_contactsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_countryException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_countryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_dsocrException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_dsocrException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_external_documentsException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_external_documentsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_iucn_pa_categoryException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_iucn_pa_categoryException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException();
		}

		if (className.equals("com.iucn.whp.dbservice.NoSuch_sites_meeException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_meeException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_mgmt_plan_stateException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_mgmt_plan_stateException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_missionException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_missionException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_other_designationsException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_other_designationsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_soouvException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_soouvException();
		}

		if (className.equals(
					"com.iucn.whp.dbservice.NoSuch_sites_visitorsException")) {
			return new com.iucn.whp.dbservice.NoSuch_sites_visitorsException();
		}

		return throwable;
	}

	public static Object translateOutputactive_conservation_projects(
		BaseModel<?> oldModel) {
		active_conservation_projectsClp newModel = new active_conservation_projectsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setactive_conservation_projectsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputadvance_query_assessment(
		BaseModel<?> oldModel) {
		advance_query_assessmentClp newModel = new advance_query_assessmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setadvance_query_assessmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputadvance_query_site(
		BaseModel<?> oldModel) {
		advance_query_siteClp newModel = new advance_query_siteClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setadvance_query_siteRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessing_threats_current(
		BaseModel<?> oldModel) {
		assessing_threats_currentClp newModel = new assessing_threats_currentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessing_threats_currentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessing_threats_potential(
		BaseModel<?> oldModel) {
		assessing_threats_potentialClp newModel = new assessing_threats_potentialClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessing_threats_potentialRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_lang_lkp(
		BaseModel<?> oldModel) {
		assessment_lang_lkpClp newModel = new assessment_lang_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_lang_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_lang_version(
		BaseModel<?> oldModel) {
		assessment_lang_versionClp newModel = new assessment_lang_versionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_lang_versionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_stages(BaseModel<?> oldModel) {
		assessment_stagesClp newModel = new assessment_stagesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_stagesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_status(BaseModel<?> oldModel) {
		assessment_statusClp newModel = new assessment_statusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_statusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_validation(
		BaseModel<?> oldModel) {
		assessment_validationClp newModel = new assessment_validationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_validationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_whvalues(
		BaseModel<?> oldModel) {
		assessment_whvaluesClp newModel = new assessment_whvaluesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_whvaluesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputassessment_whvalues_whcriterion(
		BaseModel<?> oldModel) {
		assessment_whvalues_whcriterionClp newModel = new assessment_whvalues_whcriterionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setassessment_whvalues_whcriterionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefit_checksubtype_lkp(
		BaseModel<?> oldModel) {
		benefit_checksubtype_lkpClp newModel = new benefit_checksubtype_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefit_checksubtype_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefit_checktype_lkp(
		BaseModel<?> oldModel) {
		benefit_checktype_lkpClp newModel = new benefit_checktype_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefit_checktype_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefit_rating_lkp(
		BaseModel<?> oldModel) {
		benefit_rating_lkpClp newModel = new benefit_rating_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefit_rating_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefits(BaseModel<?> oldModel) {
		benefitsClp newModel = new benefitsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefitsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefits_summary(BaseModel<?> oldModel) {
		benefits_summaryClp newModel = new benefits_summaryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefits_summaryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbenefits_type_ref(BaseModel<?> oldModel) {
		benefits_type_refClp newModel = new benefits_type_refClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbenefits_type_refRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputbiodiversity_values(
		BaseModel<?> oldModel) {
		biodiversity_valuesClp newModel = new biodiversity_valuesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbiodiversity_valuesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputboundary_modification_type_lkp(
		BaseModel<?> oldModel) {
		boundary_modification_type_lkpClp newModel = new boundary_modification_type_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setboundary_modification_type_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputconservation_outlook(
		BaseModel<?> oldModel) {
		conservation_outlookClp newModel = new conservation_outlookClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setconservation_outlookRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputconservation_outlook_rating_lkp(
		BaseModel<?> oldModel) {
		conservation_outlook_rating_lkpClp newModel = new conservation_outlook_rating_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setconservation_outlook_rating_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcontact_category(BaseModel<?> oldModel) {
		contact_categoryClp newModel = new contact_categoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcontact_categoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcountry_lkp(BaseModel<?> oldModel) {
		country_lkpClp newModel = new country_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcountry_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcurrent_state_trend(
		BaseModel<?> oldModel) {
		current_state_trendClp newModel = new current_state_trendClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcurrent_state_trendRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcurrent_state_trend_values(
		BaseModel<?> oldModel) {
		current_state_trend_valuesClp newModel = new current_state_trend_valuesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcurrent_state_trend_valuesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcurrent_threat_assessment_cat(
		BaseModel<?> oldModel) {
		current_threat_assessment_catClp newModel = new current_threat_assessment_catClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcurrent_threat_assessment_catRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcurrent_threat_values(
		BaseModel<?> oldModel) {
		current_threat_valuesClp newModel = new current_threat_valuesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcurrent_threat_valuesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputdanger_list_status_lkp(
		BaseModel<?> oldModel) {
		danger_list_status_lkpClp newModel = new danger_list_status_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setdanger_list_status_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputdocs_customData(BaseModel<?> oldModel) {
		docs_customDataClp newModel = new docs_customDataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setdocs_customDataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputdocs_sitedata(BaseModel<?> oldModel) {
		docs_sitedataClp newModel = new docs_sitedataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setdocs_sitedataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputeffective_prot_mgmt_iothreats(
		BaseModel<?> oldModel) {
		effective_prot_mgmt_iothreatsClp newModel = new effective_prot_mgmt_iothreatsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.seteffective_prot_mgmt_iothreatsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputflagship_species_lkp(
		BaseModel<?> oldModel) {
		flagship_species_lkpClp newModel = new flagship_species_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setflagship_species_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputinscription_criteria_lkp(
		BaseModel<?> oldModel) {
		inscription_criteria_lkpClp newModel = new inscription_criteria_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setinscription_criteria_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputinscription_type_lkp(
		BaseModel<?> oldModel) {
		inscription_type_lkpClp newModel = new inscription_type_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setinscription_type_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputiucn_pa_lkp_category(
		BaseModel<?> oldModel) {
		iucn_pa_lkp_categoryClp newModel = new iucn_pa_lkp_categoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setiucn_pa_lkp_categoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputiucn_region(BaseModel<?> oldModel) {
		iucn_regionClp newModel = new iucn_regionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setiucn_regionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputiucn_region_country(
		BaseModel<?> oldModel) {
		iucn_region_countryClp newModel = new iucn_region_countryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setiucn_region_countryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputkey_conservation_issues(
		BaseModel<?> oldModel) {
		key_conservation_issuesClp newModel = new key_conservation_issuesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setkey_conservation_issuesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputkey_conservation_scale_lkp(
		BaseModel<?> oldModel) {
		key_conservation_scale_lkpClp newModel = new key_conservation_scale_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setkey_conservation_scale_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputmission_lkp(BaseModel<?> oldModel) {
		mission_lkpClp newModel = new mission_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setmission_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnegative_factors_level_impact(
		BaseModel<?> oldModel) {
		negative_factors_level_impactClp newModel = new negative_factors_level_impactClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnegative_factors_level_impactRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnegative_factors_trend(
		BaseModel<?> oldModel) {
		negative_factors_trendClp newModel = new negative_factors_trendClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnegative_factors_trendRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputother_designation_lkp(
		BaseModel<?> oldModel) {
		other_designation_lkpClp newModel = new other_designation_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setother_designation_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpotential_project_needs(
		BaseModel<?> oldModel) {
		potential_project_needsClp newModel = new potential_project_needsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpotential_project_needsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpotential_threat_assessment_cat(
		BaseModel<?> oldModel) {
		potential_threat_assessment_catClp newModel = new potential_threat_assessment_catClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpotential_threat_assessment_catRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpotential_threat_values(
		BaseModel<?> oldModel) {
		potential_threat_valuesClp newModel = new potential_threat_valuesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpotential_threat_valuesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprot_mgmt_best_practices(
		BaseModel<?> oldModel) {
		prot_mgmt_best_practicesClp newModel = new prot_mgmt_best_practicesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprot_mgmt_best_practicesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprot_mgmt_overall(BaseModel<?> oldModel) {
		prot_mgmt_overallClp newModel = new prot_mgmt_overallClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprot_mgmt_overallRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprotection_management(
		BaseModel<?> oldModel) {
		protection_managementClp newModel = new protection_managementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprotection_managementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprotection_management_ratings_lkp(
		BaseModel<?> oldModel) {
		protection_management_ratings_lkpClp newModel = new protection_management_ratings_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprotection_management_ratings_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprotection_mgmt_checklist_lkp(
		BaseModel<?> oldModel) {
		protection_mgmt_checklist_lkpClp newModel = new protection_mgmt_checklist_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprotection_mgmt_checklist_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputrecommendation_type_lkp(
		BaseModel<?> oldModel) {
		recommendation_type_lkpClp newModel = new recommendation_type_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setrecommendation_type_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputreferences(BaseModel<?> oldModel) {
		referencesClp newModel = new referencesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setreferencesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputreinforced_monitoring(
		BaseModel<?> oldModel) {
		reinforced_monitoringClp newModel = new reinforced_monitoringClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setreinforced_monitoringRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsite_assessment(BaseModel<?> oldModel) {
		site_assessmentClp newModel = new site_assessmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsite_assessmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsite_assessment_versions(
		BaseModel<?> oldModel) {
		site_assessment_versionsClp newModel = new site_assessment_versionsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsite_assessment_versionsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsites_thematic(BaseModel<?> oldModel) {
		sites_thematicClp newModel = new sites_thematicClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsites_thematicRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputstate_lkp(BaseModel<?> oldModel) {
		state_lkpClp newModel = new state_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setstate_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputstate_trend_biodivvals(
		BaseModel<?> oldModel) {
		state_trend_biodivvalsClp newModel = new state_trend_biodivvalsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setstate_trend_biodivvalsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputstate_trend_whvalues(
		BaseModel<?> oldModel) {
		state_trend_whvaluesClp newModel = new state_trend_whvaluesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setstate_trend_whvaluesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthematic_lkp(BaseModel<?> oldModel) {
		thematic_lkpClp newModel = new thematic_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthematic_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_categories_lkp(
		BaseModel<?> oldModel) {
		threat_categories_lkpClp newModel = new threat_categories_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_categories_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_rating_lkp(BaseModel<?> oldModel) {
		threat_rating_lkpClp newModel = new threat_rating_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_rating_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_subcategories_lkp(
		BaseModel<?> oldModel) {
		threat_subcategories_lkpClp newModel = new threat_subcategories_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_subcategories_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_summary_current(
		BaseModel<?> oldModel) {
		threat_summary_currentClp newModel = new threat_summary_currentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_summary_currentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_summary_overall(
		BaseModel<?> oldModel) {
		threat_summary_overallClp newModel = new threat_summary_overallClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_summary_overallRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputthreat_summary_potential(
		BaseModel<?> oldModel) {
		threat_summary_potentialClp newModel = new threat_summary_potentialClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setthreat_summary_potentialRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtrend_lkp(BaseModel<?> oldModel) {
		trend_lkpClp newModel = new trend_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrend_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputunesco_region(BaseModel<?> oldModel) {
		unesco_regionClp newModel = new unesco_regionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setunesco_regionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputunesco_region_country(
		BaseModel<?> oldModel) {
		unesco_region_countryClp newModel = new unesco_region_countryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setunesco_region_countryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_contact(BaseModel<?> oldModel) {
		whp_contactClp newModel = new whp_contactClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_contactRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_criteria_lkp(BaseModel<?> oldModel) {
		whp_criteria_lkpClp newModel = new whp_criteria_lkpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_criteria_lkpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_site_danger_list(
		BaseModel<?> oldModel) {
		whp_site_danger_listClp newModel = new whp_site_danger_listClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_site_danger_listRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites(BaseModel<?> oldModel) {
		whp_sitesClp newModel = new whp_sitesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sitesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_boundary_modification(
		BaseModel<?> oldModel) {
		whp_sites_boundary_modificationClp newModel = new whp_sites_boundary_modificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_boundary_modificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_budget(BaseModel<?> oldModel) {
		whp_sites_budgetClp newModel = new whp_sites_budgetClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_budgetRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_component(
		BaseModel<?> oldModel) {
		whp_sites_componentClp newModel = new whp_sites_componentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_componentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_contacts(
		BaseModel<?> oldModel) {
		whp_sites_contactsClp newModel = new whp_sites_contactsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_contactsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_country(BaseModel<?> oldModel) {
		whp_sites_countryClp newModel = new whp_sites_countryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_countryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_dsocr(BaseModel<?> oldModel) {
		whp_sites_dsocrClp newModel = new whp_sites_dsocrClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_dsocrRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_external_documents(
		BaseModel<?> oldModel) {
		whp_sites_external_documentsClp newModel = new whp_sites_external_documentsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_external_documentsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_flagship_species(
		BaseModel<?> oldModel) {
		whp_sites_flagship_speciesClp newModel = new whp_sites_flagship_speciesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_flagship_speciesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_indigenous_communities(
		BaseModel<?> oldModel) {
		whp_sites_indigenous_communitiesClp newModel = new whp_sites_indigenous_communitiesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_indigenous_communitiesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_inscription_criteria(
		BaseModel<?> oldModel) {
		whp_sites_inscription_criteriaClp newModel = new whp_sites_inscription_criteriaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_inscription_criteriaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_inscription_date(
		BaseModel<?> oldModel) {
		whp_sites_inscription_dateClp newModel = new whp_sites_inscription_dateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_inscription_dateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_iucn_pa_category(
		BaseModel<?> oldModel) {
		whp_sites_iucn_pa_categoryClp newModel = new whp_sites_iucn_pa_categoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_iucn_pa_categoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_iucn_recommendation(
		BaseModel<?> oldModel) {
		whp_sites_iucn_recommendationClp newModel = new whp_sites_iucn_recommendationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_iucn_recommendationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_mee(BaseModel<?> oldModel) {
		whp_sites_meeClp newModel = new whp_sites_meeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_meeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_mgmt_plan_state(
		BaseModel<?> oldModel) {
		whp_sites_mgmt_plan_stateClp newModel = new whp_sites_mgmt_plan_stateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_mgmt_plan_stateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_mission(BaseModel<?> oldModel) {
		whp_sites_missionClp newModel = new whp_sites_missionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_missionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_other_designations(
		BaseModel<?> oldModel) {
		whp_sites_other_designationsClp newModel = new whp_sites_other_designationsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_other_designationsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_soc_reports(
		BaseModel<?> oldModel) {
		whp_sites_soc_reportsClp newModel = new whp_sites_soc_reportsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_soc_reportsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_soouv(BaseModel<?> oldModel) {
		whp_sites_soouvClp newModel = new whp_sites_soouvClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_soouvRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwhp_sites_visitors(
		BaseModel<?> oldModel) {
		whp_sites_visitorsClp newModel = new whp_sites_visitorsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setwhp_sites_visitorsRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}