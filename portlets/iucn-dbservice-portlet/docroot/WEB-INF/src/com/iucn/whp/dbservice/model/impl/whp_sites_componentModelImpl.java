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

import com.iucn.whp.dbservice.model.whp_sites_component;
import com.iucn.whp.dbservice.model.whp_sites_componentModel;

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
 * The base model implementation for the whp_sites_component service. Represents a row in the &quot;whp_whp_sites_component&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_sites_componentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_componentImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_componentImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_component
 * @see com.iucn.whp.dbservice.model.whp_sites_componentModel
 * @generated
 */
public class whp_sites_componentModelImpl extends BaseModelImpl<whp_sites_component>
	implements whp_sites_componentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_component model instance should use the {@link com.iucn.whp.dbservice.model.whp_sites_component} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_sites_component";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_sites_component_id", Types.BIGINT },
			{ "site_id", Types.BIGINT },
			{ "component", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_sites_component (whp_sites_component_id LONG not null primary key,site_id LONG,component VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_sites_component";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_component"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_component"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.whp_sites_component"),
			true);
	public static long SITE_ID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_sites_component"));

	public whp_sites_componentModelImpl() {
	}

	public long getPrimaryKey() {
		return _whp_sites_component_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_component_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_component_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return whp_sites_component.class;
	}

	public String getModelClassName() {
		return whp_sites_component.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_component_id", getWhp_sites_component_id());
		attributes.put("site_id", getSite_id());
		attributes.put("component", getComponent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_component_id = (Long)attributes.get(
				"whp_sites_component_id");

		if (whp_sites_component_id != null) {
			setWhp_sites_component_id(whp_sites_component_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String component = (String)attributes.get("component");

		if (component != null) {
			setComponent(component);
		}
	}

	public long getWhp_sites_component_id() {
		return _whp_sites_component_id;
	}

	public void setWhp_sites_component_id(long whp_sites_component_id) {
		_whp_sites_component_id = whp_sites_component_id;
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

	public String getComponent() {
		if (_component == null) {
			return StringPool.BLANK;
		}
		else {
			return _component;
		}
	}

	public void setComponent(String component) {
		_component = component;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			whp_sites_component.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public whp_sites_component toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_sites_component)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_sites_componentImpl whp_sites_componentImpl = new whp_sites_componentImpl();

		whp_sites_componentImpl.setWhp_sites_component_id(getWhp_sites_component_id());
		whp_sites_componentImpl.setSite_id(getSite_id());
		whp_sites_componentImpl.setComponent(getComponent());

		whp_sites_componentImpl.resetOriginalValues();

		return whp_sites_componentImpl;
	}

	public int compareTo(whp_sites_component whp_sites_component) {
		long primaryKey = whp_sites_component.getPrimaryKey();

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

		whp_sites_component whp_sites_component = null;

		try {
			whp_sites_component = (whp_sites_component)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_component.getPrimaryKey();

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
		whp_sites_componentModelImpl whp_sites_componentModelImpl = this;

		whp_sites_componentModelImpl._originalSite_id = whp_sites_componentModelImpl._site_id;

		whp_sites_componentModelImpl._setOriginalSite_id = false;

		whp_sites_componentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<whp_sites_component> toCacheModel() {
		whp_sites_componentCacheModel whp_sites_componentCacheModel = new whp_sites_componentCacheModel();

		whp_sites_componentCacheModel.whp_sites_component_id = getWhp_sites_component_id();

		whp_sites_componentCacheModel.site_id = getSite_id();

		whp_sites_componentCacheModel.component = getComponent();

		String component = whp_sites_componentCacheModel.component;

		if ((component != null) && (component.length() == 0)) {
			whp_sites_componentCacheModel.component = null;
		}

		return whp_sites_componentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_component_id=");
		sb.append(getWhp_sites_component_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", component=");
		sb.append(getComponent());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_component");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_component_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_component_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>component</column-name><column-value><![CDATA[");
		sb.append(getComponent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = whp_sites_component.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_sites_component.class
		};
	private long _whp_sites_component_id;
	private long _site_id;
	private long _originalSite_id;
	private boolean _setOriginalSite_id;
	private String _component;
	private long _columnBitmask;
	private whp_sites_component _escapedModelProxy;
}