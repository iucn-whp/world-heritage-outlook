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

import com.iucn.whp.dbservice.model.whp_sites_indigenous_communities;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing whp_sites_indigenous_communities in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_indigenous_communities
 * @generated
 */
public class whp_sites_indigenous_communitiesCacheModel implements CacheModel<whp_sites_indigenous_communities>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_indigenous_communities_id=");
		sb.append(whp_sites_indigenous_communities_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_indigenous_communities toEntityModel() {
		whp_sites_indigenous_communitiesImpl whp_sites_indigenous_communitiesImpl =
			new whp_sites_indigenous_communitiesImpl();

		whp_sites_indigenous_communitiesImpl.setWhp_sites_indigenous_communities_id(whp_sites_indigenous_communities_id);
		whp_sites_indigenous_communitiesImpl.setSite_id(site_id);

		if (description == null) {
			whp_sites_indigenous_communitiesImpl.setDescription(StringPool.BLANK);
		}
		else {
			whp_sites_indigenous_communitiesImpl.setDescription(description);
		}

		whp_sites_indigenous_communitiesImpl.resetOriginalValues();

		return whp_sites_indigenous_communitiesImpl;
	}

	public long whp_sites_indigenous_communities_id;
	public long site_id;
	public String description;
}