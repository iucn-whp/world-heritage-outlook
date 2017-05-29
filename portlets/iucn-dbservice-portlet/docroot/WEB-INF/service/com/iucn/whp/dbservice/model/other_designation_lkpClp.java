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

import com.iucn.whp.dbservice.service.other_designation_lkpLocalServiceUtil;

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
public class other_designation_lkpClp extends BaseModelImpl<other_designation_lkp>
	implements other_designation_lkp {
	public other_designation_lkpClp() {
	}

	public Class<?> getModelClass() {
		return other_designation_lkp.class;
	}

	public String getModelClassName() {
		return other_designation_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _other_designations_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setOther_designations_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_other_designations_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("other_designations_id", getOther_designations_id());
		attributes.put("designation", getDesignation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer other_designations_id = (Integer)attributes.get(
				"other_designations_id");

		if (other_designations_id != null) {
			setOther_designations_id(other_designations_id);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}
	}

	public int getOther_designations_id() {
		return _other_designations_id;
	}

	public void setOther_designations_id(int other_designations_id) {
		_other_designations_id = other_designations_id;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public BaseModel<?> getother_designation_lkpRemoteModel() {
		return _other_designation_lkpRemoteModel;
	}

	public void setother_designation_lkpRemoteModel(
		BaseModel<?> other_designation_lkpRemoteModel) {
		_other_designation_lkpRemoteModel = other_designation_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			other_designation_lkpLocalServiceUtil.addother_designation_lkp(this);
		}
		else {
			other_designation_lkpLocalServiceUtil.updateother_designation_lkp(this);
		}
	}

	@Override
	public other_designation_lkp toEscapedModel() {
		return (other_designation_lkp)Proxy.newProxyInstance(other_designation_lkp.class.getClassLoader(),
			new Class[] { other_designation_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		other_designation_lkpClp clone = new other_designation_lkpClp();

		clone.setOther_designations_id(getOther_designations_id());
		clone.setDesignation(getDesignation());

		return clone;
	}

	public int compareTo(other_designation_lkp other_designation_lkp) {
		int primaryKey = other_designation_lkp.getPrimaryKey();

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

		other_designation_lkpClp other_designation_lkp = null;

		try {
			other_designation_lkp = (other_designation_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = other_designation_lkp.getPrimaryKey();

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

		sb.append("{other_designations_id=");
		sb.append(getOther_designations_id());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.other_designation_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>other_designations_id</column-name><column-value><![CDATA[");
		sb.append(getOther_designations_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _other_designations_id;
	private String _designation;
	private BaseModel<?> _other_designation_lkpRemoteModel;
}