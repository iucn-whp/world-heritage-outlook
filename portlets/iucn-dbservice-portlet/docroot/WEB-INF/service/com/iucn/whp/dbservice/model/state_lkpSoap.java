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
public class state_lkpSoap implements Serializable {
	public static state_lkpSoap toSoapModel(state_lkp model) {
		state_lkpSoap soapModel = new state_lkpSoap();

		soapModel.setState_id(model.getState_id());
		soapModel.setState(model.getState());

		return soapModel;
	}

	public static state_lkpSoap[] toSoapModels(state_lkp[] models) {
		state_lkpSoap[] soapModels = new state_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static state_lkpSoap[][] toSoapModels(state_lkp[][] models) {
		state_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new state_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new state_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static state_lkpSoap[] toSoapModels(List<state_lkp> models) {
		List<state_lkpSoap> soapModels = new ArrayList<state_lkpSoap>(models.size());

		for (state_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new state_lkpSoap[soapModels.size()]);
	}

	public state_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _state_id;
	}

	public void setPrimaryKey(long pk) {
		setState_id(pk);
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	private long _state_id;
	private String _state;
}