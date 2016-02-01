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

import com.iucn.whp.dbservice.model.boundary_modification_type_lkp;
import com.iucn.whp.dbservice.service.boundary_modification_type_lkpLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the boundary_modification_type_lkp service. Represents a row in the &quot;whp_boundary_modification_type_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link boundary_modification_type_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see boundary_modification_type_lkpImpl
 * @see com.iucn.whp.dbservice.model.boundary_modification_type_lkp
 * @generated
 */
public abstract class boundary_modification_type_lkpBaseImpl
	extends boundary_modification_type_lkpModelImpl
	implements boundary_modification_type_lkp {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a boundary_modification_type_lkp model instance should use the {@link boundary_modification_type_lkp} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			boundary_modification_type_lkpLocalServiceUtil.addboundary_modification_type_lkp(this);
		}
		else {
			boundary_modification_type_lkpLocalServiceUtil.updateboundary_modification_type_lkp(this);
		}
	}
}