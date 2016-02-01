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

import com.iucn.whp.dbservice.model.unesco_region_country;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing unesco_region_country in entity cache.
 *
 * @author alok.sen
 * @see unesco_region_country
 * @generated
 */
public class unesco_region_countryCacheModel implements CacheModel<unesco_region_country>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_unesco_region_country_id=");
		sb.append(whp_unesco_region_country_id);
		sb.append(", countryid=");
		sb.append(countryid);
		sb.append(", unesco_region_id=");
		sb.append(unesco_region_id);
		sb.append("}");

		return sb.toString();
	}

	public unesco_region_country toEntityModel() {
		unesco_region_countryImpl unesco_region_countryImpl = new unesco_region_countryImpl();

		unesco_region_countryImpl.setWhp_unesco_region_country_id(whp_unesco_region_country_id);
		unesco_region_countryImpl.setCountryid(countryid);
		unesco_region_countryImpl.setUnesco_region_id(unesco_region_id);

		unesco_region_countryImpl.resetOriginalValues();

		return unesco_region_countryImpl;
	}

	public int whp_unesco_region_country_id;
	public int countryid;
	public int unesco_region_id;
}