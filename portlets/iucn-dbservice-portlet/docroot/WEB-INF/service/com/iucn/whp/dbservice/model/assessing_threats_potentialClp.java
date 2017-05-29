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

import com.iucn.whp.dbservice.service.assessing_threats_potentialLocalServiceUtil;

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
public class assessing_threats_potentialClp extends BaseModelImpl<assessing_threats_potential>
	implements assessing_threats_potential {
	public assessing_threats_potentialClp() {
	}

	public Class<?> getModelClass() {
		return assessing_threats_potential.class;
	}

	public String getModelClassName() {
		return assessing_threats_potential.class.getName();
	}

	public long getPrimaryKey() {
		return _potential_threat_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPotential_threat_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_potential_threat_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("potential_threat", getPotential_threat());
		attributes.put("justification", getJustification());
		attributes.put("threadExtentValue", getThreadExtentValue());
		attributes.put("threat_rating", getThreat_rating());
		attributes.put("inside_site", getInside_site());
		attributes.put("outside_site", getOutside_site());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String potential_threat = (String)attributes.get("potential_threat");

		if (potential_threat != null) {
			setPotential_threat(potential_threat);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		String threadExtentValue = (String)attributes.get("threadExtentValue");

		if (threadExtentValue != null) {
			setThreadExtentValue(threadExtentValue);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}

		Boolean inside_site = (Boolean)attributes.get("inside_site");

		if (inside_site != null) {
			setInside_site(inside_site);
		}

		Boolean outside_site = (Boolean)attributes.get("outside_site");

		if (outside_site != null) {
			setOutside_site(outside_site);
		}
	}

	public long getPotential_threat_id() {
		return _potential_threat_id;
	}

	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_id = potential_threat_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getPotential_threat() {
		return _potential_threat;
	}

	public void setPotential_threat(String potential_threat) {
		_potential_threat = potential_threat;
	}

	public String getJustification() {
		return _justification;
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public String getThreadExtentValue() {
		return _threadExtentValue;
	}

	public void setThreadExtentValue(String threadExtentValue) {
		_threadExtentValue = threadExtentValue;
	}

	public long getThreat_rating() {
		return _threat_rating;
	}

	public void setThreat_rating(long threat_rating) {
		_threat_rating = threat_rating;
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

	public BaseModel<?> getassessing_threats_potentialRemoteModel() {
		return _assessing_threats_potentialRemoteModel;
	}

	public void setassessing_threats_potentialRemoteModel(
		BaseModel<?> assessing_threats_potentialRemoteModel) {
		_assessing_threats_potentialRemoteModel = assessing_threats_potentialRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessing_threats_potentialLocalServiceUtil.addassessing_threats_potential(this);
		}
		else {
			assessing_threats_potentialLocalServiceUtil.updateassessing_threats_potential(this);
		}
	}

	@Override
	public assessing_threats_potential toEscapedModel() {
		return (assessing_threats_potential)Proxy.newProxyInstance(assessing_threats_potential.class.getClassLoader(),
			new Class[] { assessing_threats_potential.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessing_threats_potentialClp clone = new assessing_threats_potentialClp();

		clone.setPotential_threat_id(getPotential_threat_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setPotential_threat(getPotential_threat());
		clone.setJustification(getJustification());
		clone.setThreadExtentValue(getThreadExtentValue());
		clone.setThreat_rating(getThreat_rating());
		clone.setInside_site(getInside_site());
		clone.setOutside_site(getOutside_site());

		return clone;
	}

	public int compareTo(
		assessing_threats_potential assessing_threats_potential) {
		long primaryKey = assessing_threats_potential.getPrimaryKey();

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

		assessing_threats_potentialClp assessing_threats_potential = null;

		try {
			assessing_threats_potential = (assessing_threats_potentialClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessing_threats_potential.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{potential_threat_id=");
		sb.append(getPotential_threat_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", potential_threat=");
		sb.append(getPotential_threat());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", threadExtentValue=");
		sb.append(getThreadExtentValue());
		sb.append(", threat_rating=");
		sb.append(getThreat_rating());
		sb.append(", inside_site=");
		sb.append(getInside_site());
		sb.append(", outside_site=");
		sb.append(getOutside_site());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessing_threats_potential");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>potential_threat_id</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>potential_threat</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>justification</column-name><column-value><![CDATA[");
		sb.append(getJustification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threadExtentValue</column-name><column-value><![CDATA[");
		sb.append(getThreadExtentValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_rating</column-name><column-value><![CDATA[");
		sb.append(getThreat_rating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inside_site</column-name><column-value><![CDATA[");
		sb.append(getInside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outside_site</column-name><column-value><![CDATA[");
		sb.append(getOutside_site());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _potential_threat_id;
	private long _assessment_version_id;
	private String _potential_threat;
	private String _justification;
	private String _threadExtentValue;
	private long _threat_rating;
	private boolean _inside_site;
	private boolean _outside_site;
	private BaseModel<?> _assessing_threats_potentialRemoteModel;
}