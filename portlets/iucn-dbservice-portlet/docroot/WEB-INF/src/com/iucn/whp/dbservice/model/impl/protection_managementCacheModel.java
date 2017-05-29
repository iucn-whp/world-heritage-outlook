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

import com.iucn.whp.dbservice.model.protection_management;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing protection_management in entity cache.
 *
 * @author alok.sen
 * @see protection_management
 * @generated
 */
public class protection_managementCacheModel implements CacheModel<protection_management>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{pm_id=");
		sb.append(pm_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", topic_id=");
		sb.append(topic_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", rating=");
		sb.append(rating);
		sb.append("}");

		return sb.toString();
	}

	public protection_management toEntityModel() {
		protection_managementImpl protection_managementImpl = new protection_managementImpl();

		protection_managementImpl.setPm_id(pm_id);
		protection_managementImpl.setAssessment_version_id(assessment_version_id);
		protection_managementImpl.setTopic_id(topic_id);

		if (justification == null) {
			protection_managementImpl.setJustification(StringPool.BLANK);
		}
		else {
			protection_managementImpl.setJustification(justification);
		}

		protection_managementImpl.setRating(rating);

		protection_managementImpl.resetOriginalValues();

		return protection_managementImpl;
	}

	public long pm_id;
	public long assessment_version_id;
	public long topic_id;
	public String justification;
	public long rating;
}