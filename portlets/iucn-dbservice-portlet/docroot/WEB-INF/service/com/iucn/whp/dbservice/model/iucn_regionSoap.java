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
public class iucn_regionSoap implements Serializable {
	public static iucn_regionSoap toSoapModel(iucn_region model) {
		iucn_regionSoap soapModel = new iucn_regionSoap();

		soapModel.setIucn_region_id(model.getIucn_region_id());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static iucn_regionSoap[] toSoapModels(iucn_region[] models) {
		iucn_regionSoap[] soapModels = new iucn_regionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static iucn_regionSoap[][] toSoapModels(iucn_region[][] models) {
		iucn_regionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new iucn_regionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new iucn_regionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static iucn_regionSoap[] toSoapModels(List<iucn_region> models) {
		List<iucn_regionSoap> soapModels = new ArrayList<iucn_regionSoap>(models.size());

		for (iucn_region model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new iucn_regionSoap[soapModels.size()]);
	}

	public iucn_regionSoap() {
	}

	public int getPrimaryKey() {
		return _iucn_region_id;
	}

	public void setPrimaryKey(int pk) {
		setIucn_region_id(pk);
	}

	public int getIucn_region_id() {
		return _iucn_region_id;
	}

	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region_id = iucn_region_id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private int _iucn_region_id;
	private String _name;
}