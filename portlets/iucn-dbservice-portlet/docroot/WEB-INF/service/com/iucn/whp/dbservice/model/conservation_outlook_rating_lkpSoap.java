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
public class conservation_outlook_rating_lkpSoap implements Serializable {
	public static conservation_outlook_rating_lkpSoap toSoapModel(
		conservation_outlook_rating_lkp model) {
		conservation_outlook_rating_lkpSoap soapModel = new conservation_outlook_rating_lkpSoap();

		soapModel.setCo_rating_id(model.getCo_rating_id());
		soapModel.setCo_rating(model.getCo_rating());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static conservation_outlook_rating_lkpSoap[] toSoapModels(
		conservation_outlook_rating_lkp[] models) {
		conservation_outlook_rating_lkpSoap[] soapModels = new conservation_outlook_rating_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static conservation_outlook_rating_lkpSoap[][] toSoapModels(
		conservation_outlook_rating_lkp[][] models) {
		conservation_outlook_rating_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new conservation_outlook_rating_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new conservation_outlook_rating_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static conservation_outlook_rating_lkpSoap[] toSoapModels(
		List<conservation_outlook_rating_lkp> models) {
		List<conservation_outlook_rating_lkpSoap> soapModels = new ArrayList<conservation_outlook_rating_lkpSoap>(models.size());

		for (conservation_outlook_rating_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new conservation_outlook_rating_lkpSoap[soapModels.size()]);
	}

	public conservation_outlook_rating_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _co_rating_id;
	}

	public void setPrimaryKey(long pk) {
		setCo_rating_id(pk);
	}

	public long getCo_rating_id() {
		return _co_rating_id;
	}

	public void setCo_rating_id(long co_rating_id) {
		_co_rating_id = co_rating_id;
	}

	public String getCo_rating() {
		return _co_rating;
	}

	public void setCo_rating(String co_rating) {
		_co_rating = co_rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _co_rating_id;
	private String _co_rating;
	private String _description;
}