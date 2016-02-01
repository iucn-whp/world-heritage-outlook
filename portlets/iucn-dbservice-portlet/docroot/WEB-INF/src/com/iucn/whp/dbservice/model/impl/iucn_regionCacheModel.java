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

import com.iucn.whp.dbservice.model.iucn_region;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing iucn_region in entity cache.
 *
 * @author alok.sen
 * @see iucn_region
 * @generated
 */
public class iucn_regionCacheModel implements CacheModel<iucn_region>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{iucn_region_id=");
		sb.append(iucn_region_id);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	public iucn_region toEntityModel() {
		iucn_regionImpl iucn_regionImpl = new iucn_regionImpl();

		iucn_regionImpl.setIucn_region_id(iucn_region_id);

		if (name == null) {
			iucn_regionImpl.setName(StringPool.BLANK);
		}
		else {
			iucn_regionImpl.setName(name);
		}

		iucn_regionImpl.resetOriginalValues();

		return iucn_regionImpl;
	}

	public int iucn_region_id;
	public String name;
}