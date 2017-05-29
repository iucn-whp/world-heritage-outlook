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

import com.iucn.whp.dbservice.model.negative_factors_trend;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing negative_factors_trend in entity cache.
 *
 * @author alok.sen
 * @see negative_factors_trend
 * @generated
 */
public class negative_factors_trendCacheModel implements CacheModel<negative_factors_trend>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{trend_id=");
		sb.append(trend_id);
		sb.append(", trend=");
		sb.append(trend);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public negative_factors_trend toEntityModel() {
		negative_factors_trendImpl negative_factors_trendImpl = new negative_factors_trendImpl();

		negative_factors_trendImpl.setTrend_id(trend_id);

		if (trend == null) {
			negative_factors_trendImpl.setTrend(StringPool.BLANK);
		}
		else {
			negative_factors_trendImpl.setTrend(trend);
		}

		if (description == null) {
			negative_factors_trendImpl.setDescription(StringPool.BLANK);
		}
		else {
			negative_factors_trendImpl.setDescription(description);
		}

		negative_factors_trendImpl.resetOriginalValues();

		return negative_factors_trendImpl;
	}

	public long trend_id;
	public String trend;
	public String description;
}