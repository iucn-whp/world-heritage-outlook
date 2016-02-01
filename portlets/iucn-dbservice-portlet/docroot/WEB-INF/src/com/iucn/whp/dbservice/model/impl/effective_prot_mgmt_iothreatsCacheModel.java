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

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing effective_prot_mgmt_iothreats in entity cache.
 *
 * @author alok.sen
 * @see effective_prot_mgmt_iothreats
 * @generated
 */
public class effective_prot_mgmt_iothreatsCacheModel implements CacheModel<effective_prot_mgmt_iothreats>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", rating=");
		sb.append(rating);
		sb.append("}");

		return sb.toString();
	}

	public effective_prot_mgmt_iothreats toEntityModel() {
		effective_prot_mgmt_iothreatsImpl effective_prot_mgmt_iothreatsImpl = new effective_prot_mgmt_iothreatsImpl();

		effective_prot_mgmt_iothreatsImpl.setId(id);
		effective_prot_mgmt_iothreatsImpl.setAssessment_version_id(assessment_version_id);

		if (justification == null) {
			effective_prot_mgmt_iothreatsImpl.setJustification(StringPool.BLANK);
		}
		else {
			effective_prot_mgmt_iothreatsImpl.setJustification(justification);
		}

		effective_prot_mgmt_iothreatsImpl.setRating(rating);

		effective_prot_mgmt_iothreatsImpl.resetOriginalValues();

		return effective_prot_mgmt_iothreatsImpl;
	}

	public long id;
	public long assessment_version_id;
	public String justification;
	public long rating;
}