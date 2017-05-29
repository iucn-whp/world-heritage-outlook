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

import com.iucn.whp.dbservice.service.mission_lkpLocalServiceUtil;

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
public class mission_lkpClp extends BaseModelImpl<mission_lkp>
	implements mission_lkp {
	public mission_lkpClp() {
	}

	public Class<?> getModelClass() {
		return mission_lkp.class;
	}

	public String getModelClassName() {
		return mission_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _mission_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setMission_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_mission_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mission_id", getMission_id());
		attributes.put("mission_type", getMission_type());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer mission_id = (Integer)attributes.get("mission_id");

		if (mission_id != null) {
			setMission_id(mission_id);
		}

		String mission_type = (String)attributes.get("mission_type");

		if (mission_type != null) {
			setMission_type(mission_type);
		}
	}

	public int getMission_id() {
		return _mission_id;
	}

	public void setMission_id(int mission_id) {
		_mission_id = mission_id;
	}

	public String getMission_type() {
		return _mission_type;
	}

	public void setMission_type(String mission_type) {
		_mission_type = mission_type;
	}

	public BaseModel<?> getmission_lkpRemoteModel() {
		return _mission_lkpRemoteModel;
	}

	public void setmission_lkpRemoteModel(BaseModel<?> mission_lkpRemoteModel) {
		_mission_lkpRemoteModel = mission_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			mission_lkpLocalServiceUtil.addmission_lkp(this);
		}
		else {
			mission_lkpLocalServiceUtil.updatemission_lkp(this);
		}
	}

	@Override
	public mission_lkp toEscapedModel() {
		return (mission_lkp)Proxy.newProxyInstance(mission_lkp.class.getClassLoader(),
			new Class[] { mission_lkp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		mission_lkpClp clone = new mission_lkpClp();

		clone.setMission_id(getMission_id());
		clone.setMission_type(getMission_type());

		return clone;
	}

	public int compareTo(mission_lkp mission_lkp) {
		int primaryKey = mission_lkp.getPrimaryKey();

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

		mission_lkpClp mission_lkp = null;

		try {
			mission_lkp = (mission_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = mission_lkp.getPrimaryKey();

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

		sb.append("{mission_id=");
		sb.append(getMission_id());
		sb.append(", mission_type=");
		sb.append(getMission_type());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.mission_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mission_id</column-name><column-value><![CDATA[");
		sb.append(getMission_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mission_type</column-name><column-value><![CDATA[");
		sb.append(getMission_type());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _mission_id;
	private String _mission_type;
	private BaseModel<?> _mission_lkpRemoteModel;
}