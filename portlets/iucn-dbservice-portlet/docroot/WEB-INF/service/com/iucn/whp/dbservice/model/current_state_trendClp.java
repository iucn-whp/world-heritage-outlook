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

import com.iucn.whp.dbservice.service.current_state_trendLocalServiceUtil;

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
public class current_state_trendClp extends BaseModelImpl<current_state_trend>
	implements current_state_trend {
	public current_state_trendClp() {
	}

	public Class<?> getModelClass() {
		return current_state_trend.class;
	}

	public String getModelClassName() {
		return current_state_trend.class.getName();
	}

	public long getPrimaryKey() {
		return _state_trend_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setState_trend_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_state_trend_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_trend_id", getState_trend_id());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("trend_id", getTrend_id());
		attributes.put("state_id", getState_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_trend_id = (Long)attributes.get("state_trend_id");

		if (state_trend_id != null) {
			setState_trend_id(state_trend_id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Boolean is_biodiv_whval = (Boolean)attributes.get("is_biodiv_whval");

		if (is_biodiv_whval != null) {
			setIs_biodiv_whval(is_biodiv_whval);
		}
	}

	public long getState_trend_id() {
		return _state_trend_id;
	}

	public void setState_trend_id(long state_trend_id) {
		_state_trend_id = state_trend_id;
	}

	public long getVn() {
		return _vn;
	}

	public void setVn(long vn) {
		_vn = vn;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
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

	public BaseModel<?> getcurrent_state_trendRemoteModel() {
		return _current_state_trendRemoteModel;
	}

	public void setcurrent_state_trendRemoteModel(
		BaseModel<?> current_state_trendRemoteModel) {
		_current_state_trendRemoteModel = current_state_trendRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			current_state_trendLocalServiceUtil.addcurrent_state_trend(this);
		}
		else {
			current_state_trendLocalServiceUtil.updatecurrent_state_trend(this);
		}
	}

	@Override
	public current_state_trend toEscapedModel() {
		return (current_state_trend)Proxy.newProxyInstance(current_state_trend.class.getClassLoader(),
			new Class[] { current_state_trend.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		current_state_trendClp clone = new current_state_trendClp();

		clone.setState_trend_id(getState_trend_id());
		clone.setVn(getVn());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setTrend_id(getTrend_id());
		clone.setState_id(getState_id());
		clone.setIs_biodiv_whval(getIs_biodiv_whval());

		return clone;
	}

	public int compareTo(current_state_trend current_state_trend) {
		long primaryKey = current_state_trend.getPrimaryKey();

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

		current_state_trendClp current_state_trend = null;

		try {
			current_state_trend = (current_state_trendClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = current_state_trend.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{state_trend_id=");
		sb.append(getState_trend_id());
		sb.append(", vn=");
		sb.append(getVn());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", trend_id=");
		sb.append(getTrend_id());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", is_biodiv_whval=");
		sb.append(getIs_biodiv_whval());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.current_state_trend");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_trend_id</column-name><column-value><![CDATA[");
		sb.append(getState_trend_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vn</column-name><column-value><![CDATA[");
		sb.append(getVn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>justification</column-name><column-value><![CDATA[");
		sb.append(getJustification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trend_id</column-name><column-value><![CDATA[");
		sb.append(getTrend_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_biodiv_whval</column-name><column-value><![CDATA[");
		sb.append(getIs_biodiv_whval());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _state_trend_id;
	private long _vn;
	private long _assessment_version_id;
	private String _justification;
	private long _trend_id;
	private long _state_id;
	private boolean _is_biodiv_whval;
	private BaseModel<?> _current_state_trendRemoteModel;
}