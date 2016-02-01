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
public class mission_lkpSoap implements Serializable {
	public static mission_lkpSoap toSoapModel(mission_lkp model) {
		mission_lkpSoap soapModel = new mission_lkpSoap();

		soapModel.setMission_id(model.getMission_id());
		soapModel.setMission_type(model.getMission_type());

		return soapModel;
	}

	public static mission_lkpSoap[] toSoapModels(mission_lkp[] models) {
		mission_lkpSoap[] soapModels = new mission_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static mission_lkpSoap[][] toSoapModels(mission_lkp[][] models) {
		mission_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new mission_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new mission_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static mission_lkpSoap[] toSoapModels(List<mission_lkp> models) {
		List<mission_lkpSoap> soapModels = new ArrayList<mission_lkpSoap>(models.size());

		for (mission_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new mission_lkpSoap[soapModels.size()]);
	}

	public mission_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _mission_id;
	}

	public void setPrimaryKey(int pk) {
		setMission_id(pk);
	}

	public int getMission_id() {
		return _mission_id;
	}

	public void setMission_id(int mission_id) {
		_mission_id = mission_id;
	}

	public String getMission_type() {
		return _mission_type;
	}

	public void setMission_type(String mission_type) {
		_mission_type = mission_type;
	}

	private int _mission_id;
	private String _mission_type;
}