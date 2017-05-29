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
 * This class is a wrapper for {@link mission_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       mission_lkpLocalService
 * @generated
 */
public class mission_lkpLocalServiceWrapper implements mission_lkpLocalService,
	ServiceWrapper<mission_lkpLocalService> {
	public mission_lkpLocalServiceWrapper(
		mission_lkpLocalService mission_lkpLocalService) {
		_mission_lkpLocalService = mission_lkpLocalService;
	}

	/**
	* Adds the mission_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param mission_lkp the mission_lkp
	* @return the mission_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp addmission_lkp(
		com.iucn.whp.dbservice.model.mission_lkp mission_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.addmission_lkp(mission_lkp);
	}

	/**
	* Creates a new mission_lkp with the primary key. Does not add the mission_lkp to the database.
	*
	* @param mission_id the primary key for the new mission_lkp
	* @return the new mission_lkp
	*/
	public com.iucn.whp.dbservice.model.mission_lkp createmission_lkp(
		int mission_id) {
		return _mission_lkpLocalService.createmission_lkp(mission_id);
	}

	/**
	* Deletes the mission_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mission_id the primary key of the mission_lkp
	* @return the mission_lkp that was removed
	* @throws PortalException if a mission_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp deletemission_lkp(
		int mission_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.deletemission_lkp(mission_id);
	}

	/**
	* Deletes the mission_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param mission_lkp the mission_lkp
	* @return the mission_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp deletemission_lkp(
		com.iucn.whp.dbservice.model.mission_lkp mission_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.deletemission_lkp(mission_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mission_lkpLocalService.dynamicQuery();
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
		return _mission_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _mission_lkpLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _mission_lkpLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _mission_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.mission_lkp fetchmission_lkp(
		int mission_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.fetchmission_lkp(mission_id);
	}

	/**
	* Returns the mission_lkp with the primary key.
	*
	* @param mission_id the primary key of the mission_lkp
	* @return the mission_lkp
	* @throws PortalException if a mission_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp getmission_lkp(
		int mission_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.getmission_lkp(mission_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mission_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of mission_lkps
	* @param end the upper bound of the range of mission_lkps (not inclusive)
	* @return the range of mission_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.mission_lkp> getmission_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.getmission_lkps(start, end);
	}

	/**
	* Returns the number of mission_lkps.
	*
	* @return the number of mission_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getmission_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.getmission_lkpsCount();
	}

	/**
	* Updates the mission_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mission_lkp the mission_lkp
	* @return the mission_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp updatemission_lkp(
		com.iucn.whp.dbservice.model.mission_lkp mission_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.updatemission_lkp(mission_lkp);
	}

	/**
	* Updates the mission_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mission_lkp the mission_lkp
	* @param merge whether to merge the mission_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the mission_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.mission_lkp updatemission_lkp(
		com.iucn.whp.dbservice.model.mission_lkp mission_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mission_lkpLocalService.updatemission_lkp(mission_lkp, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _mission_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mission_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mission_lkpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public mission_lkpLocalService getWrappedmission_lkpLocalService() {
		return _mission_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedmission_lkpLocalService(
		mission_lkpLocalService mission_lkpLocalService) {
		_mission_lkpLocalService = mission_lkpLocalService;
	}

	public mission_lkpLocalService getWrappedService() {
		return _mission_lkpLocalService;
	}

	public void setWrappedService(
		mission_lkpLocalService mission_lkpLocalService) {
		_mission_lkpLocalService = mission_lkpLocalService;
	}

	private mission_lkpLocalService _mission_lkpLocalService;
}