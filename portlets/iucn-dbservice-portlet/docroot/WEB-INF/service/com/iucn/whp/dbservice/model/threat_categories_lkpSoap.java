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
public class threat_categories_lkpSoap implements Serializable {
	public static threat_categories_lkpSoap toSoapModel(
		threat_categories_lkp model) {
		threat_categories_lkpSoap soapModel = new threat_categories_lkpSoap();

		soapModel.setThreatCategoryid(model.getThreatCategoryid());
		soapModel.setThreat_category(model.getThreat_category());

		return soapModel;
	}

	public static threat_categories_lkpSoap[] toSoapModels(
		threat_categories_lkp[] models) {
		threat_categories_lkpSoap[] soapModels = new threat_categories_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static threat_categories_lkpSoap[][] toSoapModels(
		threat_categories_lkp[][] models) {
		threat_categories_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new threat_categories_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new threat_categories_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static threat_categories_lkpSoap[] toSoapModels(
		List<threat_categories_lkp> models) {
		List<threat_categories_lkpSoap> soapModels = new ArrayList<threat_categories_lkpSoap>(models.size());

		for (threat_categories_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new threat_categories_lkpSoap[soapModels.size()]);
	}

	public threat_categories_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _threatCategoryid;
	}

	public void setPrimaryKey(long pk) {
		setThreatCategoryid(pk);
	}

	public long getThreatCategoryid() {
		return _threatCategoryid;
	}

	public void setThreatCategoryid(long threatCategoryid) {
		_threatCategoryid = threatCategoryid;
	}

	public String getThreat_category() {
		return _threat_category;
	}

	public void setThreat_category(String threat_category) {
		_threat_category = threat_category;
	}

	private long _threatCategoryid;
	private String _threat_category;
}