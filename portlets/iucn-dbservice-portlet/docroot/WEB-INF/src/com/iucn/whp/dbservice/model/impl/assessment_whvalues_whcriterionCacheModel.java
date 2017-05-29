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

import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_whvalues_whcriterion in entity cache.
 *
 * @author alok.sen
 * @see assessment_whvalues_whcriterion
 * @generated
 */
public class assessment_whvalues_whcriterionCacheModel implements CacheModel<assessment_whvalues_whcriterion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{wh_criteria_id=");
		sb.append(wh_criteria_id);
		sb.append(", whvalues_id=");
		sb.append(whvalues_id);
		sb.append(", criterion=");
		sb.append(criterion);
		sb.append("}");

		return sb.toString();
	}

	public assessment_whvalues_whcriterion toEntityModel() {
		assessment_whvalues_whcriterionImpl assessment_whvalues_whcriterionImpl = new assessment_whvalues_whcriterionImpl();

		assessment_whvalues_whcriterionImpl.setWh_criteria_id(wh_criteria_id);
		assessment_whvalues_whcriterionImpl.setWhvalues_id(whvalues_id);
		assessment_whvalues_whcriterionImpl.setCriterion(criterion);

		assessment_whvalues_whcriterionImpl.resetOriginalValues();

		return assessment_whvalues_whcriterionImpl;
	}

	public long wh_criteria_id;
	public long whvalues_id;
	public long criterion;
}