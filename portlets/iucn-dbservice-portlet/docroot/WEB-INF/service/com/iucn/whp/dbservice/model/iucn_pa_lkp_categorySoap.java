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
public class iucn_pa_lkp_categorySoap implements Serializable {
	public static iucn_pa_lkp_categorySoap toSoapModel(
		iucn_pa_lkp_category model) {
		iucn_pa_lkp_categorySoap soapModel = new iucn_pa_lkp_categorySoap();

		soapModel.setIucn_pa_category_id(model.getIucn_pa_category_id());
		soapModel.setCategory(model.getCategory());

		return soapModel;
	}

	public static iucn_pa_lkp_categorySoap[] toSoapModels(
		iucn_pa_lkp_category[] models) {
		iucn_pa_lkp_categorySoap[] soapModels = new iucn_pa_lkp_categorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static iucn_pa_lkp_categorySoap[][] toSoapModels(
		iucn_pa_lkp_category[][] models) {
		iucn_pa_lkp_categorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new iucn_pa_lkp_categorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new iucn_pa_lkp_categorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static iucn_pa_lkp_categorySoap[] toSoapModels(
		List<iucn_pa_lkp_category> models) {
		List<iucn_pa_lkp_categorySoap> soapModels = new ArrayList<iucn_pa_lkp_categorySoap>(models.size());

		for (iucn_pa_lkp_category model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new iucn_pa_lkp_categorySoap[soapModels.size()]);
	}

	public iucn_pa_lkp_categorySoap() {
	}

	public int getPrimaryKey() {
		return _iucn_pa_category_id;
	}

	public void setPrimaryKey(int pk) {
		setIucn_pa_category_id(pk);
	}

	public int getIucn_pa_category_id() {
		return _iucn_pa_category_id;
	}

	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_iucn_pa_category_id = iucn_pa_category_id;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	private int _iucn_pa_category_id;
	private String _category;
}