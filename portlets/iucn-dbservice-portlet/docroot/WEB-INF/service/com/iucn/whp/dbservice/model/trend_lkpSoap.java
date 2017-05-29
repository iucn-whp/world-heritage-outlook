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
public class trend_lkpSoap implements Serializable {
	public static trend_lkpSoap toSoapModel(trend_lkp model) {
		trend_lkpSoap soapModel = new trend_lkpSoap();

		soapModel.setTrend_id(model.getTrend_id());
		soapModel.setTrend(model.getTrend());

		return soapModel;
	}

	public static trend_lkpSoap[] toSoapModels(trend_lkp[] models) {
		trend_lkpSoap[] soapModels = new trend_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trend_lkpSoap[][] toSoapModels(trend_lkp[][] models) {
		trend_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trend_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trend_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trend_lkpSoap[] toSoapModels(List<trend_lkp> models) {
		List<trend_lkpSoap> soapModels = new ArrayList<trend_lkpSoap>(models.size());

		for (trend_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trend_lkpSoap[soapModels.size()]);
	}

	public trend_lkpSoap() {
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

	private long _trend_id;
	private String _trend;
}