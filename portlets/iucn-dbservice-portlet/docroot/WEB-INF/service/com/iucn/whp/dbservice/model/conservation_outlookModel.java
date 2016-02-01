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
 * The base model interface for the conservation_outlook service. Represents a row in the &quot;whp_conservation_outlook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.conservation_outlookImpl}.
 * </p>
 *
 * @author alok.sen
 * @see conservation_outlook
 * @see com.iucn.whp.dbservice.model.impl.conservation_outlookImpl
 * @see com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl
 * @generated
 */
public interface conservation_outlookModel extends BaseModel<conservation_outlook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a conservation_outlook model instance should use the {@link conservation_outlook} interface instead.
	 */

	/**
	 * Returns the primary key of this conservation_outlook.
	 *
	 * @return the primary key of this conservation_outlook
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this conservation_outlook.
	 *
	 * @param primaryKey the primary key of this conservation_outlook
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the conservation_outlook_id of this conservation_outlook.
	 *
	 * @return the conservation_outlook_id of this conservation_outlook
	 */
	public long getConservation_outlook_id();

	/**
	 * Sets the conservation_outlook_id of this conservation_outlook.
	 *
	 * @param conservation_outlook_id the conservation_outlook_id of this conservation_outlook
	 */
	public void setConservation_outlook_id(long conservation_outlook_id);

	/**
	 * Returns the assessment_version_id of this conservation_outlook.
	 *
	 * @return the assessment_version_id of this conservation_outlook
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this conservation_outlook.
	 *
	 * @param assessment_version_id the assessment_version_id of this conservation_outlook
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the justification of this conservation_outlook.
	 *
	 * @return the justification of this conservation_outlook
	 */
	@AutoEscape
	public String getJustification();

	/**
	 * Sets the justification of this conservation_outlook.
	 *
	 * @param justification the justification of this conservation_outlook
	 */
	public void setJustification(String justification);

	/**
	 * Returns the rating of this conservation_outlook.
	 *
	 * @return the rating of this conservation_outlook
	 */
	public long getRating();

	/**
	 * Sets the rating of this conservation_outlook.
	 *
	 * @param rating the rating of this conservation_outlook
	 */
	public void setRating(long rating);

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

	public int compareTo(conservation_outlook conservation_outlook);

	public int hashCode();

	public CacheModel<conservation_outlook> toCacheModel();

	public conservation_outlook toEscapedModel();

	public String toString();

	public String toXmlString();
}