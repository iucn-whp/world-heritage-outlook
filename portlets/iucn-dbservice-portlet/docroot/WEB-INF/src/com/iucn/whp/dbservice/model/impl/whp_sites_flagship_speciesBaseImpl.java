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

import com.iucn.whp.dbservice.model.whp_sites_flagship_species;
import com.iucn.whp.dbservice.service.whp_sites_flagship_speciesLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the whp_sites_flagship_species service. Represents a row in the &quot;whp_whp_sites_flagship_species&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_flagship_speciesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_flagship_speciesImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_flagship_species
 * @generated
 */
public abstract class whp_sites_flagship_speciesBaseImpl
	extends whp_sites_flagship_speciesModelImpl
	implements whp_sites_flagship_species {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_flagship_species model instance should use the {@link whp_sites_flagship_species} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_flagship_speciesLocalServiceUtil.addwhp_sites_flagship_species(this);
		}
		else {
			whp_sites_flagship_speciesLocalServiceUtil.updatewhp_sites_flagship_species(this);
		}
	}
}