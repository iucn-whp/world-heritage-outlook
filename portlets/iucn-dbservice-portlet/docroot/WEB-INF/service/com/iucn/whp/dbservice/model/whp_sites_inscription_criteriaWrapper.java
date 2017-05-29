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
 * This class is a wrapper for {@link whp_sites_inscription_criteria}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_inscription_criteria
 * @generated
 */
public class whp_sites_inscription_criteriaWrapper
	implements whp_sites_inscription_criteria,
		ModelWrapper<whp_sites_inscription_criteria> {
	public whp_sites_inscription_criteriaWrapper(
		whp_sites_inscription_criteria whp_sites_inscription_criteria) {
		_whp_sites_inscription_criteria = whp_sites_inscription_criteria;
	}

	public Class<?> getModelClass() {
		return whp_sites_inscription_criteria.class;
	}

	public String getModelClassName() {
		return whp_sites_inscription_criteria.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_inscription_criteria_id",
			getWhp_sites_inscription_criteria_id());
		attributes.put("site_id", getSite_id());
		attributes.put("criteria_id", getCriteria_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_inscription_criteria_id = (Long)attributes.get(
				"whp_sites_inscription_criteria_id");

		if (whp_sites_inscription_criteria_id != null) {
			setWhp_sites_inscription_criteria_id(whp_sites_inscription_criteria_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer criteria_id = (Integer)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}
	}

	/**
	* Returns the primary key of this whp_sites_inscription_criteria.
	*
	* @return the primary key of this whp_sites_inscription_criteria
	*/
	public long getPrimaryKey() {
		return _whp_sites_inscription_criteria.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_inscription_criteria.
	*
	* @param primaryKey the primary key of this whp_sites_inscription_criteria
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_inscription_criteria.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_inscription_criteria_id of this whp_sites_inscription_criteria.
	*
	* @return the whp_sites_inscription_criteria_id of this whp_sites_inscription_criteria
	*/
	public long getWhp_sites_inscription_criteria_id() {
		return _whp_sites_inscription_criteria.getWhp_sites_inscription_criteria_id();
	}

	/**
	* Sets the whp_sites_inscription_criteria_id of this whp_sites_inscription_criteria.
	*
	* @param whp_sites_inscription_criteria_id the whp_sites_inscription_criteria_id of this whp_sites_inscription_criteria
	*/
	public void setWhp_sites_inscription_criteria_id(
		long whp_sites_inscription_criteria_id) {
		_whp_sites_inscription_criteria.setWhp_sites_inscription_criteria_id(whp_sites_inscription_criteria_id);
	}

	/**
	* Returns the site_id of this whp_sites_inscription_criteria.
	*
	* @return the site_id of this whp_sites_inscription_criteria
	*/
	public long getSite_id() {
		return _whp_sites_inscription_criteria.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_inscription_criteria.
	*
	* @param site_id the site_id of this whp_sites_inscription_criteria
	*/
	public void setSite_id(long site_id) {
		_whp_sites_inscription_criteria.setSite_id(site_id);
	}

	/**
	* Returns the criteria_id of this whp_sites_inscription_criteria.
	*
	* @return the criteria_id of this whp_sites_inscription_criteria
	*/
	public int getCriteria_id() {
		return _whp_sites_inscription_criteria.getCriteria_id();
	}

	/**
	* Sets the criteria_id of this whp_sites_inscription_criteria.
	*
	* @param criteria_id the criteria_id of this whp_sites_inscription_criteria
	*/
	public void setCriteria_id(int criteria_id) {
		_whp_sites_inscription_criteria.setCriteria_id(criteria_id);
	}

	public boolean isNew() {
		return _whp_sites_inscription_criteria.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_inscription_criteria.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_inscription_criteria.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_inscription_criteria.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_inscription_criteria.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_inscription_criteria.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_inscription_criteria.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_inscription_criteria.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_inscription_criteria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_inscription_criteriaWrapper((whp_sites_inscription_criteria)_whp_sites_inscription_criteria.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_inscription_criteria whp_sites_inscription_criteria) {
		return _whp_sites_inscription_criteria.compareTo(whp_sites_inscription_criteria);
	}

	@Override
	public int hashCode() {
		return _whp_sites_inscription_criteria.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> toCacheModel() {
		return _whp_sites_inscription_criteria.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_inscription_criteria toEscapedModel() {
		return new whp_sites_inscription_criteriaWrapper(_whp_sites_inscription_criteria.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_inscription_criteria.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_inscription_criteria.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_inscription_criteria.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_inscription_criteria getWrappedwhp_sites_inscription_criteria() {
		return _whp_sites_inscription_criteria;
	}

	public whp_sites_inscription_criteria getWrappedModel() {
		return _whp_sites_inscription_criteria;
	}

	public void resetOriginalValues() {
		_whp_sites_inscription_criteria.resetOriginalValues();
	}

	private whp_sites_inscription_criteria _whp_sites_inscription_criteria;
}