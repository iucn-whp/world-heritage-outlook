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

import com.iucn.whp.dbservice.model.prot_mgmt_best_practices;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing prot_mgmt_best_practices in entity cache.
 *
 * @author alok.sen
 * @see prot_mgmt_best_practices
 * @generated
 */
public class prot_mgmt_best_practicesCacheModel implements CacheModel<prot_mgmt_best_practices>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{best_practice_id=");
		sb.append(best_practice_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public prot_mgmt_best_practices toEntityModel() {
		prot_mgmt_best_practicesImpl prot_mgmt_best_practicesImpl = new prot_mgmt_best_practicesImpl();

		prot_mgmt_best_practicesImpl.setBest_practice_id(best_practice_id);
		prot_mgmt_best_practicesImpl.setAssessment_version_id(assessment_version_id);

		if (description == null) {
			prot_mgmt_best_practicesImpl.setDescription(StringPool.BLANK);
		}
		else {
			prot_mgmt_best_practicesImpl.setDescription(description);
		}

		prot_mgmt_best_practicesImpl.resetOriginalValues();

		return prot_mgmt_best_practicesImpl;
	}

	public long best_practice_id;
	public long assessment_version_id;
	public String description;
}