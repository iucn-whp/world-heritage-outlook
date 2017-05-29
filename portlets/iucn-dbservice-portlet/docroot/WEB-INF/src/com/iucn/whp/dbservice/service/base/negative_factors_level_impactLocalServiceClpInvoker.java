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

import com.iucn.whp.dbservice.service.negative_factors_level_impactLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class negative_factors_level_impactLocalServiceClpInvoker {
	public negative_factors_level_impactLocalServiceClpInvoker() {
		_methodName0 = "addnegative_factors_level_impact";

		_methodParameterTypes0 = new String[] {
				"com.iucn.whp.dbservice.model.negative_factors_level_impact"
			};

		_methodName1 = "createnegative_factors_level_impact";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletenegative_factors_level_impact";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletenegative_factors_level_impact";

		_methodParameterTypes3 = new String[] {
				"com.iucn.whp.dbservice.model.negative_factors_level_impact"
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

		_methodName9 = "fetchnegative_factors_level_impact";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getnegative_factors_level_impact";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getnegative_factors_level_impacts";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getnegative_factors_level_impactsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatenegative_factors_level_impact";

		_methodParameterTypes14 = new String[] {
				"com.iucn.whp.dbservice.model.negative_factors_level_impact"
			};

		_methodName15 = "updatenegative_factors_level_impact";

		_methodParameterTypes15 = new String[] {
				"com.iucn.whp.dbservice.model.negative_factors_level_impact",
				"boolean"
			};

		_methodName426 = "getBeanIdentifier";

		_methodParameterTypes426 = new String[] {  };

		_methodName427 = "setBeanIdentifier";

		_methodParameterTypes427 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.addnegative_factors_level_impact((com.iucn.whp.dbservice.model.negative_factors_level_impact)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.createnegative_factors_level_impact(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.deletenegative_factors_level_impact(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.deletenegative_factors_level_impact((com.iucn.whp.dbservice.model.negative_factors_level_impact)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.fetchnegative_factors_level_impact(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impact(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impacts(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impactsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.updatenegative_factors_level_impact((com.iucn.whp.dbservice.model.negative_factors_level_impact)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.updatenegative_factors_level_impact((com.iucn.whp.dbservice.model.negative_factors_level_impact)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName426.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes426, parameterTypes)) {
			return negative_factors_level_impactLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName427.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes427, parameterTypes)) {
			negative_factors_level_impactLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
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
}