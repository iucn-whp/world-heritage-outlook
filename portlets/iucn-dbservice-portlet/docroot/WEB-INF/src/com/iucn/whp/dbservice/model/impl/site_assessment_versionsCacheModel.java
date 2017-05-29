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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.site_assessment_versions;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing site_assessment_versions in entity cache.
 *
 * @author alok.sen
 * @see site_assessment_versions
 * @generated
 */
public class site_assessment_versionsCacheModel implements CacheModel<site_assessment_versions>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", stage_id=");
		sb.append(stage_id);
		sb.append(", assessment_id=");
		sb.append(assessment_id);
		sb.append(", start_date=");
		sb.append(start_date);
		sb.append(", end_date=");
		sb.append(end_date);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", initiation_date=");
		sb.append(initiation_date);
		sb.append(", language=");
		sb.append(language);
		sb.append(", version_code=");
		sb.append(version_code);
		sb.append(", is_translated=");
		sb.append(is_translated);
		sb.append(", parent_assessment_versionid=");
		sb.append(parent_assessment_versionid);
		sb.append("}");

		return sb.toString();
	}

	public site_assessment_versions toEntityModel() {
		site_assessment_versionsImpl site_assessment_versionsImpl = new site_assessment_versionsImpl();

		site_assessment_versionsImpl.setAssessment_version_id(assessment_version_id);
		site_assessment_versionsImpl.setStage_id(stage_id);
		site_assessment_versionsImpl.setAssessment_id(assessment_id);

		if (start_date == Long.MIN_VALUE) {
			site_assessment_versionsImpl.setStart_date(null);
		}
		else {
			site_assessment_versionsImpl.setStart_date(new Date(start_date));
		}

		if (end_date == Long.MIN_VALUE) {
			site_assessment_versionsImpl.setEnd_date(null);
		}
		else {
			site_assessment_versionsImpl.setEnd_date(new Date(end_date));
		}

		site_assessment_versionsImpl.setUserid(userid);

		if (initiation_date == Long.MIN_VALUE) {
			site_assessment_versionsImpl.setInitiation_date(null);
		}
		else {
			site_assessment_versionsImpl.setInitiation_date(new Date(
					initiation_date));
		}

		site_assessment_versionsImpl.setLanguage(language);
		site_assessment_versionsImpl.setVersion_code(version_code);
		site_assessment_versionsImpl.setIs_translated(is_translated);
		site_assessment_versionsImpl.setParent_assessment_versionid(parent_assessment_versionid);

		site_assessment_versionsImpl.resetOriginalValues();

		return site_assessment_versionsImpl;
	}

	public long assessment_version_id;
	public long stage_id;
	public long assessment_id;
	public long start_date;
	public long end_date;
	public long userid;
	public long initiation_date;
	public long language;
	public double version_code;
	public boolean is_translated;
	public long parent_assessment_versionid;
}