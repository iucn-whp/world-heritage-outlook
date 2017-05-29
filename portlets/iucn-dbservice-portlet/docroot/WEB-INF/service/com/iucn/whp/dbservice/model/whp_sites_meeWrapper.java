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
 * This class is a wrapper for {@link whp_sites_mee}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_mee
 * @generated
 */
public class whp_sites_meeWrapper implements whp_sites_mee,
	ModelWrapper<whp_sites_mee> {
	public whp_sites_meeWrapper(whp_sites_mee whp_sites_mee) {
		_whp_sites_mee = whp_sites_mee;
	}

	public Class<?> getModelClass() {
		return whp_sites_mee.class;
	}

	public String getModelClassName() {
		return whp_sites_mee.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_mee_id", getWhp_sites_mee_id());
		attributes.put("site_id", getSite_id());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_mee_id = (Long)attributes.get("whp_sites_mee_id");

		if (whp_sites_mee_id != null) {
			setWhp_sites_mee_id(whp_sites_mee_id);
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
	* Returns the primary key of this whp_sites_mee.
	*
	* @return the primary key of this whp_sites_mee
	*/
	public long getPrimaryKey() {
		return _whp_sites_mee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_mee.
	*
	* @param primaryKey the primary key of this whp_sites_mee
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_mee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_mee_id of this whp_sites_mee.
	*
	* @return the whp_sites_mee_id of this whp_sites_mee
	*/
	public long getWhp_sites_mee_id() {
		return _whp_sites_mee.getWhp_sites_mee_id();
	}

	/**
	* Sets the whp_sites_mee_id of this whp_sites_mee.
	*
	* @param whp_sites_mee_id the whp_sites_mee_id of this whp_sites_mee
	*/
	public void setWhp_sites_mee_id(long whp_sites_mee_id) {
		_whp_sites_mee.setWhp_sites_mee_id(whp_sites_mee_id);
	}

	/**
	* Returns the site_id of this whp_sites_mee.
	*
	* @return the site_id of this whp_sites_mee
	*/
	public long getSite_id() {
		return _whp_sites_mee.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_mee.
	*
	* @param site_id the site_id of this whp_sites_mee
	*/
	public void setSite_id(long site_id) {
		_whp_sites_mee.setSite_id(site_id);
	}

	/**
	* Returns the date_published of this whp_sites_mee.
	*
	* @return the date_published of this whp_sites_mee
	*/
	public java.util.Date getDate_published() {
		return _whp_sites_mee.getDate_published();
	}

	/**
	* Sets the date_published of this whp_sites_mee.
	*
	* @param date_published the date_published of this whp_sites_mee
	*/
	public void setDate_published(java.util.Date date_published) {
		_whp_sites_mee.setDate_published(date_published);
	}

	/**
	* Returns the document_link of this whp_sites_mee.
	*
	* @return the document_link of this whp_sites_mee
	*/
	public java.lang.String getDocument_link() {
		return _whp_sites_mee.getDocument_link();
	}

	/**
	* Sets the document_link of this whp_sites_mee.
	*
	* @param document_link the document_link of this whp_sites_mee
	*/
	public void setDocument_link(java.lang.String document_link) {
		_whp_sites_mee.setDocument_link(document_link);
	}

	/**
	* Returns the fileentryid of this whp_sites_mee.
	*
	* @return the fileentryid of this whp_sites_mee
	*/
	public long getFileentryid() {
		return _whp_sites_mee.getFileentryid();
	}

	/**
	* Sets the fileentryid of this whp_sites_mee.
	*
	* @param fileentryid the fileentryid of this whp_sites_mee
	*/
	public void setFileentryid(long fileentryid) {
		_whp_sites_mee.setFileentryid(fileentryid);
	}

	/**
	* Returns the doc_name of this whp_sites_mee.
	*
	* @return the doc_name of this whp_sites_mee
	*/
	public java.lang.String getDoc_name() {
		return _whp_sites_mee.getDoc_name();
	}

	/**
	* Sets the doc_name of this whp_sites_mee.
	*
	* @param doc_name the doc_name of this whp_sites_mee
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_whp_sites_mee.setDoc_name(doc_name);
	}

	public boolean isNew() {
		return _whp_sites_mee.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_mee.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_mee.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_mee.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_mee.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_mee.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_mee.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_mee.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_mee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_meeWrapper((whp_sites_mee)_whp_sites_mee.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee) {
		return _whp_sites_mee.compareTo(whp_sites_mee);
	}

	@Override
	public int hashCode() {
		return _whp_sites_mee.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_mee> toCacheModel() {
		return _whp_sites_mee.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_mee toEscapedModel() {
		return new whp_sites_meeWrapper(_whp_sites_mee.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_mee.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_mee.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_mee.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_mee getWrappedwhp_sites_mee() {
		return _whp_sites_mee;
	}

	public whp_sites_mee getWrappedModel() {
		return _whp_sites_mee;
	}

	public void resetOriginalValues() {
		_whp_sites_mee.resetOriginalValues();
	}

	private whp_sites_mee _whp_sites_mee;
}