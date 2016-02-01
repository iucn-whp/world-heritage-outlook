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

import com.iucn.whp.dbservice.model.unesco_region;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing unesco_region in entity cache.
 *
 * @author alok.sen
 * @see unesco_region
 * @generated
 */
public class unesco_regionCacheModel implements CacheModel<unesco_region>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{unesco_region_id=");
		sb.append(unesco_region_id);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	public unesco_region toEntityModel() {
		unesco_regionImpl unesco_regionImpl = new unesco_regionImpl();

		unesco_regionImpl.setUnesco_region_id(unesco_region_id);

		if (name == null) {
			unesco_regionImpl.setName(StringPool.BLANK);
		}
		else {
			unesco_regionImpl.setName(name);
		}

		unesco_regionImpl.resetOriginalValues();

		return unesco_regionImpl;
	}

	public int unesco_region_id;
	public String name;
}