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

import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.site_assessment_versionsModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the site_assessment_versions service. Represents a row in the &quot;whp_site_assessment_versions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.site_assessment_versionsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link site_assessment_versionsImpl}.
 * </p>
 *
 * @author alok.sen
 * @see site_assessment_versionsImpl
 * @see com.iucn.whp.dbservice.model.site_assessment_versions
 * @see com.iucn.whp.dbservice.model.site_assessment_versionsModel
 * @generated
 */
public class site_assessment_versionsModelImpl extends BaseModelImpl<site_assessment_versions>
	implements site_assessment_versionsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a site_assessment_versions model instance should use the {@link com.iucn.whp.dbservice.model.site_assessment_versions} interface instead.
	 */
	public static final String TABLE_NAME = "whp_site_assessment_versions";
	public static final Object[][] TABLE_COLUMNS = {
			{ "assessment_version_id", Types.BIGINT },
			{ "stage_id", Types.BIGINT },
			{ "assessment_id", Types.BIGINT },
			{ "start_date", Types.TIMESTAMP },
			{ "end_date", Types.TIMESTAMP },
			{ "userid", Types.BIGINT },
			{ "initiation_date", Types.TIMESTAMP },
			{ "language", Types.BIGINT },
			{ "version_code", Types.DOUBLE },
			{ "is_translated", Types.BOOLEAN },
			{ "parent_assessment_versionid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_site_assessment_versions (assessment_version_id LONG not null primary key,stage_id LONG,assessment_id LONG,start_date DATE null,end_date DATE null,userid LONG,initiation_date DATE null,language LONG,version_code DOUBLE,is_translated BOOLEAN,parent_assessment_versionid LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_site_assessment_versions";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.site_assessment_versions"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.site_assessment_versions"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.site_assessment_versions"),
			true);
	public static long ASSESSMENT_ID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long VERSION_CODE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.site_assessment_versions"));

	public site_assessment_versionsModelImpl() {
	}

	public long getPrimaryKey() {
		return _assessment_version_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAssessment_version_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_assessment_version_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return site_assessment_versions.class;
	}

	public String getModelClassName() {
		return site_assessment_versions.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("stage_id", getStage_id());
		attributes.put("assessment_id", getAssessment_id());
		attributes.put("start_date", getStart_date());
		attributes.put("end_date", getEnd_date());
		attributes.put("userid", getUserid());
		attributes.put("initiation_date", getInitiation_date());
		attributes.put("language", getLanguage());
		attributes.put("version_code", getVersion_code());
		attributes.put("is_translated", getIs_translated());
		attributes.put("parent_assessment_versionid",
			getParent_assessment_versionid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long stage_id = (Long)attributes.get("stage_id");

		if (stage_id != null) {
			setStage_id(stage_id);
		}

		Long assessment_id = (Long)attributes.get("assessment_id");

		if (assessment_id != null) {
			setAssessment_id(assessment_id);
		}

		Date start_date = (Date)attributes.get("start_date");

		if (start_date != null) {
			setStart_date(start_date);
		}

		Date end_date = (Date)attributes.get("end_date");

		if (end_date != null) {
			setEnd_date(end_date);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Date initiation_date = (Date)attributes.get("initiation_date");

		if (initiation_date != null) {
			setInitiation_date(initiation_date);
		}

		Long language = (Long)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Double version_code = (Double)attributes.get("version_code");

		if (version_code != null) {
			setVersion_code(version_code);
		}

		Boolean is_translated = (Boolean)attributes.get("is_translated");

		if (is_translated != null) {
			setIs_translated(is_translated);
		}

		Long parent_assessment_versionid = (Long)attributes.get(
				"parent_assessment_versionid");

		if (parent_assessment_versionid != null) {
			setParent_assessment_versionid(parent_assessment_versionid);
		}
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getStage_id() {
		return _stage_id;
	}

	public void setStage_id(long stage_id) {
		_stage_id = stage_id;
	}

	public long getAssessment_id() {
		return _assessment_id;
	}

	public void setAssessment_id(long assessment_id) {
		_columnBitmask |= ASSESSMENT_ID_COLUMN_BITMASK;

		if (!_setOriginalAssessment_id) {
			_setOriginalAssessment_id = true;

			_originalAssessment_id = _assessment_id;
		}

		_assessment_id = assessment_id;
	}

	public long getOriginalAssessment_id() {
		return _originalAssessment_id;
	}

	public Date getStart_date() {
		return _start_date;
	}

	public void setStart_date(Date start_date) {
		_start_date = start_date;
	}

	public Date getEnd_date() {
		return _end_date;
	}

	public void setEnd_date(Date end_date) {
		_end_date = end_date;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserid) {
			_setOriginalUserid = true;

			_originalUserid = _userid;
		}

		_userid = userid;
	}

	public long getOriginalUserid() {
		return _originalUserid;
	}

	public Date getInitiation_date() {
		return _initiation_date;
	}

	public void setInitiation_date(Date initiation_date) {
		_initiation_date = initiation_date;
	}

	public long getLanguage() {
		return _language;
	}

	public void setLanguage(long language) {
		_language = language;
	}

	public double getVersion_code() {
		return _version_code;
	}

	public void setVersion_code(double version_code) {
		_columnBitmask |= VERSION_CODE_COLUMN_BITMASK;

		if (!_setOriginalVersion_code) {
			_setOriginalVersion_code = true;

			_originalVersion_code = _version_code;
		}

		_version_code = version_code;
	}

	public double getOriginalVersion_code() {
		return _originalVersion_code;
	}

	public boolean getIs_translated() {
		return _is_translated;
	}

	public boolean isIs_translated() {
		return _is_translated;
	}

	public void setIs_translated(boolean is_translated) {
		_is_translated = is_translated;
	}

	public long getParent_assessment_versionid() {
		return _parent_assessment_versionid;
	}

	public void setParent_assessment_versionid(long parent_assessment_versionid) {
		_parent_assessment_versionid = parent_assessment_versionid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			site_assessment_versions.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public site_assessment_versions toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (site_assessment_versions)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		site_assessment_versionsImpl site_assessment_versionsImpl = new site_assessment_versionsImpl();

		site_assessment_versionsImpl.setAssessment_version_id(getAssessment_version_id());
		site_assessment_versionsImpl.setStage_id(getStage_id());
		site_assessment_versionsImpl.setAssessment_id(getAssessment_id());
		site_assessment_versionsImpl.setStart_date(getStart_date());
		site_assessment_versionsImpl.setEnd_date(getEnd_date());
		site_assessment_versionsImpl.setUserid(getUserid());
		site_assessment_versionsImpl.setInitiation_date(getInitiation_date());
		site_assessment_versionsImpl.setLanguage(getLanguage());
		site_assessment_versionsImpl.setVersion_code(getVersion_code());
		site_assessment_versionsImpl.setIs_translated(getIs_translated());
		site_assessment_versionsImpl.setParent_assessment_versionid(getParent_assessment_versionid());

		site_assessment_versionsImpl.resetOriginalValues();

		return site_assessment_versionsImpl;
	}

	public int compareTo(site_assessment_versions site_assessment_versions) {
		long primaryKey = site_assessment_versions.getPrimaryKey();

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

		site_assessment_versions site_assessment_versions = null;

		try {
			site_assessment_versions = (site_assessment_versions)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = site_assessment_versions.getPrimaryKey();

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
		site_assessment_versionsModelImpl site_assessment_versionsModelImpl = this;

		site_assessment_versionsModelImpl._originalAssessment_id = site_assessment_versionsModelImpl._assessment_id;

		site_assessment_versionsModelImpl._setOriginalAssessment_id = false;

		site_assessment_versionsModelImpl._originalUserid = site_assessment_versionsModelImpl._userid;

		site_assessment_versionsModelImpl._setOriginalUserid = false;

		site_assessment_versionsModelImpl._originalVersion_code = site_assessment_versionsModelImpl._version_code;

		site_assessment_versionsModelImpl._setOriginalVersion_code = false;

		site_assessment_versionsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<site_assessment_versions> toCacheModel() {
		site_assessment_versionsCacheModel site_assessment_versionsCacheModel = new site_assessment_versionsCacheModel();

		site_assessment_versionsCacheModel.assessment_version_id = getAssessment_version_id();

		site_assessment_versionsCacheModel.stage_id = getStage_id();

		site_assessment_versionsCacheModel.assessment_id = getAssessment_id();

		Date start_date = getStart_date();

		if (start_date != null) {
			site_assessment_versionsCacheModel.start_date = start_date.getTime();
		}
		else {
			site_assessment_versionsCacheModel.start_date = Long.MIN_VALUE;
		}

		Date end_date = getEnd_date();

		if (end_date != null) {
			site_assessment_versionsCacheModel.end_date = end_date.getTime();
		}
		else {
			site_assessment_versionsCacheModel.end_date = Long.MIN_VALUE;
		}

		site_assessment_versionsCacheModel.userid = getUserid();

		Date initiation_date = getInitiation_date();

		if (initiation_date != null) {
			site_assessment_versionsCacheModel.initiation_date = initiation_date.getTime();
		}
		else {
			site_assessment_versionsCacheModel.initiation_date = Long.MIN_VALUE;
		}

		site_assessment_versionsCacheModel.language = getLanguage();

		site_assessment_versionsCacheModel.version_code = getVersion_code();

		site_assessment_versionsCacheModel.is_translated = getIs_translated();

		site_assessment_versionsCacheModel.parent_assessment_versionid = getParent_assessment_versionid();

		return site_assessment_versionsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", stage_id=");
		sb.append(getStage_id());
		sb.append(", assessment_id=");
		sb.append(getAssessment_id());
		sb.append(", start_date=");
		sb.append(getStart_date());
		sb.append(", end_date=");
		sb.append(getEnd_date());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", initiation_date=");
		sb.append(getInitiation_date());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", version_code=");
		sb.append(getVersion_code());
		sb.append(", is_translated=");
		sb.append(getIs_translated());
		sb.append(", parent_assessment_versionid=");
		sb.append(getParent_assessment_versionid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.site_assessment_versions");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stage_id</column-name><column-value><![CDATA[");
		sb.append(getStage_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>start_date</column-name><column-value><![CDATA[");
		sb.append(getStart_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>end_date</column-name><column-value><![CDATA[");
		sb.append(getEnd_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>initiation_date</column-name><column-value><![CDATA[");
		sb.append(getInitiation_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version_code</column-name><column-value><![CDATA[");
		sb.append(getVersion_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_translated</column-name><column-value><![CDATA[");
		sb.append(getIs_translated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_assessment_versionid</column-name><column-value><![CDATA[");
		sb.append(getParent_assessment_versionid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = site_assessment_versions.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			site_assessment_versions.class
		};
	private long _assessment_version_id;
	private long _stage_id;
	private long _assessment_id;
	private long _originalAssessment_id;
	private boolean _setOriginalAssessment_id;
	private Date _start_date;
	private Date _end_date;
	private long _userid;
	private long _originalUserid;
	private boolean _setOriginalUserid;
	private Date _initiation_date;
	private long _language;
	private double _version_code;
	private double _originalVersion_code;
	private boolean _setOriginalVersion_code;
	private boolean _is_translated;
	private long _parent_assessment_versionid;
	private long _columnBitmask;
	private site_assessment_versions _escapedModelProxy;
}