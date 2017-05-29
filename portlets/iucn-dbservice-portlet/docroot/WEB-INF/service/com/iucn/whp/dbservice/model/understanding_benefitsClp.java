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

import com.iucn.whp.dbservice.service.understanding_benefitsLocalServiceUtil;

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
public class understanding_benefitsClp extends BaseModelImpl<understanding_benefits>
	implements understanding_benefits {
	public understanding_benefitsClp() {
	}

	public Class<?> getModelClass() {
		return understanding_benefits.class;
	}

	public String getModelClassName() {
		return understanding_benefits.class.getName();
	}

	public long getPrimaryKey() {
		return _understanding_benefits_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setUnderstanding_benefits_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_understanding_benefits_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("understanding_benefits_id",
			getUnderstanding_benefits_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("selected_benefit", getSelected_benefit());
		attributes.put("summary", getSummary());
		attributes.put("community_within_site", getCommunity_within_site());
		attributes.put("community_outside_site", getCommunity_outside_site());
		attributes.put("wider_community", getWider_community());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long understanding_benefits_id = (Long)attributes.get(
				"understanding_benefits_id");

		if (understanding_benefits_id != null) {
			setUnderstanding_benefits_id(understanding_benefits_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long selected_benefit = (Long)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		Long community_within_site = (Long)attributes.get(
				"community_within_site");

		if (community_within_site != null) {
			setCommunity_within_site(community_within_site);
		}

		Long community_outside_site = (Long)attributes.get(
				"community_outside_site");

		if (community_outside_site != null) {
			setCommunity_outside_site(community_outside_site);
		}

		Long wider_community = (Long)attributes.get("wider_community");

		if (wider_community != null) {
			setWider_community(wider_community);
		}
	}

	public long getUnderstanding_benefits_id() {
		return _understanding_benefits_id;
	}

	public void setUnderstanding_benefits_id(long understanding_benefits_id) {
		_understanding_benefits_id = understanding_benefits_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getSelected_benefit() {
		return _selected_benefit;
	}

	public void setSelected_benefit(long selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public long getCommunity_within_site() {
		return _community_within_site;
	}

	public void setCommunity_within_site(long community_within_site) {
		_community_within_site = community_within_site;
	}

	public long getCommunity_outside_site() {
		return _community_outside_site;
	}

	public void setCommunity_outside_site(long community_outside_site) {
		_community_outside_site = community_outside_site;
	}

	public long getWider_community() {
		return _wider_community;
	}

	public void setWider_community(long wider_community) {
		_wider_community = wider_community;
	}

	public BaseModel<?> getunderstanding_benefitsRemoteModel() {
		return _understanding_benefitsRemoteModel;
	}

	public void setunderstanding_benefitsRemoteModel(
		BaseModel<?> understanding_benefitsRemoteModel) {
		_understanding_benefitsRemoteModel = understanding_benefitsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			understanding_benefitsLocalServiceUtil.addunderstanding_benefits(this);
		}
		else {
			understanding_benefitsLocalServiceUtil.updateunderstanding_benefits(this);
		}
	}

	@Override
	public understanding_benefits toEscapedModel() {
		return (understanding_benefits)Proxy.newProxyInstance(understanding_benefits.class.getClassLoader(),
			new Class[] { understanding_benefits.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		understanding_benefitsClp clone = new understanding_benefitsClp();

		clone.setUnderstanding_benefits_id(getUnderstanding_benefits_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setSelected_benefit(getSelected_benefit());
		clone.setSummary(getSummary());
		clone.setCommunity_within_site(getCommunity_within_site());
		clone.setCommunity_outside_site(getCommunity_outside_site());
		clone.setWider_community(getWider_community());

		return clone;
	}

	public int compareTo(understanding_benefits understanding_benefits) {
		long primaryKey = understanding_benefits.getPrimaryKey();

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

		understanding_benefitsClp understanding_benefits = null;

		try {
			understanding_benefits = (understanding_benefitsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = understanding_benefits.getPrimaryKey();

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

		sb.append("{understanding_benefits_id=");
		sb.append(getUnderstanding_benefits_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", selected_benefit=");
		sb.append(getSelected_benefit());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", community_within_site=");
		sb.append(getCommunity_within_site());
		sb.append(", community_outside_site=");
		sb.append(getCommunity_outside_site());
		sb.append(", wider_community=");
		sb.append(getWider_community());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.understanding_benefits");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>understanding_benefits_id</column-name><column-value><![CDATA[");
		sb.append(getUnderstanding_benefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected_benefit</column-name><column-value><![CDATA[");
		sb.append(getSelected_benefit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_within_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_within_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_outside_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_outside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wider_community</column-name><column-value><![CDATA[");
		sb.append(getWider_community());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _understanding_benefits_id;
	private long _assessment_version_id;
	private long _selected_benefit;
	private String _summary;
	private long _community_within_site;
	private long _community_outside_site;
	private long _wider_community;
	private BaseModel<?> _understanding_benefitsRemoteModel;
}