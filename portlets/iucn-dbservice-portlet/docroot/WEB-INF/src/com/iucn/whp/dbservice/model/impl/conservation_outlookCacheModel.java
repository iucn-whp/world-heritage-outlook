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

import com.iucn.whp.dbservice.model.conservation_outlook;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing conservation_outlook in entity cache.
 *
 * @author alok.sen
 * @see conservation_outlook
 * @generated
 */
public class conservation_outlookCacheModel implements CacheModel<conservation_outlook>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{conservation_outlook_id=");
		sb.append(conservation_outlook_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", justification=");
		sb.append(justification);
		sb.append(", rating=");
		sb.append(rating);
		sb.append("}");

		return sb.toString();
	}

	public conservation_outlook toEntityModel() {
		conservation_outlookImpl conservation_outlookImpl = new conservation_outlookImpl();

		conservation_outlookImpl.setConservation_outlook_id(conservation_outlook_id);
		conservation_outlookImpl.setAssessment_version_id(assessment_version_id);

		if (justification == null) {
			conservation_outlookImpl.setJustification(StringPool.BLANK);
		}
		else {
			conservation_outlookImpl.setJustification(justification);
		}

		conservation_outlookImpl.setRating(rating);

		conservation_outlookImpl.resetOriginalValues();

		return conservation_outlookImpl;
	}

	public long conservation_outlook_id;
	public long assessment_version_id;
	public String justification;
	public long rating;
}