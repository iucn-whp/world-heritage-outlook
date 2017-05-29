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

package com.iucn.whp.dbservice.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the whp_sites_iucn_recommendation remote service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_sites_iucn_recommendationServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_iucn_recommendationService
 * @see com.iucn.whp.dbservice.service.base.whp_sites_iucn_recommendationServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sites_iucn_recommendationServiceImpl
 * @generated
 */
public class whp_sites_iucn_recommendationServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sites_iucn_recommendationServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_sites_iucn_recommendationService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_sites_iucn_recommendationService.class.getName());

			if (invokableService instanceof whp_sites_iucn_recommendationService) {
				_service = (whp_sites_iucn_recommendationService)invokableService;
			}
			else {
				_service = new whp_sites_iucn_recommendationServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(whp_sites_iucn_recommendationServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_sites_iucn_recommendationService service) {
	}

	private static whp_sites_iucn_recommendationService _service;
}