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
public class unesco_regionSoap implements Serializable {
	public static unesco_regionSoap toSoapModel(unesco_region model) {
		unesco_regionSoap soapModel = new unesco_regionSoap();

		soapModel.setUnesco_region_id(model.getUnesco_region_id());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static unesco_regionSoap[] toSoapModels(unesco_region[] models) {
		unesco_regionSoap[] soapModels = new unesco_regionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static unesco_regionSoap[][] toSoapModels(unesco_region[][] models) {
		unesco_regionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new unesco_regionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new unesco_regionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static unesco_regionSoap[] toSoapModels(List<unesco_region> models) {
		List<unesco_regionSoap> soapModels = new ArrayList<unesco_regionSoap>(models.size());

		for (unesco_region model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new unesco_regionSoap[soapModels.size()]);
	}

	public unesco_regionSoap() {
	}

	public int getPrimaryKey() {
		return _unesco_region_id;
	}

	public void setPrimaryKey(int pk) {
		setUnesco_region_id(pk);
	}

	public int getUnesco_region_id() {
		return _unesco_region_id;
	}

	public void setUnesco_region_id(int unesco_region_id) {
		_unesco_region_id = unesco_region_id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private int _unesco_region_id;
	private String _name;
}