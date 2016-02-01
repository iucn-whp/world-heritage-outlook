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
public class whp_sites_countrySoap implements Serializable {
	public static whp_sites_countrySoap toSoapModel(whp_sites_country model) {
		whp_sites_countrySoap soapModel = new whp_sites_countrySoap();

		soapModel.setWhp_sites_country_id(model.getWhp_sites_country_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setCountryid(model.getCountryid());

		return soapModel;
	}

	public static whp_sites_countrySoap[] toSoapModels(
		whp_sites_country[] models) {
		whp_sites_countrySoap[] soapModels = new whp_sites_countrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_countrySoap[][] toSoapModels(
		whp_sites_country[][] models) {
		whp_sites_countrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_countrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_countrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_countrySoap[] toSoapModels(
		List<whp_sites_country> models) {
		List<whp_sites_countrySoap> soapModels = new ArrayList<whp_sites_countrySoap>(models.size());

		for (whp_sites_country model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_countrySoap[soapModels.size()]);
	}

	public whp_sites_countrySoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_country_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_country_id(pk);
	}

	public long getWhp_sites_country_id() {
		return _whp_sites_country_id;
	}

	public void setWhp_sites_country_id(long whp_sites_country_id) {
		_whp_sites_country_id = whp_sites_country_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	private long _whp_sites_country_id;
	private long _site_id;
	private int _countryid;
}