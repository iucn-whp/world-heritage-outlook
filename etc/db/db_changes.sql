ALTER TABLE whp_site_assessment ADD COLUMN assessment_cycle VARCHAR(16) NOT NULL DEFAULT '2014';
UPDATE whp_site_assessment SET assessment_cycle='2014';

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the hunting of wild game permitted in the site?'
WHERE subbenefit_id = 3;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the collection of wild food plants permitted in the site?'
WHERE subbenefit_id = 4;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Are fisheries (permissible fishing and/or contribution to fish stocks by protecting spawning area) an important resource in the site?'
WHERE subbenefit_id = 5;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is traditional agriculture (i.e. use of locally adapted crops (landraces) and/or practices) undertaken legally in the site?'
WHERE subbenefit_id = 6;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is livestock grazing and fodder collection permitted in the site?'
WHERE subbenefit_id = 7;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is non-commercial water use (e.g. subsistence agriculture, drinking, washing and/or cooking) permitted in the site?'
WHERE subbenefit_id = 8;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is commercial water use (e.g. for large-scale irrigation, waterways, bottling plants, hydro-electric power or municipal drinking watersource) permitted in the site?'
WHERE subbenefit_id = 9;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Does the site have cultural and historical values (e.g. archaeology, historic buildings including temples, pilgrimage routes, and/orhistoric/culturally important land use)?'
WHERE subbenefit_id = 10;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Does the site include sacred natural sites or landscapes (e.g. sacred groves, waterfalls and/or mountains)?'
WHERE subbenefit_id = 11;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Does the site contain wilderness values or other similar iconic values?'
WHERE subbenefit_id = 12;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the collection of medicinal resources (e.g. herbs) for local use permitted from the site?'
WHERE subbenefit_id = 13;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Outdoor recreation and tourism'
WHERE subbenefit_id = 15;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site an important resource for building knowledge?'
WHERE subbenefit_id = 16;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Does the site contribute to education (i.e. formal and informal dissemination of information)?'
WHERE subbenefit_id = 17;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the collection of genetic material (e.g. crop wild relatives, tree species) permitted from the site?'
WHERE subbenefit_id = 18;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Can the site contribute to climate change mitigation (i.e. by providing significant carbon sequestration and / or by ameliorating localclimate impacts)?'
WHERE subbenefit_id = 19;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site important for soil stabilisation (e.g. avalanche prevention, landslide and erosion)?'
WHERE subbenefit_id = 20;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site important for coastal protection (e.g. mangroves, sand dunes, coral reefs)?'
WHERE subbenefit_id = 21;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site important for flood prevention (e.g. mitigation in small watersheds, flood plains and wetland protection)?'
WHERE subbenefit_id = 22;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site important for water quality and quantity (e.g. filtration, groundwater renewal, maintenance of natural flows)?'
WHERE subbenefit_id = 23;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the site an important resource for pollination of nearby crops or for pollination products such as honey?'
WHERE subbenefit_id = 24;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the management and removal of timber, including for fuelwood, permitted from the site?'
WHERE subbenefit_id = 25;

UPDATE whp_benefit_checksubtype_lkp
SET benefit_checksubtype = 'Is the extraction of other materials (e.g. coral, shells, resin, rubber, grass, rattan, minerals, etc) permitted from the site?'
WHERE subbenefit_id = 26;


-- DELETE FROM whp_protection_mgmt_checklist_lkp;
ALTER TABLE whp_protection_mgmt_checklist_lkp ALTER COLUMN topic TYPE VARCHAR(256);
-- ALTER TABLE whp_protection_mgmt_checklist_lkp ADD COLUMN topic_sort INT;
INSERT INTO whp_protection_mgmt_checklist_lkp (topic_id, topic, topic_sort) VALUES
  (1, 'Relationships with local people (including stakeholder relationships, participatory management, rights, and access to benefits and equity)', 1),
  (2, 'Legal framework', 2),
  (3, 'Integration into regional and national planning systems (including sea/landscape connectivity)', 4),
  (4, 'Management system (including integrated management for transboundary/serial properties)', 5),
  (5, 'Management effectiveness', 6),
  (6, 'Implementation of Committee decisions and recommendations', 7),
  (7, 'Boundaries', 8),
  (8, 'Sustainable finance', 9),
  (9, 'Staff training and development', 10),
  (10, 'Sustainable use', 11),
  (11, 'Education and interpretation programs', 12),
  (12, 'Tourism and visitation management', 13),
  (13, 'Monitoring', 14),
  (14, 'Research', 15),
  (15, 'Assessment of the effectiveness of protection and management in addressing threats outside the site', 16),
  (16, 'Enforcement', 3);



/*fix crashed image url*/
UPDATE journalarticle
SET
  smallimage = FALSE
FROM
  (
    SELECT id_ FROM journalarticle j LEFT JOIN image i ON j.smallimageid = i.imageid WHERE i.imageid ISNULL AND j.smallimage = TRUE
  ) AS subquery
WHERE journalarticle.id_ = subquery.id_;


/*
 14.07.2016 Change the labels of the following “Sub-category” options (for both “current threats” table and “potential threats” table):*/

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Crops'
WHERE id_ = 4;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Livestock Farming / Grazing'
WHERE id_ = 6;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Oil/ Gas exploration/development'
WHERE id_ = 9;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Roads/ Railroads'
WHERE id_ = 12;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Hunting (commercial/subsistence)'
WHERE id_ = 16;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Poaching'
WHERE id_ = 17;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Tourism/ visitors/ recreation'
WHERE id_ = 21;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Dams/ Water Management or Use'
WHERE id_ = 25;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Solid Waste'
WHERE id_ = 34;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Air Pollution'
WHERE id_ = 35;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Earthquakes/ Tsunamis'
WHERE id_ = 37;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Ocean acidification'
WHERE id_ = 43;

UPDATE whp_threat_subcategories_lkp
SET threat_sub_category = 'Temperature extremes'
WHERE id_ = 44;

/*
 14.07.2016 Add new column to tables whp_assessing_threats_current and whp_assessing_threats_potential */
ALTER TABLE whp_assessing_threats_current ADD COLUMN threadExtentValue VARCHAR(16);
ALTER TABLE whp_assessing_threats_potential ADD COLUMN threadExtentValue VARCHAR(16);

ALTER TABLE whp_active_conservation_projects ADD COLUMN projectDurationFrom VARCHAR(4);
ALTER TABLE whp_active_conservation_projects ADD COLUMN projectDurationTo VARCHAR(4);

ALTER TABLE whp_potential_project_needs ADD COLUMN projectDurationFrom VARCHAR(4);
ALTER TABLE whp_potential_project_needs ADD COLUMN projectDurationTo VARCHAR(4);

alter table whp_benefits ADD COLUMN habitatchangelevel BIGINT;
alter table whp_benefits ADD COLUMN habitatchangetrend BIGINT;
alter table whp_benefits ADD COLUMN pollutionLevel BIGINT;
alter table whp_benefits ADD COLUMN pollutionTrend BIGINT;
alter table whp_benefits ADD COLUMN overexploitationlevel BIGINT;
alter table whp_benefits ADD COLUMN overexploitationtrend BIGINT;
alter table whp_benefits ADD COLUMN climatechangelevel BIGINT;
alter table whp_benefits ADD COLUMN climatechangetrend BIGINT;
alter table whp_benefits ADD COLUMN invasivespecieslevel BIGINT;
alter table whp_benefits ADD COLUMN invasivespeciestrend BIGINT;
alter table whp_benefits ADD COLUMN comment_ TEXT;

UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Legal subsistence hunting of wild game' WHERE subbenefit_id = 3;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Collection of wild plants and mushrooms' WHERE subbenefit_id = 4;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Fishing areas and conservation of fish stocks' WHERE subbenefit_id = 5;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Traditional agriculture' WHERE subbenefit_id = 6;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Livestock grazing areas' WHERE subbenefit_id = 7;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Access to drinking water' WHERE subbenefit_id = 8;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Commercial wells' WHERE subbenefit_id = 9;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'History and tradition' WHERE subbenefit_id = 10;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Wilderness and iconic features' WHERE subbenefit_id = 11;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Sacred natural sites or landscapes' WHERE subbenefit_id = 12;

/* insert new values - benefit type is Cultural and Spiritual Values */
INSERT INTO whp_benefit_checksubtype_lkp (subbenefit_id, benefit_checksubtype, parent_id) VALUES (32, 'Sacred or symbolic plants or animals', 4), (33, 'Cultural identity and sense of belonging', 4);

UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Collection of medicinal resources for local use' WHERE subbenefit_id = 13;

UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Natural beauty and scenery', parent_id = 5 WHERE benefit_checksubtype = 'Is the site important for recreation and tourism?';

UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Importance for research' WHERE subbenefit_id = 16;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Contribution to education' WHERE subbenefit_id = 17;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Collection of genetic material' WHERE subbenefit_id = 18;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Carbon sequestration' WHERE subbenefit_id = 19;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Soil stabilisation' WHERE subbenefit_id = 20;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Coastal protection' WHERE subbenefit_id = 21;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Flood prevention' WHERE subbenefit_id = 22;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Water provision (importance for water quantity and quality)' WHERE subbenefit_id = 23;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Pollination' WHERE subbenefit_id = 24;

UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Collection of timber, e.g. fuelwood' WHERE subbenefit_id = 25;
UPDATE whp_benefit_checksubtype_lkp SET benefit_checksubtype = 'Sustainable extraction of materials (e.g. coral, shells, resin, rubber, grass, rattan, etc)' WHERE subbenefit_id = 26;

INSERT INTO whp_benefit_checksubtype_lkp (subbenefit_id, benefit_checksubtype, parent_id) VALUES (34, 'Provision of jobs', 9);

-- todo Do not use in QA and Prod servers
-- DELETE FROM whp_benefit_checksubtype_lkp WHERE benefit_checksubtype = 'Is the protected area valued for its nature conservation?';
-- DELETE FROM whp_benefit_checksubtype_lkp WHERE benefit_checksubtype = 'Does management of the site provide jobs (e.g. for managers or rangers)?';
-- DELETE FROM whp_benefit_checksubtype_lkp WHERE subbenefit_id = 14;
-- DELETE FROM whp_benefit_checktype_lkp WHERE benefit_checktype = 'Nature conservation values';

CREATE TABLE whp_negative_factors_level_impact (
  level_id  BIGINT PRIMARY KEY NOT NULL,
 	level_impact VARCHAR(75) null,
 	description VARCHAR(75) null
);

create table whp_negative_factors_trend (
	trend_id BIGINT PRIMARY KEY NOT NULL,
	trend VARCHAR(75) null,
	description VARCHAR(75) null
);

/* Factors negatively affecting provision of selected benefits */
INSERT INTO whp_negative_factors_level_impact (level_id, level_impact, description) VALUES
  (1, 'Very High', ''),
  (2, 'High', ''),
  (3, 'Moderate', ''),
  (4, 'Low', '');

INSERT INTO whp_negative_factors_trend (trend_id, trend, description) VALUES
  (1, 'Increasing', ''),
  (2, 'Continuing', ''),
  (3, 'Decreasing', '');

/*fix crashed image url*/
UPDATE journalarticle
SET
  smallimage = FALSE
FROM
  (
    SELECT id_ FROM journalarticle j LEFT JOIN image i ON j.smallimageid = i.imageid WHERE i.imageid ISNULL AND j.smallimage = TRUE
  ) AS subquery
WHERE journalarticle.id_ = subquery.id_;

/* ---------- #32483 ---------- */

UPDATE whp_protection_mgmt_checklist_lkp set topic = 'Management system (for transboundary/serial properties, integrated management system should also be described/evaluated)' WHERE topic_id = 4;
-- DELETE FROM  whp_benefit_checksubtype_lkp WHERE benefit_checksubtype = 'Direct employment' AND parent_id = 9;

ALTER TABLE whp_benefit_checksubtype_lkp ADD COLUMN position INT;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Legal subsistence hunting of wild game' AND parent_id = 2;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Collection of wild plants and mushrooms' AND parent_id = 2;
UPDATE whp_benefit_checksubtype_lkp set position = 3 WHERE benefit_checksubtype = 'Fishing areas and conservation of fish stocks' AND parent_id = 2;
UPDATE whp_benefit_checksubtype_lkp set position = 4 WHERE benefit_checksubtype = 'Traditional agriculture' AND parent_id = 2;
UPDATE whp_benefit_checksubtype_lkp set position = 5 WHERE benefit_checksubtype = 'Livestock grazing areas' AND parent_id = 2;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Access to drinking water' AND parent_id = 3;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Commercial wells' AND parent_id = 3;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'History and tradition' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Wilderness and iconic features' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 3 WHERE benefit_checksubtype = 'Sacred natural sites or landscapes' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 4 WHERE benefit_checksubtype = 'Sacred or symbolic plants or animals' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 5 WHERE benefit_checksubtype = 'Cultural identity and sense of belonging' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 6 WHERE benefit_checksubtype = 'Sacred plants or animals' AND parent_id = 4;
UPDATE whp_benefit_checksubtype_lkp set position = 7 WHERE benefit_checksubtype = 'Sense of belonging' AND parent_id = 4;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Collection of medicinal resources for local use' AND parent_id = 5;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Outdoor recreation and tourism' AND parent_id = 5;
UPDATE whp_benefit_checksubtype_lkp set position = 3 WHERE benefit_checksubtype = 'Natural beauty and scenery' AND parent_id = 5;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Importance for research' AND parent_id = 6;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Contribution to education' AND parent_id = 6;
UPDATE whp_benefit_checksubtype_lkp set position = 3 WHERE benefit_checksubtype = 'Collection of genetic material' AND parent_id = 6;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Carbon sequestration' AND parent_id = 7;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Soil stabilisation' AND parent_id = 7;
UPDATE whp_benefit_checksubtype_lkp set position = 3 WHERE benefit_checksubtype = 'Coastal protection' AND parent_id = 7;
UPDATE whp_benefit_checksubtype_lkp set position = 4 WHERE benefit_checksubtype = 'Flood prevention' AND parent_id = 7;
UPDATE whp_benefit_checksubtype_lkp set position = 5 WHERE benefit_checksubtype = 'Water provision (importance for water quantity and quality)' AND parent_id = 7;
UPDATE whp_benefit_checksubtype_lkp set position = 6 WHERE benefit_checksubtype = 'Pollination' AND parent_id = 7;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Collection of timber, e.g. fuelwood' AND parent_id = 8;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Sustainable extraction of materials (e.g. coral, shells, resin, rubber, grass, rattan, etc)' AND parent_id = 8;

UPDATE whp_benefit_checksubtype_lkp set position = 1 WHERE benefit_checksubtype = 'Tourism-related income' AND parent_id = 9;
UPDATE whp_benefit_checksubtype_lkp set position = 2 WHERE benefit_checksubtype = 'Provision of jobs' AND parent_id = 9;

/* Restore deleted data  */

ALTER TABLE whp_benefit_checktype_lkp ADD COLUMN active_ boolean;
ALTER TABLE whp_benefit_checksubtype_lkp ADD COLUMN active_ boolean;

SELECT * from  whp_benefit_checktype_lkp;

INSERT INTO whp_benefit_checktype_lkp (benefit_id, benefit_checktype, active_) VALUES (1, 'Nature conservation values', FALSE);
INSERT INTO whp_benefit_checksubtype_lkp (subbenefit_id, benefit_checksubtype, parent_id, position)
  VALUES (1, 'Is the protected area valued for its nature conservation?', 1, 1),
  (2, 'Does management of the site provide jobs (e.g. for managers or rangers)?', 1, 2);

UPDATE whp_benefit_checktype_lkp set active_ = TRUE;
UPDATE whp_benefit_checksubtype_lkp set active_ = TRUE;
UPDATE whp_benefit_checksubtype_lkp set active_ = FALSE WHERE subbenefit_id in (1,2);
UPDATE whp_benefit_checksubtype_lkp set active_ = FALSE WHERE benefit_checksubtype = 'Direct employment';
UPDATE whp_benefit_checktype_lkp set active_ = FALSE WHERE benefit_id = 1;

/* Change assessment cycle value  */
UPDATE whp_site_assessment SET assessment_cycle = '2017' WHERE assessment_cycle = '2016';

/*Notification task, add column to show that site information is updating*/
ALTER TABLE whp_whp_sites ADD COLUMN information_updating BOOLEAN NOT NULL DEFAULT FALSE;


/*
5.09.16
d) Threat sub-category options: thank you for changing these from the list send through in the document –
in reviewing the list again, I realise I left out one change, which is that what is currently
“Agricultural/Forestry Effluents” should be changed to just “Agricultural Effluents”.
*/
UPDATE whp_threat_subcategories_lkp set threat_sub_category = 'Agricultural Effluents' WHERE threat_sub_category = 'Agricultural/Forestry Effluents'


/*
7.09.16
Tab/worksheet 3. Protection and Management
 Feature #35126
http://prntscr.com/cebfgf - The table above has “Assessment of the effective of protection and management in addressing
threats outside the site” shouldn’t be there, please remove
ttp://prntscr.com/cehu4uz - This is still present, please remove this
*//*


DELETE FROM whp_protection_mgmt_checklist_lkp WHERE topic_id = 15
*/
