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
public class key_conservation_scale_lkpSoap implements Serializable {
	public static key_conservation_scale_lkpSoap toSoapModel(
		key_conservation_scale_lkp model) {
		key_conservation_scale_lkpSoap soapModel = new key_conservation_scale_lkpSoap();

		soapModel.setScale_id(model.getScale_id());
		soapModel.setScale(model.getScale());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static key_conservation_scale_lkpSoap[] toSoapModels(
		key_conservation_scale_lkp[] models) {
		key_conservation_scale_lkpSoap[] soapModels = new key_conservation_scale_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static key_conservation_scale_lkpSoap[][] toSoapModels(
		key_conservation_scale_lkp[][] models) {
		key_conservation_scale_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new key_conservation_scale_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new key_conservation_scale_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static key_conservation_scale_lkpSoap[] toSoapModels(
		List<key_conservation_scale_lkp> models) {
		List<key_conservation_scale_lkpSoap> soapModels = new ArrayList<key_conservation_scale_lkpSoap>(models.size());

		for (key_conservation_scale_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new key_conservation_scale_lkpSoap[soapModels.size()]);
	}

	public key_conservation_scale_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _scale_id;
	}

	public void setPrimaryKey(long pk) {
		setScale_id(pk);
	}

	public long getScale_id() {
		return _scale_id;
	}

	public void setScale_id(long scale_id) {
		_scale_id = scale_id;
	}

	public String getScale() {
		return _scale;
	}

	public void setScale(String scale) {
		_scale = scale;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _scale_id;
	private String _scale;
	private String _description;
}