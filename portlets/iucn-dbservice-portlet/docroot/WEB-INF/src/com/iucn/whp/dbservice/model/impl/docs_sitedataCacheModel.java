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

import com.iucn.whp.dbservice.model.docs_sitedata;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing docs_sitedata in entity cache.
 *
 * @author alok.sen
 * @see docs_sitedata
 * @generated
 */
public class docs_sitedataCacheModel implements CacheModel<docs_sitedata>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{docs_sitedataId=");
		sb.append(docs_sitedataId);
		sb.append(", fileentryid=");
		sb.append(fileentryid);
		sb.append(", fileversionid=");
		sb.append(fileversionid);
		sb.append(", siteid=");
		sb.append(siteid);
		sb.append(", date_published=");
		sb.append(date_published);
		sb.append(", doc_name=");
		sb.append(doc_name);
		sb.append(", document_link=");
		sb.append(document_link);
		sb.append("}");

		return sb.toString();
	}

	public docs_sitedata toEntityModel() {
		docs_sitedataImpl docs_sitedataImpl = new docs_sitedataImpl();

		docs_sitedataImpl.setDocs_sitedataId(docs_sitedataId);
		docs_sitedataImpl.setFileentryid(fileentryid);
		docs_sitedataImpl.setFileversionid(fileversionid);
		docs_sitedataImpl.setSiteid(siteid);

		if (date_published == Long.MIN_VALUE) {
			docs_sitedataImpl.setDate_published(null);
		}
		else {
			docs_sitedataImpl.setDate_published(new Date(date_published));
		}

		if (doc_name == null) {
			docs_sitedataImpl.setDoc_name(StringPool.BLANK);
		}
		else {
			docs_sitedataImpl.setDoc_name(doc_name);
		}

		if (document_link == null) {
			docs_sitedataImpl.setDocument_link(StringPool.BLANK);
		}
		else {
			docs_sitedataImpl.setDocument_link(document_link);
		}

		docs_sitedataImpl.resetOriginalValues();

		return docs_sitedataImpl;
	}

	public long docs_sitedataId;
	public long fileentryid;
	public long fileversionid;
	public long siteid;
	public long date_published;
	public String doc_name;
	public String document_link;
}