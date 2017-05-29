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
public class threat_subcategories_lkpSoap implements Serializable {
	public static threat_subcategories_lkpSoap toSoapModel(
		threat_subcategories_lkp model) {
		threat_subcategories_lkpSoap soapModel = new threat_subcategories_lkpSoap();

		soapModel.setId(model.getId());
		soapModel.setThreat_sub_category(model.getThreat_sub_category());
		soapModel.setParent_id(model.getParent_id());

		return soapModel;
	}

	public static threat_subcategories_lkpSoap[] toSoapModels(
		threat_subcategories_lkp[] models) {
		threat_subcategories_lkpSoap[] soapModels = new threat_subcategories_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static threat_subcategories_lkpSoap[][] toSoapModels(
		threat_subcategories_lkp[][] models) {
		threat_subcategories_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new threat_subcategories_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new threat_subcategories_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static threat_subcategories_lkpSoap[] toSoapModels(
		List<threat_subcategories_lkp> models) {
		List<threat_subcategories_lkpSoap> soapModels = new ArrayList<threat_subcategories_lkpSoap>(models.size());

		for (threat_subcategories_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new threat_subcategories_lkpSoap[soapModels.size()]);
	}

	public threat_subcategories_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getThreat_sub_category() {
		return _threat_sub_category;
	}

	public void setThreat_sub_category(String threat_sub_category) {
		_threat_sub_category = threat_sub_category;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	private long _id;
	private String _threat_sub_category;
	private long _parent_id;
}