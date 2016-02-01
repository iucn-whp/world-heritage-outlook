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

import com.iucn.whp.dbservice.model.whp_sites_country;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_countryPersistenceImpl
 * @see whp_sites_countryUtil
 * @generated
 */
public interface whp_sites_countryPersistence extends BasePersistence<whp_sites_country> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_countryUtil} to access the whp_sites_country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_country in the entity cache if it is enabled.
	*
	* @param whp_sites_country the whp_sites_country
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country);

	/**
	* Caches the whp_sites_countries in the entity cache if it is enabled.
	*
	* @param whp_sites_countries the whp_sites_countries
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> whp_sites_countries);

	/**
	* Creates a new whp_sites_country with the primary key. Does not add the whp_sites_country to the database.
	*
	* @param whp_sites_country_id the primary key for the new whp_sites_country
	* @return the new whp_sites_country
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country create(
		long whp_sites_country_id);

	/**
	* Removes the whp_sites_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country remove(
		long whp_sites_country_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_country updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_countryException} if it could not be found.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country findByPrimaryKey(
		long whp_sites_country_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country, or <code>null</code> if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country fetchByPrimaryKey(
		long whp_sites_country_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_countries where countryid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param countryid the countryid
	* @param start the lower bound of the range of whp_sites_countries
	* @param end the upper bound of the range of whp_sites_countries (not inclusive)
	* @return the range of matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_countries where countryid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param countryid the countryid
	* @param start the lower bound of the range of whp_sites_countries
	* @param end the upper bound of the range of whp_sites_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country findBycountryid_First(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country fetchBycountryid_First(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country findBycountryid_Last(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country fetchBycountryid_Last(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_countries before and after the current whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param whp_sites_country_id the primary key of the current whp_sites_country
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country[] findBycountryid_PrevAndNext(
		long whp_sites_country_id, int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_countries.
	*
	* @return the whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_countries
	* @param end the upper bound of the range of whp_sites_countries (not inclusive)
	* @return the range of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_countries
	* @param end the upper bound of the range of whp_sites_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_countries where countryid = &#63; from the database.
	*
	* @param countryid the countryid
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the number of matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public int countBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_countries.
	*
	* @return the number of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}