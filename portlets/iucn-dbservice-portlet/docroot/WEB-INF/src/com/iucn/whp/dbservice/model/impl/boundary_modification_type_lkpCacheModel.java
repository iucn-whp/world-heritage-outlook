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

import com.iucn.whp.dbservice.model.boundary_modification_type_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing boundary_modification_type_lkp in entity cache.
 *
 * @author alok.sen
 * @see boundary_modification_type_lkp
 * @generated
 */
public class boundary_modification_type_lkpCacheModel implements CacheModel<boundary_modification_type_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{bm_id=");
		sb.append(bm_id);
		sb.append(", bm_type=");
		sb.append(bm_type);
		sb.append("}");

		return sb.toString();
	}

	public boundary_modification_type_lkp toEntityModel() {
		boundary_modification_type_lkpImpl boundary_modification_type_lkpImpl = new boundary_modification_type_lkpImpl();

		boundary_modification_type_lkpImpl.setBm_id(bm_id);

		if (bm_type == null) {
			boundary_modification_type_lkpImpl.setBm_type(StringPool.BLANK);
		}
		else {
			boundary_modification_type_lkpImpl.setBm_type(bm_type);
		}

		boundary_modification_type_lkpImpl.resetOriginalValues();

		return boundary_modification_type_lkpImpl;
	}

	public int bm_id;
	public String bm_type;
}