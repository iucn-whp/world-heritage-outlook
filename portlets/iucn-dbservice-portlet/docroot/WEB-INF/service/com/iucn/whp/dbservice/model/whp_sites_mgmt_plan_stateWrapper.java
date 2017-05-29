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
 * This class is a wrapper for {@link whp_sites_mgmt_plan_state}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_mgmt_plan_state
 * @generated
 */
public class whp_sites_mgmt_plan_stateWrapper
	implements whp_sites_mgmt_plan_state,
		ModelWrapper<whp_sites_mgmt_plan_state> {
	public whp_sites_mgmt_plan_stateWrapper(
		whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state) {
		_whp_sites_mgmt_plan_state = whp_sites_mgmt_plan_state;
	}

	public Class<?> getModelClass() {
		return whp_sites_mgmt_plan_state.class;
	}

	public String getModelClassName() {
		return whp_sites_mgmt_plan_state.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_mgmt_plan_state_id",
			getWhp_sites_mgmt_plan_state_id());
		attributes.put("site_id", getSite_id());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_mgmt_plan_state_id = (Long)attributes.get(
				"whp_sites_mgmt_plan_state_id");

		if (whp_sites_mgmt_plan_state_id != null) {
			setWhp_sites_mgmt_plan_state_id(whp_sites_mgmt_plan_state_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Date date_published = (Date)attributes.get("date_published");

		if (date_published != null) {
			setDate_published(date_published);
		}

		String document_link = (String)attributes.get("document_link");

		if (document_link != null) {
			setDocument_link(document_link);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		String doc_name = (String)attributes.get("doc_name");

		if (doc_name != null) {
			setDoc_name(doc_name);
		}
	}

	/**
	* Returns the primary key of this whp_sites_mgmt_plan_state.
	*
	* @return the primary key of this whp_sites_mgmt_plan_state
	*/
	public long getPrimaryKey() {
		return _whp_sites_mgmt_plan_state.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_mgmt_plan_state.
	*
	* @param primaryKey the primary key of this whp_sites_mgmt_plan_state
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_mgmt_plan_state.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_mgmt_plan_state_id of this whp_sites_mgmt_plan_state.
	*
	* @return the whp_sites_mgmt_plan_state_id of this whp_sites_mgmt_plan_state
	*/
	public long getWhp_sites_mgmt_plan_state_id() {
		return _whp_sites_mgmt_plan_state.getWhp_sites_mgmt_plan_state_id();
	}

	/**
	* Sets the whp_sites_mgmt_plan_state_id of this whp_sites_mgmt_plan_state.
	*
	* @param whp_sites_mgmt_plan_state_id the whp_sites_mgmt_plan_state_id of this whp_sites_mgmt_plan_state
	*/
	public void setWhp_sites_mgmt_plan_state_id(
		long whp_sites_mgmt_plan_state_id) {
		_whp_sites_mgmt_plan_state.setWhp_sites_mgmt_plan_state_id(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Returns the site_id of this whp_sites_mgmt_plan_state.
	*
	* @return the site_id of this whp_sites_mgmt_plan_state
	*/
	public long getSite_id() {
		return _whp_sites_mgmt_plan_state.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_mgmt_plan_state.
	*
	* @param site_id the site_id of this whp_sites_mgmt_plan_state
	*/
	public void setSite_id(long site_id) {
		_whp_sites_mgmt_plan_state.setSite_id(site_id);
	}

	/**
	* Returns the date_published of this whp_sites_mgmt_plan_state.
	*
	* @return the date_published of this whp_sites_mgmt_plan_state
	*/
	public java.util.Date getDate_published() {
		return _whp_sites_mgmt_plan_state.getDate_published();
	}

	/**
	* Sets the date_published of this whp_sites_mgmt_plan_state.
	*
	* @param date_published the date_published of this whp_sites_mgmt_plan_state
	*/
	public void setDate_published(java.util.Date date_published) {
		_whp_sites_mgmt_plan_state.setDate_published(date_published);
	}

	/**
	* Returns the document_link of this whp_sites_mgmt_plan_state.
	*
	* @return the document_link of this whp_sites_mgmt_plan_state
	*/
	public java.lang.String getDocument_link() {
		return _whp_sites_mgmt_plan_state.getDocument_link();
	}

	/**
	* Sets the document_link of this whp_sites_mgmt_plan_state.
	*
	* @param document_link the document_link of this whp_sites_mgmt_plan_state
	*/
	public void setDocument_link(java.lang.String document_link) {
		_whp_sites_mgmt_plan_state.setDocument_link(document_link);
	}

	/**
	* Returns the fileentryid of this whp_sites_mgmt_plan_state.
	*
	* @return the fileentryid of this whp_sites_mgmt_plan_state
	*/
	public long getFileentryid() {
		return _whp_sites_mgmt_plan_state.getFileentryid();
	}

	/**
	* Sets the fileentryid of this whp_sites_mgmt_plan_state.
	*
	* @param fileentryid the fileentryid of this whp_sites_mgmt_plan_state
	*/
	public void setFileentryid(long fileentryid) {
		_whp_sites_mgmt_plan_state.setFileentryid(fileentryid);
	}

	/**
	* Returns the doc_name of this whp_sites_mgmt_plan_state.
	*
	* @return the doc_name of this whp_sites_mgmt_plan_state
	*/
	public java.lang.String getDoc_name() {
		return _whp_sites_mgmt_plan_state.getDoc_name();
	}

	/**
	* Sets the doc_name of this whp_sites_mgmt_plan_state.
	*
	* @param doc_name the doc_name of this whp_sites_mgmt_plan_state
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_whp_sites_mgmt_plan_state.setDoc_name(doc_name);
	}

	public boolean isNew() {
		return _whp_sites_mgmt_plan_state.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_mgmt_plan_state.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_mgmt_plan_state.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_mgmt_plan_state.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_mgmt_plan_state.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_mgmt_plan_state.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_mgmt_plan_state.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_mgmt_plan_state.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_mgmt_plan_state.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_mgmt_plan_stateWrapper((whp_sites_mgmt_plan_state)_whp_sites_mgmt_plan_state.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state) {
		return _whp_sites_mgmt_plan_state.compareTo(whp_sites_mgmt_plan_state);
	}

	@Override
	public int hashCode() {
		return _whp_sites_mgmt_plan_state.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> toCacheModel() {
		return _whp_sites_mgmt_plan_state.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state toEscapedModel() {
		return new whp_sites_mgmt_plan_stateWrapper(_whp_sites_mgmt_plan_state.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_mgmt_plan_state.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_mgmt_plan_state.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_mgmt_plan_state.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_mgmt_plan_state getWrappedwhp_sites_mgmt_plan_state() {
		return _whp_sites_mgmt_plan_state;
	}

	public whp_sites_mgmt_plan_state getWrappedModel() {
		return _whp_sites_mgmt_plan_state;
	}

	public void resetOriginalValues() {
		_whp_sites_mgmt_plan_state.resetOriginalValues();
	}

	private whp_sites_mgmt_plan_state _whp_sites_mgmt_plan_state;
}