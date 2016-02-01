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
 * This class is a wrapper for {@link assessment_whvalues}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_whvalues
 * @generated
 */
public class assessment_whvaluesWrapper implements assessment_whvalues,
	ModelWrapper<assessment_whvalues> {
	public assessment_whvaluesWrapper(assessment_whvalues assessment_whvalues) {
		_assessment_whvalues = assessment_whvalues;
	}

	public Class<?> getModelClass() {
		return assessment_whvalues.class;
	}

	public String getModelClassName() {
		return assessment_whvalues.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whvalues_id", getWhvalues_id());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("values", getValues());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whvalues_id = (Long)attributes.get("whvalues_id");

		if (whvalues_id != null) {
			setWhvalues_id(whvalues_id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String values = (String)attributes.get("values");

		if (values != null) {
			setValues(values);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this assessment_whvalues.
	*
	* @return the primary key of this assessment_whvalues
	*/
	public long getPrimaryKey() {
		return _assessment_whvalues.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_whvalues.
	*
	* @param primaryKey the primary key of this assessment_whvalues
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_whvalues.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whvalues_id of this assessment_whvalues.
	*
	* @return the whvalues_id of this assessment_whvalues
	*/
	public long getWhvalues_id() {
		return _assessment_whvalues.getWhvalues_id();
	}

	/**
	* Sets the whvalues_id of this assessment_whvalues.
	*
	* @param whvalues_id the whvalues_id of this assessment_whvalues
	*/
	public void setWhvalues_id(long whvalues_id) {
		_assessment_whvalues.setWhvalues_id(whvalues_id);
	}

	/**
	* Returns the vn of this assessment_whvalues.
	*
	* @return the vn of this assessment_whvalues
	*/
	public long getVn() {
		return _assessment_whvalues.getVn();
	}

	/**
	* Sets the vn of this assessment_whvalues.
	*
	* @param vn the vn of this assessment_whvalues
	*/
	public void setVn(long vn) {
		_assessment_whvalues.setVn(vn);
	}

	/**
	* Returns the assessment_version_id of this assessment_whvalues.
	*
	* @return the assessment_version_id of this assessment_whvalues
	*/
	public long getAssessment_version_id() {
		return _assessment_whvalues.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this assessment_whvalues.
	*
	* @param assessment_version_id the assessment_version_id of this assessment_whvalues
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_whvalues.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the values of this assessment_whvalues.
	*
	* @return the values of this assessment_whvalues
	*/
	public java.lang.String getValues() {
		return _assessment_whvalues.getValues();
	}

	/**
	* Sets the values of this assessment_whvalues.
	*
	* @param values the values of this assessment_whvalues
	*/
	public void setValues(java.lang.String values) {
		_assessment_whvalues.setValues(values);
	}

	/**
	* Returns the description of this assessment_whvalues.
	*
	* @return the description of this assessment_whvalues
	*/
	public java.lang.String getDescription() {
		return _assessment_whvalues.getDescription();
	}

	/**
	* Sets the description of this assessment_whvalues.
	*
	* @param description the description of this assessment_whvalues
	*/
	public void setDescription(java.lang.String description) {
		_assessment_whvalues.setDescription(description);
	}

	public boolean isNew() {
		return _assessment_whvalues.isNew();
	}

	public void setNew(boolean n) {
		_assessment_whvalues.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_whvalues.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_whvalues.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_whvalues.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_whvalues.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_whvalues.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_whvalues.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_whvalues.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_whvaluesWrapper((assessment_whvalues)_assessment_whvalues.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues) {
		return _assessment_whvalues.compareTo(assessment_whvalues);
	}

	@Override
	public int hashCode() {
		return _assessment_whvalues.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_whvalues> toCacheModel() {
		return _assessment_whvalues.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_whvalues toEscapedModel() {
		return new assessment_whvaluesWrapper(_assessment_whvalues.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_whvalues.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_whvalues.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_whvalues.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_whvalues getWrappedassessment_whvalues() {
		return _assessment_whvalues;
	}

	public assessment_whvalues getWrappedModel() {
		return _assessment_whvalues;
	}

	public void resetOriginalValues() {
		_assessment_whvalues.resetOriginalValues();
	}

	private assessment_whvalues _assessment_whvalues;
}