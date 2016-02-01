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
 * This class is a wrapper for {@link boundary_modification_type_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       boundary_modification_type_lkp
 * @generated
 */
public class boundary_modification_type_lkpWrapper
	implements boundary_modification_type_lkp,
		ModelWrapper<boundary_modification_type_lkp> {
	public boundary_modification_type_lkpWrapper(
		boundary_modification_type_lkp boundary_modification_type_lkp) {
		_boundary_modification_type_lkp = boundary_modification_type_lkp;
	}

	public Class<?> getModelClass() {
		return boundary_modification_type_lkp.class;
	}

	public String getModelClassName() {
		return boundary_modification_type_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bm_id", getBm_id());
		attributes.put("bm_type", getBm_type());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer bm_id = (Integer)attributes.get("bm_id");

		if (bm_id != null) {
			setBm_id(bm_id);
		}

		String bm_type = (String)attributes.get("bm_type");

		if (bm_type != null) {
			setBm_type(bm_type);
		}
	}

	/**
	* Returns the primary key of this boundary_modification_type_lkp.
	*
	* @return the primary key of this boundary_modification_type_lkp
	*/
	public int getPrimaryKey() {
		return _boundary_modification_type_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this boundary_modification_type_lkp.
	*
	* @param primaryKey the primary key of this boundary_modification_type_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_boundary_modification_type_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the bm_id of this boundary_modification_type_lkp.
	*
	* @return the bm_id of this boundary_modification_type_lkp
	*/
	public int getBm_id() {
		return _boundary_modification_type_lkp.getBm_id();
	}

	/**
	* Sets the bm_id of this boundary_modification_type_lkp.
	*
	* @param bm_id the bm_id of this boundary_modification_type_lkp
	*/
	public void setBm_id(int bm_id) {
		_boundary_modification_type_lkp.setBm_id(bm_id);
	}

	/**
	* Returns the bm_type of this boundary_modification_type_lkp.
	*
	* @return the bm_type of this boundary_modification_type_lkp
	*/
	public java.lang.String getBm_type() {
		return _boundary_modification_type_lkp.getBm_type();
	}

	/**
	* Sets the bm_type of this boundary_modification_type_lkp.
	*
	* @param bm_type the bm_type of this boundary_modification_type_lkp
	*/
	public void setBm_type(java.lang.String bm_type) {
		_boundary_modification_type_lkp.setBm_type(bm_type);
	}

	public boolean isNew() {
		return _boundary_modification_type_lkp.isNew();
	}

	public void setNew(boolean n) {
		_boundary_modification_type_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _boundary_modification_type_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_boundary_modification_type_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _boundary_modification_type_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _boundary_modification_type_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_boundary_modification_type_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _boundary_modification_type_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_boundary_modification_type_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new boundary_modification_type_lkpWrapper((boundary_modification_type_lkp)_boundary_modification_type_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.boundary_modification_type_lkp boundary_modification_type_lkp) {
		return _boundary_modification_type_lkp.compareTo(boundary_modification_type_lkp);
	}

	@Override
	public int hashCode() {
		return _boundary_modification_type_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.boundary_modification_type_lkp> toCacheModel() {
		return _boundary_modification_type_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp toEscapedModel() {
		return new boundary_modification_type_lkpWrapper(_boundary_modification_type_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _boundary_modification_type_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _boundary_modification_type_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_boundary_modification_type_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public boundary_modification_type_lkp getWrappedboundary_modification_type_lkp() {
		return _boundary_modification_type_lkp;
	}

	public boundary_modification_type_lkp getWrappedModel() {
		return _boundary_modification_type_lkp;
	}

	public void resetOriginalValues() {
		_boundary_modification_type_lkp.resetOriginalValues();
	}

	private boundary_modification_type_lkp _boundary_modification_type_lkp;
}