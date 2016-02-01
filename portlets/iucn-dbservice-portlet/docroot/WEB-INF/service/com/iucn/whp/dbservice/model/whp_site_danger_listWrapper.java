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
 * This class is a wrapper for {@link whp_site_danger_list}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_site_danger_list
 * @generated
 */
public class whp_site_danger_listWrapper implements whp_site_danger_list,
	ModelWrapper<whp_site_danger_list> {
	public whp_site_danger_listWrapper(
		whp_site_danger_list whp_site_danger_list) {
		_whp_site_danger_list = whp_site_danger_list;
	}

	public Class<?> getModelClass() {
		return whp_site_danger_list.class;
	}

	public String getModelClassName() {
		return whp_site_danger_list.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_site_danger_list_id", getWhp_site_danger_list_id());
		attributes.put("site_id", getSite_id());
		attributes.put("status_id", getStatus_id());
		attributes.put("year", getYear());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_site_danger_list_id = (Long)attributes.get(
				"whp_site_danger_list_id");

		if (whp_site_danger_list_id != null) {
			setWhp_site_danger_list_id(whp_site_danger_list_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer status_id = (Integer)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Date year = (Date)attributes.get("year");

		if (year != null) {
			setYear(year);
		}
	}

	/**
	* Returns the primary key of this whp_site_danger_list.
	*
	* @return the primary key of this whp_site_danger_list
	*/
	public long getPrimaryKey() {
		return _whp_site_danger_list.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_site_danger_list.
	*
	* @param primaryKey the primary key of this whp_site_danger_list
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_site_danger_list.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_site_danger_list_id of this whp_site_danger_list.
	*
	* @return the whp_site_danger_list_id of this whp_site_danger_list
	*/
	public long getWhp_site_danger_list_id() {
		return _whp_site_danger_list.getWhp_site_danger_list_id();
	}

	/**
	* Sets the whp_site_danger_list_id of this whp_site_danger_list.
	*
	* @param whp_site_danger_list_id the whp_site_danger_list_id of this whp_site_danger_list
	*/
	public void setWhp_site_danger_list_id(long whp_site_danger_list_id) {
		_whp_site_danger_list.setWhp_site_danger_list_id(whp_site_danger_list_id);
	}

	/**
	* Returns the site_id of this whp_site_danger_list.
	*
	* @return the site_id of this whp_site_danger_list
	*/
	public long getSite_id() {
		return _whp_site_danger_list.getSite_id();
	}

	/**
	* Sets the site_id of this whp_site_danger_list.
	*
	* @param site_id the site_id of this whp_site_danger_list
	*/
	public void setSite_id(long site_id) {
		_whp_site_danger_list.setSite_id(site_id);
	}

	/**
	* Returns the status_id of this whp_site_danger_list.
	*
	* @return the status_id of this whp_site_danger_list
	*/
	public int getStatus_id() {
		return _whp_site_danger_list.getStatus_id();
	}

	/**
	* Sets the status_id of this whp_site_danger_list.
	*
	* @param status_id the status_id of this whp_site_danger_list
	*/
	public void setStatus_id(int status_id) {
		_whp_site_danger_list.setStatus_id(status_id);
	}

	/**
	* Returns the year of this whp_site_danger_list.
	*
	* @return the year of this whp_site_danger_list
	*/
	public java.util.Date getYear() {
		return _whp_site_danger_list.getYear();
	}

	/**
	* Sets the year of this whp_site_danger_list.
	*
	* @param year the year of this whp_site_danger_list
	*/
	public void setYear(java.util.Date year) {
		_whp_site_danger_list.setYear(year);
	}

	public boolean isNew() {
		return _whp_site_danger_list.isNew();
	}

	public void setNew(boolean n) {
		_whp_site_danger_list.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_site_danger_list.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_site_danger_list.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_site_danger_list.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_site_danger_list.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_site_danger_list.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_site_danger_list.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_site_danger_list.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_site_danger_listWrapper((whp_site_danger_list)_whp_site_danger_list.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list) {
		return _whp_site_danger_list.compareTo(whp_site_danger_list);
	}

	@Override
	public int hashCode() {
		return _whp_site_danger_list.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_site_danger_list> toCacheModel() {
		return _whp_site_danger_list.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_site_danger_list toEscapedModel() {
		return new whp_site_danger_listWrapper(_whp_site_danger_list.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_site_danger_list.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_site_danger_list.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_site_danger_list.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_site_danger_list getWrappedwhp_site_danger_list() {
		return _whp_site_danger_list;
	}

	public whp_site_danger_list getWrappedModel() {
		return _whp_site_danger_list;
	}

	public void resetOriginalValues() {
		_whp_site_danger_list.resetOriginalValues();
	}

	private whp_site_danger_list _whp_site_danger_list;
}