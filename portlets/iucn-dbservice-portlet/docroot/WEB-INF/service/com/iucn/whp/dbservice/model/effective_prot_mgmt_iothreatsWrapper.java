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
 * This class is a wrapper for {@link effective_prot_mgmt_iothreats}.
 * </p>
 *
 * @author    alok.sen
 * @see       effective_prot_mgmt_iothreats
 * @generated
 */
public class effective_prot_mgmt_iothreatsWrapper
	implements effective_prot_mgmt_iothreats,
		ModelWrapper<effective_prot_mgmt_iothreats> {
	public effective_prot_mgmt_iothreatsWrapper(
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		_effective_prot_mgmt_iothreats = effective_prot_mgmt_iothreats;
	}

	public Class<?> getModelClass() {
		return effective_prot_mgmt_iothreats.class;
	}

	public String getModelClassName() {
		return effective_prot_mgmt_iothreats.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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
	* Returns the primary key of this effective_prot_mgmt_iothreats.
	*
	* @return the primary key of this effective_prot_mgmt_iothreats
	*/
	public long getPrimaryKey() {
		return _effective_prot_mgmt_iothreats.getPrimaryKey();
	}

	/**
	* Sets the primary key of this effective_prot_mgmt_iothreats.
	*
	* @param primaryKey the primary key of this effective_prot_mgmt_iothreats
	*/
	public void setPrimaryKey(long primaryKey) {
		_effective_prot_mgmt_iothreats.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this effective_prot_mgmt_iothreats.
	*
	* @return the ID of this effective_prot_mgmt_iothreats
	*/
	public long getId() {
		return _effective_prot_mgmt_iothreats.getId();
	}

	/**
	* Sets the ID of this effective_prot_mgmt_iothreats.
	*
	* @param id the ID of this effective_prot_mgmt_iothreats
	*/
	public void setId(long id) {
		_effective_prot_mgmt_iothreats.setId(id);
	}

	/**
	* Returns the assessment_version_id of this effective_prot_mgmt_iothreats.
	*
	* @return the assessment_version_id of this effective_prot_mgmt_iothreats
	*/
	public long getAssessment_version_id() {
		return _effective_prot_mgmt_iothreats.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this effective_prot_mgmt_iothreats.
	*
	* @param assessment_version_id the assessment_version_id of this effective_prot_mgmt_iothreats
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_effective_prot_mgmt_iothreats.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the justification of this effective_prot_mgmt_iothreats.
	*
	* @return the justification of this effective_prot_mgmt_iothreats
	*/
	public java.lang.String getJustification() {
		return _effective_prot_mgmt_iothreats.getJustification();
	}

	/**
	* Sets the justification of this effective_prot_mgmt_iothreats.
	*
	* @param justification the justification of this effective_prot_mgmt_iothreats
	*/
	public void setJustification(java.lang.String justification) {
		_effective_prot_mgmt_iothreats.setJustification(justification);
	}

	/**
	* Returns the rating of this effective_prot_mgmt_iothreats.
	*
	* @return the rating of this effective_prot_mgmt_iothreats
	*/
	public long getRating() {
		return _effective_prot_mgmt_iothreats.getRating();
	}

	/**
	* Sets the rating of this effective_prot_mgmt_iothreats.
	*
	* @param rating the rating of this effective_prot_mgmt_iothreats
	*/
	public void setRating(long rating) {
		_effective_prot_mgmt_iothreats.setRating(rating);
	}

	public boolean isNew() {
		return _effective_prot_mgmt_iothreats.isNew();
	}

	public void setNew(boolean n) {
		_effective_prot_mgmt_iothreats.setNew(n);
	}

	public boolean isCachedModel() {
		return _effective_prot_mgmt_iothreats.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_effective_prot_mgmt_iothreats.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _effective_prot_mgmt_iothreats.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _effective_prot_mgmt_iothreats.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_effective_prot_mgmt_iothreats.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _effective_prot_mgmt_iothreats.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_effective_prot_mgmt_iothreats.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new effective_prot_mgmt_iothreatsWrapper((effective_prot_mgmt_iothreats)_effective_prot_mgmt_iothreats.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		return _effective_prot_mgmt_iothreats.compareTo(effective_prot_mgmt_iothreats);
	}

	@Override
	public int hashCode() {
		return _effective_prot_mgmt_iothreats.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> toCacheModel() {
		return _effective_prot_mgmt_iothreats.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats toEscapedModel() {
		return new effective_prot_mgmt_iothreatsWrapper(_effective_prot_mgmt_iothreats.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _effective_prot_mgmt_iothreats.toString();
	}

	public java.lang.String toXmlString() {
		return _effective_prot_mgmt_iothreats.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_effective_prot_mgmt_iothreats.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public effective_prot_mgmt_iothreats getWrappedeffective_prot_mgmt_iothreats() {
		return _effective_prot_mgmt_iothreats;
	}

	public effective_prot_mgmt_iothreats getWrappedModel() {
		return _effective_prot_mgmt_iothreats;
	}

	public void resetOriginalValues() {
		_effective_prot_mgmt_iothreats.resetOriginalValues();
	}

	private effective_prot_mgmt_iothreats _effective_prot_mgmt_iothreats;
}