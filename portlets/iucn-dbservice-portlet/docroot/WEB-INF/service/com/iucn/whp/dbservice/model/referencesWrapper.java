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
 * This class is a wrapper for {@link references}.
 * </p>
 *
 * @author    alok.sen
 * @see       references
 * @generated
 */
public class referencesWrapper implements references, ModelWrapper<references> {
	public referencesWrapper(references references) {
		_references = references;
	}

	public Class<?> getModelClass() {
		return references.class;
	}

	public String getModelClassName() {
		return references.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("reference_id", getReference_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("rn", getRn());
		attributes.put("references", getReferences());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long reference_id = (Long)attributes.get("reference_id");

		if (reference_id != null) {
			setReference_id(reference_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long rn = (Long)attributes.get("rn");

		if (rn != null) {
			setRn(rn);
		}

		String references = (String)attributes.get("references");

		if (references != null) {
			setReferences(references);
		}
	}

	/**
	* Returns the primary key of this references.
	*
	* @return the primary key of this references
	*/
	public long getPrimaryKey() {
		return _references.getPrimaryKey();
	}

	/**
	* Sets the primary key of this references.
	*
	* @param primaryKey the primary key of this references
	*/
	public void setPrimaryKey(long primaryKey) {
		_references.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the reference_id of this references.
	*
	* @return the reference_id of this references
	*/
	public long getReference_id() {
		return _references.getReference_id();
	}

	/**
	* Sets the reference_id of this references.
	*
	* @param reference_id the reference_id of this references
	*/
	public void setReference_id(long reference_id) {
		_references.setReference_id(reference_id);
	}

	/**
	* Returns the assessment_version_id of this references.
	*
	* @return the assessment_version_id of this references
	*/
	public long getAssessment_version_id() {
		return _references.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this references.
	*
	* @param assessment_version_id the assessment_version_id of this references
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_references.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the rn of this references.
	*
	* @return the rn of this references
	*/
	public long getRn() {
		return _references.getRn();
	}

	/**
	* Sets the rn of this references.
	*
	* @param rn the rn of this references
	*/
	public void setRn(long rn) {
		_references.setRn(rn);
	}

	/**
	* Returns the references of this references.
	*
	* @return the references of this references
	*/
	public java.lang.String getReferences() {
		return _references.getReferences();
	}

	/**
	* Sets the references of this references.
	*
	* @param references the references of this references
	*/
	public void setReferences(java.lang.String references) {
		_references.setReferences(references);
	}

	public boolean isNew() {
		return _references.isNew();
	}

	public void setNew(boolean n) {
		_references.setNew(n);
	}

	public boolean isCachedModel() {
		return _references.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_references.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _references.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _references.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_references.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _references.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_references.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new referencesWrapper((references)_references.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.references references) {
		return _references.compareTo(references);
	}

	@Override
	public int hashCode() {
		return _references.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.references> toCacheModel() {
		return _references.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.references toEscapedModel() {
		return new referencesWrapper(_references.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _references.toString();
	}

	public java.lang.String toXmlString() {
		return _references.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_references.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public references getWrappedreferences() {
		return _references;
	}

	public references getWrappedModel() {
		return _references;
	}

	public void resetOriginalValues() {
		_references.resetOriginalValues();
	}

	private references _references;
}