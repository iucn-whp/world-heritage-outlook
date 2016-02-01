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
public class benefitsSoap implements Serializable {
	public static benefitsSoap toSoapModel(benefits model) {
		benefitsSoap soapModel = new benefitsSoap();

		soapModel.setBenefits_id(model.getBenefits_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setSelected_benefit(model.getSelected_benefit());
		soapModel.setSummary(model.getSummary());
		soapModel.setData_deficient(model.getData_deficient());
		soapModel.setCommunity_within_site(model.getCommunity_within_site());
		soapModel.setCommunity_outside_site(model.getCommunity_outside_site());
		soapModel.setWider_community(model.getWider_community());

		return soapModel;
	}

	public static benefitsSoap[] toSoapModels(benefits[] models) {
		benefitsSoap[] soapModels = new benefitsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefitsSoap[][] toSoapModels(benefits[][] models) {
		benefitsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefitsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefitsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefitsSoap[] toSoapModels(List<benefits> models) {
		List<benefitsSoap> soapModels = new ArrayList<benefitsSoap>(models.size());

		for (benefits model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefitsSoap[soapModels.size()]);
	}

	public benefitsSoap() {
	}

	public long getPrimaryKey() {
		return _benefits_id;
	}

	public void setPrimaryKey(long pk) {
		setBenefits_id(pk);
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
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

	public boolean getData_deficient() {
		return _data_deficient;
	}

	public boolean isData_deficient() {
		return _data_deficient;
	}

	public void setData_deficient(boolean data_deficient) {
		_data_deficient = data_deficient;
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

	private long _benefits_id;
	private long _assessment_version_id;
	private long _selected_benefit;
	private String _summary;
	private boolean _data_deficient;
	private long _community_within_site;
	private long _community_outside_site;
	private long _wider_community;
}