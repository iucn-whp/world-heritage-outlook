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
public class inscription_type_lkpSoap implements Serializable {
	public static inscription_type_lkpSoap toSoapModel(
		inscription_type_lkp model) {
		inscription_type_lkpSoap soapModel = new inscription_type_lkpSoap();

		soapModel.setIncription_type_id(model.getIncription_type_id());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static inscription_type_lkpSoap[] toSoapModels(
		inscription_type_lkp[] models) {
		inscription_type_lkpSoap[] soapModels = new inscription_type_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static inscription_type_lkpSoap[][] toSoapModels(
		inscription_type_lkp[][] models) {
		inscription_type_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new inscription_type_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new inscription_type_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static inscription_type_lkpSoap[] toSoapModels(
		List<inscription_type_lkp> models) {
		List<inscription_type_lkpSoap> soapModels = new ArrayList<inscription_type_lkpSoap>(models.size());

		for (inscription_type_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new inscription_type_lkpSoap[soapModels.size()]);
	}

	public inscription_type_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _incription_type_id;
	}

	public void setPrimaryKey(int pk) {
		setIncription_type_id(pk);
	}

	public int getIncription_type_id() {
		return _incription_type_id;
	}

	public void setIncription_type_id(int incription_type_id) {
		_incription_type_id = incription_type_id;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private int _incription_type_id;
	private String _type;
}