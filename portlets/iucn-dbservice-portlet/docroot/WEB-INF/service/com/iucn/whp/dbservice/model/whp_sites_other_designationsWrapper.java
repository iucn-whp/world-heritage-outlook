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
 * This class is a wrapper for {@link whp_sites_other_designations}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_other_designations
 * @generated
 */
public class whp_sites_other_designationsWrapper
	implements whp_sites_other_designations,
		ModelWrapper<whp_sites_other_designations> {
	public whp_sites_other_designationsWrapper(
		whp_sites_other_designations whp_sites_other_designations) {
		_whp_sites_other_designations = whp_sites_other_designations;
	}

	public Class<?> getModelClass() {
		return whp_sites_other_designations.class;
	}

	public String getModelClassName() {
		return whp_sites_other_designations.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_other_designations_id",
			getWhp_sites_other_designations_id());
		attributes.put("site_id", getSite_id());
		attributes.put("other_designation_id", getOther_designation_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_other_designations_id = (Long)attributes.get(
				"whp_sites_other_designations_id");

		if (whp_sites_other_designations_id != null) {
			setWhp_sites_other_designations_id(whp_sites_other_designations_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer other_designation_id = (Integer)attributes.get(
				"other_designation_id");

		if (other_designation_id != null) {
			setOther_designation_id(other_designation_id);
		}
	}

	/**
	* Returns the primary key of this whp_sites_other_designations.
	*
	* @return the primary key of this whp_sites_other_designations
	*/
	public long getPrimaryKey() {
		return _whp_sites_other_designations.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_other_designations.
	*
	* @param primaryKey the primary key of this whp_sites_other_designations
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_other_designations.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_other_designations_id of this whp_sites_other_designations.
	*
	* @return the whp_sites_other_designations_id of this whp_sites_other_designations
	*/
	public long getWhp_sites_other_designations_id() {
		return _whp_sites_other_designations.getWhp_sites_other_designations_id();
	}

	/**
	* Sets the whp_sites_other_designations_id of this whp_sites_other_designations.
	*
	* @param whp_sites_other_designations_id the whp_sites_other_designations_id of this whp_sites_other_designations
	*/
	public void setWhp_sites_other_designations_id(
		long whp_sites_other_designations_id) {
		_whp_sites_other_designations.setWhp_sites_other_designations_id(whp_sites_other_designations_id);
	}

	/**
	* Returns the site_id of this whp_sites_other_designations.
	*
	* @return the site_id of this whp_sites_other_designations
	*/
	public long getSite_id() {
		return _whp_sites_other_designations.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_other_designations.
	*
	* @param site_id the site_id of this whp_sites_other_designations
	*/
	public void setSite_id(long site_id) {
		_whp_sites_other_designations.setSite_id(site_id);
	}

	/**
	* Returns the other_designation_id of this whp_sites_other_designations.
	*
	* @return the other_designation_id of this whp_sites_other_designations
	*/
	public int getOther_designation_id() {
		return _whp_sites_other_designations.getOther_designation_id();
	}

	/**
	* Sets the other_designation_id of this whp_sites_other_designations.
	*
	* @param other_designation_id the other_designation_id of this whp_sites_other_designations
	*/
	public void setOther_designation_id(int other_designation_id) {
		_whp_sites_other_designations.setOther_designation_id(other_designation_id);
	}

	public boolean isNew() {
		return _whp_sites_other_designations.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_other_designations.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_other_designations.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_other_designations.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_other_designations.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_other_designations.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_other_designations.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_other_designations.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_other_designations.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_other_designationsWrapper((whp_sites_other_designations)_whp_sites_other_designations.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations) {
		return _whp_sites_other_designations.compareTo(whp_sites_other_designations);
	}

	@Override
	public int hashCode() {
		return _whp_sites_other_designations.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_other_designations> toCacheModel() {
		return _whp_sites_other_designations.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_other_designations toEscapedModel() {
		return new whp_sites_other_designationsWrapper(_whp_sites_other_designations.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_other_designations.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_other_designations.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_other_designations.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_other_designations getWrappedwhp_sites_other_designations() {
		return _whp_sites_other_designations;
	}

	public whp_sites_other_designations getWrappedModel() {
		return _whp_sites_other_designations;
	}

	public void resetOriginalValues() {
		_whp_sites_other_designations.resetOriginalValues();
	}

	private whp_sites_other_designations _whp_sites_other_designations;
}