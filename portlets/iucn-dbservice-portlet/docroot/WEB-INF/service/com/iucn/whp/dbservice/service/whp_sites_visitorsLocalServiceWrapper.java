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
 * This class is a wrapper for {@link whp_sites_visitorsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_visitorsLocalService
 * @generated
 */
public class whp_sites_visitorsLocalServiceWrapper
	implements whp_sites_visitorsLocalService,
		ServiceWrapper<whp_sites_visitorsLocalService> {
	public whp_sites_visitorsLocalServiceWrapper(
		whp_sites_visitorsLocalService whp_sites_visitorsLocalService) {
		_whp_sites_visitorsLocalService = whp_sites_visitorsLocalService;
	}

	/**
	* Adds the whp_sites_visitors to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_visitors the whp_sites_visitors
	* @return the whp_sites_visitors that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors addwhp_sites_visitors(
		com.iucn.whp.dbservice.model.whp_sites_visitors whp_sites_visitors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.addwhp_sites_visitors(whp_sites_visitors);
	}

	/**
	* Creates a new whp_sites_visitors with the primary key. Does not add the whp_sites_visitors to the database.
	*
	* @param whp_sites_visitors_id the primary key for the new whp_sites_visitors
	* @return the new whp_sites_visitors
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors createwhp_sites_visitors(
		long whp_sites_visitors_id) {
		return _whp_sites_visitorsLocalService.createwhp_sites_visitors(whp_sites_visitors_id);
	}

	/**
	* Deletes the whp_sites_visitors with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_visitors_id the primary key of the whp_sites_visitors
	* @return the whp_sites_visitors that was removed
	* @throws PortalException if a whp_sites_visitors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors deletewhp_sites_visitors(
		long whp_sites_visitors_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.deletewhp_sites_visitors(whp_sites_visitors_id);
	}

	/**
	* Deletes the whp_sites_visitors from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_visitors the whp_sites_visitors
	* @return the whp_sites_visitors that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors deletewhp_sites_visitors(
		com.iucn.whp.dbservice.model.whp_sites_visitors whp_sites_visitors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.deletewhp_sites_visitors(whp_sites_visitors);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_visitorsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_visitors fetchwhp_sites_visitors(
		long whp_sites_visitors_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.fetchwhp_sites_visitors(whp_sites_visitors_id);
	}

	/**
	* Returns the whp_sites_visitors with the primary key.
	*
	* @param whp_sites_visitors_id the primary key of the whp_sites_visitors
	* @return the whp_sites_visitors
	* @throws PortalException if a whp_sites_visitors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors getwhp_sites_visitors(
		long whp_sites_visitors_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.getwhp_sites_visitors(whp_sites_visitors_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_visitorses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_visitorses
	* @param end the upper bound of the range of whp_sites_visitorses (not inclusive)
	* @return the range of whp_sites_visitorses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.getwhp_sites_visitorses(start,
			end);
	}

	/**
	* Returns the number of whp_sites_visitorses.
	*
	* @return the number of whp_sites_visitorses
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_visitorsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.getwhp_sites_visitorsesCount();
	}

	/**
	* Updates the whp_sites_visitors in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_visitors the whp_sites_visitors
	* @return the whp_sites_visitors that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors updatewhp_sites_visitors(
		com.iucn.whp.dbservice.model.whp_sites_visitors whp_sites_visitors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.updatewhp_sites_visitors(whp_sites_visitors);
	}

	/**
	* Updates the whp_sites_visitors in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_visitors the whp_sites_visitors
	* @param merge whether to merge the whp_sites_visitors with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_visitors that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_visitors updatewhp_sites_visitors(
		com.iucn.whp.dbservice.model.whp_sites_visitors whp_sites_visitors,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_visitorsLocalService.updatewhp_sites_visitors(whp_sites_visitors,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_visitorsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_visitorsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_visitorsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_visitorsLocalService getWrappedwhp_sites_visitorsLocalService() {
		return _whp_sites_visitorsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_visitorsLocalService(
		whp_sites_visitorsLocalService whp_sites_visitorsLocalService) {
		_whp_sites_visitorsLocalService = whp_sites_visitorsLocalService;
	}

	public whp_sites_visitorsLocalService getWrappedService() {
		return _whp_sites_visitorsLocalService;
	}

	public void setWrappedService(
		whp_sites_visitorsLocalService whp_sites_visitorsLocalService) {
		_whp_sites_visitorsLocalService = whp_sites_visitorsLocalService;
	}

	private whp_sites_visitorsLocalService _whp_sites_visitorsLocalService;
}