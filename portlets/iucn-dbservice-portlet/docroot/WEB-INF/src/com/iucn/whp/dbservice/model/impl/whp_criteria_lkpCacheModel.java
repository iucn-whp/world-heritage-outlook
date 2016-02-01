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

import com.iucn.whp.dbservice.model.whp_criteria_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_criteria_lkp in entity cache.
 *
 * @author alok.sen
 * @see whp_criteria_lkp
 * @generated
 */
public class whp_criteria_lkpCacheModel implements CacheModel<whp_criteria_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", criterion=");
		sb.append(criterion);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public whp_criteria_lkp toEntityModel() {
		whp_criteria_lkpImpl whp_criteria_lkpImpl = new whp_criteria_lkpImpl();

		whp_criteria_lkpImpl.setId(id);

		if (criterion == null) {
			whp_criteria_lkpImpl.setCriterion(StringPool.BLANK);
		}
		else {
			whp_criteria_lkpImpl.setCriterion(criterion);
		}

		if (description == null) {
			whp_criteria_lkpImpl.setDescription(StringPool.BLANK);
		}
		else {
			whp_criteria_lkpImpl.setDescription(description);
		}

		whp_criteria_lkpImpl.resetOriginalValues();

		return whp_criteria_lkpImpl;
	}

	public long id;
	public String criterion;
	public String description;
}