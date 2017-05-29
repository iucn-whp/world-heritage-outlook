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

package com.iucn.whp.dbservice.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author alok.sen
 */
public class docs_customDataFinderUtil {
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findByCustomQuery(query, begin, end);
	}

	public static docs_customDataFinder getFinder() {
		if (_finder == null) {
			_finder = (docs_customDataFinder)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					docs_customDataFinder.class.getName());

			ReferenceRegistry.registerReference(docs_customDataFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(docs_customDataFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(docs_customDataFinderUtil.class,
			"_finder");
	}

	private static docs_customDataFinder _finder;
}