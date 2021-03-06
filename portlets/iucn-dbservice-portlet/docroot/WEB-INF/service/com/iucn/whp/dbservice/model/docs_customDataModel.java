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
 * The base model interface for the docs_customData service. Represents a row in the &quot;whp_docs_customData&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.docs_customDataModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.docs_customDataImpl}.
 * </p>
 *
 * @author alok.sen
 * @see docs_customData
 * @see com.iucn.whp.dbservice.model.impl.docs_customDataImpl
 * @see com.iucn.whp.dbservice.model.impl.docs_customDataModelImpl
 * @generated
 */
public interface docs_customDataModel extends BaseModel<docs_customData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a docs_custom data model instance should use the {@link docs_customData} interface instead.
	 */

	/**
	 * Returns the primary key of this docs_custom data.
	 *
	 * @return the primary key of this docs_custom data
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this docs_custom data.
	 *
	 * @param primaryKey the primary key of this docs_custom data
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the docs_custom data ID of this docs_custom data.
	 *
	 * @return the docs_custom data ID of this docs_custom data
	 */
	public int getDocs_customDataId();

	/**
	 * Sets the docs_custom data ID of this docs_custom data.
	 *
	 * @param docs_customDataId the docs_custom data ID of this docs_custom data
	 */
	public void setDocs_customDataId(int docs_customDataId);

	/**
	 * Returns the fileentryid of this docs_custom data.
	 *
	 * @return the fileentryid of this docs_custom data
	 */
	public long getFileentryid();

	/**
	 * Sets the fileentryid of this docs_custom data.
	 *
	 * @param fileentryid the fileentryid of this docs_custom data
	 */
	public void setFileentryid(long fileentryid);

	/**
	 * Returns the fileversionid of this docs_custom data.
	 *
	 * @return the fileversionid of this docs_custom data
	 */
	public long getFileversionid();

	/**
	 * Sets the fileversionid of this docs_custom data.
	 *
	 * @param fileversionid the fileversionid of this docs_custom data
	 */
	public void setFileversionid(long fileversionid);

	/**
	 * Returns the publish_date of this docs_custom data.
	 *
	 * @return the publish_date of this docs_custom data
	 */
	public Date getPublish_date();

	/**
	 * Sets the publish_date of this docs_custom data.
	 *
	 * @param publish_date the publish_date of this docs_custom data
	 */
	public void setPublish_date(Date publish_date);

	/**
	 * Returns the upload_date of this docs_custom data.
	 *
	 * @return the upload_date of this docs_custom data
	 */
	public Date getUpload_date();

	/**
	 * Sets the upload_date of this docs_custom data.
	 *
	 * @param upload_date the upload_date of this docs_custom data
	 */
	public void setUpload_date(Date upload_date);

	/**
	 * Returns the author of this docs_custom data.
	 *
	 * @return the author of this docs_custom data
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this docs_custom data.
	 *
	 * @param author the author of this docs_custom data
	 */
	public void setAuthor(String author);

	/**
	 * Returns the type of this docs_custom data.
	 *
	 * @return the type of this docs_custom data
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this docs_custom data.
	 *
	 * @param type the type of this docs_custom data
	 */
	public void setType(String type);

	/**
	 * Returns the category of this docs_custom data.
	 *
	 * @return the category of this docs_custom data
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this docs_custom data.
	 *
	 * @param category the category of this docs_custom data
	 */
	public void setCategory(String category);

	/**
	 * Returns the com of this docs_custom data.
	 *
	 * @return the com of this docs_custom data
	 */
	@AutoEscape
	public String getCom();

	/**
	 * Sets the com of this docs_custom data.
	 *
	 * @param com the com of this docs_custom data
	 */
	public void setCom(String com);

	/**
	 * Returns the full_com of this docs_custom data.
	 *
	 * @return the full_com of this docs_custom data
	 */
	@AutoEscape
	public String getFull_com();

	/**
	 * Sets the full_com of this docs_custom data.
	 *
	 * @param full_com the full_com of this docs_custom data
	 */
	public void setFull_com(String full_com);

	/**
	 * Returns the site of this docs_custom data.
	 *
	 * @return the site of this docs_custom data
	 */
	@AutoEscape
	public String getSite();

	/**
	 * Sets the site of this docs_custom data.
	 *
	 * @param site the site of this docs_custom data
	 */
	public void setSite(String site);

	/**
	 * Returns the language of this docs_custom data.
	 *
	 * @return the language of this docs_custom data
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this docs_custom data.
	 *
	 * @param language the language of this docs_custom data
	 */
	public void setLanguage(String language);

	/**
	 * Returns the copyright of this docs_custom data.
	 *
	 * @return the copyright of this docs_custom data
	 */
	@AutoEscape
	public String getCopyright();

	/**
	 * Sets the copyright of this docs_custom data.
	 *
	 * @param copyright the copyright of this docs_custom data
	 */
	public void setCopyright(String copyright);

	/**
	 * Returns the title of this docs_custom data.
	 *
	 * @return the title of this docs_custom data
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this docs_custom data.
	 *
	 * @param title the title of this docs_custom data
	 */
	public void setTitle(String title);

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

	public int compareTo(docs_customData docs_customData);

	public int hashCode();

	public CacheModel<docs_customData> toCacheModel();

	public docs_customData toEscapedModel();

	public String toString();

	public String toXmlString();
}