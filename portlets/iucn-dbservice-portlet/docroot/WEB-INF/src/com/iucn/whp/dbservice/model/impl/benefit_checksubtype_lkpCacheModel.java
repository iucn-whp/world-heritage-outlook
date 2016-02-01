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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing benefit_checksubtype_lkp in entity cache.
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkp
 * @generated
 */
public class benefit_checksubtype_lkpCacheModel implements CacheModel<benefit_checksubtype_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{subbenefit_id=");
		sb.append(subbenefit_id);
		sb.append(", benefit_checksubtype=");
		sb.append(benefit_checksubtype);
		sb.append(", parent_id=");
		sb.append(parent_id);
		sb.append("}");

		return sb.toString();
	}

	public benefit_checksubtype_lkp toEntityModel() {
		benefit_checksubtype_lkpImpl benefit_checksubtype_lkpImpl = new benefit_checksubtype_lkpImpl();

		benefit_checksubtype_lkpImpl.setSubbenefit_id(subbenefit_id);

		if (benefit_checksubtype == null) {
			benefit_checksubtype_lkpImpl.setBenefit_checksubtype(StringPool.BLANK);
		}
		else {
			benefit_checksubtype_lkpImpl.setBenefit_checksubtype(benefit_checksubtype);
		}

		benefit_checksubtype_lkpImpl.setParent_id(parent_id);

		benefit_checksubtype_lkpImpl.resetOriginalValues();

		return benefit_checksubtype_lkpImpl;
	}

	public long subbenefit_id;
	public String benefit_checksubtype;
	public long parent_id;
}