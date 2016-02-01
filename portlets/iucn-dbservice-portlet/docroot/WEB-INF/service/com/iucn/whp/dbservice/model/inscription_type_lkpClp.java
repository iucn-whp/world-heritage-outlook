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

import com.iucn.whp.dbservice.service.inscription_type_lkpLocalServiceUtil;

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
public class inscription_type_lkpClp extends BaseModelImpl<inscription_type_lkp>
	implements inscription_type_lkp {
	public inscription_type_lkpClp() {
	}

	public Class<?> getModelClass() {
		return inscription_type_lkp.class;
	}

	public String getModelClassName() {
		return inscription_type_lkp.class.getName();
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
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public BaseModel<?> getinscription_type_lkpRemoteModel() {
		return _inscription_type_lkpRemoteModel;
	}

	public void setinscription_type_lkpRemoteModel(
		BaseModel<?> inscription_type_lkpRemoteModel) {
		_inscription_type_lkpRemoteModel = inscription_type_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			inscription_type_lkpLocalServiceUtil.addinscription_type_lkp(this);
		}
		else {
			inscription_type_lkpLocalServiceUtil.updateinscription_type_lkp(this);
		}
	}

	@Override
	public inscription_type_lkp toEscapedModel() {
		return (inscription_type_lkp)Proxy.newProxyInstance(inscription_type_lkp.class.getClassLoader(),
			new Class[] { inscription_type_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		inscription_type_lkpClp clone = new inscription_type_lkpClp();

		clone.setIncription_type_id(getIncription_type_id());
		clone.setType(getType());

		return clone;
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

		inscription_type_lkpClp inscription_type_lkp = null;

		try {
			inscription_type_lkp = (inscription_type_lkpClp)obj;
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

	private int _incription_type_id;
	private String _type;
	private BaseModel<?> _inscription_type_lkpRemoteModel;
}