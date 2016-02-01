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
 * This class is a wrapper for {@link whp_sites_boundary_modification}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_boundary_modification
 * @generated
 */
public class whp_sites_boundary_modificationWrapper
	implements whp_sites_boundary_modification,
		ModelWrapper<whp_sites_boundary_modification> {
	public whp_sites_boundary_modificationWrapper(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		_whp_sites_boundary_modification = whp_sites_boundary_modification;
	}

	public Class<?> getModelClass() {
		return whp_sites_boundary_modification.class;
	}

	public String getModelClassName() {
		return whp_sites_boundary_modification.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_boundary_modification_id",
			getWhp_sites_boundary_modification_id());
		attributes.put("site_id", getSite_id());
		attributes.put("bmid", getBmid());
		attributes.put("description", getDescription());
		attributes.put("mod_date", getMod_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_boundary_modification_id = (Long)attributes.get(
				"whp_sites_boundary_modification_id");

		if (whp_sites_boundary_modification_id != null) {
			setWhp_sites_boundary_modification_id(whp_sites_boundary_modification_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer bmid = (Integer)attributes.get("bmid");

		if (bmid != null) {
			setBmid(bmid);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date mod_date = (Date)attributes.get("mod_date");

		if (mod_date != null) {
			setMod_date(mod_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_boundary_modification.
	*
	* @return the primary key of this whp_sites_boundary_modification
	*/
	public long getPrimaryKey() {
		return _whp_sites_boundary_modification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_boundary_modification.
	*
	* @param primaryKey the primary key of this whp_sites_boundary_modification
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_boundary_modification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_boundary_modification_id of this whp_sites_boundary_modification.
	*
	* @return the whp_sites_boundary_modification_id of this whp_sites_boundary_modification
	*/
	public long getWhp_sites_boundary_modification_id() {
		return _whp_sites_boundary_modification.getWhp_sites_boundary_modification_id();
	}

	/**
	* Sets the whp_sites_boundary_modification_id of this whp_sites_boundary_modification.
	*
	* @param whp_sites_boundary_modification_id the whp_sites_boundary_modification_id of this whp_sites_boundary_modification
	*/
	public void setWhp_sites_boundary_modification_id(
		long whp_sites_boundary_modification_id) {
		_whp_sites_boundary_modification.setWhp_sites_boundary_modification_id(whp_sites_boundary_modification_id);
	}

	/**
	* Returns the site_id of this whp_sites_boundary_modification.
	*
	* @return the site_id of this whp_sites_boundary_modification
	*/
	public long getSite_id() {
		return _whp_sites_boundary_modification.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_boundary_modification.
	*
	* @param site_id the site_id of this whp_sites_boundary_modification
	*/
	public void setSite_id(long site_id) {
		_whp_sites_boundary_modification.setSite_id(site_id);
	}

	/**
	* Returns the bmid of this whp_sites_boundary_modification.
	*
	* @return the bmid of this whp_sites_boundary_modification
	*/
	public int getBmid() {
		return _whp_sites_boundary_modification.getBmid();
	}

	/**
	* Sets the bmid of this whp_sites_boundary_modification.
	*
	* @param bmid the bmid of this whp_sites_boundary_modification
	*/
	public void setBmid(int bmid) {
		_whp_sites_boundary_modification.setBmid(bmid);
	}

	/**
	* Returns the description of this whp_sites_boundary_modification.
	*
	* @return the description of this whp_sites_boundary_modification
	*/
	public java.lang.String getDescription() {
		return _whp_sites_boundary_modification.getDescription();
	}

	/**
	* Sets the description of this whp_sites_boundary_modification.
	*
	* @param description the description of this whp_sites_boundary_modification
	*/
	public void setDescription(java.lang.String description) {
		_whp_sites_boundary_modification.setDescription(description);
	}

	/**
	* Returns the mod_date of this whp_sites_boundary_modification.
	*
	* @return the mod_date of this whp_sites_boundary_modification
	*/
	public java.util.Date getMod_date() {
		return _whp_sites_boundary_modification.getMod_date();
	}

	/**
	* Sets the mod_date of this whp_sites_boundary_modification.
	*
	* @param mod_date the mod_date of this whp_sites_boundary_modification
	*/
	public void setMod_date(java.util.Date mod_date) {
		_whp_sites_boundary_modification.setMod_date(mod_date);
	}

	public boolean isNew() {
		return _whp_sites_boundary_modification.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_boundary_modification.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_boundary_modification.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_boundary_modification.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_boundary_modification.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_boundary_modification.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_boundary_modification.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_boundary_modification.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_boundary_modification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_boundary_modificationWrapper((whp_sites_boundary_modification)_whp_sites_boundary_modification.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification) {
		return _whp_sites_boundary_modification.compareTo(whp_sites_boundary_modification);
	}

	@Override
	public int hashCode() {
		return _whp_sites_boundary_modification.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> toCacheModel() {
		return _whp_sites_boundary_modification.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification toEscapedModel() {
		return new whp_sites_boundary_modificationWrapper(_whp_sites_boundary_modification.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_boundary_modification.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_boundary_modification.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_boundary_modification.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_boundary_modification getWrappedwhp_sites_boundary_modification() {
		return _whp_sites_boundary_modification;
	}

	public whp_sites_boundary_modification getWrappedModel() {
		return _whp_sites_boundary_modification;
	}

	public void resetOriginalValues() {
		_whp_sites_boundary_modification.resetOriginalValues();
	}

	private whp_sites_boundary_modification _whp_sites_boundary_modification;
}