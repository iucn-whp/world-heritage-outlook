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
public class flagship_species_lkpSoap implements Serializable {
	public static flagship_species_lkpSoap toSoapModel(
		flagship_species_lkp model) {
		flagship_species_lkpSoap soapModel = new flagship_species_lkpSoap();

		soapModel.setFlagship_species_id(model.getFlagship_species_id());
		soapModel.setFlagship_species_name(model.getFlagship_species_name());
		soapModel.setRedlist_url(model.getRedlist_url());

		return soapModel;
	}

	public static flagship_species_lkpSoap[] toSoapModels(
		flagship_species_lkp[] models) {
		flagship_species_lkpSoap[] soapModels = new flagship_species_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static flagship_species_lkpSoap[][] toSoapModels(
		flagship_species_lkp[][] models) {
		flagship_species_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new flagship_species_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new flagship_species_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static flagship_species_lkpSoap[] toSoapModels(
		List<flagship_species_lkp> models) {
		List<flagship_species_lkpSoap> soapModels = new ArrayList<flagship_species_lkpSoap>(models.size());

		for (flagship_species_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new flagship_species_lkpSoap[soapModels.size()]);
	}

	public flagship_species_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _flagship_species_id;
	}

	public void setPrimaryKey(int pk) {
		setFlagship_species_id(pk);
	}

	public int getFlagship_species_id() {
		return _flagship_species_id;
	}

	public void setFlagship_species_id(int flagship_species_id) {
		_flagship_species_id = flagship_species_id;
	}

	public String getFlagship_species_name() {
		return _flagship_species_name;
	}

	public void setFlagship_species_name(String flagship_species_name) {
		_flagship_species_name = flagship_species_name;
	}

	public String getRedlist_url() {
		return _redlist_url;
	}

	public void setRedlist_url(String redlist_url) {
		_redlist_url = redlist_url;
	}

	private int _flagship_species_id;
	private String _flagship_species_name;
	private String _redlist_url;
}