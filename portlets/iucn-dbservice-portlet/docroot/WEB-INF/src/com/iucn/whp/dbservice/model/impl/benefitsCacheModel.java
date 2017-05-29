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

import com.iucn.whp.dbservice.model.benefits;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing benefits in entity cache.
 *
 * @author alok.sen
 * @see benefits
 * @generated
 */
public class benefitsCacheModel implements CacheModel<benefits>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{benefits_id=");
		sb.append(benefits_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", selected_benefit=");
		sb.append(selected_benefit);
		sb.append(", summary=");
		sb.append(summary);
		sb.append(", habitatChangeLevel=");
		sb.append(habitatChangeLevel);
		sb.append(", habitatChangeTrend=");
		sb.append(habitatChangeTrend);
		sb.append(", pollutionLevel=");
		sb.append(pollutionLevel);
		sb.append(", pollutionTrend=");
		sb.append(pollutionTrend);
		sb.append(", overExploitationLevel=");
		sb.append(overExploitationLevel);
		sb.append(", overExploitationTrend=");
		sb.append(overExploitationTrend);
		sb.append(", climateChangeLevel=");
		sb.append(climateChangeLevel);
		sb.append(", climateChangeTrend=");
		sb.append(climateChangeTrend);
		sb.append(", invasiveSpeciesLevel=");
		sb.append(invasiveSpeciesLevel);
		sb.append(", invasiveSpeciesTrend=");
		sb.append(invasiveSpeciesTrend);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", data_deficient=");
		sb.append(data_deficient);
		sb.append(", community_within_site=");
		sb.append(community_within_site);
		sb.append(", community_outside_site=");
		sb.append(community_outside_site);
		sb.append(", wider_community=");
		sb.append(wider_community);
		sb.append("}");

		return sb.toString();
	}

	public benefits toEntityModel() {
		benefitsImpl benefitsImpl = new benefitsImpl();

		benefitsImpl.setBenefits_id(benefits_id);
		benefitsImpl.setAssessment_version_id(assessment_version_id);
		benefitsImpl.setSelected_benefit(selected_benefit);

		if (summary == null) {
			benefitsImpl.setSummary(StringPool.BLANK);
		}
		else {
			benefitsImpl.setSummary(summary);
		}

		benefitsImpl.setHabitatChangeLevel(habitatChangeLevel);
		benefitsImpl.setHabitatChangeTrend(habitatChangeTrend);
		benefitsImpl.setPollutionLevel(pollutionLevel);
		benefitsImpl.setPollutionTrend(pollutionTrend);
		benefitsImpl.setOverExploitationLevel(overExploitationLevel);
		benefitsImpl.setOverExploitationTrend(overExploitationTrend);
		benefitsImpl.setClimateChangeLevel(climateChangeLevel);
		benefitsImpl.setClimateChangeTrend(climateChangeTrend);
		benefitsImpl.setInvasiveSpeciesLevel(invasiveSpeciesLevel);
		benefitsImpl.setInvasiveSpeciesTrend(invasiveSpeciesTrend);

		if (comment == null) {
			benefitsImpl.setComment(StringPool.BLANK);
		}
		else {
			benefitsImpl.setComment(comment);
		}

		benefitsImpl.setData_deficient(data_deficient);
		benefitsImpl.setCommunity_within_site(community_within_site);
		benefitsImpl.setCommunity_outside_site(community_outside_site);
		benefitsImpl.setWider_community(wider_community);

		benefitsImpl.resetOriginalValues();

		return benefitsImpl;
	}

	public long benefits_id;
	public long assessment_version_id;
	public long selected_benefit;
	public String summary;
	public long habitatChangeLevel;
	public long habitatChangeTrend;
	public long pollutionLevel;
	public long pollutionTrend;
	public long overExploitationLevel;
	public long overExploitationTrend;
	public long climateChangeLevel;
	public long climateChangeTrend;
	public long invasiveSpeciesLevel;
	public long invasiveSpeciesTrend;
	public String comment;
	public boolean data_deficient;
	public long community_within_site;
	public long community_outside_site;
	public long wider_community;
}