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
public class contact_categorySoap implements Serializable {
	public static contact_categorySoap toSoapModel(contact_category model) {
		contact_categorySoap soapModel = new contact_categorySoap();

		soapModel.setContact_category_id(model.getContact_category_id());
		soapModel.setCategory_name(model.getCategory_name());

		return soapModel;
	}

	public static contact_categorySoap[] toSoapModels(contact_category[] models) {
		contact_categorySoap[] soapModels = new contact_categorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static contact_categorySoap[][] toSoapModels(
		contact_category[][] models) {
		contact_categorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new contact_categorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new contact_categorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static contact_categorySoap[] toSoapModels(
		List<contact_category> models) {
		List<contact_categorySoap> soapModels = new ArrayList<contact_categorySoap>(models.size());

		for (contact_category model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new contact_categorySoap[soapModels.size()]);
	}

	public contact_categorySoap() {
	}

	public int getPrimaryKey() {
		return _contact_category_id;
	}

	public void setPrimaryKey(int pk) {
		setContact_category_id(pk);
	}

	public int getContact_category_id() {
		return _contact_category_id;
	}

	public void setContact_category_id(int contact_category_id) {
		_contact_category_id = contact_category_id;
	}

	public String getCategory_name() {
		return _category_name;
	}

	public void setCategory_name(String category_name) {
		_category_name = category_name;
	}

	private int _contact_category_id;
	private String _category_name;
}