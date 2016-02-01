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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the docs_sitedata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_sitedataPersistenceImpl
 * @see docs_sitedataUtil
 * @generated
 */
public interface docs_sitedataPersistence extends BasePersistence<docs_sitedata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link docs_sitedataUtil} to access the docs_sitedata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the docs_sitedata in the entity cache if it is enabled.
	*
	* @param docs_sitedata the docs_sitedata
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata);

	/**
	* Caches the docs_sitedatas in the entity cache if it is enabled.
	*
	* @param docs_sitedatas the docs_sitedatas
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> docs_sitedatas);

	/**
	* Creates a new docs_sitedata with the primary key. Does not add the docs_sitedata to the database.
	*
	* @param docs_sitedataId the primary key for the new docs_sitedata
	* @return the new docs_sitedata
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata create(
		long docs_sitedataId);

	/**
	* Removes the docs_sitedata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata that was removed
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata remove(
		long docs_sitedataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.docs_sitedata updateImpl(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_sitedata with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata findByPrimaryKey(
		long docs_sitedataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_sitedata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata, or <code>null</code> if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata fetchByPrimaryKey(
		long docs_sitedataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata findByfileid(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata fetchByfileid(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata fetchByfileid(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_sitedatas where siteid = &#63;.
	*
	* @param siteid the siteid
	* @return the matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findBysiteid(
		long siteid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata findBysiteid_First(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata fetchBysiteid_First(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_sitedata
	* @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata findBysiteid_Last(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	*
	* @param siteid the siteid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata fetchBysiteid_Last(
		long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_sitedata[] findBysiteid_PrevAndNext(
		long docs_sitedataId, long siteid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_sitedatas.
	*
	* @return the docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the docs_sitedata where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_sitedata that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata removeByfileid(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_sitedatas where siteid = &#63; from the database.
	*
	* @param siteid the siteid
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysiteid(long siteid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_sitedatas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_sitedatas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileid(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_sitedatas where siteid = &#63;.
	*
	* @param siteid the siteid
	* @return the number of matching docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public int countBysiteid(long siteid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_sitedatas.
	*
	* @return the number of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}