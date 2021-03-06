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
 * The base model interface for the assessing_threats_potential service. Represents a row in the &quot;whp_assessing_threats_potential&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl}.
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_potential
 * @see com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl
 * @see com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl
 * @generated
 */
public interface assessing_threats_potentialModel extends BaseModel<assessing_threats_potential> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessing_threats_potential model instance should use the {@link assessing_threats_potential} interface instead.
	 */

	/**
	 * Returns the primary key of this assessing_threats_potential.
	 *
	 * @return the primary key of this assessing_threats_potential
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessing_threats_potential.
	 *
	 * @param primaryKey the primary key of this assessing_threats_potential
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the potential_threat_id of this assessing_threats_potential.
	 *
	 * @return the potential_threat_id of this assessing_threats_potential
	 */
	public long getPotential_threat_id();

	/**
	 * Sets the potential_threat_id of this assessing_threats_potential.
	 *
	 * @param potential_threat_id the potential_threat_id of this assessing_threats_potential
	 */
	public void setPotential_threat_id(long potential_threat_id);

	/**
	 * Returns the assessment_version_id of this assessing_threats_potential.
	 *
	 * @return the assessment_version_id of this assessing_threats_potential
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this assessing_threats_potential.
	 *
	 * @param assessment_version_id the assessment_version_id of this assessing_threats_potential
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the potential_threat of this assessing_threats_potential.
	 *
	 * @return the potential_threat of this assessing_threats_potential
	 */
	@AutoEscape
	public String getPotential_threat();

	/**
	 * Sets the potential_threat of this assessing_threats_potential.
	 *
	 * @param potential_threat the potential_threat of this assessing_threats_potential
	 */
	public void setPotential_threat(String potential_threat);

	/**
	 * Returns the justification of this assessing_threats_potential.
	 *
	 * @return the justification of this assessing_threats_potential
	 */
	@AutoEscape
	public String getJustification();

	/**
	 * Sets the justification of this assessing_threats_potential.
	 *
	 * @param justification the justification of this assessing_threats_potential
	 */
	public void setJustification(String justification);

	/**
	 * Returns the thread extent value of this assessing_threats_potential.
	 *
	 * @return the thread extent value of this assessing_threats_potential
	 */
	@AutoEscape
	public String getThreadExtentValue();

	/**
	 * Sets the thread extent value of this assessing_threats_potential.
	 *
	 * @param threadExtentValue the thread extent value of this assessing_threats_potential
	 */
	public void setThreadExtentValue(String threadExtentValue);

	/**
	 * Returns the threat_rating of this assessing_threats_potential.
	 *
	 * @return the threat_rating of this assessing_threats_potential
	 */
	public long getThreat_rating();

	/**
	 * Sets the threat_rating of this assessing_threats_potential.
	 *
	 * @param threat_rating the threat_rating of this assessing_threats_potential
	 */
	public void setThreat_rating(long threat_rating);

	/**
	 * Returns the inside_site of this assessing_threats_potential.
	 *
	 * @return the inside_site of this assessing_threats_potential
	 */
	public boolean getInside_site();

	/**
	 * Returns <code>true</code> if this assessing_threats_potential is inside_site.
	 *
	 * @return <code>true</code> if this assessing_threats_potential is inside_site; <code>false</code> otherwise
	 */
	public boolean isInside_site();

	/**
	 * Sets whether this assessing_threats_potential is inside_site.
	 *
	 * @param inside_site the inside_site of this assessing_threats_potential
	 */
	public void setInside_site(boolean inside_site);

	/**
	 * Returns the outside_site of this assessing_threats_potential.
	 *
	 * @return the outside_site of this assessing_threats_potential
	 */
	public boolean getOutside_site();

	/**
	 * Returns <code>true</code> if this assessing_threats_potential is outside_site.
	 *
	 * @return <code>true</code> if this assessing_threats_potential is outside_site; <code>false</code> otherwise
	 */
	public boolean isOutside_site();

	/**
	 * Sets whether this assessing_threats_potential is outside_site.
	 *
	 * @param outside_site the outside_site of this assessing_threats_potential
	 */
	public void setOutside_site(boolean outside_site);

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

	public int compareTo(
		assessing_threats_potential assessing_threats_potential);

	public int hashCode();

	public CacheModel<assessing_threats_potential> toCacheModel();

	public assessing_threats_potential toEscapedModel();

	public String toString();

	public String toXmlString();
}