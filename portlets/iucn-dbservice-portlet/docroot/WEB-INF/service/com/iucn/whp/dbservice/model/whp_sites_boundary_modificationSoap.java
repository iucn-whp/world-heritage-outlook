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
public class whp_sites_boundary_modificationSoap implements Serializable {
	public static whp_sites_boundary_modificationSoap toSoapModel(
		whp_sites_boundary_modification model) {
		whp_sites_boundary_modificationSoap soapModel = new whp_sites_boundary_modificationSoap();

		soapModel.setWhp_sites_boundary_modification_id(model.getWhp_sites_boundary_modification_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setBmid(model.getBmid());
		soapModel.setDescription(model.getDescription());
		soapModel.setMod_date(model.getMod_date());

		return soapModel;
	}

	public static whp_sites_boundary_modificationSoap[] toSoapModels(
		whp_sites_boundary_modification[] models) {
		whp_sites_boundary_modificationSoap[] soapModels = new whp_sites_boundary_modificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_boundary_modificationSoap[][] toSoapModels(
		whp_sites_boundary_modification[][] models) {
		whp_sites_boundary_modificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_boundary_modificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_boundary_modificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_boundary_modificationSoap[] toSoapModels(
		List<whp_sites_boundary_modification> models) {
		List<whp_sites_boundary_modificationSoap> soapModels = new ArrayList<whp_sites_boundary_modificationSoap>(models.size());

		for (whp_sites_boundary_modification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_boundary_modificationSoap[soapModels.size()]);
	}

	public whp_sites_boundary_modificationSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_boundary_modification_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_boundary_modification_id(pk);
	}

	public long getWhp_sites_boundary_modification_id() {
		return _whp_sites_boundary_modification_id;
	}

	public void setWhp_sites_boundary_modification_id(
		long whp_sites_boundary_modification_id) {
		_whp_sites_boundary_modification_id = whp_sites_boundary_modification_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getBmid() {
		return _bmid;
	}

	public void setBmid(int bmid) {
		_bmid = bmid;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getMod_date() {
		return _mod_date;
	}

	public void setMod_date(Date mod_date) {
		_mod_date = mod_date;
	}

	private long _whp_sites_boundary_modification_id;
	private long _site_id;
	private int _bmid;
	private String _description;
	private Date _mod_date;
}