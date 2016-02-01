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
 * This class is a wrapper for {@link active_conservation_projects}.
 * </p>
 *
 * @author    alok.sen
 * @see       active_conservation_projects
 * @generated
 */
public class active_conservation_projectsWrapper
	implements active_conservation_projects,
		ModelWrapper<active_conservation_projects> {
	public active_conservation_projectsWrapper(
		active_conservation_projects active_conservation_projects) {
		_active_conservation_projects = active_conservation_projects;
	}

	public Class<?> getModelClass() {
		return active_conservation_projects.class;
	}

	public String getModelClassName() {
		return active_conservation_projects.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acpid", getAcpid());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("organization_individual", getOrganization_individual());
		attributes.put("description", getDescription());
		attributes.put("contact_details", getContact_details());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long acpid = (Long)attributes.get("acpid");

		if (acpid != null) {
			setAcpid(acpid);
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
	}

	/**
	* Returns the primary key of this active_conservation_projects.
	*
	* @return the primary key of this active_conservation_projects
	*/
	public long getPrimaryKey() {
		return _active_conservation_projects.getPrimaryKey();
	}

	/**
	* Sets the primary key of this active_conservation_projects.
	*
	* @param primaryKey the primary key of this active_conservation_projects
	*/
	public void setPrimaryKey(long primaryKey) {
		_active_conservation_projects.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the acpid of this active_conservation_projects.
	*
	* @return the acpid of this active_conservation_projects
	*/
	public long getAcpid() {
		return _active_conservation_projects.getAcpid();
	}

	/**
	* Sets the acpid of this active_conservation_projects.
	*
	* @param acpid the acpid of this active_conservation_projects
	*/
	public void setAcpid(long acpid) {
		_active_conservation_projects.setAcpid(acpid);
	}

	/**
	* Returns the assessment_version_id of this active_conservation_projects.
	*
	* @return the assessment_version_id of this active_conservation_projects
	*/
	public long getAssessment_version_id() {
		return _active_conservation_projects.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this active_conservation_projects.
	*
	* @param assessment_version_id the assessment_version_id of this active_conservation_projects
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_active_conservation_projects.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the organization_individual of this active_conservation_projects.
	*
	* @return the organization_individual of this active_conservation_projects
	*/
	public java.lang.String getOrganization_individual() {
		return _active_conservation_projects.getOrganization_individual();
	}

	/**
	* Sets the organization_individual of this active_conservation_projects.
	*
	* @param organization_individual the organization_individual of this active_conservation_projects
	*/
	public void setOrganization_individual(
		java.lang.String organization_individual) {
		_active_conservation_projects.setOrganization_individual(organization_individual);
	}

	/**
	* Returns the description of this active_conservation_projects.
	*
	* @return the description of this active_conservation_projects
	*/
	public java.lang.String getDescription() {
		return _active_conservation_projects.getDescription();
	}

	/**
	* Sets the description of this active_conservation_projects.
	*
	* @param description the description of this active_conservation_projects
	*/
	public void setDescription(java.lang.String description) {
		_active_conservation_projects.setDescription(description);
	}

	/**
	* Returns the contact_details of this active_conservation_projects.
	*
	* @return the contact_details of this active_conservation_projects
	*/
	public java.lang.String getContact_details() {
		return _active_conservation_projects.getContact_details();
	}

	/**
	* Sets the contact_details of this active_conservation_projects.
	*
	* @param contact_details the contact_details of this active_conservation_projects
	*/
	public void setContact_details(java.lang.String contact_details) {
		_active_conservation_projects.setContact_details(contact_details);
	}

	public boolean isNew() {
		return _active_conservation_projects.isNew();
	}

	public void setNew(boolean n) {
		_active_conservation_projects.setNew(n);
	}

	public boolean isCachedModel() {
		return _active_conservation_projects.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_active_conservation_projects.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _active_conservation_projects.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _active_conservation_projects.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_active_conservation_projects.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _active_conservation_projects.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_active_conservation_projects.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new active_conservation_projectsWrapper((active_conservation_projects)_active_conservation_projects.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects) {
		return _active_conservation_projects.compareTo(active_conservation_projects);
	}

	@Override
	public int hashCode() {
		return _active_conservation_projects.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.active_conservation_projects> toCacheModel() {
		return _active_conservation_projects.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.active_conservation_projects toEscapedModel() {
		return new active_conservation_projectsWrapper(_active_conservation_projects.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _active_conservation_projects.toString();
	}

	public java.lang.String toXmlString() {
		return _active_conservation_projects.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_active_conservation_projects.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public active_conservation_projects getWrappedactive_conservation_projects() {
		return _active_conservation_projects;
	}

	public active_conservation_projects getWrappedModel() {
		return _active_conservation_projects;
	}

	public void resetOriginalValues() {
		_active_conservation_projects.resetOriginalValues();
	}

	private active_conservation_projects _active_conservation_projects;
}