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

import com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil;

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
public class protection_managementClp extends BaseModelImpl<protection_management>
	implements protection_management {
	public protection_managementClp() {
	}

	public Class<?> getModelClass() {
		return protection_management.class;
	}

	public String getModelClassName() {
		return protection_management.class.getName();
	}

	public long getPrimaryKey() {
		return _pm_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPm_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_pm_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pm_id", getPm_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("topic_id", getTopic_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pm_id = (Long)attributes.get("pm_id");

		if (pm_id != null) {
			setPm_id(pm_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long topic_id = (Long)attributes.get("topic_id");

		if (topic_id != null) {
			setTopic_id(topic_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long rating = (Long)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	public long getPm_id() {
		return _pm_id;
	}

	public void setPm_id(long pm_id) {
		_pm_id = pm_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getTopic_id() {
		return _topic_id;
	}

	public void setTopic_id(long topic_id) {
		_topic_id = topic_id;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getRating() {
		return _rating;
	}

	public void setRating(long rating) {
		_rating = rating;
	}

	public BaseModel<?> getprotection_managementRemoteModel() {
		return _protection_managementRemoteModel;
	}

	public void setprotection_managementRemoteModel(
		BaseModel<?> protection_managementRemoteModel) {
		_protection_managementRemoteModel = protection_managementRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			protection_managementLocalServiceUtil.addprotection_management(this);
		}
		else {
			protection_managementLocalServiceUtil.updateprotection_management(this);
		}
	}

	@Override
	public protection_management toEscapedModel() {
		return (protection_management)Proxy.newProxyInstance(protection_management.class.getClassLoader(),
			new Class[] { protection_management.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		protection_managementClp clone = new protection_managementClp();

		clone.setPm_id(getPm_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setTopic_id(getTopic_id());
		clone.setJustification(getJustification());
		clone.setRating(getRating());

		return clone;
	}

	public int compareTo(protection_management protection_management) {
		long primaryKey = protection_management.getPrimaryKey();

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

		protection_managementClp protection_management = null;

		try {
			protection_management = (protection_managementClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = protection_management.getPrimaryKey();

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

		sb.append("{pm_id=");
		sb.append(getPm_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", topic_id=");
		sb.append(getTopic_id());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", rating=");
		sb.append(getRating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.protection_management");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pm_id</column-name><column-value><![CDATA[");
		sb.append(getPm_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>topic_id</column-name><column-value><![CDATA[");
		sb.append(getTopic_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>justification</column-name><column-value><![CDATA[");
		sb.append(getJustification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rating</column-name><column-value><![CDATA[");
		sb.append(getRating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _pm_id;
	private long _assessment_version_id;
	private long _topic_id;
	private String _justification;
	private long _rating;
	private BaseModel<?> _protection_managementRemoteModel;
}