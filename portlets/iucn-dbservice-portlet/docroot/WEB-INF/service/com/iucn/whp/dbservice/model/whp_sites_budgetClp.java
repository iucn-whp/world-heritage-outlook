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

import com.iucn.whp.dbservice.service.whp_sites_budgetLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class whp_sites_budgetClp extends BaseModelImpl<whp_sites_budget>
	implements whp_sites_budget {
	public whp_sites_budgetClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_budget.class;
	}

	public String getModelClassName() {
		return whp_sites_budget.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_budget_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_budget_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_budget_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_budget_id", getWhp_sites_budget_id());
		attributes.put("site_id", getSite_id());
		attributes.put("currency_local", getCurrency_local());
		attributes.put("currency", getCurrency());
		attributes.put("currency_usd", getCurrency_usd());
		attributes.put("date", getDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_budget_id = (Long)attributes.get("whp_sites_budget_id");

		if (whp_sites_budget_id != null) {
			setWhp_sites_budget_id(whp_sites_budget_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Double currency_local = (Double)attributes.get("currency_local");

		if (currency_local != null) {
			setCurrency_local(currency_local);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Double currency_usd = (Double)attributes.get("currency_usd");

		if (currency_usd != null) {
			setCurrency_usd(currency_usd);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}
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

	public BaseModel<?> getwhp_sites_budgetRemoteModel() {
		return _whp_sites_budgetRemoteModel;
	}

	public void setwhp_sites_budgetRemoteModel(
		BaseModel<?> whp_sites_budgetRemoteModel) {
		_whp_sites_budgetRemoteModel = whp_sites_budgetRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_budgetLocalServiceUtil.addwhp_sites_budget(this);
		}
		else {
			whp_sites_budgetLocalServiceUtil.updatewhp_sites_budget(this);
		}
	}

	@Override
	public whp_sites_budget toEscapedModel() {
		return (whp_sites_budget)Proxy.newProxyInstance(whp_sites_budget.class.getClassLoader(),
			new Class[] { whp_sites_budget.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_budgetClp clone = new whp_sites_budgetClp();

		clone.setWhp_sites_budget_id(getWhp_sites_budget_id());
		clone.setSite_id(getSite_id());
		clone.setCurrency_local(getCurrency_local());
		clone.setCurrency(getCurrency());
		clone.setCurrency_usd(getCurrency_usd());
		clone.setDate(getDate());

		return clone;
	}

	public int compareTo(whp_sites_budget whp_sites_budget) {
		long primaryKey = whp_sites_budget.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		whp_sites_budgetClp whp_sites_budget = null;

		try {
			whp_sites_budget = (whp_sites_budgetClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_budget.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{whp_sites_budget_id=");
		sb.append(getWhp_sites_budget_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", currency_local=");
		sb.append(getCurrency_local());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", currency_usd=");
		sb.append(getCurrency_usd());
		sb.append(", date=");
		sb.append(getDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_budget");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_budget_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_budget_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency_local</column-name><column-value><![CDATA[");
		sb.append(getCurrency_local());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency_usd</column-name><column-value><![CDATA[");
		sb.append(getCurrency_usd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_budget_id;
	private long _site_id;
	private double _currency_local;
	private String _currency;
	private double _currency_usd;
	private Date _date;
	private BaseModel<?> _whp_sites_budgetRemoteModel;
}