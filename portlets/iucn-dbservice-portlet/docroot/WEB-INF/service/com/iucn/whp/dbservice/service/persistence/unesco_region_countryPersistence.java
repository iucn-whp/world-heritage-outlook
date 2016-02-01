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

import com.iucn.whp.dbservice.model.unesco_region_country;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the unesco_region_country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see unesco_region_countryPersistenceImpl
 * @see unesco_region_countryUtil
 * @generated
 */
public interface unesco_region_countryPersistence extends BasePersistence<unesco_region_country> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link unesco_region_countryUtil} to access the unesco_region_country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the unesco_region_country in the entity cache if it is enabled.
	*
	* @param unesco_region_country the unesco_region_country
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country);

	/**
	* Caches the unesco_region_countries in the entity cache if it is enabled.
	*
	* @param unesco_region_countries the unesco_region_countries
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> unesco_region_countries);

	/**
	* Creates a new unesco_region_country with the primary key. Does not add the unesco_region_country to the database.
	*
	* @param whp_unesco_region_country_id the primary key for the new unesco_region_country
	* @return the new unesco_region_country
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country create(
		int whp_unesco_region_country_id);

	/**
	* Removes the unesco_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country that was removed
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country remove(
		int whp_unesco_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.unesco_region_country updateImpl(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country findByPrimaryKey(
		int whp_unesco_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country, or <code>null</code> if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country fetchByPrimaryKey(
		int whp_unesco_region_country_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_country where countryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	*
	* @param countryid the countryid
	* @return the matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country findBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param countryid the countryid
	* @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country fetchBycountryid(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param countryid the countryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country fetchBycountryid(
		int countryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the unesco_region_countries where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @return the matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the unesco_region_countries where unesco_region_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unesco_region_id the unesco_region_id
	* @param start the lower bound of the range of unesco_region_countries
	* @param end the upper bound of the range of unesco_region_countries (not inclusive)
	* @return the range of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the unesco_region_countries where unesco_region_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unesco_region_id the unesco_region_id
	* @param start the lower bound of the range of unesco_region_countries
	* @param end the upper bound of the range of unesco_region_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country findByunescoregionid_First(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country fetchByunescoregionid_First(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country findByunescoregionid_Last(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country fetchByunescoregionid_Last(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region_countries before and after the current unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param whp_unesco_region_country_id the primary key of the current unesco_region_country
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country[] findByunescoregionid_PrevAndNext(
		int whp_unesco_region_country_id, int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the unesco_region_countries.
	*
	* @return the unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the unesco_region_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of unesco_region_countries
	* @param end the upper bound of the range of unesco_region_countries (not inclusive)
	* @return the range of unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the unesco_region_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of unesco_region_countries
	* @param end the upper bound of the range of unesco_region_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the unesco_region_country where countryid = &#63; from the database.
	*
	* @param countryid the countryid
	* @return the unesco_region_country that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region_country removeBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the unesco_region_countries where unesco_region_id = &#63; from the database.
	*
	* @param unesco_region_id the unesco_region_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByunescoregionid(int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the unesco_region_countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of unesco_region_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the number of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public int countBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of unesco_region_countries where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @return the number of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public int countByunescoregionid(int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of unesco_region_countries.
	*
	* @return the number of unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}