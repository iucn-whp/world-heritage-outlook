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
 * This class is a wrapper for {@link whp_sites_soc_reports}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_soc_reports
 * @generated
 */
public class whp_sites_soc_reportsWrapper implements whp_sites_soc_reports,
	ModelWrapper<whp_sites_soc_reports> {
	public whp_sites_soc_reportsWrapper(
		whp_sites_soc_reports whp_sites_soc_reports) {
		_whp_sites_soc_reports = whp_sites_soc_reports;
	}

	public Class<?> getModelClass() {
		return whp_sites_soc_reports.class;
	}

	public String getModelClassName() {
		return whp_sites_soc_reports.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_soc_reports_id", getWhp_sites_soc_reports_id());
		attributes.put("site_id", getSite_id());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_soc_reports_id = (Long)attributes.get(
				"whp_sites_soc_reports_id");

		if (whp_sites_soc_reports_id != null) {
			setWhp_sites_soc_reports_id(whp_sites_soc_reports_id);
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
	* Returns the primary key of this whp_sites_soc_reports.
	*
	* @return the primary key of this whp_sites_soc_reports
	*/
	public long getPrimaryKey() {
		return _whp_sites_soc_reports.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_soc_reports.
	*
	* @param primaryKey the primary key of this whp_sites_soc_reports
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_soc_reports.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_soc_reports_id of this whp_sites_soc_reports.
	*
	* @return the whp_sites_soc_reports_id of this whp_sites_soc_reports
	*/
	public long getWhp_sites_soc_reports_id() {
		return _whp_sites_soc_reports.getWhp_sites_soc_reports_id();
	}

	/**
	* Sets the whp_sites_soc_reports_id of this whp_sites_soc_reports.
	*
	* @param whp_sites_soc_reports_id the whp_sites_soc_reports_id of this whp_sites_soc_reports
	*/
	public void setWhp_sites_soc_reports_id(long whp_sites_soc_reports_id) {
		_whp_sites_soc_reports.setWhp_sites_soc_reports_id(whp_sites_soc_reports_id);
	}

	/**
	* Returns the site_id of this whp_sites_soc_reports.
	*
	* @return the site_id of this whp_sites_soc_reports
	*/
	public long getSite_id() {
		return _whp_sites_soc_reports.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_soc_reports.
	*
	* @param site_id the site_id of this whp_sites_soc_reports
	*/
	public void setSite_id(long site_id) {
		_whp_sites_soc_reports.setSite_id(site_id);
	}

	/**
	* Returns the date_published of this whp_sites_soc_reports.
	*
	* @return the date_published of this whp_sites_soc_reports
	*/
	public java.util.Date getDate_published() {
		return _whp_sites_soc_reports.getDate_published();
	}

	/**
	* Sets the date_published of this whp_sites_soc_reports.
	*
	* @param date_published the date_published of this whp_sites_soc_reports
	*/
	public void setDate_published(java.util.Date date_published) {
		_whp_sites_soc_reports.setDate_published(date_published);
	}

	/**
	* Returns the document_link of this whp_sites_soc_reports.
	*
	* @return the document_link of this whp_sites_soc_reports
	*/
	public java.lang.String getDocument_link() {
		return _whp_sites_soc_reports.getDocument_link();
	}

	/**
	* Sets the document_link of this whp_sites_soc_reports.
	*
	* @param document_link the document_link of this whp_sites_soc_reports
	*/
	public void setDocument_link(java.lang.String document_link) {
		_whp_sites_soc_reports.setDocument_link(document_link);
	}

	/**
	* Returns the fileentryid of this whp_sites_soc_reports.
	*
	* @return the fileentryid of this whp_sites_soc_reports
	*/
	public long getFileentryid() {
		return _whp_sites_soc_reports.getFileentryid();
	}

	/**
	* Sets the fileentryid of this whp_sites_soc_reports.
	*
	* @param fileentryid the fileentryid of this whp_sites_soc_reports
	*/
	public void setFileentryid(long fileentryid) {
		_whp_sites_soc_reports.setFileentryid(fileentryid);
	}

	/**
	* Returns the doc_name of this whp_sites_soc_reports.
	*
	* @return the doc_name of this whp_sites_soc_reports
	*/
	public java.lang.String getDoc_name() {
		return _whp_sites_soc_reports.getDoc_name();
	}

	/**
	* Sets the doc_name of this whp_sites_soc_reports.
	*
	* @param doc_name the doc_name of this whp_sites_soc_reports
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_whp_sites_soc_reports.setDoc_name(doc_name);
	}

	public boolean isNew() {
		return _whp_sites_soc_reports.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_soc_reports.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_soc_reports.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_soc_reports.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_soc_reports.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_soc_reports.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_soc_reports.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_soc_reports.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_soc_reports.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_soc_reportsWrapper((whp_sites_soc_reports)_whp_sites_soc_reports.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_soc_reports whp_sites_soc_reports) {
		return _whp_sites_soc_reports.compareTo(whp_sites_soc_reports);
	}

	@Override
	public int hashCode() {
		return _whp_sites_soc_reports.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_soc_reports> toCacheModel() {
		return _whp_sites_soc_reports.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_soc_reports toEscapedModel() {
		return new whp_sites_soc_reportsWrapper(_whp_sites_soc_reports.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_soc_reports.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_soc_reports.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_soc_reports.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_soc_reports getWrappedwhp_sites_soc_reports() {
		return _whp_sites_soc_reports;
	}

	public whp_sites_soc_reports getWrappedModel() {
		return _whp_sites_soc_reports;
	}

	public void resetOriginalValues() {
		_whp_sites_soc_reports.resetOriginalValues();
	}

	private whp_sites_soc_reports _whp_sites_soc_reports;
}