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
 * This class is a wrapper for {@link unesco_region}.
 * </p>
 *
 * @author    alok.sen
 * @see       unesco_region
 * @generated
 */
public class unesco_regionWrapper implements unesco_region,
	ModelWrapper<unesco_region> {
	public unesco_regionWrapper(unesco_region unesco_region) {
		_unesco_region = unesco_region;
	}

	public Class<?> getModelClass() {
		return unesco_region.class;
	}

	public String getModelClassName() {
		return unesco_region.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unesco_region_id", getUnesco_region_id());
		attributes.put("name", getName());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer unesco_region_id = (Integer)attributes.get("unesco_region_id");

		if (unesco_region_id != null) {
			setUnesco_region_id(unesco_region_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this unesco_region.
	*
	* @return the primary key of this unesco_region
	*/
	public int getPrimaryKey() {
		return _unesco_region.getPrimaryKey();
	}

	/**
	* Sets the primary key of this unesco_region.
	*
	* @param primaryKey the primary key of this unesco_region
	*/
	public void setPrimaryKey(int primaryKey) {
		_unesco_region.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the unesco_region_id of this unesco_region.
	*
	* @return the unesco_region_id of this unesco_region
	*/
	public int getUnesco_region_id() {
		return _unesco_region.getUnesco_region_id();
	}

	/**
	* Sets the unesco_region_id of this unesco_region.
	*
	* @param unesco_region_id the unesco_region_id of this unesco_region
	*/
	public void setUnesco_region_id(int unesco_region_id) {
		_unesco_region.setUnesco_region_id(unesco_region_id);
	}

	/**
	* Returns the name of this unesco_region.
	*
	* @return the name of this unesco_region
	*/
	public java.lang.String getName() {
		return _unesco_region.getName();
	}

	/**
	* Sets the name of this unesco_region.
	*
	* @param name the name of this unesco_region
	*/
	public void setName(java.lang.String name) {
		_unesco_region.setName(name);
	}

	public boolean isNew() {
		return _unesco_region.isNew();
	}

	public void setNew(boolean n) {
		_unesco_region.setNew(n);
	}

	public boolean isCachedModel() {
		return _unesco_region.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_unesco_region.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _unesco_region.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _unesco_region.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_unesco_region.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _unesco_region.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_unesco_region.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new unesco_regionWrapper((unesco_region)_unesco_region.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.unesco_region unesco_region) {
		return _unesco_region.compareTo(unesco_region);
	}

	@Override
	public int hashCode() {
		return _unesco_region.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.unesco_region> toCacheModel() {
		return _unesco_region.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.unesco_region toEscapedModel() {
		return new unesco_regionWrapper(_unesco_region.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _unesco_region.toString();
	}

	public java.lang.String toXmlString() {
		return _unesco_region.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_unesco_region.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public unesco_region getWrappedunesco_region() {
		return _unesco_region;
	}

	public unesco_region getWrappedModel() {
		return _unesco_region;
	}

	public void resetOriginalValues() {
		_unesco_region.resetOriginalValues();
	}

	private unesco_region _unesco_region;
}