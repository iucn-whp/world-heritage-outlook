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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_sites_country service. This utility wraps {@link whp_sites_countryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_countryPersistence
 * @see whp_sites_countryPersistenceImpl
 * @generated
 */
public class whp_sites_countryUtil {
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
	public static void clearCache(whp_sites_country whp_sites_country) {
		getPersistence().clearCache(whp_sites_country);
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
	public static List<whp_sites_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_sites_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_sites_country> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_sites_country update(
		whp_sites_country whp_sites_country, boolean merge)
		throws SystemException {
		return getPersistence().update(whp_sites_country, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_sites_country update(
		whp_sites_country whp_sites_country, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(whp_sites_country, merge, serviceContext);
	}

	/**
	* Caches the whp_sites_country in the entity cache if it is enabled.
	*
	* @param whp_sites_country the whp_sites_country
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country) {
		getPersistence().cacheResult(whp_sites_country);
	}

	/**
	* Caches the whp_sites_countries in the entity cache if it is enabled.
	*
	* @param whp_sites_countries the whp_sites_countries
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> whp_sites_countries) {
		getPersistence().cacheResult(whp_sites_countries);
	}

	/**
	* Creates a new whp_sites_country with the primary key. Does not add the whp_sites_country to the database.
	*
	* @param whp_sites_country_id the primary key for the new whp_sites_country
	* @return the new whp_sites_country
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country create(
		long whp_sites_country_id) {
		return getPersistence().create(whp_sites_country_id);
	}

	/**
	* Removes the whp_sites_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country remove(
		long whp_sites_country_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_country_id);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_country updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(whp_sites_country, merge);
	}

	/**
	* Returns the whp_sites_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_countryException} if it could not be found.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country findByPrimaryKey(
		long whp_sites_country_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(whp_sites_country_id);
	}

	/**
	* Returns the whp_sites_country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country, or <code>null</code> if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country fetchByPrimaryKey(
		long whp_sites_country_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(whp_sites_country_id);
	}

	/**
	* Returns all the whp_sites_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycountryid(countryid);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycountryid(countryid, start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findBycountryid(
		int countryid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycountryid(countryid, start, end, orderByComparator);
	}

	/**
	* Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country findBycountryid_First(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycountryid_First(countryid, orderByComparator);
	}

	/**
	* Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country fetchBycountryid_First(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycountryid_First(countryid, orderByComparator);
	}

	/**
	* Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_country
	* @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country findBycountryid_Last(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycountryid_Last(countryid, orderByComparator);
	}

	/**
	* Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	*
	* @param countryid the countryid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_country fetchBycountryid_Last(
		int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycountryid_Last(countryid, orderByComparator);
	}

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
	public static com.iucn.whp.dbservice.model.whp_sites_country[] findBycountryid_PrevAndNext(
		long whp_sites_country_id, int countryid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_countryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycountryid_PrevAndNext(whp_sites_country_id,
			countryid, orderByComparator);
	}

	/**
	* Returns all the whp_sites_countries.
	*
	* @return the whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the whp_sites_countries where countryid = &#63; from the database.
	*
	* @param countryid the countryid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycountryid(countryid);
	}

	/**
	* Removes all the whp_sites_countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_sites_countries where countryid = &#63;.
	*
	* @param countryid the countryid
	* @return the number of matching whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycountryid(int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycountryid(countryid);
	}

	/**
	* Returns the number of whp_sites_countries.
	*
	* @return the number of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_sites_countryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_sites_countryPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sites_countryPersistence.class.getName());

			ReferenceRegistry.registerReference(whp_sites_countryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(whp_sites_countryPersistence persistence) {
	}

	private static whp_sites_countryPersistence _persistence;
}