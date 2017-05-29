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
 * This class is a wrapper for {@link whp_sites_country}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_country
 * @generated
 */
public class whp_sites_countryWrapper implements whp_sites_country,
	ModelWrapper<whp_sites_country> {
	public whp_sites_countryWrapper(whp_sites_country whp_sites_country) {
		_whp_sites_country = whp_sites_country;
	}

	public Class<?> getModelClass() {
		return whp_sites_country.class;
	}

	public String getModelClassName() {
		return whp_sites_country.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_country_id", getWhp_sites_country_id());
		attributes.put("site_id", getSite_id());
		attributes.put("countryid", getCountryid());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_country_id = (Long)attributes.get("whp_sites_country_id");

		if (whp_sites_country_id != null) {
			setWhp_sites_country_id(whp_sites_country_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}
	}

	/**
	* Returns the primary key of this whp_sites_country.
	*
	* @return the primary key of this whp_sites_country
	*/
	public long getPrimaryKey() {
		return _whp_sites_country.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_country.
	*
	* @param primaryKey the primary key of this whp_sites_country
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_country.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_country_id of this whp_sites_country.
	*
	* @return the whp_sites_country_id of this whp_sites_country
	*/
	public long getWhp_sites_country_id() {
		return _whp_sites_country.getWhp_sites_country_id();
	}

	/**
	* Sets the whp_sites_country_id of this whp_sites_country.
	*
	* @param whp_sites_country_id the whp_sites_country_id of this whp_sites_country
	*/
	public void setWhp_sites_country_id(long whp_sites_country_id) {
		_whp_sites_country.setWhp_sites_country_id(whp_sites_country_id);
	}

	/**
	* Returns the site_id of this whp_sites_country.
	*
	* @return the site_id of this whp_sites_country
	*/
	public long getSite_id() {
		return _whp_sites_country.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_country.
	*
	* @param site_id the site_id of this whp_sites_country
	*/
	public void setSite_id(long site_id) {
		_whp_sites_country.setSite_id(site_id);
	}

	/**
	* Returns the countryid of this whp_sites_country.
	*
	* @return the countryid of this whp_sites_country
	*/
	public int getCountryid() {
		return _whp_sites_country.getCountryid();
	}

	/**
	* Sets the countryid of this whp_sites_country.
	*
	* @param countryid the countryid of this whp_sites_country
	*/
	public void setCountryid(int countryid) {
		_whp_sites_country.setCountryid(countryid);
	}

	public boolean isNew() {
		return _whp_sites_country.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_country.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_country.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_country.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_country.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_country.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_country.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_country.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_country.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_countryWrapper((whp_sites_country)_whp_sites_country.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country) {
		return _whp_sites_country.compareTo(whp_sites_country);
	}

	@Override
	public int hashCode() {
		return _whp_sites_country.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_country> toCacheModel() {
		return _whp_sites_country.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_country toEscapedModel() {
		return new whp_sites_countryWrapper(_whp_sites_country.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_country.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_country.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_country.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_country getWrappedwhp_sites_country() {
		return _whp_sites_country;
	}

	public whp_sites_country getWrappedModel() {
		return _whp_sites_country;
	}

	public void resetOriginalValues() {
		_whp_sites_country.resetOriginalValues();
	}

	private whp_sites_country _whp_sites_country;
}