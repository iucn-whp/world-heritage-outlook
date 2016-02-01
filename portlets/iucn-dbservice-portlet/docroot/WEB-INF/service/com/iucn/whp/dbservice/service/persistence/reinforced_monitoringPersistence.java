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

package com.iucn.whp.dbservice.service.persistence;

import com.iucn.whp.dbservice.model.reinforced_monitoring;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the reinforced_monitoring service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringPersistenceImpl
 * @see reinforced_monitoringUtil
 * @generated
 */
public interface reinforced_monitoringPersistence extends BasePersistence<reinforced_monitoring> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link reinforced_monitoringUtil} to access the reinforced_monitoring persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the reinforced_monitoring in the entity cache if it is enabled.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring);

	/**
	* Caches the reinforced_monitorings in the entity cache if it is enabled.
	*
	* @param reinforced_monitorings the reinforced_monitorings
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> reinforced_monitorings);

	/**
	* Creates a new reinforced_monitoring with the primary key. Does not add the reinforced_monitoring to the database.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key for the new reinforced_monitoring
	* @return the new reinforced_monitoring
	*/
	public com.iucn.whp.dbservice.model.reinforced_monitoring create(
		long whp_sites_reinforced_monitoring_id);

	/**
	* Removes the reinforced_monitoring with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring that was removed
	* @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.reinforced_monitoring remove(
		long whp_sites_reinforced_monitoring_id)
		throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.reinforced_monitoring updateImpl(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the reinforced_monitoring with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchreinforced_monitoringException} if it could not be found.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring
	* @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.reinforced_monitoring findByPrimaryKey(
		long whp_sites_reinforced_monitoring_id)
		throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the reinforced_monitoring with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring, or <code>null</code> if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.reinforced_monitoring fetchByPrimaryKey(
		long whp_sites_reinforced_monitoring_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the reinforced_monitorings.
	*
	* @return the reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the reinforced_monitorings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of reinforced_monitorings
	* @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	* @return the range of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the reinforced_monitorings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of reinforced_monitorings
	* @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the reinforced_monitorings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of reinforced_monitorings.
	*
	* @return the number of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}