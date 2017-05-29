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
 * This class is a wrapper for {@link potential_threat_assessment_cat}.
 * </p>
 *
 * @author    alok.sen
 * @see       potential_threat_assessment_cat
 * @generated
 */
public class potential_threat_assessment_catWrapper
	implements potential_threat_assessment_cat,
		ModelWrapper<potential_threat_assessment_cat> {
	public potential_threat_assessment_catWrapper(
		potential_threat_assessment_cat potential_threat_assessment_cat) {
		_potential_threat_assessment_cat = potential_threat_assessment_cat;
	}

	public Class<?> getModelClass() {
		return potential_threat_assessment_cat.class;
	}

	public String getModelClassName() {
		return potential_threat_assessment_cat.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pot_threat_cat_id", getPot_threat_cat_id());
		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("sub_cat_id", getSub_cat_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long pot_threat_cat_id = (Long)attributes.get("pot_threat_cat_id");

		if (pot_threat_cat_id != null) {
			setPot_threat_cat_id(pot_threat_cat_id);
		}

		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
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
	* Returns the primary key of this potential_threat_assessment_cat.
	*
	* @return the primary key of this potential_threat_assessment_cat
	*/
	public long getPrimaryKey() {
		return _potential_threat_assessment_cat.getPrimaryKey();
	}

	/**
	* Sets the primary key of this potential_threat_assessment_cat.
	*
	* @param primaryKey the primary key of this potential_threat_assessment_cat
	*/
	public void setPrimaryKey(long primaryKey) {
		_potential_threat_assessment_cat.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pot_threat_cat_id of this potential_threat_assessment_cat.
	*
	* @return the pot_threat_cat_id of this potential_threat_assessment_cat
	*/
	public long getPot_threat_cat_id() {
		return _potential_threat_assessment_cat.getPot_threat_cat_id();
	}

	/**
	* Sets the pot_threat_cat_id of this potential_threat_assessment_cat.
	*
	* @param pot_threat_cat_id the pot_threat_cat_id of this potential_threat_assessment_cat
	*/
	public void setPot_threat_cat_id(long pot_threat_cat_id) {
		_potential_threat_assessment_cat.setPot_threat_cat_id(pot_threat_cat_id);
	}

	/**
	* Returns the potential_threat_id of this potential_threat_assessment_cat.
	*
	* @return the potential_threat_id of this potential_threat_assessment_cat
	*/
	public long getPotential_threat_id() {
		return _potential_threat_assessment_cat.getPotential_threat_id();
	}

	/**
	* Sets the potential_threat_id of this potential_threat_assessment_cat.
	*
	* @param potential_threat_id the potential_threat_id of this potential_threat_assessment_cat
	*/
	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_assessment_cat.setPotential_threat_id(potential_threat_id);
	}

	/**
	* Returns the category_id of this potential_threat_assessment_cat.
	*
	* @return the category_id of this potential_threat_assessment_cat
	*/
	public long getCategory_id() {
		return _potential_threat_assessment_cat.getCategory_id();
	}

	/**
	* Sets the category_id of this potential_threat_assessment_cat.
	*
	* @param category_id the category_id of this potential_threat_assessment_cat
	*/
	public void setCategory_id(long category_id) {
		_potential_threat_assessment_cat.setCategory_id(category_id);
	}

	/**
	* Returns the sub_cat_id of this potential_threat_assessment_cat.
	*
	* @return the sub_cat_id of this potential_threat_assessment_cat
	*/
	public long getSub_cat_id() {
		return _potential_threat_assessment_cat.getSub_cat_id();
	}

	/**
	* Sets the sub_cat_id of this potential_threat_assessment_cat.
	*
	* @param sub_cat_id the sub_cat_id of this potential_threat_assessment_cat
	*/
	public void setSub_cat_id(long sub_cat_id) {
		_potential_threat_assessment_cat.setSub_cat_id(sub_cat_id);
	}

	public boolean isNew() {
		return _potential_threat_assessment_cat.isNew();
	}

	public void setNew(boolean n) {
		_potential_threat_assessment_cat.setNew(n);
	}

	public boolean isCachedModel() {
		return _potential_threat_assessment_cat.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_potential_threat_assessment_cat.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _potential_threat_assessment_cat.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _potential_threat_assessment_cat.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_potential_threat_assessment_cat.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _potential_threat_assessment_cat.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_potential_threat_assessment_cat.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new potential_threat_assessment_catWrapper((potential_threat_assessment_cat)_potential_threat_assessment_cat.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.potential_threat_assessment_cat potential_threat_assessment_cat) {
		return _potential_threat_assessment_cat.compareTo(potential_threat_assessment_cat);
	}

	@Override
	public int hashCode() {
		return _potential_threat_assessment_cat.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> toCacheModel() {
		return _potential_threat_assessment_cat.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.potential_threat_assessment_cat toEscapedModel() {
		return new potential_threat_assessment_catWrapper(_potential_threat_assessment_cat.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _potential_threat_assessment_cat.toString();
	}

	public java.lang.String toXmlString() {
		return _potential_threat_assessment_cat.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_potential_threat_assessment_cat.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public potential_threat_assessment_cat getWrappedpotential_threat_assessment_cat() {
		return _potential_threat_assessment_cat;
	}

	public potential_threat_assessment_cat getWrappedModel() {
		return _potential_threat_assessment_cat;
	}

	public void resetOriginalValues() {
		_potential_threat_assessment_cat.resetOriginalValues();
	}

	private potential_threat_assessment_cat _potential_threat_assessment_cat;
}