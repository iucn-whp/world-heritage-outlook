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

import com.iucn.whp.dbservice.model.potential_threat_assessment_cat;
import com.iucn.whp.dbservice.model.potential_threat_assessment_catModel;

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

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the potential_threat_assessment_cat service. Represents a row in the &quot;whp_potential_threat_assessment_cat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.potential_threat_assessment_catModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link potential_threat_assessment_catImpl}.
 * </p>
 *
 * @author alok.sen
 * @see potential_threat_assessment_catImpl
 * @see com.iucn.whp.dbservice.model.potential_threat_assessment_cat
 * @see com.iucn.whp.dbservice.model.potential_threat_assessment_catModel
 * @generated
 */
public class potential_threat_assessment_catModelImpl extends BaseModelImpl<potential_threat_assessment_cat>
	implements potential_threat_assessment_catModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a potential_threat_assessment_cat model instance should use the {@link com.iucn.whp.dbservice.model.potential_threat_assessment_cat} interface instead.
	 */
	public static final String TABLE_NAME = "whp_potential_threat_assessment_cat";
	public static final Object[][] TABLE_COLUMNS = {
			{ "pot_threat_cat_id", Types.BIGINT },
			{ "potential_threat_id", Types.BIGINT },
			{ "category_id", Types.BIGINT },
			{ "sub_cat_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_potential_threat_assessment_cat (pot_threat_cat_id LONG not null primary key,potential_threat_id LONG,category_id LONG,sub_cat_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_potential_threat_assessment_cat";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.potential_threat_assessment_cat"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.potential_threat_assessment_cat"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.potential_threat_assessment_cat"),
			true);
	public static long CATEGORY_ID_COLUMN_BITMASK = 1L;
	public static long POTENTIAL_THREAT_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.potential_threat_assessment_cat"));

	public potential_threat_assessment_catModelImpl() {
	}

	public long getPrimaryKey() {
		return _pot_threat_cat_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPot_threat_cat_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_pot_threat_cat_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return potential_threat_assessment_cat.class;
	}

	public String getModelClassName() {
		return potential_threat_assessment_cat.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pot_threat_cat_id", getPot_threat_cat_id());
		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("sub_cat_id", getSub_cat_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pot_threat_cat_id = (Long)attributes.get("pot_threat_cat_id");

		if (pot_threat_cat_id != null) {
			setPot_threat_cat_id(pot_threat_cat_id);
		}

		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
		}

		Long category_id = (Long)attributes.get("category_id");

		if (category_id != null) {
			setCategory_id(category_id);
		}

		Long sub_cat_id = (Long)attributes.get("sub_cat_id");

		if (sub_cat_id != null) {
			setSub_cat_id(sub_cat_id);
		}
	}

	public long getPot_threat_cat_id() {
		return _pot_threat_cat_id;
	}

	public void setPot_threat_cat_id(long pot_threat_cat_id) {
		_pot_threat_cat_id = pot_threat_cat_id;
	}

	public long getPotential_threat_id() {
		return _potential_threat_id;
	}

	public void setPotential_threat_id(long potential_threat_id) {
		_columnBitmask |= POTENTIAL_THREAT_ID_COLUMN_BITMASK;

		if (!_setOriginalPotential_threat_id) {
			_setOriginalPotential_threat_id = true;

			_originalPotential_threat_id = _potential_threat_id;
		}

		_potential_threat_id = potential_threat_id;
	}

	public long getOriginalPotential_threat_id() {
		return _originalPotential_threat_id;
	}

	public long getCategory_id() {
		return _category_id;
	}

	public void setCategory_id(long category_id) {
		_columnBitmask |= CATEGORY_ID_COLUMN_BITMASK;

		if (!_setOriginalCategory_id) {
			_setOriginalCategory_id = true;

			_originalCategory_id = _category_id;
		}

		_category_id = category_id;
	}

	public long getOriginalCategory_id() {
		return _originalCategory_id;
	}

	public long getSub_cat_id() {
		return _sub_cat_id;
	}

	public void setSub_cat_id(long sub_cat_id) {
		_sub_cat_id = sub_cat_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			potential_threat_assessment_cat.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public potential_threat_assessment_cat toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (potential_threat_assessment_cat)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		potential_threat_assessment_catImpl potential_threat_assessment_catImpl = new potential_threat_assessment_catImpl();

		potential_threat_assessment_catImpl.setPot_threat_cat_id(getPot_threat_cat_id());
		potential_threat_assessment_catImpl.setPotential_threat_id(getPotential_threat_id());
		potential_threat_assessment_catImpl.setCategory_id(getCategory_id());
		potential_threat_assessment_catImpl.setSub_cat_id(getSub_cat_id());

		potential_threat_assessment_catImpl.resetOriginalValues();

		return potential_threat_assessment_catImpl;
	}

	public int compareTo(
		potential_threat_assessment_cat potential_threat_assessment_cat) {
		long primaryKey = potential_threat_assessment_cat.getPrimaryKey();

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

		potential_threat_assessment_cat potential_threat_assessment_cat = null;

		try {
			potential_threat_assessment_cat = (potential_threat_assessment_cat)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = potential_threat_assessment_cat.getPrimaryKey();

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
		potential_threat_assessment_catModelImpl potential_threat_assessment_catModelImpl =
			this;

		potential_threat_assessment_catModelImpl._originalPotential_threat_id = potential_threat_assessment_catModelImpl._potential_threat_id;

		potential_threat_assessment_catModelImpl._setOriginalPotential_threat_id = false;

		potential_threat_assessment_catModelImpl._originalCategory_id = potential_threat_assessment_catModelImpl._category_id;

		potential_threat_assessment_catModelImpl._setOriginalCategory_id = false;

		potential_threat_assessment_catModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<potential_threat_assessment_cat> toCacheModel() {
		potential_threat_assessment_catCacheModel potential_threat_assessment_catCacheModel =
			new potential_threat_assessment_catCacheModel();

		potential_threat_assessment_catCacheModel.pot_threat_cat_id = getPot_threat_cat_id();

		potential_threat_assessment_catCacheModel.potential_threat_id = getPotential_threat_id();

		potential_threat_assessment_catCacheModel.category_id = getCategory_id();

		potential_threat_assessment_catCacheModel.sub_cat_id = getSub_cat_id();

		return potential_threat_assessment_catCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{pot_threat_cat_id=");
		sb.append(getPot_threat_cat_id());
		sb.append(", potential_threat_id=");
		sb.append(getPotential_threat_id());
		sb.append(", category_id=");
		sb.append(getCategory_id());
		sb.append(", sub_cat_id=");
		sb.append(getSub_cat_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.potential_threat_assessment_cat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pot_threat_cat_id</column-name><column-value><![CDATA[");
		sb.append(getPot_threat_cat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>potential_threat_id</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category_id</column-name><column-value><![CDATA[");
		sb.append(getCategory_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sub_cat_id</column-name><column-value><![CDATA[");
		sb.append(getSub_cat_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = potential_threat_assessment_cat.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			potential_threat_assessment_cat.class
		};
	private long _pot_threat_cat_id;
	private long _potential_threat_id;
	private long _originalPotential_threat_id;
	private boolean _setOriginalPotential_threat_id;
	private long _category_id;
	private long _originalCategory_id;
	private boolean _setOriginalCategory_id;
	private long _sub_cat_id;
	private long _columnBitmask;
	private potential_threat_assessment_cat _escapedModelProxy;
}