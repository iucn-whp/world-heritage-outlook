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

import com.iucn.whp.dbservice.model.whp_sites_soouv;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_soouv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_soouvPersistenceImpl
 * @see whp_sites_soouvUtil
 * @generated
 */
public interface whp_sites_soouvPersistence extends BasePersistence<whp_sites_soouv> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_soouvUtil} to access the whp_sites_soouv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_soouv in the entity cache if it is enabled.
	*
	* @param whp_sites_soouv the whp_sites_soouv
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_soouv whp_sites_soouv);

	/**
	* Caches the whp_sites_soouvs in the entity cache if it is enabled.
	*
	* @param whp_sites_soouvs the whp_sites_soouvs
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> whp_sites_soouvs);

	/**
	* Creates a new whp_sites_soouv with the primary key. Does not add the whp_sites_soouv to the database.
	*
	* @param whp_sites_soouv_id the primary key for the new whp_sites_soouv
	* @return the new whp_sites_soouv
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soouv create(
		long whp_sites_soouv_id);

	/**
	* Removes the whp_sites_soouv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_soouv_id the primary key of the whp_sites_soouv
	* @return the whp_sites_soouv that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soouvException if a whp_sites_soouv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soouv remove(
		long whp_sites_soouv_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_soouvException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_soouv updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_soouv whp_sites_soouv,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soouv with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_soouvException} if it could not be found.
	*
	* @param whp_sites_soouv_id the primary key of the whp_sites_soouv
	* @return the whp_sites_soouv
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soouvException if a whp_sites_soouv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soouv findByPrimaryKey(
		long whp_sites_soouv_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_soouvException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soouv with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_soouv_id the primary key of the whp_sites_soouv
	* @return the whp_sites_soouv, or <code>null</code> if a whp_sites_soouv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soouv fetchByPrimaryKey(
		long whp_sites_soouv_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_soouvs.
	*
	* @return the whp_sites_soouvs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_soouvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_soouvs
	* @param end the upper bound of the range of whp_sites_soouvs (not inclusive)
	* @return the range of whp_sites_soouvs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_soouvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_soouvs
	* @param end the upper bound of the range of whp_sites_soouvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_soouvs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_soouvs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soouvs.
	*
	* @return the number of whp_sites_soouvs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}