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

import com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalServiceUtil;

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
public class whp_sites_soc_reportsClp extends BaseModelImpl<whp_sites_soc_reports>
	implements whp_sites_soc_reports {
	public whp_sites_soc_reportsClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_soc_reports.class;
	}

	public String getModelClassName() {
		return whp_sites_soc_reports.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_soc_reports_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_soc_reports_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_soc_reports_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_soc_reports_id", getWhp_sites_soc_reports_id());
		attributes.put("site_id", getSite_id());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_soc_reports_id = (Long)attributes.get(
				"whp_sites_soc_reports_id");

		if (whp_sites_soc_reports_id != null) {
			setWhp_sites_soc_reports_id(whp_sites_soc_reports_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Date date_published = (Date)attributes.get("date_published");

		if (date_published != null) {
			setDate_published(date_published);
		}

		String document_link = (String)attributes.get("document_link");

		if (document_link != null) {
			setDocument_link(document_link);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		String doc_name = (String)attributes.get("doc_name");

		if (doc_name != null) {
			setDoc_name(doc_name);
		}
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

	public BaseModel<?> getwhp_sites_soc_reportsRemoteModel() {
		return _whp_sites_soc_reportsRemoteModel;
	}

	public void setwhp_sites_soc_reportsRemoteModel(
		BaseModel<?> whp_sites_soc_reportsRemoteModel) {
		_whp_sites_soc_reportsRemoteModel = whp_sites_soc_reportsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_soc_reportsLocalServiceUtil.addwhp_sites_soc_reports(this);
		}
		else {
			whp_sites_soc_reportsLocalServiceUtil.updatewhp_sites_soc_reports(this);
		}
	}

	@Override
	public whp_sites_soc_reports toEscapedModel() {
		return (whp_sites_soc_reports)Proxy.newProxyInstance(whp_sites_soc_reports.class.getClassLoader(),
			new Class[] { whp_sites_soc_reports.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_soc_reportsClp clone = new whp_sites_soc_reportsClp();

		clone.setWhp_sites_soc_reports_id(getWhp_sites_soc_reports_id());
		clone.setSite_id(getSite_id());
		clone.setDate_published(getDate_published());
		clone.setDocument_link(getDocument_link());
		clone.setFileentryid(getFileentryid());
		clone.setDoc_name(getDoc_name());

		return clone;
	}

	public int compareTo(whp_sites_soc_reports whp_sites_soc_reports) {
		long primaryKey = whp_sites_soc_reports.getPrimaryKey();

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

		whp_sites_soc_reportsClp whp_sites_soc_reports = null;

		try {
			whp_sites_soc_reports = (whp_sites_soc_reportsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_soc_reports.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{whp_sites_soc_reports_id=");
		sb.append(getWhp_sites_soc_reports_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", date_published=");
		sb.append(getDate_published());
		sb.append(", document_link=");
		sb.append(getDocument_link());
		sb.append(", fileentryid=");
		sb.append(getFileentryid());
		sb.append(", doc_name=");
		sb.append(getDoc_name());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_soc_reports");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_soc_reports_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_soc_reports_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_published</column-name><column-value><![CDATA[");
		sb.append(getDate_published());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>document_link</column-name><column-value><![CDATA[");
		sb.append(getDocument_link());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileentryid</column-name><column-value><![CDATA[");
		sb.append(getFileentryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doc_name</column-name><column-value><![CDATA[");
		sb.append(getDoc_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_soc_reports_id;
	private long _site_id;
	private Date _date_published;
	private String _document_link;
	private long _fileentryid;
	private String _doc_name;
	private BaseModel<?> _whp_sites_soc_reportsRemoteModel;
}