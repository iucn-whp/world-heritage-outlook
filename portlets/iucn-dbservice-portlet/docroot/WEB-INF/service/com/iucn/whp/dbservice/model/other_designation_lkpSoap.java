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
public class other_designation_lkpSoap implements Serializable {
	public static other_designation_lkpSoap toSoapModel(
		other_designation_lkp model) {
		other_designation_lkpSoap soapModel = new other_designation_lkpSoap();

		soapModel.setOther_designations_id(model.getOther_designations_id());
		soapModel.setDesignation(model.getDesignation());

		return soapModel;
	}

	public static other_designation_lkpSoap[] toSoapModels(
		other_designation_lkp[] models) {
		other_designation_lkpSoap[] soapModels = new other_designation_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static other_designation_lkpSoap[][] toSoapModels(
		other_designation_lkp[][] models) {
		other_designation_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new other_designation_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new other_designation_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static other_designation_lkpSoap[] toSoapModels(
		List<other_designation_lkp> models) {
		List<other_designation_lkpSoap> soapModels = new ArrayList<other_designation_lkpSoap>(models.size());

		for (other_designation_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new other_designation_lkpSoap[soapModels.size()]);
	}

	public other_designation_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _other_designations_id;
	}

	public void setPrimaryKey(int pk) {
		setOther_designations_id(pk);
	}

	public int getOther_designations_id() {
		return _other_designations_id;
	}

	public void setOther_designations_id(int other_designations_id) {
		_other_designations_id = other_designations_id;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	private int _other_designations_id;
	private String _designation;
}