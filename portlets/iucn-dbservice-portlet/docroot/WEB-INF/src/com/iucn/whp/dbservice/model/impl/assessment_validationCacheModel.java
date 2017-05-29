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

import com.iucn.whp.dbservice.model.assessment_validation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_validation in entity cache.
 *
 * @author alok.sen
 * @see assessment_validation
 * @generated
 */
public class assessment_validationCacheModel implements CacheModel<assessment_validation>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{assessment_ver_val_id=");
		sb.append(assessment_ver_val_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", assessment_step=");
		sb.append(assessment_step);
		sb.append(", validation_complete=");
		sb.append(validation_complete);
		sb.append("}");

		return sb.toString();
	}

	public assessment_validation toEntityModel() {
		assessment_validationImpl assessment_validationImpl = new assessment_validationImpl();

		assessment_validationImpl.setAssessment_ver_val_id(assessment_ver_val_id);
		assessment_validationImpl.setAssessment_version_id(assessment_version_id);
		assessment_validationImpl.setAssessment_step(assessment_step);
		assessment_validationImpl.setValidation_complete(validation_complete);

		assessment_validationImpl.resetOriginalValues();

		return assessment_validationImpl;
	}

	public long assessment_ver_val_id;
	public long assessment_version_id;
	public long assessment_step;
	public boolean validation_complete;
}