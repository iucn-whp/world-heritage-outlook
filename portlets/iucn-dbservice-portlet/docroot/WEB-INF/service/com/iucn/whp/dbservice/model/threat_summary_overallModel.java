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

/**
 * The base model interface for the threat_summary_overall service. Represents a row in the &quot;whp_threat_summary_overall&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl}.
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_overall
 * @see com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl
 * @see com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl
 * @generated
 */
public interface threat_summary_overallModel extends BaseModel<threat_summary_overall> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a threat_summary_overall model instance should use the {@link threat_summary_overall} interface instead.
	 */

	/**
	 * Returns the primary key of this threat_summary_overall.
	 *
	 * @return the primary key of this threat_summary_overall
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this threat_summary_overall.
	 *
	 * @param primaryKey the primary key of this threat_summary_overall
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the threat_sum_overall_id of this threat_summary_overall.
	 *
	 * @return the threat_sum_overall_id of this threat_summary_overall
	 */
	public long getThreat_sum_overall_id();

	/**
	 * Sets the threat_sum_overall_id of this threat_summary_overall.
	 *
	 * @param threat_sum_overall_id the threat_sum_overall_id of this threat_summary_overall
	 */
	public void setThreat_sum_overall_id(long threat_sum_overall_id);

	/**
	 * Returns the assessment_version_id of this threat_summary_overall.
	 *
	 * @return the assessment_version_id of this threat_summary_overall
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this threat_summary_overall.
	 *
	 * @param assessment_version_id the assessment_version_id of this threat_summary_overall
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the overall_threat of this threat_summary_overall.
	 *
	 * @return the overall_threat of this threat_summary_overall
	 */
	@AutoEscape
	public String getOverall_threat();

	/**
	 * Sets the overall_threat of this threat_summary_overall.
	 *
	 * @param overall_threat the overall_threat of this threat_summary_overall
	 */
	public void setOverall_threat(String overall_threat);

	/**
	 * Returns the threat_rating of this threat_summary_overall.
	 *
	 * @return the threat_rating of this threat_summary_overall
	 */
	public long getThreat_rating();

	/**
	 * Sets the threat_rating of this threat_summary_overall.
	 *
	 * @param threat_rating the threat_rating of this threat_summary_overall
	 */
	public void setThreat_rating(long threat_rating);

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

	public int compareTo(threat_summary_overall threat_summary_overall);

	public int hashCode();

	public CacheModel<threat_summary_overall> toCacheModel();

	public threat_summary_overall toEscapedModel();

	public String toString();

	public String toXmlString();
}