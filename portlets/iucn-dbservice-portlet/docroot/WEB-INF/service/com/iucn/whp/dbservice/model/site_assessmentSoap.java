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
public class site_assessmentSoap implements Serializable {
	public static site_assessmentSoap toSoapModel(site_assessment model) {
		site_assessmentSoap soapModel = new site_assessmentSoap();

		soapModel.setAssessment_id(model.getAssessment_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setStatus_id(model.getStatus_id());
		soapModel.setInitiation_date(model.getInitiation_date());
		soapModel.setCurrent_userid(model.getCurrent_userid());
		soapModel.setCurrent_stageid(model.getCurrent_stageid());
		soapModel.setAssessment_initiated_by(model.getAssessment_initiated_by());
		soapModel.setBase_langid(model.getBase_langid());
		soapModel.setArchived(model.getArchived());
		soapModel.setIs_active(model.getIs_active());
		soapModel.setAssessment_cycle(model.getAssessment_cycle());

		return soapModel;
	}

	public static site_assessmentSoap[] toSoapModels(site_assessment[] models) {
		site_assessmentSoap[] soapModels = new site_assessmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static site_assessmentSoap[][] toSoapModels(
		site_assessment[][] models) {
		site_assessmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new site_assessmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new site_assessmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static site_assessmentSoap[] toSoapModels(
		List<site_assessment> models) {
		List<site_assessmentSoap> soapModels = new ArrayList<site_assessmentSoap>(models.size());

		for (site_assessment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new site_assessmentSoap[soapModels.size()]);
	}

	public site_assessmentSoap() {
	}

	public long getPrimaryKey() {
		return _assessment_id;
	}

	public void setPrimaryKey(long pk) {
		setAssessment_id(pk);
	}

	public long getAssessment_id() {
		return _assessment_id;
	}

	public void setAssessment_id(long assessment_id) {
		_assessment_id = assessment_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getStatus_id() {
		return _status_id;
	}

	public void setStatus_id(long status_id) {
		_status_id = status_id;
	}

	public Date getInitiation_date() {
		return _initiation_date;
	}

	public void setInitiation_date(Date initiation_date) {
		_initiation_date = initiation_date;
	}

	public long getCurrent_userid() {
		return _current_userid;
	}

	public void setCurrent_userid(long current_userid) {
		_current_userid = current_userid;
	}

	public long getCurrent_stageid() {
		return _current_stageid;
	}

	public void setCurrent_stageid(long current_stageid) {
		_current_stageid = current_stageid;
	}

	public long getAssessment_initiated_by() {
		return _assessment_initiated_by;
	}

	public void setAssessment_initiated_by(long assessment_initiated_by) {
		_assessment_initiated_by = assessment_initiated_by;
	}

	public long getBase_langid() {
		return _base_langid;
	}

	public void setBase_langid(long base_langid) {
		_base_langid = base_langid;
	}

	public boolean getArchived() {
		return _archived;
	}

	public boolean isArchived() {
		return _archived;
	}

	public void setArchived(boolean archived) {
		_archived = archived;
	}

	public boolean getIs_active() {
		return _is_active;
	}

	public boolean isIs_active() {
		return _is_active;
	}

	public void setIs_active(boolean is_active) {
		_is_active = is_active;
	}

	public String getAssessment_cycle() {
		return _assessment_cycle;
	}

	public void setAssessment_cycle(String assessment_cycle) {
		_assessment_cycle = assessment_cycle;
	}

	private long _assessment_id;
	private long _site_id;
	private long _status_id;
	private Date _initiation_date;
	private long _current_userid;
	private long _current_stageid;
	private long _assessment_initiated_by;
	private long _base_langid;
	private boolean _archived;
	private boolean _is_active;
	private String _assessment_cycle;
}