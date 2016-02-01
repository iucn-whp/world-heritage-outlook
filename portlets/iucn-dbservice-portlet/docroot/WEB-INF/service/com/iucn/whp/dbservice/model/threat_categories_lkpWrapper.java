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
 * This class is a wrapper for {@link threat_categories_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_categories_lkp
 * @generated
 */
public class threat_categories_lkpWrapper implements threat_categories_lkp,
	ModelWrapper<threat_categories_lkp> {
	public threat_categories_lkpWrapper(
		threat_categories_lkp threat_categories_lkp) {
		_threat_categories_lkp = threat_categories_lkp;
	}

	public Class<?> getModelClass() {
		return threat_categories_lkp.class;
	}

	public String getModelClassName() {
		return threat_categories_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threatCategoryid", getThreatCategoryid());
		attributes.put("threat_category", getThreat_category());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long threatCategoryid = (Long)attributes.get("threatCategoryid");

		if (threatCategoryid != null) {
			setThreatCategoryid(threatCategoryid);
		}

		String threat_category = (String)attributes.get("threat_category");

		if (threat_category != null) {
			setThreat_category(threat_category);
		}
	}

	/**
	* Returns the primary key of this threat_categories_lkp.
	*
	* @return the primary key of this threat_categories_lkp
	*/
	public long getPrimaryKey() {
		return _threat_categories_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_categories_lkp.
	*
	* @param primaryKey the primary key of this threat_categories_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_categories_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the threat categoryid of this threat_categories_lkp.
	*
	* @return the threat categoryid of this threat_categories_lkp
	*/
	public long getThreatCategoryid() {
		return _threat_categories_lkp.getThreatCategoryid();
	}

	/**
	* Sets the threat categoryid of this threat_categories_lkp.
	*
	* @param threatCategoryid the threat categoryid of this threat_categories_lkp
	*/
	public void setThreatCategoryid(long threatCategoryid) {
		_threat_categories_lkp.setThreatCategoryid(threatCategoryid);
	}

	/**
	* Returns the threat_category of this threat_categories_lkp.
	*
	* @return the threat_category of this threat_categories_lkp
	*/
	public java.lang.String getThreat_category() {
		return _threat_categories_lkp.getThreat_category();
	}

	/**
	* Sets the threat_category of this threat_categories_lkp.
	*
	* @param threat_category the threat_category of this threat_categories_lkp
	*/
	public void setThreat_category(java.lang.String threat_category) {
		_threat_categories_lkp.setThreat_category(threat_category);
	}

	public boolean isNew() {
		return _threat_categories_lkp.isNew();
	}

	public void setNew(boolean n) {
		_threat_categories_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_categories_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_categories_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_categories_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_categories_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_categories_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_categories_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_categories_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_categories_lkpWrapper((threat_categories_lkp)_threat_categories_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp) {
		return _threat_categories_lkp.compareTo(threat_categories_lkp);
	}

	@Override
	public int hashCode() {
		return _threat_categories_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_categories_lkp> toCacheModel() {
		return _threat_categories_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_categories_lkp toEscapedModel() {
		return new threat_categories_lkpWrapper(_threat_categories_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_categories_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_categories_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_categories_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_categories_lkp getWrappedthreat_categories_lkp() {
		return _threat_categories_lkp;
	}

	public threat_categories_lkp getWrappedModel() {
		return _threat_categories_lkp;
	}

	public void resetOriginalValues() {
		_threat_categories_lkp.resetOriginalValues();
	}

	private threat_categories_lkp _threat_categories_lkp;
}