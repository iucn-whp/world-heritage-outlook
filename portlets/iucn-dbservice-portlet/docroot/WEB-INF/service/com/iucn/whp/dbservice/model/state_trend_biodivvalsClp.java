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

import com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil;

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
public class state_trend_biodivvalsClp extends BaseModelImpl<state_trend_biodivvals>
	implements state_trend_biodivvals {
	public state_trend_biodivvalsClp() {
	}

	public Class<?> getModelClass() {
		return state_trend_biodivvals.class;
	}

	public String getModelClassName() {
		return state_trend_biodivvals.class.getName();
	}

	public long getPrimaryKey() {
		return _state_trend_biodivvals_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setState_trend_biodivvals_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_state_trend_biodivvals_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_trend_biodivvals_id",
			getState_trend_biodivvals_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("state_id", getState_id());
		attributes.put("trend_id", getTrend_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_trend_biodivvals_id = (Long)attributes.get(
				"state_trend_biodivvals_id");

		if (state_trend_biodivvals_id != null) {
			setState_trend_biodivvals_id(state_trend_biodivvals_id);
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

	public long getState_trend_biodivvals_id() {
		return _state_trend_biodivvals_id;
	}

	public void setState_trend_biodivvals_id(long state_trend_biodivvals_id) {
		_state_trend_biodivvals_id = state_trend_biodivvals_id;
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

	public BaseModel<?> getstate_trend_biodivvalsRemoteModel() {
		return _state_trend_biodivvalsRemoteModel;
	}

	public void setstate_trend_biodivvalsRemoteModel(
		BaseModel<?> state_trend_biodivvalsRemoteModel) {
		_state_trend_biodivvalsRemoteModel = state_trend_biodivvalsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			state_trend_biodivvalsLocalServiceUtil.addstate_trend_biodivvals(this);
		}
		else {
			state_trend_biodivvalsLocalServiceUtil.updatestate_trend_biodivvals(this);
		}
	}

	@Override
	public state_trend_biodivvals toEscapedModel() {
		return (state_trend_biodivvals)Proxy.newProxyInstance(state_trend_biodivvals.class.getClassLoader(),
			new Class[] { state_trend_biodivvals.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		state_trend_biodivvalsClp clone = new state_trend_biodivvalsClp();

		clone.setState_trend_biodivvals_id(getState_trend_biodivvals_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setState_id(getState_id());
		clone.setTrend_id(getTrend_id());

		return clone;
	}

	public int compareTo(state_trend_biodivvals state_trend_biodivvals) {
		long primaryKey = state_trend_biodivvals.getPrimaryKey();

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

		state_trend_biodivvalsClp state_trend_biodivvals = null;

		try {
			state_trend_biodivvals = (state_trend_biodivvalsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = state_trend_biodivvals.getPrimaryKey();

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

		sb.append("{state_trend_biodivvals_id=");
		sb.append(getState_trend_biodivvals_id());
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
		sb.append("com.iucn.whp.dbservice.model.state_trend_biodivvals");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_trend_biodivvals_id</column-name><column-value><![CDATA[");
		sb.append(getState_trend_biodivvals_id());
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

	private long _state_trend_biodivvals_id;
	private long _assessment_version_id;
	private String _justification;
	private long _state_id;
	private long _trend_id;
	private BaseModel<?> _state_trend_biodivvalsRemoteModel;
}