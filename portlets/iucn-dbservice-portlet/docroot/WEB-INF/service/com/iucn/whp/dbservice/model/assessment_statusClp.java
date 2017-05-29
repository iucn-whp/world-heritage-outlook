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

import com.iucn.whp.dbservice.service.assessment_statusLocalServiceUtil;

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
public class assessment_statusClp extends BaseModelImpl<assessment_status>
	implements assessment_status {
	public assessment_statusClp() {
	}

	public Class<?> getModelClass() {
		return assessment_status.class;
	}

	public String getModelClassName() {
		return assessment_status.class.getName();
	}

	public long getPrimaryKey() {
		return _statusid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStatusid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_statusid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusid", getStatusid());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusid = (Long)attributes.get("statusid");

		if (statusid != null) {
			setStatusid(statusid);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	public long getStatusid() {
		return _statusid;
	}

	public void setStatusid(long statusid) {
		_statusid = statusid;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public BaseModel<?> getassessment_statusRemoteModel() {
		return _assessment_statusRemoteModel;
	}

	public void setassessment_statusRemoteModel(
		BaseModel<?> assessment_statusRemoteModel) {
		_assessment_statusRemoteModel = assessment_statusRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_statusLocalServiceUtil.addassessment_status(this);
		}
		else {
			assessment_statusLocalServiceUtil.updateassessment_status(this);
		}
	}

	@Override
	public assessment_status toEscapedModel() {
		return (assessment_status)Proxy.newProxyInstance(assessment_status.class.getClassLoader(),
			new Class[] { assessment_status.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_statusClp clone = new assessment_statusClp();

		clone.setStatusid(getStatusid());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(assessment_status assessment_status) {
		long primaryKey = assessment_status.getPrimaryKey();

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

		assessment_statusClp assessment_status = null;

		try {
			assessment_status = (assessment_statusClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_status.getPrimaryKey();

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

		sb.append("{statusid=");
		sb.append(getStatusid());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_status");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statusid</column-name><column-value><![CDATA[");
		sb.append(getStatusid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _statusid;
	private String _status;
	private BaseModel<?> _assessment_statusRemoteModel;
}