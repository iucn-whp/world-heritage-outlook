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
 * This class is a wrapper for {@link whp_sites_component}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_component
 * @generated
 */
public class whp_sites_componentWrapper implements whp_sites_component,
	ModelWrapper<whp_sites_component> {
	public whp_sites_componentWrapper(whp_sites_component whp_sites_component) {
		_whp_sites_component = whp_sites_component;
	}

	public Class<?> getModelClass() {
		return whp_sites_component.class;
	}

	public String getModelClassName() {
		return whp_sites_component.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_component_id", getWhp_sites_component_id());
		attributes.put("site_id", getSite_id());
		attributes.put("component", getComponent());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_component_id = (Long)attributes.get(
				"whp_sites_component_id");

		if (whp_sites_component_id != null) {
			setWhp_sites_component_id(whp_sites_component_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String component = (String)attributes.get("component");

		if (component != null) {
			setComponent(component);
		}
	}

	/**
	* Returns the primary key of this whp_sites_component.
	*
	* @return the primary key of this whp_sites_component
	*/
	public long getPrimaryKey() {
		return _whp_sites_component.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_component.
	*
	* @param primaryKey the primary key of this whp_sites_component
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_component.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_component_id of this whp_sites_component.
	*
	* @return the whp_sites_component_id of this whp_sites_component
	*/
	public long getWhp_sites_component_id() {
		return _whp_sites_component.getWhp_sites_component_id();
	}

	/**
	* Sets the whp_sites_component_id of this whp_sites_component.
	*
	* @param whp_sites_component_id the whp_sites_component_id of this whp_sites_component
	*/
	public void setWhp_sites_component_id(long whp_sites_component_id) {
		_whp_sites_component.setWhp_sites_component_id(whp_sites_component_id);
	}

	/**
	* Returns the site_id of this whp_sites_component.
	*
	* @return the site_id of this whp_sites_component
	*/
	public long getSite_id() {
		return _whp_sites_component.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_component.
	*
	* @param site_id the site_id of this whp_sites_component
	*/
	public void setSite_id(long site_id) {
		_whp_sites_component.setSite_id(site_id);
	}

	/**
	* Returns the component of this whp_sites_component.
	*
	* @return the component of this whp_sites_component
	*/
	public java.lang.String getComponent() {
		return _whp_sites_component.getComponent();
	}

	/**
	* Sets the component of this whp_sites_component.
	*
	* @param component the component of this whp_sites_component
	*/
	public void setComponent(java.lang.String component) {
		_whp_sites_component.setComponent(component);
	}

	public boolean isNew() {
		return _whp_sites_component.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_component.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_component.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_component.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_component.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_component.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_component.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_component.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_component.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_componentWrapper((whp_sites_component)_whp_sites_component.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component) {
		return _whp_sites_component.compareTo(whp_sites_component);
	}

	@Override
	public int hashCode() {
		return _whp_sites_component.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_component> toCacheModel() {
		return _whp_sites_component.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_component toEscapedModel() {
		return new whp_sites_componentWrapper(_whp_sites_component.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_component.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_component.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_component.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_component getWrappedwhp_sites_component() {
		return _whp_sites_component;
	}

	public whp_sites_component getWrappedModel() {
		return _whp_sites_component;
	}

	public void resetOriginalValues() {
		_whp_sites_component.resetOriginalValues();
	}

	private whp_sites_component _whp_sites_component;
}