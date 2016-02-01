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

import com.iucn.whp.dbservice.model.danger_list_status_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing danger_list_status_lkp in entity cache.
 *
 * @author alok.sen
 * @see danger_list_status_lkp
 * @generated
 */
public class danger_list_status_lkpCacheModel implements CacheModel<danger_list_status_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{dlstatus_id=");
		sb.append(dlstatus_id);
		sb.append(", dl_status=");
		sb.append(dl_status);
		sb.append("}");

		return sb.toString();
	}

	public danger_list_status_lkp toEntityModel() {
		danger_list_status_lkpImpl danger_list_status_lkpImpl = new danger_list_status_lkpImpl();

		danger_list_status_lkpImpl.setDlstatus_id(dlstatus_id);

		if (dl_status == null) {
			danger_list_status_lkpImpl.setDl_status(StringPool.BLANK);
		}
		else {
			danger_list_status_lkpImpl.setDl_status(dl_status);
		}

		danger_list_status_lkpImpl.resetOriginalValues();

		return danger_list_status_lkpImpl;
	}

	public int dlstatus_id;
	public String dl_status;
}