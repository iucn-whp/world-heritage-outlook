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

import com.iucn.whp.dbservice.service.current_state_trend_valuesLocalServiceUtil;

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
public class current_state_trend_valuesClp extends BaseModelImpl<current_state_trend_values>
	implements current_state_trend_values {
	public current_state_trend_valuesClp() {
	}

	public Class<?> getModelClass() {
		return current_state_trend_values.class;
	}

	public String getModelClassName() {
		return current_state_trend_values.class.getName();
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

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vn", getVn());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("state_trend_id", getState_trend_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Long state_trend_id = (Long)attributes.get("state_trend_id");

		if (state_trend_id != null) {
			setState_trend_id(state_trend_id);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getVn() {
		return _vn;
	}

	public void setVn(long vn) {
		_vn = vn;
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public long getState_trend_id() {
		return _state_trend_id;
	}

	public void setState_trend_id(long state_trend_id) {
		_state_trend_id = state_trend_id;
	}

	public BaseModel<?> getcurrent_state_trend_valuesRemoteModel() {
		return _current_state_trend_valuesRemoteModel;
	}

	public void setcurrent_state_trend_valuesRemoteModel(
		BaseModel<?> current_state_trend_valuesRemoteModel) {
		_current_state_trend_valuesRemoteModel = current_state_trend_valuesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			current_state_trend_valuesLocalServiceUtil.addcurrent_state_trend_values(this);
		}
		else {
			current_state_trend_valuesLocalServiceUtil.updatecurrent_state_trend_values(this);
		}
	}

	@Override
	public current_state_trend_values toEscapedModel() {
		return (current_state_trend_values)Proxy.newProxyInstance(current_state_trend_values.class.getClassLoader(),
			new Class[] { current_state_trend_values.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		current_state_trend_valuesClp clone = new current_state_trend_valuesClp();

		clone.setId(getId());
		clone.setVn(getVn());
		clone.setWhvalues_id(getWhvalues_id());
		clone.setState_trend_id(getState_trend_id());

		return clone;
	}

	public int compareTo(current_state_trend_values current_state_trend_values) {
		long primaryKey = current_state_trend_values.getPrimaryKey();

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

		current_state_trend_valuesClp current_state_trend_values = null;

		try {
			current_state_trend_values = (current_state_trend_valuesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = current_state_trend_values.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vn=");
		sb.append(getVn());
		sb.append(", whvalues_id=");
		sb.append(getWhvalues_id());
		sb.append(", state_trend_id=");
		sb.append(getState_trend_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.current_state_trend_values");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vn</column-name><column-value><![CDATA[");
		sb.append(getVn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>whvalues_id</column-name><column-value><![CDATA[");
		sb.append(getWhvalues_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_trend_id</column-name><column-value><![CDATA[");
		sb.append(getState_trend_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vn;
	private long _whvalues_id;
	private long _state_trend_id;
	private BaseModel<?> _current_state_trend_valuesRemoteModel;
}