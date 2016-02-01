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
 * This class is a wrapper for {@link protection_mgmt_checklist_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       protection_mgmt_checklist_lkpLocalService
 * @generated
 */
public class protection_mgmt_checklist_lkpLocalServiceWrapper
	implements protection_mgmt_checklist_lkpLocalService,
		ServiceWrapper<protection_mgmt_checklist_lkpLocalService> {
	public protection_mgmt_checklist_lkpLocalServiceWrapper(
		protection_mgmt_checklist_lkpLocalService protection_mgmt_checklist_lkpLocalService) {
		_protection_mgmt_checklist_lkpLocalService = protection_mgmt_checklist_lkpLocalService;
	}

	/**
	* Adds the protection_mgmt_checklist_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param protection_mgmt_checklist_lkp the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp addprotection_mgmt_checklist_lkp(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.addprotection_mgmt_checklist_lkp(protection_mgmt_checklist_lkp);
	}

	/**
	* Creates a new protection_mgmt_checklist_lkp with the primary key. Does not add the protection_mgmt_checklist_lkp to the database.
	*
	* @param topic_id the primary key for the new protection_mgmt_checklist_lkp
	* @return the new protection_mgmt_checklist_lkp
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp createprotection_mgmt_checklist_lkp(
		long topic_id) {
		return _protection_mgmt_checklist_lkpLocalService.createprotection_mgmt_checklist_lkp(topic_id);
	}

	/**
	* Deletes the protection_mgmt_checklist_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topic_id the primary key of the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp that was removed
	* @throws PortalException if a protection_mgmt_checklist_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp deleteprotection_mgmt_checklist_lkp(
		long topic_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.deleteprotection_mgmt_checklist_lkp(topic_id);
	}

	/**
	* Deletes the protection_mgmt_checklist_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param protection_mgmt_checklist_lkp the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp deleteprotection_mgmt_checklist_lkp(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.deleteprotection_mgmt_checklist_lkp(protection_mgmt_checklist_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protection_mgmt_checklist_lkpLocalService.dynamicQuery();
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
		return _protection_mgmt_checklist_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _protection_mgmt_checklist_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _protection_mgmt_checklist_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _protection_mgmt_checklist_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp fetchprotection_mgmt_checklist_lkp(
		long topic_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.fetchprotection_mgmt_checklist_lkp(topic_id);
	}

	/**
	* Returns the protection_mgmt_checklist_lkp with the primary key.
	*
	* @param topic_id the primary key of the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp
	* @throws PortalException if a protection_mgmt_checklist_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp getprotection_mgmt_checklist_lkp(
		long topic_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.getprotection_mgmt_checklist_lkp(topic_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the protection_mgmt_checklist_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_mgmt_checklist_lkps
	* @param end the upper bound of the range of protection_mgmt_checklist_lkps (not inclusive)
	* @return the range of protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> getprotection_mgmt_checklist_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.getprotection_mgmt_checklist_lkps(start,
			end);
	}

	/**
	* Returns the number of protection_mgmt_checklist_lkps.
	*
	* @return the number of protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getprotection_mgmt_checklist_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.getprotection_mgmt_checklist_lkpsCount();
	}

	/**
	* Updates the protection_mgmt_checklist_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protection_mgmt_checklist_lkp the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp updateprotection_mgmt_checklist_lkp(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.updateprotection_mgmt_checklist_lkp(protection_mgmt_checklist_lkp);
	}

	/**
	* Updates the protection_mgmt_checklist_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protection_mgmt_checklist_lkp the protection_mgmt_checklist_lkp
	* @param merge whether to merge the protection_mgmt_checklist_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the protection_mgmt_checklist_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp updateprotection_mgmt_checklist_lkp(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.updateprotection_mgmt_checklist_lkp(protection_mgmt_checklist_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _protection_mgmt_checklist_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_protection_mgmt_checklist_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _protection_mgmt_checklist_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _protection_mgmt_checklist_lkpLocalService.findAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public protection_mgmt_checklist_lkpLocalService getWrappedprotection_mgmt_checklist_lkpLocalService() {
		return _protection_mgmt_checklist_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedprotection_mgmt_checklist_lkpLocalService(
		protection_mgmt_checklist_lkpLocalService protection_mgmt_checklist_lkpLocalService) {
		_protection_mgmt_checklist_lkpLocalService = protection_mgmt_checklist_lkpLocalService;
	}

	public protection_mgmt_checklist_lkpLocalService getWrappedService() {
		return _protection_mgmt_checklist_lkpLocalService;
	}

	public void setWrappedService(
		protection_mgmt_checklist_lkpLocalService protection_mgmt_checklist_lkpLocalService) {
		_protection_mgmt_checklist_lkpLocalService = protection_mgmt_checklist_lkpLocalService;
	}

	private protection_mgmt_checklist_lkpLocalService _protection_mgmt_checklist_lkpLocalService;
}