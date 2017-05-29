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

import com.iucn.whp.dbservice.model.contact_category;
import com.iucn.whp.dbservice.model.contact_categoryModel;

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
 * The base model implementation for the contact_category service. Represents a row in the &quot;whp_contact_category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.contact_categoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact_categoryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see contact_categoryImpl
 * @see com.iucn.whp.dbservice.model.contact_category
 * @see com.iucn.whp.dbservice.model.contact_categoryModel
 * @generated
 */
public class contact_categoryModelImpl extends BaseModelImpl<contact_category>
	implements contact_categoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact_category model instance should use the {@link com.iucn.whp.dbservice.model.contact_category} interface instead.
	 */
	public static final String TABLE_NAME = "whp_contact_category";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contact_category_id", Types.INTEGER },
			{ "category_name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_contact_category (contact_category_id INTEGER not null primary key,category_name VARCHAR(200) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_contact_category";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.contact_category"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.contact_category"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.contact_category"));

	public contact_categoryModelImpl() {
	}

	public int getPrimaryKey() {
		return _contact_category_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setContact_category_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_contact_category_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return contact_category.class;
	}

	public String getModelClassName() {
		return contact_category.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contact_category_id", getContact_category_id());
		attributes.put("category_name", getCategory_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer contact_category_id = (Integer)attributes.get(
				"contact_category_id");

		if (contact_category_id != null) {
			setContact_category_id(contact_category_id);
		}

		String category_name = (String)attributes.get("category_name");

		if (category_name != null) {
			setCategory_name(category_name);
		}
	}

	public int getContact_category_id() {
		return _contact_category_id;
	}

	public void setContact_category_id(int contact_category_id) {
		_contact_category_id = contact_category_id;
	}

	public String getCategory_name() {
		if (_category_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _category_name;
		}
	}

	public void setCategory_name(String category_name) {
		_category_name = category_name;
	}

	@Override
	public contact_category toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (contact_category)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		contact_categoryImpl contact_categoryImpl = new contact_categoryImpl();

		contact_categoryImpl.setContact_category_id(getContact_category_id());
		contact_categoryImpl.setCategory_name(getCategory_name());

		contact_categoryImpl.resetOriginalValues();

		return contact_categoryImpl;
	}

	public int compareTo(contact_category contact_category) {
		int primaryKey = contact_category.getPrimaryKey();

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

		contact_category contact_category = null;

		try {
			contact_category = (contact_category)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = contact_category.getPrimaryKey();

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
	public CacheModel<contact_category> toCacheModel() {
		contact_categoryCacheModel contact_categoryCacheModel = new contact_categoryCacheModel();

		contact_categoryCacheModel.contact_category_id = getContact_category_id();

		contact_categoryCacheModel.category_name = getCategory_name();

		String category_name = contact_categoryCacheModel.category_name;

		if ((category_name != null) && (category_name.length() == 0)) {
			contact_categoryCacheModel.category_name = null;
		}

		return contact_categoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{contact_category_id=");
		sb.append(getContact_category_id());
		sb.append(", category_name=");
		sb.append(getCategory_name());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.contact_category");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contact_category_id</column-name><column-value><![CDATA[");
		sb.append(getContact_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category_name</column-name><column-value><![CDATA[");
		sb.append(getCategory_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = contact_category.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			contact_category.class
		};
	private int _contact_category_id;
	private String _category_name;
	private contact_category _escapedModelProxy;
}