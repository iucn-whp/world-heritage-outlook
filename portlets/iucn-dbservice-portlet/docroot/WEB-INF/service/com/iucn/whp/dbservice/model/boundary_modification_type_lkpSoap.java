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
public class boundary_modification_type_lkpSoap implements Serializable {
	public static boundary_modification_type_lkpSoap toSoapModel(
		boundary_modification_type_lkp model) {
		boundary_modification_type_lkpSoap soapModel = new boundary_modification_type_lkpSoap();

		soapModel.setBm_id(model.getBm_id());
		soapModel.setBm_type(model.getBm_type());

		return soapModel;
	}

	public static boundary_modification_type_lkpSoap[] toSoapModels(
		boundary_modification_type_lkp[] models) {
		boundary_modification_type_lkpSoap[] soapModels = new boundary_modification_type_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static boundary_modification_type_lkpSoap[][] toSoapModels(
		boundary_modification_type_lkp[][] models) {
		boundary_modification_type_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new boundary_modification_type_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new boundary_modification_type_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static boundary_modification_type_lkpSoap[] toSoapModels(
		List<boundary_modification_type_lkp> models) {
		List<boundary_modification_type_lkpSoap> soapModels = new ArrayList<boundary_modification_type_lkpSoap>(models.size());

		for (boundary_modification_type_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new boundary_modification_type_lkpSoap[soapModels.size()]);
	}

	public boundary_modification_type_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _bm_id;
	}

	public void setPrimaryKey(int pk) {
		setBm_id(pk);
	}

	public int getBm_id() {
		return _bm_id;
	}

	public void setBm_id(int bm_id) {
		_bm_id = bm_id;
	}

	public String getBm_type() {
		return _bm_type;
	}

	public void setBm_type(String bm_type) {
		_bm_type = bm_type;
	}

	private int _bm_id;
	private String _bm_type;
}