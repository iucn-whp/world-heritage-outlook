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

import com.iucn.whp.dbservice.model.iucn_pa_lkp_category;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing iucn_pa_lkp_category in entity cache.
 *
 * @author alok.sen
 * @see iucn_pa_lkp_category
 * @generated
 */
public class iucn_pa_lkp_categoryCacheModel implements CacheModel<iucn_pa_lkp_category>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{iucn_pa_category_id=");
		sb.append(iucn_pa_category_id);
		sb.append(", category=");
		sb.append(category);
		sb.append("}");

		return sb.toString();
	}

	public iucn_pa_lkp_category toEntityModel() {
		iucn_pa_lkp_categoryImpl iucn_pa_lkp_categoryImpl = new iucn_pa_lkp_categoryImpl();

		iucn_pa_lkp_categoryImpl.setIucn_pa_category_id(iucn_pa_category_id);

		if (category == null) {
			iucn_pa_lkp_categoryImpl.setCategory(StringPool.BLANK);
		}
		else {
			iucn_pa_lkp_categoryImpl.setCategory(category);
		}

		iucn_pa_lkp_categoryImpl.resetOriginalValues();

		return iucn_pa_lkp_categoryImpl;
	}

	public int iucn_pa_category_id;
	public String category;
}