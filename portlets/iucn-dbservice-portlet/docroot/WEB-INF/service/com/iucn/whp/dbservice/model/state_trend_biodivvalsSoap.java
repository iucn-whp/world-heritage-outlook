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
public class state_trend_biodivvalsSoap implements Serializable {
	public static state_trend_biodivvalsSoap toSoapModel(
		state_trend_biodivvals model) {
		state_trend_biodivvalsSoap soapModel = new state_trend_biodivvalsSoap();

		soapModel.setState_trend_biodivvals_id(model.getState_trend_biodivvals_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setState_id(model.getState_id());
		soapModel.setTrend_id(model.getTrend_id());

		return soapModel;
	}

	public static state_trend_biodivvalsSoap[] toSoapModels(
		state_trend_biodivvals[] models) {
		state_trend_biodivvalsSoap[] soapModels = new state_trend_biodivvalsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static state_trend_biodivvalsSoap[][] toSoapModels(
		state_trend_biodivvals[][] models) {
		state_trend_biodivvalsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new state_trend_biodivvalsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new state_trend_biodivvalsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static state_trend_biodivvalsSoap[] toSoapModels(
		List<state_trend_biodivvals> models) {
		List<state_trend_biodivvalsSoap> soapModels = new ArrayList<state_trend_biodivvalsSoap>(models.size());

		for (state_trend_biodivvals model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new state_trend_biodivvalsSoap[soapModels.size()]);
	}

	public state_trend_biodivvalsSoap() {
	}

	public long getPrimaryKey() {
		return _state_trend_biodivvals_id;
	}

	public void setPrimaryKey(long pk) {
		setState_trend_biodivvals_id(pk);
	}

	public long getState_trend_biodivvals_id() {
		return _state_trend_biodivvals_id;
	}

	public void setState_trend_biodivvals_id(long state_trend_biodivvals_id) {
		_state_trend_biodivvals_id = state_trend_biodivvals_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	private long _state_trend_biodivvals_id;
	private long _assessment_version_id;
	private String _justification;
	private long _state_id;
	private long _trend_id;
}