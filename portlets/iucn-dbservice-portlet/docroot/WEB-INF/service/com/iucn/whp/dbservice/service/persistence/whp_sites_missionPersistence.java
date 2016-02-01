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

import com.iucn.whp.dbservice.model.whp_sites_mission;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_mission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_missionPersistenceImpl
 * @see whp_sites_missionUtil
 * @generated
 */
public interface whp_sites_missionPersistence extends BasePersistence<whp_sites_mission> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_missionUtil} to access the whp_sites_mission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_mission in the entity cache if it is enabled.
	*
	* @param whp_sites_mission the whp_sites_mission
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission);

	/**
	* Caches the whp_sites_missions in the entity cache if it is enabled.
	*
	* @param whp_sites_missions the whp_sites_missions
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> whp_sites_missions);

	/**
	* Creates a new whp_sites_mission with the primary key. Does not add the whp_sites_mission to the database.
	*
	* @param whp_sites_mission_id the primary key for the new whp_sites_mission
	* @return the new whp_sites_mission
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission create(
		long whp_sites_mission_id);

	/**
	* Removes the whp_sites_mission with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mission_id the primary key of the whp_sites_mission
	* @return the whp_sites_mission that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission remove(
		long whp_sites_mission_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_mission updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	*
	* @param whp_sites_mission_id the primary key of the whp_sites_mission
	* @return the whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission findByPrimaryKey(
		long whp_sites_mission_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_mission_id the primary key of the whp_sites_mission
	* @return the whp_sites_mission, or <code>null</code> if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchByPrimaryKey(
		long whp_sites_mission_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where missiontype = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	*
	* @param missiontype the missiontype
	* @return the matching whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission findBymissiontype(
		int missiontype)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where missiontype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param missiontype the missiontype
	* @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchBymissiontype(
		int missiontype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where missiontype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param missiontype the missiontype
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchBymissiontype(
		int missiontype, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission findByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchByfileId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_mission where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchByfileId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_missions where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findBySiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_missions where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_missions
	* @param end the upper bound of the range of whp_sites_missions (not inclusive)
	* @return the range of matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findBySiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_missions where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_missions
	* @param end the upper bound of the range of whp_sites_missions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findBySiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_mission in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission findBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_mission in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_mission in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission findBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_mission in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission fetchBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_missions before and after the current whp_sites_mission in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_mission_id the primary key of the current whp_sites_mission
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_mission
	* @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission[] findBySiteId_PrevAndNext(
		long whp_sites_mission_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_missions.
	*
	* @return the whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_missions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_missions
	* @param end the upper bound of the range of whp_sites_missions (not inclusive)
	* @return the range of whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_missions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_missions
	* @param end the upper bound of the range of whp_sites_missions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_mission where missiontype = &#63; from the database.
	*
	* @param missiontype the missiontype
	* @return the whp_sites_mission that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission removeBymissiontype(
		int missiontype)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_mission where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the whp_sites_mission that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_mission removeByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_missionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_missions where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_missions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_missions where missiontype = &#63;.
	*
	* @param missiontype the missiontype
	* @return the number of matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public int countBymissiontype(int missiontype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_missions where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_missions where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_missions.
	*
	* @return the number of whp_sites_missions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}