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
 * This class is a wrapper for {@link whp_sites_mgmt_plan_stateLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_mgmt_plan_stateLocalService
 * @generated
 */
public class whp_sites_mgmt_plan_stateLocalServiceWrapper
	implements whp_sites_mgmt_plan_stateLocalService,
		ServiceWrapper<whp_sites_mgmt_plan_stateLocalService> {
	public whp_sites_mgmt_plan_stateLocalServiceWrapper(
		whp_sites_mgmt_plan_stateLocalService whp_sites_mgmt_plan_stateLocalService) {
		_whp_sites_mgmt_plan_stateLocalService = whp_sites_mgmt_plan_stateLocalService;
	}

	/**
	* Adds the whp_sites_mgmt_plan_state to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state addwhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.addwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
	}

	/**
	* Creates a new whp_sites_mgmt_plan_state with the primary key. Does not add the whp_sites_mgmt_plan_state to the database.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key for the new whp_sites_mgmt_plan_state
	* @return the new whp_sites_mgmt_plan_state
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state createwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id) {
		return _whp_sites_mgmt_plan_stateLocalService.createwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Deletes the whp_sites_mgmt_plan_state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key of the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was removed
	* @throws PortalException if a whp_sites_mgmt_plan_state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state deletewhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.deletewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Deletes the whp_sites_mgmt_plan_state from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state deletewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.deletewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_mgmt_plan_stateLocalService.dynamicQuery();
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
		return _whp_sites_mgmt_plan_stateLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_mgmt_plan_stateLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_mgmt_plan_stateLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_mgmt_plan_stateLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state fetchwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.fetchwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Returns the whp_sites_mgmt_plan_state with the primary key.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key of the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state
	* @throws PortalException if a whp_sites_mgmt_plan_state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state getwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.getwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_mgmt_plan_states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_mgmt_plan_states
	* @param end the upper bound of the range of whp_sites_mgmt_plan_states (not inclusive)
	* @return the range of whp_sites_mgmt_plan_states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.getwhp_sites_mgmt_plan_states(start,
			end);
	}

	/**
	* Returns the number of whp_sites_mgmt_plan_states.
	*
	* @return the number of whp_sites_mgmt_plan_states
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_mgmt_plan_statesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.getwhp_sites_mgmt_plan_statesCount();
	}

	/**
	* Updates the whp_sites_mgmt_plan_state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state updatewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.updatewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
	}

	/**
	* Updates the whp_sites_mgmt_plan_state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @param merge whether to merge the whp_sites_mgmt_plan_state with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_mgmt_plan_state that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state updatewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_mgmt_plan_stateLocalService.updatewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_mgmt_plan_stateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_mgmt_plan_stateLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_mgmt_plan_stateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state addwhp_sites_mgmt_plan_state(
		long siteid, java.lang.String doclink, java.util.Date date_published,
		long fileentryid, java.lang.String docName) {
		return _whp_sites_mgmt_plan_stateLocalService.addwhp_sites_mgmt_plan_state(siteid,
			doclink, date_published, fileentryid, docName);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state removewhp_sites_mgmt_plan_state(
		long fileentryid) {
		return _whp_sites_mgmt_plan_stateLocalService.removewhp_sites_mgmt_plan_state(fileentryid);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_mgmt_plan_stateLocalService getWrappedwhp_sites_mgmt_plan_stateLocalService() {
		return _whp_sites_mgmt_plan_stateLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_mgmt_plan_stateLocalService(
		whp_sites_mgmt_plan_stateLocalService whp_sites_mgmt_plan_stateLocalService) {
		_whp_sites_mgmt_plan_stateLocalService = whp_sites_mgmt_plan_stateLocalService;
	}

	public whp_sites_mgmt_plan_stateLocalService getWrappedService() {
		return _whp_sites_mgmt_plan_stateLocalService;
	}

	public void setWrappedService(
		whp_sites_mgmt_plan_stateLocalService whp_sites_mgmt_plan_stateLocalService) {
		_whp_sites_mgmt_plan_stateLocalService = whp_sites_mgmt_plan_stateLocalService;
	}

	private whp_sites_mgmt_plan_stateLocalService _whp_sites_mgmt_plan_stateLocalService;
}