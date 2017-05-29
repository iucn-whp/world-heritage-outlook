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

import com.iucn.whp.dbservice.model.benefits_summary;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing benefits_summary in entity cache.
 *
 * @author alok.sen
 * @see benefits_summary
 * @generated
 */
public class benefits_summaryCacheModel implements CacheModel<benefits_summary>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{benefits_summary_id=");
		sb.append(benefits_summary_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", summary=");
		sb.append(summary);
		sb.append("}");

		return sb.toString();
	}

	public benefits_summary toEntityModel() {
		benefits_summaryImpl benefits_summaryImpl = new benefits_summaryImpl();

		benefits_summaryImpl.setBenefits_summary_id(benefits_summary_id);
		benefits_summaryImpl.setAssessment_version_id(assessment_version_id);

		if (summary == null) {
			benefits_summaryImpl.setSummary(StringPool.BLANK);
		}
		else {
			benefits_summaryImpl.setSummary(summary);
		}

		benefits_summaryImpl.resetOriginalValues();

		return benefits_summaryImpl;
	}

	public long benefits_summary_id;
	public long assessment_version_id;
	public String summary;
}