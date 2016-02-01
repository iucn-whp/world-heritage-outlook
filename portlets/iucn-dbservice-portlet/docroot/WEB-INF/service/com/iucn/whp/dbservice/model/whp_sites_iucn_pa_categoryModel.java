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
 * The base model interface for the whp_sites_iucn_pa_category service. Represents a row in the &quot;whp_whp_sites_iucn_pa_category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_iucn_pa_category
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl
 * @generated
 */
public interface whp_sites_iucn_pa_categoryModel extends BaseModel<whp_sites_iucn_pa_category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_sites_iucn_pa_category model instance should use the {@link whp_sites_iucn_pa_category} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_sites_iucn_pa_category.
	 *
	 * @return the primary key of this whp_sites_iucn_pa_category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this whp_sites_iucn_pa_category.
	 *
	 * @param primaryKey the primary key of this whp_sites_iucn_pa_category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category.
	 *
	 * @return the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category
	 */
	public long getWhp_sites_iucn_pa_category_id();

	/**
	 * Sets the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category.
	 *
	 * @param whp_sites_iucn_pa_category_id the whp_sites_iucn_pa_category_id of this whp_sites_iucn_pa_category
	 */
	public void setWhp_sites_iucn_pa_category_id(
		long whp_sites_iucn_pa_category_id);

	/**
	 * Returns the site_id of this whp_sites_iucn_pa_category.
	 *
	 * @return the site_id of this whp_sites_iucn_pa_category
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this whp_sites_iucn_pa_category.
	 *
	 * @param site_id the site_id of this whp_sites_iucn_pa_category
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the iucn_pa_category_id of this whp_sites_iucn_pa_category.
	 *
	 * @return the iucn_pa_category_id of this whp_sites_iucn_pa_category
	 */
	public int getIucn_pa_category_id();

	/**
	 * Sets the iucn_pa_category_id of this whp_sites_iucn_pa_category.
	 *
	 * @param iucn_pa_category_id the iucn_pa_category_id of this whp_sites_iucn_pa_category
	 */
	public void setIucn_pa_category_id(int iucn_pa_category_id);

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

	public int compareTo(whp_sites_iucn_pa_category whp_sites_iucn_pa_category);

	public int hashCode();

	public CacheModel<whp_sites_iucn_pa_category> toCacheModel();

	public whp_sites_iucn_pa_category toEscapedModel();

	public String toString();

	public String toXmlString();
}