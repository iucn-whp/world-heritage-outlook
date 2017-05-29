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

import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_iucn_recommendation in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_iucn_recommendation
 * @generated
 */
public class whp_sites_iucn_recommendationCacheModel implements CacheModel<whp_sites_iucn_recommendation>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_sites_iucn_recommendation_id=");
		sb.append(whp_sites_iucn_recommendation_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", recommendation_type=");
		sb.append(recommendation_type);
		sb.append(", rec_date=");
		sb.append(rec_date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_iucn_recommendation toEntityModel() {
		whp_sites_iucn_recommendationImpl whp_sites_iucn_recommendationImpl = new whp_sites_iucn_recommendationImpl();

		whp_sites_iucn_recommendationImpl.setWhp_sites_iucn_recommendation_id(whp_sites_iucn_recommendation_id);
		whp_sites_iucn_recommendationImpl.setSite_id(site_id);
		whp_sites_iucn_recommendationImpl.setRecommendation_type(recommendation_type);

		if (rec_date == Long.MIN_VALUE) {
			whp_sites_iucn_recommendationImpl.setRec_date(null);
		}
		else {
			whp_sites_iucn_recommendationImpl.setRec_date(new Date(rec_date));
		}

		whp_sites_iucn_recommendationImpl.resetOriginalValues();

		return whp_sites_iucn_recommendationImpl;
	}

	public long whp_sites_iucn_recommendation_id;
	public long site_id;
	public int recommendation_type;
	public long rec_date;
}