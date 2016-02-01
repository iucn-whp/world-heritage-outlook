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

import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing protection_management_ratings_lkp in entity cache.
 *
 * @author alok.sen
 * @see protection_management_ratings_lkp
 * @generated
 */
public class protection_management_ratings_lkpCacheModel implements CacheModel<protection_management_ratings_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", pm_rating=");
		sb.append(pm_rating);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public protection_management_ratings_lkp toEntityModel() {
		protection_management_ratings_lkpImpl protection_management_ratings_lkpImpl =
			new protection_management_ratings_lkpImpl();

		protection_management_ratings_lkpImpl.setId(id);

		if (pm_rating == null) {
			protection_management_ratings_lkpImpl.setPm_rating(StringPool.BLANK);
		}
		else {
			protection_management_ratings_lkpImpl.setPm_rating(pm_rating);
		}

		if (description == null) {
			protection_management_ratings_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			protection_management_ratings_lkpImpl.setDescription(description);
		}

		protection_management_ratings_lkpImpl.resetOriginalValues();

		return protection_management_ratings_lkpImpl;
	}

	public long id;
	public String pm_rating;
	public String description;
}