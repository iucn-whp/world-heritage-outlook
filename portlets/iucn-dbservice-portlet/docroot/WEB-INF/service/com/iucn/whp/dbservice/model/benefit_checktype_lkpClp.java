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

import com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil;

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
public class benefit_checktype_lkpClp extends BaseModelImpl<benefit_checktype_lkp>
	implements benefit_checktype_lkp {
	public benefit_checktype_lkpClp() {
	}

	public Class<?> getModelClass() {
		return benefit_checktype_lkp.class;
	}

	public String getModelClassName() {
		return benefit_checktype_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _benefit_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBenefit_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_benefit_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefit_id", getBenefit_id());
		attributes.put("benefit_checktype", getBenefit_checktype());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefit_id = (Long)attributes.get("benefit_id");

		if (benefit_id != null) {
			setBenefit_id(benefit_id);
		}

		String benefit_checktype = (String)attributes.get("benefit_checktype");

		if (benefit_checktype != null) {
			setBenefit_checktype(benefit_checktype);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	public long getBenefit_id() {
		return _benefit_id;
	}

	public void setBenefit_id(long benefit_id) {
		_benefit_id = benefit_id;
	}

	public String getBenefit_checktype() {
		return _benefit_checktype;
	}

	public void setBenefit_checktype(String benefit_checktype) {
		_benefit_checktype = benefit_checktype;
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

	public BaseModel<?> getbenefit_checktype_lkpRemoteModel() {
		return _benefit_checktype_lkpRemoteModel;
	}

	public void setbenefit_checktype_lkpRemoteModel(
		BaseModel<?> benefit_checktype_lkpRemoteModel) {
		_benefit_checktype_lkpRemoteModel = benefit_checktype_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefit_checktype_lkpLocalServiceUtil.addbenefit_checktype_lkp(this);
		}
		else {
			benefit_checktype_lkpLocalServiceUtil.updatebenefit_checktype_lkp(this);
		}
	}

	@Override
	public benefit_checktype_lkp toEscapedModel() {
		return (benefit_checktype_lkp)Proxy.newProxyInstance(benefit_checktype_lkp.class.getClassLoader(),
			new Class[] { benefit_checktype_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefit_checktype_lkpClp clone = new benefit_checktype_lkpClp();

		clone.setBenefit_id(getBenefit_id());
		clone.setBenefit_checktype(getBenefit_checktype());
		clone.setActive(getActive());

		return clone;
	}

	public int compareTo(benefit_checktype_lkp benefit_checktype_lkp) {
		long primaryKey = benefit_checktype_lkp.getPrimaryKey();

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

		benefit_checktype_lkpClp benefit_checktype_lkp = null;

		try {
			benefit_checktype_lkp = (benefit_checktype_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefit_checktype_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{benefit_id=");
		sb.append(getBenefit_id());
		sb.append(", benefit_checktype=");
		sb.append(getBenefit_checktype());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefit_checktype_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefit_id</column-name><column-value><![CDATA[");
		sb.append(getBenefit_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefit_checktype</column-name><column-value><![CDATA[");
		sb.append(getBenefit_checktype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _benefit_id;
	private String _benefit_checktype;
	private boolean _active;
	private BaseModel<?> _benefit_checktype_lkpRemoteModel;
}