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
 * This class is a wrapper for {@link whp_criteria_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_criteria_lkp
 * @generated
 */
public class whp_criteria_lkpWrapper implements whp_criteria_lkp,
	ModelWrapper<whp_criteria_lkp> {
	public whp_criteria_lkpWrapper(whp_criteria_lkp whp_criteria_lkp) {
		_whp_criteria_lkp = whp_criteria_lkp;
	}

	public Class<?> getModelClass() {
		return whp_criteria_lkp.class;
	}

	public String getModelClassName() {
		return whp_criteria_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("criterion", getCriterion());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String criterion = (String)attributes.get("criterion");

		if (criterion != null) {
			setCriterion(criterion);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this whp_criteria_lkp.
	*
	* @return the primary key of this whp_criteria_lkp
	*/
	public long getPrimaryKey() {
		return _whp_criteria_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_criteria_lkp.
	*
	* @param primaryKey the primary key of this whp_criteria_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_criteria_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this whp_criteria_lkp.
	*
	* @return the ID of this whp_criteria_lkp
	*/
	public long getId() {
		return _whp_criteria_lkp.getId();
	}

	/**
	* Sets the ID of this whp_criteria_lkp.
	*
	* @param id the ID of this whp_criteria_lkp
	*/
	public void setId(long id) {
		_whp_criteria_lkp.setId(id);
	}

	/**
	* Returns the criterion of this whp_criteria_lkp.
	*
	* @return the criterion of this whp_criteria_lkp
	*/
	public java.lang.String getCriterion() {
		return _whp_criteria_lkp.getCriterion();
	}

	/**
	* Sets the criterion of this whp_criteria_lkp.
	*
	* @param criterion the criterion of this whp_criteria_lkp
	*/
	public void setCriterion(java.lang.String criterion) {
		_whp_criteria_lkp.setCriterion(criterion);
	}

	/**
	* Returns the description of this whp_criteria_lkp.
	*
	* @return the description of this whp_criteria_lkp
	*/
	public java.lang.String getDescription() {
		return _whp_criteria_lkp.getDescription();
	}

	/**
	* Sets the description of this whp_criteria_lkp.
	*
	* @param description the description of this whp_criteria_lkp
	*/
	public void setDescription(java.lang.String description) {
		_whp_criteria_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _whp_criteria_lkp.isNew();
	}

	public void setNew(boolean n) {
		_whp_criteria_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_criteria_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_criteria_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_criteria_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_criteria_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_criteria_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_criteria_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_criteria_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_criteria_lkpWrapper((whp_criteria_lkp)_whp_criteria_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp) {
		return _whp_criteria_lkp.compareTo(whp_criteria_lkp);
	}

	@Override
	public int hashCode() {
		return _whp_criteria_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_criteria_lkp> toCacheModel() {
		return _whp_criteria_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_criteria_lkp toEscapedModel() {
		return new whp_criteria_lkpWrapper(_whp_criteria_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_criteria_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_criteria_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_criteria_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_criteria_lkp getWrappedwhp_criteria_lkp() {
		return _whp_criteria_lkp;
	}

	public whp_criteria_lkp getWrappedModel() {
		return _whp_criteria_lkp;
	}

	public void resetOriginalValues() {
		_whp_criteria_lkp.resetOriginalValues();
	}

	private whp_criteria_lkp _whp_criteria_lkp;
}