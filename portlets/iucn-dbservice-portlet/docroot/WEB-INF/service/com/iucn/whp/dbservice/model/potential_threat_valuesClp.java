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

import com.iucn.whp.dbservice.service.potential_threat_valuesLocalServiceUtil;

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
public class potential_threat_valuesClp extends BaseModelImpl<potential_threat_values>
	implements potential_threat_values {
	public potential_threat_valuesClp() {
	}

	public Class<?> getModelClass() {
		return potential_threat_values.class;
	}

	public String getModelClassName() {
		return potential_threat_values.class.getName();
	}

	public long getPrimaryKey() {
		return _potential_threat_values_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPotential_threat_values_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_potential_threat_values_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("potential_threat_values_id",
			getPotential_threat_values_id());
		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long potential_threat_values_id = (Long)attributes.get(
				"potential_threat_values_id");

		if (potential_threat_values_id != null) {
			setPotential_threat_values_id(potential_threat_values_id);
		}

		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
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

	public long getPotential_threat_values_id() {
		return _potential_threat_values_id;
	}

	public void setPotential_threat_values_id(long potential_threat_values_id) {
		_potential_threat_values_id = potential_threat_values_id;
	}

	public long getPotential_threat_id() {
		return _potential_threat_id;
	}

	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_id = potential_threat_id;
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

	public BaseModel<?> getpotential_threat_valuesRemoteModel() {
		return _potential_threat_valuesRemoteModel;
	}

	public void setpotential_threat_valuesRemoteModel(
		BaseModel<?> potential_threat_valuesRemoteModel) {
		_potential_threat_valuesRemoteModel = potential_threat_valuesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			potential_threat_valuesLocalServiceUtil.addpotential_threat_values(this);
		}
		else {
			potential_threat_valuesLocalServiceUtil.updatepotential_threat_values(this);
		}
	}

	@Override
	public potential_threat_values toEscapedModel() {
		return (potential_threat_values)Proxy.newProxyInstance(potential_threat_values.class.getClassLoader(),
			new Class[] { potential_threat_values.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		potential_threat_valuesClp clone = new potential_threat_valuesClp();

		clone.setPotential_threat_values_id(getPotential_threat_values_id());
		clone.setPotential_threat_id(getPotential_threat_id());
		clone.setWhvalues_id(getWhvalues_id());
		clone.setIs_biodiv_whval(getIs_biodiv_whval());

		return clone;
	}

	public int compareTo(potential_threat_values potential_threat_values) {
		long primaryKey = potential_threat_values.getPrimaryKey();

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

		potential_threat_valuesClp potential_threat_values = null;

		try {
			potential_threat_values = (potential_threat_valuesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = potential_threat_values.getPrimaryKey();

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

		sb.append("{potential_threat_values_id=");
		sb.append(getPotential_threat_values_id());
		sb.append(", potential_threat_id=");
		sb.append(getPotential_threat_id());
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
		sb.append("com.iucn.whp.dbservice.model.potential_threat_values");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>potential_threat_values_id</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat_values_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>potential_threat_id</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat_id());
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

	private long _potential_threat_values_id;
	private long _potential_threat_id;
	private long _whvalues_id;
	private boolean _is_biodiv_whval;
	private BaseModel<?> _potential_threat_valuesRemoteModel;
}