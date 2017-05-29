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

import com.iucn.whp.dbservice.model.state_trend_whvalues;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing state_trend_whvalues in entity cache.
 *
 * @author alok.sen
 * @see state_trend_whvalues
 * @generated
 */
public class state_trend_whvaluesCacheModel implements CacheModel<state_trend_whvalues>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{state_trend_whval_id=");
		sb.append(state_trend_whval_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append(", trend_id=");
		sb.append(trend_id);
		sb.append("}");

		return sb.toString();
	}

	public state_trend_whvalues toEntityModel() {
		state_trend_whvaluesImpl state_trend_whvaluesImpl = new state_trend_whvaluesImpl();

		state_trend_whvaluesImpl.setState_trend_whval_id(state_trend_whval_id);
		state_trend_whvaluesImpl.setAssessment_version_id(assessment_version_id);

		if (justification == null) {
			state_trend_whvaluesImpl.setJustification(StringPool.BLANK);
		}
		else {
			state_trend_whvaluesImpl.setJustification(justification);
		}

		state_trend_whvaluesImpl.setState_id(state_id);
		state_trend_whvaluesImpl.setTrend_id(trend_id);

		state_trend_whvaluesImpl.resetOriginalValues();

		return state_trend_whvaluesImpl;
	}

	public long state_trend_whval_id;
	public long assessment_version_id;
	public String justification;
	public long state_id;
	public long trend_id;
}