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
public class whp_sites_other_designationsSoap implements Serializable {
	public static whp_sites_other_designationsSoap toSoapModel(
		whp_sites_other_designations model) {
		whp_sites_other_designationsSoap soapModel = new whp_sites_other_designationsSoap();

		soapModel.setWhp_sites_other_designations_id(model.getWhp_sites_other_designations_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setOther_designation_id(model.getOther_designation_id());

		return soapModel;
	}

	public static whp_sites_other_designationsSoap[] toSoapModels(
		whp_sites_other_designations[] models) {
		whp_sites_other_designationsSoap[] soapModels = new whp_sites_other_designationsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_other_designationsSoap[][] toSoapModels(
		whp_sites_other_designations[][] models) {
		whp_sites_other_designationsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_other_designationsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_other_designationsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_other_designationsSoap[] toSoapModels(
		List<whp_sites_other_designations> models) {
		List<whp_sites_other_designationsSoap> soapModels = new ArrayList<whp_sites_other_designationsSoap>(models.size());

		for (whp_sites_other_designations model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_other_designationsSoap[soapModels.size()]);
	}

	public whp_sites_other_designationsSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_other_designations_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_other_designations_id(pk);
	}

	public long getWhp_sites_other_designations_id() {
		return _whp_sites_other_designations_id;
	}

	public void setWhp_sites_other_designations_id(
		long whp_sites_other_designations_id) {
		_whp_sites_other_designations_id = whp_sites_other_designations_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getOther_designation_id() {
		return _other_designation_id;
	}

	public void setOther_designation_id(int other_designation_id) {
		_other_designation_id = other_designation_id;
	}

	private long _whp_sites_other_designations_id;
	private long _site_id;
	private int _other_designation_id;
}