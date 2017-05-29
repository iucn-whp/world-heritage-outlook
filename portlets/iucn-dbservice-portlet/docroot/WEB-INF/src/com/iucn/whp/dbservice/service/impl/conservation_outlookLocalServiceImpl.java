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

import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.key_conservation_issues;
import com.iucn.whp.dbservice.model.key_conservation_scale_lkp;
import com.iucn.whp.dbservice.service.base.conservation_outlookLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.conservation_outlookUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the conservation_outlook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.conservation_outlookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.conservation_outlookLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil
 */
public class conservation_outlookLocalServiceImpl
	extends conservation_outlookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil} to access the conservation_outlook local service.
	 */
	
	
	public List<conservation_outlook> getconservationOutllokByVersion(long versionId)
	throws PortalException, SystemException {
		
		return conservation_outlookPersistence.findByassessment_version_id(versionId);
	
	}
	
	
	public List<conservation_outlook_rating_lkp> getconservationoutlookrating()
	throws PortalException, SystemException {
		
		return conservation_outlook_rating_lkpPersistence.findAll();
	
	}
	
	public List<conservation_outlook> getAllConservationOutlook() throws SystemException{
		
		return conservation_outlookUtil.findAll();
		
	}
	
	
	
	
}