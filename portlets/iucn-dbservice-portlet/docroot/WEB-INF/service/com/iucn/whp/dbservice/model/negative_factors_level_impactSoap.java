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
public class negative_factors_level_impactSoap implements Serializable {
	public static negative_factors_level_impactSoap toSoapModel(
		negative_factors_level_impact model) {
		negative_factors_level_impactSoap soapModel = new negative_factors_level_impactSoap();

		soapModel.setLevel_id(model.getLevel_id());
		soapModel.setLevel_impact(model.getLevel_impact());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static negative_factors_level_impactSoap[] toSoapModels(
		negative_factors_level_impact[] models) {
		negative_factors_level_impactSoap[] soapModels = new negative_factors_level_impactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static negative_factors_level_impactSoap[][] toSoapModels(
		negative_factors_level_impact[][] models) {
		negative_factors_level_impactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new negative_factors_level_impactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new negative_factors_level_impactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static negative_factors_level_impactSoap[] toSoapModels(
		List<negative_factors_level_impact> models) {
		List<negative_factors_level_impactSoap> soapModels = new ArrayList<negative_factors_level_impactSoap>(models.size());

		for (negative_factors_level_impact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new negative_factors_level_impactSoap[soapModels.size()]);
	}

	public negative_factors_level_impactSoap() {
	}

	public long getPrimaryKey() {
		return _level_id;
	}

	public void setPrimaryKey(long pk) {
		setLevel_id(pk);
	}

	public long getLevel_id() {
		return _level_id;
	}

	public void setLevel_id(long level_id) {
		_level_id = level_id;
	}

	public String getLevel_impact() {
		return _level_impact;
	}

	public void setLevel_impact(String level_impact) {
		_level_impact = level_impact;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _level_id;
	private String _level_impact;
	private String _description;
}