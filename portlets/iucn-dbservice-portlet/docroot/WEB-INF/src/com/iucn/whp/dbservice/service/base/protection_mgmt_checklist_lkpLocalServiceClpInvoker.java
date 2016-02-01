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

import com.iucn.whp.dbservice.service.protection_mgmt_checklist_lkpLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class protection_mgmt_checklist_lkpLocalServiceClpInvoker {
	public protection_mgmt_checklist_lkpLocalServiceClpInvoker() {
		_methodName0 = "addprotection_mgmt_checklist_lkp";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp"
			};

		_methodName1 = "createprotection_mgmt_checklist_lkp";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteprotection_mgmt_checklist_lkp";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteprotection_mgmt_checklist_lkp";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp"
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

		_methodName9 = "fetchprotection_mgmt_checklist_lkp";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getprotection_mgmt_checklist_lkp";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getprotection_mgmt_checklist_lkps";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getprotection_mgmt_checklist_lkpsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateprotection_mgmt_checklist_lkp";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp"
			};

		_methodName15 = "updateprotection_mgmt_checklist_lkp";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp",
				"boolean"
			};

		_methodName418 = "getBeanIdentifier";

		_methodParameterTypes418 = new String[] {  };

		_methodName419 = "setBeanIdentifier";

		_methodParameterTypes419 = new String[] { "java.lang.String" };

		_methodName424 = "findAll";

		_methodParameterTypes424 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.addprotection_mgmt_checklist_lkp((com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.createprotection_mgmt_checklist_lkp(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.deleteprotection_mgmt_checklist_lkp(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.deleteprotection_mgmt_checklist_lkp((com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.fetchprotection_mgmt_checklist_lkp(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkp(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkps(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkpsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.updateprotection_mgmt_checklist_lkp((com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.updateprotection_mgmt_checklist_lkp((com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName418.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes418, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName419.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes419, parameterTypes)) {
			protection_mgmt_checklist_lkpLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName424.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes424, parameterTypes)) {
			return protection_mgmt_checklist_lkpLocalServiceUtil.findAll();
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
}