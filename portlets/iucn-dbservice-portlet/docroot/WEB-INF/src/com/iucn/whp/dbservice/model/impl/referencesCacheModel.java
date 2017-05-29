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

import com.iucn.whp.dbservice.model.references;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing references in entity cache.
 *
 * @author alok.sen
 * @see references
 * @generated
 */
public class referencesCacheModel implements CacheModel<references>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{reference_id=");
		sb.append(reference_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", rn=");
		sb.append(rn);
		sb.append(", references=");
		sb.append(references);
		sb.append("}");

		return sb.toString();
	}

	public references toEntityModel() {
		referencesImpl referencesImpl = new referencesImpl();

		referencesImpl.setReference_id(reference_id);
		referencesImpl.setAssessment_version_id(assessment_version_id);
		referencesImpl.setRn(rn);

		if (references == null) {
			referencesImpl.setReferences(StringPool.BLANK);
		}
		else {
			referencesImpl.setReferences(references);
		}

		referencesImpl.resetOriginalValues();

		return referencesImpl;
	}

	public long reference_id;
	public long assessment_version_id;
	public long rn;
	public String references;
}