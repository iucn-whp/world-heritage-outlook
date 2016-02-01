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
import com.iucn.whp.dbservice.model.prot_mgmt_overall;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;
import com.iucn.whp.dbservice.service.base.prot_mgmt_overallLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the prot_mgmt_overall local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.prot_mgmt_overallLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.prot_mgmt_overallLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.prot_mgmt_overallLocalServiceUtil
 */
public class prot_mgmt_overallLocalServiceImpl
	extends prot_mgmt_overallLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.prot_mgmt_overallLocalServiceUtil} to access the prot_mgmt_overall local service.
	 */


	public List<prot_mgmt_overall> getprotmgmtoverallByVersion(long versionId)
	throws PortalException, SystemException {
		
		return prot_mgmt_overallPersistence.findByAssessmentVerId(versionId);
		
		
		}
	
	
	
}
