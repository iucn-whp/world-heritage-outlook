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

import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.service.base.state_trend_biodivvalsLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the state_trend_biodivvals local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.state_trend_biodivvalsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil
 */
public class state_trend_biodivvalsLocalServiceImpl
	extends state_trend_biodivvalsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil} to access the state_trend_biodivvals local service.
	 */
	
	public List<state_trend_biodivvals> getEntriesFromAssessment_versionId(long assessment_version_id) throws SystemException{
		
		return state_trend_biodivvalsUtil.findByassessment_version_id(assessment_version_id);
	}
	
	
}