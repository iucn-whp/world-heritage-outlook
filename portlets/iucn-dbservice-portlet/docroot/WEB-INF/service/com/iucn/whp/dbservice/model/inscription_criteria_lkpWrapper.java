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
 * This class is a wrapper for {@link inscription_criteria_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       inscription_criteria_lkp
 * @generated
 */
public class inscription_criteria_lkpWrapper implements inscription_criteria_lkp,
	ModelWrapper<inscription_criteria_lkp> {
	public inscription_criteria_lkpWrapper(
		inscription_criteria_lkp inscription_criteria_lkp) {
		_inscription_criteria_lkp = inscription_criteria_lkp;
	}

	public Class<?> getModelClass() {
		return inscription_criteria_lkp.class;
	}

	public String getModelClassName() {
		return inscription_criteria_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_id", getCriteria_id());
		attributes.put("criteria", getCriteria());
		attributes.put("criteria_type", getCriteria_type());
		attributes.put("criteria_desc", getCriteria_desc());
		attributes.put("criteria_title", getCriteria_title());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer criteria_id = (Integer)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		String criteria = (String)attributes.get("criteria");

		if (criteria != null) {
			setCriteria(criteria);
		}

		String criteria_type = (String)attributes.get("criteria_type");

		if (criteria_type != null) {
			setCriteria_type(criteria_type);
		}

		String criteria_desc = (String)attributes.get("criteria_desc");

		if (criteria_desc != null) {
			setCriteria_desc(criteria_desc);
		}

		String criteria_title = (String)attributes.get("criteria_title");

		if (criteria_title != null) {
			setCriteria_title(criteria_title);
		}
	}

	/**
	* Returns the primary key of this inscription_criteria_lkp.
	*
	* @return the primary key of this inscription_criteria_lkp
	*/
	public int getPrimaryKey() {
		return _inscription_criteria_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inscription_criteria_lkp.
	*
	* @param primaryKey the primary key of this inscription_criteria_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_inscription_criteria_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the criteria_id of this inscription_criteria_lkp.
	*
	* @return the criteria_id of this inscription_criteria_lkp
	*/
	public int getCriteria_id() {
		return _inscription_criteria_lkp.getCriteria_id();
	}

	/**
	* Sets the criteria_id of this inscription_criteria_lkp.
	*
	* @param criteria_id the criteria_id of this inscription_criteria_lkp
	*/
	public void setCriteria_id(int criteria_id) {
		_inscription_criteria_lkp.setCriteria_id(criteria_id);
	}

	/**
	* Returns the criteria of this inscription_criteria_lkp.
	*
	* @return the criteria of this inscription_criteria_lkp
	*/
	public java.lang.String getCriteria() {
		return _inscription_criteria_lkp.getCriteria();
	}

	/**
	* Sets the criteria of this inscription_criteria_lkp.
	*
	* @param criteria the criteria of this inscription_criteria_lkp
	*/
	public void setCriteria(java.lang.String criteria) {
		_inscription_criteria_lkp.setCriteria(criteria);
	}

	/**
	* Returns the criteria_type of this inscription_criteria_lkp.
	*
	* @return the criteria_type of this inscription_criteria_lkp
	*/
	public java.lang.String getCriteria_type() {
		return _inscription_criteria_lkp.getCriteria_type();
	}

	/**
	* Sets the criteria_type of this inscription_criteria_lkp.
	*
	* @param criteria_type the criteria_type of this inscription_criteria_lkp
	*/
	public void setCriteria_type(java.lang.String criteria_type) {
		_inscription_criteria_lkp.setCriteria_type(criteria_type);
	}

	/**
	* Returns the criteria_desc of this inscription_criteria_lkp.
	*
	* @return the criteria_desc of this inscription_criteria_lkp
	*/
	public java.lang.String getCriteria_desc() {
		return _inscription_criteria_lkp.getCriteria_desc();
	}

	/**
	* Sets the criteria_desc of this inscription_criteria_lkp.
	*
	* @param criteria_desc the criteria_desc of this inscription_criteria_lkp
	*/
	public void setCriteria_desc(java.lang.String criteria_desc) {
		_inscription_criteria_lkp.setCriteria_desc(criteria_desc);
	}

	/**
	* Returns the criteria_title of this inscription_criteria_lkp.
	*
	* @return the criteria_title of this inscription_criteria_lkp
	*/
	public java.lang.String getCriteria_title() {
		return _inscription_criteria_lkp.getCriteria_title();
	}

	/**
	* Sets the criteria_title of this inscription_criteria_lkp.
	*
	* @param criteria_title the criteria_title of this inscription_criteria_lkp
	*/
	public void setCriteria_title(java.lang.String criteria_title) {
		_inscription_criteria_lkp.setCriteria_title(criteria_title);
	}

	public boolean isNew() {
		return _inscription_criteria_lkp.isNew();
	}

	public void setNew(boolean n) {
		_inscription_criteria_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _inscription_criteria_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_inscription_criteria_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _inscription_criteria_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _inscription_criteria_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inscription_criteria_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inscription_criteria_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inscription_criteria_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new inscription_criteria_lkpWrapper((inscription_criteria_lkp)_inscription_criteria_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.inscription_criteria_lkp inscription_criteria_lkp) {
		return _inscription_criteria_lkp.compareTo(inscription_criteria_lkp);
	}

	@Override
	public int hashCode() {
		return _inscription_criteria_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.inscription_criteria_lkp> toCacheModel() {
		return _inscription_criteria_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.inscription_criteria_lkp toEscapedModel() {
		return new inscription_criteria_lkpWrapper(_inscription_criteria_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inscription_criteria_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _inscription_criteria_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inscription_criteria_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public inscription_criteria_lkp getWrappedinscription_criteria_lkp() {
		return _inscription_criteria_lkp;
	}

	public inscription_criteria_lkp getWrappedModel() {
		return _inscription_criteria_lkp;
	}

	public void resetOriginalValues() {
		_inscription_criteria_lkp.resetOriginalValues();
	}

	private inscription_criteria_lkp _inscription_criteria_lkp;
}