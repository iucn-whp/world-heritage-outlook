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

import com.iucn.whp.dbservice.model.sites_thematic;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing sites_thematic in entity cache.
 *
 * @author alok.sen
 * @see sites_thematic
 * @generated
 */
public class sites_thematicCacheModel implements CacheModel<sites_thematic>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{sitethematicid=");
		sb.append(sitethematicid);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", thematicid=");
		sb.append(thematicid);
		sb.append("}");

		return sb.toString();
	}

	public sites_thematic toEntityModel() {
		sites_thematicImpl sites_thematicImpl = new sites_thematicImpl();

		sites_thematicImpl.setSitethematicid(sitethematicid);
		sites_thematicImpl.setSite_id(site_id);
		sites_thematicImpl.setThematicid(thematicid);

		sites_thematicImpl.resetOriginalValues();

		return sites_thematicImpl;
	}

	public long sitethematicid;
	public long site_id;
	public long thematicid;
}