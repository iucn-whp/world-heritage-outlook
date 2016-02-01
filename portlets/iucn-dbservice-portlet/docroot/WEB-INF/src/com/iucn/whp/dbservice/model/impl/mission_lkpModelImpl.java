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

import com.iucn.whp.dbservice.model.mission_lkp;
import com.iucn.whp.dbservice.model.mission_lkpModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the mission_lkp service. Represents a row in the &quot;whp_mission_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.mission_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link mission_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see mission_lkpImpl
 * @see com.iucn.whp.dbservice.model.mission_lkp
 * @see com.iucn.whp.dbservice.model.mission_lkpModel
 * @generated
 */
public class mission_lkpModelImpl extends BaseModelImpl<mission_lkp>
	implements mission_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mission_lkp model instance should use the {@link com.iucn.whp.dbservice.model.mission_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_mission_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mission_id", Types.INTEGER },
			{ "mission_type", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_mission_lkp (mission_id INTEGER not null primary key,mission_type VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_mission_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.mission_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.mission_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.mission_lkp"));

	public mission_lkpModelImpl() {
	}

	public int getPrimaryKey() {
		return _mission_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setMission_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_mission_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return mission_lkp.class;
	}

	public String getModelClassName() {
		return mission_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mission_id", getMission_id());
		attributes.put("mission_type", getMission_type());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer mission_id = (Integer)attributes.get("mission_id");

		if (mission_id != null) {
			setMission_id(mission_id);
		}

		String mission_type = (String)attributes.get("mission_type");

		if (mission_type != null) {
			setMission_type(mission_type);
		}
	}

	public int getMission_id() {
		return _mission_id;
	}

	public void setMission_id(int mission_id) {
		_mission_id = mission_id;
	}

	public String getMission_type() {
		if (_mission_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _mission_type;
		}
	}

	public void setMission_type(String mission_type) {
		_mission_type = mission_type;
	}

	@Override
	public mission_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (mission_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		mission_lkpImpl mission_lkpImpl = new mission_lkpImpl();

		mission_lkpImpl.setMission_id(getMission_id());
		mission_lkpImpl.setMission_type(getMission_type());

		mission_lkpImpl.resetOriginalValues();

		return mission_lkpImpl;
	}

	public int compareTo(mission_lkp mission_lkp) {
		int primaryKey = mission_lkp.getPrimaryKey();

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

		mission_lkp mission_lkp = null;

		try {
			mission_lkp = (mission_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = mission_lkp.getPrimaryKey();

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<mission_lkp> toCacheModel() {
		mission_lkpCacheModel mission_lkpCacheModel = new mission_lkpCacheModel();

		mission_lkpCacheModel.mission_id = getMission_id();

		mission_lkpCacheModel.mission_type = getMission_type();

		String mission_type = mission_lkpCacheModel.mission_type;

		if ((mission_type != null) && (mission_type.length() == 0)) {
			mission_lkpCacheModel.mission_type = null;
		}

		return mission_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{mission_id=");
		sb.append(getMission_id());
		sb.append(", mission_type=");
		sb.append(getMission_type());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.mission_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mission_id</column-name><column-value><![CDATA[");
		sb.append(getMission_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mission_type</column-name><column-value><![CDATA[");
		sb.append(getMission_type());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = mission_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			mission_lkp.class
		};
	private int _mission_id;
	private String _mission_type;
	private mission_lkp _escapedModelProxy;
}