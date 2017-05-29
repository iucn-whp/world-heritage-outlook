create table whp_active_conservation_projects (
	acpid LONG not null primary key,
	assessment_version_id LONG,
	organization_individual VARCHAR(400) null,
	description STRING null,
	contact_details VARCHAR(500) null,
	projectDurationFrom VARCHAR(75) null,
	projectDurationTo VARCHAR(75) null
);

create table whp_advance_query_assessment (
	id_ LONG not null primary key,
	base_search_val VARCHAR(100) null,
	base_tab_name VARCHAR(100) null,
	base_tab_pk VARCHAR(100) null,
	base_tab_field_disp VARCHAR(100) null,
	base_tab_field_actual VARCHAR(100) null,
	relate_tab_available VARCHAR(1) null,
	relate_table_name VARCHAR(100) null,
	relate_tab_fk VARCHAR(100) null,
	has_lookup VARCHAR(1) null,
	lookup_table_name VARCHAR(100) null,
	lookup_pk VARCHAR(100) null,
	lkp_display_field VARCHAR(100) null,
	custom_sql VARCHAR(500) null,
	isboolean VARCHAR(10) null
);

create table whp_advance_query_site (
	id_ LONG not null primary key,
	base_search_val VARCHAR(100) null,
	base_tab_name VARCHAR(100) null,
	base_tab_pk VARCHAR(100) null,
	base_tab_field_disp VARCHAR(100) null,
	base_tab_field_actual VARCHAR(100) null,
	relate_tab_available VARCHAR(1) null,
	relate_table_name VARCHAR(100) null,
	relate_tab_fk VARCHAR(100) null,
	has_lookup VARCHAR(1) null,
	lookup_table_name VARCHAR(100) null,
	lookup_pk VARCHAR(100) null,
	lkp_display_field VARCHAR(100) null,
	custom_sql VARCHAR(500) null,
	isboolean VARCHAR(10) null
);

create table whp_assessing_threats_current (
	current_threat_id LONG not null primary key,
	assessment_version_id LONG,
	current_threat STRING null,
	justification STRING null,
	threadExtentValue VARCHAR(100) null,
	inside_site BOOLEAN,
	outside_site BOOLEAN,
	threat_rating_id LONG
);

create table whp_assessing_threats_potential (
	potential_threat_id LONG not null primary key,
	assessment_version_id LONG,
	potential_threat STRING null,
	justification STRING null,
	threadExtentValue VARCHAR(100) null,
	threat_rating LONG,
	inside_site BOOLEAN,
	outside_site BOOLEAN
);

create table whp_assessment_lang_lkp (
	languageid LONG not null primary key,
	languagecode VARCHAR(3) null,
	languagename VARCHAR(20) null
);

create table whp_assessment_lang_version (
	lang_ver_id LONG not null primary key,
	assessmentid LONG,
	assessment_version_id LONG,
	languageid LONG,
	published BOOLEAN,
	published_date DATE null
);

create table whp_assessment_stages (
	stageid LONG not null primary key,
	stage VARCHAR(50) null
);

create table whp_assessment_status (
	statusid LONG not null primary key,
	status VARCHAR(100) null
);

create table whp_assessment_threatchklist (
	id_ LONG not null primary key,
	assessment_version_id LONG,
	threat LONG,
	subthreat LONG,
	threat_affecting_desc VARCHAR(200) null,
	insidesite BOOLEAN,
	outsidesite BOOLEAN
);

create table whp_assessment_validation (
	assessment_ver_val_id LONG not null primary key,
	assessment_version_id LONG,
	assessment_step LONG,
	validation_complete BOOLEAN
);

create table whp_assessment_whvalues (
	whvalues_id LONG not null primary key,
	vn LONG,
	assessment_version_id LONG,
	values_ VARCHAR(200) null,
	description STRING null
);

create table whp_assessment_whvalues_whcriterion (
	wh_criteria_id LONG not null primary key,
	whvalues_id LONG,
	criterion LONG
);

create table whp_benefit_checksubtype_lkp (
	subbenefit_id LONG not null primary key,
	benefit_checksubtype VARCHAR(200) null,
	parent_id LONG,
	position LONG,
	active_ BOOLEAN
);

create table whp_benefit_checktype_lkp (
	benefit_id LONG not null primary key,
	benefit_checktype VARCHAR(50) null,
	active_ BOOLEAN
);

create table whp_benefit_rating_lkp (
	id_ LONG not null primary key,
	rating VARCHAR(50) null,
	description VARCHAR(200) null
);

create table whp_benefits (
	benefits_id LONG not null primary key,
	assessment_version_id LONG,
	selected_benefit LONG,
	summary STRING null,
	habitatChangeLevel LONG,
	habitatChangeTrend LONG,
	pollutionLevel LONG,
	pollutionTrend LONG,
	overExploitationLevel LONG,
	overExploitationTrend LONG,
	climateChangeLevel LONG,
	climateChangeTrend LONG,
	invasiveSpeciesLevel LONG,
	invasiveSpeciesTrend LONG,
	comment_ STRING null,
	data_deficient BOOLEAN,
	community_within_site LONG,
	community_outside_site LONG,
	wider_community LONG
);

create table whp_benefits_summary (
	benefits_summary_id LONG not null primary key,
	assessment_version_id LONG,
	summary STRING null
);

create table whp_benefits_type_ref (
	benefits_type_ref_id LONG not null primary key,
	benefits_id LONG,
	benefit_checktype LONG,
	benefit_checksubtype LONG
);

create table whp_biodiversity_values (
	id_ LONG not null primary key,
	vn LONG,
	assessment_version_id LONG,
	value VARCHAR(200) null,
	description STRING null
);

create table whp_boundary_modification_type_lkp (
	bm_id INTEGER not null primary key,
	bm_type VARCHAR(50) null
);

create table whp_conservation_outlook (
	conservation_outlook_id LONG not null primary key,
	assessment_version_id LONG,
	justification STRING null,
	rating LONG
);

create table whp_conservation_outlook_rating_lkp (
	co_rating_id LONG not null primary key,
	co_rating VARCHAR(50) null,
	description VARCHAR(500) null
);

create table whp_contact_category (
	contact_category_id INTEGER not null primary key,
	category_name VARCHAR(200) null
);

create table whp_country_lkp (
	countryid INTEGER not null primary key,
	name VARCHAR(75) null,
	a2 VARCHAR(75) null,
	a3 VARCHAR(75) null,
	number_ VARCHAR(75) null,
	idd_ VARCHAR(75) null,
	currency_ VARCHAR(75) null,
	ziprequired BOOLEAN,
	active_ BOOLEAN
);

create table whp_current_state_trend (
	state_trend_id LONG not null primary key,
	vn LONG,
	assessment_version_id LONG,
	justification STRING null,
	trend_id LONG,
	state_id LONG,
	is_biodiv_whval BOOLEAN
);

create table whp_current_state_trend_values (
	id_ LONG not null primary key,
	vn LONG,
	whvalues_id LONG,
	state_trend_id LONG
);

create table whp_current_threat_assessment_cat (
	cur_threat_cat_id LONG not null primary key,
	current_threat_id LONG,
	category_id LONG,
	sub_cat_id LONG
);

create table whp_current_threat_values (
	current_threat_values_id LONG not null primary key,
	current_threat_id LONG,
	whvalues_id LONG,
	is_biodiv_whval BOOLEAN
);

create table whp_danger_list_status_lkp (
	dlstatus_id INTEGER not null primary key,
	dl_status VARCHAR(50) null
);

create table whp_docs_customData (
	docs_customDataId INTEGER not null primary key,
	fileentryid LONG,
	fileversionid LONG,
	publish_date DATE null,
	upload_date DATE null,
	author VARCHAR(75) null,
	type_ VARCHAR(75) null,
	category VARCHAR(75) null,
	com VARCHAR(75) null,
	full_com VARCHAR(75) null,
	site VARCHAR(200) null,
	language VARCHAR(75) null,
	copyright VARCHAR(75) null,
	title VARCHAR(255) null
);

create table whp_docs_sitedata (
	docs_sitedataId LONG not null primary key,
	fileentryid LONG,
	fileversionid LONG,
	siteid LONG,
	date_published DATE null,
	doc_name VARCHAR(500) null,
	document_link VARCHAR(1000) null
);

create table whp_effective_prot_mgmt_iothreats (
	id_ LONG not null primary key,
	assessment_version_id LONG,
	justification STRING null,
	rating LONG
);

create table whp_flagship_species_lkp (
	flagship_species_id INTEGER not null primary key,
	flagship_species_name VARCHAR(200) null,
	redlist_url VARCHAR(500) null
);

create table whp_inscription_criteria_lkp (
	criteria_id INTEGER not null primary key,
	criteria VARCHAR(75) null,
	criteria_type VARCHAR(20) null,
	criteria_desc VARCHAR(50) null,
	criteria_title VARCHAR(100) null
);

create table whp_inscription_type_lkp (
	incription_type_id INTEGER not null primary key,
	type_ VARCHAR(100) null
);

create table whp_iucn_pa_lkp_category (
	iucn_pa_category_id INTEGER not null primary key,
	category VARCHAR(50) null
);

create table whp_iucn_region (
	iucn_region_id INTEGER not null primary key,
	name VARCHAR(100) null
);

create table whp_iucn_region_country (
	whp_iucn_region_country_id INTEGER not null primary key,
	countryid INTEGER,
	iucn_region_id INTEGER
);

create table whp_key_conservation_issues (
	key_conservation_issues_id LONG not null primary key,
	assessment_version_id LONG,
	cn VARCHAR(75) null,
	key_conservation_issues VARCHAR(200) null,
	description STRING null,
	scale LONG
);

create table whp_key_conservation_scale_lkp (
	scale_id LONG not null primary key,
	scale VARCHAR(20) null,
	description VARCHAR(200) null
);

create table whp_mission_lkp (
	mission_id INTEGER not null primary key,
	mission_type VARCHAR(100) null
);

create table whp_negative_factors_level_impact (
	level_id LONG not null primary key,
	level_impact VARCHAR(75) null,
	description VARCHAR(75) null
);

create table whp_negative_factors_trend (
	trend_id LONG not null primary key,
	trend VARCHAR(75) null,
	description VARCHAR(75) null
);

create table whp_other_designation_lkp (
	other_designations_id INTEGER not null primary key,
	designation VARCHAR(100) null
);

create table whp_potential_project_needs (
	ppn_id LONG not null primary key,
	assessment_version_id LONG,
	organization_individual VARCHAR(400) null,
	description STRING null,
	contact_details VARCHAR(500) null,
	projectDurationFrom VARCHAR(75) null,
	projectDurationTo VARCHAR(75) null
);

create table whp_potential_threat_assessment_cat (
	pot_threat_cat_id LONG not null primary key,
	potential_threat_id LONG,
	category_id LONG,
	sub_cat_id LONG
);

create table whp_potential_threat_values (
	potential_threat_values_id LONG not null primary key,
	potential_threat_id LONG,
	whvalues_id LONG,
	is_biodiv_whval BOOLEAN
);

create table whp_prot_mgmt_best_practices (
	best_practice_id LONG not null primary key,
	assessment_version_id LONG,
	description STRING null
);

create table whp_prot_mgmt_overall (
	pmo_id LONG not null primary key,
	assessment_version_id LONG,
	justification STRING null,
	rating LONG
);

create table whp_protection_management (
	pm_id LONG not null primary key,
	assessment_version_id LONG,
	topic_id LONG,
	justification STRING null,
	rating LONG
);

create table whp_protection_management_ratings_lkp (
	id_ LONG not null primary key,
	pm_rating VARCHAR(50) null,
	description VARCHAR(500) null
);

create table whp_protection_mgmt_checklist_lkp (
	topic_id LONG not null primary key,
	topic VARCHAR(100) null,
	topic_sort INTEGER
);

create table whp_recommendation_type_lkp (
	rec_type_id INTEGER not null primary key,
	recommendation VARCHAR(50) null
);

create table whp_references (
	reference_id LONG not null primary key,
	assessment_version_id LONG,
	rn LONG,
	references_ STRING null
);

create table whp_reinforced_monitoring (
	whp_sites_reinforced_monitoring_id LONG not null primary key,
	site_id LONG,
	reinforced_date DATE null
);

create table whp_site_assessment (
	assessment_id LONG not null primary key,
	site_id LONG,
	status_id LONG,
	initiation_date DATE null,
	current_userid LONG,
	current_stageid LONG,
	assessment_initiated_by LONG,
	base_langid LONG,
	archived BOOLEAN,
	is_active BOOLEAN,
	assessment_cycle VARCHAR(75) null
);

create table whp_site_assessment_versions (
	assessment_version_id LONG not null primary key,
	stage_id LONG,
	assessment_id LONG,
	start_date DATE null,
	end_date DATE null,
	userid LONG,
	initiation_date DATE null,
	language LONG,
	version_code DOUBLE,
	is_translated BOOLEAN,
	parent_assessment_versionid LONG
);

create table whp_sites_thematic (
	sitethematicid LONG not null primary key,
	site_id LONG,
	thematicid LONG
);

create table whp_state_lkp (
	state_id LONG not null primary key,
	state_ VARCHAR(50) null
);

create table whp_state_trend_biodivvals (
	state_trend_biodivvals_id LONG not null primary key,
	assessment_version_id LONG,
	justification STRING null,
	state_id LONG,
	trend_id LONG
);

create table whp_state_trend_whvalues (
	state_trend_whval_id LONG not null primary key,
	assessment_version_id LONG,
	justification STRING null,
	state_id LONG,
	trend_id LONG
);

create table whp_thematic_lkp (
	thematicid LONG not null primary key,
	thematic VARCHAR(75) null,
	description VARCHAR(75) null
);

create table whp_threat_categories_lkp (
	threatCategoryid LONG not null primary key,
	threat_category VARCHAR(100) null
);

create table whp_threat_rating_lkp (
	id_ LONG not null primary key,
	rating VARCHAR(50) null,
	description VARCHAR(200) null
);

create table whp_threat_subcategories_lkp (
	id_ LONG not null primary key,
	threat_sub_category VARCHAR(100) null,
	parent_id LONG
);

create table whp_threat_summary_current (
	threat_sum_cur_id LONG not null primary key,
	assessment_version_id LONG,
	overall_current STRING null,
	threat_rating LONG
);

create table whp_threat_summary_overall (
	threat_sum_overall_id LONG not null primary key,
	assessment_version_id LONG,
	overall_threat STRING null,
	threat_rating LONG
);

create table whp_threat_summary_potential (
	threat_sum_potential_id LONG not null primary key,
	assessment_version_id LONG,
	overall_potential STRING null,
	threat_rating LONG
);

create table whp_trend_lkp (
	trend_id LONG not null primary key,
	trend VARCHAR(50) null
);

create table whp_understanding_benefits (
	understanding_benefits_id LONG not null primary key,
	assessment_version_id LONG,
	selected_benefit LONG,
	summary STRING null,
	community_within_site LONG,
	community_outside_site LONG,
	wider_community LONG
);

create table whp_understanding_benefits_lkp (
	benefits_id LONG not null primary key,
	selected_benefit VARCHAR(100) null
);

create table whp_unesco_region (
	unesco_region_id INTEGER not null primary key,
	name VARCHAR(100) null
);

create table whp_unesco_region_country (
	whp_unesco_region_country_id INTEGER not null primary key,
	countryid INTEGER,
	unesco_region_id INTEGER
);

create table whp_whp_contact (
	contact_id INTEGER not null primary key,
	prefix VARCHAR(4) null,
	last_name VARCHAR(100) null,
	first_name VARCHAR(100) null,
	email VARCHAR(100) null,
	position VARCHAR(200) null,
	organization VARCHAR(500) null,
	address VARCHAR(500) null,
	telephone VARCHAR(20) null,
	last_updated DATE null,
	categoryid INTEGER
);

create table whp_whp_criteria_lkp (
	id_ LONG not null primary key,
	criterion VARCHAR(5) null,
	description VARCHAR(200) null
);

create table whp_whp_site_danger_list (
	whp_site_danger_list_id LONG not null primary key,
	site_id LONG,
	status_id INTEGER,
	year DATE null
);

create table whp_whp_sites (
	site_id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	wdpa_id LONG,
	unesco_id LONG,
	name_en VARCHAR(200) null,
	name_fr VARCHAR(200) null,
	transboundary BOOLEAN,
	inscription_date DATE null,
	mixed_site BOOLEAN,
	cultural_landscape BOOLEAN,
	danger_list BOOLEAN,
	area DOUBLE,
	buffer_zone BOOLEAN,
	buffer_zone_area DOUBLE,
	boundary_modification BOOLEAN,
	serial BOOLEAN,
	missions BOOLEAN,
	soc_reports BOOLEAN,
	soouv BOOLEAN,
	dsocr BOOLEAN,
	management_plan BOOLEAN,
	mee BOOLEAN,
	staff LONG,
	staff_update_date DATE null,
	indigenous_communities BOOLEAN,
	population LONG,
	last_updated DATE null,
	creation_date DATE null,
	created_by LONG,
	updated_by LONG,
	active_ BOOLEAN,
	thumbnailid LONG,
	thumbnailid_small LONG,
	description STRING null,
	information_updating BOOLEAN
);

create table whp_whp_sites_boundary_modification (
	whp_sites_boundary_modification_id LONG not null primary key,
	site_id LONG,
	bmid INTEGER,
	description VARCHAR(200) null,
	mod_date DATE null
);

create table whp_whp_sites_budget (
	whp_sites_budget_id LONG not null primary key,
	site_id LONG,
	currency_local DOUBLE,
	currency_ VARCHAR(50) null,
	currency_usd DOUBLE,
	date_ DATE null
);

create table whp_whp_sites_component (
	whp_sites_component_id LONG not null primary key,
	site_id LONG,
	component VARCHAR(100) null
);

create table whp_whp_sites_contacts (
	whp_sites_contacts_id LONG not null primary key,
	site_id LONG,
	contactid INTEGER
);

create table whp_whp_sites_country (
	whp_sites_country_id LONG not null primary key,
	site_id LONG,
	countryid INTEGER
);

create table whp_whp_sites_dsocr (
	whp_sites_dsocr_id LONG not null primary key,
	site_id LONG,
	state_description VARCHAR(500) null,
	dsocr_date DATE null
);

create table whp_whp_sites_external_documents (
	whp_sites_external_documents_id LONG not null primary key,
	site_id LONG,
	document_description VARCHAR(200) null,
	document_link VARCHAR(500) null,
	fileentryid LONG,
	doc_name VARCHAR(75) null
);

create table whp_whp_sites_flagship_species (
	whp_sites_flagship_species_id LONG not null primary key,
	site_id LONG,
	flagship_species_id INTEGER
);

create table whp_whp_sites_indigenous_communities (
	whp_sites_indigenous_communities_id LONG not null primary key,
	site_id LONG,
	description VARCHAR(500) null
);

create table whp_whp_sites_inscription_criteria (
	whp_sites_inscription_criteria_id LONG not null primary key,
	site_id LONG,
	criteria_id INTEGER
);

create table whp_whp_sites_inscription_date (
	whp_sites_inscription_date_id LONG not null primary key,
	site_id LONG,
	inscription_type_id INTEGER,
	reference_no VARCHAR(100) null,
	inscription_date DATE null
);

create table whp_whp_sites_iucn_pa_category (
	whp_sites_iucn_pa_category_id LONG not null primary key,
	site_id LONG,
	iucn_pa_category_id INTEGER
);

create table whp_whp_sites_iucn_recommendation (
	whp_sites_iucn_recommendation_id LONG not null primary key,
	site_id LONG,
	recommendation_type INTEGER,
	rec_date DATE null
);

create table whp_whp_sites_mee (
	whp_sites_mee_id LONG not null primary key,
	site_id LONG,
	date_published DATE null,
	document_link VARCHAR(500) null,
	fileentryid LONG,
	doc_name VARCHAR(75) null
);

create table whp_whp_sites_mgmt_plan_state (
	whp_sites_mgmt_plan_state_id LONG not null primary key,
	site_id LONG,
	date_published DATE null,
	document_link VARCHAR(500) null,
	fileentryid LONG,
	doc_name VARCHAR(75) null
);

create table whp_whp_sites_mission (
	whp_sites_mission_id LONG not null primary key,
	site_id LONG,
	missiontype INTEGER,
	date_published DATE null,
	document_link VARCHAR(500) null,
	fileentryid LONG,
	doc_name VARCHAR(75) null
);

create table whp_whp_sites_other_designations (
	whp_sites_other_designations_id LONG not null primary key,
	site_id LONG,
	other_designation_id INTEGER
);

create table whp_whp_sites_soc_reports (
	whp_sites_soc_reports_id LONG not null primary key,
	site_id LONG,
	date_published DATE null,
	document_link VARCHAR(500) null,
	fileentryid LONG,
	doc_name VARCHAR(75) null
);

create table whp_whp_sites_soouv (
	whp_sites_soouv_id LONG not null primary key,
	site_id LONG,
	description_en VARCHAR(500) null,
	description_fr VARCHAR(500) null,
	soouv_date DATE null
);

create table whp_whp_sites_visitors (
	whp_sites_visitors_id LONG not null primary key,
	site_id LONG,
	visitor_count LONG,
	record_date DATE null
);