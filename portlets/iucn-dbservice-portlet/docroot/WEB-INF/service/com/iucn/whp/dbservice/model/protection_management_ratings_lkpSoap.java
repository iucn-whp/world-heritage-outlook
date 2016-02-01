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
public class protection_management_ratings_lkpSoap implements Serializable {
	public static protection_management_ratings_lkpSoap toSoapModel(
		protection_management_ratings_lkp model) {
		protection_management_ratings_lkpSoap soapModel = new protection_management_ratings_lkpSoap();

		soapModel.setId(model.getId());
		soapModel.setPm_rating(model.getPm_rating());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static protection_management_ratings_lkpSoap[] toSoapModels(
		protection_management_ratings_lkp[] models) {
		protection_management_ratings_lkpSoap[] soapModels = new protection_management_ratings_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protection_management_ratings_lkpSoap[][] toSoapModels(
		protection_management_ratings_lkp[][] models) {
		protection_management_ratings_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protection_management_ratings_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protection_management_ratings_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protection_management_ratings_lkpSoap[] toSoapModels(
		List<protection_management_ratings_lkp> models) {
		List<protection_management_ratings_lkpSoap> soapModels = new ArrayList<protection_management_ratings_lkpSoap>(models.size());

		for (protection_management_ratings_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protection_management_ratings_lkpSoap[soapModels.size()]);
	}

	public protection_management_ratings_lkpSoap() {
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

	public String getPm_rating() {
		return _pm_rating;
	}

	public void setPm_rating(String pm_rating) {
		_pm_rating = pm_rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _pm_rating;
	private String _description;
}