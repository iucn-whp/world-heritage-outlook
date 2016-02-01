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
public class thematic_lkpSoap implements Serializable {
	public static thematic_lkpSoap toSoapModel(thematic_lkp model) {
		thematic_lkpSoap soapModel = new thematic_lkpSoap();

		soapModel.setThematicid(model.getThematicid());
		soapModel.setThematic(model.getThematic());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static thematic_lkpSoap[] toSoapModels(thematic_lkp[] models) {
		thematic_lkpSoap[] soapModels = new thematic_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static thematic_lkpSoap[][] toSoapModels(thematic_lkp[][] models) {
		thematic_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new thematic_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new thematic_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static thematic_lkpSoap[] toSoapModels(List<thematic_lkp> models) {
		List<thematic_lkpSoap> soapModels = new ArrayList<thematic_lkpSoap>(models.size());

		for (thematic_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new thematic_lkpSoap[soapModels.size()]);
	}

	public thematic_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _thematicid;
	}

	public void setPrimaryKey(long pk) {
		setThematicid(pk);
	}

	public long getThematicid() {
		return _thematicid;
	}

	public void setThematicid(long thematicid) {
		_thematicid = thematicid;
	}

	public String getThematic() {
		return _thematic;
	}

	public void setThematic(String thematic) {
		_thematic = thematic;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _thematicid;
	private String _thematic;
	private String _description;
}