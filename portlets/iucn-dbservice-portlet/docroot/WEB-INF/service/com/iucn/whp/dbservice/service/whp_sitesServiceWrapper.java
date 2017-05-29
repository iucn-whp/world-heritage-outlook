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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link whp_sitesService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sitesService
 * @generated
 */
public class whp_sitesServiceWrapper implements whp_sitesService,
	ServiceWrapper<whp_sitesService> {
	public whp_sitesServiceWrapper(whp_sitesService whp_sitesService) {
		_whp_sitesService = whp_sitesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sitesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sitesService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sitesService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sitesService getWrappedwhp_sitesService() {
		return _whp_sitesService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sitesService(whp_sitesService whp_sitesService) {
		_whp_sitesService = whp_sitesService;
	}

	public whp_sitesService getWrappedService() {
		return _whp_sitesService;
	}

	public void setWrappedService(whp_sitesService whp_sitesService) {
		_whp_sitesService = whp_sitesService;
	}

	private whp_sitesService _whp_sitesService;
}