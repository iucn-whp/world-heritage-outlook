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
 * This class is a wrapper for {@link potential_threat_values}.
 * </p>
 *
 * @author    alok.sen
 * @see       potential_threat_values
 * @generated
 */
public class potential_threat_valuesWrapper implements potential_threat_values,
	ModelWrapper<potential_threat_values> {
	public potential_threat_valuesWrapper(
		potential_threat_values potential_threat_values) {
		_potential_threat_values = potential_threat_values;
	}

	public Class<?> getModelClass() {
		return potential_threat_values.class;
	}

	public String getModelClassName() {
		return potential_threat_values.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("potential_threat_values_id",
			getPotential_threat_values_id());
		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long potential_threat_values_id = (Long)attributes.get(
				"potential_threat_values_id");

		if (potential_threat_values_id != null) {
			setPotential_threat_values_id(potential_threat_values_id);
		}

		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
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
	* Returns the primary key of this potential_threat_values.
	*
	* @return the primary key of this potential_threat_values
	*/
	public long getPrimaryKey() {
		return _potential_threat_values.getPrimaryKey();
	}

	/**
	* Sets the primary key of this potential_threat_values.
	*
	* @param primaryKey the primary key of this potential_threat_values
	*/
	public void setPrimaryKey(long primaryKey) {
		_potential_threat_values.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the potential_threat_values_id of this potential_threat_values.
	*
	* @return the potential_threat_values_id of this potential_threat_values
	*/
	public long getPotential_threat_values_id() {
		return _potential_threat_values.getPotential_threat_values_id();
	}

	/**
	* Sets the potential_threat_values_id of this potential_threat_values.
	*
	* @param potential_threat_values_id the potential_threat_values_id of this potential_threat_values
	*/
	public void setPotential_threat_values_id(long potential_threat_values_id) {
		_potential_threat_values.setPotential_threat_values_id(potential_threat_values_id);
	}

	/**
	* Returns the potential_threat_id of this potential_threat_values.
	*
	* @return the potential_threat_id of this potential_threat_values
	*/
	public long getPotential_threat_id() {
		return _potential_threat_values.getPotential_threat_id();
	}

	/**
	* Sets the potential_threat_id of this potential_threat_values.
	*
	* @param potential_threat_id the potential_threat_id of this potential_threat_values
	*/
	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_values.setPotential_threat_id(potential_threat_id);
	}

	/**
	* Returns the whvalues_id of this potential_threat_values.
	*
	* @return the whvalues_id of this potential_threat_values
	*/
	public long getWhvalues_id() {
		return _potential_threat_values.getWhvalues_id();
	}

	/**
	* Sets the whvalues_id of this potential_threat_values.
	*
	* @param whvalues_id the whvalues_id of this potential_threat_values
	*/
	public void setWhvalues_id(long whvalues_id) {
		_potential_threat_values.setWhvalues_id(whvalues_id);
	}

	/**
	* Returns the is_biodiv_whval of this potential_threat_values.
	*
	* @return the is_biodiv_whval of this potential_threat_values
	*/
	public boolean getIs_biodiv_whval() {
		return _potential_threat_values.getIs_biodiv_whval();
	}

	/**
	* Returns <code>true</code> if this potential_threat_values is is_biodiv_whval.
	*
	* @return <code>true</code> if this potential_threat_values is is_biodiv_whval; <code>false</code> otherwise
	*/
	public boolean isIs_biodiv_whval() {
		return _potential_threat_values.isIs_biodiv_whval();
	}

	/**
	* Sets whether this potential_threat_values is is_biodiv_whval.
	*
	* @param is_biodiv_whval the is_biodiv_whval of this potential_threat_values
	*/
	public void setIs_biodiv_whval(boolean is_biodiv_whval) {
		_potential_threat_values.setIs_biodiv_whval(is_biodiv_whval);
	}

	public boolean isNew() {
		return _potential_threat_values.isNew();
	}

	public void setNew(boolean n) {
		_potential_threat_values.setNew(n);
	}

	public boolean isCachedModel() {
		return _potential_threat_values.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_potential_threat_values.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _potential_threat_values.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _potential_threat_values.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_potential_threat_values.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _potential_threat_values.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_potential_threat_values.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new potential_threat_valuesWrapper((potential_threat_values)_potential_threat_values.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.potential_threat_values potential_threat_values) {
		return _potential_threat_values.compareTo(potential_threat_values);
	}

	@Override
	public int hashCode() {
		return _potential_threat_values.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.potential_threat_values> toCacheModel() {
		return _potential_threat_values.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.potential_threat_values toEscapedModel() {
		return new potential_threat_valuesWrapper(_potential_threat_values.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _potential_threat_values.toString();
	}

	public java.lang.String toXmlString() {
		return _potential_threat_values.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_potential_threat_values.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public potential_threat_values getWrappedpotential_threat_values() {
		return _potential_threat_values;
	}

	public potential_threat_values getWrappedModel() {
		return _potential_threat_values;
	}

	public void resetOriginalValues() {
		_potential_threat_values.resetOriginalValues();
	}

	private potential_threat_values _potential_threat_values;
}