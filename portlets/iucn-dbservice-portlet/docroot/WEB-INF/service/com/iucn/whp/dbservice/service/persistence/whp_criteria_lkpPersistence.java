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

import com.iucn.whp.dbservice.model.whp_criteria_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_criteria_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_criteria_lkpPersistenceImpl
 * @see whp_criteria_lkpUtil
 * @generated
 */
public interface whp_criteria_lkpPersistence extends BasePersistence<whp_criteria_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_criteria_lkpUtil} to access the whp_criteria_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_criteria_lkp in the entity cache if it is enabled.
	*
	* @param whp_criteria_lkp the whp_criteria_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp);

	/**
	* Caches the whp_criteria_lkps in the entity cache if it is enabled.
	*
	* @param whp_criteria_lkps the whp_criteria_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_criteria_lkp> whp_criteria_lkps);

	/**
	* Creates a new whp_criteria_lkp with the primary key. Does not add the whp_criteria_lkp to the database.
	*
	* @param id the primary key for the new whp_criteria_lkp
	* @return the new whp_criteria_lkp
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp create(long id);

	/**
	* Removes the whp_criteria_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the whp_criteria_lkp
	* @return the whp_criteria_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_criteria_lkpException if a whp_criteria_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp remove(long id)
		throws com.iucn.whp.dbservice.NoSuch_criteria_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_criteria_lkp updateImpl(
		com.iucn.whp.dbservice.model.whp_criteria_lkp whp_criteria_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_criteria_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_criteria_lkpException} if it could not be found.
	*
	* @param id the primary key of the whp_criteria_lkp
	* @return the whp_criteria_lkp
	* @throws com.iucn.whp.dbservice.NoSuch_criteria_lkpException if a whp_criteria_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuch_criteria_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_criteria_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the whp_criteria_lkp
	* @return the whp_criteria_lkp, or <code>null</code> if a whp_criteria_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_criteria_lkp fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_criteria_lkps.
	*
	* @return the whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_criteria_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_criteria_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_criteria_lkps
	* @param end the upper bound of the range of whp_criteria_lkps (not inclusive)
	* @return the range of whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_criteria_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_criteria_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_criteria_lkps
	* @param end the upper bound of the range of whp_criteria_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_criteria_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_criteria_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_criteria_lkps.
	*
	* @return the number of whp_criteria_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}