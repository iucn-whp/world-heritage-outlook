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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link docs_customData}.
 * </p>
 *
 * @author    alok.sen
 * @see       docs_customData
 * @generated
 */
public class docs_customDataWrapper implements docs_customData,
	ModelWrapper<docs_customData> {
	public docs_customDataWrapper(docs_customData docs_customData) {
		_docs_customData = docs_customData;
	}

	public Class<?> getModelClass() {
		return docs_customData.class;
	}

	public String getModelClassName() {
		return docs_customData.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docs_customDataId", getDocs_customDataId());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("fileversionid", getFileversionid());
		attributes.put("publish_date", getPublish_date());
		attributes.put("upload_date", getUpload_date());
		attributes.put("author", getAuthor());
		attributes.put("type", getType());
		attributes.put("category", getCategory());
		attributes.put("com", getCom());
		attributes.put("full_com", getFull_com());
		attributes.put("site", getSite());
		attributes.put("language", getLanguage());
		attributes.put("copyright", getCopyright());
		attributes.put("title", getTitle());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer docs_customDataId = (Integer)attributes.get("docs_customDataId");

		if (docs_customDataId != null) {
			setDocs_customDataId(docs_customDataId);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		Long fileversionid = (Long)attributes.get("fileversionid");

		if (fileversionid != null) {
			setFileversionid(fileversionid);
		}

		Date publish_date = (Date)attributes.get("publish_date");

		if (publish_date != null) {
			setPublish_date(publish_date);
		}

		Date upload_date = (Date)attributes.get("upload_date");

		if (upload_date != null) {
			setUpload_date(upload_date);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String com = (String)attributes.get("com");

		if (com != null) {
			setCom(com);
		}

		String full_com = (String)attributes.get("full_com");

		if (full_com != null) {
			setFull_com(full_com);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String copyright = (String)attributes.get("copyright");

		if (copyright != null) {
			setCopyright(copyright);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}
	}

	/**
	* Returns the primary key of this docs_custom data.
	*
	* @return the primary key of this docs_custom data
	*/
	public int getPrimaryKey() {
		return _docs_customData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this docs_custom data.
	*
	* @param primaryKey the primary key of this docs_custom data
	*/
	public void setPrimaryKey(int primaryKey) {
		_docs_customData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the docs_custom data ID of this docs_custom data.
	*
	* @return the docs_custom data ID of this docs_custom data
	*/
	public int getDocs_customDataId() {
		return _docs_customData.getDocs_customDataId();
	}

	/**
	* Sets the docs_custom data ID of this docs_custom data.
	*
	* @param docs_customDataId the docs_custom data ID of this docs_custom data
	*/
	public void setDocs_customDataId(int docs_customDataId) {
		_docs_customData.setDocs_customDataId(docs_customDataId);
	}

	/**
	* Returns the fileentryid of this docs_custom data.
	*
	* @return the fileentryid of this docs_custom data
	*/
	public long getFileentryid() {
		return _docs_customData.getFileentryid();
	}

	/**
	* Sets the fileentryid of this docs_custom data.
	*
	* @param fileentryid the fileentryid of this docs_custom data
	*/
	public void setFileentryid(long fileentryid) {
		_docs_customData.setFileentryid(fileentryid);
	}

	/**
	* Returns the fileversionid of this docs_custom data.
	*
	* @return the fileversionid of this docs_custom data
	*/
	public long getFileversionid() {
		return _docs_customData.getFileversionid();
	}

	/**
	* Sets the fileversionid of this docs_custom data.
	*
	* @param fileversionid the fileversionid of this docs_custom data
	*/
	public void setFileversionid(long fileversionid) {
		_docs_customData.setFileversionid(fileversionid);
	}

	/**
	* Returns the publish_date of this docs_custom data.
	*
	* @return the publish_date of this docs_custom data
	*/
	public java.util.Date getPublish_date() {
		return _docs_customData.getPublish_date();
	}

	/**
	* Sets the publish_date of this docs_custom data.
	*
	* @param publish_date the publish_date of this docs_custom data
	*/
	public void setPublish_date(java.util.Date publish_date) {
		_docs_customData.setPublish_date(publish_date);
	}

	/**
	* Returns the upload_date of this docs_custom data.
	*
	* @return the upload_date of this docs_custom data
	*/
	public java.util.Date getUpload_date() {
		return _docs_customData.getUpload_date();
	}

	/**
	* Sets the upload_date of this docs_custom data.
	*
	* @param upload_date the upload_date of this docs_custom data
	*/
	public void setUpload_date(java.util.Date upload_date) {
		_docs_customData.setUpload_date(upload_date);
	}

	/**
	* Returns the author of this docs_custom data.
	*
	* @return the author of this docs_custom data
	*/
	public java.lang.String getAuthor() {
		return _docs_customData.getAuthor();
	}

	/**
	* Sets the author of this docs_custom data.
	*
	* @param author the author of this docs_custom data
	*/
	public void setAuthor(java.lang.String author) {
		_docs_customData.setAuthor(author);
	}

	/**
	* Returns the type of this docs_custom data.
	*
	* @return the type of this docs_custom data
	*/
	public java.lang.String getType() {
		return _docs_customData.getType();
	}

	/**
	* Sets the type of this docs_custom data.
	*
	* @param type the type of this docs_custom data
	*/
	public void setType(java.lang.String type) {
		_docs_customData.setType(type);
	}

	/**
	* Returns the category of this docs_custom data.
	*
	* @return the category of this docs_custom data
	*/
	public java.lang.String getCategory() {
		return _docs_customData.getCategory();
	}

	/**
	* Sets the category of this docs_custom data.
	*
	* @param category the category of this docs_custom data
	*/
	public void setCategory(java.lang.String category) {
		_docs_customData.setCategory(category);
	}

	/**
	* Returns the com of this docs_custom data.
	*
	* @return the com of this docs_custom data
	*/
	public java.lang.String getCom() {
		return _docs_customData.getCom();
	}

	/**
	* Sets the com of this docs_custom data.
	*
	* @param com the com of this docs_custom data
	*/
	public void setCom(java.lang.String com) {
		_docs_customData.setCom(com);
	}

	/**
	* Returns the full_com of this docs_custom data.
	*
	* @return the full_com of this docs_custom data
	*/
	public java.lang.String getFull_com() {
		return _docs_customData.getFull_com();
	}

	/**
	* Sets the full_com of this docs_custom data.
	*
	* @param full_com the full_com of this docs_custom data
	*/
	public void setFull_com(java.lang.String full_com) {
		_docs_customData.setFull_com(full_com);
	}

	/**
	* Returns the site of this docs_custom data.
	*
	* @return the site of this docs_custom data
	*/
	public java.lang.String getSite() {
		return _docs_customData.getSite();
	}

	/**
	* Sets the site of this docs_custom data.
	*
	* @param site the site of this docs_custom data
	*/
	public void setSite(java.lang.String site) {
		_docs_customData.setSite(site);
	}

	/**
	* Returns the language of this docs_custom data.
	*
	* @return the language of this docs_custom data
	*/
	public java.lang.String getLanguage() {
		return _docs_customData.getLanguage();
	}

	/**
	* Sets the language of this docs_custom data.
	*
	* @param language the language of this docs_custom data
	*/
	public void setLanguage(java.lang.String language) {
		_docs_customData.setLanguage(language);
	}

	/**
	* Returns the copyright of this docs_custom data.
	*
	* @return the copyright of this docs_custom data
	*/
	public java.lang.String getCopyright() {
		return _docs_customData.getCopyright();
	}

	/**
	* Sets the copyright of this docs_custom data.
	*
	* @param copyright the copyright of this docs_custom data
	*/
	public void setCopyright(java.lang.String copyright) {
		_docs_customData.setCopyright(copyright);
	}

	/**
	* Returns the title of this docs_custom data.
	*
	* @return the title of this docs_custom data
	*/
	public java.lang.String getTitle() {
		return _docs_customData.getTitle();
	}

	/**
	* Sets the title of this docs_custom data.
	*
	* @param title the title of this docs_custom data
	*/
	public void setTitle(java.lang.String title) {
		_docs_customData.setTitle(title);
	}

	public boolean isNew() {
		return _docs_customData.isNew();
	}

	public void setNew(boolean n) {
		_docs_customData.setNew(n);
	}

	public boolean isCachedModel() {
		return _docs_customData.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_docs_customData.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _docs_customData.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _docs_customData.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_docs_customData.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _docs_customData.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_docs_customData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new docs_customDataWrapper((docs_customData)_docs_customData.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.docs_customData docs_customData) {
		return _docs_customData.compareTo(docs_customData);
	}

	@Override
	public int hashCode() {
		return _docs_customData.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.docs_customData> toCacheModel() {
		return _docs_customData.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.docs_customData toEscapedModel() {
		return new docs_customDataWrapper(_docs_customData.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _docs_customData.toString();
	}

	public java.lang.String toXmlString() {
		return _docs_customData.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_docs_customData.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public docs_customData getWrappeddocs_customData() {
		return _docs_customData;
	}

	public docs_customData getWrappedModel() {
		return _docs_customData;
	}

	public void resetOriginalValues() {
		_docs_customData.resetOriginalValues();
	}

	private docs_customData _docs_customData;
}