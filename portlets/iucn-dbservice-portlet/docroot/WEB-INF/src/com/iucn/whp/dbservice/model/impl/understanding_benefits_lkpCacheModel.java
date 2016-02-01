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

import com.iucn.whp.dbservice.model.understanding_benefits_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing understanding_benefits_lkp in entity cache.
 *
 * @author alok.sen
 * @see understanding_benefits_lkp
 * @generated
 */
public class understanding_benefits_lkpCacheModel implements CacheModel<understanding_benefits_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{benefits_id=");
		sb.append(benefits_id);
		sb.append(", selected_benefit=");
		sb.append(selected_benefit);
		sb.append("}");

		return sb.toString();
	}

	public understanding_benefits_lkp toEntityModel() {
		understanding_benefits_lkpImpl understanding_benefits_lkpImpl = new understanding_benefits_lkpImpl();

		understanding_benefits_lkpImpl.setBenefits_id(benefits_id);

		if (selected_benefit == null) {
			understanding_benefits_lkpImpl.setSelected_benefit(StringPool.BLANK);
		}
		else {
			understanding_benefits_lkpImpl.setSelected_benefit(selected_benefit);
		}

		understanding_benefits_lkpImpl.resetOriginalValues();

		return understanding_benefits_lkpImpl;
	}

	public long benefits_id;
	public String selected_benefit;
}