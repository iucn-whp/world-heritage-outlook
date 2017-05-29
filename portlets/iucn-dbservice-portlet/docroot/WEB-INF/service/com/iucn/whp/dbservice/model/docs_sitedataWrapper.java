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
 * This class is a wrapper for {@link docs_sitedata}.
 * </p>
 *
 * @author    alok.sen
 * @see       docs_sitedata
 * @generated
 */
public class docs_sitedataWrapper implements docs_sitedata,
	ModelWrapper<docs_sitedata> {
	public docs_sitedataWrapper(docs_sitedata docs_sitedata) {
		_docs_sitedata = docs_sitedata;
	}

	public Class<?> getModelClass() {
		return docs_sitedata.class;
	}

	public String getModelClassName() {
		return docs_sitedata.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docs_sitedataId", getDocs_sitedataId());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("fileversionid", getFileversionid());
		attributes.put("siteid", getSiteid());
		attributes.put("date_published", getDate_published());
		attributes.put("doc_name", getDoc_name());
		attributes.put("document_link", getDocument_link());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long docs_sitedataId = (Long)attributes.get("docs_sitedataId");

		if (docs_sitedataId != null) {
			setDocs_sitedataId(docs_sitedataId);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		Long fileversionid = (Long)attributes.get("fileversionid");

		if (fileversionid != null) {
			setFileversionid(fileversionid);
		}

		Long siteid = (Long)attributes.get("siteid");

		if (siteid != null) {
			setSiteid(siteid);
		}

		Date date_published = (Date)attributes.get("date_published");

		if (date_published != null) {
			setDate_published(date_published);
		}

		String doc_name = (String)attributes.get("doc_name");

		if (doc_name != null) {
			setDoc_name(doc_name);
		}

		String document_link = (String)attributes.get("document_link");

		if (document_link != null) {
			setDocument_link(document_link);
		}
	}

	/**
	* Returns the primary key of this docs_sitedata.
	*
	* @return the primary key of this docs_sitedata
	*/
	public long getPrimaryKey() {
		return _docs_sitedata.getPrimaryKey();
	}

	/**
	* Sets the primary key of this docs_sitedata.
	*
	* @param primaryKey the primary key of this docs_sitedata
	*/
	public void setPrimaryKey(long primaryKey) {
		_docs_sitedata.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the docs_sitedata ID of this docs_sitedata.
	*
	* @return the docs_sitedata ID of this docs_sitedata
	*/
	public long getDocs_sitedataId() {
		return _docs_sitedata.getDocs_sitedataId();
	}

	/**
	* Sets the docs_sitedata ID of this docs_sitedata.
	*
	* @param docs_sitedataId the docs_sitedata ID of this docs_sitedata
	*/
	public void setDocs_sitedataId(long docs_sitedataId) {
		_docs_sitedata.setDocs_sitedataId(docs_sitedataId);
	}

	/**
	* Returns the fileentryid of this docs_sitedata.
	*
	* @return the fileentryid of this docs_sitedata
	*/
	public long getFileentryid() {
		return _docs_sitedata.getFileentryid();
	}

	/**
	* Sets the fileentryid of this docs_sitedata.
	*
	* @param fileentryid the fileentryid of this docs_sitedata
	*/
	public void setFileentryid(long fileentryid) {
		_docs_sitedata.setFileentryid(fileentryid);
	}

	/**
	* Returns the fileversionid of this docs_sitedata.
	*
	* @return the fileversionid of this docs_sitedata
	*/
	public long getFileversionid() {
		return _docs_sitedata.getFileversionid();
	}

	/**
	* Sets the fileversionid of this docs_sitedata.
	*
	* @param fileversionid the fileversionid of this docs_sitedata
	*/
	public void setFileversionid(long fileversionid) {
		_docs_sitedata.setFileversionid(fileversionid);
	}

	/**
	* Returns the siteid of this docs_sitedata.
	*
	* @return the siteid of this docs_sitedata
	*/
	public long getSiteid() {
		return _docs_sitedata.getSiteid();
	}

	/**
	* Sets the siteid of this docs_sitedata.
	*
	* @param siteid the siteid of this docs_sitedata
	*/
	public void setSiteid(long siteid) {
		_docs_sitedata.setSiteid(siteid);
	}

	/**
	* Returns the date_published of this docs_sitedata.
	*
	* @return the date_published of this docs_sitedata
	*/
	public java.util.Date getDate_published() {
		return _docs_sitedata.getDate_published();
	}

	/**
	* Sets the date_published of this docs_sitedata.
	*
	* @param date_published the date_published of this docs_sitedata
	*/
	public void setDate_published(java.util.Date date_published) {
		_docs_sitedata.setDate_published(date_published);
	}

	/**
	* Returns the doc_name of this docs_sitedata.
	*
	* @return the doc_name of this docs_sitedata
	*/
	public java.lang.String getDoc_name() {
		return _docs_sitedata.getDoc_name();
	}

	/**
	* Sets the doc_name of this docs_sitedata.
	*
	* @param doc_name the doc_name of this docs_sitedata
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_docs_sitedata.setDoc_name(doc_name);
	}

	/**
	* Returns the document_link of this docs_sitedata.
	*
	* @return the document_link of this docs_sitedata
	*/
	public java.lang.String getDocument_link() {
		return _docs_sitedata.getDocument_link();
	}

	/**
	* Sets the document_link of this docs_sitedata.
	*
	* @param document_link the document_link of this docs_sitedata
	*/
	public void setDocument_link(java.lang.String document_link) {
		_docs_sitedata.setDocument_link(document_link);
	}

	public boolean isNew() {
		return _docs_sitedata.isNew();
	}

	public void setNew(boolean n) {
		_docs_sitedata.setNew(n);
	}

	public boolean isCachedModel() {
		return _docs_sitedata.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_docs_sitedata.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _docs_sitedata.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _docs_sitedata.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docs_sitedata.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docs_sitedata.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docs_sitedata.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new docs_sitedataWrapper((docs_sitedata)_docs_sitedata.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata) {
		return _docs_sitedata.compareTo(docs_sitedata);
	}

	@Override
	public int hashCode() {
		return _docs_sitedata.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.docs_sitedata> toCacheModel() {
		return _docs_sitedata.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.docs_sitedata toEscapedModel() {
		return new docs_sitedataWrapper(_docs_sitedata.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docs_sitedata.toString();
	}

	public java.lang.String toXmlString() {
		return _docs_sitedata.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docs_sitedata.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public docs_sitedata getWrappeddocs_sitedata() {
		return _docs_sitedata;
	}

	public docs_sitedata getWrappedModel() {
		return _docs_sitedata;
	}

	public void resetOriginalValues() {
		_docs_sitedata.resetOriginalValues();
	}

	private docs_sitedata _docs_sitedata;
}