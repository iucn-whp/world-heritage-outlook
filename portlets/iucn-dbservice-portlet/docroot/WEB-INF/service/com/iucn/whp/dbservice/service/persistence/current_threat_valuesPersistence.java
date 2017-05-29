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

import com.iucn.whp.dbservice.model.current_threat_values;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the current_threat_values service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_threat_valuesPersistenceImpl
 * @see current_threat_valuesUtil
 * @generated
 */
public interface current_threat_valuesPersistence extends BasePersistence<current_threat_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link current_threat_valuesUtil} to access the current_threat_values persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the current_threat_values in the entity cache if it is enabled.
	*
	* @param current_threat_values the current_threat_values
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values);

	/**
	* Caches the current_threat_valueses in the entity cache if it is enabled.
	*
	* @param current_threat_valueses the current_threat_valueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_threat_values> current_threat_valueses);

	/**
	* Creates a new current_threat_values with the primary key. Does not add the current_threat_values to the database.
	*
	* @param current_threat_values_id the primary key for the new current_threat_values
	* @return the new current_threat_values
	*/
	public com.iucn.whp.dbservice.model.current_threat_values create(
		long current_threat_values_id);

	/**
	* Removes the current_threat_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values_id the primary key of the current_threat_values
	* @return the current_threat_values that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values remove(
		long current_threat_values_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.current_threat_values updateImpl(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_values with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException} if it could not be found.
	*
	* @param current_threat_values_id the primary key of the current_threat_values
	* @return the current_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values findByPrimaryKey(
		long current_threat_values_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_values with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param current_threat_values_id the primary key of the current_threat_values
	* @return the current_threat_values, or <code>null</code> if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values fetchByPrimaryKey(
		long current_threat_values_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_threat_valueses where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the matching current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findBycurrent_threat_id(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_threat_valueses where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_valueses
	* @param end the upper bound of the range of current_threat_valueses (not inclusive)
	* @return the range of matching current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findBycurrent_threat_id(
		long current_threat_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_threat_valueses where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_valueses
	* @param end the upper bound of the range of current_threat_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findBycurrent_threat_id(
		long current_threat_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_values in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException if a matching current_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values findBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_values in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_values, or <code>null</code> if a matching current_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values fetchBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_values in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException if a matching current_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values findBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_values in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_values, or <code>null</code> if a matching current_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values fetchBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_valueses before and after the current current_threat_values in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_values_id the primary key of the current current_threat_values
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_values[] findBycurrent_threat_id_PrevAndNext(
		long current_threat_values_id, long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_threat_valueses.
	*
	* @return the current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_threat_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_valueses
	* @param end the upper bound of the range of current_threat_valueses (not inclusive)
	* @return the range of current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_threat_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_valueses
	* @param end the upper bound of the range of current_threat_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_threat_valueses where current_threat_id = &#63; from the database.
	*
	* @param current_threat_id the current_threat_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_threat_valueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_threat_valueses where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the number of matching current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_threat_valueses.
	*
	* @return the number of current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}