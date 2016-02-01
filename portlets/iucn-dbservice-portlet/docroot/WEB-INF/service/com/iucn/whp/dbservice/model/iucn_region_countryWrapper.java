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
 * This class is a wrapper for {@link iucn_region_country}.
 * </p>
 *
 * @author    alok.sen
 * @see       iucn_region_country
 * @generated
 */
public class iucn_region_countryWrapper implements iucn_region_country,
	ModelWrapper<iucn_region_country> {
	public iucn_region_countryWrapper(iucn_region_country iucn_region_country) {
		_iucn_region_country = iucn_region_country;
	}

	public Class<?> getModelClass() {
		return iucn_region_country.class;
	}

	public String getModelClassName() {
		return iucn_region_country.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_iucn_region_country_id",
			getWhp_iucn_region_country_id());
		attributes.put("countryid", getCountryid());
		attributes.put("iucn_region_id", getIucn_region_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer whp_iucn_region_country_id = (Integer)attributes.get(
				"whp_iucn_region_country_id");

		if (whp_iucn_region_country_id != null) {
			setWhp_iucn_region_country_id(whp_iucn_region_country_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		Integer iucn_region_id = (Integer)attributes.get("iucn_region_id");

		if (iucn_region_id != null) {
			setIucn_region_id(iucn_region_id);
		}
	}

	/**
	* Returns the primary key of this iucn_region_country.
	*
	* @return the primary key of this iucn_region_country
	*/
	public int getPrimaryKey() {
		return _iucn_region_country.getPrimaryKey();
	}

	/**
	* Sets the primary key of this iucn_region_country.
	*
	* @param primaryKey the primary key of this iucn_region_country
	*/
	public void setPrimaryKey(int primaryKey) {
		_iucn_region_country.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_iucn_region_country_id of this iucn_region_country.
	*
	* @return the whp_iucn_region_country_id of this iucn_region_country
	*/
	public int getWhp_iucn_region_country_id() {
		return _iucn_region_country.getWhp_iucn_region_country_id();
	}

	/**
	* Sets the whp_iucn_region_country_id of this iucn_region_country.
	*
	* @param whp_iucn_region_country_id the whp_iucn_region_country_id of this iucn_region_country
	*/
	public void setWhp_iucn_region_country_id(int whp_iucn_region_country_id) {
		_iucn_region_country.setWhp_iucn_region_country_id(whp_iucn_region_country_id);
	}

	/**
	* Returns the countryid of this iucn_region_country.
	*
	* @return the countryid of this iucn_region_country
	*/
	public int getCountryid() {
		return _iucn_region_country.getCountryid();
	}

	/**
	* Sets the countryid of this iucn_region_country.
	*
	* @param countryid the countryid of this iucn_region_country
	*/
	public void setCountryid(int countryid) {
		_iucn_region_country.setCountryid(countryid);
	}

	/**
	* Returns the iucn_region_id of this iucn_region_country.
	*
	* @return the iucn_region_id of this iucn_region_country
	*/
	public int getIucn_region_id() {
		return _iucn_region_country.getIucn_region_id();
	}

	/**
	* Sets the iucn_region_id of this iucn_region_country.
	*
	* @param iucn_region_id the iucn_region_id of this iucn_region_country
	*/
	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region_country.setIucn_region_id(iucn_region_id);
	}

	public boolean isNew() {
		return _iucn_region_country.isNew();
	}

	public void setNew(boolean n) {
		_iucn_region_country.setNew(n);
	}

	public boolean isCachedModel() {
		return _iucn_region_country.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_iucn_region_country.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _iucn_region_country.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _iucn_region_country.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_iucn_region_country.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _iucn_region_country.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_iucn_region_country.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new iucn_region_countryWrapper((iucn_region_country)_iucn_region_country.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country) {
		return _iucn_region_country.compareTo(iucn_region_country);
	}

	@Override
	public int hashCode() {
		return _iucn_region_country.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.iucn_region_country> toCacheModel() {
		return _iucn_region_country.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.iucn_region_country toEscapedModel() {
		return new iucn_region_countryWrapper(_iucn_region_country.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _iucn_region_country.toString();
	}

	public java.lang.String toXmlString() {
		return _iucn_region_country.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_iucn_region_country.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public iucn_region_country getWrappediucn_region_country() {
		return _iucn_region_country;
	}

	public iucn_region_country getWrappedModel() {
		return _iucn_region_country;
	}

	public void resetOriginalValues() {
		_iucn_region_country.resetOriginalValues();
	}

	private iucn_region_country _iucn_region_country;
}