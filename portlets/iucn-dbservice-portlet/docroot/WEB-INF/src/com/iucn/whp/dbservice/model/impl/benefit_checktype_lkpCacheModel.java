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

import com.iucn.whp.dbservice.model.benefit_checktype_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing benefit_checktype_lkp in entity cache.
 *
 * @author alok.sen
 * @see benefit_checktype_lkp
 * @generated
 */
public class benefit_checktype_lkpCacheModel implements CacheModel<benefit_checktype_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{benefit_id=");
		sb.append(benefit_id);
		sb.append(", benefit_checktype=");
		sb.append(benefit_checktype);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	public benefit_checktype_lkp toEntityModel() {
		benefit_checktype_lkpImpl benefit_checktype_lkpImpl = new benefit_checktype_lkpImpl();

		benefit_checktype_lkpImpl.setBenefit_id(benefit_id);

		if (benefit_checktype == null) {
			benefit_checktype_lkpImpl.setBenefit_checktype(StringPool.BLANK);
		}
		else {
			benefit_checktype_lkpImpl.setBenefit_checktype(benefit_checktype);
		}

		benefit_checktype_lkpImpl.setActive(active);

		benefit_checktype_lkpImpl.resetOriginalValues();

		return benefit_checktype_lkpImpl;
	}

	public long benefit_id;
	public String benefit_checktype;
	public boolean active;
}