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

import com.iucn.whp.dbservice.model.whp_site_danger_list;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_site_danger_list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_site_danger_listPersistenceImpl
 * @see whp_site_danger_listUtil
 * @generated
 */
public interface whp_site_danger_listPersistence extends BasePersistence<whp_site_danger_list> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_site_danger_listUtil} to access the whp_site_danger_list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_site_danger_list in the entity cache if it is enabled.
	*
	* @param whp_site_danger_list the whp_site_danger_list
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list);

	/**
	* Caches the whp_site_danger_lists in the entity cache if it is enabled.
	*
	* @param whp_site_danger_lists the whp_site_danger_lists
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> whp_site_danger_lists);

	/**
	* Creates a new whp_site_danger_list with the primary key. Does not add the whp_site_danger_list to the database.
	*
	* @param whp_site_danger_list_id the primary key for the new whp_site_danger_list
	* @return the new whp_site_danger_list
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list create(
		long whp_site_danger_list_id);

	/**
	* Removes the whp_site_danger_list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_site_danger_list_id the primary key of the whp_site_danger_list
	* @return the whp_site_danger_list that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list remove(
		long whp_site_danger_list_id)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_site_danger_list updateImpl(
		com.iucn.whp.dbservice.model.whp_site_danger_list whp_site_danger_list,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_list with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_site_danger_listException} if it could not be found.
	*
	* @param whp_site_danger_list_id the primary key of the whp_site_danger_list
	* @return the whp_site_danger_list
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list findByPrimaryKey(
		long whp_site_danger_list_id)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_site_danger_list_id the primary key of the whp_site_danger_list
	* @return the whp_site_danger_list, or <code>null</code> if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchByPrimaryKey(
		long whp_site_danger_list_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_list where status_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_site_danger_listException} if it could not be found.
	*
	* @param status_id the status_id
	* @return the matching whp_site_danger_list
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list findBystatusid(
		int status_id)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_list where status_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param status_id the status_id
	* @return the matching whp_site_danger_list, or <code>null</code> if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchBystatusid(
		int status_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_list where status_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param status_id the status_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_site_danger_list, or <code>null</code> if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchBystatusid(
		int status_id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_site_danger_lists where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findBysite_id(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_site_danger_lists where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_site_danger_lists
	* @param end the upper bound of the range of whp_site_danger_lists (not inclusive)
	* @return the range of matching whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findBysite_id(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_site_danger_lists where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_site_danger_lists
	* @param end the upper bound of the range of whp_site_danger_lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findBysite_id(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_site_danger_list in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_site_danger_list
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list findBysite_id_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_site_danger_list in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_site_danger_list, or <code>null</code> if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchBysite_id_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_site_danger_list in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_site_danger_list
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list findBysite_id_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_site_danger_list in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_site_danger_list, or <code>null</code> if a matching whp_site_danger_list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list fetchBysite_id_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_site_danger_lists before and after the current whp_site_danger_list in the ordered set where site_id = &#63;.
	*
	* @param whp_site_danger_list_id the primary key of the current whp_site_danger_list
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_site_danger_list
	* @throws com.iucn.whp.dbservice.NoSuch_site_danger_listException if a whp_site_danger_list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list[] findBysite_id_PrevAndNext(
		long whp_site_danger_list_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_site_danger_lists.
	*
	* @return the whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_site_danger_lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_site_danger_lists
	* @param end the upper bound of the range of whp_site_danger_lists (not inclusive)
	* @return the range of whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_site_danger_lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_site_danger_lists
	* @param end the upper bound of the range of whp_site_danger_lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_site_danger_list where status_id = &#63; from the database.
	*
	* @param status_id the status_id
	* @return the whp_site_danger_list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_site_danger_list removeBystatusid(
		int status_id)
		throws com.iucn.whp.dbservice.NoSuch_site_danger_listException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_site_danger_lists where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysite_id(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_site_danger_lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_site_danger_lists where status_id = &#63;.
	*
	* @param status_id the status_id
	* @return the number of matching whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatusid(int status_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_site_danger_lists where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public int countBysite_id(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_site_danger_lists.
	*
	* @return the number of whp_site_danger_lists
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}