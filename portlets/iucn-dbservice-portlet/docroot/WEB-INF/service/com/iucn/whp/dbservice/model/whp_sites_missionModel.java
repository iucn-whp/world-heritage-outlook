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
 * The base model interface for the whp_sites_mission service. Represents a row in the &quot;whp_whp_sites_mission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_mission
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl
 * @generated
 */
public interface whp_sites_missionModel extends BaseModel<whp_sites_mission> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_sites_mission model instance should use the {@link whp_sites_mission} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_sites_mission.
	 *
	 * @return the primary key of this whp_sites_mission
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this whp_sites_mission.
	 *
	 * @param primaryKey the primary key of this whp_sites_mission
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the whp_sites_mission_id of this whp_sites_mission.
	 *
	 * @return the whp_sites_mission_id of this whp_sites_mission
	 */
	public long getWhp_sites_mission_id();

	/**
	 * Sets the whp_sites_mission_id of this whp_sites_mission.
	 *
	 * @param whp_sites_mission_id the whp_sites_mission_id of this whp_sites_mission
	 */
	public void setWhp_sites_mission_id(long whp_sites_mission_id);

	/**
	 * Returns the site_id of this whp_sites_mission.
	 *
	 * @return the site_id of this whp_sites_mission
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this whp_sites_mission.
	 *
	 * @param site_id the site_id of this whp_sites_mission
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the missiontype of this whp_sites_mission.
	 *
	 * @return the missiontype of this whp_sites_mission
	 */
	public int getMissiontype();

	/**
	 * Sets the missiontype of this whp_sites_mission.
	 *
	 * @param missiontype the missiontype of this whp_sites_mission
	 */
	public void setMissiontype(int missiontype);

	/**
	 * Returns the date_published of this whp_sites_mission.
	 *
	 * @return the date_published of this whp_sites_mission
	 */
	public Date getDate_published();

	/**
	 * Sets the date_published of this whp_sites_mission.
	 *
	 * @param date_published the date_published of this whp_sites_mission
	 */
	public void setDate_published(Date date_published);

	/**
	 * Returns the document_link of this whp_sites_mission.
	 *
	 * @return the document_link of this whp_sites_mission
	 */
	@AutoEscape
	public String getDocument_link();

	/**
	 * Sets the document_link of this whp_sites_mission.
	 *
	 * @param document_link the document_link of this whp_sites_mission
	 */
	public void setDocument_link(String document_link);

	/**
	 * Returns the fileentryid of this whp_sites_mission.
	 *
	 * @return the fileentryid of this whp_sites_mission
	 */
	public long getFileentryid();

	/**
	 * Sets the fileentryid of this whp_sites_mission.
	 *
	 * @param fileentryid the fileentryid of this whp_sites_mission
	 */
	public void setFileentryid(long fileentryid);

	/**
	 * Returns the doc_name of this whp_sites_mission.
	 *
	 * @return the doc_name of this whp_sites_mission
	 */
	@AutoEscape
	public String getDoc_name();

	/**
	 * Sets the doc_name of this whp_sites_mission.
	 *
	 * @param doc_name the doc_name of this whp_sites_mission
	 */
	public void setDoc_name(String doc_name);

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

	public int compareTo(whp_sites_mission whp_sites_mission);

	public int hashCode();

	public CacheModel<whp_sites_mission> toCacheModel();

	public whp_sites_mission toEscapedModel();

	public String toString();

	public String toXmlString();
}