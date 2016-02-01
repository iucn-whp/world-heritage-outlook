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
 * This class is a wrapper for {@link state_trend_whvalues}.
 * </p>
 *
 * @author    alok.sen
 * @see       state_trend_whvalues
 * @generated
 */
public class state_trend_whvaluesWrapper implements state_trend_whvalues,
	ModelWrapper<state_trend_whvalues> {
	public state_trend_whvaluesWrapper(
		state_trend_whvalues state_trend_whvalues) {
		_state_trend_whvalues = state_trend_whvalues;
	}

	public Class<?> getModelClass() {
		return state_trend_whvalues.class;
	}

	public String getModelClassName() {
		return state_trend_whvalues.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_trend_whval_id", getState_trend_whval_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("state_id", getState_id());
		attributes.put("trend_id", getTrend_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_trend_whval_id = (Long)attributes.get("state_trend_whval_id");

		if (state_trend_whval_id != null) {
			setState_trend_whval_id(state_trend_whval_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}
	}

	/**
	* Returns the primary key of this state_trend_whvalues.
	*
	* @return the primary key of this state_trend_whvalues
	*/
	public long getPrimaryKey() {
		return _state_trend_whvalues.getPrimaryKey();
	}

	/**
	* Sets the primary key of this state_trend_whvalues.
	*
	* @param primaryKey the primary key of this state_trend_whvalues
	*/
	public void setPrimaryKey(long primaryKey) {
		_state_trend_whvalues.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the state_trend_whval_id of this state_trend_whvalues.
	*
	* @return the state_trend_whval_id of this state_trend_whvalues
	*/
	public long getState_trend_whval_id() {
		return _state_trend_whvalues.getState_trend_whval_id();
	}

	/**
	* Sets the state_trend_whval_id of this state_trend_whvalues.
	*
	* @param state_trend_whval_id the state_trend_whval_id of this state_trend_whvalues
	*/
	public void setState_trend_whval_id(long state_trend_whval_id) {
		_state_trend_whvalues.setState_trend_whval_id(state_trend_whval_id);
	}

	/**
	* Returns the assessment_version_id of this state_trend_whvalues.
	*
	* @return the assessment_version_id of this state_trend_whvalues
	*/
	public long getAssessment_version_id() {
		return _state_trend_whvalues.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this state_trend_whvalues.
	*
	* @param assessment_version_id the assessment_version_id of this state_trend_whvalues
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_state_trend_whvalues.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the justification of this state_trend_whvalues.
	*
	* @return the justification of this state_trend_whvalues
	*/
	public java.lang.String getJustification() {
		return _state_trend_whvalues.getJustification();
	}

	/**
	* Sets the justification of this state_trend_whvalues.
	*
	* @param justification the justification of this state_trend_whvalues
	*/
	public void setJustification(java.lang.String justification) {
		_state_trend_whvalues.setJustification(justification);
	}

	/**
	* Returns the state_id of this state_trend_whvalues.
	*
	* @return the state_id of this state_trend_whvalues
	*/
	public long getState_id() {
		return _state_trend_whvalues.getState_id();
	}

	/**
	* Sets the state_id of this state_trend_whvalues.
	*
	* @param state_id the state_id of this state_trend_whvalues
	*/
	public void setState_id(long state_id) {
		_state_trend_whvalues.setState_id(state_id);
	}

	/**
	* Returns the trend_id of this state_trend_whvalues.
	*
	* @return the trend_id of this state_trend_whvalues
	*/
	public long getTrend_id() {
		return _state_trend_whvalues.getTrend_id();
	}

	/**
	* Sets the trend_id of this state_trend_whvalues.
	*
	* @param trend_id the trend_id of this state_trend_whvalues
	*/
	public void setTrend_id(long trend_id) {
		_state_trend_whvalues.setTrend_id(trend_id);
	}

	public boolean isNew() {
		return _state_trend_whvalues.isNew();
	}

	public void setNew(boolean n) {
		_state_trend_whvalues.setNew(n);
	}

	public boolean isCachedModel() {
		return _state_trend_whvalues.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_state_trend_whvalues.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _state_trend_whvalues.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _state_trend_whvalues.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_state_trend_whvalues.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _state_trend_whvalues.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_state_trend_whvalues.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new state_trend_whvaluesWrapper((state_trend_whvalues)_state_trend_whvalues.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.state_trend_whvalues state_trend_whvalues) {
		return _state_trend_whvalues.compareTo(state_trend_whvalues);
	}

	@Override
	public int hashCode() {
		return _state_trend_whvalues.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.state_trend_whvalues> toCacheModel() {
		return _state_trend_whvalues.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.state_trend_whvalues toEscapedModel() {
		return new state_trend_whvaluesWrapper(_state_trend_whvalues.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _state_trend_whvalues.toString();
	}

	public java.lang.String toXmlString() {
		return _state_trend_whvalues.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_state_trend_whvalues.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public state_trend_whvalues getWrappedstate_trend_whvalues() {
		return _state_trend_whvalues;
	}

	public state_trend_whvalues getWrappedModel() {
		return _state_trend_whvalues;
	}

	public void resetOriginalValues() {
		_state_trend_whvalues.resetOriginalValues();
	}

	private state_trend_whvalues _state_trend_whvalues;
}