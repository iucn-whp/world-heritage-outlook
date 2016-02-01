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
public class threat_summary_currentSoap implements Serializable {
	public static threat_summary_currentSoap toSoapModel(
		threat_summary_current model) {
		threat_summary_currentSoap soapModel = new threat_summary_currentSoap();

		soapModel.setThreat_sum_cur_id(model.getThreat_sum_cur_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setOverall_current(model.getOverall_current());
		soapModel.setThreat_rating(model.getThreat_rating());

		return soapModel;
	}

	public static threat_summary_currentSoap[] toSoapModels(
		threat_summary_current[] models) {
		threat_summary_currentSoap[] soapModels = new threat_summary_currentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static threat_summary_currentSoap[][] toSoapModels(
		threat_summary_current[][] models) {
		threat_summary_currentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new threat_summary_currentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new threat_summary_currentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static threat_summary_currentSoap[] toSoapModels(
		List<threat_summary_current> models) {
		List<threat_summary_currentSoap> soapModels = new ArrayList<threat_summary_currentSoap>(models.size());

		for (threat_summary_current model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new threat_summary_currentSoap[soapModels.size()]);
	}

	public threat_summary_currentSoap() {
	}

	public long getPrimaryKey() {
		return _threat_sum_cur_id;
	}

	public void setPrimaryKey(long pk) {
		setThreat_sum_cur_id(pk);
	}

	public long getThreat_sum_cur_id() {
		return _threat_sum_cur_id;
	}

	public void setThreat_sum_cur_id(long threat_sum_cur_id) {
		_threat_sum_cur_id = threat_sum_cur_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getOverall_current() {
		return _overall_current;
	}

	public void setOverall_current(String overall_current) {
		_overall_current = overall_current;
	}

	public long getThreat_rating() {
		return _threat_rating;
	}

	public void setThreat_rating(long threat_rating) {
		_threat_rating = threat_rating;
	}

	private long _threat_sum_cur_id;
	private long _assessment_version_id;
	private String _overall_current;
	private long _threat_rating;
}