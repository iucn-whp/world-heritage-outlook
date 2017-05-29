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

import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class whp_sites_iucn_recommendationServiceClpInvoker {
	public whp_sites_iucn_recommendationServiceClpInvoker() {
		_methodName410 = "getBeanIdentifier";

		_methodParameterTypes410 = new String[] {  };

		_methodName411 = "setBeanIdentifier";

		_methodParameterTypes411 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName410.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes410, parameterTypes)) {
			return whp_sites_iucn_recommendationServiceUtil.getBeanIdentifier();
		}

		if (_methodName411.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes411, parameterTypes)) {
			whp_sites_iucn_recommendationServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName410;
	private String[] _methodParameterTypes410;
	private String _methodName411;
	private String[] _methodParameterTypes411;
}