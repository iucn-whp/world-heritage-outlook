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
public class negative_factors_trendSoap implements Serializable {
	public static negative_factors_trendSoap toSoapModel(
		negative_factors_trend model) {
		negative_factors_trendSoap soapModel = new negative_factors_trendSoap();

		soapModel.setTrend_id(model.getTrend_id());
		soapModel.setTrend(model.getTrend());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static negative_factors_trendSoap[] toSoapModels(
		negative_factors_trend[] models) {
		negative_factors_trendSoap[] soapModels = new negative_factors_trendSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static negative_factors_trendSoap[][] toSoapModels(
		negative_factors_trend[][] models) {
		negative_factors_trendSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new negative_factors_trendSoap[models.length][models[0].length];
		}
		else {
			soapModels = new negative_factors_trendSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static negative_factors_trendSoap[] toSoapModels(
		List<negative_factors_trend> models) {
		List<negative_factors_trendSoap> soapModels = new ArrayList<negative_factors_trendSoap>(models.size());

		for (negative_factors_trend model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new negative_factors_trendSoap[soapModels.size()]);
	}

	public negative_factors_trendSoap() {
	}

	public long getPrimaryKey() {
		return _trend_id;
	}

	public void setPrimaryKey(long pk) {
		setTrend_id(pk);
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	public String getTrend() {
		return _trend;
	}

	public void setTrend(String trend) {
		_trend = trend;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _trend_id;
	private String _trend;
	private String _description;
}