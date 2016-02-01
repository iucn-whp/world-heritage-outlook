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

import com.iucn.whp.dbservice.service.state_lkpLocalServiceUtil;

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
public class state_lkpClp extends BaseModelImpl<state_lkp> implements state_lkp {
	public state_lkpClp() {
	}

	public Class<?> getModelClass() {
		return state_lkp.class;
	}

	public String getModelClassName() {
		return state_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _state_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setState_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_state_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_id", getState_id());
		attributes.put("state", getState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public BaseModel<?> getstate_lkpRemoteModel() {
		return _state_lkpRemoteModel;
	}

	public void setstate_lkpRemoteModel(BaseModel<?> state_lkpRemoteModel) {
		_state_lkpRemoteModel = state_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			state_lkpLocalServiceUtil.addstate_lkp(this);
		}
		else {
			state_lkpLocalServiceUtil.updatestate_lkp(this);
		}
	}

	@Override
	public state_lkp toEscapedModel() {
		return (state_lkp)Proxy.newProxyInstance(state_lkp.class.getClassLoader(),
			new Class[] { state_lkp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		state_lkpClp clone = new state_lkpClp();

		clone.setState_id(getState_id());
		clone.setState(getState());

		return clone;
	}

	public int compareTo(state_lkp state_lkp) {
		long primaryKey = state_lkp.getPrimaryKey();

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

		state_lkpClp state_lkp = null;

		try {
			state_lkp = (state_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = state_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{state_id=");
		sb.append(getState_id());
		sb.append(", state=");
		sb.append(getState());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.state_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _state_id;
	private String _state;
	private BaseModel<?> _state_lkpRemoteModel;
}