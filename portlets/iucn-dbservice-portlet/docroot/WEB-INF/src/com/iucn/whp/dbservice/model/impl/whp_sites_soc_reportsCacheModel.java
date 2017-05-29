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

import com.iucn.whp.dbservice.model.whp_sites_soc_reports;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_soc_reports in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_soc_reports
 * @generated
 */
public class whp_sites_soc_reportsCacheModel implements CacheModel<whp_sites_soc_reports>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{whp_sites_soc_reports_id=");
		sb.append(whp_sites_soc_reports_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", date_published=");
		sb.append(date_published);
		sb.append(", document_link=");
		sb.append(document_link);
		sb.append(", fileentryid=");
		sb.append(fileentryid);
		sb.append(", doc_name=");
		sb.append(doc_name);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_soc_reports toEntityModel() {
		whp_sites_soc_reportsImpl whp_sites_soc_reportsImpl = new whp_sites_soc_reportsImpl();

		whp_sites_soc_reportsImpl.setWhp_sites_soc_reports_id(whp_sites_soc_reports_id);
		whp_sites_soc_reportsImpl.setSite_id(site_id);

		if (date_published == Long.MIN_VALUE) {
			whp_sites_soc_reportsImpl.setDate_published(null);
		}
		else {
			whp_sites_soc_reportsImpl.setDate_published(new Date(date_published));
		}

		if (document_link == null) {
			whp_sites_soc_reportsImpl.setDocument_link(StringPool.BLANK);
		}
		else {
			whp_sites_soc_reportsImpl.setDocument_link(document_link);
		}

		whp_sites_soc_reportsImpl.setFileentryid(fileentryid);

		if (doc_name == null) {
			whp_sites_soc_reportsImpl.setDoc_name(StringPool.BLANK);
		}
		else {
			whp_sites_soc_reportsImpl.setDoc_name(doc_name);
		}

		whp_sites_soc_reportsImpl.resetOriginalValues();

		return whp_sites_soc_reportsImpl;
	}

	public long whp_sites_soc_reports_id;
	public long site_id;
	public long date_published;
	public String document_link;
	public long fileentryid;
	public String doc_name;
}