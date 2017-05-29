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

import com.iucn.whp.dbservice.model.threat_summary_potential;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_summary_potential in entity cache.
 *
 * @author alok.sen
 * @see threat_summary_potential
 * @generated
 */
public class threat_summary_potentialCacheModel implements CacheModel<threat_summary_potential>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{threat_sum_potential_id=");
		sb.append(threat_sum_potential_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", overall_potential=");
		sb.append(overall_potential);
		sb.append(", threat_rating=");
		sb.append(threat_rating);
		sb.append("}");

		return sb.toString();
	}

	public threat_summary_potential toEntityModel() {
		threat_summary_potentialImpl threat_summary_potentialImpl = new threat_summary_potentialImpl();

		threat_summary_potentialImpl.setThreat_sum_potential_id(threat_sum_potential_id);
		threat_summary_potentialImpl.setAssessment_version_id(assessment_version_id);

		if (overall_potential == null) {
			threat_summary_potentialImpl.setOverall_potential(StringPool.BLANK);
		}
		else {
			threat_summary_potentialImpl.setOverall_potential(overall_potential);
		}

		threat_summary_potentialImpl.setThreat_rating(threat_rating);

		threat_summary_potentialImpl.resetOriginalValues();

		return threat_summary_potentialImpl;
	}

	public long threat_sum_potential_id;
	public long assessment_version_id;
	public String overall_potential;
	public long threat_rating;
}