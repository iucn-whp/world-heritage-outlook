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
public class whp_sites_dsocrSoap implements Serializable {
	public static whp_sites_dsocrSoap toSoapModel(whp_sites_dsocr model) {
		whp_sites_dsocrSoap soapModel = new whp_sites_dsocrSoap();

		soapModel.setWhp_sites_dsocr_id(model.getWhp_sites_dsocr_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setState_description(model.getState_description());
		soapModel.setDsocr_date(model.getDsocr_date());

		return soapModel;
	}

	public static whp_sites_dsocrSoap[] toSoapModels(whp_sites_dsocr[] models) {
		whp_sites_dsocrSoap[] soapModels = new whp_sites_dsocrSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_dsocrSoap[][] toSoapModels(
		whp_sites_dsocr[][] models) {
		whp_sites_dsocrSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_dsocrSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_dsocrSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_dsocrSoap[] toSoapModels(
		List<whp_sites_dsocr> models) {
		List<whp_sites_dsocrSoap> soapModels = new ArrayList<whp_sites_dsocrSoap>(models.size());

		for (whp_sites_dsocr model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_dsocrSoap[soapModels.size()]);
	}

	public whp_sites_dsocrSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_dsocr_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_dsocr_id(pk);
	}

	public long getWhp_sites_dsocr_id() {
		return _whp_sites_dsocr_id;
	}

	public void setWhp_sites_dsocr_id(long whp_sites_dsocr_id) {
		_whp_sites_dsocr_id = whp_sites_dsocr_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getState_description() {
		return _state_description;
	}

	public void setState_description(String state_description) {
		_state_description = state_description;
	}

	public Date getDsocr_date() {
		return _dsocr_date;
	}

	public void setDsocr_date(Date dsocr_date) {
		_dsocr_date = dsocr_date;
	}

	private long _whp_sites_dsocr_id;
	private long _site_id;
	private String _state_description;
	private Date _dsocr_date;
}