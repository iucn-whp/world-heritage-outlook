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

import com.iucn.whp.dbservice.model.whp_sites_inscription_criteria;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_inscription_criteria in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_inscription_criteria
 * @generated
 */
public class whp_sites_inscription_criteriaCacheModel implements CacheModel<whp_sites_inscription_criteria>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_inscription_criteria_id=");
		sb.append(whp_sites_inscription_criteria_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", criteria_id=");
		sb.append(criteria_id);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_inscription_criteria toEntityModel() {
		whp_sites_inscription_criteriaImpl whp_sites_inscription_criteriaImpl = new whp_sites_inscription_criteriaImpl();

		whp_sites_inscription_criteriaImpl.setWhp_sites_inscription_criteria_id(whp_sites_inscription_criteria_id);
		whp_sites_inscription_criteriaImpl.setSite_id(site_id);
		whp_sites_inscription_criteriaImpl.setCriteria_id(criteria_id);

		whp_sites_inscription_criteriaImpl.resetOriginalValues();

		return whp_sites_inscription_criteriaImpl;
	}

	public long whp_sites_inscription_criteria_id;
	public long site_id;
	public int criteria_id;
}