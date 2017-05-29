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
 * This class is a wrapper for {@link site_assessment_versions}.
 * </p>
 *
 * @author    alok.sen
 * @see       site_assessment_versions
 * @generated
 */
public class site_assessment_versionsWrapper implements site_assessment_versions,
	ModelWrapper<site_assessment_versions> {
	public site_assessment_versionsWrapper(
		site_assessment_versions site_assessment_versions) {
		_site_assessment_versions = site_assessment_versions;
	}

	public Class<?> getModelClass() {
		return site_assessment_versions.class;
	}

	public String getModelClassName() {
		return site_assessment_versions.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("stage_id", getStage_id());
		attributes.put("assessment_id", getAssessment_id());
		attributes.put("start_date", getStart_date());
		attributes.put("end_date", getEnd_date());
		attributes.put("userid", getUserid());
		attributes.put("initiation_date", getInitiation_date());
		attributes.put("language", getLanguage());
		attributes.put("version_code", getVersion_code());
		attributes.put("is_translated", getIs_translated());
		attributes.put("parent_assessment_versionid",
			getParent_assessment_versionid());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long stage_id = (Long)attributes.get("stage_id");

		if (stage_id != null) {
			setStage_id(stage_id);
		}

		Long assessment_id = (Long)attributes.get("assessment_id");

		if (assessment_id != null) {
			setAssessment_id(assessment_id);
		}

		Date start_date = (Date)attributes.get("start_date");

		if (start_date != null) {
			setStart_date(start_date);
		}

		Date end_date = (Date)attributes.get("end_date");

		if (end_date != null) {
			setEnd_date(end_date);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Date initiation_date = (Date)attributes.get("initiation_date");

		if (initiation_date != null) {
			setInitiation_date(initiation_date);
		}

		Long language = (Long)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Double version_code = (Double)attributes.get("version_code");

		if (version_code != null) {
			setVersion_code(version_code);
		}

		Boolean is_translated = (Boolean)attributes.get("is_translated");

		if (is_translated != null) {
			setIs_translated(is_translated);
		}

		Long parent_assessment_versionid = (Long)attributes.get(
				"parent_assessment_versionid");

		if (parent_assessment_versionid != null) {
			setParent_assessment_versionid(parent_assessment_versionid);
		}
	}

	/**
	* Returns the primary key of this site_assessment_versions.
	*
	* @return the primary key of this site_assessment_versions
	*/
	public long getPrimaryKey() {
		return _site_assessment_versions.getPrimaryKey();
	}

	/**
	* Sets the primary key of this site_assessment_versions.
	*
	* @param primaryKey the primary key of this site_assessment_versions
	*/
	public void setPrimaryKey(long primaryKey) {
		_site_assessment_versions.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the assessment_version_id of this site_assessment_versions.
	*
	* @return the assessment_version_id of this site_assessment_versions
	*/
	public long getAssessment_version_id() {
		return _site_assessment_versions.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this site_assessment_versions.
	*
	* @param assessment_version_id the assessment_version_id of this site_assessment_versions
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_site_assessment_versions.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the stage_id of this site_assessment_versions.
	*
	* @return the stage_id of this site_assessment_versions
	*/
	public long getStage_id() {
		return _site_assessment_versions.getStage_id();
	}

	/**
	* Sets the stage_id of this site_assessment_versions.
	*
	* @param stage_id the stage_id of this site_assessment_versions
	*/
	public void setStage_id(long stage_id) {
		_site_assessment_versions.setStage_id(stage_id);
	}

	/**
	* Returns the assessment_id of this site_assessment_versions.
	*
	* @return the assessment_id of this site_assessment_versions
	*/
	public long getAssessment_id() {
		return _site_assessment_versions.getAssessment_id();
	}

	/**
	* Sets the assessment_id of this site_assessment_versions.
	*
	* @param assessment_id the assessment_id of this site_assessment_versions
	*/
	public void setAssessment_id(long assessment_id) {
		_site_assessment_versions.setAssessment_id(assessment_id);
	}

	/**
	* Returns the start_date of this site_assessment_versions.
	*
	* @return the start_date of this site_assessment_versions
	*/
	public java.util.Date getStart_date() {
		return _site_assessment_versions.getStart_date();
	}

	/**
	* Sets the start_date of this site_assessment_versions.
	*
	* @param start_date the start_date of this site_assessment_versions
	*/
	public void setStart_date(java.util.Date start_date) {
		_site_assessment_versions.setStart_date(start_date);
	}

	/**
	* Returns the end_date of this site_assessment_versions.
	*
	* @return the end_date of this site_assessment_versions
	*/
	public java.util.Date getEnd_date() {
		return _site_assessment_versions.getEnd_date();
	}

	/**
	* Sets the end_date of this site_assessment_versions.
	*
	* @param end_date the end_date of this site_assessment_versions
	*/
	public void setEnd_date(java.util.Date end_date) {
		_site_assessment_versions.setEnd_date(end_date);
	}

	/**
	* Returns the userid of this site_assessment_versions.
	*
	* @return the userid of this site_assessment_versions
	*/
	public long getUserid() {
		return _site_assessment_versions.getUserid();
	}

	/**
	* Sets the userid of this site_assessment_versions.
	*
	* @param userid the userid of this site_assessment_versions
	*/
	public void setUserid(long userid) {
		_site_assessment_versions.setUserid(userid);
	}

	/**
	* Returns the initiation_date of this site_assessment_versions.
	*
	* @return the initiation_date of this site_assessment_versions
	*/
	public java.util.Date getInitiation_date() {
		return _site_assessment_versions.getInitiation_date();
	}

	/**
	* Sets the initiation_date of this site_assessment_versions.
	*
	* @param initiation_date the initiation_date of this site_assessment_versions
	*/
	public void setInitiation_date(java.util.Date initiation_date) {
		_site_assessment_versions.setInitiation_date(initiation_date);
	}

	/**
	* Returns the language of this site_assessment_versions.
	*
	* @return the language of this site_assessment_versions
	*/
	public long getLanguage() {
		return _site_assessment_versions.getLanguage();
	}

	/**
	* Sets the language of this site_assessment_versions.
	*
	* @param language the language of this site_assessment_versions
	*/
	public void setLanguage(long language) {
		_site_assessment_versions.setLanguage(language);
	}

	/**
	* Returns the version_code of this site_assessment_versions.
	*
	* @return the version_code of this site_assessment_versions
	*/
	public double getVersion_code() {
		return _site_assessment_versions.getVersion_code();
	}

	/**
	* Sets the version_code of this site_assessment_versions.
	*
	* @param version_code the version_code of this site_assessment_versions
	*/
	public void setVersion_code(double version_code) {
		_site_assessment_versions.setVersion_code(version_code);
	}

	/**
	* Returns the is_translated of this site_assessment_versions.
	*
	* @return the is_translated of this site_assessment_versions
	*/
	public boolean getIs_translated() {
		return _site_assessment_versions.getIs_translated();
	}

	/**
	* Returns <code>true</code> if this site_assessment_versions is is_translated.
	*
	* @return <code>true</code> if this site_assessment_versions is is_translated; <code>false</code> otherwise
	*/
	public boolean isIs_translated() {
		return _site_assessment_versions.isIs_translated();
	}

	/**
	* Sets whether this site_assessment_versions is is_translated.
	*
	* @param is_translated the is_translated of this site_assessment_versions
	*/
	public void setIs_translated(boolean is_translated) {
		_site_assessment_versions.setIs_translated(is_translated);
	}

	/**
	* Returns the parent_assessment_versionid of this site_assessment_versions.
	*
	* @return the parent_assessment_versionid of this site_assessment_versions
	*/
	public long getParent_assessment_versionid() {
		return _site_assessment_versions.getParent_assessment_versionid();
	}

	/**
	* Sets the parent_assessment_versionid of this site_assessment_versions.
	*
	* @param parent_assessment_versionid the parent_assessment_versionid of this site_assessment_versions
	*/
	public void setParent_assessment_versionid(long parent_assessment_versionid) {
		_site_assessment_versions.setParent_assessment_versionid(parent_assessment_versionid);
	}

	public boolean isNew() {
		return _site_assessment_versions.isNew();
	}

	public void setNew(boolean n) {
		_site_assessment_versions.setNew(n);
	}

	public boolean isCachedModel() {
		return _site_assessment_versions.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_site_assessment_versions.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _site_assessment_versions.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _site_assessment_versions.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_site_assessment_versions.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _site_assessment_versions.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_site_assessment_versions.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new site_assessment_versionsWrapper((site_assessment_versions)_site_assessment_versions.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions) {
		return _site_assessment_versions.compareTo(site_assessment_versions);
	}

	@Override
	public int hashCode() {
		return _site_assessment_versions.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.site_assessment_versions> toCacheModel() {
		return _site_assessment_versions.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.site_assessment_versions toEscapedModel() {
		return new site_assessment_versionsWrapper(_site_assessment_versions.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _site_assessment_versions.toString();
	}

	public java.lang.String toXmlString() {
		return _site_assessment_versions.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_site_assessment_versions.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public site_assessment_versions getWrappedsite_assessment_versions() {
		return _site_assessment_versions;
	}

	public site_assessment_versions getWrappedModel() {
		return _site_assessment_versions;
	}

	public void resetOriginalValues() {
		_site_assessment_versions.resetOriginalValues();
	}

	private site_assessment_versions _site_assessment_versions;
}