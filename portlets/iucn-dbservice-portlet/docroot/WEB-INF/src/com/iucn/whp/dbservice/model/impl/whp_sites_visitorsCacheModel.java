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

import com.iucn.whp.dbservice.model.whp_sites_visitors;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_visitors in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_visitors
 * @generated
 */
public class whp_sites_visitorsCacheModel implements CacheModel<whp_sites_visitors>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_sites_visitors_id=");
		sb.append(whp_sites_visitors_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", visitor_count=");
		sb.append(visitor_count);
		sb.append(", record_date=");
		sb.append(record_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_visitors toEntityModel() {
		whp_sites_visitorsImpl whp_sites_visitorsImpl = new whp_sites_visitorsImpl();

		whp_sites_visitorsImpl.setWhp_sites_visitors_id(whp_sites_visitors_id);
		whp_sites_visitorsImpl.setSite_id(site_id);
		whp_sites_visitorsImpl.setVisitor_count(visitor_count);

		if (record_date == Long.MIN_VALUE) {
			whp_sites_visitorsImpl.setRecord_date(null);
		}
		else {
			whp_sites_visitorsImpl.setRecord_date(new Date(record_date));
		}

		whp_sites_visitorsImpl.resetOriginalValues();

		return whp_sites_visitorsImpl;
	}

	public long whp_sites_visitors_id;
	public long site_id;
	public long visitor_count;
	public long record_date;
}