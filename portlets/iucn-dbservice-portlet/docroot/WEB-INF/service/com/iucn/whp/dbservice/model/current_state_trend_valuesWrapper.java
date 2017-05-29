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
 * This class is a wrapper for {@link current_state_trend_values}.
 * </p>
 *
 * @author    alok.sen
 * @see       current_state_trend_values
 * @generated
 */
public class current_state_trend_valuesWrapper
	implements current_state_trend_values,
		ModelWrapper<current_state_trend_values> {
	public current_state_trend_valuesWrapper(
		current_state_trend_values current_state_trend_values) {
		_current_state_trend_values = current_state_trend_values;
	}

	public Class<?> getModelClass() {
		return current_state_trend_values.class;
	}

	public String getModelClassName() {
		return current_state_trend_values.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vn", getVn());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("state_trend_id", getState_trend_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Long state_trend_id = (Long)attributes.get("state_trend_id");

		if (state_trend_id != null) {
			setState_trend_id(state_trend_id);
		}
	}

	/**
	* Returns the primary key of this current_state_trend_values.
	*
	* @return the primary key of this current_state_trend_values
	*/
	public long getPrimaryKey() {
		return _current_state_trend_values.getPrimaryKey();
	}

	/**
	* Sets the primary key of this current_state_trend_values.
	*
	* @param primaryKey the primary key of this current_state_trend_values
	*/
	public void setPrimaryKey(long primaryKey) {
		_current_state_trend_values.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this current_state_trend_values.
	*
	* @return the ID of this current_state_trend_values
	*/
	public long getId() {
		return _current_state_trend_values.getId();
	}

	/**
	* Sets the ID of this current_state_trend_values.
	*
	* @param id the ID of this current_state_trend_values
	*/
	public void setId(long id) {
		_current_state_trend_values.setId(id);
	}

	/**
	* Returns the vn of this current_state_trend_values.
	*
	* @return the vn of this current_state_trend_values
	*/
	public long getVn() {
		return _current_state_trend_values.getVn();
	}

	/**
	* Sets the vn of this current_state_trend_values.
	*
	* @param vn the vn of this current_state_trend_values
	*/
	public void setVn(long vn) {
		_current_state_trend_values.setVn(vn);
	}

	/**
	* Returns the whvalues_id of this current_state_trend_values.
	*
	* @return the whvalues_id of this current_state_trend_values
	*/
	public long getWhvalues_id() {
		return _current_state_trend_values.getWhvalues_id();
	}

	/**
	* Sets the whvalues_id of this current_state_trend_values.
	*
	* @param whvalues_id the whvalues_id of this current_state_trend_values
	*/
	public void setWhvalues_id(long whvalues_id) {
		_current_state_trend_values.setWhvalues_id(whvalues_id);
	}

	/**
	* Returns the state_trend_id of this current_state_trend_values.
	*
	* @return the state_trend_id of this current_state_trend_values
	*/
	public long getState_trend_id() {
		return _current_state_trend_values.getState_trend_id();
	}

	/**
	* Sets the state_trend_id of this current_state_trend_values.
	*
	* @param state_trend_id the state_trend_id of this current_state_trend_values
	*/
	public void setState_trend_id(long state_trend_id) {
		_current_state_trend_values.setState_trend_id(state_trend_id);
	}

	public boolean isNew() {
		return _current_state_trend_values.isNew();
	}

	public void setNew(boolean n) {
		_current_state_trend_values.setNew(n);
	}

	public boolean isCachedModel() {
		return _current_state_trend_values.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_current_state_trend_values.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _current_state_trend_values.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _current_state_trend_values.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_current_state_trend_values.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _current_state_trend_values.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_current_state_trend_values.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new current_state_trend_valuesWrapper((current_state_trend_values)_current_state_trend_values.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.current_state_trend_values current_state_trend_values) {
		return _current_state_trend_values.compareTo(current_state_trend_values);
	}

	@Override
	public int hashCode() {
		return _current_state_trend_values.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.current_state_trend_values> toCacheModel() {
		return _current_state_trend_values.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.current_state_trend_values toEscapedModel() {
		return new current_state_trend_valuesWrapper(_current_state_trend_values.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _current_state_trend_values.toString();
	}

	public java.lang.String toXmlString() {
		return _current_state_trend_values.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_current_state_trend_values.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public current_state_trend_values getWrappedcurrent_state_trend_values() {
		return _current_state_trend_values;
	}

	public current_state_trend_values getWrappedModel() {
		return _current_state_trend_values;
	}

	public void resetOriginalValues() {
		_current_state_trend_values.resetOriginalValues();
	}

	private current_state_trend_values _current_state_trend_values;
}