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
 * This class is a wrapper for {@link current_threat_assessment_cat}.
 * </p>
 *
 * @author    alok.sen
 * @see       current_threat_assessment_cat
 * @generated
 */
public class current_threat_assessment_catWrapper
	implements current_threat_assessment_cat,
		ModelWrapper<current_threat_assessment_cat> {
	public current_threat_assessment_catWrapper(
		current_threat_assessment_cat current_threat_assessment_cat) {
		_current_threat_assessment_cat = current_threat_assessment_cat;
	}

	public Class<?> getModelClass() {
		return current_threat_assessment_cat.class;
	}

	public String getModelClassName() {
		return current_threat_assessment_cat.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cur_threat_cat_id", getCur_threat_cat_id());
		attributes.put("current_threat_id", getCurrent_threat_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("sub_cat_id", getSub_cat_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long cur_threat_cat_id = (Long)attributes.get("cur_threat_cat_id");

		if (cur_threat_cat_id != null) {
			setCur_threat_cat_id(cur_threat_cat_id);
		}

		Long current_threat_id = (Long)attributes.get("current_threat_id");

		if (current_threat_id != null) {
			setCurrent_threat_id(current_threat_id);
		}

		Long category_id = (Long)attributes.get("category_id");

		if (category_id != null) {
			setCategory_id(category_id);
		}

		Long sub_cat_id = (Long)attributes.get("sub_cat_id");

		if (sub_cat_id != null) {
			setSub_cat_id(sub_cat_id);
		}
	}

	/**
	* Returns the primary key of this current_threat_assessment_cat.
	*
	* @return the primary key of this current_threat_assessment_cat
	*/
	public long getPrimaryKey() {
		return _current_threat_assessment_cat.getPrimaryKey();
	}

	/**
	* Sets the primary key of this current_threat_assessment_cat.
	*
	* @param primaryKey the primary key of this current_threat_assessment_cat
	*/
	public void setPrimaryKey(long primaryKey) {
		_current_threat_assessment_cat.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cur_threat_cat_id of this current_threat_assessment_cat.
	*
	* @return the cur_threat_cat_id of this current_threat_assessment_cat
	*/
	public long getCur_threat_cat_id() {
		return _current_threat_assessment_cat.getCur_threat_cat_id();
	}

	/**
	* Sets the cur_threat_cat_id of this current_threat_assessment_cat.
	*
	* @param cur_threat_cat_id the cur_threat_cat_id of this current_threat_assessment_cat
	*/
	public void setCur_threat_cat_id(long cur_threat_cat_id) {
		_current_threat_assessment_cat.setCur_threat_cat_id(cur_threat_cat_id);
	}

	/**
	* Returns the current_threat_id of this current_threat_assessment_cat.
	*
	* @return the current_threat_id of this current_threat_assessment_cat
	*/
	public long getCurrent_threat_id() {
		return _current_threat_assessment_cat.getCurrent_threat_id();
	}

	/**
	* Sets the current_threat_id of this current_threat_assessment_cat.
	*
	* @param current_threat_id the current_threat_id of this current_threat_assessment_cat
	*/
	public void setCurrent_threat_id(long current_threat_id) {
		_current_threat_assessment_cat.setCurrent_threat_id(current_threat_id);
	}

	/**
	* Returns the category_id of this current_threat_assessment_cat.
	*
	* @return the category_id of this current_threat_assessment_cat
	*/
	public long getCategory_id() {
		return _current_threat_assessment_cat.getCategory_id();
	}

	/**
	* Sets the category_id of this current_threat_assessment_cat.
	*
	* @param category_id the category_id of this current_threat_assessment_cat
	*/
	public void setCategory_id(long category_id) {
		_current_threat_assessment_cat.setCategory_id(category_id);
	}

	/**
	* Returns the sub_cat_id of this current_threat_assessment_cat.
	*
	* @return the sub_cat_id of this current_threat_assessment_cat
	*/
	public long getSub_cat_id() {
		return _current_threat_assessment_cat.getSub_cat_id();
	}

	/**
	* Sets the sub_cat_id of this current_threat_assessment_cat.
	*
	* @param sub_cat_id the sub_cat_id of this current_threat_assessment_cat
	*/
	public void setSub_cat_id(long sub_cat_id) {
		_current_threat_assessment_cat.setSub_cat_id(sub_cat_id);
	}

	public boolean isNew() {
		return _current_threat_assessment_cat.isNew();
	}

	public void setNew(boolean n) {
		_current_threat_assessment_cat.setNew(n);
	}

	public boolean isCachedModel() {
		return _current_threat_assessment_cat.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_current_threat_assessment_cat.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _current_threat_assessment_cat.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _current_threat_assessment_cat.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_current_threat_assessment_cat.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _current_threat_assessment_cat.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_current_threat_assessment_cat.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new current_threat_assessment_catWrapper((current_threat_assessment_cat)_current_threat_assessment_cat.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.current_threat_assessment_cat current_threat_assessment_cat) {
		return _current_threat_assessment_cat.compareTo(current_threat_assessment_cat);
	}

	@Override
	public int hashCode() {
		return _current_threat_assessment_cat.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.current_threat_assessment_cat> toCacheModel() {
		return _current_threat_assessment_cat.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.current_threat_assessment_cat toEscapedModel() {
		return new current_threat_assessment_catWrapper(_current_threat_assessment_cat.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _current_threat_assessment_cat.toString();
	}

	public java.lang.String toXmlString() {
		return _current_threat_assessment_cat.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_current_threat_assessment_cat.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public current_threat_assessment_cat getWrappedcurrent_threat_assessment_cat() {
		return _current_threat_assessment_cat;
	}

	public current_threat_assessment_cat getWrappedModel() {
		return _current_threat_assessment_cat;
	}

	public void resetOriginalValues() {
		_current_threat_assessment_cat.resetOriginalValues();
	}

	private current_threat_assessment_cat _current_threat_assessment_cat;
}