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

import com.iucn.whp.dbservice.model.site_assessment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing site_assessment in entity cache.
 *
 * @author alok.sen
 * @see site_assessment
 * @generated
 */
public class site_assessmentCacheModel implements CacheModel<site_assessment>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{assessment_id=");
		sb.append(assessment_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", status_id=");
		sb.append(status_id);
		sb.append(", initiation_date=");
		sb.append(initiation_date);
		sb.append(", current_userid=");
		sb.append(current_userid);
		sb.append(", current_stageid=");
		sb.append(current_stageid);
		sb.append(", assessment_initiated_by=");
		sb.append(assessment_initiated_by);
		sb.append(", base_langid=");
		sb.append(base_langid);
		sb.append(", archived=");
		sb.append(archived);
		sb.append(", is_active=");
		sb.append(is_active);
		sb.append("}");

		return sb.toString();
	}

	public site_assessment toEntityModel() {
		site_assessmentImpl site_assessmentImpl = new site_assessmentImpl();

		site_assessmentImpl.setAssessment_id(assessment_id);
		site_assessmentImpl.setSite_id(site_id);
		site_assessmentImpl.setStatus_id(status_id);

		if (initiation_date == Long.MIN_VALUE) {
			site_assessmentImpl.setInitiation_date(null);
		}
		else {
			site_assessmentImpl.setInitiation_date(new Date(initiation_date));
		}

		site_assessmentImpl.setCurrent_userid(current_userid);
		site_assessmentImpl.setCurrent_stageid(current_stageid);
		site_assessmentImpl.setAssessment_initiated_by(assessment_initiated_by);
		site_assessmentImpl.setBase_langid(base_langid);
		site_assessmentImpl.setArchived(archived);
		site_assessmentImpl.setIs_active(is_active);

		site_assessmentImpl.resetOriginalValues();

		return site_assessmentImpl;
	}

	public long assessment_id;
	public long site_id;
	public long status_id;
	public long initiation_date;
	public long current_userid;
	public long current_stageid;
	public long assessment_initiated_by;
	public long base_langid;
	public boolean archived;
	public boolean is_active;
}