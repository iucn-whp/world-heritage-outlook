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

import com.iucn.whp.dbservice.model.whp_site_danger_list;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_site_danger_list in entity cache.
 *
 * @author alok.sen
 * @see whp_site_danger_list
 * @generated
 */
public class whp_site_danger_listCacheModel implements CacheModel<whp_site_danger_list>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_site_danger_list_id=");
		sb.append(whp_site_danger_list_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", status_id=");
		sb.append(status_id);
		sb.append(", year=");
		sb.append(year);
		sb.append("}");

		return sb.toString();
	}

	public whp_site_danger_list toEntityModel() {
		whp_site_danger_listImpl whp_site_danger_listImpl = new whp_site_danger_listImpl();

		whp_site_danger_listImpl.setWhp_site_danger_list_id(whp_site_danger_list_id);
		whp_site_danger_listImpl.setSite_id(site_id);
		whp_site_danger_listImpl.setStatus_id(status_id);

		if (year == Long.MIN_VALUE) {
			whp_site_danger_listImpl.setYear(null);
		}
		else {
			whp_site_danger_listImpl.setYear(new Date(year));
		}

		whp_site_danger_listImpl.resetOriginalValues();

		return whp_site_danger_listImpl;
	}

	public long whp_site_danger_list_id;
	public long site_id;
	public int status_id;
	public long year;
}