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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link assessment_lang_version}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_lang_version
 * @generated
 */
public class assessment_lang_versionWrapper implements assessment_lang_version,
	ModelWrapper<assessment_lang_version> {
	public assessment_lang_versionWrapper(
		assessment_lang_version assessment_lang_version) {
		_assessment_lang_version = assessment_lang_version;
	}

	public Class<?> getModelClass() {
		return assessment_lang_version.class;
	}

	public String getModelClassName() {
		return assessment_lang_version.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lang_ver_id", getLang_ver_id());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("languageid", getLanguageid());
		attributes.put("published", getPublished());
		attributes.put("published_date", getPublished_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long lang_ver_id = (Long)attributes.get("lang_ver_id");

		if (lang_ver_id != null) {
			setLang_ver_id(lang_ver_id);
		}

		Long assessmentid = (Long)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long languageid = (Long)attributes.get("languageid");

		if (languageid != null) {
			setLanguageid(languageid);
		}

		Boolean published = (Boolean)attributes.get("published");

		if (published != null) {
			setPublished(published);
		}

		Date published_date = (Date)attributes.get("published_date");

		if (published_date != null) {
			setPublished_date(published_date);
		}
	}

	/**
	* Returns the primary key of this assessment_lang_version.
	*
	* @return the primary key of this assessment_lang_version
	*/
	public long getPrimaryKey() {
		return _assessment_lang_version.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_lang_version.
	*
	* @param primaryKey the primary key of this assessment_lang_version
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_lang_version.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the lang_ver_id of this assessment_lang_version.
	*
	* @return the lang_ver_id of this assessment_lang_version
	*/
	public long getLang_ver_id() {
		return _assessment_lang_version.getLang_ver_id();
	}

	/**
	* Sets the lang_ver_id of this assessment_lang_version.
	*
	* @param lang_ver_id the lang_ver_id of this assessment_lang_version
	*/
	public void setLang_ver_id(long lang_ver_id) {
		_assessment_lang_version.setLang_ver_id(lang_ver_id);
	}

	/**
	* Returns the assessmentid of this assessment_lang_version.
	*
	* @return the assessmentid of this assessment_lang_version
	*/
	public long getAssessmentid() {
		return _assessment_lang_version.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessment_lang_version.
	*
	* @param assessmentid the assessmentid of this assessment_lang_version
	*/
	public void setAssessmentid(long assessmentid) {
		_assessment_lang_version.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessment_version_id of this assessment_lang_version.
	*
	* @return the assessment_version_id of this assessment_lang_version
	*/
	public long getAssessment_version_id() {
		return _assessment_lang_version.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this assessment_lang_version.
	*
	* @param assessment_version_id the assessment_version_id of this assessment_lang_version
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_lang_version.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the languageid of this assessment_lang_version.
	*
	* @return the languageid of this assessment_lang_version
	*/
	public long getLanguageid() {
		return _assessment_lang_version.getLanguageid();
	}

	/**
	* Sets the languageid of this assessment_lang_version.
	*
	* @param languageid the languageid of this assessment_lang_version
	*/
	public void setLanguageid(long languageid) {
		_assessment_lang_version.setLanguageid(languageid);
	}

	/**
	* Returns the published of this assessment_lang_version.
	*
	* @return the published of this assessment_lang_version
	*/
	public boolean getPublished() {
		return _assessment_lang_version.getPublished();
	}

	/**
	* Returns <code>true</code> if this assessment_lang_version is published.
	*
	* @return <code>true</code> if this assessment_lang_version is published; <code>false</code> otherwise
	*/
	public boolean isPublished() {
		return _assessment_lang_version.isPublished();
	}

	/**
	* Sets whether this assessment_lang_version is published.
	*
	* @param published the published of this assessment_lang_version
	*/
	public void setPublished(boolean published) {
		_assessment_lang_version.setPublished(published);
	}

	/**
	* Returns the published_date of this assessment_lang_version.
	*
	* @return the published_date of this assessment_lang_version
	*/
	public java.util.Date getPublished_date() {
		return _assessment_lang_version.getPublished_date();
	}

	/**
	* Sets the published_date of this assessment_lang_version.
	*
	* @param published_date the published_date of this assessment_lang_version
	*/
	public void setPublished_date(java.util.Date published_date) {
		_assessment_lang_version.setPublished_date(published_date);
	}

	public boolean isNew() {
		return _assessment_lang_version.isNew();
	}

	public void setNew(boolean n) {
		_assessment_lang_version.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_lang_version.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_lang_version.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_lang_version.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_lang_version.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_lang_version.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_lang_version.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_lang_version.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_lang_versionWrapper((assessment_lang_version)_assessment_lang_version.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_lang_version assessment_lang_version) {
		return _assessment_lang_version.compareTo(assessment_lang_version);
	}

	@Override
	public int hashCode() {
		return _assessment_lang_version.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_lang_version> toCacheModel() {
		return _assessment_lang_version.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_lang_version toEscapedModel() {
		return new assessment_lang_versionWrapper(_assessment_lang_version.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_lang_version.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_lang_version.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_lang_version.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_lang_version getWrappedassessment_lang_version() {
		return _assessment_lang_version;
	}

	public assessment_lang_version getWrappedModel() {
		return _assessment_lang_version;
	}

	public void resetOriginalValues() {
		_assessment_lang_version.resetOriginalValues();
	}

	private assessment_lang_version _assessment_lang_version;
}