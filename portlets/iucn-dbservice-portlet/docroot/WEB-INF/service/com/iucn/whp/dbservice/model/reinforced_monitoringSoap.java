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
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class reinforced_monitoringSoap implements Serializable {
	public static reinforced_monitoringSoap toSoapModel(
		reinforced_monitoring model) {
		reinforced_monitoringSoap soapModel = new reinforced_monitoringSoap();

		soapModel.setWhp_sites_reinforced_monitoring_id(model.getWhp_sites_reinforced_monitoring_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setReinforced_date(model.getReinforced_date());

		return soapModel;
	}

	public static reinforced_monitoringSoap[] toSoapModels(
		reinforced_monitoring[] models) {
		reinforced_monitoringSoap[] soapModels = new reinforced_monitoringSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static reinforced_monitoringSoap[][] toSoapModels(
		reinforced_monitoring[][] models) {
		reinforced_monitoringSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new reinforced_monitoringSoap[models.length][models[0].length];
		}
		else {
			soapModels = new reinforced_monitoringSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static reinforced_monitoringSoap[] toSoapModels(
		List<reinforced_monitoring> models) {
		List<reinforced_monitoringSoap> soapModels = new ArrayList<reinforced_monitoringSoap>(models.size());

		for (reinforced_monitoring model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new reinforced_monitoringSoap[soapModels.size()]);
	}

	public reinforced_monitoringSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_reinforced_monitoring_id(pk);
	}

	public long getWhp_sites_reinforced_monitoring_id() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setWhp_sites_reinforced_monitoring_id(
		long whp_sites_reinforced_monitoring_id) {
		_whp_sites_reinforced_monitoring_id = whp_sites_reinforced_monitoring_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public Date getReinforced_date() {
		return _reinforced_date;
	}

	public void setReinforced_date(Date reinforced_date) {
		_reinforced_date = reinforced_date;
	}

	private long _whp_sites_reinforced_monitoring_id;
	private long _site_id;
	private Date _reinforced_date;
}