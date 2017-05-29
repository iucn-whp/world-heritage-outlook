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
 * This class is a wrapper for {@link benefit_rating_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefit_rating_lkp
 * @generated
 */
public class benefit_rating_lkpWrapper implements benefit_rating_lkp,
	ModelWrapper<benefit_rating_lkp> {
	public benefit_rating_lkpWrapper(benefit_rating_lkp benefit_rating_lkp) {
		_benefit_rating_lkp = benefit_rating_lkp;
	}

	public Class<?> getModelClass() {
		return benefit_rating_lkp.class;
	}

	public String getModelClassName() {
		return benefit_rating_lkp.class.getName();
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
	* Returns the primary key of this benefit_rating_lkp.
	*
	* @return the primary key of this benefit_rating_lkp
	*/
	public long getPrimaryKey() {
		return _benefit_rating_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefit_rating_lkp.
	*
	* @param primaryKey the primary key of this benefit_rating_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefit_rating_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this benefit_rating_lkp.
	*
	* @return the ID of this benefit_rating_lkp
	*/
	public long getId() {
		return _benefit_rating_lkp.getId();
	}

	/**
	* Sets the ID of this benefit_rating_lkp.
	*
	* @param id the ID of this benefit_rating_lkp
	*/
	public void setId(long id) {
		_benefit_rating_lkp.setId(id);
	}

	/**
	* Returns the rating of this benefit_rating_lkp.
	*
	* @return the rating of this benefit_rating_lkp
	*/
	public java.lang.String getRating() {
		return _benefit_rating_lkp.getRating();
	}

	/**
	* Sets the rating of this benefit_rating_lkp.
	*
	* @param rating the rating of this benefit_rating_lkp
	*/
	public void setRating(java.lang.String rating) {
		_benefit_rating_lkp.setRating(rating);
	}

	/**
	* Returns the description of this benefit_rating_lkp.
	*
	* @return the description of this benefit_rating_lkp
	*/
	public java.lang.String getDescription() {
		return _benefit_rating_lkp.getDescription();
	}

	/**
	* Sets the description of this benefit_rating_lkp.
	*
	* @param description the description of this benefit_rating_lkp
	*/
	public void setDescription(java.lang.String description) {
		_benefit_rating_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _benefit_rating_lkp.isNew();
	}

	public void setNew(boolean n) {
		_benefit_rating_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefit_rating_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefit_rating_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefit_rating_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefit_rating_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefit_rating_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefit_rating_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefit_rating_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefit_rating_lkpWrapper((benefit_rating_lkp)_benefit_rating_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.benefit_rating_lkp benefit_rating_lkp) {
		return _benefit_rating_lkp.compareTo(benefit_rating_lkp);
	}

	@Override
	public int hashCode() {
		return _benefit_rating_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefit_rating_lkp> toCacheModel() {
		return _benefit_rating_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefit_rating_lkp toEscapedModel() {
		return new benefit_rating_lkpWrapper(_benefit_rating_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefit_rating_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _benefit_rating_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefit_rating_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefit_rating_lkp getWrappedbenefit_rating_lkp() {
		return _benefit_rating_lkp;
	}

	public benefit_rating_lkp getWrappedModel() {
		return _benefit_rating_lkp;
	}

	public void resetOriginalValues() {
		_benefit_rating_lkp.resetOriginalValues();
	}

	private benefit_rating_lkp _benefit_rating_lkp;
}