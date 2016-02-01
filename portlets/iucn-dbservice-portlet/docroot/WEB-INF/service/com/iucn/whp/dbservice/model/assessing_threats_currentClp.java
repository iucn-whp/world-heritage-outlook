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

import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;

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
public class assessing_threats_currentClp extends BaseModelImpl<assessing_threats_current>
	implements assessing_threats_current {
	public assessing_threats_currentClp() {
	}

	public Class<?> getModelClass() {
		return assessing_threats_current.class;
	}

	public String getModelClassName() {
		return assessing_threats_current.class.getName();
	}

	public long getPrimaryKey() {
		return _current_threat_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setCurrent_threat_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_current_threat_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("current_threat_id", getCurrent_threat_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("current_threat", getCurrent_threat());
		attributes.put("justification", getJustification());
		attributes.put("inside_site", getInside_site());
		attributes.put("outside_site", getOutside_site());
		attributes.put("threat_rating_id", getThreat_rating_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long current_threat_id = (Long)attributes.get("current_threat_id");

		if (current_threat_id != null) {
			setCurrent_threat_id(current_threat_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String current_threat = (String)attributes.get("current_threat");

		if (current_threat != null) {
			setCurrent_threat(current_threat);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Boolean inside_site = (Boolean)attributes.get("inside_site");

		if (inside_site != null) {
			setInside_site(inside_site);
		}

		Boolean outside_site = (Boolean)attributes.get("outside_site");

		if (outside_site != null) {
			setOutside_site(outside_site);
		}

		Long threat_rating_id = (Long)attributes.get("threat_rating_id");

		if (threat_rating_id != null) {
			setThreat_rating_id(threat_rating_id);
		}
	}

	public long getCurrent_threat_id() {
		return _current_threat_id;
	}

	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_id = current_threat_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getCurrent_threat() {
		return _current_threat;
	}

	public void setCurrent_threat(String current_threat) {
		_current_threat = current_threat;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public boolean getInside_site() {
		return _inside_site;
	}

	public boolean isInside_site() {
		return _inside_site;
	}

	public void setInside_site(boolean inside_site) {
		_inside_site = inside_site;
	}

	public boolean getOutside_site() {
		return _outside_site;
	}

	public boolean isOutside_site() {
		return _outside_site;
	}

	public void setOutside_site(boolean outside_site) {
		_outside_site = outside_site;
	}

	public long getThreat_rating_id() {
		return _threat_rating_id;
	}

	public void setThreat_rating_id(long threat_rating_id) {
		_threat_rating_id = threat_rating_id;
	}

	public BaseModel<?> getassessing_threats_currentRemoteModel() {
		return _assessing_threats_currentRemoteModel;
	}

	public void setassessing_threats_currentRemoteModel(
		BaseModel<?> assessing_threats_currentRemoteModel) {
		_assessing_threats_currentRemoteModel = assessing_threats_currentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessing_threats_currentLocalServiceUtil.addassessing_threats_current(this);
		}
		else {
			assessing_threats_currentLocalServiceUtil.updateassessing_threats_current(this);
		}
	}

	@Override
	public assessing_threats_current toEscapedModel() {
		return (assessing_threats_current)Proxy.newProxyInstance(assessing_threats_current.class.getClassLoader(),
			new Class[] { assessing_threats_current.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessing_threats_currentClp clone = new assessing_threats_currentClp();

		clone.setCurrent_threat_id(getCurrent_threat_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setCurrent_threat(getCurrent_threat());
		clone.setJustification(getJustification());
		clone.setInside_site(getInside_site());
		clone.setOutside_site(getOutside_site());
		clone.setThreat_rating_id(getThreat_rating_id());

		return clone;
	}

	public int compareTo(assessing_threats_current assessing_threats_current) {
		long primaryKey = assessing_threats_current.getPrimaryKey();

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

		assessing_threats_currentClp assessing_threats_current = null;

		try {
			assessing_threats_current = (assessing_threats_currentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessing_threats_current.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{current_threat_id=");
		sb.append(getCurrent_threat_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", current_threat=");
		sb.append(getCurrent_threat());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", inside_site=");
		sb.append(getInside_site());
		sb.append(", outside_site=");
		sb.append(getOutside_site());
		sb.append(", threat_rating_id=");
		sb.append(getThreat_rating_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessing_threats_current");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>current_threat_id</column-name><column-value><![CDATA[");
		sb.append(getCurrent_threat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_threat</column-name><column-value><![CDATA[");
		sb.append(getCurrent_threat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>justification</column-name><column-value><![CDATA[");
		sb.append(getJustification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inside_site</column-name><column-value><![CDATA[");
		sb.append(getInside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outside_site</column-name><column-value><![CDATA[");
		sb.append(getOutside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_rating_id</column-name><column-value><![CDATA[");
		sb.append(getThreat_rating_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _current_threat_id;
	private long _assessment_version_id;
	private String _current_threat;
	private String _justification;
	private boolean _inside_site;
	private boolean _outside_site;
	private long _threat_rating_id;
	private BaseModel<?> _assessing_threats_currentRemoteModel;
}