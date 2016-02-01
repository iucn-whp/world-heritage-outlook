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
public class benefit_checktype_lkpSoap implements Serializable {
	public static benefit_checktype_lkpSoap toSoapModel(
		benefit_checktype_lkp model) {
		benefit_checktype_lkpSoap soapModel = new benefit_checktype_lkpSoap();

		soapModel.setBenefit_id(model.getBenefit_id());
		soapModel.setBenefit_checktype(model.getBenefit_checktype());

		return soapModel;
	}

	public static benefit_checktype_lkpSoap[] toSoapModels(
		benefit_checktype_lkp[] models) {
		benefit_checktype_lkpSoap[] soapModels = new benefit_checktype_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefit_checktype_lkpSoap[][] toSoapModels(
		benefit_checktype_lkp[][] models) {
		benefit_checktype_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefit_checktype_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefit_checktype_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefit_checktype_lkpSoap[] toSoapModels(
		List<benefit_checktype_lkp> models) {
		List<benefit_checktype_lkpSoap> soapModels = new ArrayList<benefit_checktype_lkpSoap>(models.size());

		for (benefit_checktype_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefit_checktype_lkpSoap[soapModels.size()]);
	}

	public benefit_checktype_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _benefit_id;
	}

	public void setPrimaryKey(long pk) {
		setBenefit_id(pk);
	}

	public long getBenefit_id() {
		return _benefit_id;
	}

	public void setBenefit_id(long benefit_id) {
		_benefit_id = benefit_id;
	}

	public String getBenefit_checktype() {
		return _benefit_checktype;
	}

	public void setBenefit_checktype(String benefit_checktype) {
		_benefit_checktype = benefit_checktype;
	}

	private long _benefit_id;
	private String _benefit_checktype;
}