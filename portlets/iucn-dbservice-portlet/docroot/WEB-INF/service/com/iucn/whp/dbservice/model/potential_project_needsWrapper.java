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
 * This class is a wrapper for {@link potential_project_needs}.
 * </p>
 *
 * @author    alok.sen
 * @see       potential_project_needs
 * @generated
 */
public class potential_project_needsWrapper implements potential_project_needs,
	ModelWrapper<potential_project_needs> {
	public potential_project_needsWrapper(
		potential_project_needs potential_project_needs) {
		_potential_project_needs = potential_project_needs;
	}

	public Class<?> getModelClass() {
		return potential_project_needs.class;
	}

	public String getModelClassName() {
		return potential_project_needs.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ppn_id", getPpn_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("organization_individual", getOrganization_individual());
		attributes.put("description", getDescription());
		attributes.put("contact_details", getContact_details());
		attributes.put("projectDurationFrom", getProjectDurationFrom());
		attributes.put("projectDurationTo", getProjectDurationTo());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long ppn_id = (Long)attributes.get("ppn_id");

		if (ppn_id != null) {
			setPpn_id(ppn_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String organization_individual = (String)attributes.get(
				"organization_individual");

		if (organization_individual != null) {
			setOrganization_individual(organization_individual);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contact_details = (String)attributes.get("contact_details");

		if (contact_details != null) {
			setContact_details(contact_details);
		}

		String projectDurationFrom = (String)attributes.get(
				"projectDurationFrom");

		if (projectDurationFrom != null) {
			setProjectDurationFrom(projectDurationFrom);
		}

		String projectDurationTo = (String)attributes.get("projectDurationTo");

		if (projectDurationTo != null) {
			setProjectDurationTo(projectDurationTo);
		}
	}

	/**
	* Returns the primary key of this potential_project_needs.
	*
	* @return the primary key of this potential_project_needs
	*/
	public long getPrimaryKey() {
		return _potential_project_needs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this potential_project_needs.
	*
	* @param primaryKey the primary key of this potential_project_needs
	*/
	public void setPrimaryKey(long primaryKey) {
		_potential_project_needs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ppn_id of this potential_project_needs.
	*
	* @return the ppn_id of this potential_project_needs
	*/
	public long getPpn_id() {
		return _potential_project_needs.getPpn_id();
	}

	/**
	* Sets the ppn_id of this potential_project_needs.
	*
	* @param ppn_id the ppn_id of this potential_project_needs
	*/
	public void setPpn_id(long ppn_id) {
		_potential_project_needs.setPpn_id(ppn_id);
	}

	/**
	* Returns the assessment_version_id of this potential_project_needs.
	*
	* @return the assessment_version_id of this potential_project_needs
	*/
	public long getAssessment_version_id() {
		return _potential_project_needs.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this potential_project_needs.
	*
	* @param assessment_version_id the assessment_version_id of this potential_project_needs
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_potential_project_needs.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the organization_individual of this potential_project_needs.
	*
	* @return the organization_individual of this potential_project_needs
	*/
	public java.lang.String getOrganization_individual() {
		return _potential_project_needs.getOrganization_individual();
	}

	/**
	* Sets the organization_individual of this potential_project_needs.
	*
	* @param organization_individual the organization_individual of this potential_project_needs
	*/
	public void setOrganization_individual(
		java.lang.String organization_individual) {
		_potential_project_needs.setOrganization_individual(organization_individual);
	}

	/**
	* Returns the description of this potential_project_needs.
	*
	* @return the description of this potential_project_needs
	*/
	public java.lang.String getDescription() {
		return _potential_project_needs.getDescription();
	}

	/**
	* Sets the description of this potential_project_needs.
	*
	* @param description the description of this potential_project_needs
	*/
	public void setDescription(java.lang.String description) {
		_potential_project_needs.setDescription(description);
	}

	/**
	* Returns the contact_details of this potential_project_needs.
	*
	* @return the contact_details of this potential_project_needs
	*/
	public java.lang.String getContact_details() {
		return _potential_project_needs.getContact_details();
	}

	/**
	* Sets the contact_details of this potential_project_needs.
	*
	* @param contact_details the contact_details of this potential_project_needs
	*/
	public void setContact_details(java.lang.String contact_details) {
		_potential_project_needs.setContact_details(contact_details);
	}

	/**
	* Returns the project duration from of this potential_project_needs.
	*
	* @return the project duration from of this potential_project_needs
	*/
	public java.lang.String getProjectDurationFrom() {
		return _potential_project_needs.getProjectDurationFrom();
	}

	/**
	* Sets the project duration from of this potential_project_needs.
	*
	* @param projectDurationFrom the project duration from of this potential_project_needs
	*/
	public void setProjectDurationFrom(java.lang.String projectDurationFrom) {
		_potential_project_needs.setProjectDurationFrom(projectDurationFrom);
	}

	/**
	* Returns the project duration to of this potential_project_needs.
	*
	* @return the project duration to of this potential_project_needs
	*/
	public java.lang.String getProjectDurationTo() {
		return _potential_project_needs.getProjectDurationTo();
	}

	/**
	* Sets the project duration to of this potential_project_needs.
	*
	* @param projectDurationTo the project duration to of this potential_project_needs
	*/
	public void setProjectDurationTo(java.lang.String projectDurationTo) {
		_potential_project_needs.setProjectDurationTo(projectDurationTo);
	}

	public boolean isNew() {
		return _potential_project_needs.isNew();
	}

	public void setNew(boolean n) {
		_potential_project_needs.setNew(n);
	}

	public boolean isCachedModel() {
		return _potential_project_needs.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_potential_project_needs.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _potential_project_needs.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _potential_project_needs.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_potential_project_needs.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _potential_project_needs.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_potential_project_needs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new potential_project_needsWrapper((potential_project_needs)_potential_project_needs.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs) {
		return _potential_project_needs.compareTo(potential_project_needs);
	}

	@Override
	public int hashCode() {
		return _potential_project_needs.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.potential_project_needs> toCacheModel() {
		return _potential_project_needs.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.potential_project_needs toEscapedModel() {
		return new potential_project_needsWrapper(_potential_project_needs.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _potential_project_needs.toString();
	}

	public java.lang.String toXmlString() {
		return _potential_project_needs.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_potential_project_needs.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public potential_project_needs getWrappedpotential_project_needs() {
		return _potential_project_needs;
	}

	public potential_project_needs getWrappedModel() {
		return _potential_project_needs;
	}

	public void resetOriginalValues() {
		_potential_project_needs.resetOriginalValues();
	}

	private potential_project_needs _potential_project_needs;
}