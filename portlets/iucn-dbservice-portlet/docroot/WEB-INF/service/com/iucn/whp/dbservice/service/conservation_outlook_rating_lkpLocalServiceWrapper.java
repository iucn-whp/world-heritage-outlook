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
 * This class is a wrapper for {@link conservation_outlook_rating_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       conservation_outlook_rating_lkpLocalService
 * @generated
 */
public class conservation_outlook_rating_lkpLocalServiceWrapper
	implements conservation_outlook_rating_lkpLocalService,
		ServiceWrapper<conservation_outlook_rating_lkpLocalService> {
	public conservation_outlook_rating_lkpLocalServiceWrapper(
		conservation_outlook_rating_lkpLocalService conservation_outlook_rating_lkpLocalService) {
		_conservation_outlook_rating_lkpLocalService = conservation_outlook_rating_lkpLocalService;
	}

	/**
	* Adds the conservation_outlook_rating_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_rating_lkp the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp addconservation_outlook_rating_lkp(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.addconservation_outlook_rating_lkp(conservation_outlook_rating_lkp);
	}

	/**
	* Creates a new conservation_outlook_rating_lkp with the primary key. Does not add the conservation_outlook_rating_lkp to the database.
	*
	* @param co_rating_id the primary key for the new conservation_outlook_rating_lkp
	* @return the new conservation_outlook_rating_lkp
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp createconservation_outlook_rating_lkp(
		long co_rating_id) {
		return _conservation_outlook_rating_lkpLocalService.createconservation_outlook_rating_lkp(co_rating_id);
	}

	/**
	* Deletes the conservation_outlook_rating_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param co_rating_id the primary key of the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp that was removed
	* @throws PortalException if a conservation_outlook_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp deleteconservation_outlook_rating_lkp(
		long co_rating_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.deleteconservation_outlook_rating_lkp(co_rating_id);
	}

	/**
	* Deletes the conservation_outlook_rating_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_rating_lkp the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp deleteconservation_outlook_rating_lkp(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.deleteconservation_outlook_rating_lkp(conservation_outlook_rating_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _conservation_outlook_rating_lkpLocalService.dynamicQuery();
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
		return _conservation_outlook_rating_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _conservation_outlook_rating_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _conservation_outlook_rating_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _conservation_outlook_rating_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp fetchconservation_outlook_rating_lkp(
		long co_rating_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.fetchconservation_outlook_rating_lkp(co_rating_id);
	}

	/**
	* Returns the conservation_outlook_rating_lkp with the primary key.
	*
	* @param co_rating_id the primary key of the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp
	* @throws PortalException if a conservation_outlook_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp getconservation_outlook_rating_lkp(
		long co_rating_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getconservation_outlook_rating_lkp(co_rating_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the conservation_outlook_rating_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlook_rating_lkps
	* @param end the upper bound of the range of conservation_outlook_rating_lkps (not inclusive)
	* @return the range of conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> getconservation_outlook_rating_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getconservation_outlook_rating_lkps(start,
			end);
	}

	/**
	* Returns the number of conservation_outlook_rating_lkps.
	*
	* @return the number of conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getconservation_outlook_rating_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getconservation_outlook_rating_lkpsCount();
	}

	/**
	* Updates the conservation_outlook_rating_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_rating_lkp the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp updateconservation_outlook_rating_lkp(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.updateconservation_outlook_rating_lkp(conservation_outlook_rating_lkp);
	}

	/**
	* Updates the conservation_outlook_rating_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_rating_lkp the conservation_outlook_rating_lkp
	* @param merge whether to merge the conservation_outlook_rating_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the conservation_outlook_rating_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp updateconservation_outlook_rating_lkp(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.updateconservation_outlook_rating_lkp(conservation_outlook_rating_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _conservation_outlook_rating_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_conservation_outlook_rating_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _conservation_outlook_rating_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp getRatingByConservation_outlookId(
		long ratingId)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getRatingByConservation_outlookId(ratingId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> getAllConservationRating()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conservation_outlook_rating_lkpLocalService.getAllConservationRating();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public conservation_outlook_rating_lkpLocalService getWrappedconservation_outlook_rating_lkpLocalService() {
		return _conservation_outlook_rating_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedconservation_outlook_rating_lkpLocalService(
		conservation_outlook_rating_lkpLocalService conservation_outlook_rating_lkpLocalService) {
		_conservation_outlook_rating_lkpLocalService = conservation_outlook_rating_lkpLocalService;
	}

	public conservation_outlook_rating_lkpLocalService getWrappedService() {
		return _conservation_outlook_rating_lkpLocalService;
	}

	public void setWrappedService(
		conservation_outlook_rating_lkpLocalService conservation_outlook_rating_lkpLocalService) {
		_conservation_outlook_rating_lkpLocalService = conservation_outlook_rating_lkpLocalService;
	}

	private conservation_outlook_rating_lkpLocalService _conservation_outlook_rating_lkpLocalService;
}