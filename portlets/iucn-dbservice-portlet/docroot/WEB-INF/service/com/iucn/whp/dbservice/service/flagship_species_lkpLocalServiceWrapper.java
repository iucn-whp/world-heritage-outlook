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
 * This class is a wrapper for {@link flagship_species_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       flagship_species_lkpLocalService
 * @generated
 */
public class flagship_species_lkpLocalServiceWrapper
	implements flagship_species_lkpLocalService,
		ServiceWrapper<flagship_species_lkpLocalService> {
	public flagship_species_lkpLocalServiceWrapper(
		flagship_species_lkpLocalService flagship_species_lkpLocalService) {
		_flagship_species_lkpLocalService = flagship_species_lkpLocalService;
	}

	/**
	* Adds the flagship_species_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param flagship_species_lkp the flagship_species_lkp
	* @return the flagship_species_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp addflagship_species_lkp(
		com.iucn.whp.dbservice.model.flagship_species_lkp flagship_species_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.addflagship_species_lkp(flagship_species_lkp);
	}

	/**
	* Creates a new flagship_species_lkp with the primary key. Does not add the flagship_species_lkp to the database.
	*
	* @param flagship_species_id the primary key for the new flagship_species_lkp
	* @return the new flagship_species_lkp
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp createflagship_species_lkp(
		int flagship_species_id) {
		return _flagship_species_lkpLocalService.createflagship_species_lkp(flagship_species_id);
	}

	/**
	* Deletes the flagship_species_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param flagship_species_id the primary key of the flagship_species_lkp
	* @return the flagship_species_lkp that was removed
	* @throws PortalException if a flagship_species_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp deleteflagship_species_lkp(
		int flagship_species_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.deleteflagship_species_lkp(flagship_species_id);
	}

	/**
	* Deletes the flagship_species_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param flagship_species_lkp the flagship_species_lkp
	* @return the flagship_species_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp deleteflagship_species_lkp(
		com.iucn.whp.dbservice.model.flagship_species_lkp flagship_species_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.deleteflagship_species_lkp(flagship_species_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _flagship_species_lkpLocalService.dynamicQuery();
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
		return _flagship_species_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _flagship_species_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _flagship_species_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _flagship_species_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.flagship_species_lkp fetchflagship_species_lkp(
		int flagship_species_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.fetchflagship_species_lkp(flagship_species_id);
	}

	/**
	* Returns the flagship_species_lkp with the primary key.
	*
	* @param flagship_species_id the primary key of the flagship_species_lkp
	* @return the flagship_species_lkp
	* @throws PortalException if a flagship_species_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp getflagship_species_lkp(
		int flagship_species_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.getflagship_species_lkp(flagship_species_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the flagship_species_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flagship_species_lkps
	* @param end the upper bound of the range of flagship_species_lkps (not inclusive)
	* @return the range of flagship_species_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.flagship_species_lkp> getflagship_species_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.getflagship_species_lkps(start,
			end);
	}

	/**
	* Returns the number of flagship_species_lkps.
	*
	* @return the number of flagship_species_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getflagship_species_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.getflagship_species_lkpsCount();
	}

	/**
	* Updates the flagship_species_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flagship_species_lkp the flagship_species_lkp
	* @return the flagship_species_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp updateflagship_species_lkp(
		com.iucn.whp.dbservice.model.flagship_species_lkp flagship_species_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.updateflagship_species_lkp(flagship_species_lkp);
	}

	/**
	* Updates the flagship_species_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flagship_species_lkp the flagship_species_lkp
	* @param merge whether to merge the flagship_species_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the flagship_species_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.flagship_species_lkp updateflagship_species_lkp(
		com.iucn.whp.dbservice.model.flagship_species_lkp flagship_species_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.updateflagship_species_lkp(flagship_species_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _flagship_species_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_flagship_species_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _flagship_species_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.flagship_species_lkp> getAllFlagshipSpecies()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flagship_species_lkpLocalService.getAllFlagshipSpecies();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public flagship_species_lkpLocalService getWrappedflagship_species_lkpLocalService() {
		return _flagship_species_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedflagship_species_lkpLocalService(
		flagship_species_lkpLocalService flagship_species_lkpLocalService) {
		_flagship_species_lkpLocalService = flagship_species_lkpLocalService;
	}

	public flagship_species_lkpLocalService getWrappedService() {
		return _flagship_species_lkpLocalService;
	}

	public void setWrappedService(
		flagship_species_lkpLocalService flagship_species_lkpLocalService) {
		_flagship_species_lkpLocalService = flagship_species_lkpLocalService;
	}

	private flagship_species_lkpLocalService _flagship_species_lkpLocalService;
}