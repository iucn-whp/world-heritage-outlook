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
public class whp_sites_soc_reportsSoap implements Serializable {
	public static whp_sites_soc_reportsSoap toSoapModel(
		whp_sites_soc_reports model) {
		whp_sites_soc_reportsSoap soapModel = new whp_sites_soc_reportsSoap();

		soapModel.setWhp_sites_soc_reports_id(model.getWhp_sites_soc_reports_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setDate_published(model.getDate_published());
		soapModel.setDocument_link(model.getDocument_link());
		soapModel.setFileentryid(model.getFileentryid());
		soapModel.setDoc_name(model.getDoc_name());

		return soapModel;
	}

	public static whp_sites_soc_reportsSoap[] toSoapModels(
		whp_sites_soc_reports[] models) {
		whp_sites_soc_reportsSoap[] soapModels = new whp_sites_soc_reportsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_soc_reportsSoap[][] toSoapModels(
		whp_sites_soc_reports[][] models) {
		whp_sites_soc_reportsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_soc_reportsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_soc_reportsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_soc_reportsSoap[] toSoapModels(
		List<whp_sites_soc_reports> models) {
		List<whp_sites_soc_reportsSoap> soapModels = new ArrayList<whp_sites_soc_reportsSoap>(models.size());

		for (whp_sites_soc_reports model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_soc_reportsSoap[soapModels.size()]);
	}

	public whp_sites_soc_reportsSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_soc_reports_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_soc_reports_id(pk);
	}

	public long getWhp_sites_soc_reports_id() {
		return _whp_sites_soc_reports_id;
	}

	public void setWhp_sites_soc_reports_id(long whp_sites_soc_reports_id) {
		_whp_sites_soc_reports_id = whp_sites_soc_reports_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
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

	private long _whp_sites_soc_reports_id;
	private long _site_id;
	private Date _date_published;
	private String _document_link;
	private long _fileentryid;
	private String _doc_name;
}