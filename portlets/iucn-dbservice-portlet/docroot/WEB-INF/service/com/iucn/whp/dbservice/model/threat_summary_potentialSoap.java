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
public class threat_summary_potentialSoap implements Serializable {
	public static threat_summary_potentialSoap toSoapModel(
		threat_summary_potential model) {
		threat_summary_potentialSoap soapModel = new threat_summary_potentialSoap();

		soapModel.setThreat_sum_potential_id(model.getThreat_sum_potential_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setOverall_potential(model.getOverall_potential());
		soapModel.setThreat_rating(model.getThreat_rating());

		return soapModel;
	}

	public static threat_summary_potentialSoap[] toSoapModels(
		threat_summary_potential[] models) {
		threat_summary_potentialSoap[] soapModels = new threat_summary_potentialSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static threat_summary_potentialSoap[][] toSoapModels(
		threat_summary_potential[][] models) {
		threat_summary_potentialSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new threat_summary_potentialSoap[models.length][models[0].length];
		}
		else {
			soapModels = new threat_summary_potentialSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static threat_summary_potentialSoap[] toSoapModels(
		List<threat_summary_potential> models) {
		List<threat_summary_potentialSoap> soapModels = new ArrayList<threat_summary_potentialSoap>(models.size());

		for (threat_summary_potential model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new threat_summary_potentialSoap[soapModels.size()]);
	}

	public threat_summary_potentialSoap() {
	}

	public long getPrimaryKey() {
		return _threat_sum_potential_id;
	}

	public void setPrimaryKey(long pk) {
		setThreat_sum_potential_id(pk);
	}

	public long getThreat_sum_potential_id() {
		return _threat_sum_potential_id;
	}

	public void setThreat_sum_potential_id(long threat_sum_potential_id) {
		_threat_sum_potential_id = threat_sum_potential_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getOverall_potential() {
		return _overall_potential;
	}

	public void setOverall_potential(String overall_potential) {
		_overall_potential = overall_potential;
	}

	public long getThreat_rating() {
		return _threat_rating;
	}

	public void setThreat_rating(long threat_rating) {
		_threat_rating = threat_rating;
	}

	private long _threat_sum_potential_id;
	private long _assessment_version_id;
	private String _overall_potential;
	private long _threat_rating;
}