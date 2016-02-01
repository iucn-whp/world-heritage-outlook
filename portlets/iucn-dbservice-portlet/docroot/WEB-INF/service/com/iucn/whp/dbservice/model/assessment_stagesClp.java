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

import com.iucn.whp.dbservice.service.assessment_stagesLocalServiceUtil;

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
public class assessment_stagesClp extends BaseModelImpl<assessment_stages>
	implements assessment_stages {
	public assessment_stagesClp() {
	}

	public Class<?> getModelClass() {
		return assessment_stages.class;
	}

	public String getModelClassName() {
		return assessment_stages.class.getName();
	}

	public long getPrimaryKey() {
		return _stageid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStageid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_stageid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stageid", getStageid());
		attributes.put("stage", getStage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stageid = (Long)attributes.get("stageid");

		if (stageid != null) {
			setStageid(stageid);
		}

		String stage = (String)attributes.get("stage");

		if (stage != null) {
			setStage(stage);
		}
	}

	public long getStageid() {
		return _stageid;
	}

	public void setStageid(long stageid) {
		_stageid = stageid;
	}

	public String getStage() {
		return _stage;
	}

	public void setStage(String stage) {
		_stage = stage;
	}

	public BaseModel<?> getassessment_stagesRemoteModel() {
		return _assessment_stagesRemoteModel;
	}

	public void setassessment_stagesRemoteModel(
		BaseModel<?> assessment_stagesRemoteModel) {
		_assessment_stagesRemoteModel = assessment_stagesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_stagesLocalServiceUtil.addassessment_stages(this);
		}
		else {
			assessment_stagesLocalServiceUtil.updateassessment_stages(this);
		}
	}

	@Override
	public assessment_stages toEscapedModel() {
		return (assessment_stages)Proxy.newProxyInstance(assessment_stages.class.getClassLoader(),
			new Class[] { assessment_stages.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_stagesClp clone = new assessment_stagesClp();

		clone.setStageid(getStageid());
		clone.setStage(getStage());

		return clone;
	}

	public int compareTo(assessment_stages assessment_stages) {
		long primaryKey = assessment_stages.getPrimaryKey();

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

		assessment_stagesClp assessment_stages = null;

		try {
			assessment_stages = (assessment_stagesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_stages.getPrimaryKey();

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

		sb.append("{stageid=");
		sb.append(getStageid());
		sb.append(", stage=");
		sb.append(getStage());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_stages");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stageid</column-name><column-value><![CDATA[");
		sb.append(getStageid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stage</column-name><column-value><![CDATA[");
		sb.append(getStage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _stageid;
	private String _stage;
	private BaseModel<?> _assessment_stagesRemoteModel;
}