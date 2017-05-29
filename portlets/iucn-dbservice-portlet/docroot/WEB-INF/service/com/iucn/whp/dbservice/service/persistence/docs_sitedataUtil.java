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

import com.iucn.whp.dbservice.model.docs_sitedata;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the docs_sitedata service. This utility wraps {@link docs_sitedataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_sitedataPersistence
 * @see docs_sitedataPersistenceImpl
 * @generated
 */
public class docs_sitedataUtil {
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
	public static void clearCache(docs_sitedata docs_sitedata) {
		getPersistence().clearCache(docs_sitedata);
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
	public static List<docs_sitedata> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<docs_sitedata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<docs_sitedata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static docs_sitedata update(docs_sitedata docs_sitedata,
		boolean merge) throws SystemException {
		return getPersistence().update(docs_sitedata, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static docs_sitedata update(docs_sitedata docs_sitedata,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(docs_sitedata, merge, serviceContext);
	}

	/**
	* Caches the docs_sitedata in the entity cache if it is enabled.
	*
	* @param docs_sitedata the docs_sitedata
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata) {
		getPersistence().cacheResult(docs_sitedata);
	}

	/**
	* Caches the docs_sitedatas in the entity cache if it is enabled.
	*
	* @param docs_sitedatas the docs_sitedatas
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> docs_sitedatas) {
		getPersistence().cacheResult(docs_sitedatas);
	}

	/**
	* Creates a new docs_sitedata with the primary key. Does not add the docs_sitedata to the database.
	*
	* @param docs_sitedataId the primary key for the new docs_sitedata
	* @return the new docs_sitedata
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata create(
		long docs_sitedataId) {
		return getPersistence().create(docs_sitedataId);
	}

	/**
	* Removes the docs_sitedata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata that was removed
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata remove(
		long docs_sitedataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(docs_sitedataId);
	}

	public static com.iucn.whp.dbservice.model.docs_sitedata updateImpl(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(docs_sitedata, merge);
	}

	/**
	* Returns the docs_sitedata with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata findByPrimaryKey(
		long docs_sitedataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(docs_sitedataId);
	}

	/**
	* Returns the docs_sitedata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata, or <code>null</code> if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata fetchByPrimaryKey(
		long docs_sitedataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docs_sitedataId);
	}

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata findByfileid(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileid(fileentryid);
	}

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata fetchByfileid(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileid(fileentryid);
	}

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata fetchByfileid(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileid(fileentryid, retrieveFromCache);
	}

	/**
	* Returns all the docs_sitedatas where siteid = &#63;.
	*
	* @param siteid the siteid
	* @return the matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteid(siteid);
	}

	/**
	* Returns a range of all the docs_sitedatas where siteid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param siteid the siteid
	* @param start the lower bound of the range of docs_sitedatas
	* @param end the upper bound of the range of docs_sitedatas (not inclusive)
	* @return the range of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteid(siteid, start, end);
	}

	/**
	* Returns an ordered range of all the docs_sitedatas where siteid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param siteid the siteid
	* @param start the lower bound of the range of docs_sitedatas
	* @param end the upper bound of the range of docs_sitedatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteid(siteid, start, end, orderByComparator);
	}

	/**
	* Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata findBysiteid_First(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteid_First(siteid, orderByComparator);
	}

	/**
	* Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata fetchBysiteid_First(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteid_First(siteid, orderByComparator);
	}

	/**
	* Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata findBysiteid_Last(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteid_Last(siteid, orderByComparator);
	}

	/**
	* Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata fetchBysiteid_Last(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteid_Last(siteid, orderByComparator);
	}

	/**
	* Returns the docs_sitedatas before and after the current docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param docs_sitedataId the primary key of the current docs_sitedata
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata[] findBysiteid_PrevAndNext(
		long docs_sitedataId, long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteid_PrevAndNext(docs_sitedataId, siteid,
			orderByComparator);
	}

	/**
	* Returns all the docs_sitedatas.
	*
	* @return the docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the docs_sitedatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of docs_sitedatas
	* @param end the upper bound of the range of docs_sitedatas (not inclusive)
	* @return the range of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the docs_sitedatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of docs_sitedatas
	* @param end the upper bound of the range of docs_sitedatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the docs_sitedata where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_sitedata that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_sitedata removeByfileid(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByfileid(fileentryid);
	}

	/**
	* Removes all the docs_sitedatas where siteid = &#63; from the database.
	*
	* @param siteid the siteid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBysiteid(long siteid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBysiteid(siteid);
	}

	/**
	* Removes all the docs_sitedatas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of docs_sitedatas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileid(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileid(fileentryid);
	}

	/**
	* Returns the number of docs_sitedatas where siteid = &#63;.
	*
	* @param siteid the siteid
	* @return the number of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysiteid(long siteid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysiteid(siteid);
	}

	/**
	* Returns the number of docs_sitedatas.
	*
	* @return the number of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static docs_sitedataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (docs_sitedataPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					docs_sitedataPersistence.class.getName());

			ReferenceRegistry.registerReference(docs_sitedataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(docs_sitedataPersistence persistence) {
	}

	private static docs_sitedataPersistence _persistence;
}