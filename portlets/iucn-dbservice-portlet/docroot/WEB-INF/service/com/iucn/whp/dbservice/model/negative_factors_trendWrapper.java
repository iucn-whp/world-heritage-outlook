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
 * This class is a wrapper for {@link negative_factors_trend}.
 * </p>
 *
 * @author    alok.sen
 * @see       negative_factors_trend
 * @generated
 */
public class negative_factors_trendWrapper implements negative_factors_trend,
	ModelWrapper<negative_factors_trend> {
	public negative_factors_trendWrapper(
		negative_factors_trend negative_factors_trend) {
		_negative_factors_trend = negative_factors_trend;
	}

	public Class<?> getModelClass() {
		return negative_factors_trend.class;
	}

	public String getModelClassName() {
		return negative_factors_trend.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trend_id", getTrend_id());
		attributes.put("trend", getTrend());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long trend_id = (Long)attributes.get("trend_id");

		if (trend_id != null) {
			setTrend_id(trend_id);
		}

		String trend = (String)attributes.get("trend");

		if (trend != null) {
			setTrend(trend);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this negative_factors_trend.
	*
	* @return the primary key of this negative_factors_trend
	*/
	public long getPrimaryKey() {
		return _negative_factors_trend.getPrimaryKey();
	}

	/**
	* Sets the primary key of this negative_factors_trend.
	*
	* @param primaryKey the primary key of this negative_factors_trend
	*/
	public void setPrimaryKey(long primaryKey) {
		_negative_factors_trend.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the trend_id of this negative_factors_trend.
	*
	* @return the trend_id of this negative_factors_trend
	*/
	public long getTrend_id() {
		return _negative_factors_trend.getTrend_id();
	}

	/**
	* Sets the trend_id of this negative_factors_trend.
	*
	* @param trend_id the trend_id of this negative_factors_trend
	*/
	public void setTrend_id(long trend_id) {
		_negative_factors_trend.setTrend_id(trend_id);
	}

	/**
	* Returns the trend of this negative_factors_trend.
	*
	* @return the trend of this negative_factors_trend
	*/
	public java.lang.String getTrend() {
		return _negative_factors_trend.getTrend();
	}

	/**
	* Sets the trend of this negative_factors_trend.
	*
	* @param trend the trend of this negative_factors_trend
	*/
	public void setTrend(java.lang.String trend) {
		_negative_factors_trend.setTrend(trend);
	}

	/**
	* Returns the description of this negative_factors_trend.
	*
	* @return the description of this negative_factors_trend
	*/
	public java.lang.String getDescription() {
		return _negative_factors_trend.getDescription();
	}

	/**
	* Sets the description of this negative_factors_trend.
	*
	* @param description the description of this negative_factors_trend
	*/
	public void setDescription(java.lang.String description) {
		_negative_factors_trend.setDescription(description);
	}

	public boolean isNew() {
		return _negative_factors_trend.isNew();
	}

	public void setNew(boolean n) {
		_negative_factors_trend.setNew(n);
	}

	public boolean isCachedModel() {
		return _negative_factors_trend.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_negative_factors_trend.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _negative_factors_trend.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _negative_factors_trend.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_negative_factors_trend.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _negative_factors_trend.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_negative_factors_trend.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new negative_factors_trendWrapper((negative_factors_trend)_negative_factors_trend.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.negative_factors_trend negative_factors_trend) {
		return _negative_factors_trend.compareTo(negative_factors_trend);
	}

	@Override
	public int hashCode() {
		return _negative_factors_trend.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.negative_factors_trend> toCacheModel() {
		return _negative_factors_trend.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.negative_factors_trend toEscapedModel() {
		return new negative_factors_trendWrapper(_negative_factors_trend.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _negative_factors_trend.toString();
	}

	public java.lang.String toXmlString() {
		return _negative_factors_trend.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_negative_factors_trend.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public negative_factors_trend getWrappednegative_factors_trend() {
		return _negative_factors_trend;
	}

	public negative_factors_trend getWrappedModel() {
		return _negative_factors_trend;
	}

	public void resetOriginalValues() {
		_negative_factors_trend.resetOriginalValues();
	}

	private negative_factors_trend _negative_factors_trend;
}