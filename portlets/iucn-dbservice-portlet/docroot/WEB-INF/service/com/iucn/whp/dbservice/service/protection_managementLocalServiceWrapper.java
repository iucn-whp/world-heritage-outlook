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
 * This class is a wrapper for {@link protection_managementLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       protection_managementLocalService
 * @generated
 */
public class protection_managementLocalServiceWrapper
	implements protection_managementLocalService,
		ServiceWrapper<protection_managementLocalService> {
	public protection_managementLocalServiceWrapper(
		protection_managementLocalService protection_managementLocalService) {
		_protection_managementLocalService = protection_managementLocalService;
	}

	/**
	* Adds the protection_management to the database. Also notifies the appropriate model listeners.
	*
	* @param protection_management the protection_management
	* @return the protection_management that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management addprotection_management(
		com.iucn.whp.dbservice.model.protection_management protection_management)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.addprotection_management(protection_management);
	}

	/**
	* Creates a new protection_management with the primary key. Does not add the protection_management to the database.
	*
	* @param pm_id the primary key for the new protection_management
	* @return the new protection_management
	*/
	public com.iucn.whp.dbservice.model.protection_management createprotection_management(
		long pm_id) {
		return _protection_managementLocalService.createprotection_management(pm_id);
	}

	/**
	* Deletes the protection_management with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pm_id the primary key of the protection_management
	* @return the protection_management that was removed
	* @throws PortalException if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management deleteprotection_management(
		long pm_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.deleteprotection_management(pm_id);
	}

	/**
	* Deletes the protection_management from the database. Also notifies the appropriate model listeners.
	*
	* @param protection_management the protection_management
	* @return the protection_management that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management deleteprotection_management(
		com.iucn.whp.dbservice.model.protection_management protection_management)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.deleteprotection_management(protection_management);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protection_managementLocalService.dynamicQuery();
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
		return _protection_managementLocalService.dynamicQuery(dynamicQuery);
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
		return _protection_managementLocalService.dynamicQuery(dynamicQuery,
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
		return _protection_managementLocalService.dynamicQuery(dynamicQuery,
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
		return _protection_managementLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.protection_management fetchprotection_management(
		long pm_id) throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.fetchprotection_management(pm_id);
	}

	/**
	* Returns the protection_management with the primary key.
	*
	* @param pm_id the primary key of the protection_management
	* @return the protection_management
	* @throws PortalException if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management getprotection_management(
		long pm_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.getprotection_management(pm_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the protection_managements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_managements
	* @param end the upper bound of the range of protection_managements (not inclusive)
	* @return the range of protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.getprotection_managements(start,
			end);
	}

	/**
	* Returns the number of protection_managements.
	*
	* @return the number of protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public int getprotection_managementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.getprotection_managementsCount();
	}

	/**
	* Updates the protection_management in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protection_management the protection_management
	* @return the protection_management that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management updateprotection_management(
		com.iucn.whp.dbservice.model.protection_management protection_management)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.updateprotection_management(protection_management);
	}

	/**
	* Updates the protection_management in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protection_management the protection_management
	* @param merge whether to merge the protection_management with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the protection_management that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management updateprotection_management(
		com.iucn.whp.dbservice.model.protection_management protection_management,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.updateprotection_management(protection_management,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _protection_managementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_protection_managementLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _protection_managementLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findByAssessementVersionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_managementLocalService.findByAssessementVersionId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public protection_managementLocalService getWrappedprotection_managementLocalService() {
		return _protection_managementLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedprotection_managementLocalService(
		protection_managementLocalService protection_managementLocalService) {
		_protection_managementLocalService = protection_managementLocalService;
	}

	public protection_managementLocalService getWrappedService() {
		return _protection_managementLocalService;
	}

	public void setWrappedService(
		protection_managementLocalService protection_managementLocalService) {
		_protection_managementLocalService = protection_managementLocalService;
	}

	private protection_managementLocalService _protection_managementLocalService;
}