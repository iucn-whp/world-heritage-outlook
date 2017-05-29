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

import com.iucn.whp.dbservice.model.biodiversity_values;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing biodiversity_values in entity cache.
 *
 * @author alok.sen
 * @see biodiversity_values
 * @generated
 */
public class biodiversity_valuesCacheModel implements CacheModel<biodiversity_values>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vn=");
		sb.append(vn);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", value=");
		sb.append(value);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public biodiversity_values toEntityModel() {
		biodiversity_valuesImpl biodiversity_valuesImpl = new biodiversity_valuesImpl();

		biodiversity_valuesImpl.setId(id);
		biodiversity_valuesImpl.setVn(vn);
		biodiversity_valuesImpl.setAssessment_version_id(assessment_version_id);

		if (value == null) {
			biodiversity_valuesImpl.setValue(StringPool.BLANK);
		}
		else {
			biodiversity_valuesImpl.setValue(value);
		}

		if (description == null) {
			biodiversity_valuesImpl.setDescription(StringPool.BLANK);
		}
		else {
			biodiversity_valuesImpl.setDescription(description);
		}

		biodiversity_valuesImpl.resetOriginalValues();

		return biodiversity_valuesImpl;
	}

	public long id;
	public long vn;
	public long assessment_version_id;
	public String value;
	public String description;
}