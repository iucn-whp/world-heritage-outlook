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
 * This class is a wrapper for {@link conservation_outlook}.
 * </p>
 *
 * @author    alok.sen
 * @see       conservation_outlook
 * @generated
 */
public class conservation_outlookWrapper implements conservation_outlook,
	ModelWrapper<conservation_outlook> {
	public conservation_outlookWrapper(
		conservation_outlook conservation_outlook) {
		_conservation_outlook = conservation_outlook;
	}

	public Class<?> getModelClass() {
		return conservation_outlook.class;
	}

	public String getModelClassName() {
		return conservation_outlook.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("conservation_outlook_id", getConservation_outlook_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long conservation_outlook_id = (Long)attributes.get(
				"conservation_outlook_id");

		if (conservation_outlook_id != null) {
			setConservation_outlook_id(conservation_outlook_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
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
	* Returns the primary key of this conservation_outlook.
	*
	* @return the primary key of this conservation_outlook
	*/
	public long getPrimaryKey() {
		return _conservation_outlook.getPrimaryKey();
	}

	/**
	* Sets the primary key of this conservation_outlook.
	*
	* @param primaryKey the primary key of this conservation_outlook
	*/
	public void setPrimaryKey(long primaryKey) {
		_conservation_outlook.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the conservation_outlook_id of this conservation_outlook.
	*
	* @return the conservation_outlook_id of this conservation_outlook
	*/
	public long getConservation_outlook_id() {
		return _conservation_outlook.getConservation_outlook_id();
	}

	/**
	* Sets the conservation_outlook_id of this conservation_outlook.
	*
	* @param conservation_outlook_id the conservation_outlook_id of this conservation_outlook
	*/
	public void setConservation_outlook_id(long conservation_outlook_id) {
		_conservation_outlook.setConservation_outlook_id(conservation_outlook_id);
	}

	/**
	* Returns the assessment_version_id of this conservation_outlook.
	*
	* @return the assessment_version_id of this conservation_outlook
	*/
	public long getAssessment_version_id() {
		return _conservation_outlook.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this conservation_outlook.
	*
	* @param assessment_version_id the assessment_version_id of this conservation_outlook
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_conservation_outlook.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the justification of this conservation_outlook.
	*
	* @return the justification of this conservation_outlook
	*/
	public java.lang.String getJustification() {
		return _conservation_outlook.getJustification();
	}

	/**
	* Sets the justification of this conservation_outlook.
	*
	* @param justification the justification of this conservation_outlook
	*/
	public void setJustification(java.lang.String justification) {
		_conservation_outlook.setJustification(justification);
	}

	/**
	* Returns the rating of this conservation_outlook.
	*
	* @return the rating of this conservation_outlook
	*/
	public long getRating() {
		return _conservation_outlook.getRating();
	}

	/**
	* Sets the rating of this conservation_outlook.
	*
	* @param rating the rating of this conservation_outlook
	*/
	public void setRating(long rating) {
		_conservation_outlook.setRating(rating);
	}

	public boolean isNew() {
		return _conservation_outlook.isNew();
	}

	public void setNew(boolean n) {
		_conservation_outlook.setNew(n);
	}

	public boolean isCachedModel() {
		return _conservation_outlook.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_conservation_outlook.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _conservation_outlook.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _conservation_outlook.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_conservation_outlook.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _conservation_outlook.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_conservation_outlook.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new conservation_outlookWrapper((conservation_outlook)_conservation_outlook.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook) {
		return _conservation_outlook.compareTo(conservation_outlook);
	}

	@Override
	public int hashCode() {
		return _conservation_outlook.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.conservation_outlook> toCacheModel() {
		return _conservation_outlook.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.conservation_outlook toEscapedModel() {
		return new conservation_outlookWrapper(_conservation_outlook.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _conservation_outlook.toString();
	}

	public java.lang.String toXmlString() {
		return _conservation_outlook.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_conservation_outlook.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public conservation_outlook getWrappedconservation_outlook() {
		return _conservation_outlook;
	}

	public conservation_outlook getWrappedModel() {
		return _conservation_outlook;
	}

	public void resetOriginalValues() {
		_conservation_outlook.resetOriginalValues();
	}

	private conservation_outlook _conservation_outlook;
}