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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class assessment_lang_versionSoap implements Serializable {
	public static assessment_lang_versionSoap toSoapModel(
		assessment_lang_version model) {
		assessment_lang_versionSoap soapModel = new assessment_lang_versionSoap();

		soapModel.setLang_ver_id(model.getLang_ver_id());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setLanguageid(model.getLanguageid());
		soapModel.setPublished(model.getPublished());
		soapModel.setPublished_date(model.getPublished_date());

		return soapModel;
	}

	public static assessment_lang_versionSoap[] toSoapModels(
		assessment_lang_version[] models) {
		assessment_lang_versionSoap[] soapModels = new assessment_lang_versionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_lang_versionSoap[][] toSoapModels(
		assessment_lang_version[][] models) {
		assessment_lang_versionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_lang_versionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_lang_versionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_lang_versionSoap[] toSoapModels(
		List<assessment_lang_version> models) {
		List<assessment_lang_versionSoap> soapModels = new ArrayList<assessment_lang_versionSoap>(models.size());

		for (assessment_lang_version model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_lang_versionSoap[soapModels.size()]);
	}

	public assessment_lang_versionSoap() {
	}

	public long getPrimaryKey() {
		return _lang_ver_id;
	}

	public void setPrimaryKey(long pk) {
		setLang_ver_id(pk);
	}

	public long getLang_ver_id() {
		return _lang_ver_id;
	}

	public void setLang_ver_id(long lang_ver_id) {
		_lang_ver_id = lang_ver_id;
	}

	public long getAssessmentid() {
		return _assessmentid;
	}

	public void setAssessmentid(long assessmentid) {
		_assessmentid = assessmentid;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getLanguageid() {
		return _languageid;
	}

	public void setLanguageid(long languageid) {
		_languageid = languageid;
	}

	public boolean getPublished() {
		return _published;
	}

	public boolean isPublished() {
		return _published;
	}

	public void setPublished(boolean published) {
		_published = published;
	}

	public Date getPublished_date() {
		return _published_date;
	}

	public void setPublished_date(Date published_date) {
		_published_date = published_date;
	}

	private long _lang_ver_id;
	private long _assessmentid;
	private long _assessment_version_id;
	private long _languageid;
	private boolean _published;
	private Date _published_date;
}