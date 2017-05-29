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

import com.iucn.whp.dbservice.service.negative_factors_level_impactLocalServiceUtil;

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
public class negative_factors_level_impactClp extends BaseModelImpl<negative_factors_level_impact>
	implements negative_factors_level_impact {
	public negative_factors_level_impactClp() {
	}

	public Class<?> getModelClass() {
		return negative_factors_level_impact.class;
	}

	public String getModelClassName() {
		return negative_factors_level_impact.class.getName();
	}

	public long getPrimaryKey() {
		return _level_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setLevel_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_level_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("level_id", getLevel_id());
		attributes.put("level_impact", getLevel_impact());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long level_id = (Long)attributes.get("level_id");

		if (level_id != null) {
			setLevel_id(level_id);
		}

		String level_impact = (String)attributes.get("level_impact");

		if (level_impact != null) {
			setLevel_impact(level_impact);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getLevel_id() {
		return _level_id;
	}

	public void setLevel_id(long level_id) {
		_level_id = level_id;
	}

	public String getLevel_impact() {
		return _level_impact;
	}

	public void setLevel_impact(String level_impact) {
		_level_impact = level_impact;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getnegative_factors_level_impactRemoteModel() {
		return _negative_factors_level_impactRemoteModel;
	}

	public void setnegative_factors_level_impactRemoteModel(
		BaseModel<?> negative_factors_level_impactRemoteModel) {
		_negative_factors_level_impactRemoteModel = negative_factors_level_impactRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			negative_factors_level_impactLocalServiceUtil.addnegative_factors_level_impact(this);
		}
		else {
			negative_factors_level_impactLocalServiceUtil.updatenegative_factors_level_impact(this);
		}
	}

	@Override
	public negative_factors_level_impact toEscapedModel() {
		return (negative_factors_level_impact)Proxy.newProxyInstance(negative_factors_level_impact.class.getClassLoader(),
			new Class[] { negative_factors_level_impact.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		negative_factors_level_impactClp clone = new negative_factors_level_impactClp();

		clone.setLevel_id(getLevel_id());
		clone.setLevel_impact(getLevel_impact());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(
		negative_factors_level_impact negative_factors_level_impact) {
		long primaryKey = negative_factors_level_impact.getPrimaryKey();

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

		negative_factors_level_impactClp negative_factors_level_impact = null;

		try {
			negative_factors_level_impact = (negative_factors_level_impactClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = negative_factors_level_impact.getPrimaryKey();

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

		sb.append("{level_id=");
		sb.append(getLevel_id());
		sb.append(", level_impact=");
		sb.append(getLevel_impact());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.negative_factors_level_impact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>level_id</column-name><column-value><![CDATA[");
		sb.append(getLevel_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level_impact</column-name><column-value><![CDATA[");
		sb.append(getLevel_impact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _level_id;
	private String _level_impact;
	private String _description;
	private BaseModel<?> _negative_factors_level_impactRemoteModel;
}