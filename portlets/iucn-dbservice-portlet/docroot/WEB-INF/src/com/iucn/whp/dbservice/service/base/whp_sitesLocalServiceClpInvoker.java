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

import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class whp_sitesLocalServiceClpInvoker {
	public whp_sitesLocalServiceClpInvoker() {
		_methodName0 = "addwhp_sites";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites"
			};

		_methodName1 = "createwhp_sites";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletewhp_sites";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletewhp_sites";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites"
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

		_methodName9 = "fetchwhp_sites";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getwhp_sites";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getwhp_siteses";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getwhp_sitesesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatewhp_sites";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites"
			};

		_methodName15 = "updatewhp_sites";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites", "boolean"
			};

		_methodName432 = "getBeanIdentifier";

		_methodParameterTypes432 = new String[] {  };

		_methodName433 = "setBeanIdentifier";

		_methodParameterTypes433 = new String[] { "java.lang.String" };

		_methodName438 = "getSiteBySiteId";

		_methodParameterTypes438 = new String[] { "long" };

		_methodName439 = "getSiteByNameEn";

		_methodParameterTypes439 = new String[] { "java.lang.String" };

		_methodName440 = "getSiteByWdpaId";

		_methodParameterTypes440 = new String[] { "long" };

		_methodName441 = "getSiteCountryBySiteId";

		_methodParameterTypes441 = new String[] { "long" };

		_methodName442 = "getCountryListBySiteId";

		_methodParameterTypes442 = new String[] { "long" };

		_methodName443 = "getWhpSitesInscriptionCriteriaBySiteId";

		_methodParameterTypes443 = new String[] { "long" };

		_methodName444 = "getWhpSitesInscriptionHistoryBySiteId";

		_methodParameterTypes444 = new String[] { "long" };

		_methodName445 = "getInscriptionBySiteId";

		_methodParameterTypes445 = new String[] { "long" };

		_methodName446 = "getwhpSitesComponentBySiteId";

		_methodParameterTypes446 = new String[] { "long" };

		_methodName447 = "getwhpSitesVisitorsBySiteId";

		_methodParameterTypes447 = new String[] { "long" };

		_methodName448 = "getwhpSitesBudgetBySiteId";

		_methodParameterTypes448 = new String[] { "long" };

		_methodName449 = "getwhpSitesSoouvBySiteId";

		_methodParameterTypes449 = new String[] { "long" };

		_methodName450 = "getwhpSitesDsocrBySiteId";

		_methodParameterTypes450 = new String[] { "long" };

		_methodName451 = "getwhpSitesIndigenousCommunitiesBySiteId1";

		_methodParameterTypes451 = new String[] { "long" };

		_methodName452 = "getContactCategoryByCategoryId";

		_methodParameterTypes452 = new String[] { "int" };

		_methodName453 = "getwhpSitesContactBySiteId";

		_methodParameterTypes453 = new String[] { "long" };

		_methodName454 = "getWhpContactListBySiteId";

		_methodParameterTypes454 = new String[] { "long" };

		_methodName455 = "getIucnRegionCountry";

		_methodParameterTypes455 = new String[] { "int" };

		_methodName456 = "getIucnRegionBySiteId";

		_methodParameterTypes456 = new String[] { "long" };

		_methodName457 = "updateMGMT_PLANflag";

		_methodParameterTypes457 = new String[] { "long", "boolean" };

		_methodName458 = "updatemissionflag";

		_methodParameterTypes458 = new String[] { "long", "boolean" };

		_methodName459 = "updatesocflag";

		_methodParameterTypes459 = new String[] { "long", "boolean" };

		_methodName460 = "updatemeeflag";

		_methodParameterTypes460 = new String[] { "long", "boolean" };

		_methodName461 = "getUnescoRegionCountry";

		_methodParameterTypes461 = new String[] { "int" };

		_methodName462 = "getUnescoRegionBySiteId";

		_methodParameterTypes462 = new String[] { "long" };

		_methodName463 = "getAllActiveSites";

		_methodParameterTypes463 = new String[] {  };

		_methodName464 = "getAllActiveSitesByUserId";

		_methodParameterTypes464 = new String[] { "long" };

		_methodName465 = "getWhpSiteDangerListBySiteId";

		_methodParameterTypes465 = new String[] { "long" };

		_methodName466 = "getWhpSiterecommendationListBySiteId";

		_methodParameterTypes466 = new String[] { "long" };

		_methodName467 = "getWhpSiteBoundaryModificationBySiteId";

		_methodParameterTypes467 = new String[] { "long" };

		_methodName468 = "getWhpSiteFlagshipSpeciesBySiteId";

		_methodParameterTypes468 = new String[] { "long" };

		_methodName469 = "getWhpSiteIUCNPACategoryBySiteId";

		_methodParameterTypes469 = new String[] { "long" };

		_methodName470 = "getWhpSiteOtherDesignationsBySiteId";

		_methodParameterTypes470 = new String[] { "long" };

		_methodName471 = "getWhpSiteMgmtPlanStatesBySiteId";

		_methodParameterTypes471 = new String[] { "long" };

		_methodName472 = "getWhpSiteMissionBySiteId";

		_methodParameterTypes472 = new String[] { "long" };

		_methodName473 = "getWhpSiteMeeBySiteId";

		_methodParameterTypes473 = new String[] { "long" };

		_methodName474 = "getWhpSiteSocReportsBySiteId";

		_methodParameterTypes474 = new String[] { "long" };

		_methodName475 = "getDocs_SiteDataBySiteId";

		_methodParameterTypes475 = new String[] { "long" };

		_methodName476 = "updateThumbnail";

		_methodParameterTypes476 = new String[] { "long", "byte[][]" };

		_methodName477 = "deleteThumbnail";

		_methodParameterTypes477 = new String[] { "long" };

		_methodName478 = "getWhp_sitesByCustomQuery";

		_methodParameterTypes478 = new String[] { "java.lang.String", "int", "int" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return whp_sitesLocalServiceUtil.addwhp_sites((com.iucn.whp.dbservice.model.whp_sites)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return whp_sitesLocalServiceUtil.createwhp_sites(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return whp_sitesLocalServiceUtil.deletewhp_sites(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return whp_sitesLocalServiceUtil.deletewhp_sites((com.iucn.whp.dbservice.model.whp_sites)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return whp_sitesLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return whp_sitesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return whp_sitesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return whp_sitesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return whp_sitesLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return whp_sitesLocalServiceUtil.fetchwhp_sites(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhp_sites(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhp_siteses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhp_sitesesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updatewhp_sites((com.iucn.whp.dbservice.model.whp_sites)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updatewhp_sites((com.iucn.whp.dbservice.model.whp_sites)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName432.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes432, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName433.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes433, parameterTypes)) {
			whp_sitesLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName438.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes438, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getSiteBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName439.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes439, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getSiteByNameEn((java.lang.String)arguments[0]);
		}

		if (_methodName440.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes440, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getSiteByWdpaId(((Long)arguments[0]).longValue());
		}

		if (_methodName441.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes441, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getSiteCountryBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName442.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes442, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getCountryListBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName443.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes443, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSitesInscriptionCriteriaBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName444.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes444, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSitesInscriptionHistoryBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName445.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes445, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getInscriptionBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName446.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes446, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesComponentBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName447.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes447, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesVisitorsBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName448.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes448, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesBudgetBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName449.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes449, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesSoouvBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName450.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes450, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesDsocrBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName451.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes451, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesIndigenousCommunitiesBySiteId1(((Long)arguments[0]).longValue());
		}

		if (_methodName452.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes452, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getContactCategoryByCategoryId(((Integer)arguments[0]).intValue());
		}

		if (_methodName453.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes453, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getwhpSitesContactBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName454.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes454, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpContactListBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName455.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes455, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getIucnRegionCountry(((Integer)arguments[0]).intValue());
		}

		if (_methodName456.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes456, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getIucnRegionBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName457.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes457, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updateMGMT_PLANflag(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName458.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes458, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updatemissionflag(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName459.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes459, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updatesocflag(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName460.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes460, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updatemeeflag(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName461.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes461, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getUnescoRegionCountry(((Integer)arguments[0]).intValue());
		}

		if (_methodName462.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes462, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getUnescoRegionBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName463.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes463, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getAllActiveSites();
		}

		if (_methodName464.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes464, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getAllActiveSitesByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName465.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes465, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteDangerListBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName466.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes466, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiterecommendationListBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName467.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes467, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteBoundaryModificationBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName468.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes468, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteFlagshipSpeciesBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName469.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes469, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteIUCNPACategoryBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName470.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes470, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteOtherDesignationsBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName471.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes471, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteMgmtPlanStatesBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName472.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes472, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteMissionBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName473.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes473, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteMeeBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName474.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes474, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhpSiteSocReportsBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName475.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes475, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getDocs_SiteDataBySiteId(((Long)arguments[0]).longValue());
		}

		if (_methodName476.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes476, parameterTypes)) {
			return whp_sitesLocalServiceUtil.updateThumbnail(((Long)arguments[0]).longValue(),
				(byte[])arguments[1]);
		}

		if (_methodName477.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes477, parameterTypes)) {
			whp_sitesLocalServiceUtil.deleteThumbnail(((Long)arguments[0]).longValue());
		}

		if (_methodName478.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes478, parameterTypes)) {
			return whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
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
	private String _methodName432;
	private String[] _methodParameterTypes432;
	private String _methodName433;
	private String[] _methodParameterTypes433;
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
	private String _methodName457;
	private String[] _methodParameterTypes457;
	private String _methodName458;
	private String[] _methodParameterTypes458;
	private String _methodName459;
	private String[] _methodParameterTypes459;
	private String _methodName460;
	private String[] _methodParameterTypes460;
	private String _methodName461;
	private String[] _methodParameterTypes461;
	private String _methodName462;
	private String[] _methodParameterTypes462;
	private String _methodName463;
	private String[] _methodParameterTypes463;
	private String _methodName464;
	private String[] _methodParameterTypes464;
	private String _methodName465;
	private String[] _methodParameterTypes465;
	private String _methodName466;
	private String[] _methodParameterTypes466;
	private String _methodName467;
	private String[] _methodParameterTypes467;
	private String _methodName468;
	private String[] _methodParameterTypes468;
	private String _methodName469;
	private String[] _methodParameterTypes469;
	private String _methodName470;
	private String[] _methodParameterTypes470;
	private String _methodName471;
	private String[] _methodParameterTypes471;
	private String _methodName472;
	private String[] _methodParameterTypes472;
	private String _methodName473;
	private String[] _methodParameterTypes473;
	private String _methodName474;
	private String[] _methodParameterTypes474;
	private String _methodName475;
	private String[] _methodParameterTypes475;
	private String _methodName476;
	private String[] _methodParameterTypes476;
	private String _methodName477;
	private String[] _methodParameterTypes477;
	private String _methodName478;
	private String[] _methodParameterTypes478;
}