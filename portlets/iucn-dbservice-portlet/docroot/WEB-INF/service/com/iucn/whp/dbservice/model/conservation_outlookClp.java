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

import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;

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
public class conservation_outlookClp extends BaseModelImpl<conservation_outlook>
	implements conservation_outlook {
	public conservation_outlookClp() {
	}

	public Class<?> getModelClass() {
		return conservation_outlook.class;
	}

	public String getModelClassName() {
		return conservation_outlook.class.getName();
	}

	public long getPrimaryKey() {
		return _conservation_outlook_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setConservation_outlook_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_conservation_outlook_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("conservation_outlook_id", getConservation_outlook_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long conservation_outlook_id = (Long)attributes.get(
				"conservation_outlook_id");

		if (conservation_outlook_id != null) {
			setConservation_outlook_id(conservation_outlook_id);
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

		Long rating = (Long)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	public long getConservation_outlook_id() {
		return _conservation_outlook_id;
	}

	public void setConservation_outlook_id(long conservation_outlook_id) {
		_conservation_outlook_id = conservation_outlook_id;
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

	public long getRating() {
		return _rating;
	}

	public void setRating(long rating) {
		_rating = rating;
	}

	public BaseModel<?> getconservation_outlookRemoteModel() {
		return _conservation_outlookRemoteModel;
	}

	public void setconservation_outlookRemoteModel(
		BaseModel<?> conservation_outlookRemoteModel) {
		_conservation_outlookRemoteModel = conservation_outlookRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			conservation_outlookLocalServiceUtil.addconservation_outlook(this);
		}
		else {
			conservation_outlookLocalServiceUtil.updateconservation_outlook(this);
		}
	}

	@Override
	public conservation_outlook toEscapedModel() {
		return (conservation_outlook)Proxy.newProxyInstance(conservation_outlook.class.getClassLoader(),
			new Class[] { conservation_outlook.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		conservation_outlookClp clone = new conservation_outlookClp();

		clone.setConservation_outlook_id(getConservation_outlook_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setRating(getRating());

		return clone;
	}

	public int compareTo(conservation_outlook conservation_outlook) {
		long primaryKey = conservation_outlook.getPrimaryKey();

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

		conservation_outlookClp conservation_outlook = null;

		try {
			conservation_outlook = (conservation_outlookClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = conservation_outlook.getPrimaryKey();

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

		sb.append("{conservation_outlook_id=");
		sb.append(getConservation_outlook_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", rating=");
		sb.append(getRating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.conservation_outlook");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>conservation_outlook_id</column-name><column-value><![CDATA[");
		sb.append(getConservation_outlook_id());
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
			"<column><column-name>rating</column-name><column-value><![CDATA[");
		sb.append(getRating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _conservation_outlook_id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
	private BaseModel<?> _conservation_outlookRemoteModel;
}