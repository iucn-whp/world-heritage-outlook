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

import com.iucn.whp.dbservice.service.threat_summary_currentLocalServiceUtil;

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
public class threat_summary_currentClp extends BaseModelImpl<threat_summary_current>
	implements threat_summary_current {
	public threat_summary_currentClp() {
	}

	public Class<?> getModelClass() {
		return threat_summary_current.class;
	}

	public String getModelClassName() {
		return threat_summary_current.class.getName();
	}

	public long getPrimaryKey() {
		return _threat_sum_cur_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setThreat_sum_cur_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_threat_sum_cur_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threat_sum_cur_id", getThreat_sum_cur_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("overall_current", getOverall_current());
		attributes.put("threat_rating", getThreat_rating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long threat_sum_cur_id = (Long)attributes.get("threat_sum_cur_id");

		if (threat_sum_cur_id != null) {
			setThreat_sum_cur_id(threat_sum_cur_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String overall_current = (String)attributes.get("overall_current");

		if (overall_current != null) {
			setOverall_current(overall_current);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}
	}

	public long getThreat_sum_cur_id() {
		return _threat_sum_cur_id;
	}

	public void setThreat_sum_cur_id(long threat_sum_cur_id) {
		_threat_sum_cur_id = threat_sum_cur_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getOverall_current() {
		return _overall_current;
	}

	public void setOverall_current(String overall_current) {
		_overall_current = overall_current;
	}

	public long getThreat_rating() {
		return _threat_rating;
	}

	public void setThreat_rating(long threat_rating) {
		_threat_rating = threat_rating;
	}

	public BaseModel<?> getthreat_summary_currentRemoteModel() {
		return _threat_summary_currentRemoteModel;
	}

	public void setthreat_summary_currentRemoteModel(
		BaseModel<?> threat_summary_currentRemoteModel) {
		_threat_summary_currentRemoteModel = threat_summary_currentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			threat_summary_currentLocalServiceUtil.addthreat_summary_current(this);
		}
		else {
			threat_summary_currentLocalServiceUtil.updatethreat_summary_current(this);
		}
	}

	@Override
	public threat_summary_current toEscapedModel() {
		return (threat_summary_current)Proxy.newProxyInstance(threat_summary_current.class.getClassLoader(),
			new Class[] { threat_summary_current.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		threat_summary_currentClp clone = new threat_summary_currentClp();

		clone.setThreat_sum_cur_id(getThreat_sum_cur_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setOverall_current(getOverall_current());
		clone.setThreat_rating(getThreat_rating());

		return clone;
	}

	public int compareTo(threat_summary_current threat_summary_current) {
		long primaryKey = threat_summary_current.getPrimaryKey();

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

		threat_summary_currentClp threat_summary_current = null;

		try {
			threat_summary_current = (threat_summary_currentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = threat_summary_current.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{threat_sum_cur_id=");
		sb.append(getThreat_sum_cur_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", overall_current=");
		sb.append(getOverall_current());
		sb.append(", threat_rating=");
		sb.append(getThreat_rating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.threat_summary_current");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>threat_sum_cur_id</column-name><column-value><![CDATA[");
		sb.append(getThreat_sum_cur_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overall_current</column-name><column-value><![CDATA[");
		sb.append(getOverall_current());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_rating</column-name><column-value><![CDATA[");
		sb.append(getThreat_rating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _threat_sum_cur_id;
	private long _assessment_version_id;
	private String _overall_current;
	private long _threat_rating;
	private BaseModel<?> _threat_summary_currentRemoteModel;
}