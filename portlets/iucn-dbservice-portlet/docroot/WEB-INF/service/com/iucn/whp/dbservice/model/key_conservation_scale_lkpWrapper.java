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
 * This class is a wrapper for {@link key_conservation_scale_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       key_conservation_scale_lkp
 * @generated
 */
public class key_conservation_scale_lkpWrapper
	implements key_conservation_scale_lkp,
		ModelWrapper<key_conservation_scale_lkp> {
	public key_conservation_scale_lkpWrapper(
		key_conservation_scale_lkp key_conservation_scale_lkp) {
		_key_conservation_scale_lkp = key_conservation_scale_lkp;
	}

	public Class<?> getModelClass() {
		return key_conservation_scale_lkp.class;
	}

	public String getModelClassName() {
		return key_conservation_scale_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scale_id", getScale_id());
		attributes.put("scale", getScale());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long scale_id = (Long)attributes.get("scale_id");

		if (scale_id != null) {
			setScale_id(scale_id);
		}

		String scale = (String)attributes.get("scale");

		if (scale != null) {
			setScale(scale);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this key_conservation_scale_lkp.
	*
	* @return the primary key of this key_conservation_scale_lkp
	*/
	public long getPrimaryKey() {
		return _key_conservation_scale_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this key_conservation_scale_lkp.
	*
	* @param primaryKey the primary key of this key_conservation_scale_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_key_conservation_scale_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the scale_id of this key_conservation_scale_lkp.
	*
	* @return the scale_id of this key_conservation_scale_lkp
	*/
	public long getScale_id() {
		return _key_conservation_scale_lkp.getScale_id();
	}

	/**
	* Sets the scale_id of this key_conservation_scale_lkp.
	*
	* @param scale_id the scale_id of this key_conservation_scale_lkp
	*/
	public void setScale_id(long scale_id) {
		_key_conservation_scale_lkp.setScale_id(scale_id);
	}

	/**
	* Returns the scale of this key_conservation_scale_lkp.
	*
	* @return the scale of this key_conservation_scale_lkp
	*/
	public java.lang.String getScale() {
		return _key_conservation_scale_lkp.getScale();
	}

	/**
	* Sets the scale of this key_conservation_scale_lkp.
	*
	* @param scale the scale of this key_conservation_scale_lkp
	*/
	public void setScale(java.lang.String scale) {
		_key_conservation_scale_lkp.setScale(scale);
	}

	/**
	* Returns the description of this key_conservation_scale_lkp.
	*
	* @return the description of this key_conservation_scale_lkp
	*/
	public java.lang.String getDescription() {
		return _key_conservation_scale_lkp.getDescription();
	}

	/**
	* Sets the description of this key_conservation_scale_lkp.
	*
	* @param description the description of this key_conservation_scale_lkp
	*/
	public void setDescription(java.lang.String description) {
		_key_conservation_scale_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _key_conservation_scale_lkp.isNew();
	}

	public void setNew(boolean n) {
		_key_conservation_scale_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _key_conservation_scale_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_key_conservation_scale_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _key_conservation_scale_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _key_conservation_scale_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_key_conservation_scale_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _key_conservation_scale_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_key_conservation_scale_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new key_conservation_scale_lkpWrapper((key_conservation_scale_lkp)_key_conservation_scale_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp) {
		return _key_conservation_scale_lkp.compareTo(key_conservation_scale_lkp);
	}

	@Override
	public int hashCode() {
		return _key_conservation_scale_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.key_conservation_scale_lkp> toCacheModel() {
		return _key_conservation_scale_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp toEscapedModel() {
		return new key_conservation_scale_lkpWrapper(_key_conservation_scale_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _key_conservation_scale_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _key_conservation_scale_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_key_conservation_scale_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public key_conservation_scale_lkp getWrappedkey_conservation_scale_lkp() {
		return _key_conservation_scale_lkp;
	}

	public key_conservation_scale_lkp getWrappedModel() {
		return _key_conservation_scale_lkp;
	}

	public void resetOriginalValues() {
		_key_conservation_scale_lkp.resetOriginalValues();
	}

	private key_conservation_scale_lkp _key_conservation_scale_lkp;
}