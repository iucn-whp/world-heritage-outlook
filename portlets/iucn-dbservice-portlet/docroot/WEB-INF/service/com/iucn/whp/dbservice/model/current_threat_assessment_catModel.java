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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the current_threat_assessment_cat service. Represents a row in the &quot;whp_current_threat_assessment_cat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl}.
 * </p>
 *
 * @author alok.sen
 * @see current_threat_assessment_cat
 * @see com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl
 * @see com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl
 * @generated
 */
public interface current_threat_assessment_catModel extends BaseModel<current_threat_assessment_cat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a current_threat_assessment_cat model instance should use the {@link current_threat_assessment_cat} interface instead.
	 */

	/**
	 * Returns the primary key of this current_threat_assessment_cat.
	 *
	 * @return the primary key of this current_threat_assessment_cat
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this current_threat_assessment_cat.
	 *
	 * @param primaryKey the primary key of this current_threat_assessment_cat
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cur_threat_cat_id of this current_threat_assessment_cat.
	 *
	 * @return the cur_threat_cat_id of this current_threat_assessment_cat
	 */
	public long getCur_threat_cat_id();

	/**
	 * Sets the cur_threat_cat_id of this current_threat_assessment_cat.
	 *
	 * @param cur_threat_cat_id the cur_threat_cat_id of this current_threat_assessment_cat
	 */
	public void setCur_threat_cat_id(long cur_threat_cat_id);

	/**
	 * Returns the current_threat_id of this current_threat_assessment_cat.
	 *
	 * @return the current_threat_id of this current_threat_assessment_cat
	 */
	public long getCurrent_threat_id();

	/**
	 * Sets the current_threat_id of this current_threat_assessment_cat.
	 *
	 * @param current_threat_id the current_threat_id of this current_threat_assessment_cat
	 */
	public void setCurrent_threat_id(long current_threat_id);

	/**
	 * Returns the category_id of this current_threat_assessment_cat.
	 *
	 * @return the category_id of this current_threat_assessment_cat
	 */
	public long getCategory_id();

	/**
	 * Sets the category_id of this current_threat_assessment_cat.
	 *
	 * @param category_id the category_id of this current_threat_assessment_cat
	 */
	public void setCategory_id(long category_id);

	/**
	 * Returns the sub_cat_id of this current_threat_assessment_cat.
	 *
	 * @return the sub_cat_id of this current_threat_assessment_cat
	 */
	public long getSub_cat_id();

	/**
	 * Sets the sub_cat_id of this current_threat_assessment_cat.
	 *
	 * @param sub_cat_id the sub_cat_id of this current_threat_assessment_cat
	 */
	public void setSub_cat_id(long sub_cat_id);

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
		current_threat_assessment_cat current_threat_assessment_cat);

	public int hashCode();

	public CacheModel<current_threat_assessment_cat> toCacheModel();

	public current_threat_assessment_cat toEscapedModel();

	public String toString();

	public String toXmlString();
}