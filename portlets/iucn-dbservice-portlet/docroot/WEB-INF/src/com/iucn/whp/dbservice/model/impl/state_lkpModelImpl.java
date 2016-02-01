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

import com.iucn.whp.dbservice.model.state_lkp;
import com.iucn.whp.dbservice.model.state_lkpModel;

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
 * The base model implementation for the state_lkp service. Represents a row in the &quot;whp_state_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.state_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link state_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see state_lkpImpl
 * @see com.iucn.whp.dbservice.model.state_lkp
 * @see com.iucn.whp.dbservice.model.state_lkpModel
 * @generated
 */
public class state_lkpModelImpl extends BaseModelImpl<state_lkp>
	implements state_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a state_lkp model instance should use the {@link com.iucn.whp.dbservice.model.state_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_state_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "state_id", Types.BIGINT },
			{ "state_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_state_lkp (state_id LONG not null primary key,state_ VARCHAR(50) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_state_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.state_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.state_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.state_lkp"));

	public state_lkpModelImpl() {
	}

	public long getPrimaryKey() {
		return _state_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setState_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_state_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return state_lkp.class;
	}

	public String getModelClassName() {
		return state_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_id", getState_id());
		attributes.put("state", getState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	public void setState(String state) {
		_state = state;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			state_lkp.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public state_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (state_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		state_lkpImpl state_lkpImpl = new state_lkpImpl();

		state_lkpImpl.setState_id(getState_id());
		state_lkpImpl.setState(getState());

		state_lkpImpl.resetOriginalValues();

		return state_lkpImpl;
	}

	public int compareTo(state_lkp state_lkp) {
		long primaryKey = state_lkp.getPrimaryKey();

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

		state_lkp state_lkp = null;

		try {
			state_lkp = (state_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = state_lkp.getPrimaryKey();

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
	public CacheModel<state_lkp> toCacheModel() {
		state_lkpCacheModel state_lkpCacheModel = new state_lkpCacheModel();

		state_lkpCacheModel.state_id = getState_id();

		state_lkpCacheModel.state = getState();

		String state = state_lkpCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			state_lkpCacheModel.state = null;
		}

		return state_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{state_id=");
		sb.append(getState_id());
		sb.append(", state=");
		sb.append(getState());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.state_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = state_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			state_lkp.class
		};
	private long _state_id;
	private String _state;
	private state_lkp _escapedModelProxy;
}