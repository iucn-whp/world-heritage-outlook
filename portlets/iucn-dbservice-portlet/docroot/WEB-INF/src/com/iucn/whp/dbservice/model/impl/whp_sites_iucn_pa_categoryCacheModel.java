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

import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_iucn_pa_category in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_iucn_pa_category
 * @generated
 */
public class whp_sites_iucn_pa_categoryCacheModel implements CacheModel<whp_sites_iucn_pa_category>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_iucn_pa_category_id=");
		sb.append(whp_sites_iucn_pa_category_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", iucn_pa_category_id=");
		sb.append(iucn_pa_category_id);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_iucn_pa_category toEntityModel() {
		whp_sites_iucn_pa_categoryImpl whp_sites_iucn_pa_categoryImpl = new whp_sites_iucn_pa_categoryImpl();

		whp_sites_iucn_pa_categoryImpl.setWhp_sites_iucn_pa_category_id(whp_sites_iucn_pa_category_id);
		whp_sites_iucn_pa_categoryImpl.setSite_id(site_id);
		whp_sites_iucn_pa_categoryImpl.setIucn_pa_category_id(iucn_pa_category_id);

		whp_sites_iucn_pa_categoryImpl.resetOriginalValues();

		return whp_sites_iucn_pa_categoryImpl;
	}

	public long whp_sites_iucn_pa_category_id;
	public long site_id;
	public int iucn_pa_category_id;
}