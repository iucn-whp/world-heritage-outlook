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

import com.iucn.whp.dbservice.model.flagship_species_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing flagship_species_lkp in entity cache.
 *
 * @author alok.sen
 * @see flagship_species_lkp
 * @generated
 */
public class flagship_species_lkpCacheModel implements CacheModel<flagship_species_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{flagship_species_id=");
		sb.append(flagship_species_id);
		sb.append(", flagship_species_name=");
		sb.append(flagship_species_name);
		sb.append(", redlist_url=");
		sb.append(redlist_url);
		sb.append("}");

		return sb.toString();
	}

	public flagship_species_lkp toEntityModel() {
		flagship_species_lkpImpl flagship_species_lkpImpl = new flagship_species_lkpImpl();

		flagship_species_lkpImpl.setFlagship_species_id(flagship_species_id);

		if (flagship_species_name == null) {
			flagship_species_lkpImpl.setFlagship_species_name(StringPool.BLANK);
		}
		else {
			flagship_species_lkpImpl.setFlagship_species_name(flagship_species_name);
		}

		if (redlist_url == null) {
			flagship_species_lkpImpl.setRedlist_url(StringPool.BLANK);
		}
		else {
			flagship_species_lkpImpl.setRedlist_url(redlist_url);
		}

		flagship_species_lkpImpl.resetOriginalValues();

		return flagship_species_lkpImpl;
	}

	public int flagship_species_id;
	public String flagship_species_name;
	public String redlist_url;
}