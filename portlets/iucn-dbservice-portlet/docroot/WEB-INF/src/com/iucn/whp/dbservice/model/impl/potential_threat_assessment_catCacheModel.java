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

import com.iucn.whp.dbservice.model.potential_threat_assessment_cat;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing potential_threat_assessment_cat in entity cache.
 *
 * @author alok.sen
 * @see potential_threat_assessment_cat
 * @generated
 */
public class potential_threat_assessment_catCacheModel implements CacheModel<potential_threat_assessment_cat>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{pot_threat_cat_id=");
		sb.append(pot_threat_cat_id);
		sb.append(", potential_threat_id=");
		sb.append(potential_threat_id);
		sb.append(", category_id=");
		sb.append(category_id);
		sb.append(", sub_cat_id=");
		sb.append(sub_cat_id);
		sb.append("}");

		return sb.toString();
	}

	public potential_threat_assessment_cat toEntityModel() {
		potential_threat_assessment_catImpl potential_threat_assessment_catImpl = new potential_threat_assessment_catImpl();

		potential_threat_assessment_catImpl.setPot_threat_cat_id(pot_threat_cat_id);
		potential_threat_assessment_catImpl.setPotential_threat_id(potential_threat_id);
		potential_threat_assessment_catImpl.setCategory_id(category_id);
		potential_threat_assessment_catImpl.setSub_cat_id(sub_cat_id);

		potential_threat_assessment_catImpl.resetOriginalValues();

		return potential_threat_assessment_catImpl;
	}

	public long pot_threat_cat_id;
	public long potential_threat_id;
	public long category_id;
	public long sub_cat_id;
}