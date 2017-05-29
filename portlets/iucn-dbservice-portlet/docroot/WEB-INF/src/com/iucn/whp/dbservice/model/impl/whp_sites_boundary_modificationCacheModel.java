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

import com.iucn.whp.dbservice.model.whp_sites_boundary_modification;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_boundary_modification in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_boundary_modification
 * @generated
 */
public class whp_sites_boundary_modificationCacheModel implements CacheModel<whp_sites_boundary_modification>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whp_sites_boundary_modification_id=");
		sb.append(whp_sites_boundary_modification_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", bmid=");
		sb.append(bmid);
		sb.append(", description=");
		sb.append(description);
		sb.append(", mod_date=");
		sb.append(mod_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_boundary_modification toEntityModel() {
		whp_sites_boundary_modificationImpl whp_sites_boundary_modificationImpl = new whp_sites_boundary_modificationImpl();

		whp_sites_boundary_modificationImpl.setWhp_sites_boundary_modification_id(whp_sites_boundary_modification_id);
		whp_sites_boundary_modificationImpl.setSite_id(site_id);
		whp_sites_boundary_modificationImpl.setBmid(bmid);

		if (description == null) {
			whp_sites_boundary_modificationImpl.setDescription(StringPool.BLANK);
		}
		else {
			whp_sites_boundary_modificationImpl.setDescription(description);
		}

		if (mod_date == Long.MIN_VALUE) {
			whp_sites_boundary_modificationImpl.setMod_date(null);
		}
		else {
			whp_sites_boundary_modificationImpl.setMod_date(new Date(mod_date));
		}

		whp_sites_boundary_modificationImpl.resetOriginalValues();

		return whp_sites_boundary_modificationImpl;
	}

	public long whp_sites_boundary_modification_id;
	public long site_id;
	public int bmid;
	public String description;
	public long mod_date;
}