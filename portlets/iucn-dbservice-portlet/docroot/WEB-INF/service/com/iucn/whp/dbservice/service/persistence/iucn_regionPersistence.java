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

import com.iucn.whp.dbservice.model.iucn_region;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the iucn_region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see iucn_regionPersistenceImpl
 * @see iucn_regionUtil
 * @generated
 */
public interface iucn_regionPersistence extends BasePersistence<iucn_region> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link iucn_regionUtil} to access the iucn_region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the iucn_region in the entity cache if it is enabled.
	*
	* @param iucn_region the iucn_region
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.iucn_region iucn_region);

	/**
	* Caches the iucn_regions in the entity cache if it is enabled.
	*
	* @param iucn_regions the iucn_regions
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.iucn_region> iucn_regions);

	/**
	* Creates a new iucn_region with the primary key. Does not add the iucn_region to the database.
	*
	* @param iucn_region_id the primary key for the new iucn_region
	* @return the new iucn_region
	*/
	public com.iucn.whp.dbservice.model.iucn_region create(int iucn_region_id);

	/**
	* Removes the iucn_region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region that was removed
	* @throws com.iucn.whp.dbservice.NoSuchiucn_regionException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region remove(int iucn_region_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_regionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.iucn_region updateImpl(
		com.iucn.whp.dbservice.model.iucn_region iucn_region, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the iucn_region with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchiucn_regionException} if it could not be found.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region
	* @throws com.iucn.whp.dbservice.NoSuchiucn_regionException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region findByPrimaryKey(
		int iucn_region_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_regionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the iucn_region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region, or <code>null</code> if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region fetchByPrimaryKey(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the iucn_regions.
	*
	* @return the iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the iucn_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_regions
	* @param end the upper bound of the range of iucn_regions (not inclusive)
	* @return the range of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the iucn_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_regions
	* @param end the upper bound of the range of iucn_regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the iucn_regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of iucn_regions.
	*
	* @return the number of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}