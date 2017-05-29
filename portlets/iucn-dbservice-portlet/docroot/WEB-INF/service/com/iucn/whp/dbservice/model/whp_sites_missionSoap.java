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
public class whp_sites_missionSoap implements Serializable {
	public static whp_sites_missionSoap toSoapModel(whp_sites_mission model) {
		whp_sites_missionSoap soapModel = new whp_sites_missionSoap();

		soapModel.setWhp_sites_mission_id(model.getWhp_sites_mission_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setMissiontype(model.getMissiontype());
		soapModel.setDate_published(model.getDate_published());
		soapModel.setDocument_link(model.getDocument_link());
		soapModel.setFileentryid(model.getFileentryid());
		soapModel.setDoc_name(model.getDoc_name());

		return soapModel;
	}

	public static whp_sites_missionSoap[] toSoapModels(
		whp_sites_mission[] models) {
		whp_sites_missionSoap[] soapModels = new whp_sites_missionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_missionSoap[][] toSoapModels(
		whp_sites_mission[][] models) {
		whp_sites_missionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_missionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_missionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_missionSoap[] toSoapModels(
		List<whp_sites_mission> models) {
		List<whp_sites_missionSoap> soapModels = new ArrayList<whp_sites_missionSoap>(models.size());

		for (whp_sites_mission model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_missionSoap[soapModels.size()]);
	}

	public whp_sites_missionSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_mission_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_mission_id(pk);
	}

	public long getWhp_sites_mission_id() {
		return _whp_sites_mission_id;
	}

	public void setWhp_sites_mission_id(long whp_sites_mission_id) {
		_whp_sites_mission_id = whp_sites_mission_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getMissiontype() {
		return _missiontype;
	}

	public void setMissiontype(int missiontype) {
		_missiontype = missiontype;
	}

	public Date getDate_published() {
		return _date_published;
	}

	public void setDate_published(Date date_published) {
		_date_published = date_published;
	}

	public String getDocument_link() {
		return _document_link;
	}

	public void setDocument_link(String document_link) {
		_document_link = document_link;
	}

	public long getFileentryid() {
		return _fileentryid;
	}

	public void setFileentryid(long fileentryid) {
		_fileentryid = fileentryid;
	}

	public String getDoc_name() {
		return _doc_name;
	}

	public void setDoc_name(String doc_name) {
		_doc_name = doc_name;
	}

	private long _whp_sites_mission_id;
	private long _site_id;
	private int _missiontype;
	private Date _date_published;
	private String _document_link;
	private long _fileentryid;
	private String _doc_name;
}