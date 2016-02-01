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

import com.iucn.whp.dbservice.service.benefits_summaryLocalServiceUtil;

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
public class benefits_summaryClp extends BaseModelImpl<benefits_summary>
	implements benefits_summary {
	public benefits_summaryClp() {
	}

	public Class<?> getModelClass() {
		return benefits_summary.class;
	}

	public String getModelClassName() {
		return benefits_summary.class.getName();
	}

	public long getPrimaryKey() {
		return _benefits_summary_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBenefits_summary_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_benefits_summary_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_summary_id", getBenefits_summary_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("summary", getSummary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_summary_id = (Long)attributes.get("benefits_summary_id");

		if (benefits_summary_id != null) {
			setBenefits_summary_id(benefits_summary_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}
	}

	public long getBenefits_summary_id() {
		return _benefits_summary_id;
	}

	public void setBenefits_summary_id(long benefits_summary_id) {
		_benefits_summary_id = benefits_summary_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public BaseModel<?> getbenefits_summaryRemoteModel() {
		return _benefits_summaryRemoteModel;
	}

	public void setbenefits_summaryRemoteModel(
		BaseModel<?> benefits_summaryRemoteModel) {
		_benefits_summaryRemoteModel = benefits_summaryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefits_summaryLocalServiceUtil.addbenefits_summary(this);
		}
		else {
			benefits_summaryLocalServiceUtil.updatebenefits_summary(this);
		}
	}

	@Override
	public benefits_summary toEscapedModel() {
		return (benefits_summary)Proxy.newProxyInstance(benefits_summary.class.getClassLoader(),
			new Class[] { benefits_summary.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefits_summaryClp clone = new benefits_summaryClp();

		clone.setBenefits_summary_id(getBenefits_summary_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setSummary(getSummary());

		return clone;
	}

	public int compareTo(benefits_summary benefits_summary) {
		long primaryKey = benefits_summary.getPrimaryKey();

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

		benefits_summaryClp benefits_summary = null;

		try {
			benefits_summary = (benefits_summaryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefits_summary.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{benefits_summary_id=");
		sb.append(getBenefits_summary_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefits_summary");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_summary_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_summary_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _benefits_summary_id;
	private long _assessment_version_id;
	private String _summary;
	private BaseModel<?> _benefits_summaryRemoteModel;
}