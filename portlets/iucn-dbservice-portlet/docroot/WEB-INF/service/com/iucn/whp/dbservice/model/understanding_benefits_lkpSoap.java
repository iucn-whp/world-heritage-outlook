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
public class understanding_benefits_lkpSoap implements Serializable {
	public static understanding_benefits_lkpSoap toSoapModel(
		understanding_benefits_lkp model) {
		understanding_benefits_lkpSoap soapModel = new understanding_benefits_lkpSoap();

		soapModel.setBenefits_id(model.getBenefits_id());
		soapModel.setSelected_benefit(model.getSelected_benefit());

		return soapModel;
	}

	public static understanding_benefits_lkpSoap[] toSoapModels(
		understanding_benefits_lkp[] models) {
		understanding_benefits_lkpSoap[] soapModels = new understanding_benefits_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static understanding_benefits_lkpSoap[][] toSoapModels(
		understanding_benefits_lkp[][] models) {
		understanding_benefits_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new understanding_benefits_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new understanding_benefits_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static understanding_benefits_lkpSoap[] toSoapModels(
		List<understanding_benefits_lkp> models) {
		List<understanding_benefits_lkpSoap> soapModels = new ArrayList<understanding_benefits_lkpSoap>(models.size());

		for (understanding_benefits_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new understanding_benefits_lkpSoap[soapModels.size()]);
	}

	public understanding_benefits_lkpSoap() {
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

	public String getSelected_benefit() {
		return _selected_benefit;
	}

	public void setSelected_benefit(String selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	private long _benefits_id;
	private String _selected_benefit;
}