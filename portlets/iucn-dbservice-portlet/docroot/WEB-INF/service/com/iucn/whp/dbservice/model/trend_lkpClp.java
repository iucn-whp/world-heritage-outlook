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

import com.iucn.whp.dbservice.service.trend_lkpLocalServiceUtil;

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
public class trend_lkpClp extends BaseModelImpl<trend_lkp> implements trend_lkp {
	public trend_lkpClp() {
	}

	public Class<?> getModelClass() {
		return trend_lkp.class;
	}

	public String getModelClassName() {
		return trend_lkp.class.getName();
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

	public BaseModel<?> gettrend_lkpRemoteModel() {
		return _trend_lkpRemoteModel;
	}

	public void settrend_lkpRemoteModel(BaseModel<?> trend_lkpRemoteModel) {
		_trend_lkpRemoteModel = trend_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			trend_lkpLocalServiceUtil.addtrend_lkp(this);
		}
		else {
			trend_lkpLocalServiceUtil.updatetrend_lkp(this);
		}
	}

	@Override
	public trend_lkp toEscapedModel() {
		return (trend_lkp)Proxy.newProxyInstance(trend_lkp.class.getClassLoader(),
			new Class[] { trend_lkp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trend_lkpClp clone = new trend_lkpClp();

		clone.setTrend_id(getTrend_id());
		clone.setTrend(getTrend());

		return clone;
	}

	public int compareTo(trend_lkp trend_lkp) {
		long primaryKey = trend_lkp.getPrimaryKey();

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

		trend_lkpClp trend_lkp = null;

		try {
			trend_lkp = (trend_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = trend_lkp.getPrimaryKey();

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

		sb.append("{trend_id=");
		sb.append(getTrend_id());
		sb.append(", trend=");
		sb.append(getTrend());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.trend_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>trend_id</column-name><column-value><![CDATA[");
		sb.append(getTrend_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trend</column-name><column-value><![CDATA[");
		sb.append(getTrend());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _trend_id;
	private String _trend;
	private BaseModel<?> _trend_lkpRemoteModel;
}