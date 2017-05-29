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
public class site_assessment_versionsSoap implements Serializable {
	public static site_assessment_versionsSoap toSoapModel(
		site_assessment_versions model) {
		site_assessment_versionsSoap soapModel = new site_assessment_versionsSoap();

		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setStage_id(model.getStage_id());
		soapModel.setAssessment_id(model.getAssessment_id());
		soapModel.setStart_date(model.getStart_date());
		soapModel.setEnd_date(model.getEnd_date());
		soapModel.setUserid(model.getUserid());
		soapModel.setInitiation_date(model.getInitiation_date());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setVersion_code(model.getVersion_code());
		soapModel.setIs_translated(model.getIs_translated());
		soapModel.setParent_assessment_versionid(model.getParent_assessment_versionid());

		return soapModel;
	}

	public static site_assessment_versionsSoap[] toSoapModels(
		site_assessment_versions[] models) {
		site_assessment_versionsSoap[] soapModels = new site_assessment_versionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static site_assessment_versionsSoap[][] toSoapModels(
		site_assessment_versions[][] models) {
		site_assessment_versionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new site_assessment_versionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new site_assessment_versionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static site_assessment_versionsSoap[] toSoapModels(
		List<site_assessment_versions> models) {
		List<site_assessment_versionsSoap> soapModels = new ArrayList<site_assessment_versionsSoap>(models.size());

		for (site_assessment_versions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new site_assessment_versionsSoap[soapModels.size()]);
	}

	public site_assessment_versionsSoap() {
	}

	public long getPrimaryKey() {
		return _assessment_version_id;
	}

	public void setPrimaryKey(long pk) {
		setAssessment_version_id(pk);
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getStage_id() {
		return _stage_id;
	}

	public void setStage_id(long stage_id) {
		_stage_id = stage_id;
	}

	public long getAssessment_id() {
		return _assessment_id;
	}

	public void setAssessment_id(long assessment_id) {
		_assessment_id = assessment_id;
	}

	public Date getStart_date() {
		return _start_date;
	}

	public void setStart_date(Date start_date) {
		_start_date = start_date;
	}

	public Date getEnd_date() {
		return _end_date;
	}

	public void setEnd_date(Date end_date) {
		_end_date = end_date;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public Date getInitiation_date() {
		return _initiation_date;
	}

	public void setInitiation_date(Date initiation_date) {
		_initiation_date = initiation_date;
	}

	public long getLanguage() {
		return _language;
	}

	public void setLanguage(long language) {
		_language = language;
	}

	public double getVersion_code() {
		return _version_code;
	}

	public void setVersion_code(double version_code) {
		_version_code = version_code;
	}

	public boolean getIs_translated() {
		return _is_translated;
	}

	public boolean isIs_translated() {
		return _is_translated;
	}

	public void setIs_translated(boolean is_translated) {
		_is_translated = is_translated;
	}

	public long getParent_assessment_versionid() {
		return _parent_assessment_versionid;
	}

	public void setParent_assessment_versionid(long parent_assessment_versionid) {
		_parent_assessment_versionid = parent_assessment_versionid;
	}

	private long _assessment_version_id;
	private long _stage_id;
	private long _assessment_id;
	private Date _start_date;
	private Date _end_date;
	private long _userid;
	private Date _initiation_date;
	private long _language;
	private double _version_code;
	private boolean _is_translated;
	private long _parent_assessment_versionid;
}