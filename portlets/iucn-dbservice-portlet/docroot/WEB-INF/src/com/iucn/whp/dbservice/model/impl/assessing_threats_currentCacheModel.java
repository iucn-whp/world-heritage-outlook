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

import com.iucn.whp.dbservice.model.assessing_threats_current;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessing_threats_current in entity cache.
 *
 * @author alok.sen
 * @see assessing_threats_current
 * @generated
 */
public class assessing_threats_currentCacheModel implements CacheModel<assessing_threats_current>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{current_threat_id=");
		sb.append(current_threat_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", current_threat=");
		sb.append(current_threat);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", inside_site=");
		sb.append(inside_site);
		sb.append(", outside_site=");
		sb.append(outside_site);
		sb.append(", threat_rating_id=");
		sb.append(threat_rating_id);
		sb.append("}");

		return sb.toString();
	}

	public assessing_threats_current toEntityModel() {
		assessing_threats_currentImpl assessing_threats_currentImpl = new assessing_threats_currentImpl();

		assessing_threats_currentImpl.setCurrent_threat_id(current_threat_id);
		assessing_threats_currentImpl.setAssessment_version_id(assessment_version_id);

		if (current_threat == null) {
			assessing_threats_currentImpl.setCurrent_threat(StringPool.BLANK);
		}
		else {
			assessing_threats_currentImpl.setCurrent_threat(current_threat);
		}

		if (justification == null) {
			assessing_threats_currentImpl.setJustification(StringPool.BLANK);
		}
		else {
			assessing_threats_currentImpl.setJustification(justification);
		}

		assessing_threats_currentImpl.setInside_site(inside_site);
		assessing_threats_currentImpl.setOutside_site(outside_site);
		assessing_threats_currentImpl.setThreat_rating_id(threat_rating_id);

		assessing_threats_currentImpl.resetOriginalValues();

		return assessing_threats_currentImpl;
	}

	public long current_threat_id;
	public long assessment_version_id;
	public String current_threat;
	public String justification;
	public boolean inside_site;
	public boolean outside_site;
	public long threat_rating_id;
}