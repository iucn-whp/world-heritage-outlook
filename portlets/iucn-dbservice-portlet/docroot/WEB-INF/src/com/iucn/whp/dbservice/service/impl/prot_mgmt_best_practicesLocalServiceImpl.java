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
import com.iucn.whp.dbservice.model.prot_mgmt_best_practices;
import com.iucn.whp.dbservice.service.base.prot_mgmt_best_practicesLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.effective_prot_mgmt_iothreatsUtil;
import com.iucn.whp.dbservice.service.persistence.prot_mgmt_best_practicesUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the prot_mgmt_best_practices local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.prot_mgmt_best_practicesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil
 */
public class prot_mgmt_best_practicesLocalServiceImpl
	extends prot_mgmt_best_practicesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil} to access the prot_mgmt_best_practices local service.
	 */
	
	
	public List<prot_mgmt_best_practices> getBestpractEntriesByAssessmentId(long assessment_version_id) throws SystemException {
		
		return prot_mgmt_best_practicesUtil.findByassversionId(assessment_version_id);
		
	}
	
	
	
	
}