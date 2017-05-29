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
 * This class is a wrapper for {@link protection_management}.
 * </p>
 *
 * @author    alok.sen
 * @see       protection_management
 * @generated
 */
public class protection_managementWrapper implements protection_management,
	ModelWrapper<protection_management> {
	public protection_managementWrapper(
		protection_management protection_management) {
		_protection_management = protection_management;
	}

	public Class<?> getModelClass() {
		return protection_management.class;
	}

	public String getModelClassName() {
		return protection_management.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pm_id", getPm_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("topic_id", getTopic_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long pm_id = (Long)attributes.get("pm_id");

		if (pm_id != null) {
			setPm_id(pm_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long topic_id = (Long)attributes.get("topic_id");

		if (topic_id != null) {
			setTopic_id(topic_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long rating = (Long)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	/**
	* Returns the primary key of this protection_management.
	*
	* @return the primary key of this protection_management
	*/
	public long getPrimaryKey() {
		return _protection_management.getPrimaryKey();
	}

	/**
	* Sets the primary key of this protection_management.
	*
	* @param primaryKey the primary key of this protection_management
	*/
	public void setPrimaryKey(long primaryKey) {
		_protection_management.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pm_id of this protection_management.
	*
	* @return the pm_id of this protection_management
	*/
	public long getPm_id() {
		return _protection_management.getPm_id();
	}

	/**
	* Sets the pm_id of this protection_management.
	*
	* @param pm_id the pm_id of this protection_management
	*/
	public void setPm_id(long pm_id) {
		_protection_management.setPm_id(pm_id);
	}

	/**
	* Returns the assessment_version_id of this protection_management.
	*
	* @return the assessment_version_id of this protection_management
	*/
	public long getAssessment_version_id() {
		return _protection_management.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this protection_management.
	*
	* @param assessment_version_id the assessment_version_id of this protection_management
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_protection_management.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the topic_id of this protection_management.
	*
	* @return the topic_id of this protection_management
	*/
	public long getTopic_id() {
		return _protection_management.getTopic_id();
	}

	/**
	* Sets the topic_id of this protection_management.
	*
	* @param topic_id the topic_id of this protection_management
	*/
	public void setTopic_id(long topic_id) {
		_protection_management.setTopic_id(topic_id);
	}

	/**
	* Returns the justification of this protection_management.
	*
	* @return the justification of this protection_management
	*/
	public java.lang.String getJustification() {
		return _protection_management.getJustification();
	}

	/**
	* Sets the justification of this protection_management.
	*
	* @param justification the justification of this protection_management
	*/
	public void setJustification(java.lang.String justification) {
		_protection_management.setJustification(justification);
	}

	/**
	* Returns the rating of this protection_management.
	*
	* @return the rating of this protection_management
	*/
	public long getRating() {
		return _protection_management.getRating();
	}

	/**
	* Sets the rating of this protection_management.
	*
	* @param rating the rating of this protection_management
	*/
	public void setRating(long rating) {
		_protection_management.setRating(rating);
	}

	public boolean isNew() {
		return _protection_management.isNew();
	}

	public void setNew(boolean n) {
		_protection_management.setNew(n);
	}

	public boolean isCachedModel() {
		return _protection_management.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_protection_management.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _protection_management.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _protection_management.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_protection_management.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _protection_management.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_protection_management.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new protection_managementWrapper((protection_management)_protection_management.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.protection_management protection_management) {
		return _protection_management.compareTo(protection_management);
	}

	@Override
	public int hashCode() {
		return _protection_management.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.protection_management> toCacheModel() {
		return _protection_management.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.protection_management toEscapedModel() {
		return new protection_managementWrapper(_protection_management.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _protection_management.toString();
	}

	public java.lang.String toXmlString() {
		return _protection_management.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_protection_management.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public protection_management getWrappedprotection_management() {
		return _protection_management;
	}

	public protection_management getWrappedModel() {
		return _protection_management;
	}

	public void resetOriginalValues() {
		_protection_management.resetOriginalValues();
	}

	private protection_management _protection_management;
}