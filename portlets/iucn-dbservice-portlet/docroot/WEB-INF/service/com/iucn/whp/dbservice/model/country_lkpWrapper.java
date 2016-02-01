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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link country_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       country_lkp
 * @generated
 */
public class country_lkpWrapper implements country_lkp,
	ModelWrapper<country_lkp> {
	public country_lkpWrapper(country_lkp country_lkp) {
		_country_lkp = country_lkp;
	}

	public Class<?> getModelClass() {
		return country_lkp.class;
	}

	public String getModelClassName() {
		return country_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("countryid", getCountryid());
		attributes.put("name", getName());
		attributes.put("a2", getA2());
		attributes.put("a3", getA3());
		attributes.put("number", getNumber());
		attributes.put("idd", getIdd());
		attributes.put("currency", getCurrency());
		attributes.put("ziprequired", getZiprequired());
		attributes.put("active", getActive());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String a2 = (String)attributes.get("a2");

		if (a2 != null) {
			setA2(a2);
		}

		String a3 = (String)attributes.get("a3");

		if (a3 != null) {
			setA3(a3);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String idd = (String)attributes.get("idd");

		if (idd != null) {
			setIdd(idd);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Boolean ziprequired = (Boolean)attributes.get("ziprequired");

		if (ziprequired != null) {
			setZiprequired(ziprequired);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	* Returns the primary key of this country_lkp.
	*
	* @return the primary key of this country_lkp
	*/
	public int getPrimaryKey() {
		return _country_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this country_lkp.
	*
	* @param primaryKey the primary key of this country_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_country_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the countryid of this country_lkp.
	*
	* @return the countryid of this country_lkp
	*/
	public int getCountryid() {
		return _country_lkp.getCountryid();
	}

	/**
	* Sets the countryid of this country_lkp.
	*
	* @param countryid the countryid of this country_lkp
	*/
	public void setCountryid(int countryid) {
		_country_lkp.setCountryid(countryid);
	}

	/**
	* Returns the name of this country_lkp.
	*
	* @return the name of this country_lkp
	*/
	public java.lang.String getName() {
		return _country_lkp.getName();
	}

	/**
	* Sets the name of this country_lkp.
	*
	* @param name the name of this country_lkp
	*/
	public void setName(java.lang.String name) {
		_country_lkp.setName(name);
	}

	/**
	* Returns the a2 of this country_lkp.
	*
	* @return the a2 of this country_lkp
	*/
	public java.lang.String getA2() {
		return _country_lkp.getA2();
	}

	/**
	* Sets the a2 of this country_lkp.
	*
	* @param a2 the a2 of this country_lkp
	*/
	public void setA2(java.lang.String a2) {
		_country_lkp.setA2(a2);
	}

	/**
	* Returns the a3 of this country_lkp.
	*
	* @return the a3 of this country_lkp
	*/
	public java.lang.String getA3() {
		return _country_lkp.getA3();
	}

	/**
	* Sets the a3 of this country_lkp.
	*
	* @param a3 the a3 of this country_lkp
	*/
	public void setA3(java.lang.String a3) {
		_country_lkp.setA3(a3);
	}

	/**
	* Returns the number of this country_lkp.
	*
	* @return the number of this country_lkp
	*/
	public java.lang.String getNumber() {
		return _country_lkp.getNumber();
	}

	/**
	* Sets the number of this country_lkp.
	*
	* @param number the number of this country_lkp
	*/
	public void setNumber(java.lang.String number) {
		_country_lkp.setNumber(number);
	}

	/**
	* Returns the idd of this country_lkp.
	*
	* @return the idd of this country_lkp
	*/
	public java.lang.String getIdd() {
		return _country_lkp.getIdd();
	}

	/**
	* Sets the idd of this country_lkp.
	*
	* @param idd the idd of this country_lkp
	*/
	public void setIdd(java.lang.String idd) {
		_country_lkp.setIdd(idd);
	}

	/**
	* Returns the currency of this country_lkp.
	*
	* @return the currency of this country_lkp
	*/
	public java.lang.String getCurrency() {
		return _country_lkp.getCurrency();
	}

	/**
	* Sets the currency of this country_lkp.
	*
	* @param currency the currency of this country_lkp
	*/
	public void setCurrency(java.lang.String currency) {
		_country_lkp.setCurrency(currency);
	}

	/**
	* Returns the ziprequired of this country_lkp.
	*
	* @return the ziprequired of this country_lkp
	*/
	public boolean getZiprequired() {
		return _country_lkp.getZiprequired();
	}

	/**
	* Returns <code>true</code> if this country_lkp is ziprequired.
	*
	* @return <code>true</code> if this country_lkp is ziprequired; <code>false</code> otherwise
	*/
	public boolean isZiprequired() {
		return _country_lkp.isZiprequired();
	}

	/**
	* Sets whether this country_lkp is ziprequired.
	*
	* @param ziprequired the ziprequired of this country_lkp
	*/
	public void setZiprequired(boolean ziprequired) {
		_country_lkp.setZiprequired(ziprequired);
	}

	/**
	* Returns the active of this country_lkp.
	*
	* @return the active of this country_lkp
	*/
	public boolean getActive() {
		return _country_lkp.getActive();
	}

	/**
	* Returns <code>true</code> if this country_lkp is active.
	*
	* @return <code>true</code> if this country_lkp is active; <code>false</code> otherwise
	*/
	public boolean isActive() {
		return _country_lkp.isActive();
	}

	/**
	* Sets whether this country_lkp is active.
	*
	* @param active the active of this country_lkp
	*/
	public void setActive(boolean active) {
		_country_lkp.setActive(active);
	}

	public boolean isNew() {
		return _country_lkp.isNew();
	}

	public void setNew(boolean n) {
		_country_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _country_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_country_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _country_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _country_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_country_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _country_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_country_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new country_lkpWrapper((country_lkp)_country_lkp.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.country_lkp country_lkp) {
		return _country_lkp.compareTo(country_lkp);
	}

	@Override
	public int hashCode() {
		return _country_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.country_lkp> toCacheModel() {
		return _country_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.country_lkp toEscapedModel() {
		return new country_lkpWrapper(_country_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _country_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _country_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_country_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public country_lkp getWrappedcountry_lkp() {
		return _country_lkp;
	}

	public country_lkp getWrappedModel() {
		return _country_lkp;
	}

	public void resetOriginalValues() {
		_country_lkp.resetOriginalValues();
	}

	private country_lkp _country_lkp;
}