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
 * This class is a wrapper for {@link whp_sites_meeLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_meeLocalService
 * @generated
 */
public class whp_sites_meeLocalServiceWrapper
	implements whp_sites_meeLocalService,
		ServiceWrapper<whp_sites_meeLocalService> {
	public whp_sites_meeLocalServiceWrapper(
		whp_sites_meeLocalService whp_sites_meeLocalService) {
		_whp_sites_meeLocalService = whp_sites_meeLocalService;
	}

	/**
	* Adds the whp_sites_mee to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee the whp_sites_mee
	* @return the whp_sites_mee that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee addwhp_sites_mee(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.addwhp_sites_mee(whp_sites_mee);
	}

	/**
	* Creates a new whp_sites_mee with the primary key. Does not add the whp_sites_mee to the database.
	*
	* @param whp_sites_mee_id the primary key for the new whp_sites_mee
	* @return the new whp_sites_mee
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee createwhp_sites_mee(
		long whp_sites_mee_id) {
		return _whp_sites_meeLocalService.createwhp_sites_mee(whp_sites_mee_id);
	}

	/**
	* Deletes the whp_sites_mee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee_id the primary key of the whp_sites_mee
	* @return the whp_sites_mee that was removed
	* @throws PortalException if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee deletewhp_sites_mee(
		long whp_sites_mee_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.deletewhp_sites_mee(whp_sites_mee_id);
	}

	/**
	* Deletes the whp_sites_mee from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee the whp_sites_mee
	* @return the whp_sites_mee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee deletewhp_sites_mee(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.deletewhp_sites_mee(whp_sites_mee);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_meeLocalService.dynamicQuery();
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
		return _whp_sites_meeLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_meeLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _whp_sites_meeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_sites_meeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mee fetchwhp_sites_mee(
		long whp_sites_mee_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.fetchwhp_sites_mee(whp_sites_mee_id);
	}

	/**
	* Returns the whp_sites_mee with the primary key.
	*
	* @param whp_sites_mee_id the primary key of the whp_sites_mee
	* @return the whp_sites_mee
	* @throws PortalException if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee getwhp_sites_mee(
		long whp_sites_mee_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.getwhp_sites_mee(whp_sites_mee_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_mees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_mees
	* @param end the upper bound of the range of whp_sites_mees (not inclusive)
	* @return the range of whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.getwhp_sites_mees(start, end);
	}

	/**
	* Returns the number of whp_sites_mees.
	*
	* @return the number of whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_meesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.getwhp_sites_meesCount();
	}

	/**
	* Updates the whp_sites_mee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee the whp_sites_mee
	* @return the whp_sites_mee that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee updatewhp_sites_mee(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.updatewhp_sites_mee(whp_sites_mee);
	}

	/**
	* Updates the whp_sites_mee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee the whp_sites_mee
	* @param merge whether to merge the whp_sites_mee with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_mee that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mee updatewhp_sites_mee(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.updatewhp_sites_mee(whp_sites_mee,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_meeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_meeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_meeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mee addwhp_sites_mee(
		long siteid, java.lang.String doclink, java.util.Date date,
		long fileentryid, java.lang.String docName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_meeLocalService.addwhp_sites_mee(siteid, doclink,
			date, fileentryid, docName);
	}

	public com.iucn.whp.dbservice.model.whp_sites_mee removewhp_sites_mee(
		long fileentryid) {
		return _whp_sites_meeLocalService.removewhp_sites_mee(fileentryid);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_meeLocalService getWrappedwhp_sites_meeLocalService() {
		return _whp_sites_meeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_meeLocalService(
		whp_sites_meeLocalService whp_sites_meeLocalService) {
		_whp_sites_meeLocalService = whp_sites_meeLocalService;
	}

	public whp_sites_meeLocalService getWrappedService() {
		return _whp_sites_meeLocalService;
	}

	public void setWrappedService(
		whp_sites_meeLocalService whp_sites_meeLocalService) {
		_whp_sites_meeLocalService = whp_sites_meeLocalService;
	}

	private whp_sites_meeLocalService _whp_sites_meeLocalService;
}