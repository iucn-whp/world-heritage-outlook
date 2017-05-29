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
 * This class is a wrapper for {@link mission_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       mission_lkp
 * @generated
 */
public class mission_lkpWrapper implements mission_lkp,
	ModelWrapper<mission_lkp> {
	public mission_lkpWrapper(mission_lkp mission_lkp) {
		_mission_lkp = mission_lkp;
	}

	public Class<?> getModelClass() {
		return mission_lkp.class;
	}

	public String getModelClassName() {
		return mission_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mission_id", getMission_id());
		attributes.put("mission_type", getMission_type());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer mission_id = (Integer)attributes.get("mission_id");

		if (mission_id != null) {
			setMission_id(mission_id);
		}

		String mission_type = (String)attributes.get("mission_type");

		if (mission_type != null) {
			setMission_type(mission_type);
		}
	}

	/**
	* Returns the primary key of this mission_lkp.
	*
	* @return the primary key of this mission_lkp
	*/
	public int getPrimaryKey() {
		return _mission_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mission_lkp.
	*
	* @param primaryKey the primary key of this mission_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_mission_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the mission_id of this mission_lkp.
	*
	* @return the mission_id of this mission_lkp
	*/
	public int getMission_id() {
		return _mission_lkp.getMission_id();
	}

	/**
	* Sets the mission_id of this mission_lkp.
	*
	* @param mission_id the mission_id of this mission_lkp
	*/
	public void setMission_id(int mission_id) {
		_mission_lkp.setMission_id(mission_id);
	}

	/**
	* Returns the mission_type of this mission_lkp.
	*
	* @return the mission_type of this mission_lkp
	*/
	public java.lang.String getMission_type() {
		return _mission_lkp.getMission_type();
	}

	/**
	* Sets the mission_type of this mission_lkp.
	*
	* @param mission_type the mission_type of this mission_lkp
	*/
	public void setMission_type(java.lang.String mission_type) {
		_mission_lkp.setMission_type(mission_type);
	}

	public boolean isNew() {
		return _mission_lkp.isNew();
	}

	public void setNew(boolean n) {
		_mission_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _mission_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_mission_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _mission_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _mission_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mission_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mission_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mission_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new mission_lkpWrapper((mission_lkp)_mission_lkp.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.mission_lkp mission_lkp) {
		return _mission_lkp.compareTo(mission_lkp);
	}

	@Override
	public int hashCode() {
		return _mission_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.mission_lkp> toCacheModel() {
		return _mission_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.mission_lkp toEscapedModel() {
		return new mission_lkpWrapper(_mission_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mission_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _mission_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mission_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public mission_lkp getWrappedmission_lkp() {
		return _mission_lkp;
	}

	public mission_lkp getWrappedModel() {
		return _mission_lkp;
	}

	public void resetOriginalValues() {
		_mission_lkp.resetOriginalValues();
	}

	private mission_lkp _mission_lkp;
}