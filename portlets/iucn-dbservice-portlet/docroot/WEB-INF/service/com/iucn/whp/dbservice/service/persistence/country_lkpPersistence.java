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

import com.iucn.whp.dbservice.model.country_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the country_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see country_lkpPersistenceImpl
 * @see country_lkpUtil
 * @generated
 */
public interface country_lkpPersistence extends BasePersistence<country_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link country_lkpUtil} to access the country_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the country_lkp in the entity cache if it is enabled.
	*
	* @param country_lkp the country_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.country_lkp country_lkp);

	/**
	* Caches the country_lkps in the entity cache if it is enabled.
	*
	* @param country_lkps the country_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.country_lkp> country_lkps);

	/**
	* Creates a new country_lkp with the primary key. Does not add the country_lkp to the database.
	*
	* @param countryid the primary key for the new country_lkp
	* @return the new country_lkp
	*/
	public com.iucn.whp.dbservice.model.country_lkp create(int countryid);

	/**
	* Removes the country_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp remove(int countryid)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.country_lkp updateImpl(
		com.iucn.whp.dbservice.model.country_lkp country_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp findByPrimaryKey(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp, or <code>null</code> if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByPrimaryKey(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where name = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param name the name
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp findByName(
		java.lang.String name)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByName(
		java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a2 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param a2 the a2
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp findByA2(
		java.lang.String a2)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param a2 the a2
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByA2(
		java.lang.String a2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param a2 the a2
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByA2(
		java.lang.String a2, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a3 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param a3 the a3
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp findByA3(
		java.lang.String a3)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param a3 the a3
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByA3(
		java.lang.String a3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param a3 the a3
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp fetchByA3(
		java.lang.String a3, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the country_lkps.
	*
	* @return the country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the country_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of country_lkps
	* @param end the upper bound of the range of country_lkps (not inclusive)
	* @return the range of country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the country_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of country_lkps
	* @param end the upper bound of the range of country_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the country_lkp where name = &#63; from the database.
	*
	* @param name the name
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp removeByName(
		java.lang.String name)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the country_lkp where a2 = &#63; from the database.
	*
	* @param a2 the a2
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp removeByA2(
		java.lang.String a2)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the country_lkp where a3 = &#63; from the database.
	*
	* @param a3 the a3
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.country_lkp removeByA3(
		java.lang.String a3)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the country_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of country_lkps where name = &#63;.
	*
	* @param name the name
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of country_lkps where a2 = &#63;.
	*
	* @param a2 the a2
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countByA2(java.lang.String a2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of country_lkps where a3 = &#63;.
	*
	* @param a3 the a3
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countByA3(java.lang.String a3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of country_lkps.
	*
	* @return the number of country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}