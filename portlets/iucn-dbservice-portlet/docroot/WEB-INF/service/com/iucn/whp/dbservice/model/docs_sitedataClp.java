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

import com.iucn.whp.dbservice.service.docs_sitedataLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class docs_sitedataClp extends BaseModelImpl<docs_sitedata>
	implements docs_sitedata {
	public docs_sitedataClp() {
	}

	public Class<?> getModelClass() {
		return docs_sitedata.class;
	}

	public String getModelClassName() {
		return docs_sitedata.class.getName();
	}

	public long getPrimaryKey() {
		return _docs_sitedataId;
	}

	public void setPrimaryKey(long primaryKey) {
		setDocs_sitedataId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_docs_sitedataId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docs_sitedataId", getDocs_sitedataId());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("fileversionid", getFileversionid());
		attributes.put("siteid", getSiteid());
		attributes.put("date_published", getDate_published());
		attributes.put("doc_name", getDoc_name());
		attributes.put("document_link", getDocument_link());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docs_sitedataId = (Long)attributes.get("docs_sitedataId");

		if (docs_sitedataId != null) {
			setDocs_sitedataId(docs_sitedataId);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		Long fileversionid = (Long)attributes.get("fileversionid");

		if (fileversionid != null) {
			setFileversionid(fileversionid);
		}

		Long siteid = (Long)attributes.get("siteid");

		if (siteid != null) {
			setSiteid(siteid);
		}

		Date date_published = (Date)attributes.get("date_published");

		if (date_published != null) {
			setDate_published(date_published);
		}

		String doc_name = (String)attributes.get("doc_name");

		if (doc_name != null) {
			setDoc_name(doc_name);
		}

		String document_link = (String)attributes.get("document_link");

		if (document_link != null) {
			setDocument_link(document_link);
		}
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

	public BaseModel<?> getdocs_sitedataRemoteModel() {
		return _docs_sitedataRemoteModel;
	}

	public void setdocs_sitedataRemoteModel(
		BaseModel<?> docs_sitedataRemoteModel) {
		_docs_sitedataRemoteModel = docs_sitedataRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			docs_sitedataLocalServiceUtil.adddocs_sitedata(this);
		}
		else {
			docs_sitedataLocalServiceUtil.updatedocs_sitedata(this);
		}
	}

	@Override
	public docs_sitedata toEscapedModel() {
		return (docs_sitedata)Proxy.newProxyInstance(docs_sitedata.class.getClassLoader(),
			new Class[] { docs_sitedata.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		docs_sitedataClp clone = new docs_sitedataClp();

		clone.setDocs_sitedataId(getDocs_sitedataId());
		clone.setFileentryid(getFileentryid());
		clone.setFileversionid(getFileversionid());
		clone.setSiteid(getSiteid());
		clone.setDate_published(getDate_published());
		clone.setDoc_name(getDoc_name());
		clone.setDocument_link(getDocument_link());

		return clone;
	}

	public int compareTo(docs_sitedata docs_sitedata) {
		long primaryKey = docs_sitedata.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		docs_sitedataClp docs_sitedata = null;

		try {
			docs_sitedata = (docs_sitedataClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = docs_sitedata.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{docs_sitedataId=");
		sb.append(getDocs_sitedataId());
		sb.append(", fileentryid=");
		sb.append(getFileentryid());
		sb.append(", fileversionid=");
		sb.append(getFileversionid());
		sb.append(", siteid=");
		sb.append(getSiteid());
		sb.append(", date_published=");
		sb.append(getDate_published());
		sb.append(", doc_name=");
		sb.append(getDoc_name());
		sb.append(", document_link=");
		sb.append(getDocument_link());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.docs_sitedata");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docs_sitedataId</column-name><column-value><![CDATA[");
		sb.append(getDocs_sitedataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileentryid</column-name><column-value><![CDATA[");
		sb.append(getFileentryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileversionid</column-name><column-value><![CDATA[");
		sb.append(getFileversionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>siteid</column-name><column-value><![CDATA[");
		sb.append(getSiteid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_published</column-name><column-value><![CDATA[");
		sb.append(getDate_published());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doc_name</column-name><column-value><![CDATA[");
		sb.append(getDoc_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>document_link</column-name><column-value><![CDATA[");
		sb.append(getDocument_link());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _docs_sitedataId;
	private long _fileentryid;
	private long _fileversionid;
	private long _siteid;
	private Date _date_published;
	private String _doc_name;
	private String _document_link;
	private BaseModel<?> _docs_sitedataRemoteModel;
}