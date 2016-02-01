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
public class potential_project_needsSoap implements Serializable {
	public static potential_project_needsSoap toSoapModel(
		potential_project_needs model) {
		potential_project_needsSoap soapModel = new potential_project_needsSoap();

		soapModel.setPpn_id(model.getPpn_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setOrganization_individual(model.getOrganization_individual());
		soapModel.setDescription(model.getDescription());
		soapModel.setContact_details(model.getContact_details());

		return soapModel;
	}

	public static potential_project_needsSoap[] toSoapModels(
		potential_project_needs[] models) {
		potential_project_needsSoap[] soapModels = new potential_project_needsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static potential_project_needsSoap[][] toSoapModels(
		potential_project_needs[][] models) {
		potential_project_needsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new potential_project_needsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new potential_project_needsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static potential_project_needsSoap[] toSoapModels(
		List<potential_project_needs> models) {
		List<potential_project_needsSoap> soapModels = new ArrayList<potential_project_needsSoap>(models.size());

		for (potential_project_needs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new potential_project_needsSoap[soapModels.size()]);
	}

	public potential_project_needsSoap() {
	}

	public long getPrimaryKey() {
		return _ppn_id;
	}

	public void setPrimaryKey(long pk) {
		setPpn_id(pk);
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

	private long _ppn_id;
	private long _assessment_version_id;
	private String _organization_individual;
	private String _description;
	private String _contact_details;
}