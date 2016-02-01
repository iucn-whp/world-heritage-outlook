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

import com.iucn.whp.dbservice.model.inscription_criteria_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing inscription_criteria_lkp in entity cache.
 *
 * @author alok.sen
 * @see inscription_criteria_lkp
 * @generated
 */
public class inscription_criteria_lkpCacheModel implements CacheModel<inscription_criteria_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{criteria_id=");
		sb.append(criteria_id);
		sb.append(", criteria=");
		sb.append(criteria);
		sb.append(", criteria_type=");
		sb.append(criteria_type);
		sb.append(", criteria_desc=");
		sb.append(criteria_desc);
		sb.append(", criteria_title=");
		sb.append(criteria_title);
		sb.append("}");

		return sb.toString();
	}

	public inscription_criteria_lkp toEntityModel() {
		inscription_criteria_lkpImpl inscription_criteria_lkpImpl = new inscription_criteria_lkpImpl();

		inscription_criteria_lkpImpl.setCriteria_id(criteria_id);

		if (criteria == null) {
			inscription_criteria_lkpImpl.setCriteria(StringPool.BLANK);
		}
		else {
			inscription_criteria_lkpImpl.setCriteria(criteria);
		}

		if (criteria_type == null) {
			inscription_criteria_lkpImpl.setCriteria_type(StringPool.BLANK);
		}
		else {
			inscription_criteria_lkpImpl.setCriteria_type(criteria_type);
		}

		if (criteria_desc == null) {
			inscription_criteria_lkpImpl.setCriteria_desc(StringPool.BLANK);
		}
		else {
			inscription_criteria_lkpImpl.setCriteria_desc(criteria_desc);
		}

		if (criteria_title == null) {
			inscription_criteria_lkpImpl.setCriteria_title(StringPool.BLANK);
		}
		else {
			inscription_criteria_lkpImpl.setCriteria_title(criteria_title);
		}

		inscription_criteria_lkpImpl.resetOriginalValues();

		return inscription_criteria_lkpImpl;
	}

	public int criteria_id;
	public String criteria;
	public String criteria_type;
	public String criteria_desc;
	public String criteria_title;
}