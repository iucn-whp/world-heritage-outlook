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
import com.iucn.whp.dbservice.service.sites_thematicLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the sites_thematic service. Represents a row in the &quot;whp_sites_thematic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sites_thematicImpl}.
 * </p>
 *
 * @author alok.sen
 * @see sites_thematicImpl
 * @see com.iucn.whp.dbservice.model.sites_thematic
 * @generated
 */
public abstract class sites_thematicBaseImpl extends sites_thematicModelImpl
	implements sites_thematic {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sites_thematic model instance should use the {@link sites_thematic} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			sites_thematicLocalServiceUtil.addsites_thematic(this);
		}
		else {
			sites_thematicLocalServiceUtil.updatesites_thematic(this);
		}
	}
}