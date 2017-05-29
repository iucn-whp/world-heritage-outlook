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

import com.iucn.whp.dbservice.model.threat_summary_overall;
import com.iucn.whp.dbservice.service.base.threat_summary_overallLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.threat_summary_overallUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the threat_summary_overall local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.threat_summary_overallLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.threat_summary_overallLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.threat_summary_overallLocalServiceUtil
 */
public class threat_summary_overallLocalServiceImpl
	extends threat_summary_overallLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.threat_summary_overallLocalServiceUtil} to access the threat_summary_overall local service.
	 */
	
	
	public List<threat_summary_overall> getthreatoverallByAssessmentId(long assessment_version_id) throws SystemException {
		
		return threat_summary_overallUtil.findByassessment_version_id(assessment_version_id);
	}
	
}