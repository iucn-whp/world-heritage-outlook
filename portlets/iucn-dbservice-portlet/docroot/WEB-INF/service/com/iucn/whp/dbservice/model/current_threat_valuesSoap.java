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
public class current_threat_valuesSoap implements Serializable {
	public static current_threat_valuesSoap toSoapModel(
		current_threat_values model) {
		current_threat_valuesSoap soapModel = new current_threat_valuesSoap();

		soapModel.setCurrent_threat_values_id(model.getCurrent_threat_values_id());
		soapModel.setCurrent_threat_id(model.getCurrent_threat_id());
		soapModel.setWhvalues_id(model.getWhvalues_id());
		soapModel.setIs_biodiv_whval(model.getIs_biodiv_whval());

		return soapModel;
	}

	public static current_threat_valuesSoap[] toSoapModels(
		current_threat_values[] models) {
		current_threat_valuesSoap[] soapModels = new current_threat_valuesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static current_threat_valuesSoap[][] toSoapModels(
		current_threat_values[][] models) {
		current_threat_valuesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new current_threat_valuesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new current_threat_valuesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static current_threat_valuesSoap[] toSoapModels(
		List<current_threat_values> models) {
		List<current_threat_valuesSoap> soapModels = new ArrayList<current_threat_valuesSoap>(models.size());

		for (current_threat_values model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new current_threat_valuesSoap[soapModels.size()]);
	}

	public current_threat_valuesSoap() {
	}

	public long getPrimaryKey() {
		return _current_threat_values_id;
	}

	public void setPrimaryKey(long pk) {
		setCurrent_threat_values_id(pk);
	}

	public long getCurrent_threat_values_id() {
		return _current_threat_values_id;
	}

	public void setCurrent_threat_values_id(long current_threat_values_id) {
		_current_threat_values_id = current_threat_values_id;
	}

	public long getCurrent_threat_id() {
		return _current_threat_id;
	}

	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_id = current_threat_id;
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
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

	private long _current_threat_values_id;
	private long _current_threat_id;
	private long _whvalues_id;
	private boolean _is_biodiv_whval;
}