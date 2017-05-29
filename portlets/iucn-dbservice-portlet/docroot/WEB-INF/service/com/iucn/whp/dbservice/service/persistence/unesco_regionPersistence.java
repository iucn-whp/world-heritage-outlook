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

import com.iucn.whp.dbservice.model.unesco_region;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the unesco_region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see unesco_regionPersistenceImpl
 * @see unesco_regionUtil
 * @generated
 */
public interface unesco_regionPersistence extends BasePersistence<unesco_region> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link unesco_regionUtil} to access the unesco_region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the unesco_region in the entity cache if it is enabled.
	*
	* @param unesco_region the unesco_region
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.unesco_region unesco_region);

	/**
	* Caches the unesco_regions in the entity cache if it is enabled.
	*
	* @param unesco_regions the unesco_regions
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.unesco_region> unesco_regions);

	/**
	* Creates a new unesco_region with the primary key. Does not add the unesco_region to the database.
	*
	* @param unesco_region_id the primary key for the new unesco_region
	* @return the new unesco_region
	*/
	public com.iucn.whp.dbservice.model.unesco_region create(
		int unesco_region_id);

	/**
	* Removes the unesco_region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param unesco_region_id the primary key of the unesco_region
	* @return the unesco_region that was removed
	* @throws com.iucn.whp.dbservice.NoSuchunesco_regionException if a unesco_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region remove(
		int unesco_region_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_regionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.unesco_region updateImpl(
		com.iucn.whp.dbservice.model.unesco_region unesco_region, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_regionException} if it could not be found.
	*
	* @param unesco_region_id the primary key of the unesco_region
	* @return the unesco_region
	* @throws com.iucn.whp.dbservice.NoSuchunesco_regionException if a unesco_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region findByPrimaryKey(
		int unesco_region_id)
		throws com.iucn.whp.dbservice.NoSuchunesco_regionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the unesco_region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param unesco_region_id the primary key of the unesco_region
	* @return the unesco_region, or <code>null</code> if a unesco_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.unesco_region fetchByPrimaryKey(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the unesco_regions.
	*
	* @return the unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the unesco_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of unesco_regions
	* @param end the upper bound of the range of unesco_regions (not inclusive)
	* @return the range of unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the unesco_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of unesco_regions
	* @param end the upper bound of the range of unesco_regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.unesco_region> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the unesco_regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of unesco_regions.
	*
	* @return the number of unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}