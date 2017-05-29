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
 * This class is a wrapper for {@link other_designation_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       other_designation_lkp
 * @generated
 */
public class other_designation_lkpWrapper implements other_designation_lkp,
	ModelWrapper<other_designation_lkp> {
	public other_designation_lkpWrapper(
		other_designation_lkp other_designation_lkp) {
		_other_designation_lkp = other_designation_lkp;
	}

	public Class<?> getModelClass() {
		return other_designation_lkp.class;
	}

	public String getModelClassName() {
		return other_designation_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("other_designations_id", getOther_designations_id());
		attributes.put("designation", getDesignation());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer other_designations_id = (Integer)attributes.get(
				"other_designations_id");

		if (other_designations_id != null) {
			setOther_designations_id(other_designations_id);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}
	}

	/**
	* Returns the primary key of this other_designation_lkp.
	*
	* @return the primary key of this other_designation_lkp
	*/
	public int getPrimaryKey() {
		return _other_designation_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this other_designation_lkp.
	*
	* @param primaryKey the primary key of this other_designation_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_other_designation_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the other_designations_id of this other_designation_lkp.
	*
	* @return the other_designations_id of this other_designation_lkp
	*/
	public int getOther_designations_id() {
		return _other_designation_lkp.getOther_designations_id();
	}

	/**
	* Sets the other_designations_id of this other_designation_lkp.
	*
	* @param other_designations_id the other_designations_id of this other_designation_lkp
	*/
	public void setOther_designations_id(int other_designations_id) {
		_other_designation_lkp.setOther_designations_id(other_designations_id);
	}

	/**
	* Returns the designation of this other_designation_lkp.
	*
	* @return the designation of this other_designation_lkp
	*/
	public java.lang.String getDesignation() {
		return _other_designation_lkp.getDesignation();
	}

	/**
	* Sets the designation of this other_designation_lkp.
	*
	* @param designation the designation of this other_designation_lkp
	*/
	public void setDesignation(java.lang.String designation) {
		_other_designation_lkp.setDesignation(designation);
	}

	public boolean isNew() {
		return _other_designation_lkp.isNew();
	}

	public void setNew(boolean n) {
		_other_designation_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _other_designation_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_other_designation_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _other_designation_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _other_designation_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_other_designation_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _other_designation_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_other_designation_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new other_designation_lkpWrapper((other_designation_lkp)_other_designation_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.other_designation_lkp other_designation_lkp) {
		return _other_designation_lkp.compareTo(other_designation_lkp);
	}

	@Override
	public int hashCode() {
		return _other_designation_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.other_designation_lkp> toCacheModel() {
		return _other_designation_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.other_designation_lkp toEscapedModel() {
		return new other_designation_lkpWrapper(_other_designation_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _other_designation_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _other_designation_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_other_designation_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public other_designation_lkp getWrappedother_designation_lkp() {
		return _other_designation_lkp;
	}

	public other_designation_lkp getWrappedModel() {
		return _other_designation_lkp;
	}

	public void resetOriginalValues() {
		_other_designation_lkp.resetOriginalValues();
	}

	private other_designation_lkp _other_designation_lkp;
}