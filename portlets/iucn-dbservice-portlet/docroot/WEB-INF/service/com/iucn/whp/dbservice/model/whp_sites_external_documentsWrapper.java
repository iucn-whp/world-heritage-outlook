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
 * This class is a wrapper for {@link whp_sites_external_documents}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_external_documents
 * @generated
 */
public class whp_sites_external_documentsWrapper
	implements whp_sites_external_documents,
		ModelWrapper<whp_sites_external_documents> {
	public whp_sites_external_documentsWrapper(
		whp_sites_external_documents whp_sites_external_documents) {
		_whp_sites_external_documents = whp_sites_external_documents;
	}

	public Class<?> getModelClass() {
		return whp_sites_external_documents.class;
	}

	public String getModelClassName() {
		return whp_sites_external_documents.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_external_documents_id",
			getWhp_sites_external_documents_id());
		attributes.put("site_id", getSite_id());
		attributes.put("document_description", getDocument_description());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_external_documents_id = (Long)attributes.get(
				"whp_sites_external_documents_id");

		if (whp_sites_external_documents_id != null) {
			setWhp_sites_external_documents_id(whp_sites_external_documents_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String document_description = (String)attributes.get(
				"document_description");

		if (document_description != null) {
			setDocument_description(document_description);
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
	* Returns the primary key of this whp_sites_external_documents.
	*
	* @return the primary key of this whp_sites_external_documents
	*/
	public long getPrimaryKey() {
		return _whp_sites_external_documents.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_external_documents.
	*
	* @param primaryKey the primary key of this whp_sites_external_documents
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_external_documents.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_external_documents_id of this whp_sites_external_documents.
	*
	* @return the whp_sites_external_documents_id of this whp_sites_external_documents
	*/
	public long getWhp_sites_external_documents_id() {
		return _whp_sites_external_documents.getWhp_sites_external_documents_id();
	}

	/**
	* Sets the whp_sites_external_documents_id of this whp_sites_external_documents.
	*
	* @param whp_sites_external_documents_id the whp_sites_external_documents_id of this whp_sites_external_documents
	*/
	public void setWhp_sites_external_documents_id(
		long whp_sites_external_documents_id) {
		_whp_sites_external_documents.setWhp_sites_external_documents_id(whp_sites_external_documents_id);
	}

	/**
	* Returns the site_id of this whp_sites_external_documents.
	*
	* @return the site_id of this whp_sites_external_documents
	*/
	public long getSite_id() {
		return _whp_sites_external_documents.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_external_documents.
	*
	* @param site_id the site_id of this whp_sites_external_documents
	*/
	public void setSite_id(long site_id) {
		_whp_sites_external_documents.setSite_id(site_id);
	}

	/**
	* Returns the document_description of this whp_sites_external_documents.
	*
	* @return the document_description of this whp_sites_external_documents
	*/
	public java.lang.String getDocument_description() {
		return _whp_sites_external_documents.getDocument_description();
	}

	/**
	* Sets the document_description of this whp_sites_external_documents.
	*
	* @param document_description the document_description of this whp_sites_external_documents
	*/
	public void setDocument_description(java.lang.String document_description) {
		_whp_sites_external_documents.setDocument_description(document_description);
	}

	/**
	* Returns the document_link of this whp_sites_external_documents.
	*
	* @return the document_link of this whp_sites_external_documents
	*/
	public java.lang.String getDocument_link() {
		return _whp_sites_external_documents.getDocument_link();
	}

	/**
	* Sets the document_link of this whp_sites_external_documents.
	*
	* @param document_link the document_link of this whp_sites_external_documents
	*/
	public void setDocument_link(java.lang.String document_link) {
		_whp_sites_external_documents.setDocument_link(document_link);
	}

	/**
	* Returns the fileentryid of this whp_sites_external_documents.
	*
	* @return the fileentryid of this whp_sites_external_documents
	*/
	public long getFileentryid() {
		return _whp_sites_external_documents.getFileentryid();
	}

	/**
	* Sets the fileentryid of this whp_sites_external_documents.
	*
	* @param fileentryid the fileentryid of this whp_sites_external_documents
	*/
	public void setFileentryid(long fileentryid) {
		_whp_sites_external_documents.setFileentryid(fileentryid);
	}

	/**
	* Returns the doc_name of this whp_sites_external_documents.
	*
	* @return the doc_name of this whp_sites_external_documents
	*/
	public java.lang.String getDoc_name() {
		return _whp_sites_external_documents.getDoc_name();
	}

	/**
	* Sets the doc_name of this whp_sites_external_documents.
	*
	* @param doc_name the doc_name of this whp_sites_external_documents
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_whp_sites_external_documents.setDoc_name(doc_name);
	}

	public boolean isNew() {
		return _whp_sites_external_documents.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_external_documents.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_external_documents.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_external_documents.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_external_documents.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_external_documents.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_external_documents.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_external_documents.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_external_documents.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_external_documentsWrapper((whp_sites_external_documents)_whp_sites_external_documents.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_external_documents whp_sites_external_documents) {
		return _whp_sites_external_documents.compareTo(whp_sites_external_documents);
	}

	@Override
	public int hashCode() {
		return _whp_sites_external_documents.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_external_documents> toCacheModel() {
		return _whp_sites_external_documents.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_external_documents toEscapedModel() {
		return new whp_sites_external_documentsWrapper(_whp_sites_external_documents.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_external_documents.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_external_documents.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_external_documents.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_external_documents getWrappedwhp_sites_external_documents() {
		return _whp_sites_external_documents;
	}

	public whp_sites_external_documents getWrappedModel() {
		return _whp_sites_external_documents;
	}

	public void resetOriginalValues() {
		_whp_sites_external_documents.resetOriginalValues();
	}

	private whp_sites_external_documents _whp_sites_external_documents;
}