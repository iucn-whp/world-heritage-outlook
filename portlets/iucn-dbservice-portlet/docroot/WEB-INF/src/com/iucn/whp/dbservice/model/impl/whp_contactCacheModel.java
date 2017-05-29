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

import com.iucn.whp.dbservice.model.whp_contact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_contact in entity cache.
 *
 * @author alok.sen
 * @see whp_contact
 * @generated
 */
public class whp_contactCacheModel implements CacheModel<whp_contact>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{contact_id=");
		sb.append(contact_id);
		sb.append(", prefix=");
		sb.append(prefix);
		sb.append(", last_name=");
		sb.append(last_name);
		sb.append(", first_name=");
		sb.append(first_name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", position=");
		sb.append(position);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", address=");
		sb.append(address);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", last_updated=");
		sb.append(last_updated);
		sb.append(", categoryid=");
		sb.append(categoryid);
		sb.append("}");

		return sb.toString();
	}

	public whp_contact toEntityModel() {
		whp_contactImpl whp_contactImpl = new whp_contactImpl();

		whp_contactImpl.setContact_id(contact_id);

		if (prefix == null) {
			whp_contactImpl.setPrefix(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setPrefix(prefix);
		}

		if (last_name == null) {
			whp_contactImpl.setLast_name(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setLast_name(last_name);
		}

		if (first_name == null) {
			whp_contactImpl.setFirst_name(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setFirst_name(first_name);
		}

		if (email == null) {
			whp_contactImpl.setEmail(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setEmail(email);
		}

		if (position == null) {
			whp_contactImpl.setPosition(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setPosition(position);
		}

		if (organization == null) {
			whp_contactImpl.setOrganization(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setOrganization(organization);
		}

		if (address == null) {
			whp_contactImpl.setAddress(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setAddress(address);
		}

		if (telephone == null) {
			whp_contactImpl.setTelephone(StringPool.BLANK);
		}
		else {
			whp_contactImpl.setTelephone(telephone);
		}

		if (last_updated == Long.MIN_VALUE) {
			whp_contactImpl.setLast_updated(null);
		}
		else {
			whp_contactImpl.setLast_updated(new Date(last_updated));
		}

		whp_contactImpl.setCategoryid(categoryid);

		whp_contactImpl.resetOriginalValues();

		return whp_contactImpl;
	}

	public int contact_id;
	public String prefix;
	public String last_name;
	public String first_name;
	public String email;
	public String position;
	public String organization;
	public String address;
	public String telephone;
	public long last_updated;
	public int categoryid;
}