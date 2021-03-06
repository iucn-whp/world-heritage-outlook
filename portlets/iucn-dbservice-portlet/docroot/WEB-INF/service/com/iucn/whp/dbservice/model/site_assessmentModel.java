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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the site_assessment service. Represents a row in the &quot;whp_site_assessment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.site_assessmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.site_assessmentImpl}.
 * </p>
 *
 * @author alok.sen
 * @see site_assessment
 * @see com.iucn.whp.dbservice.model.impl.site_assessmentImpl
 * @see com.iucn.whp.dbservice.model.impl.site_assessmentModelImpl
 * @generated
 */
public interface site_assessmentModel extends BaseModel<site_assessment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a site_assessment model instance should use the {@link site_assessment} interface instead.
	 */

	/**
	 * Returns the primary key of this site_assessment.
	 *
	 * @return the primary key of this site_assessment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this site_assessment.
	 *
	 * @param primaryKey the primary key of this site_assessment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the assessment_id of this site_assessment.
	 *
	 * @return the assessment_id of this site_assessment
	 */
	public long getAssessment_id();

	/**
	 * Sets the assessment_id of this site_assessment.
	 *
	 * @param assessment_id the assessment_id of this site_assessment
	 */
	public void setAssessment_id(long assessment_id);

	/**
	 * Returns the site_id of this site_assessment.
	 *
	 * @return the site_id of this site_assessment
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this site_assessment.
	 *
	 * @param site_id the site_id of this site_assessment
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the status_id of this site_assessment.
	 *
	 * @return the status_id of this site_assessment
	 */
	public long getStatus_id();

	/**
	 * Sets the status_id of this site_assessment.
	 *
	 * @param status_id the status_id of this site_assessment
	 */
	public void setStatus_id(long status_id);

	/**
	 * Returns the initiation_date of this site_assessment.
	 *
	 * @return the initiation_date of this site_assessment
	 */
	public Date getInitiation_date();

	/**
	 * Sets the initiation_date of this site_assessment.
	 *
	 * @param initiation_date the initiation_date of this site_assessment
	 */
	public void setInitiation_date(Date initiation_date);

	/**
	 * Returns the current_userid of this site_assessment.
	 *
	 * @return the current_userid of this site_assessment
	 */
	public long getCurrent_userid();

	/**
	 * Sets the current_userid of this site_assessment.
	 *
	 * @param current_userid the current_userid of this site_assessment
	 */
	public void setCurrent_userid(long current_userid);

	/**
	 * Returns the current_stageid of this site_assessment.
	 *
	 * @return the current_stageid of this site_assessment
	 */
	public long getCurrent_stageid();

	/**
	 * Sets the current_stageid of this site_assessment.
	 *
	 * @param current_stageid the current_stageid of this site_assessment
	 */
	public void setCurrent_stageid(long current_stageid);

	/**
	 * Returns the assessment_initiated_by of this site_assessment.
	 *
	 * @return the assessment_initiated_by of this site_assessment
	 */
	public long getAssessment_initiated_by();

	/**
	 * Sets the assessment_initiated_by of this site_assessment.
	 *
	 * @param assessment_initiated_by the assessment_initiated_by of this site_assessment
	 */
	public void setAssessment_initiated_by(long assessment_initiated_by);

	/**
	 * Returns the base_langid of this site_assessment.
	 *
	 * @return the base_langid of this site_assessment
	 */
	public long getBase_langid();

	/**
	 * Sets the base_langid of this site_assessment.
	 *
	 * @param base_langid the base_langid of this site_assessment
	 */
	public void setBase_langid(long base_langid);

	/**
	 * Returns the archived of this site_assessment.
	 *
	 * @return the archived of this site_assessment
	 */
	public boolean getArchived();

	/**
	 * Returns <code>true</code> if this site_assessment is archived.
	 *
	 * @return <code>true</code> if this site_assessment is archived; <code>false</code> otherwise
	 */
	public boolean isArchived();

	/**
	 * Sets whether this site_assessment is archived.
	 *
	 * @param archived the archived of this site_assessment
	 */
	public void setArchived(boolean archived);

	/**
	 * Returns the is_active of this site_assessment.
	 *
	 * @return the is_active of this site_assessment
	 */
	public boolean getIs_active();

	/**
	 * Returns <code>true</code> if this site_assessment is is_active.
	 *
	 * @return <code>true</code> if this site_assessment is is_active; <code>false</code> otherwise
	 */
	public boolean isIs_active();

	/**
	 * Sets whether this site_assessment is is_active.
	 *
	 * @param is_active the is_active of this site_assessment
	 */
	public void setIs_active(boolean is_active);

	/**
	 * Returns the assessment_cycle of this site_assessment.
	 *
	 * @return the assessment_cycle of this site_assessment
	 */
	@AutoEscape
	public String getAssessment_cycle();

	/**
	 * Sets the assessment_cycle of this site_assessment.
	 *
	 * @param assessment_cycle the assessment_cycle of this site_assessment
	 */
	public void setAssessment_cycle(String assessment_cycle);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(site_assessment site_assessment);

	public int hashCode();

	public CacheModel<site_assessment> toCacheModel();

	public site_assessment toEscapedModel();

	public String toString();

	public String toXmlString();
}