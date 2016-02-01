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
 * This class is a wrapper for {@link conservation_outlook_rating_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       conservation_outlook_rating_lkp
 * @generated
 */
public class conservation_outlook_rating_lkpWrapper
	implements conservation_outlook_rating_lkp,
		ModelWrapper<conservation_outlook_rating_lkp> {
	public conservation_outlook_rating_lkpWrapper(
		conservation_outlook_rating_lkp conservation_outlook_rating_lkp) {
		_conservation_outlook_rating_lkp = conservation_outlook_rating_lkp;
	}

	public Class<?> getModelClass() {
		return conservation_outlook_rating_lkp.class;
	}

	public String getModelClassName() {
		return conservation_outlook_rating_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("co_rating_id", getCo_rating_id());
		attributes.put("co_rating", getCo_rating());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long co_rating_id = (Long)attributes.get("co_rating_id");

		if (co_rating_id != null) {
			setCo_rating_id(co_rating_id);
		}

		String co_rating = (String)attributes.get("co_rating");

		if (co_rating != null) {
			setCo_rating(co_rating);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this conservation_outlook_rating_lkp.
	*
	* @return the primary key of this conservation_outlook_rating_lkp
	*/
	public long getPrimaryKey() {
		return _conservation_outlook_rating_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this conservation_outlook_rating_lkp.
	*
	* @param primaryKey the primary key of this conservation_outlook_rating_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_conservation_outlook_rating_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the co_rating_id of this conservation_outlook_rating_lkp.
	*
	* @return the co_rating_id of this conservation_outlook_rating_lkp
	*/
	public long getCo_rating_id() {
		return _conservation_outlook_rating_lkp.getCo_rating_id();
	}

	/**
	* Sets the co_rating_id of this conservation_outlook_rating_lkp.
	*
	* @param co_rating_id the co_rating_id of this conservation_outlook_rating_lkp
	*/
	public void setCo_rating_id(long co_rating_id) {
		_conservation_outlook_rating_lkp.setCo_rating_id(co_rating_id);
	}

	/**
	* Returns the co_rating of this conservation_outlook_rating_lkp.
	*
	* @return the co_rating of this conservation_outlook_rating_lkp
	*/
	public java.lang.String getCo_rating() {
		return _conservation_outlook_rating_lkp.getCo_rating();
	}

	/**
	* Sets the co_rating of this conservation_outlook_rating_lkp.
	*
	* @param co_rating the co_rating of this conservation_outlook_rating_lkp
	*/
	public void setCo_rating(java.lang.String co_rating) {
		_conservation_outlook_rating_lkp.setCo_rating(co_rating);
	}

	/**
	* Returns the description of this conservation_outlook_rating_lkp.
	*
	* @return the description of this conservation_outlook_rating_lkp
	*/
	public java.lang.String getDescription() {
		return _conservation_outlook_rating_lkp.getDescription();
	}

	/**
	* Sets the description of this conservation_outlook_rating_lkp.
	*
	* @param description the description of this conservation_outlook_rating_lkp
	*/
	public void setDescription(java.lang.String description) {
		_conservation_outlook_rating_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _conservation_outlook_rating_lkp.isNew();
	}

	public void setNew(boolean n) {
		_conservation_outlook_rating_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _conservation_outlook_rating_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_conservation_outlook_rating_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _conservation_outlook_rating_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _conservation_outlook_rating_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_conservation_outlook_rating_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _conservation_outlook_rating_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_conservation_outlook_rating_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new conservation_outlook_rating_lkpWrapper((conservation_outlook_rating_lkp)_conservation_outlook_rating_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp) {
		return _conservation_outlook_rating_lkp.compareTo(conservation_outlook_rating_lkp);
	}

	@Override
	public int hashCode() {
		return _conservation_outlook_rating_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> toCacheModel() {
		return _conservation_outlook_rating_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp toEscapedModel() {
		return new conservation_outlook_rating_lkpWrapper(_conservation_outlook_rating_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _conservation_outlook_rating_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _conservation_outlook_rating_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_conservation_outlook_rating_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public conservation_outlook_rating_lkp getWrappedconservation_outlook_rating_lkp() {
		return _conservation_outlook_rating_lkp;
	}

	public conservation_outlook_rating_lkp getWrappedModel() {
		return _conservation_outlook_rating_lkp;
	}

	public void resetOriginalValues() {
		_conservation_outlook_rating_lkp.resetOriginalValues();
	}

	private conservation_outlook_rating_lkp _conservation_outlook_rating_lkp;
}