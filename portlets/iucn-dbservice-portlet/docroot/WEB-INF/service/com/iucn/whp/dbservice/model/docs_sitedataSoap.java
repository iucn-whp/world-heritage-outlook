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
public class docs_sitedataSoap implements Serializable {
	public static docs_sitedataSoap toSoapModel(docs_sitedata model) {
		docs_sitedataSoap soapModel = new docs_sitedataSoap();

		soapModel.setDocs_sitedataId(model.getDocs_sitedataId());
		soapModel.setFileentryid(model.getFileentryid());
		soapModel.setFileversionid(model.getFileversionid());
		soapModel.setSiteid(model.getSiteid());
		soapModel.setDate_published(model.getDate_published());
		soapModel.setDoc_name(model.getDoc_name());
		soapModel.setDocument_link(model.getDocument_link());

		return soapModel;
	}

	public static docs_sitedataSoap[] toSoapModels(docs_sitedata[] models) {
		docs_sitedataSoap[] soapModels = new docs_sitedataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static docs_sitedataSoap[][] toSoapModels(docs_sitedata[][] models) {
		docs_sitedataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new docs_sitedataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new docs_sitedataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static docs_sitedataSoap[] toSoapModels(List<docs_sitedata> models) {
		List<docs_sitedataSoap> soapModels = new ArrayList<docs_sitedataSoap>(models.size());

		for (docs_sitedata model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new docs_sitedataSoap[soapModels.size()]);
	}

	public docs_sitedataSoap() {
	}

	public long getPrimaryKey() {
		return _docs_sitedataId;
	}

	public void setPrimaryKey(long pk) {
		setDocs_sitedataId(pk);
	}

	public long getDocs_sitedataId() {
		return _docs_sitedataId;
	}

	public void setDocs_sitedataId(long docs_sitedataId) {
		_docs_sitedataId = docs_sitedataId;
	}

	public long getFileentryid() {
		return _fileentryid;
	}

	public void setFileentryid(long fileentryid) {
		_fileentryid = fileentryid;
	}

	public long getFileversionid() {
		return _fileversionid;
	}

	public void setFileversionid(long fileversionid) {
		_fileversionid = fileversionid;
	}

	public long getSiteid() {
		return _siteid;
	}

	public void setSiteid(long siteid) {
		_siteid = siteid;
	}

	public Date getDate_published() {
		return _date_published;
	}

	public void setDate_published(Date date_published) {
		_date_published = date_published;
	}

	public String getDoc_name() {
		return _doc_name;
	}

	public void setDoc_name(String doc_name) {
		_doc_name = doc_name;
	}

	public String getDocument_link() {
		return _document_link;
	}

	public void setDocument_link(String document_link) {
		_document_link = document_link;
	}

	private long _docs_sitedataId;
	private long _fileentryid;
	private long _fileversionid;
	private long _siteid;
	private Date _date_published;
	private String _doc_name;
	private String _document_link;
}