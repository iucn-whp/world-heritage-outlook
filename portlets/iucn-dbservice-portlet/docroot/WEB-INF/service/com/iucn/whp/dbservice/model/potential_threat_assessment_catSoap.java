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
public class potential_threat_assessment_catSoap implements Serializable {
	public static potential_threat_assessment_catSoap toSoapModel(
		potential_threat_assessment_cat model) {
		potential_threat_assessment_catSoap soapModel = new potential_threat_assessment_catSoap();

		soapModel.setPot_threat_cat_id(model.getPot_threat_cat_id());
		soapModel.setPotential_threat_id(model.getPotential_threat_id());
		soapModel.setCategory_id(model.getCategory_id());
		soapModel.setSub_cat_id(model.getSub_cat_id());

		return soapModel;
	}

	public static potential_threat_assessment_catSoap[] toSoapModels(
		potential_threat_assessment_cat[] models) {
		potential_threat_assessment_catSoap[] soapModels = new potential_threat_assessment_catSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static potential_threat_assessment_catSoap[][] toSoapModels(
		potential_threat_assessment_cat[][] models) {
		potential_threat_assessment_catSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new potential_threat_assessment_catSoap[models.length][models[0].length];
		}
		else {
			soapModels = new potential_threat_assessment_catSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static potential_threat_assessment_catSoap[] toSoapModels(
		List<potential_threat_assessment_cat> models) {
		List<potential_threat_assessment_catSoap> soapModels = new ArrayList<potential_threat_assessment_catSoap>(models.size());

		for (potential_threat_assessment_cat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new potential_threat_assessment_catSoap[soapModels.size()]);
	}

	public potential_threat_assessment_catSoap() {
	}

	public long getPrimaryKey() {
		return _pot_threat_cat_id;
	}

	public void setPrimaryKey(long pk) {
		setPot_threat_cat_id(pk);
	}

	public long getPot_threat_cat_id() {
		return _pot_threat_cat_id;
	}

	public void setPot_threat_cat_id(long pot_threat_cat_id) {
		_pot_threat_cat_id = pot_threat_cat_id;
	}

	public long getPotential_threat_id() {
		return _potential_threat_id;
	}

	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_id = potential_threat_id;
	}

	public long getCategory_id() {
		return _category_id;
	}

	public void setCategory_id(long category_id) {
		_category_id = category_id;
	}

	public long getSub_cat_id() {
		return _sub_cat_id;
	}

	public void setSub_cat_id(long sub_cat_id) {
		_sub_cat_id = sub_cat_id;
	}

	private long _pot_threat_cat_id;
	private long _potential_threat_id;
	private long _category_id;
	private long _sub_cat_id;
}