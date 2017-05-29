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
 * This class is a wrapper for {@link iucn_pa_lkp_category}.
 * </p>
 *
 * @author    alok.sen
 * @see       iucn_pa_lkp_category
 * @generated
 */
public class iucn_pa_lkp_categoryWrapper implements iucn_pa_lkp_category,
	ModelWrapper<iucn_pa_lkp_category> {
	public iucn_pa_lkp_categoryWrapper(
		iucn_pa_lkp_category iucn_pa_lkp_category) {
		_iucn_pa_lkp_category = iucn_pa_lkp_category;
	}

	public Class<?> getModelClass() {
		return iucn_pa_lkp_category.class;
	}

	public String getModelClassName() {
		return iucn_pa_lkp_category.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iucn_pa_category_id", getIucn_pa_category_id());
		attributes.put("category", getCategory());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer iucn_pa_category_id = (Integer)attributes.get(
				"iucn_pa_category_id");

		if (iucn_pa_category_id != null) {
			setIucn_pa_category_id(iucn_pa_category_id);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}
	}

	/**
	* Returns the primary key of this iucn_pa_lkp_category.
	*
	* @return the primary key of this iucn_pa_lkp_category
	*/
	public int getPrimaryKey() {
		return _iucn_pa_lkp_category.getPrimaryKey();
	}

	/**
	* Sets the primary key of this iucn_pa_lkp_category.
	*
	* @param primaryKey the primary key of this iucn_pa_lkp_category
	*/
	public void setPrimaryKey(int primaryKey) {
		_iucn_pa_lkp_category.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the iucn_pa_category_id of this iucn_pa_lkp_category.
	*
	* @return the iucn_pa_category_id of this iucn_pa_lkp_category
	*/
	public int getIucn_pa_category_id() {
		return _iucn_pa_lkp_category.getIucn_pa_category_id();
	}

	/**
	* Sets the iucn_pa_category_id of this iucn_pa_lkp_category.
	*
	* @param iucn_pa_category_id the iucn_pa_category_id of this iucn_pa_lkp_category
	*/
	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_iucn_pa_lkp_category.setIucn_pa_category_id(iucn_pa_category_id);
	}

	/**
	* Returns the category of this iucn_pa_lkp_category.
	*
	* @return the category of this iucn_pa_lkp_category
	*/
	public java.lang.String getCategory() {
		return _iucn_pa_lkp_category.getCategory();
	}

	/**
	* Sets the category of this iucn_pa_lkp_category.
	*
	* @param category the category of this iucn_pa_lkp_category
	*/
	public void setCategory(java.lang.String category) {
		_iucn_pa_lkp_category.setCategory(category);
	}

	public boolean isNew() {
		return _iucn_pa_lkp_category.isNew();
	}

	public void setNew(boolean n) {
		_iucn_pa_lkp_category.setNew(n);
	}

	public boolean isCachedModel() {
		return _iucn_pa_lkp_category.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_iucn_pa_lkp_category.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _iucn_pa_lkp_category.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _iucn_pa_lkp_category.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_iucn_pa_lkp_category.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _iucn_pa_lkp_category.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_iucn_pa_lkp_category.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new iucn_pa_lkp_categoryWrapper((iucn_pa_lkp_category)_iucn_pa_lkp_category.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category) {
		return _iucn_pa_lkp_category.compareTo(iucn_pa_lkp_category);
	}

	@Override
	public int hashCode() {
		return _iucn_pa_lkp_category.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> toCacheModel() {
		return _iucn_pa_lkp_category.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category toEscapedModel() {
		return new iucn_pa_lkp_categoryWrapper(_iucn_pa_lkp_category.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _iucn_pa_lkp_category.toString();
	}

	public java.lang.String toXmlString() {
		return _iucn_pa_lkp_category.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_iucn_pa_lkp_category.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public iucn_pa_lkp_category getWrappediucn_pa_lkp_category() {
		return _iucn_pa_lkp_category;
	}

	public iucn_pa_lkp_category getWrappedModel() {
		return _iucn_pa_lkp_category;
	}

	public void resetOriginalValues() {
		_iucn_pa_lkp_category.resetOriginalValues();
	}

	private iucn_pa_lkp_category _iucn_pa_lkp_category;
}