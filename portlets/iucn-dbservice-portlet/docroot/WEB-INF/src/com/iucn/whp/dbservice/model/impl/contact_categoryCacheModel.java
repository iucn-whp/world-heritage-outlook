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

import com.iucn.whp.dbservice.model.contact_category;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing contact_category in entity cache.
 *
 * @author alok.sen
 * @see contact_category
 * @generated
 */
public class contact_categoryCacheModel implements CacheModel<contact_category>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{contact_category_id=");
		sb.append(contact_category_id);
		sb.append(", category_name=");
		sb.append(category_name);
		sb.append("}");

		return sb.toString();
	}

	public contact_category toEntityModel() {
		contact_categoryImpl contact_categoryImpl = new contact_categoryImpl();

		contact_categoryImpl.setContact_category_id(contact_category_id);

		if (category_name == null) {
			contact_categoryImpl.setCategory_name(StringPool.BLANK);
		}
		else {
			contact_categoryImpl.setCategory_name(category_name);
		}

		contact_categoryImpl.resetOriginalValues();

		return contact_categoryImpl;
	}

	public int contact_category_id;
	public String category_name;
}