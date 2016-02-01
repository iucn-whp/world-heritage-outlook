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

import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing conservation_outlook_rating_lkp in entity cache.
 *
 * @author alok.sen
 * @see conservation_outlook_rating_lkp
 * @generated
 */
public class conservation_outlook_rating_lkpCacheModel implements CacheModel<conservation_outlook_rating_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{co_rating_id=");
		sb.append(co_rating_id);
		sb.append(", co_rating=");
		sb.append(co_rating);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public conservation_outlook_rating_lkp toEntityModel() {
		conservation_outlook_rating_lkpImpl conservation_outlook_rating_lkpImpl = new conservation_outlook_rating_lkpImpl();

		conservation_outlook_rating_lkpImpl.setCo_rating_id(co_rating_id);

		if (co_rating == null) {
			conservation_outlook_rating_lkpImpl.setCo_rating(StringPool.BLANK);
		}
		else {
			conservation_outlook_rating_lkpImpl.setCo_rating(co_rating);
		}

		if (description == null) {
			conservation_outlook_rating_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			conservation_outlook_rating_lkpImpl.setDescription(description);
		}

		conservation_outlook_rating_lkpImpl.resetOriginalValues();

		return conservation_outlook_rating_lkpImpl;
	}

	public long co_rating_id;
	public String co_rating;
	public String description;
}