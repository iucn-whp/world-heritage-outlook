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

import com.iucn.whp.dbservice.model.inscription_type_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing inscription_type_lkp in entity cache.
 *
 * @author alok.sen
 * @see inscription_type_lkp
 * @generated
 */
public class inscription_type_lkpCacheModel implements CacheModel<inscription_type_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{incription_type_id=");
		sb.append(incription_type_id);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	public inscription_type_lkp toEntityModel() {
		inscription_type_lkpImpl inscription_type_lkpImpl = new inscription_type_lkpImpl();

		inscription_type_lkpImpl.setIncription_type_id(incription_type_id);

		if (type == null) {
			inscription_type_lkpImpl.setType(StringPool.BLANK);
		}
		else {
			inscription_type_lkpImpl.setType(type);
		}

		inscription_type_lkpImpl.resetOriginalValues();

		return inscription_type_lkpImpl;
	}

	public int incription_type_id;
	public String type;
}