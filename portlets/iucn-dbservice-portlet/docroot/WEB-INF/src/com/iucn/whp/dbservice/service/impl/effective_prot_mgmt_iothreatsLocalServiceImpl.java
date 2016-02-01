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

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;
import com.iucn.whp.dbservice.service.base.effective_prot_mgmt_iothreatsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the effective_prot_mgmt_iothreats local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.effective_prot_mgmt_iothreatsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil
 */
public class effective_prot_mgmt_iothreatsLocalServiceImpl
	extends effective_prot_mgmt_iothreatsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil} to access the effective_prot_mgmt_iothreats local service.
	 */
	public List<effective_prot_mgmt_iothreats> geteffectivemanagthreatByVersion(long versionId)
	throws PortalException, SystemException {
		
return effective_prot_mgmt_iothreatsPersistence.findByassversionId(versionId);
		
	}
	
	
	public List<protection_management_ratings_lkp> getprotectingmanagmentrating()
	throws PortalException, SystemException {
		
		return protection_management_ratings_lkpPersistence.findAll();
	
	}
	
	
	
	
}