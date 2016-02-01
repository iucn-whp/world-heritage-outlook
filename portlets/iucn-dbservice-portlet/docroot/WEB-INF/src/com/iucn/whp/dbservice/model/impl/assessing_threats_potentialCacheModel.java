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

import com.iucn.whp.dbservice.model.assessing_threats_potential;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessing_threats_potential in entity cache.
 *
 * @author alok.sen
 * @see assessing_threats_potential
 * @generated
 */
public class assessing_threats_potentialCacheModel implements CacheModel<assessing_threats_potential>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{potential_threat_id=");
		sb.append(potential_threat_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", potential_threat=");
		sb.append(potential_threat);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", threat_rating=");
		sb.append(threat_rating);
		sb.append(", inside_site=");
		sb.append(inside_site);
		sb.append(", outside_site=");
		sb.append(outside_site);
		sb.append("}");

		return sb.toString();
	}

	public assessing_threats_potential toEntityModel() {
		assessing_threats_potentialImpl assessing_threats_potentialImpl = new assessing_threats_potentialImpl();

		assessing_threats_potentialImpl.setPotential_threat_id(potential_threat_id);
		assessing_threats_potentialImpl.setAssessment_version_id(assessment_version_id);

		if (potential_threat == null) {
			assessing_threats_potentialImpl.setPotential_threat(StringPool.BLANK);
		}
		else {
			assessing_threats_potentialImpl.setPotential_threat(potential_threat);
		}

		if (justification == null) {
			assessing_threats_potentialImpl.setJustification(StringPool.BLANK);
		}
		else {
			assessing_threats_potentialImpl.setJustification(justification);
		}

		assessing_threats_potentialImpl.setThreat_rating(threat_rating);
		assessing_threats_potentialImpl.setInside_site(inside_site);
		assessing_threats_potentialImpl.setOutside_site(outside_site);

		assessing_threats_potentialImpl.resetOriginalValues();

		return assessing_threats_potentialImpl;
	}

	public long potential_threat_id;
	public long assessment_version_id;
	public String potential_threat;
	public String justification;
	public long threat_rating;
	public boolean inside_site;
	public boolean outside_site;
}