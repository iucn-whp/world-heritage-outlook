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
 * The base model interface for the biodiversity_values service. Represents a row in the &quot;whp_biodiversity_values&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see biodiversity_values
 * @see com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl
 * @see com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl
 * @generated
 */
public interface biodiversity_valuesModel extends BaseModel<biodiversity_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a biodiversity_values model instance should use the {@link biodiversity_values} interface instead.
	 */

	/**
	 * Returns the primary key of this biodiversity_values.
	 *
	 * @return the primary key of this biodiversity_values
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this biodiversity_values.
	 *
	 * @param primaryKey the primary key of this biodiversity_values
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this biodiversity_values.
	 *
	 * @return the ID of this biodiversity_values
	 */
	public long getId();

	/**
	 * Sets the ID of this biodiversity_values.
	 *
	 * @param id the ID of this biodiversity_values
	 */
	public void setId(long id);

	/**
	 * Returns the vn of this biodiversity_values.
	 *
	 * @return the vn of this biodiversity_values
	 */
	public long getVn();

	/**
	 * Sets the vn of this biodiversity_values.
	 *
	 * @param vn the vn of this biodiversity_values
	 */
	public void setVn(long vn);

	/**
	 * Returns the assessment_version_id of this biodiversity_values.
	 *
	 * @return the assessment_version_id of this biodiversity_values
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this biodiversity_values.
	 *
	 * @param assessment_version_id the assessment_version_id of this biodiversity_values
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the value of this biodiversity_values.
	 *
	 * @return the value of this biodiversity_values
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this biodiversity_values.
	 *
	 * @param value the value of this biodiversity_values
	 */
	public void setValue(String value);

	/**
	 * Returns the description of this biodiversity_values.
	 *
	 * @return the description of this biodiversity_values
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this biodiversity_values.
	 *
	 * @param description the description of this biodiversity_values
	 */
	public void setDescription(String description);

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

	public int compareTo(biodiversity_values biodiversity_values);

	public int hashCode();

	public CacheModel<biodiversity_values> toCacheModel();

	public biodiversity_values toEscapedModel();

	public String toString();

	public String toXmlString();
}