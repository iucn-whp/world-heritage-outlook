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

import com.iucn.whp.dbservice.model.key_conservation_scale_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing key_conservation_scale_lkp in entity cache.
 *
 * @author alok.sen
 * @see key_conservation_scale_lkp
 * @generated
 */
public class key_conservation_scale_lkpCacheModel implements CacheModel<key_conservation_scale_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{scale_id=");
		sb.append(scale_id);
		sb.append(", scale=");
		sb.append(scale);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public key_conservation_scale_lkp toEntityModel() {
		key_conservation_scale_lkpImpl key_conservation_scale_lkpImpl = new key_conservation_scale_lkpImpl();

		key_conservation_scale_lkpImpl.setScale_id(scale_id);

		if (scale == null) {
			key_conservation_scale_lkpImpl.setScale(StringPool.BLANK);
		}
		else {
			key_conservation_scale_lkpImpl.setScale(scale);
		}

		if (description == null) {
			key_conservation_scale_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			key_conservation_scale_lkpImpl.setDescription(description);
		}

		key_conservation_scale_lkpImpl.resetOriginalValues();

		return key_conservation_scale_lkpImpl;
	}

	public long scale_id;
	public String scale;
	public String description;
}