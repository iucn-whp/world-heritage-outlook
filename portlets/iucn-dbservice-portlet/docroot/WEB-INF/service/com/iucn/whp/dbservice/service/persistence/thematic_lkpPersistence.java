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

import com.iucn.whp.dbservice.model.thematic_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the thematic_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see thematic_lkpPersistenceImpl
 * @see thematic_lkpUtil
 * @generated
 */
public interface thematic_lkpPersistence extends BasePersistence<thematic_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link thematic_lkpUtil} to access the thematic_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the thematic_lkp in the entity cache if it is enabled.
	*
	* @param thematic_lkp the thematic_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp);

	/**
	* Caches the thematic_lkps in the entity cache if it is enabled.
	*
	* @param thematic_lkps the thematic_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> thematic_lkps);

	/**
	* Creates a new thematic_lkp with the primary key. Does not add the thematic_lkp to the database.
	*
	* @param thematicid the primary key for the new thematic_lkp
	* @return the new thematic_lkp
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp create(long thematicid);

	/**
	* Removes the thematic_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchthematic_lkpException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp remove(long thematicid)
		throws com.iucn.whp.dbservice.NoSuchthematic_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.thematic_lkp updateImpl(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thematic_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthematic_lkpException} if it could not be found.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp
	* @throws com.iucn.whp.dbservice.NoSuchthematic_lkpException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp findByPrimaryKey(
		long thematicid)
		throws com.iucn.whp.dbservice.NoSuchthematic_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thematic_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp, or <code>null</code> if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp fetchByPrimaryKey(
		long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thematic_lkps.
	*
	* @return the thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thematic_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of thematic_lkps
	* @param end the upper bound of the range of thematic_lkps (not inclusive)
	* @return the range of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thematic_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of thematic_lkps
	* @param end the upper bound of the range of thematic_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the thematic_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thematic_lkps.
	*
	* @return the number of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}