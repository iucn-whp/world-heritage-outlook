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

import com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalServiceUtil;

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
public class assessment_whvalues_whcriterionClp extends BaseModelImpl<assessment_whvalues_whcriterion>
	implements assessment_whvalues_whcriterion {
	public assessment_whvalues_whcriterionClp() {
	}

	public Class<?> getModelClass() {
		return assessment_whvalues_whcriterion.class;
	}

	public String getModelClassName() {
		return assessment_whvalues_whcriterion.class.getName();
	}

	public long getPrimaryKey() {
		return _wh_criteria_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWh_criteria_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_wh_criteria_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wh_criteria_id", getWh_criteria_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("criterion", getCriterion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wh_criteria_id = (Long)attributes.get("wh_criteria_id");

		if (wh_criteria_id != null) {
			setWh_criteria_id(wh_criteria_id);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Long criterion = (Long)attributes.get("criterion");

		if (criterion != null) {
			setCriterion(criterion);
		}
	}

	public long getWh_criteria_id() {
		return _wh_criteria_id;
	}

	public void setWh_criteria_id(long wh_criteria_id) {
		_wh_criteria_id = wh_criteria_id;
	}

	public long getWhvalues_id() {
		return _whvalues_id;
	}

	public void setWhvalues_id(long whvalues_id) {
		_whvalues_id = whvalues_id;
	}

	public long getCriterion() {
		return _criterion;
	}

	public void setCriterion(long criterion) {
		_criterion = criterion;
	}

	public BaseModel<?> getassessment_whvalues_whcriterionRemoteModel() {
		return _assessment_whvalues_whcriterionRemoteModel;
	}

	public void setassessment_whvalues_whcriterionRemoteModel(
		BaseModel<?> assessment_whvalues_whcriterionRemoteModel) {
		_assessment_whvalues_whcriterionRemoteModel = assessment_whvalues_whcriterionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_whvalues_whcriterionLocalServiceUtil.addassessment_whvalues_whcriterion(this);
		}
		else {
			assessment_whvalues_whcriterionLocalServiceUtil.updateassessment_whvalues_whcriterion(this);
		}
	}

	@Override
	public assessment_whvalues_whcriterion toEscapedModel() {
		return (assessment_whvalues_whcriterion)Proxy.newProxyInstance(assessment_whvalues_whcriterion.class.getClassLoader(),
			new Class[] { assessment_whvalues_whcriterion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_whvalues_whcriterionClp clone = new assessment_whvalues_whcriterionClp();

		clone.setWh_criteria_id(getWh_criteria_id());
		clone.setWhvalues_id(getWhvalues_id());
		clone.setCriterion(getCriterion());

		return clone;
	}

	public int compareTo(
		assessment_whvalues_whcriterion assessment_whvalues_whcriterion) {
		long primaryKey = assessment_whvalues_whcriterion.getPrimaryKey();

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

		assessment_whvalues_whcriterionClp assessment_whvalues_whcriterion = null;

		try {
			assessment_whvalues_whcriterion = (assessment_whvalues_whcriterionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_whvalues_whcriterion.getPrimaryKey();

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

		sb.append("{wh_criteria_id=");
		sb.append(getWh_criteria_id());
		sb.append(", whvalues_id=");
		sb.append(getWhvalues_id());
		sb.append(", criterion=");
		sb.append(getCriterion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wh_criteria_id</column-name><column-value><![CDATA[");
		sb.append(getWh_criteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>whvalues_id</column-name><column-value><![CDATA[");
		sb.append(getWhvalues_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criterion</column-name><column-value><![CDATA[");
		sb.append(getCriterion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wh_criteria_id;
	private long _whvalues_id;
	private long _criterion;
	private BaseModel<?> _assessment_whvalues_whcriterionRemoteModel;
}