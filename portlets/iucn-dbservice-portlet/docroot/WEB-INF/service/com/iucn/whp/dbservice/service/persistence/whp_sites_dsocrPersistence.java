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

import com.iucn.whp.dbservice.model.whp_sites_dsocr;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_dsocr service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_dsocrPersistenceImpl
 * @see whp_sites_dsocrUtil
 * @generated
 */
public interface whp_sites_dsocrPersistence extends BasePersistence<whp_sites_dsocr> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_dsocrUtil} to access the whp_sites_dsocr persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_dsocr in the entity cache if it is enabled.
	*
	* @param whp_sites_dsocr the whp_sites_dsocr
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_dsocr whp_sites_dsocr);

	/**
	* Caches the whp_sites_dsocrs in the entity cache if it is enabled.
	*
	* @param whp_sites_dsocrs the whp_sites_dsocrs
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> whp_sites_dsocrs);

	/**
	* Creates a new whp_sites_dsocr with the primary key. Does not add the whp_sites_dsocr to the database.
	*
	* @param whp_sites_dsocr_id the primary key for the new whp_sites_dsocr
	* @return the new whp_sites_dsocr
	*/
	public com.iucn.whp.dbservice.model.whp_sites_dsocr create(
		long whp_sites_dsocr_id);

	/**
	* Removes the whp_sites_dsocr with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_dsocr_id the primary key of the whp_sites_dsocr
	* @return the whp_sites_dsocr that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_dsocrException if a whp_sites_dsocr with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_dsocr remove(
		long whp_sites_dsocr_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_dsocrException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_dsocr updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_dsocr whp_sites_dsocr,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_dsocr with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_dsocrException} if it could not be found.
	*
	* @param whp_sites_dsocr_id the primary key of the whp_sites_dsocr
	* @return the whp_sites_dsocr
	* @throws com.iucn.whp.dbservice.NoSuch_sites_dsocrException if a whp_sites_dsocr with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_dsocr findByPrimaryKey(
		long whp_sites_dsocr_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_dsocrException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_dsocr with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_dsocr_id the primary key of the whp_sites_dsocr
	* @return the whp_sites_dsocr, or <code>null</code> if a whp_sites_dsocr with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_dsocr fetchByPrimaryKey(
		long whp_sites_dsocr_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_dsocrs.
	*
	* @return the whp_sites_dsocrs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_dsocrs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_dsocrs
	* @param end the upper bound of the range of whp_sites_dsocrs (not inclusive)
	* @return the range of whp_sites_dsocrs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_dsocrs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_dsocrs
	* @param end the upper bound of the range of whp_sites_dsocrs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_dsocrs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_dsocrs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_dsocrs.
	*
	* @return the number of whp_sites_dsocrs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}