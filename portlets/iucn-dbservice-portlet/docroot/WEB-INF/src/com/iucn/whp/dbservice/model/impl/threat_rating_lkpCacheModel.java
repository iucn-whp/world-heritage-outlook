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

import com.iucn.whp.dbservice.model.threat_rating_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_rating_lkp in entity cache.
 *
 * @author alok.sen
 * @see threat_rating_lkp
 * @generated
 */
public class threat_rating_lkpCacheModel implements CacheModel<threat_rating_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rating=");
		sb.append(rating);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public threat_rating_lkp toEntityModel() {
		threat_rating_lkpImpl threat_rating_lkpImpl = new threat_rating_lkpImpl();

		threat_rating_lkpImpl.setId(id);

		if (rating == null) {
			threat_rating_lkpImpl.setRating(StringPool.BLANK);
		}
		else {
			threat_rating_lkpImpl.setRating(rating);
		}

		if (description == null) {
			threat_rating_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			threat_rating_lkpImpl.setDescription(description);
		}

		threat_rating_lkpImpl.resetOriginalValues();

		return threat_rating_lkpImpl;
	}

	public long id;
	public String rating;
	public String description;
}