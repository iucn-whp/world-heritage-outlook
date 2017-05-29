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

import com.iucn.whp.dbservice.model.whp_sites_inscription_date;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_inscription_date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_inscription_datePersistenceImpl
 * @see whp_sites_inscription_dateUtil
 * @generated
 */
public interface whp_sites_inscription_datePersistence extends BasePersistence<whp_sites_inscription_date> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_inscription_dateUtil} to access the whp_sites_inscription_date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_inscription_date in the entity cache if it is enabled.
	*
	* @param whp_sites_inscription_date the whp_sites_inscription_date
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_inscription_date whp_sites_inscription_date);

	/**
	* Caches the whp_sites_inscription_dates in the entity cache if it is enabled.
	*
	* @param whp_sites_inscription_dates the whp_sites_inscription_dates
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> whp_sites_inscription_dates);

	/**
	* Creates a new whp_sites_inscription_date with the primary key. Does not add the whp_sites_inscription_date to the database.
	*
	* @param whp_sites_inscription_date_id the primary key for the new whp_sites_inscription_date
	* @return the new whp_sites_inscription_date
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date create(
		long whp_sites_inscription_date_id);

	/**
	* Removes the whp_sites_inscription_date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_inscription_date_id the primary key of the whp_sites_inscription_date
	* @return the whp_sites_inscription_date that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException if a whp_sites_inscription_date with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date remove(
		long whp_sites_inscription_date_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_inscription_date updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_inscription_date whp_sites_inscription_date,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_inscription_date with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException} if it could not be found.
	*
	* @param whp_sites_inscription_date_id the primary key of the whp_sites_inscription_date
	* @return the whp_sites_inscription_date
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException if a whp_sites_inscription_date with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date findByPrimaryKey(
		long whp_sites_inscription_date_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_inscription_date with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_inscription_date_id the primary key of the whp_sites_inscription_date
	* @return the whp_sites_inscription_date, or <code>null</code> if a whp_sites_inscription_date with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date fetchByPrimaryKey(
		long whp_sites_inscription_date_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_inscription_date where inscription_type_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException} if it could not be found.
	*
	* @param inscription_type_id the inscription_type_id
	* @return the matching whp_sites_inscription_date
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException if a matching whp_sites_inscription_date could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date findByinscriptiontype(
		int inscription_type_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_inscription_date where inscription_type_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inscription_type_id the inscription_type_id
	* @return the matching whp_sites_inscription_date, or <code>null</code> if a matching whp_sites_inscription_date could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date fetchByinscriptiontype(
		int inscription_type_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_inscription_date where inscription_type_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inscription_type_id the inscription_type_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_inscription_date, or <code>null</code> if a matching whp_sites_inscription_date could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date fetchByinscriptiontype(
		int inscription_type_id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_inscription_dates.
	*
	* @return the whp_sites_inscription_dates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_inscription_dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_inscription_dates
	* @param end the upper bound of the range of whp_sites_inscription_dates (not inclusive)
	* @return the range of whp_sites_inscription_dates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_inscription_dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_inscription_dates
	* @param end the upper bound of the range of whp_sites_inscription_dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_inscription_dates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_inscription_date where inscription_type_id = &#63; from the database.
	*
	* @param inscription_type_id the inscription_type_id
	* @return the whp_sites_inscription_date that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_inscription_date removeByinscriptiontype(
		int inscription_type_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_dateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_inscription_dates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_inscription_dates where inscription_type_id = &#63;.
	*
	* @param inscription_type_id the inscription_type_id
	* @return the number of matching whp_sites_inscription_dates
	* @throws SystemException if a system exception occurred
	*/
	public int countByinscriptiontype(int inscription_type_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_inscription_dates.
	*
	* @return the number of whp_sites_inscription_dates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}