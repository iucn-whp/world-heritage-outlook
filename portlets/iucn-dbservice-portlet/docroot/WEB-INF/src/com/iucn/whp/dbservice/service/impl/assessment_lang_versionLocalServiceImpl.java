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

import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.service.base.assessment_lang_versionLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.assessment_lang_versionUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the assessment_lang_version local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.assessment_lang_versionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.assessment_lang_versionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil
 */
public class assessment_lang_versionLocalServiceImpl
	extends assessment_lang_versionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil} to access the assessment_lang_version local service.
	 */
	
	public List<assessment_lang_version> findByAssessmentId(long assessmentId) throws SystemException {
		
		List<assessment_lang_version> listAssessment_lang_version=null;
		listAssessment_lang_version=assessment_lang_versionUtil.findByassessmentId(assessmentId);
		return listAssessment_lang_version;
		
	}
	
	public List<assessment_lang_version> findByAssessmentIdAndLangId(long assessmentId, long langid) throws SystemException {
		
		List<assessment_lang_version> listAssessment_lang_version=null;
		listAssessment_lang_version=assessment_lang_versionUtil.findByassessmentIdAndLangId(assessmentId, langid);
		return listAssessment_lang_version;
		
	}
	
	public List<assessment_lang_version> findByAssessmentIdByAssessmentVersionId(long assessmentVersionId) throws SystemException {
		
		List<assessment_lang_version> Assessment_lang_version=null;
		Assessment_lang_version=assessment_lang_versionUtil.findByassessmentVersionId(assessmentVersionId);
		return Assessment_lang_version;
	}
}