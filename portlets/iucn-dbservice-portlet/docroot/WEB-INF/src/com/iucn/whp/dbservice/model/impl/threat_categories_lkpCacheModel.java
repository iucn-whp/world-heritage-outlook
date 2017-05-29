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

import com.iucn.whp.dbservice.model.threat_categories_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing threat_categories_lkp in entity cache.
 *
 * @author alok.sen
 * @see threat_categories_lkp
 * @generated
 */
public class threat_categories_lkpCacheModel implements CacheModel<threat_categories_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{threatCategoryid=");
		sb.append(threatCategoryid);
		sb.append(", threat_category=");
		sb.append(threat_category);
		sb.append("}");

		return sb.toString();
	}

	public threat_categories_lkp toEntityModel() {
		threat_categories_lkpImpl threat_categories_lkpImpl = new threat_categories_lkpImpl();

		threat_categories_lkpImpl.setThreatCategoryid(threatCategoryid);

		if (threat_category == null) {
			threat_categories_lkpImpl.setThreat_category(StringPool.BLANK);
		}
		else {
			threat_categories_lkpImpl.setThreat_category(threat_category);
		}

		threat_categories_lkpImpl.resetOriginalValues();

		return threat_categories_lkpImpl;
	}

	public long threatCategoryid;
	public String threat_category;
}