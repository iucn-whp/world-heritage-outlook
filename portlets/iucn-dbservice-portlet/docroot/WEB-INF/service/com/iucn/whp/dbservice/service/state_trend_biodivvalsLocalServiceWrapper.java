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
 * This class is a wrapper for {@link state_trend_biodivvalsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       state_trend_biodivvalsLocalService
 * @generated
 */
public class state_trend_biodivvalsLocalServiceWrapper
	implements state_trend_biodivvalsLocalService,
		ServiceWrapper<state_trend_biodivvalsLocalService> {
	public state_trend_biodivvalsLocalServiceWrapper(
		state_trend_biodivvalsLocalService state_trend_biodivvalsLocalService) {
		_state_trend_biodivvalsLocalService = state_trend_biodivvalsLocalService;
	}

	/**
	* Adds the state_trend_biodivvals to the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_biodivvals the state_trend_biodivvals
	* @return the state_trend_biodivvals that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals addstate_trend_biodivvals(
		com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.addstate_trend_biodivvals(state_trend_biodivvals);
	}

	/**
	* Creates a new state_trend_biodivvals with the primary key. Does not add the state_trend_biodivvals to the database.
	*
	* @param state_trend_biodivvals_id the primary key for the new state_trend_biodivvals
	* @return the new state_trend_biodivvals
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals createstate_trend_biodivvals(
		long state_trend_biodivvals_id) {
		return _state_trend_biodivvalsLocalService.createstate_trend_biodivvals(state_trend_biodivvals_id);
	}

	/**
	* Deletes the state_trend_biodivvals with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_biodivvals_id the primary key of the state_trend_biodivvals
	* @return the state_trend_biodivvals that was removed
	* @throws PortalException if a state_trend_biodivvals with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals deletestate_trend_biodivvals(
		long state_trend_biodivvals_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.deletestate_trend_biodivvals(state_trend_biodivvals_id);
	}

	/**
	* Deletes the state_trend_biodivvals from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_biodivvals the state_trend_biodivvals
	* @return the state_trend_biodivvals that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals deletestate_trend_biodivvals(
		com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.deletestate_trend_biodivvals(state_trend_biodivvals);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _state_trend_biodivvalsLocalService.dynamicQuery();
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
		return _state_trend_biodivvalsLocalService.dynamicQuery(dynamicQuery);
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
		return _state_trend_biodivvalsLocalService.dynamicQuery(dynamicQuery,
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
		return _state_trend_biodivvalsLocalService.dynamicQuery(dynamicQuery,
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
		return _state_trend_biodivvalsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.state_trend_biodivvals fetchstate_trend_biodivvals(
		long state_trend_biodivvals_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.fetchstate_trend_biodivvals(state_trend_biodivvals_id);
	}

	/**
	* Returns the state_trend_biodivvals with the primary key.
	*
	* @param state_trend_biodivvals_id the primary key of the state_trend_biodivvals
	* @return the state_trend_biodivvals
	* @throws PortalException if a state_trend_biodivvals with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals getstate_trend_biodivvals(
		long state_trend_biodivvals_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.getstate_trend_biodivvals(state_trend_biodivvals_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the state_trend_biodivvalses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of state_trend_biodivvalses
	* @param end the upper bound of the range of state_trend_biodivvalses (not inclusive)
	* @return the range of state_trend_biodivvalses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.getstate_trend_biodivvalses(start,
			end);
	}

	/**
	* Returns the number of state_trend_biodivvalses.
	*
	* @return the number of state_trend_biodivvalses
	* @throws SystemException if a system exception occurred
	*/
	public int getstate_trend_biodivvalsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.getstate_trend_biodivvalsesCount();
	}

	/**
	* Updates the state_trend_biodivvals in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param state_trend_biodivvals the state_trend_biodivvals
	* @return the state_trend_biodivvals that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals updatestate_trend_biodivvals(
		com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.updatestate_trend_biodivvals(state_trend_biodivvals);
	}

	/**
	* Updates the state_trend_biodivvals in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param state_trend_biodivvals the state_trend_biodivvals
	* @param merge whether to merge the state_trend_biodivvals with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the state_trend_biodivvals that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_biodivvals updatestate_trend_biodivvals(
		com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.updatestate_trend_biodivvals(state_trend_biodivvals,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _state_trend_biodivvalsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_state_trend_biodivvalsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _state_trend_biodivvalsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getEntriesFromAssessment_versionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _state_trend_biodivvalsLocalService.getEntriesFromAssessment_versionId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public state_trend_biodivvalsLocalService getWrappedstate_trend_biodivvalsLocalService() {
		return _state_trend_biodivvalsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedstate_trend_biodivvalsLocalService(
		state_trend_biodivvalsLocalService state_trend_biodivvalsLocalService) {
		_state_trend_biodivvalsLocalService = state_trend_biodivvalsLocalService;
	}

	public state_trend_biodivvalsLocalService getWrappedService() {
		return _state_trend_biodivvalsLocalService;
	}

	public void setWrappedService(
		state_trend_biodivvalsLocalService state_trend_biodivvalsLocalService) {
		_state_trend_biodivvalsLocalService = state_trend_biodivvalsLocalService;
	}

	private state_trend_biodivvalsLocalService _state_trend_biodivvalsLocalService;
}