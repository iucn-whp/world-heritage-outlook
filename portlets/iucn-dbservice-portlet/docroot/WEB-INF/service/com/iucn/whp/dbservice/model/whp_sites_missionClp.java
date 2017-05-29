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

import com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil;

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
public class whp_sites_missionClp extends BaseModelImpl<whp_sites_mission>
	implements whp_sites_mission {
	public whp_sites_missionClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_mission.class;
	}

	public String getModelClassName() {
		return whp_sites_mission.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_mission_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_mission_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_mission_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_mission_id", getWhp_sites_mission_id());
		attributes.put("site_id", getSite_id());
		attributes.put("missiontype", getMissiontype());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_mission_id = (Long)attributes.get("whp_sites_mission_id");

		if (whp_sites_mission_id != null) {
			setWhp_sites_mission_id(whp_sites_mission_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer missiontype = (Integer)attributes.get("missiontype");

		if (missiontype != null) {
			setMissiontype(missiontype);
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

	public BaseModel<?> getwhp_sites_missionRemoteModel() {
		return _whp_sites_missionRemoteModel;
	}

	public void setwhp_sites_missionRemoteModel(
		BaseModel<?> whp_sites_missionRemoteModel) {
		_whp_sites_missionRemoteModel = whp_sites_missionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_missionLocalServiceUtil.addwhp_sites_mission(this);
		}
		else {
			whp_sites_missionLocalServiceUtil.updatewhp_sites_mission(this);
		}
	}

	@Override
	public whp_sites_mission toEscapedModel() {
		return (whp_sites_mission)Proxy.newProxyInstance(whp_sites_mission.class.getClassLoader(),
			new Class[] { whp_sites_mission.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_missionClp clone = new whp_sites_missionClp();

		clone.setWhp_sites_mission_id(getWhp_sites_mission_id());
		clone.setSite_id(getSite_id());
		clone.setMissiontype(getMissiontype());
		clone.setDate_published(getDate_published());
		clone.setDocument_link(getDocument_link());
		clone.setFileentryid(getFileentryid());
		clone.setDoc_name(getDoc_name());

		return clone;
	}

	public int compareTo(whp_sites_mission whp_sites_mission) {
		long primaryKey = whp_sites_mission.getPrimaryKey();

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

		whp_sites_missionClp whp_sites_mission = null;

		try {
			whp_sites_mission = (whp_sites_missionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_mission.getPrimaryKey();

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

		sb.append("{whp_sites_mission_id=");
		sb.append(getWhp_sites_mission_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", missiontype=");
		sb.append(getMissiontype());
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
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_mission");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_mission_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_mission_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>missiontype</column-name><column-value><![CDATA[");
		sb.append(getMissiontype());
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

	private long _whp_sites_mission_id;
	private long _site_id;
	private int _missiontype;
	private Date _date_published;
	private String _document_link;
	private long _fileentryid;
	private String _doc_name;
	private BaseModel<?> _whp_sites_missionRemoteModel;
}