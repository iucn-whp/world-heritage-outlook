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
 * This class is a wrapper for {@link threat_rating_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_rating_lkp
 * @generated
 */
public class threat_rating_lkpWrapper implements threat_rating_lkp,
	ModelWrapper<threat_rating_lkp> {
	public threat_rating_lkpWrapper(threat_rating_lkp threat_rating_lkp) {
		_threat_rating_lkp = threat_rating_lkp;
	}

	public Class<?> getModelClass() {
		return threat_rating_lkp.class;
	}

	public String getModelClassName() {
		return threat_rating_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rating", getRating());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String rating = (String)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this threat_rating_lkp.
	*
	* @return the primary key of this threat_rating_lkp
	*/
	public long getPrimaryKey() {
		return _threat_rating_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_rating_lkp.
	*
	* @param primaryKey the primary key of this threat_rating_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_rating_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this threat_rating_lkp.
	*
	* @return the ID of this threat_rating_lkp
	*/
	public long getId() {
		return _threat_rating_lkp.getId();
	}

	/**
	* Sets the ID of this threat_rating_lkp.
	*
	* @param id the ID of this threat_rating_lkp
	*/
	public void setId(long id) {
		_threat_rating_lkp.setId(id);
	}

	/**
	* Returns the rating of this threat_rating_lkp.
	*
	* @return the rating of this threat_rating_lkp
	*/
	public java.lang.String getRating() {
		return _threat_rating_lkp.getRating();
	}

	/**
	* Sets the rating of this threat_rating_lkp.
	*
	* @param rating the rating of this threat_rating_lkp
	*/
	public void setRating(java.lang.String rating) {
		_threat_rating_lkp.setRating(rating);
	}

	/**
	* Returns the description of this threat_rating_lkp.
	*
	* @return the description of this threat_rating_lkp
	*/
	public java.lang.String getDescription() {
		return _threat_rating_lkp.getDescription();
	}

	/**
	* Sets the description of this threat_rating_lkp.
	*
	* @param description the description of this threat_rating_lkp
	*/
	public void setDescription(java.lang.String description) {
		_threat_rating_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _threat_rating_lkp.isNew();
	}

	public void setNew(boolean n) {
		_threat_rating_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_rating_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_rating_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_rating_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_rating_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_rating_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_rating_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_rating_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_rating_lkpWrapper((threat_rating_lkp)_threat_rating_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_rating_lkp threat_rating_lkp) {
		return _threat_rating_lkp.compareTo(threat_rating_lkp);
	}

	@Override
	public int hashCode() {
		return _threat_rating_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_rating_lkp> toCacheModel() {
		return _threat_rating_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_rating_lkp toEscapedModel() {
		return new threat_rating_lkpWrapper(_threat_rating_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_rating_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_rating_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_rating_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_rating_lkp getWrappedthreat_rating_lkp() {
		return _threat_rating_lkp;
	}

	public threat_rating_lkp getWrappedModel() {
		return _threat_rating_lkp;
	}

	public void resetOriginalValues() {
		_threat_rating_lkp.resetOriginalValues();
	}

	private threat_rating_lkp _threat_rating_lkp;
}