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
 * This class is a wrapper for {@link whp_sites_boundary_modificationLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_boundary_modificationLocalService
 * @generated
 */
public class whp_sites_boundary_modificationLocalServiceWrapper
	implements whp_sites_boundary_modificationLocalService,
		ServiceWrapper<whp_sites_boundary_modificationLocalService> {
	public whp_sites_boundary_modificationLocalServiceWrapper(
		whp_sites_boundary_modificationLocalService whp_sites_boundary_modificationLocalService) {
		_whp_sites_boundary_modificationLocalService = whp_sites_boundary_modificationLocalService;
	}

	/**
	* Adds the whp_sites_boundary_modification to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_boundary_modification the whp_sites_boundary_modification
	* @return the whp_sites_boundary_modification that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification addwhp_sites_boundary_modification(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.addwhp_sites_boundary_modification(whp_sites_boundary_modification);
	}

	/**
	* Creates a new whp_sites_boundary_modification with the primary key. Does not add the whp_sites_boundary_modification to the database.
	*
	* @param whp_sites_boundary_modification_id the primary key for the new whp_sites_boundary_modification
	* @return the new whp_sites_boundary_modification
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification createwhp_sites_boundary_modification(
		long whp_sites_boundary_modification_id) {
		return _whp_sites_boundary_modificationLocalService.createwhp_sites_boundary_modification(whp_sites_boundary_modification_id);
	}

	/**
	* Deletes the whp_sites_boundary_modification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_boundary_modification_id the primary key of the whp_sites_boundary_modification
	* @return the whp_sites_boundary_modification that was removed
	* @throws PortalException if a whp_sites_boundary_modification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification deletewhp_sites_boundary_modification(
		long whp_sites_boundary_modification_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.deletewhp_sites_boundary_modification(whp_sites_boundary_modification_id);
	}

	/**
	* Deletes the whp_sites_boundary_modification from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_boundary_modification the whp_sites_boundary_modification
	* @return the whp_sites_boundary_modification that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification deletewhp_sites_boundary_modification(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.deletewhp_sites_boundary_modification(whp_sites_boundary_modification);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_boundary_modificationLocalService.dynamicQuery();
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
		return _whp_sites_boundary_modificationLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_boundary_modificationLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_boundary_modificationLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_boundary_modificationLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification fetchwhp_sites_boundary_modification(
		long whp_sites_boundary_modification_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.fetchwhp_sites_boundary_modification(whp_sites_boundary_modification_id);
	}

	/**
	* Returns the whp_sites_boundary_modification with the primary key.
	*
	* @param whp_sites_boundary_modification_id the primary key of the whp_sites_boundary_modification
	* @return the whp_sites_boundary_modification
	* @throws PortalException if a whp_sites_boundary_modification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification getwhp_sites_boundary_modification(
		long whp_sites_boundary_modification_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.getwhp_sites_boundary_modification(whp_sites_boundary_modification_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_boundary_modifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_boundary_modifications
	* @param end the upper bound of the range of whp_sites_boundary_modifications (not inclusive)
	* @return the range of whp_sites_boundary_modifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.getwhp_sites_boundary_modifications(start,
			end);
	}

	/**
	* Returns the number of whp_sites_boundary_modifications.
	*
	* @return the number of whp_sites_boundary_modifications
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_boundary_modificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.getwhp_sites_boundary_modificationsCount();
	}

	/**
	* Updates the whp_sites_boundary_modification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_boundary_modification the whp_sites_boundary_modification
	* @return the whp_sites_boundary_modification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification updatewhp_sites_boundary_modification(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.updatewhp_sites_boundary_modification(whp_sites_boundary_modification);
	}

	/**
	* Updates the whp_sites_boundary_modification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_boundary_modification the whp_sites_boundary_modification
	* @param merge whether to merge the whp_sites_boundary_modification with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_boundary_modification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_boundary_modification updatewhp_sites_boundary_modification(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_boundary_modificationLocalService.updatewhp_sites_boundary_modification(whp_sites_boundary_modification,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_boundary_modificationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_boundary_modificationLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_boundary_modificationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_boundary_modificationLocalService getWrappedwhp_sites_boundary_modificationLocalService() {
		return _whp_sites_boundary_modificationLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_boundary_modificationLocalService(
		whp_sites_boundary_modificationLocalService whp_sites_boundary_modificationLocalService) {
		_whp_sites_boundary_modificationLocalService = whp_sites_boundary_modificationLocalService;
	}

	public whp_sites_boundary_modificationLocalService getWrappedService() {
		return _whp_sites_boundary_modificationLocalService;
	}

	public void setWrappedService(
		whp_sites_boundary_modificationLocalService whp_sites_boundary_modificationLocalService) {
		_whp_sites_boundary_modificationLocalService = whp_sites_boundary_modificationLocalService;
	}

	private whp_sites_boundary_modificationLocalService _whp_sites_boundary_modificationLocalService;
}