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

import com.iucn.whp.dbservice.model.whp_sites_other_designations;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_other_designations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_other_designationsPersistenceImpl
 * @see whp_sites_other_designationsUtil
 * @generated
 */
public interface whp_sites_other_designationsPersistence extends BasePersistence<whp_sites_other_designations> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_other_designationsUtil} to access the whp_sites_other_designations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_other_designations in the entity cache if it is enabled.
	*
	* @param whp_sites_other_designations the whp_sites_other_designations
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations);

	/**
	* Caches the whp_sites_other_designationses in the entity cache if it is enabled.
	*
	* @param whp_sites_other_designationses the whp_sites_other_designationses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> whp_sites_other_designationses);

	/**
	* Creates a new whp_sites_other_designations with the primary key. Does not add the whp_sites_other_designations to the database.
	*
	* @param whp_sites_other_designations_id the primary key for the new whp_sites_other_designations
	* @return the new whp_sites_other_designations
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations create(
		long whp_sites_other_designations_id);

	/**
	* Removes the whp_sites_other_designations with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations_id the primary key of the whp_sites_other_designations
	* @return the whp_sites_other_designations that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations remove(
		long whp_sites_other_designations_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_other_designations updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designations with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_other_designationsException} if it could not be found.
	*
	* @param whp_sites_other_designations_id the primary key of the whp_sites_other_designations
	* @return the whp_sites_other_designations
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations findByPrimaryKey(
		long whp_sites_other_designations_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designations with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_other_designations_id the primary key of the whp_sites_other_designations
	* @return the whp_sites_other_designations, or <code>null</code> if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchByPrimaryKey(
		long whp_sites_other_designations_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_other_designationses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findBySiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_other_designationses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_other_designationses
	* @param end the upper bound of the range of whp_sites_other_designationses (not inclusive)
	* @return the range of matching whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findBySiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_other_designationses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_other_designationses
	* @param end the upper bound of the range of whp_sites_other_designationses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findBySiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_other_designations in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_other_designations
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations findBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_other_designations in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_other_designations, or <code>null</code> if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_other_designations in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_other_designations
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations findBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_other_designations in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_other_designations, or <code>null</code> if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designationses before and after the current whp_sites_other_designations in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_other_designations_id the primary key of the current whp_sites_other_designations
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_other_designations
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations[] findBySiteId_PrevAndNext(
		long whp_sites_other_designations_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designations where other_designation_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_other_designationsException} if it could not be found.
	*
	* @param other_designation_id the other_designation_id
	* @return the matching whp_sites_other_designations
	* @throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations findByother_designation_id(
		int other_designation_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designations where other_designation_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param other_designation_id the other_designation_id
	* @return the matching whp_sites_other_designations, or <code>null</code> if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchByother_designation_id(
		int other_designation_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_other_designations where other_designation_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param other_designation_id the other_designation_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_other_designations, or <code>null</code> if a matching whp_sites_other_designations could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchByother_designation_id(
		int other_designation_id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_other_designationses.
	*
	* @return the whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_other_designationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_other_designationses
	* @param end the upper bound of the range of whp_sites_other_designationses (not inclusive)
	* @return the range of whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_other_designationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_other_designationses
	* @param end the upper bound of the range of whp_sites_other_designationses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_other_designationses where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_other_designations where other_designation_id = &#63; from the database.
	*
	* @param other_designation_id the other_designation_id
	* @return the whp_sites_other_designations that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations removeByother_designation_id(
		int other_designation_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_other_designationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_other_designationses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_other_designationses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_other_designationses where other_designation_id = &#63;.
	*
	* @param other_designation_id the other_designation_id
	* @return the number of matching whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public int countByother_designation_id(int other_designation_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_other_designationses.
	*
	* @return the number of whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}