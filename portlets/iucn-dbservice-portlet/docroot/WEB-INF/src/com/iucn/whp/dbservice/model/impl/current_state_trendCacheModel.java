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

import com.iucn.whp.dbservice.model.current_state_trend;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing current_state_trend in entity cache.
 *
 * @author alok.sen
 * @see current_state_trend
 * @generated
 */
public class current_state_trendCacheModel implements CacheModel<current_state_trend>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{state_trend_id=");
		sb.append(state_trend_id);
		sb.append(", vn=");
		sb.append(vn);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", trend_id=");
		sb.append(trend_id);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append(", is_biodiv_whval=");
		sb.append(is_biodiv_whval);
		sb.append("}");

		return sb.toString();
	}

	public current_state_trend toEntityModel() {
		current_state_trendImpl current_state_trendImpl = new current_state_trendImpl();

		current_state_trendImpl.setState_trend_id(state_trend_id);
		current_state_trendImpl.setVn(vn);
		current_state_trendImpl.setAssessment_version_id(assessment_version_id);

		if (justification == null) {
			current_state_trendImpl.setJustification(StringPool.BLANK);
		}
		else {
			current_state_trendImpl.setJustification(justification);
		}

		current_state_trendImpl.setTrend_id(trend_id);
		current_state_trendImpl.setState_id(state_id);
		current_state_trendImpl.setIs_biodiv_whval(is_biodiv_whval);

		current_state_trendImpl.resetOriginalValues();

		return current_state_trendImpl;
	}

	public long state_trend_id;
	public long vn;
	public long assessment_version_id;
	public String justification;
	public long trend_id;
	public long state_id;
	public boolean is_biodiv_whval;
}