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

import com.iucn.whp.dbservice.service.assessment_validationLocalServiceUtil;

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
public class assessment_validationClp extends BaseModelImpl<assessment_validation>
	implements assessment_validation {
	public assessment_validationClp() {
	}

	public Class<?> getModelClass() {
		return assessment_validation.class;
	}

	public String getModelClassName() {
		return assessment_validation.class.getName();
	}

	public long getPrimaryKey() {
		return _assessment_ver_val_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAssessment_ver_val_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_assessment_ver_val_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_ver_val_id", getAssessment_ver_val_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("assessment_step", getAssessment_step());
		attributes.put("validation_complete", getValidation_complete());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_ver_val_id = (Long)attributes.get(
				"assessment_ver_val_id");

		if (assessment_ver_val_id != null) {
			setAssessment_ver_val_id(assessment_ver_val_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long assessment_step = (Long)attributes.get("assessment_step");

		if (assessment_step != null) {
			setAssessment_step(assessment_step);
		}

		Boolean validation_complete = (Boolean)attributes.get(
				"validation_complete");

		if (validation_complete != null) {
			setValidation_complete(validation_complete);
		}
	}

	public long getAssessment_ver_val_id() {
		return _assessment_ver_val_id;
	}

	public void setAssessment_ver_val_id(long assessment_ver_val_id) {
		_assessment_ver_val_id = assessment_ver_val_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getAssessment_step() {
		return _assessment_step;
	}

	public void setAssessment_step(long assessment_step) {
		_assessment_step = assessment_step;
	}

	public boolean getValidation_complete() {
		return _validation_complete;
	}

	public boolean isValidation_complete() {
		return _validation_complete;
	}

	public void setValidation_complete(boolean validation_complete) {
		_validation_complete = validation_complete;
	}

	public BaseModel<?> getassessment_validationRemoteModel() {
		return _assessment_validationRemoteModel;
	}

	public void setassessment_validationRemoteModel(
		BaseModel<?> assessment_validationRemoteModel) {
		_assessment_validationRemoteModel = assessment_validationRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_validationLocalServiceUtil.addassessment_validation(this);
		}
		else {
			assessment_validationLocalServiceUtil.updateassessment_validation(this);
		}
	}

	@Override
	public assessment_validation toEscapedModel() {
		return (assessment_validation)Proxy.newProxyInstance(assessment_validation.class.getClassLoader(),
			new Class[] { assessment_validation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_validationClp clone = new assessment_validationClp();

		clone.setAssessment_ver_val_id(getAssessment_ver_val_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setAssessment_step(getAssessment_step());
		clone.setValidation_complete(getValidation_complete());

		return clone;
	}

	public int compareTo(assessment_validation assessment_validation) {
		long primaryKey = assessment_validation.getPrimaryKey();

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

		assessment_validationClp assessment_validation = null;

		try {
			assessment_validation = (assessment_validationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_validation.getPrimaryKey();

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

		sb.append("{assessment_ver_val_id=");
		sb.append(getAssessment_ver_val_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", assessment_step=");
		sb.append(getAssessment_step());
		sb.append(", validation_complete=");
		sb.append(getValidation_complete());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_validation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assessment_ver_val_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_ver_val_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_step</column-name><column-value><![CDATA[");
		sb.append(getAssessment_step());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validation_complete</column-name><column-value><![CDATA[");
		sb.append(getValidation_complete());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _assessment_ver_val_id;
	private long _assessment_version_id;
	private long _assessment_step;
	private boolean _validation_complete;
	private BaseModel<?> _assessment_validationRemoteModel;
}