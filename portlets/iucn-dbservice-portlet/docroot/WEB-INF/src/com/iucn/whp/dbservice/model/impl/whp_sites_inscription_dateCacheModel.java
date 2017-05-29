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

import com.iucn.whp.dbservice.model.whp_sites_inscription_date;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_inscription_date in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_inscription_date
 * @generated
 */
public class whp_sites_inscription_dateCacheModel implements CacheModel<whp_sites_inscription_date>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whp_sites_inscription_date_id=");
		sb.append(whp_sites_inscription_date_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", inscription_type_id=");
		sb.append(inscription_type_id);
		sb.append(", reference_no=");
		sb.append(reference_no);
		sb.append(", inscription_date=");
		sb.append(inscription_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_inscription_date toEntityModel() {
		whp_sites_inscription_dateImpl whp_sites_inscription_dateImpl = new whp_sites_inscription_dateImpl();

		whp_sites_inscription_dateImpl.setWhp_sites_inscription_date_id(whp_sites_inscription_date_id);
		whp_sites_inscription_dateImpl.setSite_id(site_id);
		whp_sites_inscription_dateImpl.setInscription_type_id(inscription_type_id);

		if (reference_no == null) {
			whp_sites_inscription_dateImpl.setReference_no(StringPool.BLANK);
		}
		else {
			whp_sites_inscription_dateImpl.setReference_no(reference_no);
		}

		if (inscription_date == Long.MIN_VALUE) {
			whp_sites_inscription_dateImpl.setInscription_date(null);
		}
		else {
			whp_sites_inscription_dateImpl.setInscription_date(new Date(
					inscription_date));
		}

		whp_sites_inscription_dateImpl.resetOriginalValues();

		return whp_sites_inscription_dateImpl;
	}

	public long whp_sites_inscription_date_id;
	public long site_id;
	public int inscription_type_id;
	public String reference_no;
	public long inscription_date;
}