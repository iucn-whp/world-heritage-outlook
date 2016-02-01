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

import com.iucn.whp.dbservice.model.current_state_trend_values;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the current_state_trend_values service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_state_trend_valuesPersistenceImpl
 * @see current_state_trend_valuesUtil
 * @generated
 */
public interface current_state_trend_valuesPersistence extends BasePersistence<current_state_trend_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link current_state_trend_valuesUtil} to access the current_state_trend_values persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the current_state_trend_values in the entity cache if it is enabled.
	*
	* @param current_state_trend_values the current_state_trend_values
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.current_state_trend_values current_state_trend_values);

	/**
	* Caches the current_state_trend_valueses in the entity cache if it is enabled.
	*
	* @param current_state_trend_valueses the current_state_trend_valueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> current_state_trend_valueses);

	/**
	* Creates a new current_state_trend_values with the primary key. Does not add the current_state_trend_values to the database.
	*
	* @param id the primary key for the new current_state_trend_values
	* @return the new current_state_trend_values
	*/
	public com.iucn.whp.dbservice.model.current_state_trend_values create(
		long id);

	/**
	* Removes the current_state_trend_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend_values remove(
		long id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.current_state_trend_values updateImpl(
		com.iucn.whp.dbservice.model.current_state_trend_values current_state_trend_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_state_trend_values with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException} if it could not be found.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend_values findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_state_trend_values with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values, or <code>null</code> if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend_values fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_state_trend_valueses.
	*
	* @return the current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_state_trend_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trend_valueses
	* @param end the upper bound of the range of current_state_trend_valueses (not inclusive)
	* @return the range of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_state_trend_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trend_valueses
	* @param end the upper bound of the range of current_state_trend_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_state_trend_valueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_state_trend_valueses.
	*
	* @return the number of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}