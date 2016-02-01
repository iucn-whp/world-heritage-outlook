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
 * This class is a wrapper for {@link whp_criteria_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_criteria_lkpLocalService
 * @generated
 */
public class whp_criteria_lkpLocalServiceWrapper
	implements whp_criteria_lkpLocalService,
		ServiceWrapper<whp_criteria_lkpLocalService> {
	public whp_criteria_lkpLocalServiceWrapper(
		whp_criteria_lkpLocalService whp_criteria_lkpLocalService) {
		_whp_criteria_lkpLocalService = whp_criteria_lkpLocalService;
	}

	/**
	* Adds the whp_criteria_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_criteria_lkp the whp_criteria_lkp
	* @return the whp_criteria_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp addwhp_criteria_lkp(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.addwhp_criteria_lkp(whp_criteria_lkp);
	}

	/**
	* Creates a new whp_criteria_lkp with the primary key. Does not add the whp_criteria_lkp to the database.
	*
	* @param id the primary key for the new whp_criteria_lkp
	* @return the new whp_criteria_lkp
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp createwhp_criteria_lkp(
		long id) {
		return _whp_criteria_lkpLocalService.createwhp_criteria_lkp(id);
	}

	/**
	* Deletes the whp_criteria_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the whp_criteria_lkp
	* @return the whp_criteria_lkp that was removed
	* @throws PortalException if a whp_criteria_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp deletewhp_criteria_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.deletewhp_criteria_lkp(id);
	}

	/**
	* Deletes the whp_criteria_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_criteria_lkp the whp_criteria_lkp
	* @return the whp_criteria_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp deletewhp_criteria_lkp(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.deletewhp_criteria_lkp(whp_criteria_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_criteria_lkpLocalService.dynamicQuery();
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
		return _whp_criteria_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_criteria_lkpLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_criteria_lkpLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_criteria_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_criteria_lkp fetchwhp_criteria_lkp(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.fetchwhp_criteria_lkp(id);
	}

	/**
	* Returns the whp_criteria_lkp with the primary key.
	*
	* @param id the primary key of the whp_criteria_lkp
	* @return the whp_criteria_lkp
	* @throws PortalException if a whp_criteria_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp getwhp_criteria_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.getwhp_criteria_lkp(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_criteria_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_criteria_lkps
	* @param end the upper bound of the range of whp_criteria_lkps (not inclusive)
	* @return the range of whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_criteria_lkp> getwhp_criteria_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.getwhp_criteria_lkps(start, end);
	}

	/**
	* Returns the number of whp_criteria_lkps.
	*
	* @return the number of whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_criteria_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.getwhp_criteria_lkpsCount();
	}

	/**
	* Updates the whp_criteria_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_criteria_lkp the whp_criteria_lkp
	* @return the whp_criteria_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp updatewhp_criteria_lkp(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.updatewhp_criteria_lkp(whp_criteria_lkp);
	}

	/**
	* Updates the whp_criteria_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_criteria_lkp the whp_criteria_lkp
	* @param merge whether to merge the whp_criteria_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_criteria_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp updatewhp_criteria_lkp(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_criteria_lkpLocalService.updatewhp_criteria_lkp(whp_criteria_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_criteria_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_criteria_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_criteria_lkpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_criteria_lkpLocalService getWrappedwhp_criteria_lkpLocalService() {
		return _whp_criteria_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_criteria_lkpLocalService(
		whp_criteria_lkpLocalService whp_criteria_lkpLocalService) {
		_whp_criteria_lkpLocalService = whp_criteria_lkpLocalService;
	}

	public whp_criteria_lkpLocalService getWrappedService() {
		return _whp_criteria_lkpLocalService;
	}

	public void setWrappedService(
		whp_criteria_lkpLocalService whp_criteria_lkpLocalService) {
		_whp_criteria_lkpLocalService = whp_criteria_lkpLocalService;
	}

	private whp_criteria_lkpLocalService _whp_criteria_lkpLocalService;
}