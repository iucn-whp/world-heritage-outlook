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

import com.iucn.whp.dbservice.model.thematic_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing thematic_lkp in entity cache.
 *
 * @author alok.sen
 * @see thematic_lkp
 * @generated
 */
public class thematic_lkpCacheModel implements CacheModel<thematic_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{thematicid=");
		sb.append(thematicid);
		sb.append(", thematic=");
		sb.append(thematic);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public thematic_lkp toEntityModel() {
		thematic_lkpImpl thematic_lkpImpl = new thematic_lkpImpl();

		thematic_lkpImpl.setThematicid(thematicid);

		if (thematic == null) {
			thematic_lkpImpl.setThematic(StringPool.BLANK);
		}
		else {
			thematic_lkpImpl.setThematic(thematic);
		}

		if (description == null) {
			thematic_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			thematic_lkpImpl.setDescription(description);
		}

		thematic_lkpImpl.resetOriginalValues();

		return thematic_lkpImpl;
	}

	public long thematicid;
	public String thematic;
	public String description;
}