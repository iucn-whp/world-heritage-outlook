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

import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.service.base.site_assessment_versionsLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.site_assessment_versionsUtil;
import com.iucn.whp.dbservice.service.persistence.site_assessment_versionsFinderUtil;
import com.liferay.portal.SystemException;

/**
 * The implementation of the site_assessment_versions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.site_assessment_versionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.site_assessment_versionsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil
 */
public class site_assessment_versionsLocalServiceImpl
	extends site_assessment_versionsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil} to access the site_assessment_versions local service.
	 */
	
	public List<site_assessment_versions> findByUserId(long userId) {

		List<site_assessment_versions> site_assessment_versionsList = null;
		try {
			site_assessment_versionsList = site_assessment_versionsUtil
					.findByuserid(userId);

		} catch (Exception ex) {
			site_assessment_versionsList = null;
			ex.printStackTrace();
		}
		return site_assessment_versionsList;

	}

	public List<site_assessment_versions> findByAssessmentId(long assessmentId) {

		List<site_assessment_versions> site_assessment_versionsList = null;
		try {
			site_assessment_versionsList = site_assessment_versionsUtil
					.findByAssessmentId(assessmentId);

		} catch (Exception ex) {
			site_assessment_versionsList = null;
			ex.printStackTrace();
		}
		return site_assessment_versionsList;

	}
	
	public List<site_assessment_versions> findByPrevAssementCodeId(long assessmentId,Double versionCode) {

		List<site_assessment_versions> site_assessment_versionsList = null;
		try {
			site_assessment_versionsList = site_assessment_versionsUtil
					.findBypreviousVersionCode(assessmentId,versionCode);

		} catch (Exception ex) {
			site_assessment_versionsList = null;
			ex.printStackTrace();
		}
		return site_assessment_versionsList;

	}

	public List<site_assessment_versions> findSite_assessment_versionsByCustomQuery(
			String query, int begin, int end) throws SystemException {
		// / This stuff is basic set up
		return site_assessment_versionsFinderUtil.findSite_assessment_versionsByCustomQuery(query,begin,end);
	}
	
}