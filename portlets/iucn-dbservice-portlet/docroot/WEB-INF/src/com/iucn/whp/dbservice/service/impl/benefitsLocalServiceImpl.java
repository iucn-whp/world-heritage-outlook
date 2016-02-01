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

import com.iucn.whp.dbservice.model.benefits;
import com.iucn.whp.dbservice.service.base.benefitsLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.benefitsUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;
/**
 * The implementation of the benefits local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.benefitsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.benefitsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.benefitsLocalServiceUtil
 */
public class benefitsLocalServiceImpl extends benefitsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.benefitsLocalServiceUtil} to access the benefits local service.
	 */
	
	public List<benefits> getbenefitByVersion(long versionId)
	throws PortalException, SystemException {
		
		return benefitsUtil.findByassessment_version_id(versionId);

	}
		

	
}