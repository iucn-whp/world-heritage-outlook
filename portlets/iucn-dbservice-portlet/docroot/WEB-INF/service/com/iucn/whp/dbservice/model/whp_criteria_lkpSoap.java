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
public class whp_criteria_lkpSoap implements Serializable {
	public static whp_criteria_lkpSoap toSoapModel(whp_criteria_lkp model) {
		whp_criteria_lkpSoap soapModel = new whp_criteria_lkpSoap();

		soapModel.setId(model.getId());
		soapModel.setCriterion(model.getCriterion());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static whp_criteria_lkpSoap[] toSoapModels(whp_criteria_lkp[] models) {
		whp_criteria_lkpSoap[] soapModels = new whp_criteria_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_criteria_lkpSoap[][] toSoapModels(
		whp_criteria_lkp[][] models) {
		whp_criteria_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_criteria_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_criteria_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_criteria_lkpSoap[] toSoapModels(
		List<whp_criteria_lkp> models) {
		List<whp_criteria_lkpSoap> soapModels = new ArrayList<whp_criteria_lkpSoap>(models.size());

		for (whp_criteria_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_criteria_lkpSoap[soapModels.size()]);
	}

	public whp_criteria_lkpSoap() {
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

	public String getCriterion() {
		return _criterion;
	}

	public void setCriterion(String criterion) {
		_criterion = criterion;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _criterion;
	private String _description;
}