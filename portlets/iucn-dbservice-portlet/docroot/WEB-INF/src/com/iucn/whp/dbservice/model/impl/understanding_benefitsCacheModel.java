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

import com.iucn.whp.dbservice.model.understanding_benefits;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing understanding_benefits in entity cache.
 *
 * @author alok.sen
 * @see understanding_benefits
 * @generated
 */
public class understanding_benefitsCacheModel implements CacheModel<understanding_benefits>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{understanding_benefits_id=");
		sb.append(understanding_benefits_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", selected_benefit=");
		sb.append(selected_benefit);
		sb.append(", summary=");
		sb.append(summary);
		sb.append(", community_within_site=");
		sb.append(community_within_site);
		sb.append(", community_outside_site=");
		sb.append(community_outside_site);
		sb.append(", wider_community=");
		sb.append(wider_community);
		sb.append("}");

		return sb.toString();
	}

	public understanding_benefits toEntityModel() {
		understanding_benefitsImpl understanding_benefitsImpl = new understanding_benefitsImpl();

		understanding_benefitsImpl.setUnderstanding_benefits_id(understanding_benefits_id);
		understanding_benefitsImpl.setAssessment_version_id(assessment_version_id);
		understanding_benefitsImpl.setSelected_benefit(selected_benefit);

		if (summary == null) {
			understanding_benefitsImpl.setSummary(StringPool.BLANK);
		}
		else {
			understanding_benefitsImpl.setSummary(summary);
		}

		understanding_benefitsImpl.setCommunity_within_site(community_within_site);
		understanding_benefitsImpl.setCommunity_outside_site(community_outside_site);
		understanding_benefitsImpl.setWider_community(wider_community);

		understanding_benefitsImpl.resetOriginalValues();

		return understanding_benefitsImpl;
	}

	public long understanding_benefits_id;
	public long assessment_version_id;
	public long selected_benefit;
	public String summary;
	public long community_within_site;
	public long community_outside_site;
	public long wider_community;
}