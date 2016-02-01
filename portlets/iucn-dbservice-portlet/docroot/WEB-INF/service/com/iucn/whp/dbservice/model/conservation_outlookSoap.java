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
public class conservation_outlookSoap implements Serializable {
	public static conservation_outlookSoap toSoapModel(
		conservation_outlook model) {
		conservation_outlookSoap soapModel = new conservation_outlookSoap();

		soapModel.setConservation_outlook_id(model.getConservation_outlook_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setRating(model.getRating());

		return soapModel;
	}

	public static conservation_outlookSoap[] toSoapModels(
		conservation_outlook[] models) {
		conservation_outlookSoap[] soapModels = new conservation_outlookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static conservation_outlookSoap[][] toSoapModels(
		conservation_outlook[][] models) {
		conservation_outlookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new conservation_outlookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new conservation_outlookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static conservation_outlookSoap[] toSoapModels(
		List<conservation_outlook> models) {
		List<conservation_outlookSoap> soapModels = new ArrayList<conservation_outlookSoap>(models.size());

		for (conservation_outlook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new conservation_outlookSoap[soapModels.size()]);
	}

	public conservation_outlookSoap() {
	}

	public long getPrimaryKey() {
		return _conservation_outlook_id;
	}

	public void setPrimaryKey(long pk) {
		setConservation_outlook_id(pk);
	}

	public long getConservation_outlook_id() {
		return _conservation_outlook_id;
	}

	public void setConservation_outlook_id(long conservation_outlook_id) {
		_conservation_outlook_id = conservation_outlook_id;
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

	private long _conservation_outlook_id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
}