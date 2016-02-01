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
 * This class is a wrapper for {@link trend_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       trend_lkp
 * @generated
 */
public class trend_lkpWrapper implements trend_lkp, ModelWrapper<trend_lkp> {
	public trend_lkpWrapper(trend_lkp trend_lkp) {
		_trend_lkp = trend_lkp;
	}

	public Class<?> getModelClass() {
		return trend_lkp.class;
	}

	public String getModelClassName() {
		return trend_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trend_id", getTrend_id());
		attributes.put("trend", getTrend());

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
	}

	/**
	* Returns the primary key of this trend_lkp.
	*
	* @return the primary key of this trend_lkp
	*/
	public long getPrimaryKey() {
		return _trend_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this trend_lkp.
	*
	* @param primaryKey the primary key of this trend_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_trend_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the trend_id of this trend_lkp.
	*
	* @return the trend_id of this trend_lkp
	*/
	public long getTrend_id() {
		return _trend_lkp.getTrend_id();
	}

	/**
	* Sets the trend_id of this trend_lkp.
	*
	* @param trend_id the trend_id of this trend_lkp
	*/
	public void setTrend_id(long trend_id) {
		_trend_lkp.setTrend_id(trend_id);
	}

	/**
	* Returns the trend of this trend_lkp.
	*
	* @return the trend of this trend_lkp
	*/
	public java.lang.String getTrend() {
		return _trend_lkp.getTrend();
	}

	/**
	* Sets the trend of this trend_lkp.
	*
	* @param trend the trend of this trend_lkp
	*/
	public void setTrend(java.lang.String trend) {
		_trend_lkp.setTrend(trend);
	}

	public boolean isNew() {
		return _trend_lkp.isNew();
	}

	public void setNew(boolean n) {
		_trend_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _trend_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_trend_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _trend_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _trend_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_trend_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _trend_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_trend_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new trend_lkpWrapper((trend_lkp)_trend_lkp.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.trend_lkp trend_lkp) {
		return _trend_lkp.compareTo(trend_lkp);
	}

	@Override
	public int hashCode() {
		return _trend_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.trend_lkp> toCacheModel() {
		return _trend_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.trend_lkp toEscapedModel() {
		return new trend_lkpWrapper(_trend_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _trend_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _trend_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_trend_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public trend_lkp getWrappedtrend_lkp() {
		return _trend_lkp;
	}

	public trend_lkp getWrappedModel() {
		return _trend_lkp;
	}

	public void resetOriginalValues() {
		_trend_lkp.resetOriginalValues();
	}

	private trend_lkp _trend_lkp;
}