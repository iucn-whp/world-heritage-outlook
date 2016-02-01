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

import com.iucn.whp.dbservice.model.inscription_type_lkp;
import com.iucn.whp.dbservice.model.inscription_type_lkpModel;

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
 * The base model implementation for the inscription_type_lkp service. Represents a row in the &quot;whp_inscription_type_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.inscription_type_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link inscription_type_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see inscription_type_lkpImpl
 * @see com.iucn.whp.dbservice.model.inscription_type_lkp
 * @see com.iucn.whp.dbservice.model.inscription_type_lkpModel
 * @generated
 */
public class inscription_type_lkpModelImpl extends BaseModelImpl<inscription_type_lkp>
	implements inscription_type_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a inscription_type_lkp model instance should use the {@link com.iucn.whp.dbservice.model.inscription_type_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_inscription_type_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "incription_type_id", Types.INTEGER },
			{ "type_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_inscription_type_lkp (incription_type_id INTEGER not null primary key,type_ VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_inscription_type_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.inscription_type_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.inscription_type_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.inscription_type_lkp"));

	public inscription_type_lkpModelImpl() {
	}

	public int getPrimaryKey() {
		return _incription_type_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setIncription_type_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_incription_type_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return inscription_type_lkp.class;
	}

	public String getModelClassName() {
		return inscription_type_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("incription_type_id", getIncription_type_id());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer incription_type_id = (Integer)attributes.get(
				"incription_type_id");

		if (incription_type_id != null) {
			setIncription_type_id(incription_type_id);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	public int getIncription_type_id() {
		return _incription_type_id;
	}

	public void setIncription_type_id(int incription_type_id) {
		_incription_type_id = incription_type_id;
	}

	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	public void setType(String type) {
		_type = type;
	}

	@Override
	public inscription_type_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (inscription_type_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		inscription_type_lkpImpl inscription_type_lkpImpl = new inscription_type_lkpImpl();

		inscription_type_lkpImpl.setIncription_type_id(getIncription_type_id());
		inscription_type_lkpImpl.setType(getType());

		inscription_type_lkpImpl.resetOriginalValues();

		return inscription_type_lkpImpl;
	}

	public int compareTo(inscription_type_lkp inscription_type_lkp) {
		int primaryKey = inscription_type_lkp.getPrimaryKey();

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

		inscription_type_lkp inscription_type_lkp = null;

		try {
			inscription_type_lkp = (inscription_type_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = inscription_type_lkp.getPrimaryKey();

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
	public CacheModel<inscription_type_lkp> toCacheModel() {
		inscription_type_lkpCacheModel inscription_type_lkpCacheModel = new inscription_type_lkpCacheModel();

		inscription_type_lkpCacheModel.incription_type_id = getIncription_type_id();

		inscription_type_lkpCacheModel.type = getType();

		String type = inscription_type_lkpCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			inscription_type_lkpCacheModel.type = null;
		}

		return inscription_type_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{incription_type_id=");
		sb.append(getIncription_type_id());
		sb.append(", type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.inscription_type_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>incription_type_id</column-name><column-value><![CDATA[");
		sb.append(getIncription_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = inscription_type_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			inscription_type_lkp.class
		};
	private int _incription_type_id;
	private String _type;
	private inscription_type_lkp _escapedModelProxy;
}