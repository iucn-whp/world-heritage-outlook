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
 * This class is a wrapper for {@link negative_factors_level_impact}.
 * </p>
 *
 * @author    alok.sen
 * @see       negative_factors_level_impact
 * @generated
 */
public class negative_factors_level_impactWrapper
	implements negative_factors_level_impact,
		ModelWrapper<negative_factors_level_impact> {
	public negative_factors_level_impactWrapper(
		negative_factors_level_impact negative_factors_level_impact) {
		_negative_factors_level_impact = negative_factors_level_impact;
	}

	public Class<?> getModelClass() {
		return negative_factors_level_impact.class;
	}

	public String getModelClassName() {
		return negative_factors_level_impact.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("level_id", getLevel_id());
		attributes.put("level_impact", getLevel_impact());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long level_id = (Long)attributes.get("level_id");

		if (level_id != null) {
			setLevel_id(level_id);
		}

		String level_impact = (String)attributes.get("level_impact");

		if (level_impact != null) {
			setLevel_impact(level_impact);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this negative_factors_level_impact.
	*
	* @return the primary key of this negative_factors_level_impact
	*/
	public long getPrimaryKey() {
		return _negative_factors_level_impact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this negative_factors_level_impact.
	*
	* @param primaryKey the primary key of this negative_factors_level_impact
	*/
	public void setPrimaryKey(long primaryKey) {
		_negative_factors_level_impact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the level_id of this negative_factors_level_impact.
	*
	* @return the level_id of this negative_factors_level_impact
	*/
	public long getLevel_id() {
		return _negative_factors_level_impact.getLevel_id();
	}

	/**
	* Sets the level_id of this negative_factors_level_impact.
	*
	* @param level_id the level_id of this negative_factors_level_impact
	*/
	public void setLevel_id(long level_id) {
		_negative_factors_level_impact.setLevel_id(level_id);
	}

	/**
	* Returns the level_impact of this negative_factors_level_impact.
	*
	* @return the level_impact of this negative_factors_level_impact
	*/
	public java.lang.String getLevel_impact() {
		return _negative_factors_level_impact.getLevel_impact();
	}

	/**
	* Sets the level_impact of this negative_factors_level_impact.
	*
	* @param level_impact the level_impact of this negative_factors_level_impact
	*/
	public void setLevel_impact(java.lang.String level_impact) {
		_negative_factors_level_impact.setLevel_impact(level_impact);
	}

	/**
	* Returns the description of this negative_factors_level_impact.
	*
	* @return the description of this negative_factors_level_impact
	*/
	public java.lang.String getDescription() {
		return _negative_factors_level_impact.getDescription();
	}

	/**
	* Sets the description of this negative_factors_level_impact.
	*
	* @param description the description of this negative_factors_level_impact
	*/
	public void setDescription(java.lang.String description) {
		_negative_factors_level_impact.setDescription(description);
	}

	public boolean isNew() {
		return _negative_factors_level_impact.isNew();
	}

	public void setNew(boolean n) {
		_negative_factors_level_impact.setNew(n);
	}

	public boolean isCachedModel() {
		return _negative_factors_level_impact.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_negative_factors_level_impact.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _negative_factors_level_impact.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _negative_factors_level_impact.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_negative_factors_level_impact.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _negative_factors_level_impact.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_negative_factors_level_impact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new negative_factors_level_impactWrapper((negative_factors_level_impact)_negative_factors_level_impact.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact) {
		return _negative_factors_level_impact.compareTo(negative_factors_level_impact);
	}

	@Override
	public int hashCode() {
		return _negative_factors_level_impact.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.negative_factors_level_impact> toCacheModel() {
		return _negative_factors_level_impact.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.negative_factors_level_impact toEscapedModel() {
		return new negative_factors_level_impactWrapper(_negative_factors_level_impact.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _negative_factors_level_impact.toString();
	}

	public java.lang.String toXmlString() {
		return _negative_factors_level_impact.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_negative_factors_level_impact.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public negative_factors_level_impact getWrappednegative_factors_level_impact() {
		return _negative_factors_level_impact;
	}

	public negative_factors_level_impact getWrappedModel() {
		return _negative_factors_level_impact;
	}

	public void resetOriginalValues() {
		_negative_factors_level_impact.resetOriginalValues();
	}

	private negative_factors_level_impact _negative_factors_level_impact;
}