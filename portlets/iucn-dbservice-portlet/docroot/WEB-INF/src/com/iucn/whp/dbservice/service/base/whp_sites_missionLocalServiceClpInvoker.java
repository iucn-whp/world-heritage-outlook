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

import com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class whp_sites_missionLocalServiceClpInvoker {
	public whp_sites_missionLocalServiceClpInvoker() {
		_methodName0 = "addwhp_sites_mission";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites_mission"
			};

		_methodName1 = "createwhp_sites_mission";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletewhp_sites_mission";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletewhp_sites_mission";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites_mission"
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

		_methodName9 = "fetchwhp_sites_mission";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getwhp_sites_mission";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getwhp_sites_missions";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getwhp_sites_missionsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatewhp_sites_mission";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites_mission"
			};

		_methodName15 = "updatewhp_sites_mission";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.whp_sites_mission", "boolean"
			};

		_methodName418 = "getBeanIdentifier";

		_methodParameterTypes418 = new String[] {  };

		_methodName419 = "setBeanIdentifier";

		_methodParameterTypes419 = new String[] { "java.lang.String" };

		_methodName424 = "addwhp_sites_mgmt_mission";

		_methodParameterTypes424 = new String[] {
				"long", "java.lang.String", "java.util.Date", "long", "int",
				"java.lang.String"
			};

		_methodName425 = "removewhp_sites_mission";

		_methodParameterTypes425 = new String[] { "long", "int" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.addwhp_sites_mission((com.iucn.whp.dbservice.model.whp_sites_mission)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.createwhp_sites_mission(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.deletewhp_sites_mission(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.deletewhp_sites_mission((com.iucn.whp.dbservice.model.whp_sites_mission)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.fetchwhp_sites_mission(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.getwhp_sites_mission(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.getwhp_sites_missions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.getwhp_sites_missionsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.updatewhp_sites_mission((com.iucn.whp.dbservice.model.whp_sites_mission)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.updatewhp_sites_mission((com.iucn.whp.dbservice.model.whp_sites_mission)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName418.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes418, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName419.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes419, parameterTypes)) {
			whp_sites_missionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName424.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes424, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.addwhp_sites_mgmt_mission(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue(),
				(java.lang.String)arguments[5]);
		}

		if (_methodName425.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes425, parameterTypes)) {
			return whp_sites_missionLocalServiceUtil.removewhp_sites_mission(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
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
}