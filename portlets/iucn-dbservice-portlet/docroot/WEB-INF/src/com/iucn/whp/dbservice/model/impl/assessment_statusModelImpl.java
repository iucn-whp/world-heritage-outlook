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

import com.iucn.whp.dbservice.model.assessment_status;
import com.iucn.whp.dbservice.model.assessment_statusModel;

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

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the assessment_status service. Represents a row in the &quot;whp_assessment_status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.assessment_statusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link assessment_statusImpl}.
 * </p>
 *
 * @author alok.sen
 * @see assessment_statusImpl
 * @see com.iucn.whp.dbservice.model.assessment_status
 * @see com.iucn.whp.dbservice.model.assessment_statusModel
 * @generated
 */
public class assessment_statusModelImpl extends BaseModelImpl<assessment_status>
	implements assessment_statusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assessment_status model instance should use the {@link com.iucn.whp.dbservice.model.assessment_status} interface instead.
	 */
	public static final String TABLE_NAME = "whp_assessment_status";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statusid", Types.BIGINT },
			{ "status", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_assessment_status (statusid LONG not null primary key,status VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_assessment_status";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.assessment_status"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.assessment_status"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.assessment_status"));

	public assessment_statusModelImpl() {
	}

	public long getPrimaryKey() {
		return _statusid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStatusid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_statusid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return assessment_status.class;
	}

	public String getModelClassName() {
		return assessment_status.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusid", getStatusid());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusid = (Long)attributes.get("statusid");

		if (statusid != null) {
			setStatusid(statusid);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	public long getStatusid() {
		return _statusid;
	}

	public void setStatusid(long statusid) {
		_statusid = statusid;
	}

	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	public void setStatus(String status) {
		_status = status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			assessment_status.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public assessment_status toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (assessment_status)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		assessment_statusImpl assessment_statusImpl = new assessment_statusImpl();

		assessment_statusImpl.setStatusid(getStatusid());
		assessment_statusImpl.setStatus(getStatus());

		assessment_statusImpl.resetOriginalValues();

		return assessment_statusImpl;
	}

	public int compareTo(assessment_status assessment_status) {
		long primaryKey = assessment_status.getPrimaryKey();

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

		assessment_status assessment_status = null;

		try {
			assessment_status = (assessment_status)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_status.getPrimaryKey();

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
	}

	@Override
	public CacheModel<assessment_status> toCacheModel() {
		assessment_statusCacheModel assessment_statusCacheModel = new assessment_statusCacheModel();

		assessment_statusCacheModel.statusid = getStatusid();

		assessment_statusCacheModel.status = getStatus();

		String status = assessment_statusCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			assessment_statusCacheModel.status = null;
		}

		return assessment_statusCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{statusid=");
		sb.append(getStatusid());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_status");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statusid</column-name><column-value><![CDATA[");
		sb.append(getStatusid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = assessment_status.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			assessment_status.class
		};
	private long _statusid;
	private String _status;
	private assessment_status _escapedModelProxy;
}