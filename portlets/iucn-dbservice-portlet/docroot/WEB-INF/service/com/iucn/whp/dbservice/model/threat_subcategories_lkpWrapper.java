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
 * This class is a wrapper for {@link threat_subcategories_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_subcategories_lkp
 * @generated
 */
public class threat_subcategories_lkpWrapper implements threat_subcategories_lkp,
	ModelWrapper<threat_subcategories_lkp> {
	public threat_subcategories_lkpWrapper(
		threat_subcategories_lkp threat_subcategories_lkp) {
		_threat_subcategories_lkp = threat_subcategories_lkp;
	}

	public Class<?> getModelClass() {
		return threat_subcategories_lkp.class;
	}

	public String getModelClassName() {
		return threat_subcategories_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("threat_sub_category", getThreat_sub_category());
		attributes.put("parent_id", getParent_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String threat_sub_category = (String)attributes.get(
				"threat_sub_category");

		if (threat_sub_category != null) {
			setThreat_sub_category(threat_sub_category);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}
	}

	/**
	* Returns the primary key of this threat_subcategories_lkp.
	*
	* @return the primary key of this threat_subcategories_lkp
	*/
	public long getPrimaryKey() {
		return _threat_subcategories_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_subcategories_lkp.
	*
	* @param primaryKey the primary key of this threat_subcategories_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_subcategories_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this threat_subcategories_lkp.
	*
	* @return the ID of this threat_subcategories_lkp
	*/
	public long getId() {
		return _threat_subcategories_lkp.getId();
	}

	/**
	* Sets the ID of this threat_subcategories_lkp.
	*
	* @param id the ID of this threat_subcategories_lkp
	*/
	public void setId(long id) {
		_threat_subcategories_lkp.setId(id);
	}

	/**
	* Returns the threat_sub_category of this threat_subcategories_lkp.
	*
	* @return the threat_sub_category of this threat_subcategories_lkp
	*/
	public java.lang.String getThreat_sub_category() {
		return _threat_subcategories_lkp.getThreat_sub_category();
	}

	/**
	* Sets the threat_sub_category of this threat_subcategories_lkp.
	*
	* @param threat_sub_category the threat_sub_category of this threat_subcategories_lkp
	*/
	public void setThreat_sub_category(java.lang.String threat_sub_category) {
		_threat_subcategories_lkp.setThreat_sub_category(threat_sub_category);
	}

	/**
	* Returns the parent_id of this threat_subcategories_lkp.
	*
	* @return the parent_id of this threat_subcategories_lkp
	*/
	public long getParent_id() {
		return _threat_subcategories_lkp.getParent_id();
	}

	/**
	* Sets the parent_id of this threat_subcategories_lkp.
	*
	* @param parent_id the parent_id of this threat_subcategories_lkp
	*/
	public void setParent_id(long parent_id) {
		_threat_subcategories_lkp.setParent_id(parent_id);
	}

	public boolean isNew() {
		return _threat_subcategories_lkp.isNew();
	}

	public void setNew(boolean n) {
		_threat_subcategories_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_subcategories_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_subcategories_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_subcategories_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_subcategories_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_subcategories_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_subcategories_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_subcategories_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_subcategories_lkpWrapper((threat_subcategories_lkp)_threat_subcategories_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp) {
		return _threat_subcategories_lkp.compareTo(threat_subcategories_lkp);
	}

	@Override
	public int hashCode() {
		return _threat_subcategories_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_subcategories_lkp> toCacheModel() {
		return _threat_subcategories_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_subcategories_lkp toEscapedModel() {
		return new threat_subcategories_lkpWrapper(_threat_subcategories_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_subcategories_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_subcategories_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_subcategories_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_subcategories_lkp getWrappedthreat_subcategories_lkp() {
		return _threat_subcategories_lkp;
	}

	public threat_subcategories_lkp getWrappedModel() {
		return _threat_subcategories_lkp;
	}

	public void resetOriginalValues() {
		_threat_subcategories_lkp.resetOriginalValues();
	}

	private threat_subcategories_lkp _threat_subcategories_lkp;
}