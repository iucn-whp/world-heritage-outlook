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

import com.iucn.whp.dbservice.model.assessment_stages;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_stages in entity cache.
 *
 * @author alok.sen
 * @see assessment_stages
 * @generated
 */
public class assessment_stagesCacheModel implements CacheModel<assessment_stages>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{stageid=");
		sb.append(stageid);
		sb.append(", stage=");
		sb.append(stage);
		sb.append("}");

		return sb.toString();
	}

	public assessment_stages toEntityModel() {
		assessment_stagesImpl assessment_stagesImpl = new assessment_stagesImpl();

		assessment_stagesImpl.setStageid(stageid);

		if (stage == null) {
			assessment_stagesImpl.setStage(StringPool.BLANK);
		}
		else {
			assessment_stagesImpl.setStage(stage);
		}

		assessment_stagesImpl.resetOriginalValues();

		return assessment_stagesImpl;
	}

	public long stageid;
	public String stage;
}