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
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class whp_sites_visitorsSoap implements Serializable {
	public static whp_sites_visitorsSoap toSoapModel(whp_sites_visitors model) {
		whp_sites_visitorsSoap soapModel = new whp_sites_visitorsSoap();

		soapModel.setWhp_sites_visitors_id(model.getWhp_sites_visitors_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setVisitor_count(model.getVisitor_count());
		soapModel.setRecord_date(model.getRecord_date());

		return soapModel;
	}

	public static whp_sites_visitorsSoap[] toSoapModels(
		whp_sites_visitors[] models) {
		whp_sites_visitorsSoap[] soapModels = new whp_sites_visitorsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_visitorsSoap[][] toSoapModels(
		whp_sites_visitors[][] models) {
		whp_sites_visitorsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_visitorsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_visitorsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_visitorsSoap[] toSoapModels(
		List<whp_sites_visitors> models) {
		List<whp_sites_visitorsSoap> soapModels = new ArrayList<whp_sites_visitorsSoap>(models.size());

		for (whp_sites_visitors model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_visitorsSoap[soapModels.size()]);
	}

	public whp_sites_visitorsSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_visitors_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_visitors_id(pk);
	}

	public long getWhp_sites_visitors_id() {
		return _whp_sites_visitors_id;
	}

	public void setWhp_sites_visitors_id(long whp_sites_visitors_id) {
		_whp_sites_visitors_id = whp_sites_visitors_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getVisitor_count() {
		return _visitor_count;
	}

	public void setVisitor_count(long visitor_count) {
		_visitor_count = visitor_count;
	}

	public Date getRecord_date() {
		return _record_date;
	}

	public void setRecord_date(Date record_date) {
		_record_date = record_date;
	}

	private long _whp_sites_visitors_id;
	private long _site_id;
	private long _visitor_count;
	private Date _record_date;
}