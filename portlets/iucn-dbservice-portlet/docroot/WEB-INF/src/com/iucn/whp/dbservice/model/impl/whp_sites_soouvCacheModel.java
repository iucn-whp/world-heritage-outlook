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

import com.iucn.whp.dbservice.model.whp_sites_soouv;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_soouv in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_soouv
 * @generated
 */
public class whp_sites_soouvCacheModel implements CacheModel<whp_sites_soouv>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whp_sites_soouv_id=");
		sb.append(whp_sites_soouv_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", description_en=");
		sb.append(description_en);
		sb.append(", description_fr=");
		sb.append(description_fr);
		sb.append(", soouv_date=");
		sb.append(soouv_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_soouv toEntityModel() {
		whp_sites_soouvImpl whp_sites_soouvImpl = new whp_sites_soouvImpl();

		whp_sites_soouvImpl.setWhp_sites_soouv_id(whp_sites_soouv_id);
		whp_sites_soouvImpl.setSite_id(site_id);

		if (description_en == null) {
			whp_sites_soouvImpl.setDescription_en(StringPool.BLANK);
		}
		else {
			whp_sites_soouvImpl.setDescription_en(description_en);
		}

		if (description_fr == null) {
			whp_sites_soouvImpl.setDescription_fr(StringPool.BLANK);
		}
		else {
			whp_sites_soouvImpl.setDescription_fr(description_fr);
		}

		if (soouv_date == Long.MIN_VALUE) {
			whp_sites_soouvImpl.setSoouv_date(null);
		}
		else {
			whp_sites_soouvImpl.setSoouv_date(new Date(soouv_date));
		}

		whp_sites_soouvImpl.resetOriginalValues();

		return whp_sites_soouvImpl;
	}

	public long whp_sites_soouv_id;
	public long site_id;
	public String description_en;
	public String description_fr;
	public long soouv_date;
}