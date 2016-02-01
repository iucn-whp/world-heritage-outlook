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
 * The base model interface for the iucn_pa_lkp_category service. Represents a row in the &quot;whp_iucn_pa_lkp_category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.iucn_pa_lkp_categoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.iucn_pa_lkp_categoryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see iucn_pa_lkp_category
 * @see com.iucn.whp.dbservice.model.impl.iucn_pa_lkp_categoryImpl
 * @see com.iucn.whp.dbservice.model.impl.iucn_pa_lkp_categoryModelImpl
 * @generated
 */
public interface iucn_pa_lkp_categoryModel extends BaseModel<iucn_pa_lkp_category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a iucn_pa_lkp_category model instance should use the {@link iucn_pa_lkp_category} interface instead.
	 */

	/**
	 * Returns the primary key of this iucn_pa_lkp_category.
	 *
	 * @return the primary key of this iucn_pa_lkp_category
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this iucn_pa_lkp_category.
	 *
	 * @param primaryKey the primary key of this iucn_pa_lkp_category
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the iucn_pa_category_id of this iucn_pa_lkp_category.
	 *
	 * @return the iucn_pa_category_id of this iucn_pa_lkp_category
	 */
	public int getIucn_pa_category_id();

	/**
	 * Sets the iucn_pa_category_id of this iucn_pa_lkp_category.
	 *
	 * @param iucn_pa_category_id the iucn_pa_category_id of this iucn_pa_lkp_category
	 */
	public void setIucn_pa_category_id(int iucn_pa_category_id);

	/**
	 * Returns the category of this iucn_pa_lkp_category.
	 *
	 * @return the category of this iucn_pa_lkp_category
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this iucn_pa_lkp_category.
	 *
	 * @param category the category of this iucn_pa_lkp_category
	 */
	public void setCategory(String category);

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

	public int compareTo(iucn_pa_lkp_category iucn_pa_lkp_category);

	public int hashCode();

	public CacheModel<iucn_pa_lkp_category> toCacheModel();

	public iucn_pa_lkp_category toEscapedModel();

	public String toString();

	public String toXmlString();
}