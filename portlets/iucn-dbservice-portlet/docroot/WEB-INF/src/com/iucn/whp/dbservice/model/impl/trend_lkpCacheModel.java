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

import com.iucn.whp.dbservice.model.trend_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing trend_lkp in entity cache.
 *
 * @author alok.sen
 * @see trend_lkp
 * @generated
 */
public class trend_lkpCacheModel implements CacheModel<trend_lkp>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{trend_id=");
		sb.append(trend_id);
		sb.append(", trend=");
		sb.append(trend);
		sb.append("}");

		return sb.toString();
	}

	public trend_lkp toEntityModel() {
		trend_lkpImpl trend_lkpImpl = new trend_lkpImpl();

		trend_lkpImpl.setTrend_id(trend_id);

		if (trend == null) {
			trend_lkpImpl.setTrend(StringPool.BLANK);
		}
		else {
			trend_lkpImpl.setTrend(trend);
		}

		trend_lkpImpl.resetOriginalValues();

		return trend_lkpImpl;
	}

	public long trend_id;
	public String trend;
}