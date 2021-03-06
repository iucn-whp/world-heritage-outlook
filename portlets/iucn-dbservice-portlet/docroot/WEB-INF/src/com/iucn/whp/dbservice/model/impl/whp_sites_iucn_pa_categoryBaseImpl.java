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

import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category;
import com.iucn.whp.dbservice.service.whp_sites_iucn_pa_categoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the whp_sites_iucn_pa_category service. Represents a row in the &quot;whp_whp_sites_iucn_pa_category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_iucn_pa_categoryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_iucn_pa_categoryImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category
 * @generated
 */
public abstract class whp_sites_iucn_pa_categoryBaseImpl
	extends whp_sites_iucn_pa_categoryModelImpl
	implements whp_sites_iucn_pa_category {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_iucn_pa_category model instance should use the {@link whp_sites_iucn_pa_category} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_iucn_pa_categoryLocalServiceUtil.addwhp_sites_iucn_pa_category(this);
		}
		else {
			whp_sites_iucn_pa_categoryLocalServiceUtil.updatewhp_sites_iucn_pa_category(this);
		}
	}
}