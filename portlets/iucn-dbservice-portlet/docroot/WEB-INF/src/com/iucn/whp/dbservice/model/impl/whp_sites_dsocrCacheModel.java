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

import com.iucn.whp.dbservice.model.whp_sites_dsocr;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_dsocr in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_dsocr
 * @generated
 */
public class whp_sites_dsocrCacheModel implements CacheModel<whp_sites_dsocr>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_sites_dsocr_id=");
		sb.append(whp_sites_dsocr_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", state_description=");
		sb.append(state_description);
		sb.append(", dsocr_date=");
		sb.append(dsocr_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_dsocr toEntityModel() {
		whp_sites_dsocrImpl whp_sites_dsocrImpl = new whp_sites_dsocrImpl();

		whp_sites_dsocrImpl.setWhp_sites_dsocr_id(whp_sites_dsocr_id);
		whp_sites_dsocrImpl.setSite_id(site_id);

		if (state_description == null) {
			whp_sites_dsocrImpl.setState_description(StringPool.BLANK);
		}
		else {
			whp_sites_dsocrImpl.setState_description(state_description);
		}

		if (dsocr_date == Long.MIN_VALUE) {
			whp_sites_dsocrImpl.setDsocr_date(null);
		}
		else {
			whp_sites_dsocrImpl.setDsocr_date(new Date(dsocr_date));
		}

		whp_sites_dsocrImpl.resetOriginalValues();

		return whp_sites_dsocrImpl;
	}

	public long whp_sites_dsocr_id;
	public long site_id;
	public String state_description;
	public long dsocr_date;
}