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
 * This class is a wrapper for {@link whp_sites_indigenous_communities}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_indigenous_communities
 * @generated
 */
public class whp_sites_indigenous_communitiesWrapper
	implements whp_sites_indigenous_communities,
		ModelWrapper<whp_sites_indigenous_communities> {
	public whp_sites_indigenous_communitiesWrapper(
		whp_sites_indigenous_communities whp_sites_indigenous_communities) {
		_whp_sites_indigenous_communities = whp_sites_indigenous_communities;
	}

	public Class<?> getModelClass() {
		return whp_sites_indigenous_communities.class;
	}

	public String getModelClassName() {
		return whp_sites_indigenous_communities.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_indigenous_communities_id",
			getWhp_sites_indigenous_communities_id());
		attributes.put("site_id", getSite_id());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_indigenous_communities_id = (Long)attributes.get(
				"whp_sites_indigenous_communities_id");

		if (whp_sites_indigenous_communities_id != null) {
			setWhp_sites_indigenous_communities_id(whp_sites_indigenous_communities_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this whp_sites_indigenous_communities.
	*
	* @return the primary key of this whp_sites_indigenous_communities
	*/
	public long getPrimaryKey() {
		return _whp_sites_indigenous_communities.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_indigenous_communities.
	*
	* @param primaryKey the primary key of this whp_sites_indigenous_communities
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_indigenous_communities.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities.
	*
	* @return the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities
	*/
	public long getWhp_sites_indigenous_communities_id() {
		return _whp_sites_indigenous_communities.getWhp_sites_indigenous_communities_id();
	}

	/**
	* Sets the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities.
	*
	* @param whp_sites_indigenous_communities_id the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities
	*/
	public void setWhp_sites_indigenous_communities_id(
		long whp_sites_indigenous_communities_id) {
		_whp_sites_indigenous_communities.setWhp_sites_indigenous_communities_id(whp_sites_indigenous_communities_id);
	}

	/**
	* Returns the site_id of this whp_sites_indigenous_communities.
	*
	* @return the site_id of this whp_sites_indigenous_communities
	*/
	public long getSite_id() {
		return _whp_sites_indigenous_communities.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_indigenous_communities.
	*
	* @param site_id the site_id of this whp_sites_indigenous_communities
	*/
	public void setSite_id(long site_id) {
		_whp_sites_indigenous_communities.setSite_id(site_id);
	}

	/**
	* Returns the description of this whp_sites_indigenous_communities.
	*
	* @return the description of this whp_sites_indigenous_communities
	*/
	public java.lang.String getDescription() {
		return _whp_sites_indigenous_communities.getDescription();
	}

	/**
	* Sets the description of this whp_sites_indigenous_communities.
	*
	* @param description the description of this whp_sites_indigenous_communities
	*/
	public void setDescription(java.lang.String description) {
		_whp_sites_indigenous_communities.setDescription(description);
	}

	public boolean isNew() {
		return _whp_sites_indigenous_communities.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_indigenous_communities.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_indigenous_communities.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_indigenous_communities.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_indigenous_communities.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_indigenous_communities.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_indigenous_communities.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_indigenous_communities.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_indigenous_communities.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_indigenous_communitiesWrapper((whp_sites_indigenous_communities)_whp_sites_indigenous_communities.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities) {
		return _whp_sites_indigenous_communities.compareTo(whp_sites_indigenous_communities);
	}

	@Override
	public int hashCode() {
		return _whp_sites_indigenous_communities.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> toCacheModel() {
		return _whp_sites_indigenous_communities.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities toEscapedModel() {
		return new whp_sites_indigenous_communitiesWrapper(_whp_sites_indigenous_communities.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_indigenous_communities.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_indigenous_communities.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_indigenous_communities.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_indigenous_communities getWrappedwhp_sites_indigenous_communities() {
		return _whp_sites_indigenous_communities;
	}

	public whp_sites_indigenous_communities getWrappedModel() {
		return _whp_sites_indigenous_communities;
	}

	public void resetOriginalValues() {
		_whp_sites_indigenous_communities.resetOriginalValues();
	}

	private whp_sites_indigenous_communities _whp_sites_indigenous_communities;
}