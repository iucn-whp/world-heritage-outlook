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
 * This class is a wrapper for {@link whp_sites_iucn_pa_category}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_iucn_pa_category
 * @generated
 */
public class whp_sites_iucn_pa_categoryWrapper
	implements whp_sites_iucn_pa_category,
		ModelWrapper<whp_sites_iucn_pa_category> {
	public whp_sites_iucn_pa_categoryWrapper(
		whp_sites_iucn_pa_category whp_sites_iucn_pa_category) {
		_whp_sites_iucn_pa_category = whp_sites_iucn_pa_category;
	}

	public Class<?> getModelClass() {
		return whp_sites_iucn_pa_category.class;
	}

	public String getModelClassName() {
		return whp_sites_iucn_pa_category.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_iucn_pa_category_id",
			getWhp_sites_iucn_pa_category_id());
		attributes.put("site_id", getSite_id());
		attributes.put("iucn_pa_category_id", getIucn_pa_category_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_iucn_pa_category_id = (Long)attributes.get(
				"whp_sites_iucn_pa_category_id");

		if (whp_sites_iucn_pa_category_id != null) {
			setWhp_sites_iucn_pa_category_id(whp_sites_iucn_pa_category_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer iucn_pa_category_id = (Integer)attributes.get(
				"iucn_pa_category_id");

		if (iucn_pa_category_id != null) {
			setIucn_pa_category_id(iucn_pa_category_id);
		}
	}

	/**
	* Returns the primary key of this whp_sites_iucn_pa_category.
	*
	* @return the primary key of this whp_sites_iucn_pa_category
	*/
	public long getPrimaryKey() {
		return _whp_sites_iucn_pa_category.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_iucn_pa_category.
	*
	* @param primaryKey the primary key of this whp_sites_iucn_pa_category
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_iucn_pa_category.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category.
	*
	* @return the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category
	*/
	public long getWhp_sites_iucn_pa_category_id() {
		return _whp_sites_iucn_pa_category.getWhp_sites_iucn_pa_category_id();
	}

	/**
	* Sets the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category.
	*
	* @param whp_sites_iucn_pa_category_id the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category
	*/
	public void setWhp_sites_iucn_pa_category_id(
		long whp_sites_iucn_pa_category_id) {
		_whp_sites_iucn_pa_category.setWhp_sites_iucn_pa_category_id(whp_sites_iucn_pa_category_id);
	}

	/**
	* Returns the site_id of this whp_sites_iucn_pa_category.
	*
	* @return the site_id of this whp_sites_iucn_pa_category
	*/
	public long getSite_id() {
		return _whp_sites_iucn_pa_category.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_iucn_pa_category.
	*
	* @param site_id the site_id of this whp_sites_iucn_pa_category
	*/
	public void setSite_id(long site_id) {
		_whp_sites_iucn_pa_category.setSite_id(site_id);
	}

	/**
	* Returns the iucn_pa_category_id of this whp_sites_iucn_pa_category.
	*
	* @return the iucn_pa_category_id of this whp_sites_iucn_pa_category
	*/
	public int getIucn_pa_category_id() {
		return _whp_sites_iucn_pa_category.getIucn_pa_category_id();
	}

	/**
	* Sets the iucn_pa_category_id of this whp_sites_iucn_pa_category.
	*
	* @param iucn_pa_category_id the iucn_pa_category_id of this whp_sites_iucn_pa_category
	*/
	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_whp_sites_iucn_pa_category.setIucn_pa_category_id(iucn_pa_category_id);
	}

	public boolean isNew() {
		return _whp_sites_iucn_pa_category.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_iucn_pa_category.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_iucn_pa_category.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_iucn_pa_category.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_iucn_pa_category.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_iucn_pa_category.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_iucn_pa_category.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_iucn_pa_category.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_iucn_pa_category.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_iucn_pa_categoryWrapper((whp_sites_iucn_pa_category)_whp_sites_iucn_pa_category.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category whp_sites_iucn_pa_category) {
		return _whp_sites_iucn_pa_category.compareTo(whp_sites_iucn_pa_category);
	}

	@Override
	public int hashCode() {
		return _whp_sites_iucn_pa_category.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> toCacheModel() {
		return _whp_sites_iucn_pa_category.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category toEscapedModel() {
		return new whp_sites_iucn_pa_categoryWrapper(_whp_sites_iucn_pa_category.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_iucn_pa_category.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_iucn_pa_category.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_iucn_pa_category.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_iucn_pa_category getWrappedwhp_sites_iucn_pa_category() {
		return _whp_sites_iucn_pa_category;
	}

	public whp_sites_iucn_pa_category getWrappedModel() {
		return _whp_sites_iucn_pa_category;
	}

	public void resetOriginalValues() {
		_whp_sites_iucn_pa_category.resetOriginalValues();
	}

	private whp_sites_iucn_pa_category _whp_sites_iucn_pa_category;
}