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
public class current_state_trendSoap implements Serializable {
	public static current_state_trendSoap toSoapModel(current_state_trend model) {
		current_state_trendSoap soapModel = new current_state_trendSoap();

		soapModel.setState_trend_id(model.getState_trend_id());
		soapModel.setVn(model.getVn());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setTrend_id(model.getTrend_id());
		soapModel.setState_id(model.getState_id());
		soapModel.setIs_biodiv_whval(model.getIs_biodiv_whval());

		return soapModel;
	}

	public static current_state_trendSoap[] toSoapModels(
		current_state_trend[] models) {
		current_state_trendSoap[] soapModels = new current_state_trendSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static current_state_trendSoap[][] toSoapModels(
		current_state_trend[][] models) {
		current_state_trendSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new current_state_trendSoap[models.length][models[0].length];
		}
		else {
			soapModels = new current_state_trendSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static current_state_trendSoap[] toSoapModels(
		List<current_state_trend> models) {
		List<current_state_trendSoap> soapModels = new ArrayList<current_state_trendSoap>(models.size());

		for (current_state_trend model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new current_state_trendSoap[soapModels.size()]);
	}

	public current_state_trendSoap() {
	}

	public long getPrimaryKey() {
		return _state_trend_id;
	}

	public void setPrimaryKey(long pk) {
		setState_trend_id(pk);
	}

	public long getState_trend_id() {
		return _state_trend_id;
	}

	public void setState_trend_id(long state_trend_id) {
		_state_trend_id = state_trend_id;
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

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public boolean getIs_biodiv_whval() {
		return _is_biodiv_whval;
	}

	public boolean isIs_biodiv_whval() {
		return _is_biodiv_whval;
	}

	public void setIs_biodiv_whval(boolean is_biodiv_whval) {
		_is_biodiv_whval = is_biodiv_whval;
	}

	private long _state_trend_id;
	private long _vn;
	private long _assessment_version_id;
	private String _justification;
	private long _trend_id;
	private long _state_id;
	private boolean _is_biodiv_whval;
}