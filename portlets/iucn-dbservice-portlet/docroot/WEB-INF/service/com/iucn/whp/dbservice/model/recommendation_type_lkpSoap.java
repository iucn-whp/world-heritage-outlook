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
public class recommendation_type_lkpSoap implements Serializable {
	public static recommendation_type_lkpSoap toSoapModel(
		recommendation_type_lkp model) {
		recommendation_type_lkpSoap soapModel = new recommendation_type_lkpSoap();

		soapModel.setRec_type_id(model.getRec_type_id());
		soapModel.setRecommendation(model.getRecommendation());

		return soapModel;
	}

	public static recommendation_type_lkpSoap[] toSoapModels(
		recommendation_type_lkp[] models) {
		recommendation_type_lkpSoap[] soapModels = new recommendation_type_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static recommendation_type_lkpSoap[][] toSoapModels(
		recommendation_type_lkp[][] models) {
		recommendation_type_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new recommendation_type_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new recommendation_type_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static recommendation_type_lkpSoap[] toSoapModels(
		List<recommendation_type_lkp> models) {
		List<recommendation_type_lkpSoap> soapModels = new ArrayList<recommendation_type_lkpSoap>(models.size());

		for (recommendation_type_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new recommendation_type_lkpSoap[soapModels.size()]);
	}

	public recommendation_type_lkpSoap() {
	}

	public int getPrimaryKey() {
		return _rec_type_id;
	}

	public void setPrimaryKey(int pk) {
		setRec_type_id(pk);
	}

	public int getRec_type_id() {
		return _rec_type_id;
	}

	public void setRec_type_id(int rec_type_id) {
		_rec_type_id = rec_type_id;
	}

	public String getRecommendation() {
		return _recommendation;
	}

	public void setRecommendation(String recommendation) {
		_recommendation = recommendation;
	}

	private int _rec_type_id;
	private String _recommendation;
}