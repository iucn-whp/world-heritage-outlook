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
public class whp_sites_componentSoap implements Serializable {
	public static whp_sites_componentSoap toSoapModel(whp_sites_component model) {
		whp_sites_componentSoap soapModel = new whp_sites_componentSoap();

		soapModel.setWhp_sites_component_id(model.getWhp_sites_component_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setComponent(model.getComponent());

		return soapModel;
	}

	public static whp_sites_componentSoap[] toSoapModels(
		whp_sites_component[] models) {
		whp_sites_componentSoap[] soapModels = new whp_sites_componentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_componentSoap[][] toSoapModels(
		whp_sites_component[][] models) {
		whp_sites_componentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_componentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_componentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_componentSoap[] toSoapModels(
		List<whp_sites_component> models) {
		List<whp_sites_componentSoap> soapModels = new ArrayList<whp_sites_componentSoap>(models.size());

		for (whp_sites_component model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_componentSoap[soapModels.size()]);
	}

	public whp_sites_componentSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_component_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_component_id(pk);
	}

	public long getWhp_sites_component_id() {
		return _whp_sites_component_id;
	}

	public void setWhp_sites_component_id(long whp_sites_component_id) {
		_whp_sites_component_id = whp_sites_component_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getComponent() {
		return _component;
	}

	public void setComponent(String component) {
		_component = component;
	}

	private long _whp_sites_component_id;
	private long _site_id;
	private String _component;
}