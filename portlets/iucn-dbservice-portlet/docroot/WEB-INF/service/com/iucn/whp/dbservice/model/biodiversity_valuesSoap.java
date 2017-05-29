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
public class biodiversity_valuesSoap implements Serializable {
	public static biodiversity_valuesSoap toSoapModel(biodiversity_values model) {
		biodiversity_valuesSoap soapModel = new biodiversity_valuesSoap();

		soapModel.setId(model.getId());
		soapModel.setVn(model.getVn());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setValue(model.getValue());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static biodiversity_valuesSoap[] toSoapModels(
		biodiversity_values[] models) {
		biodiversity_valuesSoap[] soapModels = new biodiversity_valuesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static biodiversity_valuesSoap[][] toSoapModels(
		biodiversity_values[][] models) {
		biodiversity_valuesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new biodiversity_valuesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new biodiversity_valuesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static biodiversity_valuesSoap[] toSoapModels(
		List<biodiversity_values> models) {
		List<biodiversity_valuesSoap> soapModels = new ArrayList<biodiversity_valuesSoap>(models.size());

		for (biodiversity_values model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new biodiversity_valuesSoap[soapModels.size()]);
	}

	public biodiversity_valuesSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private long _vn;
	private long _assessment_version_id;
	private String _value;
	private String _description;
}