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

import com.iucn.whp.dbservice.model.negative_factors_level_impact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing negative_factors_level_impact in entity cache.
 *
 * @author alok.sen
 * @see negative_factors_level_impact
 * @generated
 */
public class negative_factors_level_impactCacheModel implements CacheModel<negative_factors_level_impact>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{level_id=");
		sb.append(level_id);
		sb.append(", level_impact=");
		sb.append(level_impact);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public negative_factors_level_impact toEntityModel() {
		negative_factors_level_impactImpl negative_factors_level_impactImpl = new negative_factors_level_impactImpl();

		negative_factors_level_impactImpl.setLevel_id(level_id);

		if (level_impact == null) {
			negative_factors_level_impactImpl.setLevel_impact(StringPool.BLANK);
		}
		else {
			negative_factors_level_impactImpl.setLevel_impact(level_impact);
		}

		if (description == null) {
			negative_factors_level_impactImpl.setDescription(StringPool.BLANK);
		}
		else {
			negative_factors_level_impactImpl.setDescription(description);
		}

		negative_factors_level_impactImpl.resetOriginalValues();

		return negative_factors_level_impactImpl;
	}

	public long level_id;
	public String level_impact;
	public String description;
}