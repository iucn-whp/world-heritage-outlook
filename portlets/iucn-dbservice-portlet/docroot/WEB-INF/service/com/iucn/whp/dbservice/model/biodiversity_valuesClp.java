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

import com.iucn.whp.dbservice.service.biodiversity_valuesLocalServiceUtil;

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
public class biodiversity_valuesClp extends BaseModelImpl<biodiversity_values>
	implements biodiversity_values {
	public biodiversity_valuesClp() {
	}

	public Class<?> getModelClass() {
		return biodiversity_values.class;
	}

	public String getModelClassName() {
		return biodiversity_values.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getbiodiversity_valuesRemoteModel() {
		return _biodiversity_valuesRemoteModel;
	}

	public void setbiodiversity_valuesRemoteModel(
		BaseModel<?> biodiversity_valuesRemoteModel) {
		_biodiversity_valuesRemoteModel = biodiversity_valuesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			biodiversity_valuesLocalServiceUtil.addbiodiversity_values(this);
		}
		else {
			biodiversity_valuesLocalServiceUtil.updatebiodiversity_values(this);
		}
	}

	@Override
	public biodiversity_values toEscapedModel() {
		return (biodiversity_values)Proxy.newProxyInstance(biodiversity_values.class.getClassLoader(),
			new Class[] { biodiversity_values.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		biodiversity_valuesClp clone = new biodiversity_valuesClp();

		clone.setId(getId());
		clone.setVn(getVn());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setValue(getValue());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(biodiversity_values biodiversity_values) {
		long primaryKey = biodiversity_values.getPrimaryKey();

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

		biodiversity_valuesClp biodiversity_values = null;

		try {
			biodiversity_values = (biodiversity_valuesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = biodiversity_values.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vn=");
		sb.append(getVn());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.biodiversity_values");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vn;
	private long _assessment_version_id;
	private String _value;
	private String _description;
	private BaseModel<?> _biodiversity_valuesRemoteModel;
}