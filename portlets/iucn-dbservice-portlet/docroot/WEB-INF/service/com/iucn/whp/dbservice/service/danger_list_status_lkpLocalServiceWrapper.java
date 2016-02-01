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
 * This class is a wrapper for {@link danger_list_status_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       danger_list_status_lkpLocalService
 * @generated
 */
public class danger_list_status_lkpLocalServiceWrapper
	implements danger_list_status_lkpLocalService,
		ServiceWrapper<danger_list_status_lkpLocalService> {
	public danger_list_status_lkpLocalServiceWrapper(
		danger_list_status_lkpLocalService danger_list_status_lkpLocalService) {
		_danger_list_status_lkpLocalService = danger_list_status_lkpLocalService;
	}

	/**
	* Adds the danger_list_status_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param danger_list_status_lkp the danger_list_status_lkp
	* @return the danger_list_status_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp adddanger_list_status_lkp(
		com.iucn.whp.dbservice.model.danger_list_status_lkp danger_list_status_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.adddanger_list_status_lkp(danger_list_status_lkp);
	}

	/**
	* Creates a new danger_list_status_lkp with the primary key. Does not add the danger_list_status_lkp to the database.
	*
	* @param dlstatus_id the primary key for the new danger_list_status_lkp
	* @return the new danger_list_status_lkp
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp createdanger_list_status_lkp(
		int dlstatus_id) {
		return _danger_list_status_lkpLocalService.createdanger_list_status_lkp(dlstatus_id);
	}

	/**
	* Deletes the danger_list_status_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dlstatus_id the primary key of the danger_list_status_lkp
	* @return the danger_list_status_lkp that was removed
	* @throws PortalException if a danger_list_status_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp deletedanger_list_status_lkp(
		int dlstatus_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.deletedanger_list_status_lkp(dlstatus_id);
	}

	/**
	* Deletes the danger_list_status_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param danger_list_status_lkp the danger_list_status_lkp
	* @return the danger_list_status_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp deletedanger_list_status_lkp(
		com.iucn.whp.dbservice.model.danger_list_status_lkp danger_list_status_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.deletedanger_list_status_lkp(danger_list_status_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _danger_list_status_lkpLocalService.dynamicQuery();
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
		return _danger_list_status_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _danger_list_status_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _danger_list_status_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _danger_list_status_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.danger_list_status_lkp fetchdanger_list_status_lkp(
		int dlstatus_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.fetchdanger_list_status_lkp(dlstatus_id);
	}

	/**
	* Returns the danger_list_status_lkp with the primary key.
	*
	* @param dlstatus_id the primary key of the danger_list_status_lkp
	* @return the danger_list_status_lkp
	* @throws PortalException if a danger_list_status_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp getdanger_list_status_lkp(
		int dlstatus_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.getdanger_list_status_lkp(dlstatus_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danger_list_status_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of danger_list_status_lkps
	* @param end the upper bound of the range of danger_list_status_lkps (not inclusive)
	* @return the range of danger_list_status_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.danger_list_status_lkp> getdanger_list_status_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.getdanger_list_status_lkps(start,
			end);
	}

	/**
	* Returns the number of danger_list_status_lkps.
	*
	* @return the number of danger_list_status_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getdanger_list_status_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.getdanger_list_status_lkpsCount();
	}

	/**
	* Updates the danger_list_status_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danger_list_status_lkp the danger_list_status_lkp
	* @return the danger_list_status_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp updatedanger_list_status_lkp(
		com.iucn.whp.dbservice.model.danger_list_status_lkp danger_list_status_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.updatedanger_list_status_lkp(danger_list_status_lkp);
	}

	/**
	* Updates the danger_list_status_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danger_list_status_lkp the danger_list_status_lkp
	* @param merge whether to merge the danger_list_status_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the danger_list_status_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.danger_list_status_lkp updatedanger_list_status_lkp(
		com.iucn.whp.dbservice.model.danger_list_status_lkp danger_list_status_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.updatedanger_list_status_lkp(danger_list_status_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _danger_list_status_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danger_list_status_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danger_list_status_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* GET All Danget list
	*/
	public java.util.List<com.iucn.whp.dbservice.model.danger_list_status_lkp> getAllDangerListType()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danger_list_status_lkpLocalService.getAllDangerListType();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public danger_list_status_lkpLocalService getWrappeddanger_list_status_lkpLocalService() {
		return _danger_list_status_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddanger_list_status_lkpLocalService(
		danger_list_status_lkpLocalService danger_list_status_lkpLocalService) {
		_danger_list_status_lkpLocalService = danger_list_status_lkpLocalService;
	}

	public danger_list_status_lkpLocalService getWrappedService() {
		return _danger_list_status_lkpLocalService;
	}

	public void setWrappedService(
		danger_list_status_lkpLocalService danger_list_status_lkpLocalService) {
		_danger_list_status_lkpLocalService = danger_list_status_lkpLocalService;
	}

	private danger_list_status_lkpLocalService _danger_list_status_lkpLocalService;
}