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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.iucn.whp.dbservice.service.http.whp_sites_iucn_recommendationServiceSoap}.
 *
 * @author    alok.sen
 * @see       com.iucn.whp.dbservice.service.http.whp_sites_iucn_recommendationServiceSoap
 * @generated
 */
public class whp_sites_iucn_recommendationSoap implements Serializable {
	public static whp_sites_iucn_recommendationSoap toSoapModel(
		whp_sites_iucn_recommendation model) {
		whp_sites_iucn_recommendationSoap soapModel = new whp_sites_iucn_recommendationSoap();

		soapModel.setWhp_sites_iucn_recommendation_id(model.getWhp_sites_iucn_recommendation_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setRecommendation_type(model.getRecommendation_type());
		soapModel.setRec_date(model.getRec_date());

		return soapModel;
	}

	public static whp_sites_iucn_recommendationSoap[] toSoapModels(
		whp_sites_iucn_recommendation[] models) {
		whp_sites_iucn_recommendationSoap[] soapModels = new whp_sites_iucn_recommendationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_iucn_recommendationSoap[][] toSoapModels(
		whp_sites_iucn_recommendation[][] models) {
		whp_sites_iucn_recommendationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_iucn_recommendationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_iucn_recommendationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_iucn_recommendationSoap[] toSoapModels(
		List<whp_sites_iucn_recommendation> models) {
		List<whp_sites_iucn_recommendationSoap> soapModels = new ArrayList<whp_sites_iucn_recommendationSoap>(models.size());

		for (whp_sites_iucn_recommendation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_iucn_recommendationSoap[soapModels.size()]);
	}

	public whp_sites_iucn_recommendationSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_iucn_recommendation_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_iucn_recommendation_id(pk);
	}

	public long getWhp_sites_iucn_recommendation_id() {
		return _whp_sites_iucn_recommendation_id;
	}

	public void setWhp_sites_iucn_recommendation_id(
		long whp_sites_iucn_recommendation_id) {
		_whp_sites_iucn_recommendation_id = whp_sites_iucn_recommendation_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getRecommendation_type() {
		return _recommendation_type;
	}

	public void setRecommendation_type(int recommendation_type) {
		_recommendation_type = recommendation_type;
	}

	public Date getRec_date() {
		return _rec_date;
	}

	public void setRec_date(Date rec_date) {
		_rec_date = rec_date;
	}

	private long _whp_sites_iucn_recommendation_id;
	private long _site_id;
	private int _recommendation_type;
	private Date _rec_date;
}