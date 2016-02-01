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
 * This class is a wrapper for {@link understanding_benefits_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       understanding_benefits_lkpLocalService
 * @generated
 */
public class understanding_benefits_lkpLocalServiceWrapper
	implements understanding_benefits_lkpLocalService,
		ServiceWrapper<understanding_benefits_lkpLocalService> {
	public understanding_benefits_lkpLocalServiceWrapper(
		understanding_benefits_lkpLocalService understanding_benefits_lkpLocalService) {
		_understanding_benefits_lkpLocalService = understanding_benefits_lkpLocalService;
	}

	/**
	* Adds the understanding_benefits_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param understanding_benefits_lkp the understanding_benefits_lkp
	* @return the understanding_benefits_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp addunderstanding_benefits_lkp(
		com.iucn.whp.dbservice.model.understanding_benefits_lkp understanding_benefits_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.addunderstanding_benefits_lkp(understanding_benefits_lkp);
	}

	/**
	* Creates a new understanding_benefits_lkp with the primary key. Does not add the understanding_benefits_lkp to the database.
	*
	* @param benefits_id the primary key for the new understanding_benefits_lkp
	* @return the new understanding_benefits_lkp
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp createunderstanding_benefits_lkp(
		long benefits_id) {
		return _understanding_benefits_lkpLocalService.createunderstanding_benefits_lkp(benefits_id);
	}

	/**
	* Deletes the understanding_benefits_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_id the primary key of the understanding_benefits_lkp
	* @return the understanding_benefits_lkp that was removed
	* @throws PortalException if a understanding_benefits_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp deleteunderstanding_benefits_lkp(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.deleteunderstanding_benefits_lkp(benefits_id);
	}

	/**
	* Deletes the understanding_benefits_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param understanding_benefits_lkp the understanding_benefits_lkp
	* @return the understanding_benefits_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp deleteunderstanding_benefits_lkp(
		com.iucn.whp.dbservice.model.understanding_benefits_lkp understanding_benefits_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.deleteunderstanding_benefits_lkp(understanding_benefits_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _understanding_benefits_lkpLocalService.dynamicQuery();
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
		return _understanding_benefits_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _understanding_benefits_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _understanding_benefits_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _understanding_benefits_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.understanding_benefits_lkp fetchunderstanding_benefits_lkp(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.fetchunderstanding_benefits_lkp(benefits_id);
	}

	/**
	* Returns the understanding_benefits_lkp with the primary key.
	*
	* @param benefits_id the primary key of the understanding_benefits_lkp
	* @return the understanding_benefits_lkp
	* @throws PortalException if a understanding_benefits_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp getunderstanding_benefits_lkp(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.getunderstanding_benefits_lkp(benefits_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the understanding_benefits_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of understanding_benefits_lkps
	* @param end the upper bound of the range of understanding_benefits_lkps (not inclusive)
	* @return the range of understanding_benefits_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits_lkp> getunderstanding_benefits_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.getunderstanding_benefits_lkps(start,
			end);
	}

	/**
	* Returns the number of understanding_benefits_lkps.
	*
	* @return the number of understanding_benefits_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getunderstanding_benefits_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.getunderstanding_benefits_lkpsCount();
	}

	/**
	* Updates the understanding_benefits_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param understanding_benefits_lkp the understanding_benefits_lkp
	* @return the understanding_benefits_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp updateunderstanding_benefits_lkp(
		com.iucn.whp.dbservice.model.understanding_benefits_lkp understanding_benefits_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.updateunderstanding_benefits_lkp(understanding_benefits_lkp);
	}

	/**
	* Updates the understanding_benefits_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param understanding_benefits_lkp the understanding_benefits_lkp
	* @param merge whether to merge the understanding_benefits_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the understanding_benefits_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits_lkp updateunderstanding_benefits_lkp(
		com.iucn.whp.dbservice.model.understanding_benefits_lkp understanding_benefits_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _understanding_benefits_lkpLocalService.updateunderstanding_benefits_lkp(understanding_benefits_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _understanding_benefits_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_understanding_benefits_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _understanding_benefits_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public understanding_benefits_lkpLocalService getWrappedunderstanding_benefits_lkpLocalService() {
		return _understanding_benefits_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedunderstanding_benefits_lkpLocalService(
		understanding_benefits_lkpLocalService understanding_benefits_lkpLocalService) {
		_understanding_benefits_lkpLocalService = understanding_benefits_lkpLocalService;
	}

	public understanding_benefits_lkpLocalService getWrappedService() {
		return _understanding_benefits_lkpLocalService;
	}

	public void setWrappedService(
		understanding_benefits_lkpLocalService understanding_benefits_lkpLocalService) {
		_understanding_benefits_lkpLocalService = understanding_benefits_lkpLocalService;
	}

	private understanding_benefits_lkpLocalService _understanding_benefits_lkpLocalService;
}