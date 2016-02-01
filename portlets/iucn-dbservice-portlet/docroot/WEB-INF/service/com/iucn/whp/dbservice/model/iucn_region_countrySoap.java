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
public class iucn_region_countrySoap implements Serializable {
	public static iucn_region_countrySoap toSoapModel(iucn_region_country model) {
		iucn_region_countrySoap soapModel = new iucn_region_countrySoap();

		soapModel.setWhp_iucn_region_country_id(model.getWhp_iucn_region_country_id());
		soapModel.setCountryid(model.getCountryid());
		soapModel.setIucn_region_id(model.getIucn_region_id());

		return soapModel;
	}

	public static iucn_region_countrySoap[] toSoapModels(
		iucn_region_country[] models) {
		iucn_region_countrySoap[] soapModels = new iucn_region_countrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static iucn_region_countrySoap[][] toSoapModels(
		iucn_region_country[][] models) {
		iucn_region_countrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new iucn_region_countrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new iucn_region_countrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static iucn_region_countrySoap[] toSoapModels(
		List<iucn_region_country> models) {
		List<iucn_region_countrySoap> soapModels = new ArrayList<iucn_region_countrySoap>(models.size());

		for (iucn_region_country model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new iucn_region_countrySoap[soapModels.size()]);
	}

	public iucn_region_countrySoap() {
	}

	public int getPrimaryKey() {
		return _whp_iucn_region_country_id;
	}

	public void setPrimaryKey(int pk) {
		setWhp_iucn_region_country_id(pk);
	}

	public int getWhp_iucn_region_country_id() {
		return _whp_iucn_region_country_id;
	}

	public void setWhp_iucn_region_country_id(int whp_iucn_region_country_id) {
		_whp_iucn_region_country_id = whp_iucn_region_country_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public int getIucn_region_id() {
		return _iucn_region_id;
	}

	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region_id = iucn_region_id;
	}

	private int _whp_iucn_region_country_id;
	private int _countryid;
	private int _iucn_region_id;
}