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

import com.iucn.whp.dbservice.model.prot_mgmt_overall;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing prot_mgmt_overall in entity cache.
 *
 * @author alok.sen
 * @see prot_mgmt_overall
 * @generated
 */
public class prot_mgmt_overallCacheModel implements CacheModel<prot_mgmt_overall>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{pmo_id=");
		sb.append(pmo_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", rating=");
		sb.append(rating);
		sb.append("}");

		return sb.toString();
	}

	public prot_mgmt_overall toEntityModel() {
		prot_mgmt_overallImpl prot_mgmt_overallImpl = new prot_mgmt_overallImpl();

		prot_mgmt_overallImpl.setPmo_id(pmo_id);
		prot_mgmt_overallImpl.setAssessment_version_id(assessment_version_id);

		if (justification == null) {
			prot_mgmt_overallImpl.setJustification(StringPool.BLANK);
		}
		else {
			prot_mgmt_overallImpl.setJustification(justification);
		}

		prot_mgmt_overallImpl.setRating(rating);

		prot_mgmt_overallImpl.resetOriginalValues();

		return prot_mgmt_overallImpl;
	}

	public long pmo_id;
	public long assessment_version_id;
	public String justification;
	public long rating;
}