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
public class whp_sitesFinderUtil {
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> findByFilterSearch(
		java.lang.String title, java.lang.String content,
		java.lang.String author, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findByFilterSearch(title, content, author, begin, end);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites> findByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findByCustomQuery(query, begin, end);
	}

	public static whp_sitesFinder getFinder() {
		if (_finder == null) {
			_finder = (whp_sitesFinder)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sitesFinder.class.getName());

			ReferenceRegistry.registerReference(whp_sitesFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(whp_sitesFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(whp_sitesFinderUtil.class, "_finder");
	}

	private static whp_sitesFinder _finder;
}