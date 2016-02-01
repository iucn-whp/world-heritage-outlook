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
 * This class is a wrapper for {@link unesco_region_country}.
 * </p>
 *
 * @author    alok.sen
 * @see       unesco_region_country
 * @generated
 */
public class unesco_region_countryWrapper implements unesco_region_country,
	ModelWrapper<unesco_region_country> {
	public unesco_region_countryWrapper(
		unesco_region_country unesco_region_country) {
		_unesco_region_country = unesco_region_country;
	}

	public Class<?> getModelClass() {
		return unesco_region_country.class;
	}

	public String getModelClassName() {
		return unesco_region_country.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_unesco_region_country_id",
			getWhp_unesco_region_country_id());
		attributes.put("countryid", getCountryid());
		attributes.put("unesco_region_id", getUnesco_region_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer whp_unesco_region_country_id = (Integer)attributes.get(
				"whp_unesco_region_country_id");

		if (whp_unesco_region_country_id != null) {
			setWhp_unesco_region_country_id(whp_unesco_region_country_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		Integer unesco_region_id = (Integer)attributes.get("unesco_region_id");

		if (unesco_region_id != null) {
			setUnesco_region_id(unesco_region_id);
		}
	}

	/**
	* Returns the primary key of this unesco_region_country.
	*
	* @return the primary key of this unesco_region_country
	*/
	public int getPrimaryKey() {
		return _unesco_region_country.getPrimaryKey();
	}

	/**
	* Sets the primary key of this unesco_region_country.
	*
	* @param primaryKey the primary key of this unesco_region_country
	*/
	public void setPrimaryKey(int primaryKey) {
		_unesco_region_country.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_unesco_region_country_id of this unesco_region_country.
	*
	* @return the whp_unesco_region_country_id of this unesco_region_country
	*/
	public int getWhp_unesco_region_country_id() {
		return _unesco_region_country.getWhp_unesco_region_country_id();
	}

	/**
	* Sets the whp_unesco_region_country_id of this unesco_region_country.
	*
	* @param whp_unesco_region_country_id the whp_unesco_region_country_id of this unesco_region_country
	*/
	public void setWhp_unesco_region_country_id(
		int whp_unesco_region_country_id) {
		_unesco_region_country.setWhp_unesco_region_country_id(whp_unesco_region_country_id);
	}

	/**
	* Returns the countryid of this unesco_region_country.
	*
	* @return the countryid of this unesco_region_country
	*/
	public int getCountryid() {
		return _unesco_region_country.getCountryid();
	}

	/**
	* Sets the countryid of this unesco_region_country.
	*
	* @param countryid the countryid of this unesco_region_country
	*/
	public void setCountryid(int countryid) {
		_unesco_region_country.setCountryid(countryid);
	}

	/**
	* Returns the unesco_region_id of this unesco_region_country.
	*
	* @return the unesco_region_id of this unesco_region_country
	*/
	public int getUnesco_region_id() {
		return _unesco_region_country.getUnesco_region_id();
	}

	/**
	* Sets the unesco_region_id of this unesco_region_country.
	*
	* @param unesco_region_id the unesco_region_id of this unesco_region_country
	*/
	public void setUnesco_region_id(int unesco_region_id) {
		_unesco_region_country.setUnesco_region_id(unesco_region_id);
	}

	public boolean isNew() {
		return _unesco_region_country.isNew();
	}

	public void setNew(boolean n) {
		_unesco_region_country.setNew(n);
	}

	public boolean isCachedModel() {
		return _unesco_region_country.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_unesco_region_country.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _unesco_region_country.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _unesco_region_country.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_unesco_region_country.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _unesco_region_country.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_unesco_region_country.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new unesco_region_countryWrapper((unesco_region_country)_unesco_region_country.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country) {
		return _unesco_region_country.compareTo(unesco_region_country);
	}

	@Override
	public int hashCode() {
		return _unesco_region_country.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.unesco_region_country> toCacheModel() {
		return _unesco_region_country.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.unesco_region_country toEscapedModel() {
		return new unesco_region_countryWrapper(_unesco_region_country.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _unesco_region_country.toString();
	}

	public java.lang.String toXmlString() {
		return _unesco_region_country.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_unesco_region_country.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public unesco_region_country getWrappedunesco_region_country() {
		return _unesco_region_country;
	}

	public unesco_region_country getWrappedModel() {
		return _unesco_region_country;
	}

	public void resetOriginalValues() {
		_unesco_region_country.resetOriginalValues();
	}

	private unesco_region_country _unesco_region_country;
}