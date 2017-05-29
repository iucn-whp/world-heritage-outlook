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
public class current_state_trend_valuesSoap implements Serializable {
	public static current_state_trend_valuesSoap toSoapModel(
		current_state_trend_values model) {
		current_state_trend_valuesSoap soapModel = new current_state_trend_valuesSoap();

		soapModel.setId(model.getId());
		soapModel.setVn(model.getVn());
		soapModel.setWhvalues_id(model.getWhvalues_id());
		soapModel.setState_trend_id(model.getState_trend_id());

		return soapModel;
	}

	public static current_state_trend_valuesSoap[] toSoapModels(
		current_state_trend_values[] models) {
		current_state_trend_valuesSoap[] soapModels = new current_state_trend_valuesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static current_state_trend_valuesSoap[][] toSoapModels(
		current_state_trend_values[][] models) {
		current_state_trend_valuesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new current_state_trend_valuesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new current_state_trend_valuesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static current_state_trend_valuesSoap[] toSoapModels(
		List<current_state_trend_values> models) {
		List<current_state_trend_valuesSoap> soapModels = new ArrayList<current_state_trend_valuesSoap>(models.size());

		for (current_state_trend_values model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new current_state_trend_valuesSoap[soapModels.size()]);
	}

	public current_state_trend_valuesSoap() {
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

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public long getState_trend_id() {
		return _state_trend_id;
	}

	public void setState_trend_id(long state_trend_id) {
		_state_trend_id = state_trend_id;
	}

	private long _id;
	private long _vn;
	private long _whvalues_id;
	private long _state_trend_id;
}