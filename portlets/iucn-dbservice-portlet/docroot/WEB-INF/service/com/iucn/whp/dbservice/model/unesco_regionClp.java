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

import com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil;

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
public class unesco_regionClp extends BaseModelImpl<unesco_region>
	implements unesco_region {
	public unesco_regionClp() {
	}

	public Class<?> getModelClass() {
		return unesco_region.class;
	}

	public String getModelClassName() {
		return unesco_region.class.getName();
	}

	public int getPrimaryKey() {
		return _unesco_region_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setUnesco_region_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_unesco_region_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unesco_region_id", getUnesco_region_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer unesco_region_id = (Integer)attributes.get("unesco_region_id");

		if (unesco_region_id != null) {
			setUnesco_region_id(unesco_region_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	public int getUnesco_region_id() {
		return _unesco_region_id;
	}

	public void setUnesco_region_id(int unesco_region_id) {
		_unesco_region_id = unesco_region_id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public BaseModel<?> getunesco_regionRemoteModel() {
		return _unesco_regionRemoteModel;
	}

	public void setunesco_regionRemoteModel(
		BaseModel<?> unesco_regionRemoteModel) {
		_unesco_regionRemoteModel = unesco_regionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			unesco_regionLocalServiceUtil.addunesco_region(this);
		}
		else {
			unesco_regionLocalServiceUtil.updateunesco_region(this);
		}
	}

	@Override
	public unesco_region toEscapedModel() {
		return (unesco_region)Proxy.newProxyInstance(unesco_region.class.getClassLoader(),
			new Class[] { unesco_region.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		unesco_regionClp clone = new unesco_regionClp();

		clone.setUnesco_region_id(getUnesco_region_id());
		clone.setName(getName());

		return clone;
	}

	public int compareTo(unesco_region unesco_region) {
		int primaryKey = unesco_region.getPrimaryKey();

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

		unesco_regionClp unesco_region = null;

		try {
			unesco_region = (unesco_regionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = unesco_region.getPrimaryKey();

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

		sb.append("{unesco_region_id=");
		sb.append(getUnesco_region_id());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.unesco_region");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>unesco_region_id</column-name><column-value><![CDATA[");
		sb.append(getUnesco_region_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _unesco_region_id;
	private String _name;
	private BaseModel<?> _unesco_regionRemoteModel;
}