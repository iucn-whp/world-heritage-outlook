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
 * This class is a wrapper for {@link iucn_region}.
 * </p>
 *
 * @author    alok.sen
 * @see       iucn_region
 * @generated
 */
public class iucn_regionWrapper implements iucn_region,
	ModelWrapper<iucn_region> {
	public iucn_regionWrapper(iucn_region iucn_region) {
		_iucn_region = iucn_region;
	}

	public Class<?> getModelClass() {
		return iucn_region.class;
	}

	public String getModelClassName() {
		return iucn_region.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iucn_region_id", getIucn_region_id());
		attributes.put("name", getName());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer iucn_region_id = (Integer)attributes.get("iucn_region_id");

		if (iucn_region_id != null) {
			setIucn_region_id(iucn_region_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this iucn_region.
	*
	* @return the primary key of this iucn_region
	*/
	public int getPrimaryKey() {
		return _iucn_region.getPrimaryKey();
	}

	/**
	* Sets the primary key of this iucn_region.
	*
	* @param primaryKey the primary key of this iucn_region
	*/
	public void setPrimaryKey(int primaryKey) {
		_iucn_region.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the iucn_region_id of this iucn_region.
	*
	* @return the iucn_region_id of this iucn_region
	*/
	public int getIucn_region_id() {
		return _iucn_region.getIucn_region_id();
	}

	/**
	* Sets the iucn_region_id of this iucn_region.
	*
	* @param iucn_region_id the iucn_region_id of this iucn_region
	*/
	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region.setIucn_region_id(iucn_region_id);
	}

	/**
	* Returns the name of this iucn_region.
	*
	* @return the name of this iucn_region
	*/
	public java.lang.String getName() {
		return _iucn_region.getName();
	}

	/**
	* Sets the name of this iucn_region.
	*
	* @param name the name of this iucn_region
	*/
	public void setName(java.lang.String name) {
		_iucn_region.setName(name);
	}

	public boolean isNew() {
		return _iucn_region.isNew();
	}

	public void setNew(boolean n) {
		_iucn_region.setNew(n);
	}

	public boolean isCachedModel() {
		return _iucn_region.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_iucn_region.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _iucn_region.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _iucn_region.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_iucn_region.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _iucn_region.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_iucn_region.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new iucn_regionWrapper((iucn_region)_iucn_region.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.iucn_region iucn_region) {
		return _iucn_region.compareTo(iucn_region);
	}

	@Override
	public int hashCode() {
		return _iucn_region.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.iucn_region> toCacheModel() {
		return _iucn_region.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.iucn_region toEscapedModel() {
		return new iucn_regionWrapper(_iucn_region.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _iucn_region.toString();
	}

	public java.lang.String toXmlString() {
		return _iucn_region.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_iucn_region.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public iucn_region getWrappediucn_region() {
		return _iucn_region;
	}

	public iucn_region getWrappedModel() {
		return _iucn_region;
	}

	public void resetOriginalValues() {
		_iucn_region.resetOriginalValues();
	}

	private iucn_region _iucn_region;
}