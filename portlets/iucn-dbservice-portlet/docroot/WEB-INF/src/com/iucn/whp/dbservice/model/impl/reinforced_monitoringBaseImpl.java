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

import com.iucn.whp.dbservice.model.reinforced_monitoring;
import com.iucn.whp.dbservice.service.reinforced_monitoringLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the reinforced_monitoring service. Represents a row in the &quot;whp_reinforced_monitoring&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link reinforced_monitoringImpl}.
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringImpl
 * @see com.iucn.whp.dbservice.model.reinforced_monitoring
 * @generated
 */
public abstract class reinforced_monitoringBaseImpl
	extends reinforced_monitoringModelImpl implements reinforced_monitoring {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a reinforced_monitoring model instance should use the {@link reinforced_monitoring} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			reinforced_monitoringLocalServiceUtil.addreinforced_monitoring(this);
		}
		else {
			reinforced_monitoringLocalServiceUtil.updatereinforced_monitoring(this);
		}
	}
}