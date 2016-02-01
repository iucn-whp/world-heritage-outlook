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

import com.iucn.whp.dbservice.model.assessment_status;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_status in entity cache.
 *
 * @author alok.sen
 * @see assessment_status
 * @generated
 */
public class assessment_statusCacheModel implements CacheModel<assessment_status>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{statusid=");
		sb.append(statusid);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	public assessment_status toEntityModel() {
		assessment_statusImpl assessment_statusImpl = new assessment_statusImpl();

		assessment_statusImpl.setStatusid(statusid);

		if (status == null) {
			assessment_statusImpl.setStatus(StringPool.BLANK);
		}
		else {
			assessment_statusImpl.setStatus(status);
		}

		assessment_statusImpl.resetOriginalValues();

		return assessment_statusImpl;
	}

	public long statusid;
	public String status;
}