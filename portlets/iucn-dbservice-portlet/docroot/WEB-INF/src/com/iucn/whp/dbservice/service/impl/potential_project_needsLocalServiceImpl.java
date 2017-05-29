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

package com.iucn.whp.dbservice.service.impl;

import java.util.List;

import com.iucn.whp.dbservice.model.potential_project_needs;
import com.iucn.whp.dbservice.service.base.potential_project_needsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the potential_project_needs local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.potential_project_needsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.potential_project_needsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil
 */
public class potential_project_needsLocalServiceImpl
	extends potential_project_needsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil} to access the potential_project_needs local service.
	 */
	
	
	public List<potential_project_needs> getpotential_projectsByVersion(long versionId)
	throws PortalException, SystemException {
	return potential_project_needsPersistence.findByassessment_version_id(versionId);
	}

	
	
}