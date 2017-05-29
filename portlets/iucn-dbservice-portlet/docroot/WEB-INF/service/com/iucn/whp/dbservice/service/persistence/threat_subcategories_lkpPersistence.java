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

import com.iucn.whp.dbservice.model.threat_subcategories_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the threat_subcategories_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_subcategories_lkpPersistenceImpl
 * @see threat_subcategories_lkpUtil
 * @generated
 */
public interface threat_subcategories_lkpPersistence extends BasePersistence<threat_subcategories_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link threat_subcategories_lkpUtil} to access the threat_subcategories_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the threat_subcategories_lkp in the entity cache if it is enabled.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp);

	/**
	* Caches the threat_subcategories_lkps in the entity cache if it is enabled.
	*
	* @param threat_subcategories_lkps the threat_subcategories_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> threat_subcategories_lkps);

	/**
	* Creates a new threat_subcategories_lkp with the primary key. Does not add the threat_subcategories_lkp to the database.
	*
	* @param id the primary key for the new threat_subcategories_lkp
	* @return the new threat_subcategories_lkp
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp create(long id);

	/**
	* Removes the threat_subcategories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp remove(long id)
		throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.threat_subcategories_lkp updateImpl(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the threat_subcategories_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException} if it could not be found.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp
	* @throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the threat_subcategories_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp, or <code>null</code> if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the threat_subcategories_lkps.
	*
	* @return the threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the threat_subcategories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_subcategories_lkps
	* @param end the upper bound of the range of threat_subcategories_lkps (not inclusive)
	* @return the range of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the threat_subcategories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_subcategories_lkps
	* @param end the upper bound of the range of threat_subcategories_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the threat_subcategories_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of threat_subcategories_lkps.
	*
	* @return the number of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}