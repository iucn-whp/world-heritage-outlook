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
 * This class is a wrapper for {@link whp_sites_dsocr}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_dsocr
 * @generated
 */
public class whp_sites_dsocrWrapper implements whp_sites_dsocr,
	ModelWrapper<whp_sites_dsocr> {
	public whp_sites_dsocrWrapper(whp_sites_dsocr whp_sites_dsocr) {
		_whp_sites_dsocr = whp_sites_dsocr;
	}

	public Class<?> getModelClass() {
		return whp_sites_dsocr.class;
	}

	public String getModelClassName() {
		return whp_sites_dsocr.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_dsocr_id", getWhp_sites_dsocr_id());
		attributes.put("site_id", getSite_id());
		attributes.put("state_description", getState_description());
		attributes.put("dsocr_date", getDsocr_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_dsocr_id = (Long)attributes.get("whp_sites_dsocr_id");

		if (whp_sites_dsocr_id != null) {
			setWhp_sites_dsocr_id(whp_sites_dsocr_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String state_description = (String)attributes.get("state_description");

		if (state_description != null) {
			setState_description(state_description);
		}

		Date dsocr_date = (Date)attributes.get("dsocr_date");

		if (dsocr_date != null) {
			setDsocr_date(dsocr_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_dsocr.
	*
	* @return the primary key of this whp_sites_dsocr
	*/
	public long getPrimaryKey() {
		return _whp_sites_dsocr.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_dsocr.
	*
	* @param primaryKey the primary key of this whp_sites_dsocr
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_dsocr.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_dsocr_id of this whp_sites_dsocr.
	*
	* @return the whp_sites_dsocr_id of this whp_sites_dsocr
	*/
	public long getWhp_sites_dsocr_id() {
		return _whp_sites_dsocr.getWhp_sites_dsocr_id();
	}

	/**
	* Sets the whp_sites_dsocr_id of this whp_sites_dsocr.
	*
	* @param whp_sites_dsocr_id the whp_sites_dsocr_id of this whp_sites_dsocr
	*/
	public void setWhp_sites_dsocr_id(long whp_sites_dsocr_id) {
		_whp_sites_dsocr.setWhp_sites_dsocr_id(whp_sites_dsocr_id);
	}

	/**
	* Returns the site_id of this whp_sites_dsocr.
	*
	* @return the site_id of this whp_sites_dsocr
	*/
	public long getSite_id() {
		return _whp_sites_dsocr.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_dsocr.
	*
	* @param site_id the site_id of this whp_sites_dsocr
	*/
	public void setSite_id(long site_id) {
		_whp_sites_dsocr.setSite_id(site_id);
	}

	/**
	* Returns the state_description of this whp_sites_dsocr.
	*
	* @return the state_description of this whp_sites_dsocr
	*/
	public java.lang.String getState_description() {
		return _whp_sites_dsocr.getState_description();
	}

	/**
	* Sets the state_description of this whp_sites_dsocr.
	*
	* @param state_description the state_description of this whp_sites_dsocr
	*/
	public void setState_description(java.lang.String state_description) {
		_whp_sites_dsocr.setState_description(state_description);
	}

	/**
	* Returns the dsocr_date of this whp_sites_dsocr.
	*
	* @return the dsocr_date of this whp_sites_dsocr
	*/
	public java.util.Date getDsocr_date() {
		return _whp_sites_dsocr.getDsocr_date();
	}

	/**
	* Sets the dsocr_date of this whp_sites_dsocr.
	*
	* @param dsocr_date the dsocr_date of this whp_sites_dsocr
	*/
	public void setDsocr_date(java.util.Date dsocr_date) {
		_whp_sites_dsocr.setDsocr_date(dsocr_date);
	}

	public boolean isNew() {
		return _whp_sites_dsocr.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_dsocr.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_dsocr.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_dsocr.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_dsocr.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_dsocr.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_dsocr.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_dsocr.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_dsocr.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_dsocrWrapper((whp_sites_dsocr)_whp_sites_dsocr.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_dsocr whp_sites_dsocr) {
		return _whp_sites_dsocr.compareTo(whp_sites_dsocr);
	}

	@Override
	public int hashCode() {
		return _whp_sites_dsocr.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_dsocr> toCacheModel() {
		return _whp_sites_dsocr.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_dsocr toEscapedModel() {
		return new whp_sites_dsocrWrapper(_whp_sites_dsocr.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_dsocr.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_dsocr.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_dsocr.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_dsocr getWrappedwhp_sites_dsocr() {
		return _whp_sites_dsocr;
	}

	public whp_sites_dsocr getWrappedModel() {
		return _whp_sites_dsocr;
	}

	public void resetOriginalValues() {
		_whp_sites_dsocr.resetOriginalValues();
	}

	private whp_sites_dsocr _whp_sites_dsocr;
}