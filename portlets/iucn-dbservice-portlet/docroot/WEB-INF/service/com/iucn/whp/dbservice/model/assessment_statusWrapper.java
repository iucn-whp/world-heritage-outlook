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
 * This class is a wrapper for {@link assessment_status}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_status
 * @generated
 */
public class assessment_statusWrapper implements assessment_status,
	ModelWrapper<assessment_status> {
	public assessment_statusWrapper(assessment_status assessment_status) {
		_assessment_status = assessment_status;
	}

	public Class<?> getModelClass() {
		return assessment_status.class;
	}

	public String getModelClassName() {
		return assessment_status.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusid", getStatusid());
		attributes.put("status", getStatus());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusid = (Long)attributes.get("statusid");

		if (statusid != null) {
			setStatusid(statusid);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this assessment_status.
	*
	* @return the primary key of this assessment_status
	*/
	public long getPrimaryKey() {
		return _assessment_status.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_status.
	*
	* @param primaryKey the primary key of this assessment_status
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_status.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the statusid of this assessment_status.
	*
	* @return the statusid of this assessment_status
	*/
	public long getStatusid() {
		return _assessment_status.getStatusid();
	}

	/**
	* Sets the statusid of this assessment_status.
	*
	* @param statusid the statusid of this assessment_status
	*/
	public void setStatusid(long statusid) {
		_assessment_status.setStatusid(statusid);
	}

	/**
	* Returns the status of this assessment_status.
	*
	* @return the status of this assessment_status
	*/
	public java.lang.String getStatus() {
		return _assessment_status.getStatus();
	}

	/**
	* Sets the status of this assessment_status.
	*
	* @param status the status of this assessment_status
	*/
	public void setStatus(java.lang.String status) {
		_assessment_status.setStatus(status);
	}

	public boolean isNew() {
		return _assessment_status.isNew();
	}

	public void setNew(boolean n) {
		_assessment_status.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_status.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_status.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_status.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_status.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_status.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_status.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_status.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_statusWrapper((assessment_status)_assessment_status.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_status assessment_status) {
		return _assessment_status.compareTo(assessment_status);
	}

	@Override
	public int hashCode() {
		return _assessment_status.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_status> toCacheModel() {
		return _assessment_status.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_status toEscapedModel() {
		return new assessment_statusWrapper(_assessment_status.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_status.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_status.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_status.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_status getWrappedassessment_status() {
		return _assessment_status;
	}

	public assessment_status getWrappedModel() {
		return _assessment_status;
	}

	public void resetOriginalValues() {
		_assessment_status.resetOriginalValues();
	}

	private assessment_status _assessment_status;
}