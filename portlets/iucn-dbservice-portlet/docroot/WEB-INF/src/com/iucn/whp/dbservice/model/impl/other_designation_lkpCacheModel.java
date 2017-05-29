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

import com.iucn.whp.dbservice.model.other_designation_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing other_designation_lkp in entity cache.
 *
 * @author alok.sen
 * @see other_designation_lkp
 * @generated
 */
public class other_designation_lkpCacheModel implements CacheModel<other_designation_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{other_designations_id=");
		sb.append(other_designations_id);
		sb.append(", designation=");
		sb.append(designation);
		sb.append("}");

		return sb.toString();
	}

	public other_designation_lkp toEntityModel() {
		other_designation_lkpImpl other_designation_lkpImpl = new other_designation_lkpImpl();

		other_designation_lkpImpl.setOther_designations_id(other_designations_id);

		if (designation == null) {
			other_designation_lkpImpl.setDesignation(StringPool.BLANK);
		}
		else {
			other_designation_lkpImpl.setDesignation(designation);
		}

		other_designation_lkpImpl.resetOriginalValues();

		return other_designation_lkpImpl;
	}

	public int other_designations_id;
	public String designation;
}