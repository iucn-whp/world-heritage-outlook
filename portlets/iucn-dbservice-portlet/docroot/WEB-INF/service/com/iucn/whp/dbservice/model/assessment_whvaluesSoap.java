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
public class assessment_whvaluesSoap implements Serializable {
	public static assessment_whvaluesSoap toSoapModel(assessment_whvalues model) {
		assessment_whvaluesSoap soapModel = new assessment_whvaluesSoap();

		soapModel.setWhvalues_id(model.getWhvalues_id());
		soapModel.setVn(model.getVn());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setValues(model.getValues());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static assessment_whvaluesSoap[] toSoapModels(
		assessment_whvalues[] models) {
		assessment_whvaluesSoap[] soapModels = new assessment_whvaluesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_whvaluesSoap[][] toSoapModels(
		assessment_whvalues[][] models) {
		assessment_whvaluesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_whvaluesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_whvaluesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_whvaluesSoap[] toSoapModels(
		List<assessment_whvalues> models) {
		List<assessment_whvaluesSoap> soapModels = new ArrayList<assessment_whvaluesSoap>(models.size());

		for (assessment_whvalues model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_whvaluesSoap[soapModels.size()]);
	}

	public assessment_whvaluesSoap() {
	}

	public long getPrimaryKey() {
		return _whvalues_id;
	}

	public void setPrimaryKey(long pk) {
		setWhvalues_id(pk);
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public long getVn() {
		return _vn;
	}

	public void setVn(long vn) {
		_vn = vn;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getValues() {
		return _values;
	}

	public void setValues(String values) {
		_values = values;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _whvalues_id;
	private long _vn;
	private long _assessment_version_id;
	private String _values;
	private String _description;
}