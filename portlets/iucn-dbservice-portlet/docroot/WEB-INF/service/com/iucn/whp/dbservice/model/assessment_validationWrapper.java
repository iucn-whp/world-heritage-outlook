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
 * This class is a wrapper for {@link assessment_validation}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_validation
 * @generated
 */
public class assessment_validationWrapper implements assessment_validation,
	ModelWrapper<assessment_validation> {
	public assessment_validationWrapper(
		assessment_validation assessment_validation) {
		_assessment_validation = assessment_validation;
	}

	public Class<?> getModelClass() {
		return assessment_validation.class;
	}

	public String getModelClassName() {
		return assessment_validation.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_ver_val_id", getAssessment_ver_val_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("assessment_step", getAssessment_step());
		attributes.put("validation_complete", getValidation_complete());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_ver_val_id = (Long)attributes.get(
				"assessment_ver_val_id");

		if (assessment_ver_val_id != null) {
			setAssessment_ver_val_id(assessment_ver_val_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long assessment_step = (Long)attributes.get("assessment_step");

		if (assessment_step != null) {
			setAssessment_step(assessment_step);
		}

		Boolean validation_complete = (Boolean)attributes.get(
				"validation_complete");

		if (validation_complete != null) {
			setValidation_complete(validation_complete);
		}
	}

	/**
	* Returns the primary key of this assessment_validation.
	*
	* @return the primary key of this assessment_validation
	*/
	public long getPrimaryKey() {
		return _assessment_validation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_validation.
	*
	* @param primaryKey the primary key of this assessment_validation
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_validation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the assessment_ver_val_id of this assessment_validation.
	*
	* @return the assessment_ver_val_id of this assessment_validation
	*/
	public long getAssessment_ver_val_id() {
		return _assessment_validation.getAssessment_ver_val_id();
	}

	/**
	* Sets the assessment_ver_val_id of this assessment_validation.
	*
	* @param assessment_ver_val_id the assessment_ver_val_id of this assessment_validation
	*/
	public void setAssessment_ver_val_id(long assessment_ver_val_id) {
		_assessment_validation.setAssessment_ver_val_id(assessment_ver_val_id);
	}

	/**
	* Returns the assessment_version_id of this assessment_validation.
	*
	* @return the assessment_version_id of this assessment_validation
	*/
	public long getAssessment_version_id() {
		return _assessment_validation.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this assessment_validation.
	*
	* @param assessment_version_id the assessment_version_id of this assessment_validation
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_validation.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the assessment_step of this assessment_validation.
	*
	* @return the assessment_step of this assessment_validation
	*/
	public long getAssessment_step() {
		return _assessment_validation.getAssessment_step();
	}

	/**
	* Sets the assessment_step of this assessment_validation.
	*
	* @param assessment_step the assessment_step of this assessment_validation
	*/
	public void setAssessment_step(long assessment_step) {
		_assessment_validation.setAssessment_step(assessment_step);
	}

	/**
	* Returns the validation_complete of this assessment_validation.
	*
	* @return the validation_complete of this assessment_validation
	*/
	public boolean getValidation_complete() {
		return _assessment_validation.getValidation_complete();
	}

	/**
	* Returns <code>true</code> if this assessment_validation is validation_complete.
	*
	* @return <code>true</code> if this assessment_validation is validation_complete; <code>false</code> otherwise
	*/
	public boolean isValidation_complete() {
		return _assessment_validation.isValidation_complete();
	}

	/**
	* Sets whether this assessment_validation is validation_complete.
	*
	* @param validation_complete the validation_complete of this assessment_validation
	*/
	public void setValidation_complete(boolean validation_complete) {
		_assessment_validation.setValidation_complete(validation_complete);
	}

	public boolean isNew() {
		return _assessment_validation.isNew();
	}

	public void setNew(boolean n) {
		_assessment_validation.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_validation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_validation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_validation.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_validation.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_validation.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_validation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_validation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_validationWrapper((assessment_validation)_assessment_validation.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation) {
		return _assessment_validation.compareTo(assessment_validation);
	}

	@Override
	public int hashCode() {
		return _assessment_validation.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_validation> toCacheModel() {
		return _assessment_validation.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_validation toEscapedModel() {
		return new assessment_validationWrapper(_assessment_validation.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_validation.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_validation.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_validation.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_validation getWrappedassessment_validation() {
		return _assessment_validation;
	}

	public assessment_validation getWrappedModel() {
		return _assessment_validation;
	}

	public void resetOriginalValues() {
		_assessment_validation.resetOriginalValues();
	}

	private assessment_validation _assessment_validation;
}