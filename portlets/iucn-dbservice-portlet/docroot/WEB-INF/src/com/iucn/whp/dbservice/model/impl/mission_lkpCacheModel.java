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

import com.iucn.whp.dbservice.model.mission_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing mission_lkp in entity cache.
 *
 * @author alok.sen
 * @see mission_lkp
 * @generated
 */
public class mission_lkpCacheModel implements CacheModel<mission_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{mission_id=");
		sb.append(mission_id);
		sb.append(", mission_type=");
		sb.append(mission_type);
		sb.append("}");

		return sb.toString();
	}

	public mission_lkp toEntityModel() {
		mission_lkpImpl mission_lkpImpl = new mission_lkpImpl();

		mission_lkpImpl.setMission_id(mission_id);

		if (mission_type == null) {
			mission_lkpImpl.setMission_type(StringPool.BLANK);
		}
		else {
			mission_lkpImpl.setMission_type(mission_type);
		}

		mission_lkpImpl.resetOriginalValues();

		return mission_lkpImpl;
	}

	public int mission_id;
	public String mission_type;
}