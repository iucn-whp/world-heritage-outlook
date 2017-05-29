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
 * This class is a wrapper for {@link site_assessment}.
 * </p>
 *
 * @author    alok.sen
 * @see       site_assessment
 * @generated
 */
public class site_assessmentWrapper implements site_assessment,
	ModelWrapper<site_assessment> {
	public site_assessmentWrapper(site_assessment site_assessment) {
		_site_assessment = site_assessment;
	}

	public Class<?> getModelClass() {
		return site_assessment.class;
	}

	public String getModelClassName() {
		return site_assessment.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_id", getAssessment_id());
		attributes.put("site_id", getSite_id());
		attributes.put("status_id", getStatus_id());
		attributes.put("initiation_date", getInitiation_date());
		attributes.put("current_userid", getCurrent_userid());
		attributes.put("current_stageid", getCurrent_stageid());
		attributes.put("assessment_initiated_by", getAssessment_initiated_by());
		attributes.put("base_langid", getBase_langid());
		attributes.put("archived", getArchived());
		attributes.put("is_active", getIs_active());
		attributes.put("assessment_cycle", getAssessment_cycle());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_id = (Long)attributes.get("assessment_id");

		if (assessment_id != null) {
			setAssessment_id(assessment_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long status_id = (Long)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Date initiation_date = (Date)attributes.get("initiation_date");

		if (initiation_date != null) {
			setInitiation_date(initiation_date);
		}

		Long current_userid = (Long)attributes.get("current_userid");

		if (current_userid != null) {
			setCurrent_userid(current_userid);
		}

		Long current_stageid = (Long)attributes.get("current_stageid");

		if (current_stageid != null) {
			setCurrent_stageid(current_stageid);
		}

		Long assessment_initiated_by = (Long)attributes.get(
				"assessment_initiated_by");

		if (assessment_initiated_by != null) {
			setAssessment_initiated_by(assessment_initiated_by);
		}

		Long base_langid = (Long)attributes.get("base_langid");

		if (base_langid != null) {
			setBase_langid(base_langid);
		}

		Boolean archived = (Boolean)attributes.get("archived");

		if (archived != null) {
			setArchived(archived);
		}

		Boolean is_active = (Boolean)attributes.get("is_active");

		if (is_active != null) {
			setIs_active(is_active);
		}

		String assessment_cycle = (String)attributes.get("assessment_cycle");

		if (assessment_cycle != null) {
			setAssessment_cycle(assessment_cycle);
		}
	}

	/**
	* Returns the primary key of this site_assessment.
	*
	* @return the primary key of this site_assessment
	*/
	public long getPrimaryKey() {
		return _site_assessment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this site_assessment.
	*
	* @param primaryKey the primary key of this site_assessment
	*/
	public void setPrimaryKey(long primaryKey) {
		_site_assessment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the assessment_id of this site_assessment.
	*
	* @return the assessment_id of this site_assessment
	*/
	public long getAssessment_id() {
		return _site_assessment.getAssessment_id();
	}

	/**
	* Sets the assessment_id of this site_assessment.
	*
	* @param assessment_id the assessment_id of this site_assessment
	*/
	public void setAssessment_id(long assessment_id) {
		_site_assessment.setAssessment_id(assessment_id);
	}

	/**
	* Returns the site_id of this site_assessment.
	*
	* @return the site_id of this site_assessment
	*/
	public long getSite_id() {
		return _site_assessment.getSite_id();
	}

	/**
	* Sets the site_id of this site_assessment.
	*
	* @param site_id the site_id of this site_assessment
	*/
	public void setSite_id(long site_id) {
		_site_assessment.setSite_id(site_id);
	}

	/**
	* Returns the status_id of this site_assessment.
	*
	* @return the status_id of this site_assessment
	*/
	public long getStatus_id() {
		return _site_assessment.getStatus_id();
	}

	/**
	* Sets the status_id of this site_assessment.
	*
	* @param status_id the status_id of this site_assessment
	*/
	public void setStatus_id(long status_id) {
		_site_assessment.setStatus_id(status_id);
	}

	/**
	* Returns the initiation_date of this site_assessment.
	*
	* @return the initiation_date of this site_assessment
	*/
	public java.util.Date getInitiation_date() {
		return _site_assessment.getInitiation_date();
	}

	/**
	* Sets the initiation_date of this site_assessment.
	*
	* @param initiation_date the initiation_date of this site_assessment
	*/
	public void setInitiation_date(java.util.Date initiation_date) {
		_site_assessment.setInitiation_date(initiation_date);
	}

	/**
	* Returns the current_userid of this site_assessment.
	*
	* @return the current_userid of this site_assessment
	*/
	public long getCurrent_userid() {
		return _site_assessment.getCurrent_userid();
	}

	/**
	* Sets the current_userid of this site_assessment.
	*
	* @param current_userid the current_userid of this site_assessment
	*/
	public void setCurrent_userid(long current_userid) {
		_site_assessment.setCurrent_userid(current_userid);
	}

	/**
	* Returns the current_stageid of this site_assessment.
	*
	* @return the current_stageid of this site_assessment
	*/
	public long getCurrent_stageid() {
		return _site_assessment.getCurrent_stageid();
	}

	/**
	* Sets the current_stageid of this site_assessment.
	*
	* @param current_stageid the current_stageid of this site_assessment
	*/
	public void setCurrent_stageid(long current_stageid) {
		_site_assessment.setCurrent_stageid(current_stageid);
	}

	/**
	* Returns the assessment_initiated_by of this site_assessment.
	*
	* @return the assessment_initiated_by of this site_assessment
	*/
	public long getAssessment_initiated_by() {
		return _site_assessment.getAssessment_initiated_by();
	}

	/**
	* Sets the assessment_initiated_by of this site_assessment.
	*
	* @param assessment_initiated_by the assessment_initiated_by of this site_assessment
	*/
	public void setAssessment_initiated_by(long assessment_initiated_by) {
		_site_assessment.setAssessment_initiated_by(assessment_initiated_by);
	}

	/**
	* Returns the base_langid of this site_assessment.
	*
	* @return the base_langid of this site_assessment
	*/
	public long getBase_langid() {
		return _site_assessment.getBase_langid();
	}

	/**
	* Sets the base_langid of this site_assessment.
	*
	* @param base_langid the base_langid of this site_assessment
	*/
	public void setBase_langid(long base_langid) {
		_site_assessment.setBase_langid(base_langid);
	}

	/**
	* Returns the archived of this site_assessment.
	*
	* @return the archived of this site_assessment
	*/
	public boolean getArchived() {
		return _site_assessment.getArchived();
	}

	/**
	* Returns <code>true</code> if this site_assessment is archived.
	*
	* @return <code>true</code> if this site_assessment is archived; <code>false</code> otherwise
	*/
	public boolean isArchived() {
		return _site_assessment.isArchived();
	}

	/**
	* Sets whether this site_assessment is archived.
	*
	* @param archived the archived of this site_assessment
	*/
	public void setArchived(boolean archived) {
		_site_assessment.setArchived(archived);
	}

	/**
	* Returns the is_active of this site_assessment.
	*
	* @return the is_active of this site_assessment
	*/
	public boolean getIs_active() {
		return _site_assessment.getIs_active();
	}

	/**
	* Returns <code>true</code> if this site_assessment is is_active.
	*
	* @return <code>true</code> if this site_assessment is is_active; <code>false</code> otherwise
	*/
	public boolean isIs_active() {
		return _site_assessment.isIs_active();
	}

	/**
	* Sets whether this site_assessment is is_active.
	*
	* @param is_active the is_active of this site_assessment
	*/
	public void setIs_active(boolean is_active) {
		_site_assessment.setIs_active(is_active);
	}

	/**
	* Returns the assessment_cycle of this site_assessment.
	*
	* @return the assessment_cycle of this site_assessment
	*/
	public java.lang.String getAssessment_cycle() {
		return _site_assessment.getAssessment_cycle();
	}

	/**
	* Sets the assessment_cycle of this site_assessment.
	*
	* @param assessment_cycle the assessment_cycle of this site_assessment
	*/
	public void setAssessment_cycle(java.lang.String assessment_cycle) {
		_site_assessment.setAssessment_cycle(assessment_cycle);
	}

	public boolean isNew() {
		return _site_assessment.isNew();
	}

	public void setNew(boolean n) {
		_site_assessment.setNew(n);
	}

	public boolean isCachedModel() {
		return _site_assessment.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_site_assessment.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _site_assessment.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _site_assessment.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_site_assessment.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _site_assessment.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_site_assessment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new site_assessmentWrapper((site_assessment)_site_assessment.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.site_assessment site_assessment) {
		return _site_assessment.compareTo(site_assessment);
	}

	@Override
	public int hashCode() {
		return _site_assessment.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.site_assessment> toCacheModel() {
		return _site_assessment.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.site_assessment toEscapedModel() {
		return new site_assessmentWrapper(_site_assessment.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _site_assessment.toString();
	}

	public java.lang.String toXmlString() {
		return _site_assessment.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_site_assessment.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public site_assessment getWrappedsite_assessment() {
		return _site_assessment;
	}

	public site_assessment getWrappedModel() {
		return _site_assessment;
	}

	public void resetOriginalValues() {
		_site_assessment.resetOriginalValues();
	}

	private site_assessment _site_assessment;
}