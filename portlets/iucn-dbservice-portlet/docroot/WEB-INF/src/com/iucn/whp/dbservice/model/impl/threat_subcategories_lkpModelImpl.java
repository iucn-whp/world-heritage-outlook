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

import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkpModel;

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
 * The base model implementation for the threat_subcategories_lkp service. Represents a row in the &quot;whp_threat_subcategories_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.threat_subcategories_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link threat_subcategories_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see threat_subcategories_lkpImpl
 * @see com.iucn.whp.dbservice.model.threat_subcategories_lkp
 * @see com.iucn.whp.dbservice.model.threat_subcategories_lkpModel
 * @generated
 */
public class threat_subcategories_lkpModelImpl extends BaseModelImpl<threat_subcategories_lkp>
	implements threat_subcategories_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a threat_subcategories_lkp model instance should use the {@link com.iucn.whp.dbservice.model.threat_subcategories_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_threat_subcategories_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "threat_sub_category", Types.VARCHAR },
			{ "parent_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_threat_subcategories_lkp (id_ LONG not null primary key,threat_sub_category VARCHAR(100) null,parent_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_threat_subcategories_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.threat_subcategories_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.threat_subcategories_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.threat_subcategories_lkp"));

	public threat_subcategories_lkpModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return threat_subcategories_lkp.class;
	}

	public String getModelClassName() {
		return threat_subcategories_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("threat_sub_category", getThreat_sub_category());
		attributes.put("parent_id", getParent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String threat_sub_category = (String)attributes.get(
				"threat_sub_category");

		if (threat_sub_category != null) {
			setThreat_sub_category(threat_sub_category);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getThreat_sub_category() {
		if (_threat_sub_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _threat_sub_category;
		}
	}

	public void setThreat_sub_category(String threat_sub_category) {
		_threat_sub_category = threat_sub_category;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			threat_subcategories_lkp.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public threat_subcategories_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (threat_subcategories_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		threat_subcategories_lkpImpl threat_subcategories_lkpImpl = new threat_subcategories_lkpImpl();

		threat_subcategories_lkpImpl.setId(getId());
		threat_subcategories_lkpImpl.setThreat_sub_category(getThreat_sub_category());
		threat_subcategories_lkpImpl.setParent_id(getParent_id());

		threat_subcategories_lkpImpl.resetOriginalValues();

		return threat_subcategories_lkpImpl;
	}

	public int compareTo(threat_subcategories_lkp threat_subcategories_lkp) {
		long primaryKey = threat_subcategories_lkp.getPrimaryKey();

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

		threat_subcategories_lkp threat_subcategories_lkp = null;

		try {
			threat_subcategories_lkp = (threat_subcategories_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = threat_subcategories_lkp.getPrimaryKey();

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
	public CacheModel<threat_subcategories_lkp> toCacheModel() {
		threat_subcategories_lkpCacheModel threat_subcategories_lkpCacheModel = new threat_subcategories_lkpCacheModel();

		threat_subcategories_lkpCacheModel.id = getId();

		threat_subcategories_lkpCacheModel.threat_sub_category = getThreat_sub_category();

		String threat_sub_category = threat_subcategories_lkpCacheModel.threat_sub_category;

		if ((threat_sub_category != null) &&
				(threat_sub_category.length() == 0)) {
			threat_subcategories_lkpCacheModel.threat_sub_category = null;
		}

		threat_subcategories_lkpCacheModel.parent_id = getParent_id();

		return threat_subcategories_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", threat_sub_category=");
		sb.append(getThreat_sub_category());
		sb.append(", parent_id=");
		sb.append(getParent_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.threat_subcategories_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_sub_category</column-name><column-value><![CDATA[");
		sb.append(getThreat_sub_category());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_id</column-name><column-value><![CDATA[");
		sb.append(getParent_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = threat_subcategories_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			threat_subcategories_lkp.class
		};
	private long _id;
	private String _threat_sub_category;
	private long _parent_id;
	private threat_subcategories_lkp _escapedModelProxy;
}