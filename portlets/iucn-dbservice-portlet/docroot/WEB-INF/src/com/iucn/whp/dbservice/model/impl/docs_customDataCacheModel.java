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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.docs_customData;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing docs_customData in entity cache.
 *
 * @author alok.sen
 * @see docs_customData
 * @generated
 */
public class docs_customDataCacheModel implements CacheModel<docs_customData>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{docs_customDataId=");
		sb.append(docs_customDataId);
		sb.append(", fileentryid=");
		sb.append(fileentryid);
		sb.append(", fileversionid=");
		sb.append(fileversionid);
		sb.append(", publish_date=");
		sb.append(publish_date);
		sb.append(", upload_date=");
		sb.append(upload_date);
		sb.append(", author=");
		sb.append(author);
		sb.append(", type=");
		sb.append(type);
		sb.append(", category=");
		sb.append(category);
		sb.append(", com=");
		sb.append(com);
		sb.append(", full_com=");
		sb.append(full_com);
		sb.append(", site=");
		sb.append(site);
		sb.append(", language=");
		sb.append(language);
		sb.append(", copyright=");
		sb.append(copyright);
		sb.append(", title=");
		sb.append(title);
		sb.append("}");

		return sb.toString();
	}

	public docs_customData toEntityModel() {
		docs_customDataImpl docs_customDataImpl = new docs_customDataImpl();

		docs_customDataImpl.setDocs_customDataId(docs_customDataId);
		docs_customDataImpl.setFileentryid(fileentryid);
		docs_customDataImpl.setFileversionid(fileversionid);

		if (publish_date == Long.MIN_VALUE) {
			docs_customDataImpl.setPublish_date(null);
		}
		else {
			docs_customDataImpl.setPublish_date(new Date(publish_date));
		}

		if (upload_date == Long.MIN_VALUE) {
			docs_customDataImpl.setUpload_date(null);
		}
		else {
			docs_customDataImpl.setUpload_date(new Date(upload_date));
		}

		if (author == null) {
			docs_customDataImpl.setAuthor(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setAuthor(author);
		}

		if (type == null) {
			docs_customDataImpl.setType(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setType(type);
		}

		if (category == null) {
			docs_customDataImpl.setCategory(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setCategory(category);
		}

		if (com == null) {
			docs_customDataImpl.setCom(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setCom(com);
		}

		if (full_com == null) {
			docs_customDataImpl.setFull_com(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setFull_com(full_com);
		}

		if (site == null) {
			docs_customDataImpl.setSite(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setSite(site);
		}

		if (language == null) {
			docs_customDataImpl.setLanguage(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setLanguage(language);
		}

		if (copyright == null) {
			docs_customDataImpl.setCopyright(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setCopyright(copyright);
		}

		if (title == null) {
			docs_customDataImpl.setTitle(StringPool.BLANK);
		}
		else {
			docs_customDataImpl.setTitle(title);
		}

		docs_customDataImpl.resetOriginalValues();

		return docs_customDataImpl;
	}

	public int docs_customDataId;
	public long fileentryid;
	public long fileversionid;
	public long publish_date;
	public long upload_date;
	public String author;
	public String type;
	public String category;
	public String com;
	public String full_com;
	public String site;
	public String language;
	public String copyright;
	public String title;
}