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

import com.iucn.whp.dbservice.model.threat_subcategories_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_subcategories_lkp in entity cache.
 *
 * @author alok.sen
 * @see threat_subcategories_lkp
 * @generated
 */
public class threat_subcategories_lkpCacheModel implements CacheModel<threat_subcategories_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", threat_sub_category=");
		sb.append(threat_sub_category);
		sb.append(", parent_id=");
		sb.append(parent_id);
		sb.append("}");

		return sb.toString();
	}

	public threat_subcategories_lkp toEntityModel() {
		threat_subcategories_lkpImpl threat_subcategories_lkpImpl = new threat_subcategories_lkpImpl();

		threat_subcategories_lkpImpl.setId(id);

		if (threat_sub_category == null) {
			threat_subcategories_lkpImpl.setThreat_sub_category(StringPool.BLANK);
		}
		else {
			threat_subcategories_lkpImpl.setThreat_sub_category(threat_sub_category);
		}

		threat_subcategories_lkpImpl.setParent_id(parent_id);

		threat_subcategories_lkpImpl.resetOriginalValues();

		return threat_subcategories_lkpImpl;
	}

	public long id;
	public String threat_sub_category;
	public long parent_id;
}