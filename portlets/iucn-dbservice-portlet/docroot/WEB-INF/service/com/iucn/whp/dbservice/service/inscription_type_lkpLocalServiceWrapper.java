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
 * This class is a wrapper for {@link inscription_type_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       inscription_type_lkpLocalService
 * @generated
 */
public class inscription_type_lkpLocalServiceWrapper
	implements inscription_type_lkpLocalService,
		ServiceWrapper<inscription_type_lkpLocalService> {
	public inscription_type_lkpLocalServiceWrapper(
		inscription_type_lkpLocalService inscription_type_lkpLocalService) {
		_inscription_type_lkpLocalService = inscription_type_lkpLocalService;
	}

	/**
	* Adds the inscription_type_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param inscription_type_lkp the inscription_type_lkp
	* @return the inscription_type_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp addinscription_type_lkp(
		com.iucn.whp.dbservice.model.inscription_type_lkp inscription_type_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.addinscription_type_lkp(inscription_type_lkp);
	}

	/**
	* Creates a new inscription_type_lkp with the primary key. Does not add the inscription_type_lkp to the database.
	*
	* @param incription_type_id the primary key for the new inscription_type_lkp
	* @return the new inscription_type_lkp
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp createinscription_type_lkp(
		int incription_type_id) {
		return _inscription_type_lkpLocalService.createinscription_type_lkp(incription_type_id);
	}

	/**
	* Deletes the inscription_type_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param incription_type_id the primary key of the inscription_type_lkp
	* @return the inscription_type_lkp that was removed
	* @throws PortalException if a inscription_type_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp deleteinscription_type_lkp(
		int incription_type_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.deleteinscription_type_lkp(incription_type_id);
	}

	/**
	* Deletes the inscription_type_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param inscription_type_lkp the inscription_type_lkp
	* @return the inscription_type_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp deleteinscription_type_lkp(
		com.iucn.whp.dbservice.model.inscription_type_lkp inscription_type_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.deleteinscription_type_lkp(inscription_type_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inscription_type_lkpLocalService.dynamicQuery();
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
		return _inscription_type_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _inscription_type_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _inscription_type_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _inscription_type_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.inscription_type_lkp fetchinscription_type_lkp(
		int incription_type_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.fetchinscription_type_lkp(incription_type_id);
	}

	/**
	* Returns the inscription_type_lkp with the primary key.
	*
	* @param incription_type_id the primary key of the inscription_type_lkp
	* @return the inscription_type_lkp
	* @throws PortalException if a inscription_type_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp getinscription_type_lkp(
		int incription_type_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.getinscription_type_lkp(incription_type_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the inscription_type_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of inscription_type_lkps
	* @param end the upper bound of the range of inscription_type_lkps (not inclusive)
	* @return the range of inscription_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.inscription_type_lkp> getinscription_type_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.getinscription_type_lkps(start,
			end);
	}

	/**
	* Returns the number of inscription_type_lkps.
	*
	* @return the number of inscription_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getinscription_type_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.getinscription_type_lkpsCount();
	}

	/**
	* Updates the inscription_type_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inscription_type_lkp the inscription_type_lkp
	* @return the inscription_type_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp updateinscription_type_lkp(
		com.iucn.whp.dbservice.model.inscription_type_lkp inscription_type_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.updateinscription_type_lkp(inscription_type_lkp);
	}

	/**
	* Updates the inscription_type_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inscription_type_lkp the inscription_type_lkp
	* @param merge whether to merge the inscription_type_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the inscription_type_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.inscription_type_lkp updateinscription_type_lkp(
		com.iucn.whp.dbservice.model.inscription_type_lkp inscription_type_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.updateinscription_type_lkp(inscription_type_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _inscription_type_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inscription_type_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inscription_type_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* GET All Inscription Type
	*/
	public java.util.List<com.iucn.whp.dbservice.model.inscription_type_lkp> getAllInscriptionType()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inscription_type_lkpLocalService.getAllInscriptionType();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public inscription_type_lkpLocalService getWrappedinscription_type_lkpLocalService() {
		return _inscription_type_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedinscription_type_lkpLocalService(
		inscription_type_lkpLocalService inscription_type_lkpLocalService) {
		_inscription_type_lkpLocalService = inscription_type_lkpLocalService;
	}

	public inscription_type_lkpLocalService getWrappedService() {
		return _inscription_type_lkpLocalService;
	}

	public void setWrappedService(
		inscription_type_lkpLocalService inscription_type_lkpLocalService) {
		_inscription_type_lkpLocalService = inscription_type_lkpLocalService;
	}

	private inscription_type_lkpLocalService _inscription_type_lkpLocalService;
}