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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.iucn.whp.dbservice.service.http.whp_site_danger_listServiceSoap}.
 *
 * @author    alok.sen
 * @see       com.iucn.whp.dbservice.service.http.whp_site_danger_listServiceSoap
 * @generated
 */
public class whp_site_danger_listSoap implements Serializable {
	public static whp_site_danger_listSoap toSoapModel(
		whp_site_danger_list model) {
		whp_site_danger_listSoap soapModel = new whp_site_danger_listSoap();

		soapModel.setWhp_site_danger_list_id(model.getWhp_site_danger_list_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setStatus_id(model.getStatus_id());
		soapModel.setYear(model.getYear());

		return soapModel;
	}

	public static whp_site_danger_listSoap[] toSoapModels(
		whp_site_danger_list[] models) {
		whp_site_danger_listSoap[] soapModels = new whp_site_danger_listSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_site_danger_listSoap[][] toSoapModels(
		whp_site_danger_list[][] models) {
		whp_site_danger_listSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_site_danger_listSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_site_danger_listSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_site_danger_listSoap[] toSoapModels(
		List<whp_site_danger_list> models) {
		List<whp_site_danger_listSoap> soapModels = new ArrayList<whp_site_danger_listSoap>(models.size());

		for (whp_site_danger_list model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_site_danger_listSoap[soapModels.size()]);
	}

	public whp_site_danger_listSoap() {
	}

	public long getPrimaryKey() {
		return _whp_site_danger_list_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_site_danger_list_id(pk);
	}

	public long getWhp_site_danger_list_id() {
		return _whp_site_danger_list_id;
	}

	public void setWhp_site_danger_list_id(long whp_site_danger_list_id) {
		_whp_site_danger_list_id = whp_site_danger_list_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getStatus_id() {
		return _status_id;
	}

	public void setStatus_id(int status_id) {
		_status_id = status_id;
	}

	public Date getYear() {
		return _year;
	}

	public void setYear(Date year) {
		_year = year;
	}

	private long _whp_site_danger_list_id;
	private long _site_id;
	private int _status_id;
	private Date _year;
}