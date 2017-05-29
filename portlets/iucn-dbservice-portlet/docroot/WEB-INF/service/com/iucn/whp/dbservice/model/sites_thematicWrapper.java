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
 * This class is a wrapper for {@link sites_thematic}.
 * </p>
 *
 * @author    alok.sen
 * @see       sites_thematic
 * @generated
 */
public class sites_thematicWrapper implements sites_thematic,
	ModelWrapper<sites_thematic> {
	public sites_thematicWrapper(sites_thematic sites_thematic) {
		_sites_thematic = sites_thematic;
	}

	public Class<?> getModelClass() {
		return sites_thematic.class;
	}

	public String getModelClassName() {
		return sites_thematic.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sitethematicid", getSitethematicid());
		attributes.put("site_id", getSite_id());
		attributes.put("thematicid", getThematicid());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long sitethematicid = (Long)attributes.get("sitethematicid");

		if (sitethematicid != null) {
			setSitethematicid(sitethematicid);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long thematicid = (Long)attributes.get("thematicid");

		if (thematicid != null) {
			setThematicid(thematicid);
		}
	}

	/**
	* Returns the primary key of this sites_thematic.
	*
	* @return the primary key of this sites_thematic
	*/
	public long getPrimaryKey() {
		return _sites_thematic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sites_thematic.
	*
	* @param primaryKey the primary key of this sites_thematic
	*/
	public void setPrimaryKey(long primaryKey) {
		_sites_thematic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sitethematicid of this sites_thematic.
	*
	* @return the sitethematicid of this sites_thematic
	*/
	public long getSitethematicid() {
		return _sites_thematic.getSitethematicid();
	}

	/**
	* Sets the sitethematicid of this sites_thematic.
	*
	* @param sitethematicid the sitethematicid of this sites_thematic
	*/
	public void setSitethematicid(long sitethematicid) {
		_sites_thematic.setSitethematicid(sitethematicid);
	}

	/**
	* Returns the site_id of this sites_thematic.
	*
	* @return the site_id of this sites_thematic
	*/
	public long getSite_id() {
		return _sites_thematic.getSite_id();
	}

	/**
	* Sets the site_id of this sites_thematic.
	*
	* @param site_id the site_id of this sites_thematic
	*/
	public void setSite_id(long site_id) {
		_sites_thematic.setSite_id(site_id);
	}

	/**
	* Returns the thematicid of this sites_thematic.
	*
	* @return the thematicid of this sites_thematic
	*/
	public long getThematicid() {
		return _sites_thematic.getThematicid();
	}

	/**
	* Sets the thematicid of this sites_thematic.
	*
	* @param thematicid the thematicid of this sites_thematic
	*/
	public void setThematicid(long thematicid) {
		_sites_thematic.setThematicid(thematicid);
	}

	public boolean isNew() {
		return _sites_thematic.isNew();
	}

	public void setNew(boolean n) {
		_sites_thematic.setNew(n);
	}

	public boolean isCachedModel() {
		return _sites_thematic.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sites_thematic.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sites_thematic.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sites_thematic.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sites_thematic.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sites_thematic.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sites_thematic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new sites_thematicWrapper((sites_thematic)_sites_thematic.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic) {
		return _sites_thematic.compareTo(sites_thematic);
	}

	@Override
	public int hashCode() {
		return _sites_thematic.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.sites_thematic> toCacheModel() {
		return _sites_thematic.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.sites_thematic toEscapedModel() {
		return new sites_thematicWrapper(_sites_thematic.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sites_thematic.toString();
	}

	public java.lang.String toXmlString() {
		return _sites_thematic.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sites_thematic.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public sites_thematic getWrappedsites_thematic() {
		return _sites_thematic;
	}

	public sites_thematic getWrappedModel() {
		return _sites_thematic;
	}

	public void resetOriginalValues() {
		_sites_thematic.resetOriginalValues();
	}

	private sites_thematic _sites_thematic;
}