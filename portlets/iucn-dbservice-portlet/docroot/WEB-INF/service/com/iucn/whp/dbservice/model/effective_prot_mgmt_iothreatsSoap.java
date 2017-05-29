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
public class effective_prot_mgmt_iothreatsSoap implements Serializable {
	public static effective_prot_mgmt_iothreatsSoap toSoapModel(
		effective_prot_mgmt_iothreats model) {
		effective_prot_mgmt_iothreatsSoap soapModel = new effective_prot_mgmt_iothreatsSoap();

		soapModel.setId(model.getId());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setRating(model.getRating());

		return soapModel;
	}

	public static effective_prot_mgmt_iothreatsSoap[] toSoapModels(
		effective_prot_mgmt_iothreats[] models) {
		effective_prot_mgmt_iothreatsSoap[] soapModels = new effective_prot_mgmt_iothreatsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static effective_prot_mgmt_iothreatsSoap[][] toSoapModels(
		effective_prot_mgmt_iothreats[][] models) {
		effective_prot_mgmt_iothreatsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new effective_prot_mgmt_iothreatsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new effective_prot_mgmt_iothreatsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static effective_prot_mgmt_iothreatsSoap[] toSoapModels(
		List<effective_prot_mgmt_iothreats> models) {
		List<effective_prot_mgmt_iothreatsSoap> soapModels = new ArrayList<effective_prot_mgmt_iothreatsSoap>(models.size());

		for (effective_prot_mgmt_iothreats model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new effective_prot_mgmt_iothreatsSoap[soapModels.size()]);
	}

	public effective_prot_mgmt_iothreatsSoap() {
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

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getRating() {
		return _rating;
	}

	public void setRating(long rating) {
		_rating = rating;
	}

	private long _id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
}