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
 * This class is a wrapper for {@link assessment_whvalues_whcriterion}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_whvalues_whcriterion
 * @generated
 */
public class assessment_whvalues_whcriterionWrapper
	implements assessment_whvalues_whcriterion,
		ModelWrapper<assessment_whvalues_whcriterion> {
	public assessment_whvalues_whcriterionWrapper(
		assessment_whvalues_whcriterion assessment_whvalues_whcriterion) {
		_assessment_whvalues_whcriterion = assessment_whvalues_whcriterion;
	}

	public Class<?> getModelClass() {
		return assessment_whvalues_whcriterion.class;
	}

	public String getModelClassName() {
		return assessment_whvalues_whcriterion.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wh_criteria_id", getWh_criteria_id());
		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("criterion", getCriterion());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long wh_criteria_id = (Long)attributes.get("wh_criteria_id");

		if (wh_criteria_id != null) {
			setWh_criteria_id(wh_criteria_id);
		}

		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Long criterion = (Long)attributes.get("criterion");

		if (criterion != null) {
			setCriterion(criterion);
		}
	}

	/**
	* Returns the primary key of this assessment_whvalues_whcriterion.
	*
	* @return the primary key of this assessment_whvalues_whcriterion
	*/
	public long getPrimaryKey() {
		return _assessment_whvalues_whcriterion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_whvalues_whcriterion.
	*
	* @param primaryKey the primary key of this assessment_whvalues_whcriterion
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_whvalues_whcriterion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wh_criteria_id of this assessment_whvalues_whcriterion.
	*
	* @return the wh_criteria_id of this assessment_whvalues_whcriterion
	*/
	public long getWh_criteria_id() {
		return _assessment_whvalues_whcriterion.getWh_criteria_id();
	}

	/**
	* Sets the wh_criteria_id of this assessment_whvalues_whcriterion.
	*
	* @param wh_criteria_id the wh_criteria_id of this assessment_whvalues_whcriterion
	*/
	public void setWh_criteria_id(long wh_criteria_id) {
		_assessment_whvalues_whcriterion.setWh_criteria_id(wh_criteria_id);
	}

	/**
	* Returns the whvalues_id of this assessment_whvalues_whcriterion.
	*
	* @return the whvalues_id of this assessment_whvalues_whcriterion
	*/
	public long getWhvalues_id() {
		return _assessment_whvalues_whcriterion.getWhvalues_id();
	}

	/**
	* Sets the whvalues_id of this assessment_whvalues_whcriterion.
	*
	* @param whvalues_id the whvalues_id of this assessment_whvalues_whcriterion
	*/
	public void setWhvalues_id(long whvalues_id) {
		_assessment_whvalues_whcriterion.setWhvalues_id(whvalues_id);
	}

	/**
	* Returns the criterion of this assessment_whvalues_whcriterion.
	*
	* @return the criterion of this assessment_whvalues_whcriterion
	*/
	public long getCriterion() {
		return _assessment_whvalues_whcriterion.getCriterion();
	}

	/**
	* Sets the criterion of this assessment_whvalues_whcriterion.
	*
	* @param criterion the criterion of this assessment_whvalues_whcriterion
	*/
	public void setCriterion(long criterion) {
		_assessment_whvalues_whcriterion.setCriterion(criterion);
	}

	public boolean isNew() {
		return _assessment_whvalues_whcriterion.isNew();
	}

	public void setNew(boolean n) {
		_assessment_whvalues_whcriterion.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_whvalues_whcriterion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_whvalues_whcriterion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_whvalues_whcriterion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_whvalues_whcriterion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_whvalues_whcriterion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_whvalues_whcriterion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_whvalues_whcriterion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_whvalues_whcriterionWrapper((assessment_whvalues_whcriterion)_assessment_whvalues_whcriterion.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion) {
		return _assessment_whvalues_whcriterion.compareTo(assessment_whvalues_whcriterion);
	}

	@Override
	public int hashCode() {
		return _assessment_whvalues_whcriterion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> toCacheModel() {
		return _assessment_whvalues_whcriterion.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion toEscapedModel() {
		return new assessment_whvalues_whcriterionWrapper(_assessment_whvalues_whcriterion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_whvalues_whcriterion.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_whvalues_whcriterion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_whvalues_whcriterion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_whvalues_whcriterion getWrappedassessment_whvalues_whcriterion() {
		return _assessment_whvalues_whcriterion;
	}

	public assessment_whvalues_whcriterion getWrappedModel() {
		return _assessment_whvalues_whcriterion;
	}

	public void resetOriginalValues() {
		_assessment_whvalues_whcriterion.resetOriginalValues();
	}

	private assessment_whvalues_whcriterion _assessment_whvalues_whcriterion;
}