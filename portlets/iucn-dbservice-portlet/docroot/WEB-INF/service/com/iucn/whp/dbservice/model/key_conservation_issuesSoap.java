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
public class key_conservation_issuesSoap implements Serializable {
	public static key_conservation_issuesSoap toSoapModel(
		key_conservation_issues model) {
		key_conservation_issuesSoap soapModel = new key_conservation_issuesSoap();

		soapModel.setKey_conservation_issues_id(model.getKey_conservation_issues_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setCn(model.getCn());
		soapModel.setKey_conservation_issues(model.getKey_conservation_issues());
		soapModel.setDescription(model.getDescription());
		soapModel.setScale(model.getScale());

		return soapModel;
	}

	public static key_conservation_issuesSoap[] toSoapModels(
		key_conservation_issues[] models) {
		key_conservation_issuesSoap[] soapModels = new key_conservation_issuesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static key_conservation_issuesSoap[][] toSoapModels(
		key_conservation_issues[][] models) {
		key_conservation_issuesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new key_conservation_issuesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new key_conservation_issuesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static key_conservation_issuesSoap[] toSoapModels(
		List<key_conservation_issues> models) {
		List<key_conservation_issuesSoap> soapModels = new ArrayList<key_conservation_issuesSoap>(models.size());

		for (key_conservation_issues model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new key_conservation_issuesSoap[soapModels.size()]);
	}

	public key_conservation_issuesSoap() {
	}

	public long getPrimaryKey() {
		return _key_conservation_issues_id;
	}

	public void setPrimaryKey(long pk) {
		setKey_conservation_issues_id(pk);
	}

	public long getKey_conservation_issues_id() {
		return _key_conservation_issues_id;
	}

	public void setKey_conservation_issues_id(long key_conservation_issues_id) {
		_key_conservation_issues_id = key_conservation_issues_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getCn() {
		return _cn;
	}

	public void setCn(String cn) {
		_cn = cn;
	}

	public String getKey_conservation_issues() {
		return _key_conservation_issues;
	}

	public void setKey_conservation_issues(String key_conservation_issues) {
		_key_conservation_issues = key_conservation_issues;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getScale() {
		return _scale;
	}

	public void setScale(long scale) {
		_scale = scale;
	}

	private long _key_conservation_issues_id;
	private long _assessment_version_id;
	private String _cn;
	private String _key_conservation_issues;
	private String _description;
	private long _scale;
}