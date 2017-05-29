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

import com.iucn.whp.dbservice.service.prot_mgmt_overallLocalServiceUtil;

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
public class prot_mgmt_overallClp extends BaseModelImpl<prot_mgmt_overall>
	implements prot_mgmt_overall {
	public prot_mgmt_overallClp() {
	}

	public Class<?> getModelClass() {
		return prot_mgmt_overall.class;
	}

	public String getModelClassName() {
		return prot_mgmt_overall.class.getName();
	}

	public long getPrimaryKey() {
		return _pmo_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPmo_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_pmo_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pmo_id", getPmo_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pmo_id = (Long)attributes.get("pmo_id");

		if (pmo_id != null) {
			setPmo_id(pmo_id);
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

	public long getPmo_id() {
		return _pmo_id;
	}

	public void setPmo_id(long pmo_id) {
		_pmo_id = pmo_id;
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

	public BaseModel<?> getprot_mgmt_overallRemoteModel() {
		return _prot_mgmt_overallRemoteModel;
	}

	public void setprot_mgmt_overallRemoteModel(
		BaseModel<?> prot_mgmt_overallRemoteModel) {
		_prot_mgmt_overallRemoteModel = prot_mgmt_overallRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			prot_mgmt_overallLocalServiceUtil.addprot_mgmt_overall(this);
		}
		else {
			prot_mgmt_overallLocalServiceUtil.updateprot_mgmt_overall(this);
		}
	}

	@Override
	public prot_mgmt_overall toEscapedModel() {
		return (prot_mgmt_overall)Proxy.newProxyInstance(prot_mgmt_overall.class.getClassLoader(),
			new Class[] { prot_mgmt_overall.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		prot_mgmt_overallClp clone = new prot_mgmt_overallClp();

		clone.setPmo_id(getPmo_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setJustification(getJustification());
		clone.setRating(getRating());

		return clone;
	}

	public int compareTo(prot_mgmt_overall prot_mgmt_overall) {
		long primaryKey = prot_mgmt_overall.getPrimaryKey();

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

		prot_mgmt_overallClp prot_mgmt_overall = null;

		try {
			prot_mgmt_overall = (prot_mgmt_overallClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = prot_mgmt_overall.getPrimaryKey();

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

		sb.append("{pmo_id=");
		sb.append(getPmo_id());
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
		sb.append("com.iucn.whp.dbservice.model.prot_mgmt_overall");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pmo_id</column-name><column-value><![CDATA[");
		sb.append(getPmo_id());
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

	private long _pmo_id;
	private long _assessment_version_id;
	private String _justification;
	private long _rating;
	private BaseModel<?> _prot_mgmt_overallRemoteModel;
}