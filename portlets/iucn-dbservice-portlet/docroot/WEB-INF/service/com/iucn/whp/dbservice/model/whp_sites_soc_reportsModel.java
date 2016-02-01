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
 * The base model interface for the whp_sites_soc_reports service. Represents a row in the &quot;whp_whp_sites_soc_reports&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_soc_reports
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl
 * @generated
 */
public interface whp_sites_soc_reportsModel extends BaseModel<whp_sites_soc_reports> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_sites_soc_reports model instance should use the {@link whp_sites_soc_reports} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_sites_soc_reports.
	 *
	 * @return the primary key of this whp_sites_soc_reports
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this whp_sites_soc_reports.
	 *
	 * @param primaryKey the primary key of this whp_sites_soc_reports
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the whp_sites_soc_reports_id of this whp_sites_soc_reports.
	 *
	 * @return the whp_sites_soc_reports_id of this whp_sites_soc_reports
	 */
	public long getWhp_sites_soc_reports_id();

	/**
	 * Sets the whp_sites_soc_reports_id of this whp_sites_soc_reports.
	 *
	 * @param whp_sites_soc_reports_id the whp_sites_soc_reports_id of this whp_sites_soc_reports
	 */
	public void setWhp_sites_soc_reports_id(long whp_sites_soc_reports_id);

	/**
	 * Returns the site_id of this whp_sites_soc_reports.
	 *
	 * @return the site_id of this whp_sites_soc_reports
	 */
	public long getSite_id();

	/**
	 * Sets the site_id of this whp_sites_soc_reports.
	 *
	 * @param site_id the site_id of this whp_sites_soc_reports
	 */
	public void setSite_id(long site_id);

	/**
	 * Returns the date_published of this whp_sites_soc_reports.
	 *
	 * @return the date_published of this whp_sites_soc_reports
	 */
	public Date getDate_published();

	/**
	 * Sets the date_published of this whp_sites_soc_reports.
	 *
	 * @param date_published the date_published of this whp_sites_soc_reports
	 */
	public void setDate_published(Date date_published);

	/**
	 * Returns the document_link of this whp_sites_soc_reports.
	 *
	 * @return the document_link of this whp_sites_soc_reports
	 */
	@AutoEscape
	public String getDocument_link();

	/**
	 * Sets the document_link of this whp_sites_soc_reports.
	 *
	 * @param document_link the document_link of this whp_sites_soc_reports
	 */
	public void setDocument_link(String document_link);

	/**
	 * Returns the fileentryid of this whp_sites_soc_reports.
	 *
	 * @return the fileentryid of this whp_sites_soc_reports
	 */
	public long getFileentryid();

	/**
	 * Sets the fileentryid of this whp_sites_soc_reports.
	 *
	 * @param fileentryid the fileentryid of this whp_sites_soc_reports
	 */
	public void setFileentryid(long fileentryid);

	/**
	 * Returns the doc_name of this whp_sites_soc_reports.
	 *
	 * @return the doc_name of this whp_sites_soc_reports
	 */
	@AutoEscape
	public String getDoc_name();

	/**
	 * Sets the doc_name of this whp_sites_soc_reports.
	 *
	 * @param doc_name the doc_name of this whp_sites_soc_reports
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

	public int compareTo(whp_sites_soc_reports whp_sites_soc_reports);

	public int hashCode();

	public CacheModel<whp_sites_soc_reports> toCacheModel();

	public whp_sites_soc_reports toEscapedModel();

	public String toString();

	public String toXmlString();
}