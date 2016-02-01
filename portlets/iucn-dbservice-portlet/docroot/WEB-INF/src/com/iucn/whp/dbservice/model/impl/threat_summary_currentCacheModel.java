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

import com.iucn.whp.dbservice.model.threat_summary_current;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_summary_current in entity cache.
 *
 * @author alok.sen
 * @see threat_summary_current
 * @generated
 */
public class threat_summary_currentCacheModel implements CacheModel<threat_summary_current>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{threat_sum_cur_id=");
		sb.append(threat_sum_cur_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", overall_current=");
		sb.append(overall_current);
		sb.append(", threat_rating=");
		sb.append(threat_rating);
		sb.append("}");

		return sb.toString();
	}

	public threat_summary_current toEntityModel() {
		threat_summary_currentImpl threat_summary_currentImpl = new threat_summary_currentImpl();

		threat_summary_currentImpl.setThreat_sum_cur_id(threat_sum_cur_id);
		threat_summary_currentImpl.setAssessment_version_id(assessment_version_id);

		if (overall_current == null) {
			threat_summary_currentImpl.setOverall_current(StringPool.BLANK);
		}
		else {
			threat_summary_currentImpl.setOverall_current(overall_current);
		}

		threat_summary_currentImpl.setThreat_rating(threat_rating);

		threat_summary_currentImpl.resetOriginalValues();

		return threat_summary_currentImpl;
	}

	public long threat_sum_cur_id;
	public long assessment_version_id;
	public String overall_current;
	public long threat_rating;
}