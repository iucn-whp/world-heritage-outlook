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

import com.iucn.whp.dbservice.model.recommendation_type_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing recommendation_type_lkp in entity cache.
 *
 * @author alok.sen
 * @see recommendation_type_lkp
 * @generated
 */
public class recommendation_type_lkpCacheModel implements CacheModel<recommendation_type_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{rec_type_id=");
		sb.append(rec_type_id);
		sb.append(", recommendation=");
		sb.append(recommendation);
		sb.append("}");

		return sb.toString();
	}

	public recommendation_type_lkp toEntityModel() {
		recommendation_type_lkpImpl recommendation_type_lkpImpl = new recommendation_type_lkpImpl();

		recommendation_type_lkpImpl.setRec_type_id(rec_type_id);

		if (recommendation == null) {
			recommendation_type_lkpImpl.setRecommendation(StringPool.BLANK);
		}
		else {
			recommendation_type_lkpImpl.setRecommendation(recommendation);
		}

		recommendation_type_lkpImpl.resetOriginalValues();

		return recommendation_type_lkpImpl;
	}

	public int rec_type_id;
	public String recommendation;
}