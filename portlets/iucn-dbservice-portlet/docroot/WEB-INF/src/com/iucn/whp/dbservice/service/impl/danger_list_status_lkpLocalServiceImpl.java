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

import com.iucn.whp.dbservice.model.danger_list_status_lkp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;
import com.iucn.whp.dbservice.service.base.danger_list_status_lkpLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the danger_list_status_lkp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.danger_list_status_lkpLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.danger_list_status_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.danger_list_status_lkpLocalServiceUtil
 */
public class danger_list_status_lkpLocalServiceImpl
	extends danger_list_status_lkpLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.danger_list_status_lkpLocalServiceUtil} to access the danger_list_status_lkp local service.
	 */
	
/*********************************GET All Danget list*********************************/
	
	public List<danger_list_status_lkp> getAllDangerListType()
	throws PortalException, SystemException {	
	return danger_list_status_lkpPersistence.findAll();
	}
	
}