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

import com.iucn.whp.dbservice.model.benefits_type_ref;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing benefits_type_ref in entity cache.
 *
 * @author alok.sen
 * @see benefits_type_ref
 * @generated
 */
public class benefits_type_refCacheModel implements CacheModel<benefits_type_ref>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{benefits_type_ref_id=");
		sb.append(benefits_type_ref_id);
		sb.append(", benefits_id=");
		sb.append(benefits_id);
		sb.append(", benefit_checktype=");
		sb.append(benefit_checktype);
		sb.append(", benefit_checksubtype=");
		sb.append(benefit_checksubtype);
		sb.append("}");

		return sb.toString();
	}

	public benefits_type_ref toEntityModel() {
		benefits_type_refImpl benefits_type_refImpl = new benefits_type_refImpl();

		benefits_type_refImpl.setBenefits_type_ref_id(benefits_type_ref_id);
		benefits_type_refImpl.setBenefits_id(benefits_id);
		benefits_type_refImpl.setBenefit_checktype(benefit_checktype);
		benefits_type_refImpl.setBenefit_checksubtype(benefit_checksubtype);

		benefits_type_refImpl.resetOriginalValues();

		return benefits_type_refImpl;
	}

	public long benefits_type_ref_id;
	public long benefits_id;
	public long benefit_checktype;
	public long benefit_checksubtype;
}