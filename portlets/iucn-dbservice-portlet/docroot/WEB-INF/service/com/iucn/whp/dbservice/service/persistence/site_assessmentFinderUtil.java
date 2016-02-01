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
public class site_assessmentFinderUtil {
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> findSite_assessmentByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findSite_assessmentByCustomQuery(query, begin, end);
	}

	public static site_assessmentFinder getFinder() {
		if (_finder == null) {
			_finder = (site_assessmentFinder)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					site_assessmentFinder.class.getName());

			ReferenceRegistry.registerReference(site_assessmentFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(site_assessmentFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(site_assessmentFinderUtil.class,
			"_finder");
	}

	private static site_assessmentFinder _finder;
}