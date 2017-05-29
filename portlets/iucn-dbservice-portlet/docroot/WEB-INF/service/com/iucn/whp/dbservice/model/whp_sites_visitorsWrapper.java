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
 * This class is a wrapper for {@link whp_sites_visitors}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_visitors
 * @generated
 */
public class whp_sites_visitorsWrapper implements whp_sites_visitors,
	ModelWrapper<whp_sites_visitors> {
	public whp_sites_visitorsWrapper(whp_sites_visitors whp_sites_visitors) {
		_whp_sites_visitors = whp_sites_visitors;
	}

	public Class<?> getModelClass() {
		return whp_sites_visitors.class;
	}

	public String getModelClassName() {
		return whp_sites_visitors.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_visitors_id", getWhp_sites_visitors_id());
		attributes.put("site_id", getSite_id());
		attributes.put("visitor_count", getVisitor_count());
		attributes.put("record_date", getRecord_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_visitors_id = (Long)attributes.get(
				"whp_sites_visitors_id");

		if (whp_sites_visitors_id != null) {
			setWhp_sites_visitors_id(whp_sites_visitors_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long visitor_count = (Long)attributes.get("visitor_count");

		if (visitor_count != null) {
			setVisitor_count(visitor_count);
		}

		Date record_date = (Date)attributes.get("record_date");

		if (record_date != null) {
			setRecord_date(record_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_visitors.
	*
	* @return the primary key of this whp_sites_visitors
	*/
	public long getPrimaryKey() {
		return _whp_sites_visitors.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_visitors.
	*
	* @param primaryKey the primary key of this whp_sites_visitors
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_visitors.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_visitors_id of this whp_sites_visitors.
	*
	* @return the whp_sites_visitors_id of this whp_sites_visitors
	*/
	public long getWhp_sites_visitors_id() {
		return _whp_sites_visitors.getWhp_sites_visitors_id();
	}

	/**
	* Sets the whp_sites_visitors_id of this whp_sites_visitors.
	*
	* @param whp_sites_visitors_id the whp_sites_visitors_id of this whp_sites_visitors
	*/
	public void setWhp_sites_visitors_id(long whp_sites_visitors_id) {
		_whp_sites_visitors.setWhp_sites_visitors_id(whp_sites_visitors_id);
	}

	/**
	* Returns the site_id of this whp_sites_visitors.
	*
	* @return the site_id of this whp_sites_visitors
	*/
	public long getSite_id() {
		return _whp_sites_visitors.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_visitors.
	*
	* @param site_id the site_id of this whp_sites_visitors
	*/
	public void setSite_id(long site_id) {
		_whp_sites_visitors.setSite_id(site_id);
	}

	/**
	* Returns the visitor_count of this whp_sites_visitors.
	*
	* @return the visitor_count of this whp_sites_visitors
	*/
	public long getVisitor_count() {
		return _whp_sites_visitors.getVisitor_count();
	}

	/**
	* Sets the visitor_count of this whp_sites_visitors.
	*
	* @param visitor_count the visitor_count of this whp_sites_visitors
	*/
	public void setVisitor_count(long visitor_count) {
		_whp_sites_visitors.setVisitor_count(visitor_count);
	}

	/**
	* Returns the record_date of this whp_sites_visitors.
	*
	* @return the record_date of this whp_sites_visitors
	*/
	public java.util.Date getRecord_date() {
		return _whp_sites_visitors.getRecord_date();
	}

	/**
	* Sets the record_date of this whp_sites_visitors.
	*
	* @param record_date the record_date of this whp_sites_visitors
	*/
	public void setRecord_date(java.util.Date record_date) {
		_whp_sites_visitors.setRecord_date(record_date);
	}

	public boolean isNew() {
		return _whp_sites_visitors.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_visitors.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_visitors.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_visitors.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_visitors.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_visitors.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_visitors.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_visitors.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_visitors.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_visitorsWrapper((whp_sites_visitors)_whp_sites_visitors.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_visitors whp_sites_visitors) {
		return _whp_sites_visitors.compareTo(whp_sites_visitors);
	}

	@Override
	public int hashCode() {
		return _whp_sites_visitors.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_visitors> toCacheModel() {
		return _whp_sites_visitors.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_visitors toEscapedModel() {
		return new whp_sites_visitorsWrapper(_whp_sites_visitors.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_visitors.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_visitors.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_visitors.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_visitors getWrappedwhp_sites_visitors() {
		return _whp_sites_visitors;
	}

	public whp_sites_visitors getWrappedModel() {
		return _whp_sites_visitors;
	}

	public void resetOriginalValues() {
		_whp_sites_visitors.resetOriginalValues();
	}

	private whp_sites_visitors _whp_sites_visitors;
}