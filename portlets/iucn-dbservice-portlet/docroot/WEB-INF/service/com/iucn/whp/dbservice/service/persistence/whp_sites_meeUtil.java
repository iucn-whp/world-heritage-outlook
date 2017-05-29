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

import com.iucn.whp.dbservice.model.whp_sites_mee;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_sites_mee service. This utility wraps {@link whp_sites_meePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_meePersistence
 * @see whp_sites_meePersistenceImpl
 * @generated
 */
public class whp_sites_meeUtil {
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
	public static void clearCache(whp_sites_mee whp_sites_mee) {
		getPersistence().clearCache(whp_sites_mee);
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
	public static List<whp_sites_mee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_sites_mee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_sites_mee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_sites_mee update(whp_sites_mee whp_sites_mee,
		boolean merge) throws SystemException {
		return getPersistence().update(whp_sites_mee, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_sites_mee update(whp_sites_mee whp_sites_mee,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(whp_sites_mee, merge, serviceContext);
	}

	/**
	* Caches the whp_sites_mee in the entity cache if it is enabled.
	*
	* @param whp_sites_mee the whp_sites_mee
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee) {
		getPersistence().cacheResult(whp_sites_mee);
	}

	/**
	* Caches the whp_sites_mees in the entity cache if it is enabled.
	*
	* @param whp_sites_mees the whp_sites_mees
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> whp_sites_mees) {
		getPersistence().cacheResult(whp_sites_mees);
	}

	/**
	* Creates a new whp_sites_mee with the primary key. Does not add the whp_sites_mee to the database.
	*
	* @param whp_sites_mee_id the primary key for the new whp_sites_mee
	* @return the new whp_sites_mee
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee create(
		long whp_sites_mee_id) {
		return getPersistence().create(whp_sites_mee_id);
	}

	/**
	* Removes the whp_sites_mee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mee_id the primary key of the whp_sites_mee
	* @return the whp_sites_mee that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee remove(
		long whp_sites_mee_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_mee_id);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_mee updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_mee whp_sites_mee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(whp_sites_mee, merge);
	}

	/**
	* Returns the whp_sites_mee with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_meeException} if it could not be found.
	*
	* @param whp_sites_mee_id the primary key of the whp_sites_mee
	* @return the whp_sites_mee
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee findByPrimaryKey(
		long whp_sites_mee_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(whp_sites_mee_id);
	}

	/**
	* Returns the whp_sites_mee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_mee_id the primary key of the whp_sites_mee
	* @return the whp_sites_mee, or <code>null</code> if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee fetchByPrimaryKey(
		long whp_sites_mee_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(whp_sites_mee_id);
	}

	/**
	* Returns the whp_sites_mee where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_meeException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_mee
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee findByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileId(fileentryid);
	}

	/**
	* Returns the whp_sites_mee where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_mee, or <code>null</code> if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee fetchByfileId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileId(fileentryid);
	}

	/**
	* Returns the whp_sites_mee where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_mee, or <code>null</code> if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee fetchByfileId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileId(fileentryid, retrieveFromCache);
	}

	/**
	* Returns all the whp_sites_mees where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findBySiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySiteId(site_id);
	}

	/**
	* Returns a range of all the whp_sites_mees where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_mees
	* @param end the upper bound of the range of whp_sites_mees (not inclusive)
	* @return the range of matching whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findBySiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySiteId(site_id, start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_mees where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_mees
	* @param end the upper bound of the range of whp_sites_mees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findBySiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySiteId(site_id, start, end, orderByComparator);
	}

	/**
	* Returns the first whp_sites_mee in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_mee
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee findBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the first whp_sites_mee in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_mee, or <code>null</code> if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee fetchBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the last whp_sites_mee in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_mee
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee findBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the last whp_sites_mee in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_mee, or <code>null</code> if a matching whp_sites_mee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee fetchBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the whp_sites_mees before and after the current whp_sites_mee in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_mee_id the primary key of the current whp_sites_mee
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_mee
	* @throws com.iucn.whp.dbservice.NoSuch_sites_meeException if a whp_sites_mee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee[] findBySiteId_PrevAndNext(
		long whp_sites_mee_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySiteId_PrevAndNext(whp_sites_mee_id, site_id,
			orderByComparator);
	}

	/**
	* Returns all the whp_sites_mees.
	*
	* @return the whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the whp_sites_mees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_mees
	* @param end the upper bound of the range of whp_sites_mees (not inclusive)
	* @return the range of whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_mees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_mees
	* @param end the upper bound of the range of whp_sites_mees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the whp_sites_mee where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the whp_sites_mee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mee removeByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_meeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByfileId(fileentryid);
	}

	/**
	* Removes all the whp_sites_mees where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySiteId(site_id);
	}

	/**
	* Removes all the whp_sites_mees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_sites_mees where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileId(fileentryid);
	}

	/**
	* Returns the number of whp_sites_mees where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySiteId(site_id);
	}

	/**
	* Returns the number of whp_sites_mees.
	*
	* @return the number of whp_sites_mees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_sites_meePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_sites_meePersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sites_meePersistence.class.getName());

			ReferenceRegistry.registerReference(whp_sites_meeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(whp_sites_meePersistence persistence) {
	}

	private static whp_sites_meePersistence _persistence;
}