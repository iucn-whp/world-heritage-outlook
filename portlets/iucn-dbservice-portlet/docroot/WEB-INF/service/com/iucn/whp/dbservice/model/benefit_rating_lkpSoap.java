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
public class benefit_rating_lkpSoap implements Serializable {
	public static benefit_rating_lkpSoap toSoapModel(benefit_rating_lkp model) {
		benefit_rating_lkpSoap soapModel = new benefit_rating_lkpSoap();

		soapModel.setId(model.getId());
		soapModel.setRating(model.getRating());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static benefit_rating_lkpSoap[] toSoapModels(
		benefit_rating_lkp[] models) {
		benefit_rating_lkpSoap[] soapModels = new benefit_rating_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefit_rating_lkpSoap[][] toSoapModels(
		benefit_rating_lkp[][] models) {
		benefit_rating_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefit_rating_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefit_rating_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefit_rating_lkpSoap[] toSoapModels(
		List<benefit_rating_lkp> models) {
		List<benefit_rating_lkpSoap> soapModels = new ArrayList<benefit_rating_lkpSoap>(models.size());

		for (benefit_rating_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefit_rating_lkpSoap[soapModels.size()]);
	}

	public benefit_rating_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getRating() {
		return _rating;
	}

	public void setRating(String rating) {
		_rating = rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _rating;
	private String _description;
}