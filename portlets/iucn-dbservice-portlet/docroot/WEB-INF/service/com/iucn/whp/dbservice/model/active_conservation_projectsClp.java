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

import com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil;

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
public class active_conservation_projectsClp extends BaseModelImpl<active_conservation_projects>
	implements active_conservation_projects {
	public active_conservation_projectsClp() {
	}

	public Class<?> getModelClass() {
		return active_conservation_projects.class;
	}

	public String getModelClassName() {
		return active_conservation_projects.class.getName();
	}

	public long getPrimaryKey() {
		return _acpid;
	}

	public void setPrimaryKey(long primaryKey) {
		setAcpid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_acpid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acpid", getAcpid());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("organization_individual", getOrganization_individual());
		attributes.put("description", getDescription());
		attributes.put("contact_details", getContact_details());
		attributes.put("projectDurationFrom", getProjectDurationFrom());
		attributes.put("projectDurationTo", getProjectDurationTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acpid = (Long)attributes.get("acpid");

		if (acpid != null) {
			setAcpid(acpid);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String organization_individual = (String)attributes.get(
				"organization_individual");

		if (organization_individual != null) {
			setOrganization_individual(organization_individual);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contact_details = (String)attributes.get("contact_details");

		if (contact_details != null) {
			setContact_details(contact_details);
		}

		String projectDurationFrom = (String)attributes.get(
				"projectDurationFrom");

		if (projectDurationFrom != null) {
			setProjectDurationFrom(projectDurationFrom);
		}

		String projectDurationTo = (String)attributes.get("projectDurationTo");

		if (projectDurationTo != null) {
			setProjectDurationTo(projectDurationTo);
		}
	}

	public long getAcpid() {
		return _acpid;
	}

	public void setAcpid(long acpid) {
		_acpid = acpid;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getOrganization_individual() {
		return _organization_individual;
	}

	public void setOrganization_individual(String organization_individual) {
		_organization_individual = organization_individual;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContact_details() {
		return _contact_details;
	}

	public void setContact_details(String contact_details) {
		_contact_details = contact_details;
	}

	public String getProjectDurationFrom() {
		return _projectDurationFrom;
	}

	public void setProjectDurationFrom(String projectDurationFrom) {
		_projectDurationFrom = projectDurationFrom;
	}

	public String getProjectDurationTo() {
		return _projectDurationTo;
	}

	public void setProjectDurationTo(String projectDurationTo) {
		_projectDurationTo = projectDurationTo;
	}

	public BaseModel<?> getactive_conservation_projectsRemoteModel() {
		return _active_conservation_projectsRemoteModel;
	}

	public void setactive_conservation_projectsRemoteModel(
		BaseModel<?> active_conservation_projectsRemoteModel) {
		_active_conservation_projectsRemoteModel = active_conservation_projectsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			active_conservation_projectsLocalServiceUtil.addactive_conservation_projects(this);
		}
		else {
			active_conservation_projectsLocalServiceUtil.updateactive_conservation_projects(this);
		}
	}

	@Override
	public active_conservation_projects toEscapedModel() {
		return (active_conservation_projects)Proxy.newProxyInstance(active_conservation_projects.class.getClassLoader(),
			new Class[] { active_conservation_projects.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		active_conservation_projectsClp clone = new active_conservation_projectsClp();

		clone.setAcpid(getAcpid());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setOrganization_individual(getOrganization_individual());
		clone.setDescription(getDescription());
		clone.setContact_details(getContact_details());
		clone.setProjectDurationFrom(getProjectDurationFrom());
		clone.setProjectDurationTo(getProjectDurationTo());

		return clone;
	}

	public int compareTo(
		active_conservation_projects active_conservation_projects) {
		long primaryKey = active_conservation_projects.getPrimaryKey();

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

		active_conservation_projectsClp active_conservation_projects = null;

		try {
			active_conservation_projects = (active_conservation_projectsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = active_conservation_projects.getPrimaryKey();

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

		sb.append("{acpid=");
		sb.append(getAcpid());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", organization_individual=");
		sb.append(getOrganization_individual());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contact_details=");
		sb.append(getContact_details());
		sb.append(", projectDurationFrom=");
		sb.append(getProjectDurationFrom());
		sb.append(", projectDurationTo=");
		sb.append(getProjectDurationTo());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.active_conservation_projects");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>acpid</column-name><column-value><![CDATA[");
		sb.append(getAcpid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_individual</column-name><column-value><![CDATA[");
		sb.append(getOrganization_individual());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact_details</column-name><column-value><![CDATA[");
		sb.append(getContact_details());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectDurationFrom</column-name><column-value><![CDATA[");
		sb.append(getProjectDurationFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectDurationTo</column-name><column-value><![CDATA[");
		sb.append(getProjectDurationTo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _acpid;
	private long _assessment_version_id;
	private String _organization_individual;
	private String _description;
	private String _contact_details;
	private String _projectDurationFrom;
	private String _projectDurationTo;
	private BaseModel<?> _active_conservation_projectsRemoteModel;
}