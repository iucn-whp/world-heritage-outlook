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

		_methodName426 = "getBeanIdentifier";

		_methodParameterTypes426 = new String[] {  };

		_methodName427 = "setBeanIdentifier";

		_methodParameterTypes427 = new String[] { "java.lang.String" };

		_methodName432 = "getAllActiveSiteAssessment";

		_methodParameterTypes432 = new String[] {  };

		_methodName433 = "getAllStates";

		_methodParameterTypes433 = new String[] {  };

		_methodName434 = "getAllTrends";

		_methodParameterTypes434 = new String[] {  };

		_methodName435 = "getBiodiversityValuesByVersion";

		_methodParameterTypes435 = new String[] { "long" };

		_methodName436 = "getCurrent_state_trendByVersion";

		_methodParameterTypes436 = new String[] { "long" };

		_methodName437 = "getAllThreatCategories";

		_methodParameterTypes437 = new String[] {  };

		_methodName438 = "getAllThreatRating";

		_methodParameterTypes438 = new String[] {  };

		_methodName439 = "getAllThreatSubCategories";

		_methodParameterTypes439 = new String[] {  };

		_methodName440 = "getAssessment_whvaluesByVersion";

		_methodParameterTypes440 = new String[] { "long" };

		_methodName441 = "getStatetrendbiodivvalsByVersion";

		_methodParameterTypes441 = new String[] { "long" };

		_methodName442 = "getState_trend_whvaluesByVersion";

		_methodParameterTypes442 = new String[] { "long" };

		_methodName443 = "getAssessingThreatsCurrentByVersion";

		_methodParameterTypes443 = new String[] { "long" };

		_methodName444 = "getAssessingThreatsPotentialByVersion";

		_methodParameterTypes444 = new String[] { "long" };

		_methodName445 = "getThreatSummaryCurrentByVersion";

		_methodParameterTypes445 = new String[] { "long" };

		_methodName446 = "getThreatSummaryOverallByVersion";

		_methodParameterTypes446 = new String[] { "long" };

		_methodName447 = "getThreatSummaryPotentialByVersion";

		_methodParameterTypes447 = new String[] { "long" };

		_methodName448 = "getCurrentThreatAssessmentCatByThreatId";

		_methodParameterTypes448 = new String[] { "long" };

		_methodName449 = "getPotentialThreatAssessmentCatByThreatId";

		_methodParameterTypes449 = new String[] { "long" };

		_methodName450 = "getPotentialThreatValuesByThreatId";

		_methodParameterTypes450 = new String[] { "long" };

		_methodName451 = "getCurrentlThreatValuesByThreatId";

		_methodParameterTypes451 = new String[] { "long" };

		_methodName452 = "getActiveAssessmentBySiteId";

		_methodParameterTypes452 = new String[] { "long" };

		_methodName453 = "getActiveAssessmentByUserId";

		_methodParameterTypes453 = new String[] { "long" };

		_methodName454 = "getPublishedSiteAssessmentEntry";

		_methodParameterTypes454 = new String[] { "long" };

		_methodName455 = "getAllActiveSiteAssessment";

		_methodParameterTypes455 = new String[] { "java.lang.String", "int", "int" };

		_methodName456 = "siteAssessmentByFlag";

		_methodParameterTypes456 = new String[] { "boolean", "boolean" };
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

		if (_methodName426.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes426, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName427.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes427, parameterTypes)) {
			site_assessmentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName432.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes432, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllActiveSiteAssessment();
		}

		if (_methodName433.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes433, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllStates();
		}

		if (_methodName434.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes434, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllTrends();
		}

		if (_methodName435.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes435, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName436.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes436, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName437.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes437, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatCategories();
		}

		if (_methodName438.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes438, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatRating();
		}

		if (_methodName439.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes439, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllThreatSubCategories();
		}

		if (_methodName440.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes440, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName441.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes441, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName442.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes442, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName443.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes443, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName444.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes444, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName445.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes445, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName446.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes446, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName447.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes447, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName448.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes448, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName449.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes449, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName450.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes450, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName451.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes451, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(((Long)arguments[0]).longValue());
		}

		if (_methodName452.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes452, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName453.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes453, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getActiveAssessmentByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName454.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes454, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getPublishedSiteAssessmentEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName455.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes455, parameterTypes)) {
			return site_assessmentLocalServiceUtil.getAllActiveSiteAssessment((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName456.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes456, parameterTypes)) {
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
	private String _methodName426;
	private String[] _methodParameterTypes426;
	private String _methodName427;
	private String[] _methodParameterTypes427;
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
	private String _methodName449;
	private String[] _methodParameterTypes449;
	private String _methodName450;
	private String[] _methodParameterTypes450;
	private String _methodName451;
	private String[] _methodParameterTypes451;
	private String _methodName452;
	private String[] _methodParameterTypes452;
	private String _methodName453;
	private String[] _methodParameterTypes453;
	private String _methodName454;
	private String[] _methodParameterTypes454;
	private String _methodName455;
	private String[] _methodParameterTypes455;
	private String _methodName456;
	private String[] _methodParameterTypes456;
}