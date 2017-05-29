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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the unesco_region_country service. This utility wraps {@link unesco_region_countryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see unesco_region_countryPersistence
 * @see unesco_region_countryPersistenceImpl
 * @generated
 */
public class unesco_region_countryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(unesco_region_country unesco_region_country) {
		getPersistence().clearCache(unesco_region_country);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<unesco_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<unesco_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<unesco_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static unesco_region_country update(
		unesco_region_country unesco_region_country, boolean merge)
		throws SystemException {
		return getPersistence().update(unesco_region_country, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static unesco_region_country update(
		unesco_region_country unesco_region_country, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(unesco_region_country, merge, serviceContext);
	}

	/**
	* Caches the unesco_region_country in the entity cache if it is enabled.
	*
	* @param unesco_region_country the unesco_region_country
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country) {
		getPersistence().cacheResult(unesco_region_country);
	}

	/**
	* Caches the unesco_region_countries in the entity cache if it is enabled.
	*
	* @param unesco_region_countries the unesco_region_countries
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> unesco_region_countries) {
		getPersistence().cacheResult(unesco_region_countries);
	}

	/**
	* Creates a new unesco_region_country with the primary key. Does not add the unesco_region_country to the database.
	*
	* @param whp_unesco_region_country_id the primary key for the new unesco_region_country
	* @return the new unesco_region_country
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country create(
		int whp_unesco_region_country_id) {
		return getPersistence().create(whp_unesco_region_country_id);
	}

	/**
	* Removes the unesco_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country that was removed
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country remove(
		int whp_unesco_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_unesco_region_country_id);
	}

	public static com.iucn.whp.dbservice.model.unesco_region_country updateImpl(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(unesco_region_country, merge);
	}

	/**
	* Returns the unesco_region_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country findByPrimaryKey(
		int whp_unesco_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(whp_unesco_region_country_id);
	}

	/**
	* Returns the unesco_region_country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_unesco_region_country_id the primary key of the unesco_region_country
	* @return the unesco_region_country, or <code>null</code> if a unesco_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country fetchByPrimaryKey(
		int whp_unesco_region_country_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(whp_unesco_region_country_id);
	}

	/**
	* Returns the unesco_region_country where countryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	*
	* @param countryid the countryid
	* @return the matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country findBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycountryid(countryid);
	}

	/**
	* Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param countryid the countryid
	* @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country fetchBycountryid(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycountryid(countryid);
	}

	/**
	* Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param countryid the countryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country fetchBycountryid(
		int countryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycountryid(countryid, retrieveFromCache);
	}

	/**
	* Returns all the unesco_region_countries where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @return the matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByunescoregionid(unesco_region_id);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByunescoregionid(unesco_region_id, start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByunescoregionid(unesco_region_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country findByunescoregionid_First(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByunescoregionid_First(unesco_region_id,
			orderByComparator);
	}

	/**
	* Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country fetchByunescoregionid_First(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByunescoregionid_First(unesco_region_id,
			orderByComparator);
	}

	/**
	* Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unesco_region_country
	* @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country findByunescoregionid_Last(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByunescoregionid_Last(unesco_region_id,
			orderByComparator);
	}

	/**
	* Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country fetchByunescoregionid_Last(
		int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByunescoregionid_Last(unesco_region_id,
			orderByComparator);
	}

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
	public static com.iucn.whp.dbservice.model.unesco_region_country[] findByunescoregionid_PrevAndNext(
		int whp_unesco_region_country_id, int unesco_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByunescoregionid_PrevAndNext(whp_unesco_region_country_id,
			unesco_region_id, orderByComparator);
	}

	/**
	* Returns all the unesco_region_countries.
	*
	* @return the unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region_country> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the unesco_region_country where countryid = &#63; from the database.
	*
	* @param countryid the countryid
	* @return the unesco_region_country that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region_country removeBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBycountryid(countryid);
	}

	/**
	* Removes all the unesco_region_countries where unesco_region_id = &#63; from the database.
	*
	* @param unesco_region_id the unesco_region_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByunescoregionid(int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByunescoregionid(unesco_region_id);
	}

	/**
	* Removes all the unesco_region_countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of unesco_region_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the number of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycountryid(countryid);
	}

	/**
	* Returns the number of unesco_region_countries where unesco_region_id = &#63;.
	*
	* @param unesco_region_id the unesco_region_id
	* @return the number of matching unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByunescoregionid(int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByunescoregionid(unesco_region_id);
	}

	/**
	* Returns the number of unesco_region_countries.
	*
	* @return the number of unesco_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static unesco_region_countryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (unesco_region_countryPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					unesco_region_countryPersistence.class.getName());

			ReferenceRegistry.registerReference(unesco_region_countryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(unesco_region_countryPersistence persistence) {
	}

	private static unesco_region_countryPersistence _persistence;
}