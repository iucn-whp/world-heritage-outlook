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
 * This class is a wrapper for {@link whp_sites_iucn_recommendationService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_iucn_recommendationService
 * @generated
 */
public class whp_sites_iucn_recommendationServiceWrapper
	implements whp_sites_iucn_recommendationService,
		ServiceWrapper<whp_sites_iucn_recommendationService> {
	public whp_sites_iucn_recommendationServiceWrapper(
		whp_sites_iucn_recommendationService whp_sites_iucn_recommendationService) {
		_whp_sites_iucn_recommendationService = whp_sites_iucn_recommendationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_iucn_recommendationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_iucn_recommendationService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_iucn_recommendationService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_iucn_recommendationService getWrappedwhp_sites_iucn_recommendationService() {
		return _whp_sites_iucn_recommendationService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_iucn_recommendationService(
		whp_sites_iucn_recommendationService whp_sites_iucn_recommendationService) {
		_whp_sites_iucn_recommendationService = whp_sites_iucn_recommendationService;
	}

	public whp_sites_iucn_recommendationService getWrappedService() {
		return _whp_sites_iucn_recommendationService;
	}

	public void setWrappedService(
		whp_sites_iucn_recommendationService whp_sites_iucn_recommendationService) {
		_whp_sites_iucn_recommendationService = whp_sites_iucn_recommendationService;
	}

	private whp_sites_iucn_recommendationService _whp_sites_iucn_recommendationService;
}