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

import com.iucn.whp.dbservice.model.whp_sites_contacts;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_contacts in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_contacts
 * @generated
 */
public class whp_sites_contactsCacheModel implements CacheModel<whp_sites_contacts>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_contacts_id=");
		sb.append(whp_sites_contacts_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", contactid=");
		sb.append(contactid);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_contacts toEntityModel() {
		whp_sites_contactsImpl whp_sites_contactsImpl = new whp_sites_contactsImpl();

		whp_sites_contactsImpl.setWhp_sites_contacts_id(whp_sites_contacts_id);
		whp_sites_contactsImpl.setSite_id(site_id);
		whp_sites_contactsImpl.setContactid(contactid);

		whp_sites_contactsImpl.resetOriginalValues();

		return whp_sites_contactsImpl;
	}

	public long whp_sites_contacts_id;
	public long site_id;
	public int contactid;
}