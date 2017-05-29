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

import com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil;

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
public class key_conservation_issuesClp extends BaseModelImpl<key_conservation_issues>
	implements key_conservation_issues {
	public key_conservation_issuesClp() {
	}

	public Class<?> getModelClass() {
		return key_conservation_issues.class;
	}

	public String getModelClassName() {
		return key_conservation_issues.class.getName();
	}

	public long getPrimaryKey() {
		return _key_conservation_issues_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setKey_conservation_issues_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_key_conservation_issues_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("key_conservation_issues_id",
			getKey_conservation_issues_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("cn", getCn());
		attributes.put("key_conservation_issues", getKey_conservation_issues());
		attributes.put("description", getDescription());
		attributes.put("scale", getScale());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long key_conservation_issues_id = (Long)attributes.get(
				"key_conservation_issues_id");

		if (key_conservation_issues_id != null) {
			setKey_conservation_issues_id(key_conservation_issues_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String cn = (String)attributes.get("cn");

		if (cn != null) {
			setCn(cn);
		}

		String key_conservation_issues = (String)attributes.get(
				"key_conservation_issues");

		if (key_conservation_issues != null) {
			setKey_conservation_issues(key_conservation_issues);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long scale = (Long)attributes.get("scale");

		if (scale != null) {
			setScale(scale);
		}
	}

	public long getKey_conservation_issues_id() {
		return _key_conservation_issues_id;
	}

	public void setKey_conservation_issues_id(long key_conservation_issues_id) {
		_key_conservation_issues_id = key_conservation_issues_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getCn() {
		return _cn;
	}

	public void setCn(String cn) {
		_cn = cn;
	}

	public String getKey_conservation_issues() {
		return _key_conservation_issues;
	}

	public void setKey_conservation_issues(String key_conservation_issues) {
		_key_conservation_issues = key_conservation_issues;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getScale() {
		return _scale;
	}

	public void setScale(long scale) {
		_scale = scale;
	}

	public BaseModel<?> getkey_conservation_issuesRemoteModel() {
		return _key_conservation_issuesRemoteModel;
	}

	public void setkey_conservation_issuesRemoteModel(
		BaseModel<?> key_conservation_issuesRemoteModel) {
		_key_conservation_issuesRemoteModel = key_conservation_issuesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			key_conservation_issuesLocalServiceUtil.addkey_conservation_issues(this);
		}
		else {
			key_conservation_issuesLocalServiceUtil.updatekey_conservation_issues(this);
		}
	}

	@Override
	public key_conservation_issues toEscapedModel() {
		return (key_conservation_issues)Proxy.newProxyInstance(key_conservation_issues.class.getClassLoader(),
			new Class[] { key_conservation_issues.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		key_conservation_issuesClp clone = new key_conservation_issuesClp();

		clone.setKey_conservation_issues_id(getKey_conservation_issues_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setCn(getCn());
		clone.setKey_conservation_issues(getKey_conservation_issues());
		clone.setDescription(getDescription());
		clone.setScale(getScale());

		return clone;
	}

	public int compareTo(key_conservation_issues key_conservation_issues) {
		long primaryKey = key_conservation_issues.getPrimaryKey();

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

		key_conservation_issuesClp key_conservation_issues = null;

		try {
			key_conservation_issues = (key_conservation_issuesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = key_conservation_issues.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{key_conservation_issues_id=");
		sb.append(getKey_conservation_issues_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", cn=");
		sb.append(getCn());
		sb.append(", key_conservation_issues=");
		sb.append(getKey_conservation_issues());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", scale=");
		sb.append(getScale());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.key_conservation_issues");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>key_conservation_issues_id</column-name><column-value><![CDATA[");
		sb.append(getKey_conservation_issues_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cn</column-name><column-value><![CDATA[");
		sb.append(getCn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key_conservation_issues</column-name><column-value><![CDATA[");
		sb.append(getKey_conservation_issues());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scale</column-name><column-value><![CDATA[");
		sb.append(getScale());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _key_conservation_issues_id;
	private long _assessment_version_id;
	private String _cn;
	private String _key_conservation_issues;
	private String _description;
	private long _scale;
	private BaseModel<?> _key_conservation_issuesRemoteModel;
}