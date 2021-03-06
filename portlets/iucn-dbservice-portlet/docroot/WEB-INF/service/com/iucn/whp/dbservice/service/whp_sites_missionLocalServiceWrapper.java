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
 * This class is a wrapper for {@link whp_sites_missionLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_missionLocalService
 * @generated
 */
public class whp_sites_missionLocalServiceWrapper
	implements whp_sites_missionLocalService,
		ServiceWrapper<whp_sites_missionLocalService> {
	public whp_sites_missionLocalServiceWrapper(
		whp_sites_missionLocalService whp_sites_missionLocalService) {
		_whp_sites_missionLocalService = whp_sites_missionLocalService;
	}

	/**
	* Adds the whp_sites_mission to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission the whp_sites_mission
	* @return the whp_sites_mission that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission addwhp_sites_mission(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.addwhp_sites_mission(whp_sites_mission);
	}

	/**
	* Creates a new whp_sites_mission with the primary key. Does not add the whp_sites_mission to the database.
	*
	* @param whp_sites_mission_id the primary key for the new whp_sites_mission
	* @return the new whp_sites_mission
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission createwhp_sites_mission(
		long whp_sites_mission_id) {
		return _whp_sites_missionLocalService.createwhp_sites_mission(whp_sites_mission_id);
	}

	/**
	* Deletes the whp_sites_mission with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission_id the primary key of the whp_sites_mission
	* @return the whp_sites_mission that was removed
	* @throws PortalException if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission deletewhp_sites_mission(
		long whp_sites_mission_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.deletewhp_sites_mission(whp_sites_mission_id);
	}

	/**
	* Deletes the whp_sites_mission from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission the whp_sites_mission
	* @return the whp_sites_mission that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission deletewhp_sites_mission(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.deletewhp_sites_mission(whp_sites_mission);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_missionLocalService.dynamicQuery();
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
		return _whp_sites_missionLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_missionLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _whp_sites_missionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _whp_sites_missionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mission fetchwhp_sites_mission(
		long whp_sites_mission_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.fetchwhp_sites_mission(whp_sites_mission_id);
	}

	/**
	* Returns the whp_sites_mission with the primary key.
	*
	* @param whp_sites_mission_id the primary key of the whp_sites_mission
	* @return the whp_sites_mission
	* @throws PortalException if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission getwhp_sites_mission(
		long whp_sites_mission_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.getwhp_sites_mission(whp_sites_mission_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_missions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_missions
	* @param end the upper bound of the range of whp_sites_missions (not inclusive)
	* @return the range of whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.getwhp_sites_missions(start, end);
	}

	/**
	* Returns the number of whp_sites_missions.
	*
	* @return the number of whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_missionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.getwhp_sites_missionsCount();
	}

	/**
	* Updates the whp_sites_mission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission the whp_sites_mission
	* @return the whp_sites_mission that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission updatewhp_sites_mission(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.updatewhp_sites_mission(whp_sites_mission);
	}

	/**
	* Updates the whp_sites_mission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission the whp_sites_mission
	* @param merge whether to merge the whp_sites_mission with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_mission that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission updatewhp_sites_mission(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_missionLocalService.updatewhp_sites_mission(whp_sites_mission,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_missionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_missionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_missionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mission addwhp_sites_mgmt_mission(
		long siteid, java.lang.String doclink, java.util.Date date_published,
		long fileentryid, int missionid, java.lang.String docName) {
		return _whp_sites_missionLocalService.addwhp_sites_mgmt_mission(siteid,
			doclink, date_published, fileentryid, missionid, docName);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mission removewhp_sites_mission(
		long fileentryid, int missionid) {
		return _whp_sites_missionLocalService.removewhp_sites_mission(fileentryid,
			missionid);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_missionLocalService getWrappedwhp_sites_missionLocalService() {
		return _whp_sites_missionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_missionLocalService(
		whp_sites_missionLocalService whp_sites_missionLocalService) {
		_whp_sites_missionLocalService = whp_sites_missionLocalService;
	}

	public whp_sites_missionLocalService getWrappedService() {
		return _whp_sites_missionLocalService;
	}

	public void setWrappedService(
		whp_sites_missionLocalService whp_sites_missionLocalService) {
		_whp_sites_missionLocalService = whp_sites_missionLocalService;
	}

	private whp_sites_missionLocalService _whp_sites_missionLocalService;
}