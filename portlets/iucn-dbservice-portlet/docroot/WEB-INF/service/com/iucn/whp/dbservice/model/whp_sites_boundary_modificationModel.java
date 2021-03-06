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
 * The base model interface for the whp_sites_boundary_modification service. Represents a row in the &quot;whp_whp_sites_boundary_modification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_boundary_modification
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl
 * @generated
 */
public interface whp_sites_boundary_modificationModel extends BaseModel<whp_sites_boundary_modification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_sites_boundary_modification model instance should use the {@link whp_sites_boundary_modification} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_sites_boundary_modification.
	 *
	 * @return the primary key of this whp_sites_boundary_modification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this whp_sites_boundary_modification.
	 *
	 * @param primaryKey the primary key of this whp_sites_boundary_modification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the whp_sites_boundary_modification_id of this whp_sites_boundary_modification.
	 *
	 * @return the whp_sites_boundary_modification_id of this whp_sites_boundary_modification
	 */
	public long getWhp_sites_boundary_modification_id();

	/**
	 * Sets the whp_sites_boundary_modification_id of this whp_sites_boundary_modification.
	 *
	 * @param whp_sites_boundary_modification_id the whp_sites_boundary_modification_id of this whp_sites_boundary_modification
	 */
	public void setWhp_sites_boundary_modification_id(
		long whp_sites_boundary_modification_id);

	/**
	 * Returns the site_id of this whp_sites_boundary_modification.
	 *
	 * @return the site_id of this whp_sites_boundary_modification
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this whp_sites_boundary_modification.
	 *
	 * @param site_id the site_id of this whp_sites_boundary_modification
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the bmid of this whp_sites_boundary_modification.
	 *
	 * @return the bmid of this whp_sites_boundary_modification
	 */
	public int getBmid();

	/**
	 * Sets the bmid of this whp_sites_boundary_modification.
	 *
	 * @param bmid the bmid of this whp_sites_boundary_modification
	 */
	public void setBmid(int bmid);

	/**
	 * Returns the description of this whp_sites_boundary_modification.
	 *
	 * @return the description of this whp_sites_boundary_modification
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this whp_sites_boundary_modification.
	 *
	 * @param description the description of this whp_sites_boundary_modification
	 */
	public void setDescription(String description);

	/**
	 * Returns the mod_date of this whp_sites_boundary_modification.
	 *
	 * @return the mod_date of this whp_sites_boundary_modification
	 */
	public Date getMod_date();

	/**
	 * Sets the mod_date of this whp_sites_boundary_modification.
	 *
	 * @param mod_date the mod_date of this whp_sites_boundary_modification
	 */
	public void setMod_date(Date mod_date);

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
		whp_sites_boundary_modification whp_sites_boundary_modification);

	public int hashCode();

	public CacheModel<whp_sites_boundary_modification> toCacheModel();

	public whp_sites_boundary_modification toEscapedModel();

	public String toString();

	public String toXmlString();
}