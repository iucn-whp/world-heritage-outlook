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
 * This class is a wrapper for {@link whp_sites_mission}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_mission
 * @generated
 */
public class whp_sites_missionWrapper implements whp_sites_mission,
	ModelWrapper<whp_sites_mission> {
	public whp_sites_missionWrapper(whp_sites_mission whp_sites_mission) {
		_whp_sites_mission = whp_sites_mission;
	}

	public Class<?> getModelClass() {
		return whp_sites_mission.class;
	}

	public String getModelClassName() {
		return whp_sites_mission.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_mission_id", getWhp_sites_mission_id());
		attributes.put("site_id", getSite_id());
		attributes.put("missiontype", getMissiontype());
		attributes.put("date_published", getDate_published());
		attributes.put("document_link", getDocument_link());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("doc_name", getDoc_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_mission_id = (Long)attributes.get("whp_sites_mission_id");

		if (whp_sites_mission_id != null) {
			setWhp_sites_mission_id(whp_sites_mission_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer missiontype = (Integer)attributes.get("missiontype");

		if (missiontype != null) {
			setMissiontype(missiontype);
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
	* Returns the primary key of this whp_sites_mission.
	*
	* @return the primary key of this whp_sites_mission
	*/
	public long getPrimaryKey() {
		return _whp_sites_mission.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_mission.
	*
	* @param primaryKey the primary key of this whp_sites_mission
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_mission.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_mission_id of this whp_sites_mission.
	*
	* @return the whp_sites_mission_id of this whp_sites_mission
	*/
	public long getWhp_sites_mission_id() {
		return _whp_sites_mission.getWhp_sites_mission_id();
	}

	/**
	* Sets the whp_sites_mission_id of this whp_sites_mission.
	*
	* @param whp_sites_mission_id the whp_sites_mission_id of this whp_sites_mission
	*/
	public void setWhp_sites_mission_id(long whp_sites_mission_id) {
		_whp_sites_mission.setWhp_sites_mission_id(whp_sites_mission_id);
	}

	/**
	* Returns the site_id of this whp_sites_mission.
	*
	* @return the site_id of this whp_sites_mission
	*/
	public long getSite_id() {
		return _whp_sites_mission.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_mission.
	*
	* @param site_id the site_id of this whp_sites_mission
	*/
	public void setSite_id(long site_id) {
		_whp_sites_mission.setSite_id(site_id);
	}

	/**
	* Returns the missiontype of this whp_sites_mission.
	*
	* @return the missiontype of this whp_sites_mission
	*/
	public int getMissiontype() {
		return _whp_sites_mission.getMissiontype();
	}

	/**
	* Sets the missiontype of this whp_sites_mission.
	*
	* @param missiontype the missiontype of this whp_sites_mission
	*/
	public void setMissiontype(int missiontype) {
		_whp_sites_mission.setMissiontype(missiontype);
	}

	/**
	* Returns the date_published of this whp_sites_mission.
	*
	* @return the date_published of this whp_sites_mission
	*/
	public java.util.Date getDate_published() {
		return _whp_sites_mission.getDate_published();
	}

	/**
	* Sets the date_published of this whp_sites_mission.
	*
	* @param date_published the date_published of this whp_sites_mission
	*/
	public void setDate_published(java.util.Date date_published) {
		_whp_sites_mission.setDate_published(date_published);
	}

	/**
	* Returns the document_link of this whp_sites_mission.
	*
	* @return the document_link of this whp_sites_mission
	*/
	public java.lang.String getDocument_link() {
		return _whp_sites_mission.getDocument_link();
	}

	/**
	* Sets the document_link of this whp_sites_mission.
	*
	* @param document_link the document_link of this whp_sites_mission
	*/
	public void setDocument_link(java.lang.String document_link) {
		_whp_sites_mission.setDocument_link(document_link);
	}

	/**
	* Returns the fileentryid of this whp_sites_mission.
	*
	* @return the fileentryid of this whp_sites_mission
	*/
	public long getFileentryid() {
		return _whp_sites_mission.getFileentryid();
	}

	/**
	* Sets the fileentryid of this whp_sites_mission.
	*
	* @param fileentryid the fileentryid of this whp_sites_mission
	*/
	public void setFileentryid(long fileentryid) {
		_whp_sites_mission.setFileentryid(fileentryid);
	}

	/**
	* Returns the doc_name of this whp_sites_mission.
	*
	* @return the doc_name of this whp_sites_mission
	*/
	public java.lang.String getDoc_name() {
		return _whp_sites_mission.getDoc_name();
	}

	/**
	* Sets the doc_name of this whp_sites_mission.
	*
	* @param doc_name the doc_name of this whp_sites_mission
	*/
	public void setDoc_name(java.lang.String doc_name) {
		_whp_sites_mission.setDoc_name(doc_name);
	}

	public boolean isNew() {
		return _whp_sites_mission.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_mission.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_mission.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_mission.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_mission.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_mission.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_mission.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_mission.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_mission.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_missionWrapper((whp_sites_mission)_whp_sites_mission.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission) {
		return _whp_sites_mission.compareTo(whp_sites_mission);
	}

	@Override
	public int hashCode() {
		return _whp_sites_mission.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_mission> toCacheModel() {
		return _whp_sites_mission.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_mission toEscapedModel() {
		return new whp_sites_missionWrapper(_whp_sites_mission.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_mission.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_mission.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_mission.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_mission getWrappedwhp_sites_mission() {
		return _whp_sites_mission;
	}

	public whp_sites_mission getWrappedModel() {
		return _whp_sites_mission;
	}

	public void resetOriginalValues() {
		_whp_sites_mission.resetOriginalValues();
	}

	private whp_sites_mission _whp_sites_mission;
}