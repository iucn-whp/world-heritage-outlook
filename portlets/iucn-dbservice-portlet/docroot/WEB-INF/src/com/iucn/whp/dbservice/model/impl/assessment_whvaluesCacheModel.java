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

import com.iucn.whp.dbservice.model.assessment_whvalues;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_whvalues in entity cache.
 *
 * @author alok.sen
 * @see assessment_whvalues
 * @generated
 */
public class assessment_whvaluesCacheModel implements CacheModel<assessment_whvalues>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whvalues_id=");
		sb.append(whvalues_id);
		sb.append(", vn=");
		sb.append(vn);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", values=");
		sb.append(values);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public assessment_whvalues toEntityModel() {
		assessment_whvaluesImpl assessment_whvaluesImpl = new assessment_whvaluesImpl();

		assessment_whvaluesImpl.setWhvalues_id(whvalues_id);
		assessment_whvaluesImpl.setVn(vn);
		assessment_whvaluesImpl.setAssessment_version_id(assessment_version_id);

		if (values == null) {
			assessment_whvaluesImpl.setValues(StringPool.BLANK);
		}
		else {
			assessment_whvaluesImpl.setValues(values);
		}

		if (description == null) {
			assessment_whvaluesImpl.setDescription(StringPool.BLANK);
		}
		else {
			assessment_whvaluesImpl.setDescription(description);
		}

		assessment_whvaluesImpl.resetOriginalValues();

		return assessment_whvaluesImpl;
	}

	public long whvalues_id;
	public long vn;
	public long assessment_version_id;
	public String values;
	public String description;
}