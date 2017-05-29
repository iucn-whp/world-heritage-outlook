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
public class assessing_threats_currentSoap implements Serializable {
	public static assessing_threats_currentSoap toSoapModel(
		assessing_threats_current model) {
		assessing_threats_currentSoap soapModel = new assessing_threats_currentSoap();

		soapModel.setCurrent_threat_id(model.getCurrent_threat_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setCurrent_threat(model.getCurrent_threat());
		soapModel.setJustification(model.getJustification());
		soapModel.setThreadExtentValue(model.getThreadExtentValue());
		soapModel.setInside_site(model.getInside_site());
		soapModel.setOutside_site(model.getOutside_site());
		soapModel.setThreat_rating_id(model.getThreat_rating_id());

		return soapModel;
	}

	public static assessing_threats_currentSoap[] toSoapModels(
		assessing_threats_current[] models) {
		assessing_threats_currentSoap[] soapModels = new assessing_threats_currentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessing_threats_currentSoap[][] toSoapModels(
		assessing_threats_current[][] models) {
		assessing_threats_currentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessing_threats_currentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessing_threats_currentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessing_threats_currentSoap[] toSoapModels(
		List<assessing_threats_current> models) {
		List<assessing_threats_currentSoap> soapModels = new ArrayList<assessing_threats_currentSoap>(models.size());

		for (assessing_threats_current model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessing_threats_currentSoap[soapModels.size()]);
	}

	public assessing_threats_currentSoap() {
	}

	public long getPrimaryKey() {
		return _current_threat_id;
	}

	public void setPrimaryKey(long pk) {
		setCurrent_threat_id(pk);
	}

	public long getCurrent_threat_id() {
		return _current_threat_id;
	}

	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_id = current_threat_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getCurrent_threat() {
		return _current_threat;
	}

	public void setCurrent_threat(String current_threat) {
		_current_threat = current_threat;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public String getThreadExtentValue() {
		return _threadExtentValue;
	}

	public void setThreadExtentValue(String threadExtentValue) {
		_threadExtentValue = threadExtentValue;
	}

	public boolean getInside_site() {
		return _inside_site;
	}

	public boolean isInside_site() {
		return _inside_site;
	}

	public void setInside_site(boolean inside_site) {
		_inside_site = inside_site;
	}

	public boolean getOutside_site() {
		return _outside_site;
	}

	public boolean isOutside_site() {
		return _outside_site;
	}

	public void setOutside_site(boolean outside_site) {
		_outside_site = outside_site;
	}

	public long getThreat_rating_id() {
		return _threat_rating_id;
	}

	public void setThreat_rating_id(long threat_rating_id) {
		_threat_rating_id = threat_rating_id;
	}

	private long _current_threat_id;
	private long _assessment_version_id;
	private String _current_threat;
	private String _justification;
	private String _threadExtentValue;
	private boolean _inside_site;
	private boolean _outside_site;
	private long _threat_rating_id;
}