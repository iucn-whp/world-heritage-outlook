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
public class current_threat_assessment_catSoap implements Serializable {
	public static current_threat_assessment_catSoap toSoapModel(
		current_threat_assessment_cat model) {
		current_threat_assessment_catSoap soapModel = new current_threat_assessment_catSoap();

		soapModel.setCur_threat_cat_id(model.getCur_threat_cat_id());
		soapModel.setCurrent_threat_id(model.getCurrent_threat_id());
		soapModel.setCategory_id(model.getCategory_id());
		soapModel.setSub_cat_id(model.getSub_cat_id());

		return soapModel;
	}

	public static current_threat_assessment_catSoap[] toSoapModels(
		current_threat_assessment_cat[] models) {
		current_threat_assessment_catSoap[] soapModels = new current_threat_assessment_catSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static current_threat_assessment_catSoap[][] toSoapModels(
		current_threat_assessment_cat[][] models) {
		current_threat_assessment_catSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new current_threat_assessment_catSoap[models.length][models[0].length];
		}
		else {
			soapModels = new current_threat_assessment_catSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static current_threat_assessment_catSoap[] toSoapModels(
		List<current_threat_assessment_cat> models) {
		List<current_threat_assessment_catSoap> soapModels = new ArrayList<current_threat_assessment_catSoap>(models.size());

		for (current_threat_assessment_cat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new current_threat_assessment_catSoap[soapModels.size()]);
	}

	public current_threat_assessment_catSoap() {
	}

	public long getPrimaryKey() {
		return _cur_threat_cat_id;
	}

	public void setPrimaryKey(long pk) {
		setCur_threat_cat_id(pk);
	}

	public long getCur_threat_cat_id() {
		return _cur_threat_cat_id;
	}

	public void setCur_threat_cat_id(long cur_threat_cat_id) {
		_cur_threat_cat_id = cur_threat_cat_id;
	}

	public long getCurrent_threat_id() {
		return _current_threat_id;
	}

	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_id = current_threat_id;
	}

	public long getCategory_id() {
		return _category_id;
	}

	public void setCategory_id(long category_id) {
		_category_id = category_id;
	}

	public long getSub_cat_id() {
		return _sub_cat_id;
	}

	public void setSub_cat_id(long sub_cat_id) {
		_sub_cat_id = sub_cat_id;
	}

	private long _cur_threat_cat_id;
	private long _current_threat_id;
	private long _category_id;
	private long _sub_cat_id;
}