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

import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.inscription_criteria_lkpModel;

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
 * The base model implementation for the inscription_criteria_lkp service. Represents a row in the &quot;whp_inscription_criteria_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.inscription_criteria_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link inscription_criteria_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see inscription_criteria_lkpImpl
 * @see com.iucn.whp.dbservice.model.inscription_criteria_lkp
 * @see com.iucn.whp.dbservice.model.inscription_criteria_lkpModel
 * @generated
 */
public class inscription_criteria_lkpModelImpl extends BaseModelImpl<inscription_criteria_lkp>
	implements inscription_criteria_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a inscription_criteria_lkp model instance should use the {@link com.iucn.whp.dbservice.model.inscription_criteria_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_inscription_criteria_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "criteria_id", Types.INTEGER },
			{ "criteria", Types.VARCHAR },
			{ "criteria_type", Types.VARCHAR },
			{ "criteria_desc", Types.VARCHAR },
			{ "criteria_title", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_inscription_criteria_lkp (criteria_id INTEGER not null primary key,criteria VARCHAR(75) null,criteria_type VARCHAR(20) null,criteria_desc VARCHAR(50) null,criteria_title VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_inscription_criteria_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.inscription_criteria_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.inscription_criteria_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.inscription_criteria_lkp"));

	public inscription_criteria_lkpModelImpl() {
	}

	public int getPrimaryKey() {
		return _criteria_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setCriteria_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_criteria_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return inscription_criteria_lkp.class;
	}

	public String getModelClassName() {
		return inscription_criteria_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_id", getCriteria_id());
		attributes.put("criteria", getCriteria());
		attributes.put("criteria_type", getCriteria_type());
		attributes.put("criteria_desc", getCriteria_desc());
		attributes.put("criteria_title", getCriteria_title());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer criteria_id = (Integer)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		String criteria = (String)attributes.get("criteria");

		if (criteria != null) {
			setCriteria(criteria);
		}

		String criteria_type = (String)attributes.get("criteria_type");

		if (criteria_type != null) {
			setCriteria_type(criteria_type);
		}

		String criteria_desc = (String)attributes.get("criteria_desc");

		if (criteria_desc != null) {
			setCriteria_desc(criteria_desc);
		}

		String criteria_title = (String)attributes.get("criteria_title");

		if (criteria_title != null) {
			setCriteria_title(criteria_title);
		}
	}

	public int getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(int criteria_id) {
		_criteria_id = criteria_id;
	}

	public String getCriteria() {
		if (_criteria == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria;
		}
	}

	public void setCriteria(String criteria) {
		_criteria = criteria;
	}

	public String getCriteria_type() {
		if (_criteria_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria_type;
		}
	}

	public void setCriteria_type(String criteria_type) {
		_criteria_type = criteria_type;
	}

	public String getCriteria_desc() {
		if (_criteria_desc == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria_desc;
		}
	}

	public void setCriteria_desc(String criteria_desc) {
		_criteria_desc = criteria_desc;
	}

	public String getCriteria_title() {
		if (_criteria_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria_title;
		}
	}

	public void setCriteria_title(String criteria_title) {
		_criteria_title = criteria_title;
	}

	@Override
	public inscription_criteria_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (inscription_criteria_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		inscription_criteria_lkpImpl inscription_criteria_lkpImpl = new inscription_criteria_lkpImpl();

		inscription_criteria_lkpImpl.setCriteria_id(getCriteria_id());
		inscription_criteria_lkpImpl.setCriteria(getCriteria());
		inscription_criteria_lkpImpl.setCriteria_type(getCriteria_type());
		inscription_criteria_lkpImpl.setCriteria_desc(getCriteria_desc());
		inscription_criteria_lkpImpl.setCriteria_title(getCriteria_title());

		inscription_criteria_lkpImpl.resetOriginalValues();

		return inscription_criteria_lkpImpl;
	}

	public int compareTo(inscription_criteria_lkp inscription_criteria_lkp) {
		int primaryKey = inscription_criteria_lkp.getPrimaryKey();

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

		inscription_criteria_lkp inscription_criteria_lkp = null;

		try {
			inscription_criteria_lkp = (inscription_criteria_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = inscription_criteria_lkp.getPrimaryKey();

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
	public CacheModel<inscription_criteria_lkp> toCacheModel() {
		inscription_criteria_lkpCacheModel inscription_criteria_lkpCacheModel = new inscription_criteria_lkpCacheModel();

		inscription_criteria_lkpCacheModel.criteria_id = getCriteria_id();

		inscription_criteria_lkpCacheModel.criteria = getCriteria();

		String criteria = inscription_criteria_lkpCacheModel.criteria;

		if ((criteria != null) && (criteria.length() == 0)) {
			inscription_criteria_lkpCacheModel.criteria = null;
		}

		inscription_criteria_lkpCacheModel.criteria_type = getCriteria_type();

		String criteria_type = inscription_criteria_lkpCacheModel.criteria_type;

		if ((criteria_type != null) && (criteria_type.length() == 0)) {
			inscription_criteria_lkpCacheModel.criteria_type = null;
		}

		inscription_criteria_lkpCacheModel.criteria_desc = getCriteria_desc();

		String criteria_desc = inscription_criteria_lkpCacheModel.criteria_desc;

		if ((criteria_desc != null) && (criteria_desc.length() == 0)) {
			inscription_criteria_lkpCacheModel.criteria_desc = null;
		}

		inscription_criteria_lkpCacheModel.criteria_title = getCriteria_title();

		String criteria_title = inscription_criteria_lkpCacheModel.criteria_title;

		if ((criteria_title != null) && (criteria_title.length() == 0)) {
			inscription_criteria_lkpCacheModel.criteria_title = null;
		}

		return inscription_criteria_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{criteria_id=");
		sb.append(getCriteria_id());
		sb.append(", criteria=");
		sb.append(getCriteria());
		sb.append(", criteria_type=");
		sb.append(getCriteria_type());
		sb.append(", criteria_desc=");
		sb.append(getCriteria_desc());
		sb.append(", criteria_title=");
		sb.append(getCriteria_title());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.inscription_criteria_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria</column-name><column-value><![CDATA[");
		sb.append(getCriteria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_type</column-name><column-value><![CDATA[");
		sb.append(getCriteria_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_desc</column-name><column-value><![CDATA[");
		sb.append(getCriteria_desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_title</column-name><column-value><![CDATA[");
		sb.append(getCriteria_title());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = inscription_criteria_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			inscription_criteria_lkp.class
		};
	private int _criteria_id;
	private String _criteria;
	private String _criteria_type;
	private String _criteria_desc;
	private String _criteria_title;
	private inscription_criteria_lkp _escapedModelProxy;
}