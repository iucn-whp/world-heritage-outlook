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
public class danger_list_status_lkpSoap implements Serializable {
	public static danger_list_status_lkpSoap toSoapModel(
		danger_list_status_lkp model) {
		danger_list_status_lkpSoap soapModel = new danger_list_status_lkpSoap();

		soapModel.setDlstatus_id(model.getDlstatus_id());
		soapModel.setDl_status(model.getDl_status());

		return soapModel;
	}

	public static danger_list_status_lkpSoap[] toSoapModels(
		danger_list_status_lkp[] models) {
		danger_list_status_lkpSoap[] soapModels = new danger_list_status_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static danger_list_status_lkpSoap[][] toSoapModels(
		danger_list_status_lkp[][] models) {
		danger_list_status_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new danger_list_status_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new danger_list_status_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static danger_list_status_lkpSoap[] toSoapModels(
		List<danger_list_status_lkp> models) {
		List<danger_list_status_lkpSoap> soapModels = new ArrayList<danger_list_status_lkpSoap>(models.size());

		for (danger_list_status_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new danger_list_status_lkpSoap[soapModels.size()]);
	}

	public danger_list_status_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _dlstatus_id;
	}

	public void setPrimaryKey(int pk) {
		setDlstatus_id(pk);
	}

	public int getDlstatus_id() {
		return _dlstatus_id;
	}

	public void setDlstatus_id(int dlstatus_id) {
		_dlstatus_id = dlstatus_id;
	}

	public String getDl_status() {
		return _dl_status;
	}

	public void setDl_status(String dl_status) {
		_dl_status = dl_status;
	}

	private int _dlstatus_id;
	private String _dl_status;
}