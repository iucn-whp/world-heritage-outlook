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

import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the current_threat_assessment_cat service. Represents a row in the &quot;whp_current_threat_assessment_cat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link current_threat_assessment_catImpl}.
 * </p>
 *
 * @author alok.sen
 * @see current_threat_assessment_catImpl
 * @see com.iucn.whp.dbservice.model.current_threat_assessment_cat
 * @generated
 */
public abstract class current_threat_assessment_catBaseImpl
	extends current_threat_assessment_catModelImpl
	implements current_threat_assessment_cat {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a current_threat_assessment_cat model instance should use the {@link current_threat_assessment_cat} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			current_threat_assessment_catLocalServiceUtil.addcurrent_threat_assessment_cat(this);
		}
		else {
			current_threat_assessment_catLocalServiceUtil.updatecurrent_threat_assessment_cat(this);
		}
	}
}