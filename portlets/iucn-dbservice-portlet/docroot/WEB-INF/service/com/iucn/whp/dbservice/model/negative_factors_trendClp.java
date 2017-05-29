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

import com.iucn.whp.dbservice.service.negative_factors_trendLocalServiceUtil;

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
public class negative_factors_trendClp extends BaseModelImpl<negative_factors_trend>
	implements negative_factors_trend {
	public negative_factors_trendClp() {
	}

	public Class<?> getModelClass() {
		return negative_factors_trend.class;
	}

	public String getModelClassName() {
		return negative_factors_trend.class.getName();
	}

	public long getPrimaryKey() {
		return _trend_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTrend_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_trend_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trend_id", getTrend_id());
		attributes.put("trend", getTrend());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}

		String trend = (String)attributes.get("trend");

		if (trend != null) {
			setTrend(trend);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	public String getTrend() {
		return _trend;
	}

	public void setTrend(String trend) {
		_trend = trend;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getnegative_factors_trendRemoteModel() {
		return _negative_factors_trendRemoteModel;
	}

	public void setnegative_factors_trendRemoteModel(
		BaseModel<?> negative_factors_trendRemoteModel) {
		_negative_factors_trendRemoteModel = negative_factors_trendRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			negative_factors_trendLocalServiceUtil.addnegative_factors_trend(this);
		}
		else {
			negative_factors_trendLocalServiceUtil.updatenegative_factors_trend(this);
		}
	}

	@Override
	public negative_factors_trend toEscapedModel() {
		return (negative_factors_trend)Proxy.newProxyInstance(negative_factors_trend.class.getClassLoader(),
			new Class[] { negative_factors_trend.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		negative_factors_trendClp clone = new negative_factors_trendClp();

		clone.setTrend_id(getTrend_id());
		clone.setTrend(getTrend());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(negative_factors_trend negative_factors_trend) {
		long primaryKey = negative_factors_trend.getPrimaryKey();

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

		negative_factors_trendClp negative_factors_trend = null;

		try {
			negative_factors_trend = (negative_factors_trendClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = negative_factors_trend.getPrimaryKey();

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

		sb.append("{trend_id=");
		sb.append(getTrend_id());
		sb.append(", trend=");
		sb.append(getTrend());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.negative_factors_trend");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>trend_id</column-name><column-value><![CDATA[");
		sb.append(getTrend_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trend</column-name><column-value><![CDATA[");
		sb.append(getTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _trend_id;
	private String _trend;
	private String _description;
	private BaseModel<?> _negative_factors_trendRemoteModel;
}