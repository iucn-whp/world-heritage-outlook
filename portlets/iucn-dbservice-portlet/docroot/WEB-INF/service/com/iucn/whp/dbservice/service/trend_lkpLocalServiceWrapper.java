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
 * This class is a wrapper for {@link trend_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       trend_lkpLocalService
 * @generated
 */
public class trend_lkpLocalServiceWrapper implements trend_lkpLocalService,
	ServiceWrapper<trend_lkpLocalService> {
	public trend_lkpLocalServiceWrapper(
		trend_lkpLocalService trend_lkpLocalService) {
		_trend_lkpLocalService = trend_lkpLocalService;
	}

	/**
	* Adds the trend_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param trend_lkp the trend_lkp
	* @return the trend_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp addtrend_lkp(
		com.iucn.whp.dbservice.model.trend_lkp trend_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.addtrend_lkp(trend_lkp);
	}

	/**
	* Creates a new trend_lkp with the primary key. Does not add the trend_lkp to the database.
	*
	* @param trend_id the primary key for the new trend_lkp
	* @return the new trend_lkp
	*/
	public com.iucn.whp.dbservice.model.trend_lkp createtrend_lkp(long trend_id) {
		return _trend_lkpLocalService.createtrend_lkp(trend_id);
	}

	/**
	* Deletes the trend_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trend_id the primary key of the trend_lkp
	* @return the trend_lkp that was removed
	* @throws PortalException if a trend_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp deletetrend_lkp(long trend_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.deletetrend_lkp(trend_id);
	}

	/**
	* Deletes the trend_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param trend_lkp the trend_lkp
	* @return the trend_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp deletetrend_lkp(
		com.iucn.whp.dbservice.model.trend_lkp trend_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.deletetrend_lkp(trend_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trend_lkpLocalService.dynamicQuery();
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
		return _trend_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _trend_lkpLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _trend_lkpLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _trend_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.trend_lkp fetchtrend_lkp(long trend_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.fetchtrend_lkp(trend_id);
	}

	/**
	* Returns the trend_lkp with the primary key.
	*
	* @param trend_id the primary key of the trend_lkp
	* @return the trend_lkp
	* @throws PortalException if a trend_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp gettrend_lkp(long trend_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.gettrend_lkp(trend_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the trend_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trend_lkps
	* @param end the upper bound of the range of trend_lkps (not inclusive)
	* @return the range of trend_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.trend_lkp> gettrend_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.gettrend_lkps(start, end);
	}

	/**
	* Returns the number of trend_lkps.
	*
	* @return the number of trend_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int gettrend_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.gettrend_lkpsCount();
	}

	/**
	* Updates the trend_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trend_lkp the trend_lkp
	* @return the trend_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp updatetrend_lkp(
		com.iucn.whp.dbservice.model.trend_lkp trend_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.updatetrend_lkp(trend_lkp);
	}

	/**
	* Updates the trend_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trend_lkp the trend_lkp
	* @param merge whether to merge the trend_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the trend_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.trend_lkp updatetrend_lkp(
		com.iucn.whp.dbservice.model.trend_lkp trend_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.updatetrend_lkp(trend_lkp, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _trend_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_trend_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trend_lkpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.iucn.whp.dbservice.model.trend_lkp getTrendFromtrend_id(
		long trend_id)
		throws com.iucn.whp.dbservice.NoSuchstate_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trend_lkpLocalService.getTrendFromtrend_id(trend_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public trend_lkpLocalService getWrappedtrend_lkpLocalService() {
		return _trend_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedtrend_lkpLocalService(
		trend_lkpLocalService trend_lkpLocalService) {
		_trend_lkpLocalService = trend_lkpLocalService;
	}

	public trend_lkpLocalService getWrappedService() {
		return _trend_lkpLocalService;
	}

	public void setWrappedService(trend_lkpLocalService trend_lkpLocalService) {
		_trend_lkpLocalService = trend_lkpLocalService;
	}

	private trend_lkpLocalService _trend_lkpLocalService;
}