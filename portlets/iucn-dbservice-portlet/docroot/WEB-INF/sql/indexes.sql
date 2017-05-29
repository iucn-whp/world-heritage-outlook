create index IX_ED2F5C26 on whp_active_conservation_projects (assessment_version_id);

create index IX_FB4FF56C on whp_advance_query_assessment (base_search_val);
create index IX_E98DF397 on whp_advance_query_assessment (base_tab_name);
create index IX_A7A3B9D8 on whp_advance_query_assessment (id_);

create index IX_AC4365C7 on whp_advance_query_site (base_search_val);
create index IX_C1C7BEB2 on whp_advance_query_site (base_tab_name);

create index IX_162A7C17 on whp_assessing_threats_current (assessment_version_id);

create index IX_46388752 on whp_assessing_threats_potential (assessment_version_id);

create index IX_30E3DB05 on whp_assessment_lang_version (assessment_version_id);
create index IX_F1FED4BB on whp_assessment_lang_version (assessmentid);

create index IX_14FB8FDC on whp_assessment_threatchklist (assessment_version_id);

create index IX_90520313 on whp_assessment_validation (assessment_version_id);
create index IX_CAAC0266 on whp_assessment_validation (assessment_version_id, assessment_step);

create index IX_3A39EA59 on whp_assessment_whvalues (assessment_version_id);

create index IX_7BE25730 on whp_assessment_whvalues_whcriterion (whvalues_id);

create index IX_FE2FF2D7 on whp_benefit_checksubtype_lkp (active_);

create index IX_D8696F57 on whp_benefit_checktype_lkp (active_);

create index IX_30EF9C2D on whp_benefits (assessment_version_id);

create index IX_90FAFBA6 on whp_benefits_summary (assessment_version_id);

create index IX_BEAA6457 on whp_benefits_type_ref (benefits_id);
create index IX_3AF2D013 on whp_benefits_type_ref (benefits_id, benefit_checktype);

create index IX_56AF8299 on whp_biodiversity_values (assessment_version_id);

create index IX_EB150FBE on whp_conservation_outlook (assessment_version_id);

create unique index IX_DD914D13 on whp_country_lkp (a2);
create unique index IX_DD9150D4 on whp_country_lkp (a3);
create unique index IX_D757312D on whp_country_lkp (name);

create index IX_D634F1E0 on whp_current_state_trend (assessment_version_id);

create index IX_F78A87EC on whp_current_threat_assessment_cat (current_threat_id);
create index IX_95DA54C0 on whp_current_threat_assessment_cat (current_threat_id, category_id);

create index IX_D298C843 on whp_current_threat_values (current_threat_id);

create index IX_4C5BEC04 on whp_docs_customData (author);
create index IX_4BE990F7 on whp_docs_customData (category);
create index IX_353B9D5C on whp_docs_customData (fileentryid);
create index IX_FEEFBD57 on whp_docs_customData (publish_date);
create index IX_27B2BF70 on whp_docs_customData (type_);
create index IX_1FB18DB7 on whp_docs_customData (upload_date);

create index IX_31BD84E6 on whp_docs_sitedata (fileentryid);
create index IX_B7932191 on whp_docs_sitedata (siteid);

create index IX_CE420D14 on whp_effective_prot_mgmt_iothreats (assessment_version_id);

create index IX_67CFEA88 on whp_iucn_region_country (countryid);
create index IX_D591D50B on whp_iucn_region_country (iucn_region_id);

create index IX_9ED57A99 on whp_iucnregioncountry_country (countryid);
create index IX_AEAB7123 on whp_iucnregioncountry_country (whp_iucn_region_country_id);

create index IX_F42AA337 on whp_iucnregioncountry_iucnregion (iucn_region_id);
create index IX_E687E940 on whp_iucnregioncountry_iucnregion (whp_iucn_region_country_id);

create index IX_C9CA1ED on whp_key_conservation_issues (assessment_version_id);

create index IX_38C54593 on whp_potential_project_needs (assessment_version_id);

create index IX_F499D88C on whp_potential_threat_assessment_cat (potential_threat_id);
create index IX_2CB0820 on whp_potential_threat_assessment_cat (potential_threat_id, category_id);

create index IX_C8480A23 on whp_potential_threat_values (potential_threat_id);

create index IX_182D9C66 on whp_prot_mgmt_best_practices (assessment_version_id);

create index IX_ED73DA2 on whp_prot_mgmt_overall (assessment_version_id);

create index IX_C1D32F20 on whp_protection_management (assessment_version_id);

create index IX_5B6D8DE1 on whp_references (assessment_version_id);

create index IX_FB88CDD6 on whp_site_assessment (archived);
create index IX_EA5659A0 on whp_site_assessment (current_userid);
create index IX_10B6FDC1 on whp_site_assessment (is_active, archived);
create index IX_12210A9E on whp_site_assessment (published);
create index IX_7D275403 on whp_site_assessment (site_id);

create index IX_CF1D4AE2 on whp_site_assessment_versions (assessment_id);
create index IX_EBC124E0 on whp_site_assessment_versions (userid);
create index IX_56FFED0 on whp_site_assessment_versions (userid, stage_id);

create index IX_9E6F7B01 on whp_sites_thematic (site_id);
create index IX_3534BCBA on whp_sites_thematic (thematicid);

create index IX_8A7BFC7E on whp_state_trend_biodivvals (assessment_version_id);

create index IX_E3D377C6 on whp_state_trend_whvalues (assessment_version_id);

create index IX_2824F20E on whp_threat_summary_current (assessment_version_id);

create index IX_51DB29BA on whp_threat_summary_overall (assessment_version_id);

create index IX_C36D5B89 on whp_threat_summary_potential (assessment_version_id);

create index IX_4213A1D2 on whp_understanding_benefits (assessment_version_id);

create index IX_460B89A4 on whp_unesco_region_country (countryid);
create index IX_FF9F72CB on whp_unesco_region_country (unesco_region_id);

create index IX_6CCC54B5 on whp_unescoregioncountry_country (countryid);
create index IX_43DC5A23 on whp_unescoregioncountry_country (whp_unesco_region_country_id);

create index IX_DFFA1DCB on whp_unescoregioncountry_unescoregion (unesco_region_id);
create index IX_5A91F3D4 on whp_unescoregioncountry_unescoregion (whp_unesco_region_country_id);

create index IX_DD0D70B3 on whp_whp_contact (categoryid);

create index IX_C1F3B4B0 on whp_whp_site_danger_list (status_id);

create index IX_208B3D3B on whp_whp_sites (name_en);
create index IX_7C63B0E5 on whp_whp_sites (thumbnailid);
create index IX_3C38F4AD on whp_whp_sites (thumbnailid_small);
create index IX_2677A61A on whp_whp_sites (wdpa_id);

create index IX_ADAB2EFE on whp_whp_sites_boundary_modification (bmid);

create index IX_7EDC323F on whp_whp_sites_contacts (contactid);

create index IX_1F9F9098 on whp_whp_sites_country (countryid);

create index IX_2CC26BC4 on whp_whp_sites_external_documents (fileentryid);

create index IX_67AF6767 on whp_whp_sites_flagship_species (flagship_species_id);
create index IX_107C105 on whp_whp_sites_flagship_species (site_id);

create index IX_4C2130C on whp_whp_sites_inscription_criteria (criteria_id);
create index IX_15FEBA4 on whp_whp_sites_inscription_criteria (site_id);

create index IX_2FCF773B on whp_whp_sites_inscription_date (inscription_type_id);

create index IX_19428369 on whp_whp_sites_iucn_pa_category (iucn_pa_category_id);

create index IX_8F6637BC on whp_whp_sites_iucn_recommendation (recommendation_type);

create index IX_C2F47EA1 on whp_whp_sites_mee (fileentryid);

create index IX_C869E435 on whp_whp_sites_mgmt_plan_state (fileentryid);

create index IX_4E858B82 on whp_whp_sites_mission (fileentryid);
create index IX_C15A34F7 on whp_whp_sites_mission (missiontype);

create index IX_17F26A on whp_whp_sites_other_designations (other_designation_id);

create index IX_D3B64727 on whp_whp_sites_soc_reports (fileentryid);

create index IX_6E3F4067 on whp_whpcontact_contactcategory (contact_category_id);
create index IX_903F0534 on whp_whpcontact_contactcategory (contact_id);

create index IX_A4B62326 on whp_whpsitebm_bmtype (bm_id);
create index IX_C2BE1409 on whp_whpsitebm_bmtype (whp_sites_boundary_modification_id);

create index IX_B766004F on whp_whpsitecontact_contact (contact_id);
create index IX_392D76A3 on whp_whpsitecontact_contact (whp_sites_contacts_id);

create index IX_C898F654 on whp_whpsitecountry_country (countryid);
create index IX_EEE3CB98 on whp_whpsitecountry_country (whp_sites_country_id);

create index IX_92B4F2C1 on whp_whpsitedanger_dangerliststatus (dlstatus_id);
create index IX_49E12EF9 on whp_whpsitedanger_dangerliststatus (whp_site_danger_list_id);

create index IX_425FEE5C on whp_whpsiteflagshipspecies_flagshipspecies (flagship_species_id);
create index IX_1D419DA9 on whp_whpsiteflagshipspecies_flagshipspecies (whp_sites_flagship_species_id);

create index IX_D036E35E on whp_whpsiteinsccrieteria_insccrieteriatype (criteria_id);
create index IX_A0BACB84 on whp_whpsiteinsccrieteria_insccrieteriatype (whp_sites_inscription_criteria_id);

create index IX_7B62139D on whp_whpsiteinscriptiondate_inscriptiontype (incription_type_id);
create index IX_3D6DEC29 on whp_whpsiteinscriptiondate_inscriptiontype (whp_sites_inscription_date_id);

create index IX_FE0DDB3B on whp_whpsitemission_mission (mission_id);
create index IX_BC8E654E on whp_whpsitemission_mission (whp_sites_mission_id);

create index IX_2CDFAD40 on whp_whpsiteotherdesignation_otherdesignation (other_designations_id);
create index IX_E80120CD on whp_whpsiteotherdesignation_otherdesignation (whp_sites_other_designations_id);

create index IX_710DF2E7 on whp_whpsitepacategory_pacategory (iucn_pa_category_id);
create index IX_EB71E5B4 on whp_whpsitepacategory_pacategory (whp_sites_iucn_pa_category_id);

create index IX_AE73A471 on whp_whpsiterecommendation_rectype (rec_type_id);
create index IX_367642D0 on whp_whpsiterecommendation_rectype (whp_sites_iucn_recommendation_id);