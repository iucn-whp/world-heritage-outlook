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

import com.iucn.whp.dbservice.model.threat_summary_overall;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_summary_overall in entity cache.
 *
 * @author alok.sen
 * @see threat_summary_overall
 * @generated
 */
public class threat_summary_overallCacheModel implements CacheModel<threat_summary_overall>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{threat_sum_overall_id=");
		sb.append(threat_sum_overall_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", overall_threat=");
		sb.append(overall_threat);
		sb.append(", threat_rating=");
		sb.append(threat_rating);
		sb.append("}");

		return sb.toString();
	}

	public threat_summary_overall toEntityModel() {
		threat_summary_overallImpl threat_summary_overallImpl = new threat_summary_overallImpl();

		threat_summary_overallImpl.setThreat_sum_overall_id(threat_sum_overall_id);
		threat_summary_overallImpl.setAssessment_version_id(assessment_version_id);

		if (overall_threat == null) {
			threat_summary_overallImpl.setOverall_threat(StringPool.BLANK);
		}
		else {
			threat_summary_overallImpl.setOverall_threat(overall_threat);
		}

		threat_summary_overallImpl.setThreat_rating(threat_rating);

		threat_summary_overallImpl.resetOriginalValues();

		return threat_summary_overallImpl;
	}

	public long threat_sum_overall_id;
	public long assessment_version_id;
	public String overall_threat;
	public long threat_rating;
}