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

import com.iucn.whp.dbservice.model.reinforced_monitoring;
import com.iucn.whp.dbservice.model.reinforced_monitoringModel;

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
 * The base model implementation for the reinforced_monitoring service. Represents a row in the &quot;whp_reinforced_monitoring&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.reinforced_monitoringModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link reinforced_monitoringImpl}.
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringImpl
 * @see com.iucn.whp.dbservice.model.reinforced_monitoring
 * @see com.iucn.whp.dbservice.model.reinforced_monitoringModel
 * @generated
 */
public class reinforced_monitoringModelImpl extends BaseModelImpl<reinforced_monitoring>
	implements reinforced_monitoringModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a reinforced_monitoring model instance should use the {@link com.iucn.whp.dbservice.model.reinforced_monitoring} interface instead.
	 */
	public static final String TABLE_NAME = "whp_reinforced_monitoring";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_sites_reinforced_monitoring_id", Types.BIGINT },
			{ "site_id", Types.BIGINT },
			{ "reinforced_date", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_reinforced_monitoring (whp_sites_reinforced_monitoring_id LONG not null primary key,site_id LONG,reinforced_date DATE null)";
	public static final String TABLE_SQL_DROP = "drop table whp_reinforced_monitoring";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.reinforced_monitoring"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.reinforced_monitoring"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.reinforced_monitoring"));

	public reinforced_monitoringModelImpl() {
	}

	public long getPrimaryKey() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_reinforced_monitoring_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_reinforced_monitoring_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return reinforced_monitoring.class;
	}

	public String getModelClassName() {
		return reinforced_monitoring.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_reinforced_monitoring_id",
			getWhp_sites_reinforced_monitoring_id());
		attributes.put("site_id", getSite_id());
		attributes.put("reinforced_date", getReinforced_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_reinforced_monitoring_id = (Long)attributes.get(
				"whp_sites_reinforced_monitoring_id");

		if (whp_sites_reinforced_monitoring_id != null) {
			setWhp_sites_reinforced_monitoring_id(whp_sites_reinforced_monitoring_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Date reinforced_date = (Date)attributes.get("reinforced_date");

		if (reinforced_date != null) {
			setReinforced_date(reinforced_date);
		}
	}

	public long getWhp_sites_reinforced_monitoring_id() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setWhp_sites_reinforced_monitoring_id(
		long whp_sites_reinforced_monitoring_id) {
		_whp_sites_reinforced_monitoring_id = whp_sites_reinforced_monitoring_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public Date getReinforced_date() {
		return _reinforced_date;
	}

	public void setReinforced_date(Date reinforced_date) {
		_reinforced_date = reinforced_date;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			reinforced_monitoring.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public reinforced_monitoring toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (reinforced_monitoring)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		reinforced_monitoringImpl reinforced_monitoringImpl = new reinforced_monitoringImpl();

		reinforced_monitoringImpl.setWhp_sites_reinforced_monitoring_id(getWhp_sites_reinforced_monitoring_id());
		reinforced_monitoringImpl.setSite_id(getSite_id());
		reinforced_monitoringImpl.setReinforced_date(getReinforced_date());

		reinforced_monitoringImpl.resetOriginalValues();

		return reinforced_monitoringImpl;
	}

	public int compareTo(reinforced_monitoring reinforced_monitoring) {
		long primaryKey = reinforced_monitoring.getPrimaryKey();

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

		reinforced_monitoring reinforced_monitoring = null;

		try {
			reinforced_monitoring = (reinforced_monitoring)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = reinforced_monitoring.getPrimaryKey();

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
	public CacheModel<reinforced_monitoring> toCacheModel() {
		reinforced_monitoringCacheModel reinforced_monitoringCacheModel = new reinforced_monitoringCacheModel();

		reinforced_monitoringCacheModel.whp_sites_reinforced_monitoring_id = getWhp_sites_reinforced_monitoring_id();

		reinforced_monitoringCacheModel.site_id = getSite_id();

		Date reinforced_date = getReinforced_date();

		if (reinforced_date != null) {
			reinforced_monitoringCacheModel.reinforced_date = reinforced_date.getTime();
		}
		else {
			reinforced_monitoringCacheModel.reinforced_date = Long.MIN_VALUE;
		}

		return reinforced_monitoringCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_reinforced_monitoring_id=");
		sb.append(getWhp_sites_reinforced_monitoring_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", reinforced_date=");
		sb.append(getReinforced_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.reinforced_monitoring");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_reinforced_monitoring_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_reinforced_monitoring_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reinforced_date</column-name><column-value><![CDATA[");
		sb.append(getReinforced_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = reinforced_monitoring.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			reinforced_monitoring.class
		};
	private long _whp_sites_reinforced_monitoring_id;
	private long _site_id;
	private Date _reinforced_date;
	private reinforced_monitoring _escapedModelProxy;
}