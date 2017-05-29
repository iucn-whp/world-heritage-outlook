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

import com.iucn.whp.dbservice.model.boundary_modification_type_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the boundary_modification_type_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see boundary_modification_type_lkpPersistenceImpl
 * @see boundary_modification_type_lkpUtil
 * @generated
 */
public interface boundary_modification_type_lkpPersistence
	extends BasePersistence<boundary_modification_type_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link boundary_modification_type_lkpUtil} to access the boundary_modification_type_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the boundary_modification_type_lkp in the entity cache if it is enabled.
	*
	* @param boundary_modification_type_lkp the boundary_modification_type_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.boundary_modification_type_lkp boundary_modification_type_lkp);

	/**
	* Caches the boundary_modification_type_lkps in the entity cache if it is enabled.
	*
	* @param boundary_modification_type_lkps the boundary_modification_type_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.boundary_modification_type_lkp> boundary_modification_type_lkps);

	/**
	* Creates a new boundary_modification_type_lkp with the primary key. Does not add the boundary_modification_type_lkp to the database.
	*
	* @param bm_id the primary key for the new boundary_modification_type_lkp
	* @return the new boundary_modification_type_lkp
	*/
	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp create(
		int bm_id);

	/**
	* Removes the boundary_modification_type_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bm_id the primary key of the boundary_modification_type_lkp
	* @return the boundary_modification_type_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException if a boundary_modification_type_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp remove(
		int bm_id)
		throws com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp updateImpl(
		com.iucn.whp.dbservice.model.boundary_modification_type_lkp boundary_modification_type_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the boundary_modification_type_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException} if it could not be found.
	*
	* @param bm_id the primary key of the boundary_modification_type_lkp
	* @return the boundary_modification_type_lkp
	* @throws com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException if a boundary_modification_type_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp findByPrimaryKey(
		int bm_id)
		throws com.iucn.whp.dbservice.NoSuchboundary_modification_type_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the boundary_modification_type_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bm_id the primary key of the boundary_modification_type_lkp
	* @return the boundary_modification_type_lkp, or <code>null</code> if a boundary_modification_type_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.boundary_modification_type_lkp fetchByPrimaryKey(
		int bm_id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the boundary_modification_type_lkps.
	*
	* @return the boundary_modification_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.boundary_modification_type_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the boundary_modification_type_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of boundary_modification_type_lkps
	* @param end the upper bound of the range of boundary_modification_type_lkps (not inclusive)
	* @return the range of boundary_modification_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.boundary_modification_type_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the boundary_modification_type_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of boundary_modification_type_lkps
	* @param end the upper bound of the range of boundary_modification_type_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of boundary_modification_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.boundary_modification_type_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the boundary_modification_type_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of boundary_modification_type_lkps.
	*
	* @return the number of boundary_modification_type_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}