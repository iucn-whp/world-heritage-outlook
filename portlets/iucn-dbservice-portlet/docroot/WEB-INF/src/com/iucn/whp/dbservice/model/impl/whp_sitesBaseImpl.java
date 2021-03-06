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

import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the whp_sites service. Represents a row in the &quot;whp_whp_sites&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sitesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sitesImpl
 * @see com.iucn.whp.dbservice.model.whp_sites
 * @generated
 */
public abstract class whp_sitesBaseImpl extends whp_sitesModelImpl
	implements whp_sites {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites model instance should use the {@link whp_sites} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sitesLocalServiceUtil.addwhp_sites(this);
		}
		else {
			whp_sitesLocalServiceUtil.updatewhp_sites(this);
		}
	}
}