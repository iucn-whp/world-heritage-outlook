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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the country_lkp service. This utility wraps {@link country_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see country_lkpPersistence
 * @see country_lkpPersistenceImpl
 * @generated
 */
public class country_lkpUtil {
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
	public static void clearCache(country_lkp country_lkp) {
		getPersistence().clearCache(country_lkp);
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
	public static List<country_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<country_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<country_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static country_lkp update(country_lkp country_lkp, boolean merge)
		throws SystemException {
		return getPersistence().update(country_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static country_lkp update(country_lkp country_lkp, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(country_lkp, merge, serviceContext);
	}

	/**
	* Caches the country_lkp in the entity cache if it is enabled.
	*
	* @param country_lkp the country_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.country_lkp country_lkp) {
		getPersistence().cacheResult(country_lkp);
	}

	/**
	* Caches the country_lkps in the entity cache if it is enabled.
	*
	* @param country_lkps the country_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.country_lkp> country_lkps) {
		getPersistence().cacheResult(country_lkps);
	}

	/**
	* Creates a new country_lkp with the primary key. Does not add the country_lkp to the database.
	*
	* @param countryid the primary key for the new country_lkp
	* @return the new country_lkp
	*/
	public static com.iucn.whp.dbservice.model.country_lkp create(int countryid) {
		return getPersistence().create(countryid);
	}

	/**
	* Removes the country_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp remove(int countryid)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(countryid);
	}

	public static com.iucn.whp.dbservice.model.country_lkp updateImpl(
		com.iucn.whp.dbservice.model.country_lkp country_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(country_lkp, merge);
	}

	/**
	* Returns the country_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp findByPrimaryKey(
		int countryid)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(countryid);
	}

	/**
	* Returns the country_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param countryid the primary key of the country_lkp
	* @return the country_lkp, or <code>null</code> if a country_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByPrimaryKey(
		int countryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(countryid);
	}

	/**
	* Returns the country_lkp where name = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param name the name
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp findByName(
		java.lang.String name)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName(name);
	}

	/**
	* Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByName(
		java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName(name, retrieveFromCache);
	}

	/**
	* Returns the country_lkp where a2 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param a2 the a2
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp findByA2(
		java.lang.String a2)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA2(a2);
	}

	/**
	* Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param a2 the a2
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByA2(
		java.lang.String a2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA2(a2);
	}

	/**
	* Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param a2 the a2
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByA2(
		java.lang.String a2, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA2(a2, retrieveFromCache);
	}

	/**
	* Returns the country_lkp where a3 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	*
	* @param a3 the a3
	* @return the matching country_lkp
	* @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp findByA3(
		java.lang.String a3)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA3(a3);
	}

	/**
	* Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param a3 the a3
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByA3(
		java.lang.String a3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA3(a3);
	}

	/**
	* Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param a3 the a3
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp fetchByA3(
		java.lang.String a3, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA3(a3, retrieveFromCache);
	}

	/**
	* Returns all the country_lkps.
	*
	* @return the country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.country_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the country_lkp where name = &#63; from the database.
	*
	* @param name the name
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp removeByName(
		java.lang.String name)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByName(name);
	}

	/**
	* Removes the country_lkp where a2 = &#63; from the database.
	*
	* @param a2 the a2
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp removeByA2(
		java.lang.String a2)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByA2(a2);
	}

	/**
	* Removes the country_lkp where a3 = &#63; from the database.
	*
	* @param a3 the a3
	* @return the country_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.country_lkp removeByA3(
		java.lang.String a3)
		throws com.iucn.whp.dbservice.NoSuchcountry_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByA3(a3);
	}

	/**
	* Removes all the country_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of country_lkps where name = &#63;.
	*
	* @param name the name
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Returns the number of country_lkps where a2 = &#63;.
	*
	* @param a2 the a2
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA2(java.lang.String a2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA2(a2);
	}

	/**
	* Returns the number of country_lkps where a3 = &#63;.
	*
	* @param a3 the a3
	* @return the number of matching country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA3(java.lang.String a3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA3(a3);
	}

	/**
	* Returns the number of country_lkps.
	*
	* @return the number of country_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static country_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (country_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					country_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(country_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(country_lkpPersistence persistence) {
	}

	private static country_lkpPersistence _persistence;
}