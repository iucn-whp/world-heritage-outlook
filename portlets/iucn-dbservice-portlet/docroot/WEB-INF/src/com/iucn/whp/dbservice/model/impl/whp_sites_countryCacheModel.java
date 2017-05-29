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

import com.iucn.whp.dbservice.model.whp_sites_country;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_country in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_country
 * @generated
 */
public class whp_sites_countryCacheModel implements CacheModel<whp_sites_country>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_country_id=");
		sb.append(whp_sites_country_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", countryid=");
		sb.append(countryid);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_country toEntityModel() {
		whp_sites_countryImpl whp_sites_countryImpl = new whp_sites_countryImpl();

		whp_sites_countryImpl.setWhp_sites_country_id(whp_sites_country_id);
		whp_sites_countryImpl.setSite_id(site_id);
		whp_sites_countryImpl.setCountryid(countryid);

		whp_sites_countryImpl.resetOriginalValues();

		return whp_sites_countryImpl;
	}

	public long whp_sites_country_id;
	public long site_id;
	public int countryid;
}