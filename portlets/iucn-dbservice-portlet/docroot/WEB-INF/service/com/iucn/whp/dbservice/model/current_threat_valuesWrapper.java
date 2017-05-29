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
 * This class is a wrapper for {@link current_threat_values}.
 * </p>
 *
 * @author    alok.sen
 * @see       current_threat_values
 * @generated
 */
public class current_threat_valuesWrapper implements current_threat_values,
	ModelWrapper<current_threat_values> {
	public current_threat_valuesWrapper(
		current_threat_values current_threat_values) {
		_current_threat_values = current_threat_values;
	}

	public Class<?> getModelClass() {
		return current_threat_values.class;
	}

	public String getModelClassName() {
		return current_threat_values.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("current_threat_values_id", getCurrent_threat_values_id());
		attributes.put("current_threat_id", getCurrent_threat_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long current_threat_values_id = (Long)attributes.get(
				"current_threat_values_id");

		if (current_threat_values_id != null) {
			setCurrent_threat_values_id(current_threat_values_id);
		}

		Long current_threat_id = (Long)attributes.get("current_threat_id");

		if (current_threat_id != null) {
			setCurrent_threat_id(current_threat_id);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Boolean is_biodiv_whval = (Boolean)attributes.get("is_biodiv_whval");

		if (is_biodiv_whval != null) {
			setIs_biodiv_whval(is_biodiv_whval);
		}
	}

	/**
	* Returns the primary key of this current_threat_values.
	*
	* @return the primary key of this current_threat_values
	*/
	public long getPrimaryKey() {
		return _current_threat_values.getPrimaryKey();
	}

	/**
	* Sets the primary key of this current_threat_values.
	*
	* @param primaryKey the primary key of this current_threat_values
	*/
	public void setPrimaryKey(long primaryKey) {
		_current_threat_values.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the current_threat_values_id of this current_threat_values.
	*
	* @return the current_threat_values_id of this current_threat_values
	*/
	public long getCurrent_threat_values_id() {
		return _current_threat_values.getCurrent_threat_values_id();
	}

	/**
	* Sets the current_threat_values_id of this current_threat_values.
	*
	* @param current_threat_values_id the current_threat_values_id of this current_threat_values
	*/
	public void setCurrent_threat_values_id(long current_threat_values_id) {
		_current_threat_values.setCurrent_threat_values_id(current_threat_values_id);
	}

	/**
	* Returns the current_threat_id of this current_threat_values.
	*
	* @return the current_threat_id of this current_threat_values
	*/
	public long getCurrent_threat_id() {
		return _current_threat_values.getCurrent_threat_id();
	}

	/**
	* Sets the current_threat_id of this current_threat_values.
	*
	* @param current_threat_id the current_threat_id of this current_threat_values
	*/
	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_values.setCurrent_threat_id(current_threat_id);
	}

	/**
	* Returns the whvalues_id of this current_threat_values.
	*
	* @return the whvalues_id of this current_threat_values
	*/
	public long getWhvalues_id() {
		return _current_threat_values.getWhvalues_id();
	}

	/**
	* Sets the whvalues_id of this current_threat_values.
	*
	* @param whvalues_id the whvalues_id of this current_threat_values
	*/
	public void setWhvalues_id(long whvalues_id) {
		_current_threat_values.setWhvalues_id(whvalues_id);
	}

	/**
	* Returns the is_biodiv_whval of this current_threat_values.
	*
	* @return the is_biodiv_whval of this current_threat_values
	*/
	public boolean getIs_biodiv_whval() {
		return _current_threat_values.getIs_biodiv_whval();
	}

	/**
	* Returns <code>true</code> if this current_threat_values is is_biodiv_whval.
	*
	* @return <code>true</code> if this current_threat_values is is_biodiv_whval; <code>false</code> otherwise
	*/
	public boolean isIs_biodiv_whval() {
		return _current_threat_values.isIs_biodiv_whval();
	}

	/**
	* Sets whether this current_threat_values is is_biodiv_whval.
	*
	* @param is_biodiv_whval the is_biodiv_whval of this current_threat_values
	*/
	public void setIs_biodiv_whval(boolean is_biodiv_whval) {
		_current_threat_values.setIs_biodiv_whval(is_biodiv_whval);
	}

	public boolean isNew() {
		return _current_threat_values.isNew();
	}

	public void setNew(boolean n) {
		_current_threat_values.setNew(n);
	}

	public boolean isCachedModel() {
		return _current_threat_values.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_current_threat_values.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _current_threat_values.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _current_threat_values.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_current_threat_values.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _current_threat_values.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_current_threat_values.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new current_threat_valuesWrapper((current_threat_values)_current_threat_values.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values) {
		return _current_threat_values.compareTo(current_threat_values);
	}

	@Override
	public int hashCode() {
		return _current_threat_values.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.current_threat_values> toCacheModel() {
		return _current_threat_values.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.current_threat_values toEscapedModel() {
		return new current_threat_valuesWrapper(_current_threat_values.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _current_threat_values.toString();
	}

	public java.lang.String toXmlString() {
		return _current_threat_values.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_current_threat_values.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public current_threat_values getWrappedcurrent_threat_values() {
		return _current_threat_values;
	}

	public current_threat_values getWrappedModel() {
		return _current_threat_values;
	}

	public void resetOriginalValues() {
		_current_threat_values.resetOriginalValues();
	}

	private current_threat_values _current_threat_values;
}