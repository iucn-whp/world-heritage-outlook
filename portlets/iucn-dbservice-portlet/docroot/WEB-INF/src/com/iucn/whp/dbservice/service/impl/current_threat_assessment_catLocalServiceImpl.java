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

import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.service.base.current_threat_assessment_catLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the current_threat_assessment_cat local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.current_threat_assessment_catLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.current_threat_assessment_catLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil
 */
public class current_threat_assessment_catLocalServiceImpl
	extends current_threat_assessment_catLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil} to access the current_threat_assessment_cat local service.
	 */
	
	/*-----------------------Get Current Threat Assessment Sub Categories------------------*/
	public List<current_threat_assessment_cat> getCurrentThreatAssessmentSubCategories(long curr_threat_id,long threat_cat_id)
	throws PortalException, SystemException {
	return current_threat_assessment_catPersistence.findBysub_cat_id(curr_threat_id,threat_cat_id);
	}
	
	
	public List<current_threat_assessment_cat> getEntriesByCurrent_threat_id(long current_threat_id) throws SystemException{
		
		return current_threat_assessment_catUtil.findBycurrent_threat_id(current_threat_id);
	}
	
}