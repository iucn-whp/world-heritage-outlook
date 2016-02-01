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
 * This class is a wrapper for {@link flagship_species_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       flagship_species_lkp
 * @generated
 */
public class flagship_species_lkpWrapper implements flagship_species_lkp,
	ModelWrapper<flagship_species_lkp> {
	public flagship_species_lkpWrapper(
		flagship_species_lkp flagship_species_lkp) {
		_flagship_species_lkp = flagship_species_lkp;
	}

	public Class<?> getModelClass() {
		return flagship_species_lkp.class;
	}

	public String getModelClassName() {
		return flagship_species_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("flagship_species_id", getFlagship_species_id());
		attributes.put("flagship_species_name", getFlagship_species_name());
		attributes.put("redlist_url", getRedlist_url());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer flagship_species_id = (Integer)attributes.get(
				"flagship_species_id");

		if (flagship_species_id != null) {
			setFlagship_species_id(flagship_species_id);
		}

		String flagship_species_name = (String)attributes.get(
				"flagship_species_name");

		if (flagship_species_name != null) {
			setFlagship_species_name(flagship_species_name);
		}

		String redlist_url = (String)attributes.get("redlist_url");

		if (redlist_url != null) {
			setRedlist_url(redlist_url);
		}
	}

	/**
	* Returns the primary key of this flagship_species_lkp.
	*
	* @return the primary key of this flagship_species_lkp
	*/
	public int getPrimaryKey() {
		return _flagship_species_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this flagship_species_lkp.
	*
	* @param primaryKey the primary key of this flagship_species_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_flagship_species_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the flagship_species_id of this flagship_species_lkp.
	*
	* @return the flagship_species_id of this flagship_species_lkp
	*/
	public int getFlagship_species_id() {
		return _flagship_species_lkp.getFlagship_species_id();
	}

	/**
	* Sets the flagship_species_id of this flagship_species_lkp.
	*
	* @param flagship_species_id the flagship_species_id of this flagship_species_lkp
	*/
	public void setFlagship_species_id(int flagship_species_id) {
		_flagship_species_lkp.setFlagship_species_id(flagship_species_id);
	}

	/**
	* Returns the flagship_species_name of this flagship_species_lkp.
	*
	* @return the flagship_species_name of this flagship_species_lkp
	*/
	public java.lang.String getFlagship_species_name() {
		return _flagship_species_lkp.getFlagship_species_name();
	}

	/**
	* Sets the flagship_species_name of this flagship_species_lkp.
	*
	* @param flagship_species_name the flagship_species_name of this flagship_species_lkp
	*/
	public void setFlagship_species_name(java.lang.String flagship_species_name) {
		_flagship_species_lkp.setFlagship_species_name(flagship_species_name);
	}

	/**
	* Returns the redlist_url of this flagship_species_lkp.
	*
	* @return the redlist_url of this flagship_species_lkp
	*/
	public java.lang.String getRedlist_url() {
		return _flagship_species_lkp.getRedlist_url();
	}

	/**
	* Sets the redlist_url of this flagship_species_lkp.
	*
	* @param redlist_url the redlist_url of this flagship_species_lkp
	*/
	public void setRedlist_url(java.lang.String redlist_url) {
		_flagship_species_lkp.setRedlist_url(redlist_url);
	}

	public boolean isNew() {
		return _flagship_species_lkp.isNew();
	}

	public void setNew(boolean n) {
		_flagship_species_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _flagship_species_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_flagship_species_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _flagship_species_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _flagship_species_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_flagship_species_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _flagship_species_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_flagship_species_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new flagship_species_lkpWrapper((flagship_species_lkp)_flagship_species_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.flagship_species_lkp flagship_species_lkp) {
		return _flagship_species_lkp.compareTo(flagship_species_lkp);
	}

	@Override
	public int hashCode() {
		return _flagship_species_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.flagship_species_lkp> toCacheModel() {
		return _flagship_species_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.flagship_species_lkp toEscapedModel() {
		return new flagship_species_lkpWrapper(_flagship_species_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _flagship_species_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _flagship_species_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_flagship_species_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public flagship_species_lkp getWrappedflagship_species_lkp() {
		return _flagship_species_lkp;
	}

	public flagship_species_lkp getWrappedModel() {
		return _flagship_species_lkp;
	}

	public void resetOriginalValues() {
		_flagship_species_lkp.resetOriginalValues();
	}

	private flagship_species_lkp _flagship_species_lkp;
}