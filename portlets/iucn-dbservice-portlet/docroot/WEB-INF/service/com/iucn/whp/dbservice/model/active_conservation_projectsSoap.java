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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class active_conservation_projectsSoap implements Serializable {
	public static active_conservation_projectsSoap toSoapModel(
		active_conservation_projects model) {
		active_conservation_projectsSoap soapModel = new active_conservation_projectsSoap();

		soapModel.setAcpid(model.getAcpid());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setOrganization_individual(model.getOrganization_individual());
		soapModel.setDescription(model.getDescription());
		soapModel.setContact_details(model.getContact_details());

		return soapModel;
	}

	public static active_conservation_projectsSoap[] toSoapModels(
		active_conservation_projects[] models) {
		active_conservation_projectsSoap[] soapModels = new active_conservation_projectsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static active_conservation_projectsSoap[][] toSoapModels(
		active_conservation_projects[][] models) {
		active_conservation_projectsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new active_conservation_projectsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new active_conservation_projectsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static active_conservation_projectsSoap[] toSoapModels(
		List<active_conservation_projects> models) {
		List<active_conservation_projectsSoap> soapModels = new ArrayList<active_conservation_projectsSoap>(models.size());

		for (active_conservation_projects model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new active_conservation_projectsSoap[soapModels.size()]);
	}

	public active_conservation_projectsSoap() {
	}

	public long getPrimaryKey() {
		return _acpid;
	}

	public void setPrimaryKey(long pk) {
		setAcpid(pk);
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

	private long _acpid;
	private long _assessment_version_id;
	private String _organization_individual;
	private String _description;
	private String _contact_details;
}