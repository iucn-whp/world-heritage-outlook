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

import com.iucn.whp.dbservice.service.referencesLocalServiceUtil;

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
public class referencesClp extends BaseModelImpl<references>
	implements references {
	public referencesClp() {
	}

	public Class<?> getModelClass() {
		return references.class;
	}

	public String getModelClassName() {
		return references.class.getName();
	}

	public long getPrimaryKey() {
		return _reference_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setReference_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_reference_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("reference_id", getReference_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("rn", getRn());
		attributes.put("references", getReferences());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long reference_id = (Long)attributes.get("reference_id");

		if (reference_id != null) {
			setReference_id(reference_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long rn = (Long)attributes.get("rn");

		if (rn != null) {
			setRn(rn);
		}

		String references = (String)attributes.get("references");

		if (references != null) {
			setReferences(references);
		}
	}

	public long getReference_id() {
		return _reference_id;
	}

	public void setReference_id(long reference_id) {
		_reference_id = reference_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getRn() {
		return _rn;
	}

	public void setRn(long rn) {
		_rn = rn;
	}

	public String getReferences() {
		return _references;
	}

	public void setReferences(String references) {
		_references = references;
	}

	public BaseModel<?> getreferencesRemoteModel() {
		return _referencesRemoteModel;
	}

	public void setreferencesRemoteModel(BaseModel<?> referencesRemoteModel) {
		_referencesRemoteModel = referencesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			referencesLocalServiceUtil.addreferences(this);
		}
		else {
			referencesLocalServiceUtil.updatereferences(this);
		}
	}

	@Override
	public references toEscapedModel() {
		return (references)Proxy.newProxyInstance(references.class.getClassLoader(),
			new Class[] { references.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		referencesClp clone = new referencesClp();

		clone.setReference_id(getReference_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setRn(getRn());
		clone.setReferences(getReferences());

		return clone;
	}

	public int compareTo(references references) {
		long primaryKey = references.getPrimaryKey();

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

		referencesClp references = null;

		try {
			references = (referencesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = references.getPrimaryKey();

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

		sb.append("{reference_id=");
		sb.append(getReference_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", rn=");
		sb.append(getRn());
		sb.append(", references=");
		sb.append(getReferences());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.references");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>reference_id</column-name><column-value><![CDATA[");
		sb.append(getReference_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rn</column-name><column-value><![CDATA[");
		sb.append(getRn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>references</column-name><column-value><![CDATA[");
		sb.append(getReferences());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _reference_id;
	private long _assessment_version_id;
	private long _rn;
	private String _references;
	private BaseModel<?> _referencesRemoteModel;
}