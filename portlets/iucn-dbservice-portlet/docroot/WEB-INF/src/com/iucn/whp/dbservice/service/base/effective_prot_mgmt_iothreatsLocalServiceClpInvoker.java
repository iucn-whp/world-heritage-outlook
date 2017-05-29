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

import com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class effective_prot_mgmt_iothreatsLocalServiceClpInvoker {
	public effective_prot_mgmt_iothreatsLocalServiceClpInvoker() {
		_methodName0 = "addeffective_prot_mgmt_iothreats";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"
			};

		_methodName1 = "createeffective_prot_mgmt_iothreats";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteeffective_prot_mgmt_iothreats";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteeffective_prot_mgmt_iothreats";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"
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

		_methodName9 = "fetcheffective_prot_mgmt_iothreats";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "geteffective_prot_mgmt_iothreats";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "geteffective_prot_mgmt_iothreatses";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "geteffective_prot_mgmt_iothreatsesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateeffective_prot_mgmt_iothreats";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"
			};

		_methodName15 = "updateeffective_prot_mgmt_iothreats";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats",
				"boolean"
			};

		_methodName426 = "getBeanIdentifier";

		_methodParameterTypes426 = new String[] {  };

		_methodName427 = "setBeanIdentifier";

		_methodParameterTypes427 = new String[] { "java.lang.String" };

		_methodName432 = "geteffectivemanagthreatByVersion";

		_methodParameterTypes432 = new String[] { "long" };

		_methodName433 = "getprotectingmanagmentrating";

		_methodParameterTypes433 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.addeffective_prot_mgmt_iothreats((com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.createeffective_prot_mgmt_iothreats(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.deleteeffective_prot_mgmt_iothreats(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.deleteeffective_prot_mgmt_iothreats((com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.fetcheffective_prot_mgmt_iothreats(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.geteffective_prot_mgmt_iothreats(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.geteffective_prot_mgmt_iothreatses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.geteffective_prot_mgmt_iothreatsesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.updateeffective_prot_mgmt_iothreats((com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.updateeffective_prot_mgmt_iothreats((com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName426.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes426, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName427.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes427, parameterTypes)) {
			effective_prot_mgmt_iothreatsLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName432.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes432, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(((Long)arguments[0]).longValue());
		}

		if (_methodName433.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes433, parameterTypes)) {
			return effective_prot_mgmt_iothreatsLocalServiceUtil.getprotectingmanagmentrating();
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
}