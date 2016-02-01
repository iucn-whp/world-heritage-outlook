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
public class assessment_statusSoap implements Serializable {
	public static assessment_statusSoap toSoapModel(assessment_status model) {
		assessment_statusSoap soapModel = new assessment_statusSoap();

		soapModel.setStatusid(model.getStatusid());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static assessment_statusSoap[] toSoapModels(
		assessment_status[] models) {
		assessment_statusSoap[] soapModels = new assessment_statusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_statusSoap[][] toSoapModels(
		assessment_status[][] models) {
		assessment_statusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_statusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_statusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_statusSoap[] toSoapModels(
		List<assessment_status> models) {
		List<assessment_statusSoap> soapModels = new ArrayList<assessment_statusSoap>(models.size());

		for (assessment_status model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_statusSoap[soapModels.size()]);
	}

	public assessment_statusSoap() {
	}

	public long getPrimaryKey() {
		return _statusid;
	}

	public void setPrimaryKey(long pk) {
		setStatusid(pk);
	}

	public long getStatusid() {
		return _statusid;
	}

	public void setStatusid(long statusid) {
		_statusid = statusid;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _statusid;
	private String _status;
}