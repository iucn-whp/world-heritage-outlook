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
public class country_lkpSoap implements Serializable {
	public static country_lkpSoap toSoapModel(country_lkp model) {
		country_lkpSoap soapModel = new country_lkpSoap();

		soapModel.setCountryid(model.getCountryid());
		soapModel.setName(model.getName());
		soapModel.setA2(model.getA2());
		soapModel.setA3(model.getA3());
		soapModel.setNumber(model.getNumber());
		soapModel.setIdd(model.getIdd());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setZiprequired(model.getZiprequired());
		soapModel.setActive(model.getActive());

		return soapModel;
	}

	public static country_lkpSoap[] toSoapModels(country_lkp[] models) {
		country_lkpSoap[] soapModels = new country_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static country_lkpSoap[][] toSoapModels(country_lkp[][] models) {
		country_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new country_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new country_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static country_lkpSoap[] toSoapModels(List<country_lkp> models) {
		List<country_lkpSoap> soapModels = new ArrayList<country_lkpSoap>(models.size());

		for (country_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new country_lkpSoap[soapModels.size()]);
	}

	public country_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _countryid;
	}

	public void setPrimaryKey(int pk) {
		setCountryid(pk);
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getA2() {
		return _a2;
	}

	public void setA2(String a2) {
		_a2 = a2;
	}

	public String getA3() {
		return _a3;
	}

	public void setA3(String a3) {
		_a3 = a3;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;
	}

	public String getIdd() {
		return _idd;
	}

	public void setIdd(String idd) {
		_idd = idd;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public boolean getZiprequired() {
		return _ziprequired;
	}

	public boolean isZiprequired() {
		return _ziprequired;
	}

	public void setZiprequired(boolean ziprequired) {
		_ziprequired = ziprequired;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	private int _countryid;
	private String _name;
	private String _a2;
	private String _a3;
	private String _number;
	private String _idd;
	private String _currency;
	private boolean _ziprequired;
	private boolean _active;
}