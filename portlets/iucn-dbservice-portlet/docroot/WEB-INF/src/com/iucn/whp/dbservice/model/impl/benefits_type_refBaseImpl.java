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

import com.iucn.whp.dbservice.model.benefits_type_ref;
import com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the benefits_type_ref service. Represents a row in the &quot;whp_benefits_type_ref&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link benefits_type_refImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_refImpl
 * @see com.iucn.whp.dbservice.model.benefits_type_ref
 * @generated
 */
public abstract class benefits_type_refBaseImpl
	extends benefits_type_refModelImpl implements benefits_type_ref {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a benefits_type_ref model instance should use the {@link benefits_type_ref} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			benefits_type_refLocalServiceUtil.addbenefits_type_ref(this);
		}
		else {
			benefits_type_refLocalServiceUtil.updatebenefits_type_ref(this);
		}
	}
}