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
public class assessment_stagesSoap implements Serializable {
	public static assessment_stagesSoap toSoapModel(assessment_stages model) {
		assessment_stagesSoap soapModel = new assessment_stagesSoap();

		soapModel.setStageid(model.getStageid());
		soapModel.setStage(model.getStage());

		return soapModel;
	}

	public static assessment_stagesSoap[] toSoapModels(
		assessment_stages[] models) {
		assessment_stagesSoap[] soapModels = new assessment_stagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_stagesSoap[][] toSoapModels(
		assessment_stages[][] models) {
		assessment_stagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_stagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_stagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_stagesSoap[] toSoapModels(
		List<assessment_stages> models) {
		List<assessment_stagesSoap> soapModels = new ArrayList<assessment_stagesSoap>(models.size());

		for (assessment_stages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_stagesSoap[soapModels.size()]);
	}

	public assessment_stagesSoap() {
	}

	public long getPrimaryKey() {
		return _stageid;
	}

	public void setPrimaryKey(long pk) {
		setStageid(pk);
	}

	public long getStageid() {
		return _stageid;
	}

	public void setStageid(long stageid) {
		_stageid = stageid;
	}

	public String getStage() {
		return _stage;
	}

	public void setStage(String stage) {
		_stage = stage;
	}

	private long _stageid;
	private String _stage;
}