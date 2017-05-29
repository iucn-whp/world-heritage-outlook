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
public class benefit_checksubtype_lkpSoap implements Serializable {
	public static benefit_checksubtype_lkpSoap toSoapModel(
		benefit_checksubtype_lkp model) {
		benefit_checksubtype_lkpSoap soapModel = new benefit_checksubtype_lkpSoap();

		soapModel.setSubbenefit_id(model.getSubbenefit_id());
		soapModel.setBenefit_checksubtype(model.getBenefit_checksubtype());
		soapModel.setParent_id(model.getParent_id());
		soapModel.setPosition(model.getPosition());
		soapModel.setActive(model.getActive());

		return soapModel;
	}

	public static benefit_checksubtype_lkpSoap[] toSoapModels(
		benefit_checksubtype_lkp[] models) {
		benefit_checksubtype_lkpSoap[] soapModels = new benefit_checksubtype_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefit_checksubtype_lkpSoap[][] toSoapModels(
		benefit_checksubtype_lkp[][] models) {
		benefit_checksubtype_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefit_checksubtype_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefit_checksubtype_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefit_checksubtype_lkpSoap[] toSoapModels(
		List<benefit_checksubtype_lkp> models) {
		List<benefit_checksubtype_lkpSoap> soapModels = new ArrayList<benefit_checksubtype_lkpSoap>(models.size());

		for (benefit_checksubtype_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefit_checksubtype_lkpSoap[soapModels.size()]);
	}

	public benefit_checksubtype_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _subbenefit_id;
	}

	public void setPrimaryKey(long pk) {
		setSubbenefit_id(pk);
	}

	public long getSubbenefit_id() {
		return _subbenefit_id;
	}

	public void setSubbenefit_id(long subbenefit_id) {
		_subbenefit_id = subbenefit_id;
	}

	public String getBenefit_checksubtype() {
		return _benefit_checksubtype;
	}

	public void setBenefit_checksubtype(String benefit_checksubtype) {
		_benefit_checksubtype = benefit_checksubtype;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	public long getPosition() {
		return _position;
	}

	public void setPosition(long position) {
		_position = position;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	private long _subbenefit_id;
	private String _benefit_checksubtype;
	private long _parent_id;
	private long _position;
	private boolean _active;
}