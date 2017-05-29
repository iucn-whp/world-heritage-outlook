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

package com.iucn.whp.dbservice.service.messaging;

import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil;
import com.iucn.whp.dbservice.service.advance_query_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.advance_query_siteLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_potentialLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_stagesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_statusLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_validationLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefitsLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefits_summaryLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil;
import com.iucn.whp.dbservice.service.biodiversity_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.boundary_modification_type_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.contact_categoryLocalServiceUtil;
import com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_state_trendLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_state_trend_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_threat_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.danger_list_status_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil;
import com.iucn.whp.dbservice.service.docs_sitedataLocalServiceUtil;
import com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil;
import com.iucn.whp.dbservice.service.flagship_species_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_type_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_pa_lkp_categoryLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.key_conservation_scale_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.mission_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.negative_factors_level_impactLocalServiceUtil;
import com.iucn.whp.dbservice.service.negative_factors_trendLocalServiceUtil;
import com.iucn.whp.dbservice.service.other_designation_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_threat_assessment_catLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_threat_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil;
import com.iucn.whp.dbservice.service.prot_mgmt_overallLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_management_ratings_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_mgmt_checklist_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.recommendation_type_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.referencesLocalServiceUtil;
import com.iucn.whp.dbservice.service.reinforced_monitoringLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.sites_thematicLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_whvaluesLocalServiceUtil;
import com.iucn.whp.dbservice.service.thematic_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_categories_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_subcategories_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_overallLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_potentialLocalServiceUtil;
import com.iucn.whp.dbservice.service.trend_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil;
import com.iucn.whp.dbservice.service.unesco_region_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_contactLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_site_danger_listLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_site_danger_listServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_boundary_modificationLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_budgetLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_componentLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_contactsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_dsocrLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_external_documentsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_flagship_speciesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_indigenous_communitiesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_inscription_criteriaLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_inscription_dateLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_iucn_pa_categoryLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_meeLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_other_designationsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_soouvLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_visitorsLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			active_conservation_projectsLocalServiceUtil.clearService();

			advance_query_assessmentLocalServiceUtil.clearService();

			advance_query_siteLocalServiceUtil.clearService();

			assessing_threats_currentLocalServiceUtil.clearService();

			assessing_threats_potentialLocalServiceUtil.clearService();

			assessment_lang_lkpLocalServiceUtil.clearService();

			assessment_lang_versionLocalServiceUtil.clearService();

			assessment_stagesLocalServiceUtil.clearService();

			assessment_statusLocalServiceUtil.clearService();

			assessment_validationLocalServiceUtil.clearService();

			assessment_whvaluesLocalServiceUtil.clearService();

			assessment_whvalues_whcriterionLocalServiceUtil.clearService();

			benefit_checksubtype_lkpLocalServiceUtil.clearService();

			benefit_checktype_lkpLocalServiceUtil.clearService();

			benefit_rating_lkpLocalServiceUtil.clearService();

			benefitsLocalServiceUtil.clearService();

			benefits_summaryLocalServiceUtil.clearService();

			benefits_type_refLocalServiceUtil.clearService();

			biodiversity_valuesLocalServiceUtil.clearService();

			boundary_modification_type_lkpLocalServiceUtil.clearService();

			conservation_outlookLocalServiceUtil.clearService();

			conservation_outlook_rating_lkpLocalServiceUtil.clearService();

			contact_categoryLocalServiceUtil.clearService();

			country_lkpLocalServiceUtil.clearService();

			current_state_trendLocalServiceUtil.clearService();

			current_state_trend_valuesLocalServiceUtil.clearService();

			current_threat_assessment_catLocalServiceUtil.clearService();

			current_threat_valuesLocalServiceUtil.clearService();

			danger_list_status_lkpLocalServiceUtil.clearService();

			docs_customDataLocalServiceUtil.clearService();

			docs_sitedataLocalServiceUtil.clearService();

			effective_prot_mgmt_iothreatsLocalServiceUtil.clearService();

			flagship_species_lkpLocalServiceUtil.clearService();

			inscription_criteria_lkpLocalServiceUtil.clearService();

			inscription_type_lkpLocalServiceUtil.clearService();

			iucn_pa_lkp_categoryLocalServiceUtil.clearService();

			iucn_regionLocalServiceUtil.clearService();

			iucn_region_countryLocalServiceUtil.clearService();

			key_conservation_issuesLocalServiceUtil.clearService();

			key_conservation_scale_lkpLocalServiceUtil.clearService();

			mission_lkpLocalServiceUtil.clearService();

			negative_factors_level_impactLocalServiceUtil.clearService();

			negative_factors_trendLocalServiceUtil.clearService();

			other_designation_lkpLocalServiceUtil.clearService();

			potential_project_needsLocalServiceUtil.clearService();

			potential_threat_assessment_catLocalServiceUtil.clearService();

			potential_threat_valuesLocalServiceUtil.clearService();

			prot_mgmt_best_practicesLocalServiceUtil.clearService();

			prot_mgmt_overallLocalServiceUtil.clearService();

			protection_managementLocalServiceUtil.clearService();

			protection_management_ratings_lkpLocalServiceUtil.clearService();

			protection_mgmt_checklist_lkpLocalServiceUtil.clearService();

			recommendation_type_lkpLocalServiceUtil.clearService();

			referencesLocalServiceUtil.clearService();

			reinforced_monitoringLocalServiceUtil.clearService();

			site_assessmentLocalServiceUtil.clearService();

			site_assessment_versionsLocalServiceUtil.clearService();

			sites_thematicLocalServiceUtil.clearService();

			state_lkpLocalServiceUtil.clearService();

			state_trend_biodivvalsLocalServiceUtil.clearService();

			state_trend_whvaluesLocalServiceUtil.clearService();

			thematic_lkpLocalServiceUtil.clearService();

			threat_categories_lkpLocalServiceUtil.clearService();

			threat_rating_lkpLocalServiceUtil.clearService();

			threat_subcategories_lkpLocalServiceUtil.clearService();

			threat_summary_currentLocalServiceUtil.clearService();

			threat_summary_overallLocalServiceUtil.clearService();

			threat_summary_potentialLocalServiceUtil.clearService();

			trend_lkpLocalServiceUtil.clearService();

			unesco_regionLocalServiceUtil.clearService();

			unesco_region_countryLocalServiceUtil.clearService();

			whp_contactLocalServiceUtil.clearService();

			whp_criteria_lkpLocalServiceUtil.clearService();

			whp_site_danger_listLocalServiceUtil.clearService();

			whp_site_danger_listServiceUtil.clearService();
			whp_sitesLocalServiceUtil.clearService();

			whp_sitesServiceUtil.clearService();
			whp_sites_boundary_modificationLocalServiceUtil.clearService();

			whp_sites_budgetLocalServiceUtil.clearService();

			whp_sites_componentLocalServiceUtil.clearService();

			whp_sites_contactsLocalServiceUtil.clearService();

			whp_sites_countryLocalServiceUtil.clearService();

			whp_sites_dsocrLocalServiceUtil.clearService();

			whp_sites_external_documentsLocalServiceUtil.clearService();

			whp_sites_flagship_speciesLocalServiceUtil.clearService();

			whp_sites_indigenous_communitiesLocalServiceUtil.clearService();

			whp_sites_inscription_criteriaLocalServiceUtil.clearService();

			whp_sites_inscription_dateLocalServiceUtil.clearService();

			whp_sites_iucn_pa_categoryLocalServiceUtil.clearService();

			whp_sites_iucn_recommendationLocalServiceUtil.clearService();

			whp_sites_iucn_recommendationServiceUtil.clearService();
			whp_sites_meeLocalServiceUtil.clearService();

			whp_sites_mgmt_plan_stateLocalServiceUtil.clearService();

			whp_sites_missionLocalServiceUtil.clearService();

			whp_sites_other_designationsLocalServiceUtil.clearService();

			whp_sites_soc_reportsLocalServiceUtil.clearService();

			whp_sites_soouvLocalServiceUtil.clearService();

			whp_sites_visitorsLocalServiceUtil.clearService();
		}
	}
}