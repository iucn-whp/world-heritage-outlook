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

import com.iucn.whp.dbservice.model.whp_sites_component;
import com.iucn.whp.dbservice.model.whp_sites_soc_reports;
import com.iucn.whp.dbservice.service.base.whp_sites_componentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the whp_sites_component local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_componentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_componentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_componentLocalServiceUtil
 */
public class whp_sites_componentLocalServiceImpl
	extends whp_sites_componentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_componentLocalServiceUtil} to access the whp_sites_component local service.
	 */
	
/*********************************By SiteId*********************************/
	
	public List<whp_sites_component> getWhpSiteComponentBySiteId(long siteId)
	throws PortalException, SystemException {
	return whp_sites_componentPersistence.findBySiteid(siteId);
	}
}