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
public class whp_sites_inscription_dateSoap implements Serializable {
	public static whp_sites_inscription_dateSoap toSoapModel(
		whp_sites_inscription_date model) {
		whp_sites_inscription_dateSoap soapModel = new whp_sites_inscription_dateSoap();

		soapModel.setWhp_sites_inscription_date_id(model.getWhp_sites_inscription_date_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setInscription_type_id(model.getInscription_type_id());
		soapModel.setReference_no(model.getReference_no());
		soapModel.setInscription_date(model.getInscription_date());

		return soapModel;
	}

	public static whp_sites_inscription_dateSoap[] toSoapModels(
		whp_sites_inscription_date[] models) {
		whp_sites_inscription_dateSoap[] soapModels = new whp_sites_inscription_dateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_inscription_dateSoap[][] toSoapModels(
		whp_sites_inscription_date[][] models) {
		whp_sites_inscription_dateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_inscription_dateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_inscription_dateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_inscription_dateSoap[] toSoapModels(
		List<whp_sites_inscription_date> models) {
		List<whp_sites_inscription_dateSoap> soapModels = new ArrayList<whp_sites_inscription_dateSoap>(models.size());

		for (whp_sites_inscription_date model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_inscription_dateSoap[soapModels.size()]);
	}

	public whp_sites_inscription_dateSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_inscription_date_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_inscription_date_id(pk);
	}

	public long getWhp_sites_inscription_date_id() {
		return _whp_sites_inscription_date_id;
	}

	public void setWhp_sites_inscription_date_id(
		long whp_sites_inscription_date_id) {
		_whp_sites_inscription_date_id = whp_sites_inscription_date_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getInscription_type_id() {
		return _inscription_type_id;
	}

	public void setInscription_type_id(int inscription_type_id) {
		_inscription_type_id = inscription_type_id;
	}

	public String getReference_no() {
		return _reference_no;
	}

	public void setReference_no(String reference_no) {
		_reference_no = reference_no;
	}

	public Date getInscription_date() {
		return _inscription_date;
	}

	public void setInscription_date(Date inscription_date) {
		_inscription_date = inscription_date;
	}

	private long _whp_sites_inscription_date_id;
	private long _site_id;
	private int _inscription_type_id;
	private String _reference_no;
	private Date _inscription_date;
}