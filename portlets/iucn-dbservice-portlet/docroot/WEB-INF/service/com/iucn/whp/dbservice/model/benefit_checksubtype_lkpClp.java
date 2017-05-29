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

import com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalServiceUtil;

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
public class benefit_checksubtype_lkpClp extends BaseModelImpl<benefit_checksubtype_lkp>
	implements benefit_checksubtype_lkp {
	public benefit_checksubtype_lkpClp() {
	}

	public Class<?> getModelClass() {
		return benefit_checksubtype_lkp.class;
	}

	public String getModelClassName() {
		return benefit_checksubtype_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _subbenefit_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setSubbenefit_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_subbenefit_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subbenefit_id", getSubbenefit_id());
		attributes.put("benefit_checksubtype", getBenefit_checksubtype());
		attributes.put("parent_id", getParent_id());
		attributes.put("position", getPosition());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subbenefit_id = (Long)attributes.get("subbenefit_id");

		if (subbenefit_id != null) {
			setSubbenefit_id(subbenefit_id);
		}

		String benefit_checksubtype = (String)attributes.get(
				"benefit_checksubtype");

		if (benefit_checksubtype != null) {
			setBenefit_checksubtype(benefit_checksubtype);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}

		Long position = (Long)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	public long getSubbenefit_id() {
		return _subbenefit_id;
	}

	public void setSubbenefit_id(long subbenefit_id) {
		_subbenefit_id = subbenefit_id;
	}

	public String getBenefit_checksubtype() {
		return _benefit_checksubtype;
	}

	public void setBenefit_checksubtype(String benefit_checksubtype) {
		_benefit_checksubtype = benefit_checksubtype;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	public long getPosition() {
		return _position;
	}

	public void setPosition(long position) {
		_position = position;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public BaseModel<?> getbenefit_checksubtype_lkpRemoteModel() {
		return _benefit_checksubtype_lkpRemoteModel;
	}

	public void setbenefit_checksubtype_lkpRemoteModel(
		BaseModel<?> benefit_checksubtype_lkpRemoteModel) {
		_benefit_checksubtype_lkpRemoteModel = benefit_checksubtype_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefit_checksubtype_lkpLocalServiceUtil.addbenefit_checksubtype_lkp(this);
		}
		else {
			benefit_checksubtype_lkpLocalServiceUtil.updatebenefit_checksubtype_lkp(this);
		}
	}

	@Override
	public benefit_checksubtype_lkp toEscapedModel() {
		return (benefit_checksubtype_lkp)Proxy.newProxyInstance(benefit_checksubtype_lkp.class.getClassLoader(),
			new Class[] { benefit_checksubtype_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefit_checksubtype_lkpClp clone = new benefit_checksubtype_lkpClp();

		clone.setSubbenefit_id(getSubbenefit_id());
		clone.setBenefit_checksubtype(getBenefit_checksubtype());
		clone.setParent_id(getParent_id());
		clone.setPosition(getPosition());
		clone.setActive(getActive());

		return clone;
	}

	public int compareTo(benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		long primaryKey = benefit_checksubtype_lkp.getPrimaryKey();

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

		benefit_checksubtype_lkpClp benefit_checksubtype_lkp = null;

		try {
			benefit_checksubtype_lkp = (benefit_checksubtype_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefit_checksubtype_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{subbenefit_id=");
		sb.append(getSubbenefit_id());
		sb.append(", benefit_checksubtype=");
		sb.append(getBenefit_checksubtype());
		sb.append(", parent_id=");
		sb.append(getParent_id());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefit_checksubtype_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subbenefit_id</column-name><column-value><![CDATA[");
		sb.append(getSubbenefit_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefit_checksubtype</column-name><column-value><![CDATA[");
		sb.append(getBenefit_checksubtype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_id</column-name><column-value><![CDATA[");
		sb.append(getParent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _subbenefit_id;
	private String _benefit_checksubtype;
	private long _parent_id;
	private long _position;
	private boolean _active;
	private BaseModel<?> _benefit_checksubtype_lkpRemoteModel;
}