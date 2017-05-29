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
public class benefits_summarySoap implements Serializable {
	public static benefits_summarySoap toSoapModel(benefits_summary model) {
		benefits_summarySoap soapModel = new benefits_summarySoap();

		soapModel.setBenefits_summary_id(model.getBenefits_summary_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setSummary(model.getSummary());

		return soapModel;
	}

	public static benefits_summarySoap[] toSoapModels(benefits_summary[] models) {
		benefits_summarySoap[] soapModels = new benefits_summarySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefits_summarySoap[][] toSoapModels(
		benefits_summary[][] models) {
		benefits_summarySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefits_summarySoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefits_summarySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefits_summarySoap[] toSoapModels(
		List<benefits_summary> models) {
		List<benefits_summarySoap> soapModels = new ArrayList<benefits_summarySoap>(models.size());

		for (benefits_summary model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefits_summarySoap[soapModels.size()]);
	}

	public benefits_summarySoap() {
	}

	public long getPrimaryKey() {
		return _benefits_summary_id;
	}

	public void setPrimaryKey(long pk) {
		setBenefits_summary_id(pk);
	}

	public long getBenefits_summary_id() {
		return _benefits_summary_id;
	}

	public void setBenefits_summary_id(long benefits_summary_id) {
		_benefits_summary_id = benefits_summary_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	private long _benefits_summary_id;
	private long _assessment_version_id;
	private String _summary;
}