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
 * This class is a wrapper for {@link conservation_outlookLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       conservation_outlookLocalService
 * @generated
 */
public class conservation_outlookLocalServiceWrapper
	implements conservation_outlookLocalService,
		ServiceWrapper<conservation_outlookLocalService> {
	public conservation_outlookLocalServiceWrapper(
		conservation_outlookLocalService conservation_outlookLocalService) {
		_conservation_outlookLocalService = conservation_outlookLocalService;
	}

	/**
	* Adds the conservation_outlook to the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook addconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.addconservation_outlook(conservation_outlook);
	}

	/**
	* Creates a new conservation_outlook with the primary key. Does not add the conservation_outlook to the database.
	*
	* @param conservation_outlook_id the primary key for the new conservation_outlook
	* @return the new conservation_outlook
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook createconservation_outlook(
		long conservation_outlook_id) {
		return _conservation_outlookLocalService.createconservation_outlook(conservation_outlook_id);
	}

	/**
	* Deletes the conservation_outlook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook that was removed
	* @throws PortalException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook deleteconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.deleteconservation_outlook(conservation_outlook_id);
	}

	/**
	* Deletes the conservation_outlook from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook deleteconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.deleteconservation_outlook(conservation_outlook);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _conservation_outlookLocalService.dynamicQuery();
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
		return _conservation_outlookLocalService.dynamicQuery(dynamicQuery);
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
		return _conservation_outlookLocalService.dynamicQuery(dynamicQuery,
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
		return _conservation_outlookLocalService.dynamicQuery(dynamicQuery,
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
		return _conservation_outlookLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.conservation_outlook fetchconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.fetchconservation_outlook(conservation_outlook_id);
	}

	/**
	* Returns the conservation_outlook with the primary key.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook
	* @throws PortalException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook getconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getconservation_outlook(conservation_outlook_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the conservation_outlooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @return the range of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getconservation_outlooks(start,
			end);
	}

	/**
	* Returns the number of conservation_outlooks.
	*
	* @return the number of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public int getconservation_outlooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getconservation_outlooksCount();
	}

	/**
	* Updates the conservation_outlook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook updateconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.updateconservation_outlook(conservation_outlook);
	}

	/**
	* Updates the conservation_outlook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @param merge whether to merge the conservation_outlook with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the conservation_outlook that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook updateconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.updateconservation_outlook(conservation_outlook,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _conservation_outlookLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_conservation_outlookLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _conservation_outlookLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservationOutllokByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getconservationOutllokByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> getconservationoutlookrating()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getconservationoutlookrating();
	}

	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getAllConservationOutlook()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlookLocalService.getAllConservationOutlook();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public conservation_outlookLocalService getWrappedconservation_outlookLocalService() {
		return _conservation_outlookLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedconservation_outlookLocalService(
		conservation_outlookLocalService conservation_outlookLocalService) {
		_conservation_outlookLocalService = conservation_outlookLocalService;
	}

	public conservation_outlookLocalService getWrappedService() {
		return _conservation_outlookLocalService;
	}

	public void setWrappedService(
		conservation_outlookLocalService conservation_outlookLocalService) {
		_conservation_outlookLocalService = conservation_outlookLocalService;
	}

	private conservation_outlookLocalService _conservation_outlookLocalService;
}