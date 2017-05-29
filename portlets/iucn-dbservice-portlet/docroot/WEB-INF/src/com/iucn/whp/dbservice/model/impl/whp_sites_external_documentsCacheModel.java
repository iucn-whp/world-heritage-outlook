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

import com.iucn.whp.dbservice.model.whp_sites_external_documents;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_external_documents in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_external_documents
 * @generated
 */
public class whp_sites_external_documentsCacheModel implements CacheModel<whp_sites_external_documents>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{whp_sites_external_documents_id=");
		sb.append(whp_sites_external_documents_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", document_description=");
		sb.append(document_description);
		sb.append(", document_link=");
		sb.append(document_link);
		sb.append(", fileentryid=");
		sb.append(fileentryid);
		sb.append(", doc_name=");
		sb.append(doc_name);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_external_documents toEntityModel() {
		whp_sites_external_documentsImpl whp_sites_external_documentsImpl = new whp_sites_external_documentsImpl();

		whp_sites_external_documentsImpl.setWhp_sites_external_documents_id(whp_sites_external_documents_id);
		whp_sites_external_documentsImpl.setSite_id(site_id);

		if (document_description == null) {
			whp_sites_external_documentsImpl.setDocument_description(StringPool.BLANK);
		}
		else {
			whp_sites_external_documentsImpl.setDocument_description(document_description);
		}

		if (document_link == null) {
			whp_sites_external_documentsImpl.setDocument_link(StringPool.BLANK);
		}
		else {
			whp_sites_external_documentsImpl.setDocument_link(document_link);
		}

		whp_sites_external_documentsImpl.setFileentryid(fileentryid);

		if (doc_name == null) {
			whp_sites_external_documentsImpl.setDoc_name(StringPool.BLANK);
		}
		else {
			whp_sites_external_documentsImpl.setDoc_name(doc_name);
		}

		whp_sites_external_documentsImpl.resetOriginalValues();

		return whp_sites_external_documentsImpl;
	}

	public long whp_sites_external_documents_id;
	public long site_id;
	public String document_description;
	public String document_link;
	public long fileentryid;
	public String doc_name;
}