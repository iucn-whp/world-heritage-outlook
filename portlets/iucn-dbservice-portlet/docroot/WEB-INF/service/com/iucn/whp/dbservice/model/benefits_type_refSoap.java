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
public class benefits_type_refSoap implements Serializable {
	public static benefits_type_refSoap toSoapModel(benefits_type_ref model) {
		benefits_type_refSoap soapModel = new benefits_type_refSoap();

		soapModel.setBenefits_type_ref_id(model.getBenefits_type_ref_id());
		soapModel.setBenefits_id(model.getBenefits_id());
		soapModel.setBenefit_checktype(model.getBenefit_checktype());
		soapModel.setBenefit_checksubtype(model.getBenefit_checksubtype());

		return soapModel;
	}

	public static benefits_type_refSoap[] toSoapModels(
		benefits_type_ref[] models) {
		benefits_type_refSoap[] soapModels = new benefits_type_refSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static benefits_type_refSoap[][] toSoapModels(
		benefits_type_ref[][] models) {
		benefits_type_refSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new benefits_type_refSoap[models.length][models[0].length];
		}
		else {
			soapModels = new benefits_type_refSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static benefits_type_refSoap[] toSoapModels(
		List<benefits_type_ref> models) {
		List<benefits_type_refSoap> soapModels = new ArrayList<benefits_type_refSoap>(models.size());

		for (benefits_type_ref model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new benefits_type_refSoap[soapModels.size()]);
	}

	public benefits_type_refSoap() {
	}

	public long getPrimaryKey() {
		return _benefits_type_ref_id;
	}

	public void setPrimaryKey(long pk) {
		setBenefits_type_ref_id(pk);
	}

	public long getBenefits_type_ref_id() {
		return _benefits_type_ref_id;
	}

	public void setBenefits_type_ref_id(long benefits_type_ref_id) {
		_benefits_type_ref_id = benefits_type_ref_id;
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
	}

	public long getBenefit_checktype() {
		return _benefit_checktype;
	}

	public void setBenefit_checktype(long benefit_checktype) {
		_benefit_checktype = benefit_checktype;
	}

	public long getBenefit_checksubtype() {
		return _benefit_checksubtype;
	}

	public void setBenefit_checksubtype(long benefit_checksubtype) {
		_benefit_checksubtype = benefit_checksubtype;
	}

	private long _benefits_type_ref_id;
	private long _benefits_id;
	private long _benefit_checktype;
	private long _benefit_checksubtype;
}