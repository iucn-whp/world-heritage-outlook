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

import com.iucn.whp.dbservice.model.current_threat_assessment_cat;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing current_threat_assessment_cat in entity cache.
 *
 * @author alok.sen
 * @see current_threat_assessment_cat
 * @generated
 */
public class current_threat_assessment_catCacheModel implements CacheModel<current_threat_assessment_cat>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cur_threat_cat_id=");
		sb.append(cur_threat_cat_id);
		sb.append(", current_threat_id=");
		sb.append(current_threat_id);
		sb.append(", category_id=");
		sb.append(category_id);
		sb.append(", sub_cat_id=");
		sb.append(sub_cat_id);
		sb.append("}");

		return sb.toString();
	}

	public current_threat_assessment_cat toEntityModel() {
		current_threat_assessment_catImpl current_threat_assessment_catImpl = new current_threat_assessment_catImpl();

		current_threat_assessment_catImpl.setCur_threat_cat_id(cur_threat_cat_id);
		current_threat_assessment_catImpl.setCurrent_threat_id(current_threat_id);
		current_threat_assessment_catImpl.setCategory_id(category_id);
		current_threat_assessment_catImpl.setSub_cat_id(sub_cat_id);

		current_threat_assessment_catImpl.resetOriginalValues();

		return current_threat_assessment_catImpl;
	}

	public long cur_threat_cat_id;
	public long current_threat_id;
	public long category_id;
	public long sub_cat_id;
}