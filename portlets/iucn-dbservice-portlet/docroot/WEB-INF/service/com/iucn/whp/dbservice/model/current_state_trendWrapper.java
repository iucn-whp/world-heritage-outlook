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
 * This class is a wrapper for {@link current_state_trend}.
 * </p>
 *
 * @author    alok.sen
 * @see       current_state_trend
 * @generated
 */
public class current_state_trendWrapper implements current_state_trend,
	ModelWrapper<current_state_trend> {
	public current_state_trendWrapper(current_state_trend current_state_trend) {
		_current_state_trend = current_state_trend;
	}

	public Class<?> getModelClass() {
		return current_state_trend.class;
	}

	public String getModelClassName() {
		return current_state_trend.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_trend_id", getState_trend_id());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("trend_id", getTrend_id());
		attributes.put("state_id", getState_id());
		attributes.put("is_biodiv_whval", getIs_biodiv_whval());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_trend_id = (Long)attributes.get("state_trend_id");

		if (state_trend_id != null) {
			setState_trend_id(state_trend_id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
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

		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Boolean is_biodiv_whval = (Boolean)attributes.get("is_biodiv_whval");

		if (is_biodiv_whval != null) {
			setIs_biodiv_whval(is_biodiv_whval);
		}
	}

	/**
	* Returns the primary key of this current_state_trend.
	*
	* @return the primary key of this current_state_trend
	*/
	public long getPrimaryKey() {
		return _current_state_trend.getPrimaryKey();
	}

	/**
	* Sets the primary key of this current_state_trend.
	*
	* @param primaryKey the primary key of this current_state_trend
	*/
	public void setPrimaryKey(long primaryKey) {
		_current_state_trend.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the state_trend_id of this current_state_trend.
	*
	* @return the state_trend_id of this current_state_trend
	*/
	public long getState_trend_id() {
		return _current_state_trend.getState_trend_id();
	}

	/**
	* Sets the state_trend_id of this current_state_trend.
	*
	* @param state_trend_id the state_trend_id of this current_state_trend
	*/
	public void setState_trend_id(long state_trend_id) {
		_current_state_trend.setState_trend_id(state_trend_id);
	}

	/**
	* Returns the vn of this current_state_trend.
	*
	* @return the vn of this current_state_trend
	*/
	public long getVn() {
		return _current_state_trend.getVn();
	}

	/**
	* Sets the vn of this current_state_trend.
	*
	* @param vn the vn of this current_state_trend
	*/
	public void setVn(long vn) {
		_current_state_trend.setVn(vn);
	}

	/**
	* Returns the assessment_version_id of this current_state_trend.
	*
	* @return the assessment_version_id of this current_state_trend
	*/
	public long getAssessment_version_id() {
		return _current_state_trend.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this current_state_trend.
	*
	* @param assessment_version_id the assessment_version_id of this current_state_trend
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_current_state_trend.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the justification of this current_state_trend.
	*
	* @return the justification of this current_state_trend
	*/
	public java.lang.String getJustification() {
		return _current_state_trend.getJustification();
	}

	/**
	* Sets the justification of this current_state_trend.
	*
	* @param justification the justification of this current_state_trend
	*/
	public void setJustification(java.lang.String justification) {
		_current_state_trend.setJustification(justification);
	}

	/**
	* Returns the trend_id of this current_state_trend.
	*
	* @return the trend_id of this current_state_trend
	*/
	public long getTrend_id() {
		return _current_state_trend.getTrend_id();
	}

	/**
	* Sets the trend_id of this current_state_trend.
	*
	* @param trend_id the trend_id of this current_state_trend
	*/
	public void setTrend_id(long trend_id) {
		_current_state_trend.setTrend_id(trend_id);
	}

	/**
	* Returns the state_id of this current_state_trend.
	*
	* @return the state_id of this current_state_trend
	*/
	public long getState_id() {
		return _current_state_trend.getState_id();
	}

	/**
	* Sets the state_id of this current_state_trend.
	*
	* @param state_id the state_id of this current_state_trend
	*/
	public void setState_id(long state_id) {
		_current_state_trend.setState_id(state_id);
	}

	/**
	* Returns the is_biodiv_whval of this current_state_trend.
	*
	* @return the is_biodiv_whval of this current_state_trend
	*/
	public boolean getIs_biodiv_whval() {
		return _current_state_trend.getIs_biodiv_whval();
	}

	/**
	* Returns <code>true</code> if this current_state_trend is is_biodiv_whval.
	*
	* @return <code>true</code> if this current_state_trend is is_biodiv_whval; <code>false</code> otherwise
	*/
	public boolean isIs_biodiv_whval() {
		return _current_state_trend.isIs_biodiv_whval();
	}

	/**
	* Sets whether this current_state_trend is is_biodiv_whval.
	*
	* @param is_biodiv_whval the is_biodiv_whval of this current_state_trend
	*/
	public void setIs_biodiv_whval(boolean is_biodiv_whval) {
		_current_state_trend.setIs_biodiv_whval(is_biodiv_whval);
	}

	public boolean isNew() {
		return _current_state_trend.isNew();
	}

	public void setNew(boolean n) {
		_current_state_trend.setNew(n);
	}

	public boolean isCachedModel() {
		return _current_state_trend.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_current_state_trend.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _current_state_trend.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _current_state_trend.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_current_state_trend.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _current_state_trend.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_current_state_trend.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new current_state_trendWrapper((current_state_trend)_current_state_trend.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.current_state_trend current_state_trend) {
		return _current_state_trend.compareTo(current_state_trend);
	}

	@Override
	public int hashCode() {
		return _current_state_trend.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.current_state_trend> toCacheModel() {
		return _current_state_trend.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.current_state_trend toEscapedModel() {
		return new current_state_trendWrapper(_current_state_trend.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _current_state_trend.toString();
	}

	public java.lang.String toXmlString() {
		return _current_state_trend.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_current_state_trend.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public current_state_trend getWrappedcurrent_state_trend() {
		return _current_state_trend;
	}

	public current_state_trend getWrappedModel() {
		return _current_state_trend;
	}

	public void resetOriginalValues() {
		_current_state_trend.resetOriginalValues();
	}

	private current_state_trend _current_state_trend;
}