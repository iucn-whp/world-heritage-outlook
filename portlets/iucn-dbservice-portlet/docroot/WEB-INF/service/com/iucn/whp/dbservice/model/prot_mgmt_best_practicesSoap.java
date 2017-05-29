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
public class prot_mgmt_best_practicesSoap implements Serializable {
	public static prot_mgmt_best_practicesSoap toSoapModel(
		prot_mgmt_best_practices model) {
		prot_mgmt_best_practicesSoap soapModel = new prot_mgmt_best_practicesSoap();

		soapModel.setBest_practice_id(model.getBest_practice_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static prot_mgmt_best_practicesSoap[] toSoapModels(
		prot_mgmt_best_practices[] models) {
		prot_mgmt_best_practicesSoap[] soapModels = new prot_mgmt_best_practicesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static prot_mgmt_best_practicesSoap[][] toSoapModels(
		prot_mgmt_best_practices[][] models) {
		prot_mgmt_best_practicesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new prot_mgmt_best_practicesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new prot_mgmt_best_practicesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static prot_mgmt_best_practicesSoap[] toSoapModels(
		List<prot_mgmt_best_practices> models) {
		List<prot_mgmt_best_practicesSoap> soapModels = new ArrayList<prot_mgmt_best_practicesSoap>(models.size());

		for (prot_mgmt_best_practices model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new prot_mgmt_best_practicesSoap[soapModels.size()]);
	}

	public prot_mgmt_best_practicesSoap() {
	}

	public long getPrimaryKey() {
		return _best_practice_id;
	}

	public void setPrimaryKey(long pk) {
		setBest_practice_id(pk);
	}

	public long getBest_practice_id() {
		return _best_practice_id;
	}

	public void setBest_practice_id(long best_practice_id) {
		_best_practice_id = best_practice_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _best_practice_id;
	private long _assessment_version_id;
	private String _description;
}