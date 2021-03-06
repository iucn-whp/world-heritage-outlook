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

import com.iucn.whp.dbservice.model.whp_criteria_lkp;
import com.iucn.whp.dbservice.model.whp_criteria_lkpModel;

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
 * The base model implementation for the whp_criteria_lkp service. Represents a row in the &quot;whp_whp_criteria_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_criteria_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_criteria_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_criteria_lkpImpl
 * @see com.iucn.whp.dbservice.model.whp_criteria_lkp
 * @see com.iucn.whp.dbservice.model.whp_criteria_lkpModel
 * @generated
 */
public class whp_criteria_lkpModelImpl extends BaseModelImpl<whp_criteria_lkp>
	implements whp_criteria_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_criteria_lkp model instance should use the {@link com.iucn.whp.dbservice.model.whp_criteria_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_criteria_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "criterion", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_criteria_lkp (id_ LONG not null primary key,criterion VARCHAR(5) null,description VARCHAR(200) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_criteria_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_criteria_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_criteria_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_criteria_lkp"));

	public whp_criteria_lkpModelImpl() {
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
		return whp_criteria_lkp.class;
	}

	public String getModelClassName() {
		return whp_criteria_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("criterion", getCriterion());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String criterion = (String)attributes.get("criterion");

		if (criterion != null) {
			setCriterion(criterion);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getCriterion() {
		if (_criterion == null) {
			return StringPool.BLANK;
		}
		else {
			return _criterion;
		}
	}

	public void setCriterion(String criterion) {
		_criterion = criterion;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			whp_criteria_lkp.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public whp_criteria_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_criteria_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_criteria_lkpImpl whp_criteria_lkpImpl = new whp_criteria_lkpImpl();

		whp_criteria_lkpImpl.setId(getId());
		whp_criteria_lkpImpl.setCriterion(getCriterion());
		whp_criteria_lkpImpl.setDescription(getDescription());

		whp_criteria_lkpImpl.resetOriginalValues();

		return whp_criteria_lkpImpl;
	}

	public int compareTo(whp_criteria_lkp whp_criteria_lkp) {
		long primaryKey = whp_criteria_lkp.getPrimaryKey();

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

		whp_criteria_lkp whp_criteria_lkp = null;

		try {
			whp_criteria_lkp = (whp_criteria_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_criteria_lkp.getPrimaryKey();

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
	public CacheModel<whp_criteria_lkp> toCacheModel() {
		whp_criteria_lkpCacheModel whp_criteria_lkpCacheModel = new whp_criteria_lkpCacheModel();

		whp_criteria_lkpCacheModel.id = getId();

		whp_criteria_lkpCacheModel.criterion = getCriterion();

		String criterion = whp_criteria_lkpCacheModel.criterion;

		if ((criterion != null) && (criterion.length() == 0)) {
			whp_criteria_lkpCacheModel.criterion = null;
		}

		whp_criteria_lkpCacheModel.description = getDescription();

		String description = whp_criteria_lkpCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			whp_criteria_lkpCacheModel.description = null;
		}

		return whp_criteria_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", criterion=");
		sb.append(getCriterion());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_criteria_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criterion</column-name><column-value><![CDATA[");
		sb.append(getCriterion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = whp_criteria_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_criteria_lkp.class
		};
	private long _id;
	private String _criterion;
	private String _description;
	private whp_criteria_lkp _escapedModelProxy;
}