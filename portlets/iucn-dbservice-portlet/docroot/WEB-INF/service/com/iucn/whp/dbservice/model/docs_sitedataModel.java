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
 * The base model interface for the docs_sitedata service. Represents a row in the &quot;whp_docs_sitedata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.docs_sitedataModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.docs_sitedataImpl}.
 * </p>
 *
 * @author alok.sen
 * @see docs_sitedata
 * @see com.iucn.whp.dbservice.model.impl.docs_sitedataImpl
 * @see com.iucn.whp.dbservice.model.impl.docs_sitedataModelImpl
 * @generated
 */
public interface docs_sitedataModel extends BaseModel<docs_sitedata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a docs_sitedata model instance should use the {@link docs_sitedata} interface instead.
	 */

	/**
	 * Returns the primary key of this docs_sitedata.
	 *
	 * @return the primary key of this docs_sitedata
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this docs_sitedata.
	 *
	 * @param primaryKey the primary key of this docs_sitedata
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the docs_sitedata ID of this docs_sitedata.
	 *
	 * @return the docs_sitedata ID of this docs_sitedata
	 */
	public long getDocs_sitedataId();

	/**
	 * Sets the docs_sitedata ID of this docs_sitedata.
	 *
	 * @param docs_sitedataId the docs_sitedata ID of this docs_sitedata
	 */
	public void setDocs_sitedataId(long docs_sitedataId);

	/**
	 * Returns the fileentryid of this docs_sitedata.
	 *
	 * @return the fileentryid of this docs_sitedata
	 */
	public long getFileentryid();

	/**
	 * Sets the fileentryid of this docs_sitedata.
	 *
	 * @param fileentryid the fileentryid of this docs_sitedata
	 */
	public void setFileentryid(long fileentryid);

	/**
	 * Returns the fileversionid of this docs_sitedata.
	 *
	 * @return the fileversionid of this docs_sitedata
	 */
	public long getFileversionid();

	/**
	 * Sets the fileversionid of this docs_sitedata.
	 *
	 * @param fileversionid the fileversionid of this docs_sitedata
	 */
	public void setFileversionid(long fileversionid);

	/**
	 * Returns the siteid of this docs_sitedata.
	 *
	 * @return the siteid of this docs_sitedata
	 */
	public long getSiteid();

	/**
	 * Sets the siteid of this docs_sitedata.
	 *
	 * @param siteid the siteid of this docs_sitedata
	 */
	public void setSiteid(long siteid);

	/**
	 * Returns the date_published of this docs_sitedata.
	 *
	 * @return the date_published of this docs_sitedata
	 */
	public Date getDate_published();

	/**
	 * Sets the date_published of this docs_sitedata.
	 *
	 * @param date_published the date_published of this docs_sitedata
	 */
	public void setDate_published(Date date_published);

	/**
	 * Returns the doc_name of this docs_sitedata.
	 *
	 * @return the doc_name of this docs_sitedata
	 */
	@AutoEscape
	public String getDoc_name();

	/**
	 * Sets the doc_name of this docs_sitedata.
	 *
	 * @param doc_name the doc_name of this docs_sitedata
	 */
	public void setDoc_name(String doc_name);

	/**
	 * Returns the document_link of this docs_sitedata.
	 *
	 * @return the document_link of this docs_sitedata
	 */
	@AutoEscape
	public String getDocument_link();

	/**
	 * Sets the document_link of this docs_sitedata.
	 *
	 * @param document_link the document_link of this docs_sitedata
	 */
	public void setDocument_link(String document_link);

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

	public int compareTo(docs_sitedata docs_sitedata);

	public int hashCode();

	public CacheModel<docs_sitedata> toCacheModel();

	public docs_sitedata toEscapedModel();

	public String toString();

	public String toXmlString();
}