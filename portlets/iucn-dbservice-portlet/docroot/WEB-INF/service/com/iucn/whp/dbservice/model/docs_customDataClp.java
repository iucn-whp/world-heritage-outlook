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

import com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil;

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
public class docs_customDataClp extends BaseModelImpl<docs_customData>
	implements docs_customData {
	public docs_customDataClp() {
	}

	public Class<?> getModelClass() {
		return docs_customData.class;
	}

	public String getModelClassName() {
		return docs_customData.class.getName();
	}

	public int getPrimaryKey() {
		return _docs_customDataId;
	}

	public void setPrimaryKey(int primaryKey) {
		setDocs_customDataId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_docs_customDataId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docs_customDataId", getDocs_customDataId());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("fileversionid", getFileversionid());
		attributes.put("publish_date", getPublish_date());
		attributes.put("upload_date", getUpload_date());
		attributes.put("author", getAuthor());
		attributes.put("type", getType());
		attributes.put("category", getCategory());
		attributes.put("com", getCom());
		attributes.put("full_com", getFull_com());
		attributes.put("site", getSite());
		attributes.put("language", getLanguage());
		attributes.put("copyright", getCopyright());
		attributes.put("title", getTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer docs_customDataId = (Integer)attributes.get("docs_customDataId");

		if (docs_customDataId != null) {
			setDocs_customDataId(docs_customDataId);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		Long fileversionid = (Long)attributes.get("fileversionid");

		if (fileversionid != null) {
			setFileversionid(fileversionid);
		}

		Date publish_date = (Date)attributes.get("publish_date");

		if (publish_date != null) {
			setPublish_date(publish_date);
		}

		Date upload_date = (Date)attributes.get("upload_date");

		if (upload_date != null) {
			setUpload_date(upload_date);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String com = (String)attributes.get("com");

		if (com != null) {
			setCom(com);
		}

		String full_com = (String)attributes.get("full_com");

		if (full_com != null) {
			setFull_com(full_com);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String copyright = (String)attributes.get("copyright");

		if (copyright != null) {
			setCopyright(copyright);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}
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

	public BaseModel<?> getdocs_customDataRemoteModel() {
		return _docs_customDataRemoteModel;
	}

	public void setdocs_customDataRemoteModel(
		BaseModel<?> docs_customDataRemoteModel) {
		_docs_customDataRemoteModel = docs_customDataRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			docs_customDataLocalServiceUtil.adddocs_customData(this);
		}
		else {
			docs_customDataLocalServiceUtil.updatedocs_customData(this);
		}
	}

	@Override
	public docs_customData toEscapedModel() {
		return (docs_customData)Proxy.newProxyInstance(docs_customData.class.getClassLoader(),
			new Class[] { docs_customData.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		docs_customDataClp clone = new docs_customDataClp();

		clone.setDocs_customDataId(getDocs_customDataId());
		clone.setFileentryid(getFileentryid());
		clone.setFileversionid(getFileversionid());
		clone.setPublish_date(getPublish_date());
		clone.setUpload_date(getUpload_date());
		clone.setAuthor(getAuthor());
		clone.setType(getType());
		clone.setCategory(getCategory());
		clone.setCom(getCom());
		clone.setFull_com(getFull_com());
		clone.setSite(getSite());
		clone.setLanguage(getLanguage());
		clone.setCopyright(getCopyright());
		clone.setTitle(getTitle());

		return clone;
	}

	public int compareTo(docs_customData docs_customData) {
		int primaryKey = docs_customData.getPrimaryKey();

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

		docs_customDataClp docs_customData = null;

		try {
			docs_customData = (docs_customDataClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = docs_customData.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{docs_customDataId=");
		sb.append(getDocs_customDataId());
		sb.append(", fileentryid=");
		sb.append(getFileentryid());
		sb.append(", fileversionid=");
		sb.append(getFileversionid());
		sb.append(", publish_date=");
		sb.append(getPublish_date());
		sb.append(", upload_date=");
		sb.append(getUpload_date());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", com=");
		sb.append(getCom());
		sb.append(", full_com=");
		sb.append(getFull_com());
		sb.append(", site=");
		sb.append(getSite());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", copyright=");
		sb.append(getCopyright());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.docs_customData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docs_customDataId</column-name><column-value><![CDATA[");
		sb.append(getDocs_customDataId());
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
			"<column><column-name>publish_date</column-name><column-value><![CDATA[");
		sb.append(getPublish_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upload_date</column-name><column-value><![CDATA[");
		sb.append(getUpload_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>com</column-name><column-value><![CDATA[");
		sb.append(getCom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>full_com</column-name><column-value><![CDATA[");
		sb.append(getFull_com());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site</column-name><column-value><![CDATA[");
		sb.append(getSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copyright</column-name><column-value><![CDATA[");
		sb.append(getCopyright());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _docs_customDataRemoteModel;
}