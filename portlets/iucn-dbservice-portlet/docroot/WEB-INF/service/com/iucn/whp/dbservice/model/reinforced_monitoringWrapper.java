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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link reinforced_monitoring}.
 * </p>
 *
 * @author    alok.sen
 * @see       reinforced_monitoring
 * @generated
 */
public class reinforced_monitoringWrapper implements reinforced_monitoring,
	ModelWrapper<reinforced_monitoring> {
	public reinforced_monitoringWrapper(
		reinforced_monitoring reinforced_monitoring) {
		_reinforced_monitoring = reinforced_monitoring;
	}

	public Class<?> getModelClass() {
		return reinforced_monitoring.class;
	}

	public String getModelClassName() {
		return reinforced_monitoring.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_reinforced_monitoring_id",
			getWhp_sites_reinforced_monitoring_id());
		attributes.put("site_id", getSite_id());
		attributes.put("reinforced_date", getReinforced_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_reinforced_monitoring_id = (Long)attributes.get(
				"whp_sites_reinforced_monitoring_id");

		if (whp_sites_reinforced_monitoring_id != null) {
			setWhp_sites_reinforced_monitoring_id(whp_sites_reinforced_monitoring_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Date reinforced_date = (Date)attributes.get("reinforced_date");

		if (reinforced_date != null) {
			setReinforced_date(reinforced_date);
		}
	}

	/**
	* Returns the primary key of this reinforced_monitoring.
	*
	* @return the primary key of this reinforced_monitoring
	*/
	public long getPrimaryKey() {
		return _reinforced_monitoring.getPrimaryKey();
	}

	/**
	* Sets the primary key of this reinforced_monitoring.
	*
	* @param primaryKey the primary key of this reinforced_monitoring
	*/
	public void setPrimaryKey(long primaryKey) {
		_reinforced_monitoring.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_reinforced_monitoring_id of this reinforced_monitoring.
	*
	* @return the whp_sites_reinforced_monitoring_id of this reinforced_monitoring
	*/
	public long getWhp_sites_reinforced_monitoring_id() {
		return _reinforced_monitoring.getWhp_sites_reinforced_monitoring_id();
	}

	/**
	* Sets the whp_sites_reinforced_monitoring_id of this reinforced_monitoring.
	*
	* @param whp_sites_reinforced_monitoring_id the whp_sites_reinforced_monitoring_id of this reinforced_monitoring
	*/
	public void setWhp_sites_reinforced_monitoring_id(
		long whp_sites_reinforced_monitoring_id) {
		_reinforced_monitoring.setWhp_sites_reinforced_monitoring_id(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Returns the site_id of this reinforced_monitoring.
	*
	* @return the site_id of this reinforced_monitoring
	*/
	public long getSite_id() {
		return _reinforced_monitoring.getSite_id();
	}

	/**
	* Sets the site_id of this reinforced_monitoring.
	*
	* @param site_id the site_id of this reinforced_monitoring
	*/
	public void setSite_id(long site_id) {
		_reinforced_monitoring.setSite_id(site_id);
	}

	/**
	* Returns the reinforced_date of this reinforced_monitoring.
	*
	* @return the reinforced_date of this reinforced_monitoring
	*/
	public java.util.Date getReinforced_date() {
		return _reinforced_monitoring.getReinforced_date();
	}

	/**
	* Sets the reinforced_date of this reinforced_monitoring.
	*
	* @param reinforced_date the reinforced_date of this reinforced_monitoring
	*/
	public void setReinforced_date(java.util.Date reinforced_date) {
		_reinforced_monitoring.setReinforced_date(reinforced_date);
	}

	public boolean isNew() {
		return _reinforced_monitoring.isNew();
	}

	public void setNew(boolean n) {
		_reinforced_monitoring.setNew(n);
	}

	public boolean isCachedModel() {
		return _reinforced_monitoring.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_reinforced_monitoring.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _reinforced_monitoring.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _reinforced_monitoring.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_reinforced_monitoring.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _reinforced_monitoring.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_reinforced_monitoring.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new reinforced_monitoringWrapper((reinforced_monitoring)_reinforced_monitoring.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring) {
		return _reinforced_monitoring.compareTo(reinforced_monitoring);
	}

	@Override
	public int hashCode() {
		return _reinforced_monitoring.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.reinforced_monitoring> toCacheModel() {
		return _reinforced_monitoring.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.reinforced_monitoring toEscapedModel() {
		return new reinforced_monitoringWrapper(_reinforced_monitoring.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _reinforced_monitoring.toString();
	}

	public java.lang.String toXmlString() {
		return _reinforced_monitoring.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_reinforced_monitoring.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public reinforced_monitoring getWrappedreinforced_monitoring() {
		return _reinforced_monitoring;
	}

	public reinforced_monitoring getWrappedModel() {
		return _reinforced_monitoring;
	}

	public void resetOriginalValues() {
		_reinforced_monitoring.resetOriginalValues();
	}

	private reinforced_monitoring _reinforced_monitoring;
}