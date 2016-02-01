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

import com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil;

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
public class effective_prot_mgmt_iothreatsClp extends BaseModelImpl<effective_prot_mgmt_iothreats>
	implements effective_prot_mgmt_iothreats {
	public effective_prot_mgmt_iothreatsClp() {
	}

	public Class<?> getModelClass() {
		return effective_prot_mgmt_iothreats.class;
	}

	public String getModelClassName() {
		return effective_prot_mgmt_iothreats.class.getName();
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
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public BaseModel<?> geteffective_prot_mgmt_iothreatsRemoteModel() {
		return _effective_prot_mgmt_iothreatsRemoteModel;
	}

	public void seteffective_prot_mgmt_iothreatsRemoteModel(
		BaseModel<?> effective_prot_mgmt_iothreatsRemoteModel) {
		_effective_prot_mgmt_iothreatsRemoteModel = effective_prot_mgmt_iothreatsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			effective_prot_mgmt_iothreatsLocalServiceUtil.addeffective_prot_mgmt_iothreats(this);
		}
		else {
			effective_prot_mgmt_iothreatsLocalServiceUtil.updateeffective_prot_mgmt_iothreats(this);
		}
	}

	@Override
	public effective_prot_mgmt_iothreats toEscapedModel() {
		return (effective_prot_mgmt_iothreats)Proxy.newProxyInstance(effective_prot_mgmt_iothreats.class.getClassLoader(),
			new Class[] { effective_prot_mgmt_iothreats.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		effective_prot_mgmt_iothreatsClp clone = new effective_prot_mgmt_iothreatsClp();

		clone.setId(getId());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setRating(getRating());

		return clone;
	}

	public int compareTo(
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		long primaryKey = effective_prot_mgmt_iothreats.getPrimaryKey();

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

		effective_prot_mgmt_iothreatsClp effective_prot_mgmt_iothreats = null;

		try {
			effective_prot_mgmt_iothreats = (effective_prot_mgmt_iothreatsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = effective_prot_mgmt_iothreats.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
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
		sb.append("com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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

	private long _id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
	private BaseModel<?> _effective_prot_mgmt_iothreatsRemoteModel;
}