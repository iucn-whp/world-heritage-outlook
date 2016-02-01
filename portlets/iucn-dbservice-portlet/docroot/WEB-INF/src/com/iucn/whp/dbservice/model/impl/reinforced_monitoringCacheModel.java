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

import com.iucn.whp.dbservice.model.reinforced_monitoring;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing reinforced_monitoring in entity cache.
 *
 * @author alok.sen
 * @see reinforced_monitoring
 * @generated
 */
public class reinforced_monitoringCacheModel implements CacheModel<reinforced_monitoring>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_reinforced_monitoring_id=");
		sb.append(whp_sites_reinforced_monitoring_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", reinforced_date=");
		sb.append(reinforced_date);
		sb.append("}");

		return sb.toString();
	}

	public reinforced_monitoring toEntityModel() {
		reinforced_monitoringImpl reinforced_monitoringImpl = new reinforced_monitoringImpl();

		reinforced_monitoringImpl.setWhp_sites_reinforced_monitoring_id(whp_sites_reinforced_monitoring_id);
		reinforced_monitoringImpl.setSite_id(site_id);

		if (reinforced_date == Long.MIN_VALUE) {
			reinforced_monitoringImpl.setReinforced_date(null);
		}
		else {
			reinforced_monitoringImpl.setReinforced_date(new Date(
					reinforced_date));
		}

		reinforced_monitoringImpl.resetOriginalValues();

		return reinforced_monitoringImpl;
	}

	public long whp_sites_reinforced_monitoring_id;
	public long site_id;
	public long reinforced_date;
}