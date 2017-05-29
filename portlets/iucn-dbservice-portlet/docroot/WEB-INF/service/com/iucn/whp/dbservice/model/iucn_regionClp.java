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

import com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil;

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
public class iucn_regionClp extends BaseModelImpl<iucn_region>
	implements iucn_region {
	public iucn_regionClp() {
	}

	public Class<?> getModelClass() {
		return iucn_region.class;
	}

	public String getModelClassName() {
		return iucn_region.class.getName();
	}

	public int getPrimaryKey() {
		return _iucn_region_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setIucn_region_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_iucn_region_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iucn_region_id", getIucn_region_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer iucn_region_id = (Integer)attributes.get("iucn_region_id");

		if (iucn_region_id != null) {
			setIucn_region_id(iucn_region_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	public int getIucn_region_id() {
		return _iucn_region_id;
	}

	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region_id = iucn_region_id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public BaseModel<?> getiucn_regionRemoteModel() {
		return _iucn_regionRemoteModel;
	}

	public void setiucn_regionRemoteModel(BaseModel<?> iucn_regionRemoteModel) {
		_iucn_regionRemoteModel = iucn_regionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			iucn_regionLocalServiceUtil.addiucn_region(this);
		}
		else {
			iucn_regionLocalServiceUtil.updateiucn_region(this);
		}
	}

	@Override
	public iucn_region toEscapedModel() {
		return (iucn_region)Proxy.newProxyInstance(iucn_region.class.getClassLoader(),
			new Class[] { iucn_region.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		iucn_regionClp clone = new iucn_regionClp();

		clone.setIucn_region_id(getIucn_region_id());
		clone.setName(getName());

		return clone;
	}

	public int compareTo(iucn_region iucn_region) {
		int primaryKey = iucn_region.getPrimaryKey();

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

		iucn_regionClp iucn_region = null;

		try {
			iucn_region = (iucn_regionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = iucn_region.getPrimaryKey();

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

		sb.append("{iucn_region_id=");
		sb.append(getIucn_region_id());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.iucn_region");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>iucn_region_id</column-name><column-value><![CDATA[");
		sb.append(getIucn_region_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _iucn_region_id;
	private String _name;
	private BaseModel<?> _iucn_regionRemoteModel;
}