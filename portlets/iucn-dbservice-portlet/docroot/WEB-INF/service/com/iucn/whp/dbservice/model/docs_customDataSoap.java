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
public class docs_customDataSoap implements Serializable {
	public static docs_customDataSoap toSoapModel(docs_customData model) {
		docs_customDataSoap soapModel = new docs_customDataSoap();

		soapModel.setDocs_customDataId(model.getDocs_customDataId());
		soapModel.setFileentryid(model.getFileentryid());
		soapModel.setFileversionid(model.getFileversionid());
		soapModel.setPublish_date(model.getPublish_date());
		soapModel.setUpload_date(model.getUpload_date());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setType(model.getType());
		soapModel.setCategory(model.getCategory());
		soapModel.setCom(model.getCom());
		soapModel.setFull_com(model.getFull_com());
		soapModel.setSite(model.getSite());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setCopyright(model.getCopyright());
		soapModel.setTitle(model.getTitle());

		return soapModel;
	}

	public static docs_customDataSoap[] toSoapModels(docs_customData[] models) {
		docs_customDataSoap[] soapModels = new docs_customDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static docs_customDataSoap[][] toSoapModels(
		docs_customData[][] models) {
		docs_customDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new docs_customDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new docs_customDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static docs_customDataSoap[] toSoapModels(
		List<docs_customData> models) {
		List<docs_customDataSoap> soapModels = new ArrayList<docs_customDataSoap>(models.size());

		for (docs_customData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new docs_customDataSoap[soapModels.size()]);
	}

	public docs_customDataSoap() {
	}

	public int getPrimaryKey() {
		return _docs_customDataId;
	}

	public void setPrimaryKey(int pk) {
		setDocs_customDataId(pk);
	}

	public int getDocs_customDataId() {
		return _docs_customDataId;
	}

	public void setDocs_customDataId(int docs_customDataId) {
		_docs_customDataId = docs_customDataId;
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

	public Date getPublish_date() {
		return _publish_date;
	}

	public void setPublish_date(Date publish_date) {
		_publish_date = publish_date;
	}

	public Date getUpload_date() {
		return _upload_date;
	}

	public void setUpload_date(Date upload_date) {
		_upload_date = upload_date;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getCom() {
		return _com;
	}

	public void setCom(String com) {
		_com = com;
	}

	public String getFull_com() {
		return _full_com;
	}

	public void setFull_com(String full_com) {
		_full_com = full_com;
	}

	public String getSite() {
		return _site;
	}

	public void setSite(String site) {
		_site = site;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getCopyright() {
		return _copyright;
	}

	public void setCopyright(String copyright) {
		_copyright = copyright;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	private int _docs_customDataId;
	private long _fileentryid;
	private long _fileversionid;
	private Date _publish_date;
	private Date _upload_date;
	private String _author;
	private String _type;
	private String _category;
	private String _com;
	private String _full_com;
	private String _site;
	private String _language;
	private String _copyright;
	private String _title;
}