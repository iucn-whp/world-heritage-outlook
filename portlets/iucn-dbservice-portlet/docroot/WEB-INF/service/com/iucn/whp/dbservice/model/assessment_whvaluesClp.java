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

import com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil;

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
public class assessment_whvaluesClp extends BaseModelImpl<assessment_whvalues>
	implements assessment_whvalues {
	public assessment_whvaluesClp() {
	}

	public Class<?> getModelClass() {
		return assessment_whvalues.class;
	}

	public String getModelClassName() {
		return assessment_whvalues.class.getName();
	}

	public long getPrimaryKey() {
		return _whvalues_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhvalues_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whvalues_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("values", getValues());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
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

		String values = (String)attributes.get("values");

		if (values != null) {
			setValues(values);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
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

	public String getValues() {
		return _values;
	}

	public void setValues(String values) {
		_values = values;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getassessment_whvaluesRemoteModel() {
		return _assessment_whvaluesRemoteModel;
	}

	public void setassessment_whvaluesRemoteModel(
		BaseModel<?> assessment_whvaluesRemoteModel) {
		_assessment_whvaluesRemoteModel = assessment_whvaluesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_whvaluesLocalServiceUtil.addassessment_whvalues(this);
		}
		else {
			assessment_whvaluesLocalServiceUtil.updateassessment_whvalues(this);
		}
	}

	@Override
	public assessment_whvalues toEscapedModel() {
		return (assessment_whvalues)Proxy.newProxyInstance(assessment_whvalues.class.getClassLoader(),
			new Class[] { assessment_whvalues.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_whvaluesClp clone = new assessment_whvaluesClp();

		clone.setWhvalues_id(getWhvalues_id());
		clone.setVn(getVn());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setValues(getValues());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(assessment_whvalues assessment_whvalues) {
		long primaryKey = assessment_whvalues.getPrimaryKey();

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

		assessment_whvaluesClp assessment_whvalues = null;

		try {
			assessment_whvalues = (assessment_whvaluesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_whvalues.getPrimaryKey();

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

		sb.append("{whvalues_id=");
		sb.append(getWhvalues_id());
		sb.append(", vn=");
		sb.append(getVn());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", values=");
		sb.append(getValues());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_whvalues");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whvalues_id</column-name><column-value><![CDATA[");
		sb.append(getWhvalues_id());
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
			"<column><column-name>values</column-name><column-value><![CDATA[");
		sb.append(getValues());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whvalues_id;
	private long _vn;
	private long _assessment_version_id;
	private String _values;
	private String _description;
	private BaseModel<?> _assessment_whvaluesRemoteModel;
}