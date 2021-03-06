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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.whp_sites_mission;
import com.iucn.whp.dbservice.model.whp_sites_missionModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the whp_sites_mission service. Represents a row in the &quot;whp_whp_sites_mission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_sites_missionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_missionImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_missionImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_mission
 * @see com.iucn.whp.dbservice.model.whp_sites_missionModel
 * @generated
 */
public class whp_sites_missionModelImpl extends BaseModelImpl<whp_sites_mission>
	implements whp_sites_missionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_mission model instance should use the {@link com.iucn.whp.dbservice.model.whp_sites_mission} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_sites_mission";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_sites_mission_id", Types.BIGINT },
			{ "site_id", Types.BIGINT },
			{ "missiontype", Types.INTEGER },
			{ "date_published", Types.TIMESTAMP },
			{ "document_link", Types.VARCHAR },
			{ "fileentryid", Types.BIGINT },
			{ "doc_name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_sites_mission (whp_sites_mission_id LONG not null primary key,site_id LONG,missiontype INTEGER,date_published DATE null,document_link VARCHAR(500) null,fileentryid LONG,doc_name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_sites_mission";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_mission"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_mission"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.whp_sites_mission"),
			true);
	public static long FILEENTRYID_COLUMN_BITMASK = 1L;
	public static long MISSIONTYPE_COLUMN_BITMASK = 2L;
	public static long SITE_ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_sites_mission"));

	public whp_sites_missionModelImpl() {
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

	public Class<?> getModelClass() {
		return whp_sites_mission.class;
	}

	public String getModelClassName() {
		return whp_sites_mission.class.getName();
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
		_columnBitmask |= SITE_ID_COLUMN_BITMASK;

		if (!_setOriginalSite_id) {
			_setOriginalSite_id = true;

			_originalSite_id = _site_id;
		}

		_site_id = site_id;
	}

	public long getOriginalSite_id() {
		return _originalSite_id;
	}

	public int getMissiontype() {
		return _missiontype;
	}

	public void setMissiontype(int missiontype) {
		_columnBitmask |= MISSIONTYPE_COLUMN_BITMASK;

		if (!_setOriginalMissiontype) {
			_setOriginalMissiontype = true;

			_originalMissiontype = _missiontype;
		}

		_missiontype = missiontype;
	}

	public int getOriginalMissiontype() {
		return _originalMissiontype;
	}

	public Date getDate_published() {
		return _date_published;
	}

	public void setDate_published(Date date_published) {
		_date_published = date_published;
	}

	public String getDocument_link() {
		if (_document_link == null) {
			return StringPool.BLANK;
		}
		else {
			return _document_link;
		}
	}

	public void setDocument_link(String document_link) {
		_document_link = document_link;
	}

	public long getFileentryid() {
		return _fileentryid;
	}

	public void setFileentryid(long fileentryid) {
		_columnBitmask |= FILEENTRYID_COLUMN_BITMASK;

		if (!_setOriginalFileentryid) {
			_setOriginalFileentryid = true;

			_originalFileentryid = _fileentryid;
		}

		_fileentryid = fileentryid;
	}

	public long getOriginalFileentryid() {
		return _originalFileentryid;
	}

	public String getDoc_name() {
		if (_doc_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _doc_name;
		}
	}

	public void setDoc_name(String doc_name) {
		_doc_name = doc_name;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			whp_sites_mission.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public whp_sites_mission toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_sites_mission)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_sites_missionImpl whp_sites_missionImpl = new whp_sites_missionImpl();

		whp_sites_missionImpl.setWhp_sites_mission_id(getWhp_sites_mission_id());
		whp_sites_missionImpl.setSite_id(getSite_id());
		whp_sites_missionImpl.setMissiontype(getMissiontype());
		whp_sites_missionImpl.setDate_published(getDate_published());
		whp_sites_missionImpl.setDocument_link(getDocument_link());
		whp_sites_missionImpl.setFileentryid(getFileentryid());
		whp_sites_missionImpl.setDoc_name(getDoc_name());

		whp_sites_missionImpl.resetOriginalValues();

		return whp_sites_missionImpl;
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

		whp_sites_mission whp_sites_mission = null;

		try {
			whp_sites_mission = (whp_sites_mission)obj;
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
	public void resetOriginalValues() {
		whp_sites_missionModelImpl whp_sites_missionModelImpl = this;

		whp_sites_missionModelImpl._originalSite_id = whp_sites_missionModelImpl._site_id;

		whp_sites_missionModelImpl._setOriginalSite_id = false;

		whp_sites_missionModelImpl._originalMissiontype = whp_sites_missionModelImpl._missiontype;

		whp_sites_missionModelImpl._setOriginalMissiontype = false;

		whp_sites_missionModelImpl._originalFileentryid = whp_sites_missionModelImpl._fileentryid;

		whp_sites_missionModelImpl._setOriginalFileentryid = false;

		whp_sites_missionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<whp_sites_mission> toCacheModel() {
		whp_sites_missionCacheModel whp_sites_missionCacheModel = new whp_sites_missionCacheModel();

		whp_sites_missionCacheModel.whp_sites_mission_id = getWhp_sites_mission_id();

		whp_sites_missionCacheModel.site_id = getSite_id();

		whp_sites_missionCacheModel.missiontype = getMissiontype();

		Date date_published = getDate_published();

		if (date_published != null) {
			whp_sites_missionCacheModel.date_published = date_published.getTime();
		}
		else {
			whp_sites_missionCacheModel.date_published = Long.MIN_VALUE;
		}

		whp_sites_missionCacheModel.document_link = getDocument_link();

		String document_link = whp_sites_missionCacheModel.document_link;

		if ((document_link != null) && (document_link.length() == 0)) {
			whp_sites_missionCacheModel.document_link = null;
		}

		whp_sites_missionCacheModel.fileentryid = getFileentryid();

		whp_sites_missionCacheModel.doc_name = getDoc_name();

		String doc_name = whp_sites_missionCacheModel.doc_name;

		if ((doc_name != null) && (doc_name.length() == 0)) {
			whp_sites_missionCacheModel.doc_name = null;
		}

		return whp_sites_missionCacheModel;
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

	private static ClassLoader _classLoader = whp_sites_mission.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_sites_mission.class
		};
	private long _whp_sites_mission_id;
	private long _site_id;
	private long _originalSite_id;
	private boolean _setOriginalSite_id;
	private int _missiontype;
	private int _originalMissiontype;
	private boolean _setOriginalMissiontype;
	private Date _date_published;
	private String _document_link;
	private long _fileentryid;
	private long _originalFileentryid;
	private boolean _setOriginalFileentryid;
	private String _doc_name;
	private long _columnBitmask;
	private whp_sites_mission _escapedModelProxy;
}