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
public class inscription_criteria_lkpSoap implements Serializable {
	public static inscription_criteria_lkpSoap toSoapModel(
		inscription_criteria_lkp model) {
		inscription_criteria_lkpSoap soapModel = new inscription_criteria_lkpSoap();

		soapModel.setCriteria_id(model.getCriteria_id());
		soapModel.setCriteria(model.getCriteria());
		soapModel.setCriteria_type(model.getCriteria_type());
		soapModel.setCriteria_desc(model.getCriteria_desc());
		soapModel.setCriteria_title(model.getCriteria_title());

		return soapModel;
	}

	public static inscription_criteria_lkpSoap[] toSoapModels(
		inscription_criteria_lkp[] models) {
		inscription_criteria_lkpSoap[] soapModels = new inscription_criteria_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static inscription_criteria_lkpSoap[][] toSoapModels(
		inscription_criteria_lkp[][] models) {
		inscription_criteria_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new inscription_criteria_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new inscription_criteria_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static inscription_criteria_lkpSoap[] toSoapModels(
		List<inscription_criteria_lkp> models) {
		List<inscription_criteria_lkpSoap> soapModels = new ArrayList<inscription_criteria_lkpSoap>(models.size());

		for (inscription_criteria_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new inscription_criteria_lkpSoap[soapModels.size()]);
	}

	public inscription_criteria_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _criteria_id;
	}

	public void setPrimaryKey(int pk) {
		setCriteria_id(pk);
	}

	public int getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(int criteria_id) {
		_criteria_id = criteria_id;
	}

	public String getCriteria() {
		return _criteria;
	}

	public void setCriteria(String criteria) {
		_criteria = criteria;
	}

	public String getCriteria_type() {
		return _criteria_type;
	}

	public void setCriteria_type(String criteria_type) {
		_criteria_type = criteria_type;
	}

	public String getCriteria_desc() {
		return _criteria_desc;
	}

	public void setCriteria_desc(String criteria_desc) {
		_criteria_desc = criteria_desc;
	}

	public String getCriteria_title() {
		return _criteria_title;
	}

	public void setCriteria_title(String criteria_title) {
		_criteria_title = criteria_title;
	}

	private int _criteria_id;
	private String _criteria;
	private String _criteria_type;
	private String _criteria_desc;
	private String _criteria_title;
}