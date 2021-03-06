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
 * The base model interface for the whp_sites_indigenous_communities service. Represents a row in the &quot;whp_whp_sites_indigenous_communities&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_indigenous_communities
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl
 * @generated
 */
public interface whp_sites_indigenous_communitiesModel extends BaseModel<whp_sites_indigenous_communities> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_sites_indigenous_communities model instance should use the {@link whp_sites_indigenous_communities} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_sites_indigenous_communities.
	 *
	 * @return the primary key of this whp_sites_indigenous_communities
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this whp_sites_indigenous_communities.
	 *
	 * @param primaryKey the primary key of this whp_sites_indigenous_communities
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities.
	 *
	 * @return the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities
	 */
	public long getWhp_sites_indigenous_communities_id();

	/**
	 * Sets the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities.
	 *
	 * @param whp_sites_indigenous_communities_id the whp_sites_indigenous_communities_id of this whp_sites_indigenous_communities
	 */
	public void setWhp_sites_indigenous_communities_id(
		long whp_sites_indigenous_communities_id);

	/**
	 * Returns the site_id of this whp_sites_indigenous_communities.
	 *
	 * @return the site_id of this whp_sites_indigenous_communities
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this whp_sites_indigenous_communities.
	 *
	 * @param site_id the site_id of this whp_sites_indigenous_communities
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the description of this whp_sites_indigenous_communities.
	 *
	 * @return the description of this whp_sites_indigenous_communities
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this whp_sites_indigenous_communities.
	 *
	 * @param description the description of this whp_sites_indigenous_communities
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

	public int compareTo(
		whp_sites_indigenous_communities whp_sites_indigenous_communities);

	public int hashCode();

	public CacheModel<whp_sites_indigenous_communities> toCacheModel();

	public whp_sites_indigenous_communities toEscapedModel();

	public String toString();

	public String toXmlString();
}