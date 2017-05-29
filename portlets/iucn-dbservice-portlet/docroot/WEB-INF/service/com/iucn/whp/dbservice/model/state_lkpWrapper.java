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
 * This class is a wrapper for {@link state_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       state_lkp
 * @generated
 */
public class state_lkpWrapper implements state_lkp, ModelWrapper<state_lkp> {
	public state_lkpWrapper(state_lkp state_lkp) {
		_state_lkp = state_lkp;
	}

	public Class<?> getModelClass() {
		return state_lkp.class;
	}

	public String getModelClassName() {
		return state_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_id", getState_id());
		attributes.put("state", getState());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}
	}

	/**
	* Returns the primary key of this state_lkp.
	*
	* @return the primary key of this state_lkp
	*/
	public long getPrimaryKey() {
		return _state_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this state_lkp.
	*
	* @param primaryKey the primary key of this state_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_state_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the state_id of this state_lkp.
	*
	* @return the state_id of this state_lkp
	*/
	public long getState_id() {
		return _state_lkp.getState_id();
	}

	/**
	* Sets the state_id of this state_lkp.
	*
	* @param state_id the state_id of this state_lkp
	*/
	public void setState_id(long state_id) {
		_state_lkp.setState_id(state_id);
	}

	/**
	* Returns the state of this state_lkp.
	*
	* @return the state of this state_lkp
	*/
	public java.lang.String getState() {
		return _state_lkp.getState();
	}

	/**
	* Sets the state of this state_lkp.
	*
	* @param state the state of this state_lkp
	*/
	public void setState(java.lang.String state) {
		_state_lkp.setState(state);
	}

	public boolean isNew() {
		return _state_lkp.isNew();
	}

	public void setNew(boolean n) {
		_state_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _state_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_state_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _state_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _state_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_state_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _state_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_state_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new state_lkpWrapper((state_lkp)_state_lkp.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.state_lkp state_lkp) {
		return _state_lkp.compareTo(state_lkp);
	}

	@Override
	public int hashCode() {
		return _state_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.state_lkp> toCacheModel() {
		return _state_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.state_lkp toEscapedModel() {
		return new state_lkpWrapper(_state_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _state_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _state_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_state_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public state_lkp getWrappedstate_lkp() {
		return _state_lkp;
	}

	public state_lkp getWrappedModel() {
		return _state_lkp;
	}

	public void resetOriginalValues() {
		_state_lkp.resetOriginalValues();
	}

	private state_lkp _state_lkp;
}