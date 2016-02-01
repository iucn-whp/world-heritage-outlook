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
public class whp_sites_budgetSoap implements Serializable {
	public static whp_sites_budgetSoap toSoapModel(whp_sites_budget model) {
		whp_sites_budgetSoap soapModel = new whp_sites_budgetSoap();

		soapModel.setWhp_sites_budget_id(model.getWhp_sites_budget_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setCurrency_local(model.getCurrency_local());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setCurrency_usd(model.getCurrency_usd());
		soapModel.setDate(model.getDate());

		return soapModel;
	}

	public static whp_sites_budgetSoap[] toSoapModels(whp_sites_budget[] models) {
		whp_sites_budgetSoap[] soapModels = new whp_sites_budgetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_budgetSoap[][] toSoapModels(
		whp_sites_budget[][] models) {
		whp_sites_budgetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_budgetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_budgetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_budgetSoap[] toSoapModels(
		List<whp_sites_budget> models) {
		List<whp_sites_budgetSoap> soapModels = new ArrayList<whp_sites_budgetSoap>(models.size());

		for (whp_sites_budget model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_budgetSoap[soapModels.size()]);
	}

	public whp_sites_budgetSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_budget_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_budget_id(pk);
	}

	public long getWhp_sites_budget_id() {
		return _whp_sites_budget_id;
	}

	public void setWhp_sites_budget_id(long whp_sites_budget_id) {
		_whp_sites_budget_id = whp_sites_budget_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public double getCurrency_local() {
		return _currency_local;
	}

	public void setCurrency_local(double currency_local) {
		_currency_local = currency_local;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public double getCurrency_usd() {
		return _currency_usd;
	}

	public void setCurrency_usd(double currency_usd) {
		_currency_usd = currency_usd;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	private long _whp_sites_budget_id;
	private long _site_id;
	private double _currency_local;
	private String _currency;
	private double _currency_usd;
	private Date _date;
}