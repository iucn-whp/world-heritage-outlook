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
 * The base model interface for the assessing_threats_current service. Represents a row in the &quot;whp_assessing_threats_current&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl}.
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_current
 * @see com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl
 * @see com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl
 * @generated
 */
public interface assessing_threats_currentModel extends BaseModel<assessing_threats_current> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessing_threats_current model instance should use the {@link assessing_threats_current} interface instead.
	 */

	/**
	 * Returns the primary key of this assessing_threats_current.
	 *
	 * @return the primary key of this assessing_threats_current
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessing_threats_current.
	 *
	 * @param primaryKey the primary key of this assessing_threats_current
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the current_threat_id of this assessing_threats_current.
	 *
	 * @return the current_threat_id of this assessing_threats_current
	 */
	public long getCurrent_threat_id();

	/**
	 * Sets the current_threat_id of this assessing_threats_current.
	 *
	 * @param current_threat_id the current_threat_id of this assessing_threats_current
	 */
	public void setCurrent_threat_id(long current_threat_id);

	/**
	 * Returns the assessment_version_id of this assessing_threats_current.
	 *
	 * @return the assessment_version_id of this assessing_threats_current
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this assessing_threats_current.
	 *
	 * @param assessment_version_id the assessment_version_id of this assessing_threats_current
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the current_threat of this assessing_threats_current.
	 *
	 * @return the current_threat of this assessing_threats_current
	 */
	@AutoEscape
	public String getCurrent_threat();

	/**
	 * Sets the current_threat of this assessing_threats_current.
	 *
	 * @param current_threat the current_threat of this assessing_threats_current
	 */
	public void setCurrent_threat(String current_threat);

	/**
	 * Returns the justification of this assessing_threats_current.
	 *
	 * @return the justification of this assessing_threats_current
	 */
	@AutoEscape
	public String getJustification();

	/**
	 * Sets the justification of this assessing_threats_current.
	 *
	 * @param justification the justification of this assessing_threats_current
	 */
	public void setJustification(String justification);

	/**
	 * Returns the inside_site of this assessing_threats_current.
	 *
	 * @return the inside_site of this assessing_threats_current
	 */
	public boolean getInside_site();

	/**
	 * Returns <code>true</code> if this assessing_threats_current is inside_site.
	 *
	 * @return <code>true</code> if this assessing_threats_current is inside_site; <code>false</code> otherwise
	 */
	public boolean isInside_site();

	/**
	 * Sets whether this assessing_threats_current is inside_site.
	 *
	 * @param inside_site the inside_site of this assessing_threats_current
	 */
	public void setInside_site(boolean inside_site);

	/**
	 * Returns the outside_site of this assessing_threats_current.
	 *
	 * @return the outside_site of this assessing_threats_current
	 */
	public boolean getOutside_site();

	/**
	 * Returns <code>true</code> if this assessing_threats_current is outside_site.
	 *
	 * @return <code>true</code> if this assessing_threats_current is outside_site; <code>false</code> otherwise
	 */
	public boolean isOutside_site();

	/**
	 * Sets whether this assessing_threats_current is outside_site.
	 *
	 * @param outside_site the outside_site of this assessing_threats_current
	 */
	public void setOutside_site(boolean outside_site);

	/**
	 * Returns the threat_rating_id of this assessing_threats_current.
	 *
	 * @return the threat_rating_id of this assessing_threats_current
	 */
	public long getThreat_rating_id();

	/**
	 * Sets the threat_rating_id of this assessing_threats_current.
	 *
	 * @param threat_rating_id the threat_rating_id of this assessing_threats_current
	 */
	public void setThreat_rating_id(long threat_rating_id);

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

	public int compareTo(assessing_threats_current assessing_threats_current);

	public int hashCode();

	public CacheModel<assessing_threats_current> toCacheModel();

	public assessing_threats_current toEscapedModel();

	public String toString();

	public String toXmlString();
}