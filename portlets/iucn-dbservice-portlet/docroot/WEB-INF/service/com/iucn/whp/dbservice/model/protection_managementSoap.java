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
public class protection_managementSoap implements Serializable {
	public static protection_managementSoap toSoapModel(
		protection_management model) {
		protection_managementSoap soapModel = new protection_managementSoap();

		soapModel.setPm_id(model.getPm_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setTopic_id(model.getTopic_id());
		soapModel.setJustification(model.getJustification());
		soapModel.setRating(model.getRating());

		return soapModel;
	}

	public static protection_managementSoap[] toSoapModels(
		protection_management[] models) {
		protection_managementSoap[] soapModels = new protection_managementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protection_managementSoap[][] toSoapModels(
		protection_management[][] models) {
		protection_managementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protection_managementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protection_managementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protection_managementSoap[] toSoapModels(
		List<protection_management> models) {
		List<protection_managementSoap> soapModels = new ArrayList<protection_managementSoap>(models.size());

		for (protection_management model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protection_managementSoap[soapModels.size()]);
	}

	public protection_managementSoap() {
	}

	public long getPrimaryKey() {
		return _pm_id;
	}

	public void setPrimaryKey(long pk) {
		setPm_id(pk);
	}

	public long getPm_id() {
		return _pm_id;
	}

	public void setPm_id(long pm_id) {
		_pm_id = pm_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getTopic_id() {
		return _topic_id;
	}

	public void setTopic_id(long topic_id) {
		_topic_id = topic_id;
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

	private long _pm_id;
	private long _assessment_version_id;
	private long _topic_id;
	private String _justification;
	private long _rating;
}