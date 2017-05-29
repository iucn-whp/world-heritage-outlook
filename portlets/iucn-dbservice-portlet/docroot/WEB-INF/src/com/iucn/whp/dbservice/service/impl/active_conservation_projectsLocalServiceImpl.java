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

import com.iucn.whp.dbservice.model.active_conservation_projects;
import com.iucn.whp.dbservice.service.base.active_conservation_projectsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the active_conservation_projects local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.active_conservation_projectsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.active_conservation_projectsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil
 */
public class active_conservation_projectsLocalServiceImpl
	extends active_conservation_projectsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil} to access the active_conservation_projects local service.
	 */
	
	public List<active_conservation_projects> getactive_conservation_projectsByVersion(long versionId)
	throws PortalException, SystemException {
	return active_conservation_projectsPersistence.findByassessment_version_id(versionId);
	}
}