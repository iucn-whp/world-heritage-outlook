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

package com.iucn.whp.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class assessment_validationSoap implements Serializable {
	public static assessment_validationSoap toSoapModel(
		assessment_validation model) {
		assessment_validationSoap soapModel = new assessment_validationSoap();

		soapModel.setAssessment_ver_val_id(model.getAssessment_ver_val_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setAssessment_step(model.getAssessment_step());
		soapModel.setValidation_complete(model.getValidation_complete());

		return soapModel;
	}

	public static assessment_validationSoap[] toSoapModels(
		assessment_validation[] models) {
		assessment_validationSoap[] soapModels = new assessment_validationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_validationSoap[][] toSoapModels(
		assessment_validation[][] models) {
		assessment_validationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_validationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_validationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_validationSoap[] toSoapModels(
		List<assessment_validation> models) {
		List<assessment_validationSoap> soapModels = new ArrayList<assessment_validationSoap>(models.size());

		for (assessment_validation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_validationSoap[soapModels.size()]);
	}

	public assessment_validationSoap() {
	}

	public long getPrimaryKey() {
		return _assessment_ver_val_id;
	}

	public void setPrimaryKey(long pk) {
		setAssessment_ver_val_id(pk);
	}

	public long getAssessment_ver_val_id() {
		return _assessment_ver_val_id;
	}

	public void setAssessment_ver_val_id(long assessment_ver_val_id) {
		_assessment_ver_val_id = assessment_ver_val_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getAssessment_step() {
		return _assessment_step;
	}

	public void setAssessment_step(long assessment_step) {
		_assessment_step = assessment_step;
	}

	public boolean getValidation_complete() {
		return _validation_complete;
	}

	public boolean isValidation_complete() {
		return _validation_complete;
	}

	public void setValidation_complete(boolean validation_complete) {
		_validation_complete = validation_complete;
	}

	private long _assessment_ver_val_id;
	private long _assessment_version_id;
	private long _assessment_step;
	private boolean _validation_complete;
}