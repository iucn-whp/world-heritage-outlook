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
public class assessment_whvalues_whcriterionSoap implements Serializable {
	public static assessment_whvalues_whcriterionSoap toSoapModel(
		assessment_whvalues_whcriterion model) {
		assessment_whvalues_whcriterionSoap soapModel = new assessment_whvalues_whcriterionSoap();

		soapModel.setWh_criteria_id(model.getWh_criteria_id());
		soapModel.setWhvalues_id(model.getWhvalues_id());
		soapModel.setCriterion(model.getCriterion());

		return soapModel;
	}

	public static assessment_whvalues_whcriterionSoap[] toSoapModels(
		assessment_whvalues_whcriterion[] models) {
		assessment_whvalues_whcriterionSoap[] soapModels = new assessment_whvalues_whcriterionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_whvalues_whcriterionSoap[][] toSoapModels(
		assessment_whvalues_whcriterion[][] models) {
		assessment_whvalues_whcriterionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_whvalues_whcriterionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_whvalues_whcriterionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_whvalues_whcriterionSoap[] toSoapModels(
		List<assessment_whvalues_whcriterion> models) {
		List<assessment_whvalues_whcriterionSoap> soapModels = new ArrayList<assessment_whvalues_whcriterionSoap>(models.size());

		for (assessment_whvalues_whcriterion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_whvalues_whcriterionSoap[soapModels.size()]);
	}

	public assessment_whvalues_whcriterionSoap() {
	}

	public long getPrimaryKey() {
		return _wh_criteria_id;
	}

	public void setPrimaryKey(long pk) {
		setWh_criteria_id(pk);
	}

	public long getWh_criteria_id() {
		return _wh_criteria_id;
	}

	public void setWh_criteria_id(long wh_criteria_id) {
		_wh_criteria_id = wh_criteria_id;
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public long getCriterion() {
		return _criterion;
	}

	public void setCriterion(long criterion) {
		_criterion = criterion;
	}

	private long _wh_criteria_id;
	private long _whvalues_id;
	private long _criterion;
}