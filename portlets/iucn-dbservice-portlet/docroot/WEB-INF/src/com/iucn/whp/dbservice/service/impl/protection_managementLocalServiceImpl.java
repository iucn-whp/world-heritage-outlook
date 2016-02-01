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

import com.iucn.whp.dbservice.model.protection_management;
import com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil;
import com.iucn.whp.dbservice.service.base.protection_managementLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.protection_managementUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the protection_management local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.protection_managementLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.protection_managementLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil
 */
public class protection_managementLocalServiceImpl
	extends protection_managementLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil} to access the protection_management local service.
	 */
	
	public List<protection_management> findByAssessementVersionId(long assessment_version_id) throws SystemException{
		
		List<protection_management> protection_managementList=null;
		return protection_managementList=protection_managementUtil.findByassessment_version_id(assessment_version_id);
		
	}
}