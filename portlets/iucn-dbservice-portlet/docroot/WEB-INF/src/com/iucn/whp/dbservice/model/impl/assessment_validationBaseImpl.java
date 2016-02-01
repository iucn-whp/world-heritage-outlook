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

import com.iucn.whp.dbservice.model.assessment_validation;
import com.iucn.whp.dbservice.service.assessment_validationLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the assessment_validation service. Represents a row in the &quot;whp_assessment_validation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link assessment_validationImpl}.
 * </p>
 *
 * @author alok.sen
 * @see assessment_validationImpl
 * @see com.iucn.whp.dbservice.model.assessment_validation
 * @generated
 */
public abstract class assessment_validationBaseImpl
	extends assessment_validationModelImpl implements assessment_validation {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assessment_validation model instance should use the {@link assessment_validation} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_validationLocalServiceUtil.addassessment_validation(this);
		}
		else {
			assessment_validationLocalServiceUtil.updateassessment_validation(this);
		}
	}
}