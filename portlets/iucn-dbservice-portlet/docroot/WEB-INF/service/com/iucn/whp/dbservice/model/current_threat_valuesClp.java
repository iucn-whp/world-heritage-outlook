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

import com.iucn.whp.dbservice.service.current_threat_valuesLocalServiceUtil;

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
public class current_threat_valuesClp extends BaseModelImpl<current_threat_values>
	implements current_threat_values {
	public current_threat_valuesClp() {
	}

	public Class<?> getModelClass() {
		return current_threat_values.class;
	}

	public String getModelClassName() {
		return current_threat_values.class.getName();
	}

	public long getPrimaryKey() {
		return _current_threat_values_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setCurrent_threat_values_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_current_threat_values_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("current_threat_values_id", getCurrent_threat_values_id());
		attributes.put("current_threat_id", getCurrent_threat_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long current_threat_values_id = (Long)attributes.get(
				"current_threat_values_id");

		if (current_threat_values_id != null) {
			setCurrent_threat_values_id(current_threat_values_id);
		}

		Long current_threat_id = (Long)attributes.get("current_threat_id");

		if (current_threat_id != null) {
			setCurrent_threat_id(current_threat_id);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Boolean is_biodiv_whval = (Boolean)attributes.get("is_biodiv_whval");

		if (is_biodiv_whval != null) {
			setIs_biodiv_whval(is_biodiv_whval);
		}
	}

	public long getCurrent_threat_values_id() {
		return _current_threat_values_id;
	}

	public void setCurrent_threat_values_id(long current_threat_values_id) {
		_current_threat_values_id = current_threat_values_id;
	}

	public long getCurrent_threat_id() {
		return _current_threat_id;
	}

	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_id = current_threat_id;
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public boolean getIs_biodiv_whval() {
		return _is_biodiv_whval;
	}

	public boolean isIs_biodiv_whval() {
		return _is_biodiv_whval;
	}

	public void setIs_biodiv_whval(boolean is_biodiv_whval) {
		_is_biodiv_whval = is_biodiv_whval;
	}

	public BaseModel<?> getcurrent_threat_valuesRemoteModel() {
		return _current_threat_valuesRemoteModel;
	}

	public void setcurrent_threat_valuesRemoteModel(
		BaseModel<?> current_threat_valuesRemoteModel) {
		_current_threat_valuesRemoteModel = current_threat_valuesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			current_threat_valuesLocalServiceUtil.addcurrent_threat_values(this);
		}
		else {
			current_threat_valuesLocalServiceUtil.updatecurrent_threat_values(this);
		}
	}

	@Override
	public current_threat_values toEscapedModel() {
		return (current_threat_values)Proxy.newProxyInstance(current_threat_values.class.getClassLoader(),
			new Class[] { current_threat_values.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		current_threat_valuesClp clone = new current_threat_valuesClp();

		clone.setCurrent_threat_values_id(getCurrent_threat_values_id());
		clone.setCurrent_threat_id(getCurrent_threat_id());
		clone.setWhvalues_id(getWhvalues_id());
		clone.setIs_biodiv_whval(getIs_biodiv_whval());

		return clone;
	}

	public int compareTo(current_threat_values current_threat_values) {
		long primaryKey = current_threat_values.getPrimaryKey();

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

		current_threat_valuesClp current_threat_values = null;

		try {
			current_threat_values = (current_threat_valuesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = current_threat_values.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{current_threat_values_id=");
		sb.append(getCurrent_threat_values_id());
		sb.append(", current_threat_id=");
		sb.append(getCurrent_threat_id());
		sb.append(", whvalues_id=");
		sb.append(getWhvalues_id());
		sb.append(", is_biodiv_whval=");
		sb.append(getIs_biodiv_whval());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.current_threat_values");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>current_threat_values_id</column-name><column-value><![CDATA[");
		sb.append(getCurrent_threat_values_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_threat_id</column-name><column-value><![CDATA[");
		sb.append(getCurrent_threat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>whvalues_id</column-name><column-value><![CDATA[");
		sb.append(getWhvalues_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_biodiv_whval</column-name><column-value><![CDATA[");
		sb.append(getIs_biodiv_whval());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _current_threat_values_id;
	private long _current_threat_id;
	private long _whvalues_id;
	private boolean _is_biodiv_whval;
	private BaseModel<?> _current_threat_valuesRemoteModel;
}