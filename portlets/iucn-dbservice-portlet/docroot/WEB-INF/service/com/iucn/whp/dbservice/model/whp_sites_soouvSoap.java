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
public class whp_sites_soouvSoap implements Serializable {
	public static whp_sites_soouvSoap toSoapModel(whp_sites_soouv model) {
		whp_sites_soouvSoap soapModel = new whp_sites_soouvSoap();

		soapModel.setWhp_sites_soouv_id(model.getWhp_sites_soouv_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setDescription_en(model.getDescription_en());
		soapModel.setDescription_fr(model.getDescription_fr());
		soapModel.setSoouv_date(model.getSoouv_date());

		return soapModel;
	}

	public static whp_sites_soouvSoap[] toSoapModels(whp_sites_soouv[] models) {
		whp_sites_soouvSoap[] soapModels = new whp_sites_soouvSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_soouvSoap[][] toSoapModels(
		whp_sites_soouv[][] models) {
		whp_sites_soouvSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_soouvSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_soouvSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_soouvSoap[] toSoapModels(
		List<whp_sites_soouv> models) {
		List<whp_sites_soouvSoap> soapModels = new ArrayList<whp_sites_soouvSoap>(models.size());

		for (whp_sites_soouv model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_soouvSoap[soapModels.size()]);
	}

	public whp_sites_soouvSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_soouv_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_soouv_id(pk);
	}

	public long getWhp_sites_soouv_id() {
		return _whp_sites_soouv_id;
	}

	public void setWhp_sites_soouv_id(long whp_sites_soouv_id) {
		_whp_sites_soouv_id = whp_sites_soouv_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getDescription_en() {
		return _description_en;
	}

	public void setDescription_en(String description_en) {
		_description_en = description_en;
	}

	public String getDescription_fr() {
		return _description_fr;
	}

	public void setDescription_fr(String description_fr) {
		_description_fr = description_fr;
	}

	public Date getSoouv_date() {
		return _soouv_date;
	}

	public void setSoouv_date(Date soouv_date) {
		_soouv_date = soouv_date;
	}

	private long _whp_sites_soouv_id;
	private long _site_id;
	private String _description_en;
	private String _description_fr;
	private Date _soouv_date;
}