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

package com.iucn.whp.dbservice.model;

import com.iucn.whp.dbservice.service.contact_categoryLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class contact_categoryClp extends BaseModelImpl<contact_category>
	implements contact_category {
	public contact_categoryClp() {
	}

	public Class<?> getModelClass() {
		return contact_category.class;
	}

	public String getModelClassName() {
		return contact_category.class.getName();
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
		return _category_name;
	}

	public void setCategory_name(String category_name) {
		_category_name = category_name;
	}

	public BaseModel<?> getcontact_categoryRemoteModel() {
		return _contact_categoryRemoteModel;
	}

	public void setcontact_categoryRemoteModel(
		BaseModel<?> contact_categoryRemoteModel) {
		_contact_categoryRemoteModel = contact_categoryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			contact_categoryLocalServiceUtil.addcontact_category(this);
		}
		else {
			contact_categoryLocalServiceUtil.updatecontact_category(this);
		}
	}

	@Override
	public contact_category toEscapedModel() {
		return (contact_category)Proxy.newProxyInstance(contact_category.class.getClassLoader(),
			new Class[] { contact_category.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		contact_categoryClp clone = new contact_categoryClp();

		clone.setContact_category_id(getContact_category_id());
		clone.setCategory_name(getCategory_name());

		return clone;
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

		contact_categoryClp contact_category = null;

		try {
			contact_category = (contact_categoryClp)obj;
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

	private int _contact_category_id;
	private String _category_name;
	private BaseModel<?> _contact_categoryRemoteModel;
}