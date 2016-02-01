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

import com.iucn.whp.dbservice.service.state_trend_whvaluesLocalServiceUtil;

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
public class state_trend_whvaluesClp extends BaseModelImpl<state_trend_whvalues>
	implements state_trend_whvalues {
	public state_trend_whvaluesClp() {
	}

	public Class<?> getModelClass() {
		return state_trend_whvalues.class;
	}

	public String getModelClassName() {
		return state_trend_whvalues.class.getName();
	}

	public long getPrimaryKey() {
		return _state_trend_whval_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setState_trend_whval_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_state_trend_whval_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_trend_whval_id", getState_trend_whval_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("state_id", getState_id());
		attributes.put("trend_id", getTrend_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_trend_whval_id = (Long)attributes.get("state_trend_whval_id");

		if (state_trend_whval_id != null) {
			setState_trend_whval_id(state_trend_whval_id);
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

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}
	}

	public long getState_trend_whval_id() {
		return _state_trend_whval_id;
	}

	public void setState_trend_whval_id(long state_trend_whval_id) {
		_state_trend_whval_id = state_trend_whval_id;
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

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public long getTrend_id() {
		return _trend_id;
	}

	public void setTrend_id(long trend_id) {
		_trend_id = trend_id;
	}

	public BaseModel<?> getstate_trend_whvaluesRemoteModel() {
		return _state_trend_whvaluesRemoteModel;
	}

	public void setstate_trend_whvaluesRemoteModel(
		BaseModel<?> state_trend_whvaluesRemoteModel) {
		_state_trend_whvaluesRemoteModel = state_trend_whvaluesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			state_trend_whvaluesLocalServiceUtil.addstate_trend_whvalues(this);
		}
		else {
			state_trend_whvaluesLocalServiceUtil.updatestate_trend_whvalues(this);
		}
	}

	@Override
	public state_trend_whvalues toEscapedModel() {
		return (state_trend_whvalues)Proxy.newProxyInstance(state_trend_whvalues.class.getClassLoader(),
			new Class[] { state_trend_whvalues.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		state_trend_whvaluesClp clone = new state_trend_whvaluesClp();

		clone.setState_trend_whval_id(getState_trend_whval_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setState_id(getState_id());
		clone.setTrend_id(getTrend_id());

		return clone;
	}

	public int compareTo(state_trend_whvalues state_trend_whvalues) {
		long primaryKey = state_trend_whvalues.getPrimaryKey();

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

		state_trend_whvaluesClp state_trend_whvalues = null;

		try {
			state_trend_whvalues = (state_trend_whvaluesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = state_trend_whvalues.getPrimaryKey();

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

		sb.append("{state_trend_whval_id=");
		sb.append(getState_trend_whval_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", trend_id=");
		sb.append(getTrend_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.state_trend_whvalues");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_trend_whval_id</column-name><column-value><![CDATA[");
		sb.append(getState_trend_whval_id());
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
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trend_id</column-name><column-value><![CDATA[");
		sb.append(getTrend_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _state_trend_whval_id;
	private long _assessment_version_id;
	private String _justification;
	private long _state_id;
	private long _trend_id;
	private BaseModel<?> _state_trend_whvaluesRemoteModel;
}