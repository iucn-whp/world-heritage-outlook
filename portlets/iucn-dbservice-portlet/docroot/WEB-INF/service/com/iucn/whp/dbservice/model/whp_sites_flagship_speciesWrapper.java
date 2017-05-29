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
 * This class is a wrapper for {@link whp_sites_flagship_species}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_flagship_species
 * @generated
 */
public class whp_sites_flagship_speciesWrapper
	implements whp_sites_flagship_species,
		ModelWrapper<whp_sites_flagship_species> {
	public whp_sites_flagship_speciesWrapper(
		whp_sites_flagship_species whp_sites_flagship_species) {
		_whp_sites_flagship_species = whp_sites_flagship_species;
	}

	public Class<?> getModelClass() {
		return whp_sites_flagship_species.class;
	}

	public String getModelClassName() {
		return whp_sites_flagship_species.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_flagship_species_id",
			getWhp_sites_flagship_species_id());
		attributes.put("site_id", getSite_id());
		attributes.put("flagship_species_id", getFlagship_species_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_flagship_species_id = (Long)attributes.get(
				"whp_sites_flagship_species_id");

		if (whp_sites_flagship_species_id != null) {
			setWhp_sites_flagship_species_id(whp_sites_flagship_species_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer flagship_species_id = (Integer)attributes.get(
				"flagship_species_id");

		if (flagship_species_id != null) {
			setFlagship_species_id(flagship_species_id);
		}
	}

	/**
	* Returns the primary key of this whp_sites_flagship_species.
	*
	* @return the primary key of this whp_sites_flagship_species
	*/
	public long getPrimaryKey() {
		return _whp_sites_flagship_species.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_flagship_species.
	*
	* @param primaryKey the primary key of this whp_sites_flagship_species
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_flagship_species.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_flagship_species_id of this whp_sites_flagship_species.
	*
	* @return the whp_sites_flagship_species_id of this whp_sites_flagship_species
	*/
	public long getWhp_sites_flagship_species_id() {
		return _whp_sites_flagship_species.getWhp_sites_flagship_species_id();
	}

	/**
	* Sets the whp_sites_flagship_species_id of this whp_sites_flagship_species.
	*
	* @param whp_sites_flagship_species_id the whp_sites_flagship_species_id of this whp_sites_flagship_species
	*/
	public void setWhp_sites_flagship_species_id(
		long whp_sites_flagship_species_id) {
		_whp_sites_flagship_species.setWhp_sites_flagship_species_id(whp_sites_flagship_species_id);
	}

	/**
	* Returns the site_id of this whp_sites_flagship_species.
	*
	* @return the site_id of this whp_sites_flagship_species
	*/
	public long getSite_id() {
		return _whp_sites_flagship_species.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_flagship_species.
	*
	* @param site_id the site_id of this whp_sites_flagship_species
	*/
	public void setSite_id(long site_id) {
		_whp_sites_flagship_species.setSite_id(site_id);
	}

	/**
	* Returns the flagship_species_id of this whp_sites_flagship_species.
	*
	* @return the flagship_species_id of this whp_sites_flagship_species
	*/
	public int getFlagship_species_id() {
		return _whp_sites_flagship_species.getFlagship_species_id();
	}

	/**
	* Sets the flagship_species_id of this whp_sites_flagship_species.
	*
	* @param flagship_species_id the flagship_species_id of this whp_sites_flagship_species
	*/
	public void setFlagship_species_id(int flagship_species_id) {
		_whp_sites_flagship_species.setFlagship_species_id(flagship_species_id);
	}

	public boolean isNew() {
		return _whp_sites_flagship_species.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_flagship_species.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_flagship_species.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_flagship_species.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_flagship_species.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_flagship_species.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_flagship_species.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_flagship_species.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_flagship_species.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_flagship_speciesWrapper((whp_sites_flagship_species)_whp_sites_flagship_species.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species) {
		return _whp_sites_flagship_species.compareTo(whp_sites_flagship_species);
	}

	@Override
	public int hashCode() {
		return _whp_sites_flagship_species.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_flagship_species> toCacheModel() {
		return _whp_sites_flagship_species.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_flagship_species toEscapedModel() {
		return new whp_sites_flagship_speciesWrapper(_whp_sites_flagship_species.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_flagship_species.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_flagship_species.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_flagship_species.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_flagship_species getWrappedwhp_sites_flagship_species() {
		return _whp_sites_flagship_species;
	}

	public whp_sites_flagship_species getWrappedModel() {
		return _whp_sites_flagship_species;
	}

	public void resetOriginalValues() {
		_whp_sites_flagship_species.resetOriginalValues();
	}

	private whp_sites_flagship_species _whp_sites_flagship_species;
}