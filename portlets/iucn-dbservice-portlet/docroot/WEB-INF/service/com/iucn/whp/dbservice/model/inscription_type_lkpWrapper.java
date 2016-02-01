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
 * This class is a wrapper for {@link inscription_type_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       inscription_type_lkp
 * @generated
 */
public class inscription_type_lkpWrapper implements inscription_type_lkp,
	ModelWrapper<inscription_type_lkp> {
	public inscription_type_lkpWrapper(
		inscription_type_lkp inscription_type_lkp) {
		_inscription_type_lkp = inscription_type_lkp;
	}

	public Class<?> getModelClass() {
		return inscription_type_lkp.class;
	}

	public String getModelClassName() {
		return inscription_type_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("incription_type_id", getIncription_type_id());
		attributes.put("type", getType());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer incription_type_id = (Integer)attributes.get(
				"incription_type_id");

		if (incription_type_id != null) {
			setIncription_type_id(incription_type_id);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	* Returns the primary key of this inscription_type_lkp.
	*
	* @return the primary key of this inscription_type_lkp
	*/
	public int getPrimaryKey() {
		return _inscription_type_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inscription_type_lkp.
	*
	* @param primaryKey the primary key of this inscription_type_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_inscription_type_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the incription_type_id of this inscription_type_lkp.
	*
	* @return the incription_type_id of this inscription_type_lkp
	*/
	public int getIncription_type_id() {
		return _inscription_type_lkp.getIncription_type_id();
	}

	/**
	* Sets the incription_type_id of this inscription_type_lkp.
	*
	* @param incription_type_id the incription_type_id of this inscription_type_lkp
	*/
	public void setIncription_type_id(int incription_type_id) {
		_inscription_type_lkp.setIncription_type_id(incription_type_id);
	}

	/**
	* Returns the type of this inscription_type_lkp.
	*
	* @return the type of this inscription_type_lkp
	*/
	public java.lang.String getType() {
		return _inscription_type_lkp.getType();
	}

	/**
	* Sets the type of this inscription_type_lkp.
	*
	* @param type the type of this inscription_type_lkp
	*/
	public void setType(java.lang.String type) {
		_inscription_type_lkp.setType(type);
	}

	public boolean isNew() {
		return _inscription_type_lkp.isNew();
	}

	public void setNew(boolean n) {
		_inscription_type_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _inscription_type_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_inscription_type_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _inscription_type_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _inscription_type_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inscription_type_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inscription_type_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inscription_type_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new inscription_type_lkpWrapper((inscription_type_lkp)_inscription_type_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.inscription_type_lkp inscription_type_lkp) {
		return _inscription_type_lkp.compareTo(inscription_type_lkp);
	}

	@Override
	public int hashCode() {
		return _inscription_type_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.inscription_type_lkp> toCacheModel() {
		return _inscription_type_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.inscription_type_lkp toEscapedModel() {
		return new inscription_type_lkpWrapper(_inscription_type_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inscription_type_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _inscription_type_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inscription_type_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public inscription_type_lkp getWrappedinscription_type_lkp() {
		return _inscription_type_lkp;
	}

	public inscription_type_lkp getWrappedModel() {
		return _inscription_type_lkp;
	}

	public void resetOriginalValues() {
		_inscription_type_lkp.resetOriginalValues();
	}

	private inscription_type_lkp _inscription_type_lkp;
}