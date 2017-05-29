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
 * This class is a wrapper for {@link whp_site_danger_listLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_site_danger_listLocalService
 * @generated
 */
public class whp_site_danger_listLocalServiceWrapper
	implements whp_site_danger_listLocalService,
		ServiceWrapper<whp_site_danger_listLocalService> {
	public whp_site_danger_listLocalServiceWrapper(
		whp_site_danger_listLocalService whp_site_danger_listLocalService) {
		_whp_site_danger_listLocalService = whp_site_danger_listLocalService;
	}

	/**
	* Adds the whp_site_danger_list to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list the whp_site_danger_list
	* @return the whp_site_danger_list that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list addwhp_site_danger_list(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.addwhp_site_danger_list(whp_site_danger_list);
	}

	/**
	* Creates a new whp_site_danger_list with the primary key. Does not add the whp_site_danger_list to the database.
	*
	* @param whp_site_danger_list_id the primary key for the new whp_site_danger_list
	* @return the new whp_site_danger_list
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list createwhp_site_danger_list(
		long whp_site_danger_list_id) {
		return _whp_site_danger_listLocalService.createwhp_site_danger_list(whp_site_danger_list_id);
	}

	/**
	* Deletes the whp_site_danger_list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list_id the primary key of the whp_site_danger_list
	* @return the whp_site_danger_list that was removed
	* @throws PortalException if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list deletewhp_site_danger_list(
		long whp_site_danger_list_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.deletewhp_site_danger_list(whp_site_danger_list_id);
	}

	/**
	* Deletes the whp_site_danger_list from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list the whp_site_danger_list
	* @return the whp_site_danger_list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list deletewhp_site_danger_list(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.deletewhp_site_danger_list(whp_site_danger_list);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_site_danger_listLocalService.dynamicQuery();
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
		return _whp_site_danger_listLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_site_danger_listLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_site_danger_listLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_site_danger_listLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchwhp_site_danger_list(
		long whp_site_danger_list_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.fetchwhp_site_danger_list(whp_site_danger_list_id);
	}

	/**
	* Returns the whp_site_danger_list with the primary key.
	*
	* @param whp_site_danger_list_id the primary key of the whp_site_danger_list
	* @return the whp_site_danger_list
	* @throws PortalException if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list getwhp_site_danger_list(
		long whp_site_danger_list_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.getwhp_site_danger_list(whp_site_danger_list_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_site_danger_lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_site_danger_lists
	* @param end the upper bound of the range of whp_site_danger_lists (not inclusive)
	* @return the range of whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.getwhp_site_danger_lists(start,
			end);
	}

	/**
	* Returns the number of whp_site_danger_lists.
	*
	* @return the number of whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_site_danger_listsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.getwhp_site_danger_listsCount();
	}

	/**
	* Updates the whp_site_danger_list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list the whp_site_danger_list
	* @return the whp_site_danger_list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list updatewhp_site_danger_list(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.updatewhp_site_danger_list(whp_site_danger_list);
	}

	/**
	* Updates the whp_site_danger_list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list the whp_site_danger_list
	* @param merge whether to merge the whp_site_danger_list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_site_danger_list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list updatewhp_site_danger_list(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_site_danger_listLocalService.updatewhp_site_danger_list(whp_site_danger_list,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_site_danger_listLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_site_danger_listLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_site_danger_listLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_site_danger_listLocalService getWrappedwhp_site_danger_listLocalService() {
		return _whp_site_danger_listLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_site_danger_listLocalService(
		whp_site_danger_listLocalService whp_site_danger_listLocalService) {
		_whp_site_danger_listLocalService = whp_site_danger_listLocalService;
	}

	public whp_site_danger_listLocalService getWrappedService() {
		return _whp_site_danger_listLocalService;
	}

	public void setWrappedService(
		whp_site_danger_listLocalService whp_site_danger_listLocalService) {
		_whp_site_danger_listLocalService = whp_site_danger_listLocalService;
	}

	private whp_site_danger_listLocalService _whp_site_danger_listLocalService;
}