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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link whp_sites_budget}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_budget
 * @generated
 */
public class whp_sites_budgetWrapper implements whp_sites_budget,
	ModelWrapper<whp_sites_budget> {
	public whp_sites_budgetWrapper(whp_sites_budget whp_sites_budget) {
		_whp_sites_budget = whp_sites_budget;
	}

	public Class<?> getModelClass() {
		return whp_sites_budget.class;
	}

	public String getModelClassName() {
		return whp_sites_budget.class.getName();
	}

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

	/**
	* Returns the primary key of this whp_sites_budget.
	*
	* @return the primary key of this whp_sites_budget
	*/
	public long getPrimaryKey() {
		return _whp_sites_budget.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_budget.
	*
	* @param primaryKey the primary key of this whp_sites_budget
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_budget.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_budget_id of this whp_sites_budget.
	*
	* @return the whp_sites_budget_id of this whp_sites_budget
	*/
	public long getWhp_sites_budget_id() {
		return _whp_sites_budget.getWhp_sites_budget_id();
	}

	/**
	* Sets the whp_sites_budget_id of this whp_sites_budget.
	*
	* @param whp_sites_budget_id the whp_sites_budget_id of this whp_sites_budget
	*/
	public void setWhp_sites_budget_id(long whp_sites_budget_id) {
		_whp_sites_budget.setWhp_sites_budget_id(whp_sites_budget_id);
	}

	/**
	* Returns the site_id of this whp_sites_budget.
	*
	* @return the site_id of this whp_sites_budget
	*/
	public long getSite_id() {
		return _whp_sites_budget.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_budget.
	*
	* @param site_id the site_id of this whp_sites_budget
	*/
	public void setSite_id(long site_id) {
		_whp_sites_budget.setSite_id(site_id);
	}

	/**
	* Returns the currency_local of this whp_sites_budget.
	*
	* @return the currency_local of this whp_sites_budget
	*/
	public double getCurrency_local() {
		return _whp_sites_budget.getCurrency_local();
	}

	/**
	* Sets the currency_local of this whp_sites_budget.
	*
	* @param currency_local the currency_local of this whp_sites_budget
	*/
	public void setCurrency_local(double currency_local) {
		_whp_sites_budget.setCurrency_local(currency_local);
	}

	/**
	* Returns the currency of this whp_sites_budget.
	*
	* @return the currency of this whp_sites_budget
	*/
	public java.lang.String getCurrency() {
		return _whp_sites_budget.getCurrency();
	}

	/**
	* Sets the currency of this whp_sites_budget.
	*
	* @param currency the currency of this whp_sites_budget
	*/
	public void setCurrency(java.lang.String currency) {
		_whp_sites_budget.setCurrency(currency);
	}

	/**
	* Returns the currency_usd of this whp_sites_budget.
	*
	* @return the currency_usd of this whp_sites_budget
	*/
	public double getCurrency_usd() {
		return _whp_sites_budget.getCurrency_usd();
	}

	/**
	* Sets the currency_usd of this whp_sites_budget.
	*
	* @param currency_usd the currency_usd of this whp_sites_budget
	*/
	public void setCurrency_usd(double currency_usd) {
		_whp_sites_budget.setCurrency_usd(currency_usd);
	}

	/**
	* Returns the date of this whp_sites_budget.
	*
	* @return the date of this whp_sites_budget
	*/
	public java.util.Date getDate() {
		return _whp_sites_budget.getDate();
	}

	/**
	* Sets the date of this whp_sites_budget.
	*
	* @param date the date of this whp_sites_budget
	*/
	public void setDate(java.util.Date date) {
		_whp_sites_budget.setDate(date);
	}

	public boolean isNew() {
		return _whp_sites_budget.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_budget.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_budget.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_budget.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_budget.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_budget.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_budget.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_budget.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_budget.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_budgetWrapper((whp_sites_budget)_whp_sites_budget.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_budget whp_sites_budget) {
		return _whp_sites_budget.compareTo(whp_sites_budget);
	}

	@Override
	public int hashCode() {
		return _whp_sites_budget.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_budget> toCacheModel() {
		return _whp_sites_budget.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_budget toEscapedModel() {
		return new whp_sites_budgetWrapper(_whp_sites_budget.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_budget.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_budget.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_budget.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_budget getWrappedwhp_sites_budget() {
		return _whp_sites_budget;
	}

	public whp_sites_budget getWrappedModel() {
		return _whp_sites_budget;
	}

	public void resetOriginalValues() {
		_whp_sites_budget.resetOriginalValues();
	}

	private whp_sites_budget _whp_sites_budget;
}