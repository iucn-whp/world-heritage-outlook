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

package com.iucn.whp.dbservice.service.base;

import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class site_assessmentLocalServiceClpInvoker {
	public site_assessmentLocalServiceClpInvoker() {
		_methodName0 = "addsite_assessment";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.site_assessment"
			};

		_methodName1 = "createsite_assessment";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletesite_assessment";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletesite_assessment";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.site_assessment"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchsite_assessment";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getsite_assessment";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getsite_assessments";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getsite_assessmentsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatesite_assessment";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.site_assessment"
			};

		_methodName15 = "updatesite_assessment";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.site_assessment", "boolean"
			};

		_methodName418 = "getBeanIdentifier";

		_methodParameterTypes418 = new String[] {  };

		_methodName419 = "setBeanIdentifier";

		_methodParameterTypes419 = new String[] { "java.lang.String" };

		_methodName424 = "getAllActiveSiteAssessment";

		_methodParameterTypes424 = new String[] {  };

		_methodName425 = "getAllStates";

		_methodParameterTypes425 = new String[] {  };

		_methodName426 = "getAllTrends";

		_methodParameterTypes426 = new String[] {  };

		_methodName427 = "getBiodiversityValuesByVersion";

		_methodParameterTypes427 = new String[] { "long" };

		_methodName428 = "getCurrent_state_trendByVersion";

		_methodParameterTypes428 = new String[] { "long" };

		_methodName429 = "getAllThreatCategories";

		_methodParameterTypes429 = new String[] {  };

		_methodName430 = "getAllThreatRating";

		_methodParameterTypes430 = new String[] {  };

		_methodName431 = "getAllThreatSubCategories";

		_methodParameterTypes431 = new String[] {  };

		_methodName432 = "getAssessment_whvaluesByVersion";

		_methodParameterTypes432 = new String[] { "long" };

		_methodName433 = "getStatetrendbiodivvalsByVersion";

		_methodParameterTypes433 = new String[] { "long" };

		_methodName434 = "getState_trend_whvaluesByVersion";

		_methodParameterTypes434 = new String[] { "long" };

		_methodName435 = "getAssessingThreatsCurrentByVersion";

		_methodParameterTypes435 = new String[] { "long" };

		_methodName436 = "getAssessingThreatsPotentialByVersion";

		_methodParameterTypes436 = new String[] { "long" };

		_methodName437 = "getThreatSummaryCurrentByVersion";

		_methodParameterTypes437 = new String[] { "long" };

		_methodName438 = "getThreatSummaryOverallByVersion";

		_methodParameterTypes438 = new String[] { "long" };

		_methodName439 = "getThreatSummaryPotentialByVersion";

		_methodParameterTypes439 = new String[] { "long" };

		_methodName440 = "getCurrentThreatAssessmentCatByThreatId";

		_methodParameterTypes440 = new String[] { "long" };

		_methodName441 = "getPotentialThreatAssessmentCatByThreatId";

		_methodParameterTypes441 = new String[] { "long" };

		_methodName442 = "getPotentialThreatValuesByThreatId";

		_methodParameterTypes442 = new String[] { "long" };

		_methodName443 = "getCurrentlThreatValuesByThreatId";

		_methodParameterTypes443 = new String[] { "long" };

		_methodName444 = "getActiveAssessmentBySiteId";

		_methodParameterTypes444 = new String[] { "long" };

		_methodName445 = "getActiveAssessmentByUserId";

		_methodParameterTypes445 = new String[] { "long" };

		_methodName446 = "getPublishedSiteAssessmentEntry";

		_methodParameterTypes446 = new String[] { "long" };

		_methodName447 = "getAllActiveSiteAssessment";

		_methodParameterTypes447 = new String[] { "java.lang.String", "int", "int" };

		_methodName448 = "siteAssessmentByFlag";

		_methodParameterTypes448 = new String[] { "boolean", "boolean" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return site_assessmentLocalServiceUtil.addsite_assessment((com.iucn.whp.dbservice.model.site_assessment)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return site_assessmentLocalServiceUtil.createsite_assessment(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return site_assessmentLocalServiceUtil.deletesite_assessment(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return site_assessmentLocalServiceUtil.deletesite_assessment((com.iucn.whp.dbservice.model.site_assessment)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return site_assessmentLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return site_assessmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return site_assessmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return site_assessmentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return site_assessmentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return site_assessmentLocalServiceUtil.fetchsite_assessment(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getsite_assessment(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getsite_assessments(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getsite_assessmentsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return site_assessmentLocalServiceUtil.updatesite_assessment((com.iucn.whp.dbservice.model.site_assessment)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return site_assessmentLocalServiceUtil.updatesite_assessment((com.iucn.whp.dbservice.model.site_assessment)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName418.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes418, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName419.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes419, parameterTypes)) {
			site_assessmentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName424.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes424, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllActiveSiteAssessment();
		}

		if (_methodName425.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes425, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllStates();
		}

		if (_methodName426.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes426, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllTrends();
		}

		if (_methodName427.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes427, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName428.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes428, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName429.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes429, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatCategories();
		}

		if (_methodName430.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes430, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatRating();
		}

		if (_methodName431.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes431, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatSubCategories();
		}

		if (_methodName432.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes432, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName433.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes433, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName434.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes434, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName435.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes435, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName436.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes436, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName437.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes437, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName438.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes438, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName439.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes439, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName440.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes440, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName441.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes441, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName442.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes442, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName443.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes443, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName444.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes444, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName445.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes445, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getActiveAssessmentByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName446.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes446, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPublishedSiteAssessmentEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName447.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes447, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllActiveSiteAssessment((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName448.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes448, parameterTypes)) {
			return site_assessmentLocalServiceUtil.siteAssessmentByFlag(((Boolean)arguments[0]).booleanValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName418;
	private String[] _methodParameterTypes418;
	private String _methodName419;
	private String[] _methodParameterTypes419;
	private String _methodName424;
	private String[] _methodParameterTypes424;
	private String _methodName425;
	private String[] _methodParameterTypes425;
	private String _methodName426;
	private String[] _methodParameterTypes426;
	private String _methodName427;
	private String[] _methodParameterTypes427;
	private String _methodName428;
	private String[] _methodParameterTypes428;
	private String _methodName429;
	private String[] _methodParameterTypes429;
	private String _methodName430;
	private String[] _methodParameterTypes430;
	private String _methodName431;
	private String[] _methodParameterTypes431;
	private String _methodName432;
	private String[] _methodParameterTypes432;
	private String _methodName433;
	private String[] _methodParameterTypes433;
	private String _methodName434;
	private String[] _methodParameterTypes434;
	private String _methodName435;
	private String[] _methodParameterTypes435;
	private String _methodName436;
	private String[] _methodParameterTypes436;
	private String _methodName437;
	private String[] _methodParameterTypes437;
	private String _methodName438;
	private String[] _methodParameterTypes438;
	private String _methodName439;
	private String[] _methodParameterTypes439;
	private String _methodName440;
	private String[] _methodParameterTypes440;
	private String _methodName441;
	private String[] _methodParameterTypes441;
	private String _methodName442;
	private String[] _methodParameterTypes442;
	private String _methodName443;
	private String[] _methodParameterTypes443;
	private String _methodName444;
	private String[] _methodParameterTypes444;
	private String _methodName445;
	private String[] _methodParameterTypes445;
	private String _methodName446;
	private String[] _methodParameterTypes446;
	private String _methodName447;
	private String[] _methodParameterTypes447;
	private String _methodName448;
	private String[] _methodParameterTypes448;
}