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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;
import com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the benefit_checksubtype_lkp service. Represents a row in the &quot;whp_benefit_checksubtype_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link benefit_checksubtype_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkpImpl
 * @see com.iucn.whp.dbservice.model.benefit_checksubtype_lkp
 * @generated
 */
public abstract class benefit_checksubtype_lkpBaseImpl
	extends benefit_checksubtype_lkpModelImpl
	implements benefit_checksubtype_lkp {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a benefit_checksubtype_lkp model instance should use the {@link benefit_checksubtype_lkp} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			benefit_checksubtype_lkpLocalServiceUtil.addbenefit_checksubtype_lkp(this);
		}
		else {
			benefit_checksubtype_lkpLocalServiceUtil.updatebenefit_checksubtype_lkp(this);
		}
	}
}