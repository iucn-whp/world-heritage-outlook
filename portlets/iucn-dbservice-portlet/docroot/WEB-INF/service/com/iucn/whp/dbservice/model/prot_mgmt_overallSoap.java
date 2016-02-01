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
public class prot_mgmt_overallSoap implements Serializable {
	public static prot_mgmt_overallSoap toSoapModel(prot_mgmt_overall model) {
		prot_mgmt_overallSoap soapModel = new prot_mgmt_overallSoap();

		soapModel.setPmo_id(model.getPmo_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setRating(model.getRating());

		return soapModel;
	}

	public static prot_mgmt_overallSoap[] toSoapModels(
		prot_mgmt_overall[] models) {
		prot_mgmt_overallSoap[] soapModels = new prot_mgmt_overallSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static prot_mgmt_overallSoap[][] toSoapModels(
		prot_mgmt_overall[][] models) {
		prot_mgmt_overallSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new prot_mgmt_overallSoap[models.length][models[0].length];
		}
		else {
			soapModels = new prot_mgmt_overallSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static prot_mgmt_overallSoap[] toSoapModels(
		List<prot_mgmt_overall> models) {
		List<prot_mgmt_overallSoap> soapModels = new ArrayList<prot_mgmt_overallSoap>(models.size());

		for (prot_mgmt_overall model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new prot_mgmt_overallSoap[soapModels.size()]);
	}

	public prot_mgmt_overallSoap() {
	}

	public long getPrimaryKey() {
		return _pmo_id;
	}

	public void setPrimaryKey(long pk) {
		setPmo_id(pk);
	}

	public long getPmo_id() {
		return _pmo_id;
	}

	public void setPmo_id(long pmo_id) {
		_pmo_id = pmo_id;
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

	private long _pmo_id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
}