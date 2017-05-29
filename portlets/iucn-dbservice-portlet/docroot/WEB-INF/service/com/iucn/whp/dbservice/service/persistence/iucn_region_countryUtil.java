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

import com.iucn.whp.dbservice.model.iucn_region_country;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the iucn_region_country service. This utility wraps {@link iucn_region_countryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see iucn_region_countryPersistence
 * @see iucn_region_countryPersistenceImpl
 * @generated
 */
public class iucn_region_countryUtil {
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
	public static void clearCache(iucn_region_country iucn_region_country) {
		getPersistence().clearCache(iucn_region_country);
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
	public static List<iucn_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<iucn_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<iucn_region_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static iucn_region_country update(
		iucn_region_country iucn_region_country, boolean merge)
		throws SystemException {
		return getPersistence().update(iucn_region_country, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static iucn_region_country update(
		iucn_region_country iucn_region_country, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(iucn_region_country, merge, serviceContext);
	}

	/**
	* Caches the iucn_region_country in the entity cache if it is enabled.
	*
	* @param iucn_region_country the iucn_region_country
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country) {
		getPersistence().cacheResult(iucn_region_country);
	}

	/**
	* Caches the iucn_region_countries in the entity cache if it is enabled.
	*
	* @param iucn_region_countries the iucn_region_countries
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> iucn_region_countries) {
		getPersistence().cacheResult(iucn_region_countries);
	}

	/**
	* Creates a new iucn_region_country with the primary key. Does not add the iucn_region_country to the database.
	*
	* @param whp_iucn_region_country_id the primary key for the new iucn_region_country
	* @return the new iucn_region_country
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country create(
		int whp_iucn_region_country_id) {
		return getPersistence().create(whp_iucn_region_country_id);
	}

	/**
	* Removes the iucn_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_iucn_region_country_id the primary key of the iucn_region_country
	* @return the iucn_region_country that was removed
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country remove(
		int whp_iucn_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_iucn_region_country_id);
	}

	public static com.iucn.whp.dbservice.model.iucn_region_country updateImpl(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(iucn_region_country, merge);
	}

	/**
	* Returns the iucn_region_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchiucn_region_countryException} if it could not be found.
	*
	* @param whp_iucn_region_country_id the primary key of the iucn_region_country
	* @return the iucn_region_country
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country findByPrimaryKey(
		int whp_iucn_region_country_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(whp_iucn_region_country_id);
	}

	/**
	* Returns the iucn_region_country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_iucn_region_country_id the primary key of the iucn_region_country
	* @return the iucn_region_country, or <code>null</code> if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country fetchByPrimaryKey(
		int whp_iucn_region_country_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(whp_iucn_region_country_id);
	}

	/**
	* Returns the iucn_region_country where countryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchiucn_region_countryException} if it could not be found.
	*
	* @param countryid the countryid
	* @return the matching iucn_region_country
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country findBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycountryid(countryid);
	}

	/**
	* Returns the iucn_region_country where countryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param countryid the countryid
	* @return the matching iucn_region_country, or <code>null</code> if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country fetchBycountryid(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycountryid(countryid);
	}

	/**
	* Returns the iucn_region_country where countryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param countryid the countryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching iucn_region_country, or <code>null</code> if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country fetchBycountryid(
		int countryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycountryid(countryid, retrieveFromCache);
	}

	/**
	* Returns all the iucn_region_countries where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @return the matching iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findByiucnregionid(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByiucnregionid(iucn_region_id);
	}

	/**
	* Returns a range of all the iucn_region_countries where iucn_region_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param iucn_region_id the iucn_region_id
	* @param start the lower bound of the range of iucn_region_countries
	* @param end the upper bound of the range of iucn_region_countries (not inclusive)
	* @return the range of matching iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findByiucnregionid(
		int iucn_region_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByiucnregionid(iucn_region_id, start, end);
	}

	/**
	* Returns an ordered range of all the iucn_region_countries where iucn_region_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param iucn_region_id the iucn_region_id
	* @param start the lower bound of the range of iucn_region_countries
	* @param end the upper bound of the range of iucn_region_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findByiucnregionid(
		int iucn_region_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByiucnregionid(iucn_region_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first iucn_region_country in the ordered set where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching iucn_region_country
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country findByiucnregionid_First(
		int iucn_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByiucnregionid_First(iucn_region_id, orderByComparator);
	}

	/**
	* Returns the first iucn_region_country in the ordered set where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching iucn_region_country, or <code>null</code> if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country fetchByiucnregionid_First(
		int iucn_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByiucnregionid_First(iucn_region_id, orderByComparator);
	}

	/**
	* Returns the last iucn_region_country in the ordered set where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching iucn_region_country
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country findByiucnregionid_Last(
		int iucn_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByiucnregionid_Last(iucn_region_id, orderByComparator);
	}

	/**
	* Returns the last iucn_region_country in the ordered set where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching iucn_region_country, or <code>null</code> if a matching iucn_region_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country fetchByiucnregionid_Last(
		int iucn_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByiucnregionid_Last(iucn_region_id, orderByComparator);
	}

	/**
	* Returns the iucn_region_countries before and after the current iucn_region_country in the ordered set where iucn_region_id = &#63;.
	*
	* @param whp_iucn_region_country_id the primary key of the current iucn_region_country
	* @param iucn_region_id the iucn_region_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next iucn_region_country
	* @throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country[] findByiucnregionid_PrevAndNext(
		int whp_iucn_region_country_id, int iucn_region_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByiucnregionid_PrevAndNext(whp_iucn_region_country_id,
			iucn_region_id, orderByComparator);
	}

	/**
	* Returns all the iucn_region_countries.
	*
	* @return the iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the iucn_region_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_region_countries
	* @param end the upper bound of the range of iucn_region_countries (not inclusive)
	* @return the range of iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the iucn_region_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_region_countries
	* @param end the upper bound of the range of iucn_region_countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the iucn_region_country where countryid = &#63; from the database.
	*
	* @param countryid the countryid
	* @return the iucn_region_country that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region_country removeBycountryid(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchiucn_region_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBycountryid(countryid);
	}

	/**
	* Removes all the iucn_region_countries where iucn_region_id = &#63; from the database.
	*
	* @param iucn_region_id the iucn_region_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByiucnregionid(int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByiucnregionid(iucn_region_id);
	}

	/**
	* Removes all the iucn_region_countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of iucn_region_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the number of matching iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycountryid(countryid);
	}

	/**
	* Returns the number of iucn_region_countries where iucn_region_id = &#63;.
	*
	* @param iucn_region_id the iucn_region_id
	* @return the number of matching iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByiucnregionid(int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByiucnregionid(iucn_region_id);
	}

	/**
	* Returns the number of iucn_region_countries.
	*
	* @return the number of iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static iucn_region_countryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (iucn_region_countryPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					iucn_region_countryPersistence.class.getName());

			ReferenceRegistry.registerReference(iucn_region_countryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(iucn_region_countryPersistence persistence) {
	}

	private static iucn_region_countryPersistence _persistence;
}