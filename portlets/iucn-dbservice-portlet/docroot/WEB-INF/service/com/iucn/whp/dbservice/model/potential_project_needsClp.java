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

import com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil;

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
public class potential_project_needsClp extends BaseModelImpl<potential_project_needs>
	implements potential_project_needs {
	public potential_project_needsClp() {
	}

	public Class<?> getModelClass() {
		return potential_project_needs.class;
	}

	public String getModelClassName() {
		return potential_project_needs.class.getName();
	}

	public long getPrimaryKey() {
		return _ppn_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPpn_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_ppn_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ppn_id", getPpn_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("organization_individual", getOrganization_individual());
		attributes.put("description", getDescription());
		attributes.put("contact_details", getContact_details());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ppn_id = (Long)attributes.get("ppn_id");

		if (ppn_id != null) {
			setPpn_id(ppn_id);
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
	}

	public long getPpn_id() {
		return _ppn_id;
	}

	public void setPpn_id(long ppn_id) {
		_ppn_id = ppn_id;
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

	public BaseModel<?> getpotential_project_needsRemoteModel() {
		return _potential_project_needsRemoteModel;
	}

	public void setpotential_project_needsRemoteModel(
		BaseModel<?> potential_project_needsRemoteModel) {
		_potential_project_needsRemoteModel = potential_project_needsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			potential_project_needsLocalServiceUtil.addpotential_project_needs(this);
		}
		else {
			potential_project_needsLocalServiceUtil.updatepotential_project_needs(this);
		}
	}

	@Override
	public potential_project_needs toEscapedModel() {
		return (potential_project_needs)Proxy.newProxyInstance(potential_project_needs.class.getClassLoader(),
			new Class[] { potential_project_needs.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		potential_project_needsClp clone = new potential_project_needsClp();

		clone.setPpn_id(getPpn_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setOrganization_individual(getOrganization_individual());
		clone.setDescription(getDescription());
		clone.setContact_details(getContact_details());

		return clone;
	}

	public int compareTo(potential_project_needs potential_project_needs) {
		long primaryKey = potential_project_needs.getPrimaryKey();

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

		potential_project_needsClp potential_project_needs = null;

		try {
			potential_project_needs = (potential_project_needsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = potential_project_needs.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{ppn_id=");
		sb.append(getPpn_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", organization_individual=");
		sb.append(getOrganization_individual());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contact_details=");
		sb.append(getContact_details());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.potential_project_needs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ppn_id</column-name><column-value><![CDATA[");
		sb.append(getPpn_id());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _ppn_id;
	private long _assessment_version_id;
	private String _organization_individual;
	private String _description;
	private String _contact_details;
	private BaseModel<?> _potential_project_needsRemoteModel;
}