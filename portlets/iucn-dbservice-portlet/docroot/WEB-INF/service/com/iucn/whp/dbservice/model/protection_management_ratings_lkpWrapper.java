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
 * This class is a wrapper for {@link protection_management_ratings_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       protection_management_ratings_lkp
 * @generated
 */
public class protection_management_ratings_lkpWrapper
	implements protection_management_ratings_lkp,
		ModelWrapper<protection_management_ratings_lkp> {
	public protection_management_ratings_lkpWrapper(
		protection_management_ratings_lkp protection_management_ratings_lkp) {
		_protection_management_ratings_lkp = protection_management_ratings_lkp;
	}

	public Class<?> getModelClass() {
		return protection_management_ratings_lkp.class;
	}

	public String getModelClassName() {
		return protection_management_ratings_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("pm_rating", getPm_rating());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String pm_rating = (String)attributes.get("pm_rating");

		if (pm_rating != null) {
			setPm_rating(pm_rating);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this protection_management_ratings_lkp.
	*
	* @return the primary key of this protection_management_ratings_lkp
	*/
	public long getPrimaryKey() {
		return _protection_management_ratings_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this protection_management_ratings_lkp.
	*
	* @param primaryKey the primary key of this protection_management_ratings_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_protection_management_ratings_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this protection_management_ratings_lkp.
	*
	* @return the ID of this protection_management_ratings_lkp
	*/
	public long getId() {
		return _protection_management_ratings_lkp.getId();
	}

	/**
	* Sets the ID of this protection_management_ratings_lkp.
	*
	* @param id the ID of this protection_management_ratings_lkp
	*/
	public void setId(long id) {
		_protection_management_ratings_lkp.setId(id);
	}

	/**
	* Returns the pm_rating of this protection_management_ratings_lkp.
	*
	* @return the pm_rating of this protection_management_ratings_lkp
	*/
	public java.lang.String getPm_rating() {
		return _protection_management_ratings_lkp.getPm_rating();
	}

	/**
	* Sets the pm_rating of this protection_management_ratings_lkp.
	*
	* @param pm_rating the pm_rating of this protection_management_ratings_lkp
	*/
	public void setPm_rating(java.lang.String pm_rating) {
		_protection_management_ratings_lkp.setPm_rating(pm_rating);
	}

	/**
	* Returns the description of this protection_management_ratings_lkp.
	*
	* @return the description of this protection_management_ratings_lkp
	*/
	public java.lang.String getDescription() {
		return _protection_management_ratings_lkp.getDescription();
	}

	/**
	* Sets the description of this protection_management_ratings_lkp.
	*
	* @param description the description of this protection_management_ratings_lkp
	*/
	public void setDescription(java.lang.String description) {
		_protection_management_ratings_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _protection_management_ratings_lkp.isNew();
	}

	public void setNew(boolean n) {
		_protection_management_ratings_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _protection_management_ratings_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_protection_management_ratings_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _protection_management_ratings_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _protection_management_ratings_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_protection_management_ratings_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _protection_management_ratings_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_protection_management_ratings_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new protection_management_ratings_lkpWrapper((protection_management_ratings_lkp)_protection_management_ratings_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.protection_management_ratings_lkp protection_management_ratings_lkp) {
		return _protection_management_ratings_lkp.compareTo(protection_management_ratings_lkp);
	}

	@Override
	public int hashCode() {
		return _protection_management_ratings_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.protection_management_ratings_lkp> toCacheModel() {
		return _protection_management_ratings_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.protection_management_ratings_lkp toEscapedModel() {
		return new protection_management_ratings_lkpWrapper(_protection_management_ratings_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _protection_management_ratings_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _protection_management_ratings_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_protection_management_ratings_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public protection_management_ratings_lkp getWrappedprotection_management_ratings_lkp() {
		return _protection_management_ratings_lkp;
	}

	public protection_management_ratings_lkp getWrappedModel() {
		return _protection_management_ratings_lkp;
	}

	public void resetOriginalValues() {
		_protection_management_ratings_lkp.resetOriginalValues();
	}

	private protection_management_ratings_lkp _protection_management_ratings_lkp;
}