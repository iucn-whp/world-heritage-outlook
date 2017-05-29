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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the benefit_checksubtype_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkpPersistenceImpl
 * @see benefit_checksubtype_lkpUtil
 * @generated
 */
public interface benefit_checksubtype_lkpPersistence extends BasePersistence<benefit_checksubtype_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link benefit_checksubtype_lkpUtil} to access the benefit_checksubtype_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the benefit_checksubtype_lkp in the entity cache if it is enabled.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp);

	/**
	* Caches the benefit_checksubtype_lkps in the entity cache if it is enabled.
	*
	* @param benefit_checksubtype_lkps the benefit_checksubtype_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> benefit_checksubtype_lkps);

	/**
	* Creates a new benefit_checksubtype_lkp with the primary key. Does not add the benefit_checksubtype_lkp to the database.
	*
	* @param subbenefit_id the primary key for the new benefit_checksubtype_lkp
	* @return the new benefit_checksubtype_lkp
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp create(
		long subbenefit_id);

	/**
	* Removes the benefit_checksubtype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp remove(
		long subbenefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp updateImpl(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefit_checksubtype_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException} if it could not be found.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp findByPrimaryKey(
		long subbenefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefit_checksubtype_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp, or <code>null</code> if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp fetchByPrimaryKey(
		long subbenefit_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefit_checksubtype_lkps where active = &#63;.
	*
	* @param active the active
	* @return the matching benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findByActiveStatus(
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefit_checksubtype_lkps where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @return the range of matching benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findByActiveStatus(
		boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefit_checksubtype_lkps where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findByActiveStatus(
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefit_checksubtype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefit_checksubtype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a matching benefit_checksubtype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp findByActiveStatus_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefit_checksubtype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefit_checksubtype_lkp, or <code>null</code> if a matching benefit_checksubtype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp fetchByActiveStatus_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefit_checksubtype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefit_checksubtype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a matching benefit_checksubtype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp findByActiveStatus_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefit_checksubtype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefit_checksubtype_lkp, or <code>null</code> if a matching benefit_checksubtype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp fetchByActiveStatus_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefit_checksubtype_lkps before and after the current benefit_checksubtype_lkp in the ordered set where active = &#63;.
	*
	* @param subbenefit_id the primary key of the current benefit_checksubtype_lkp
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefit_checksubtype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp[] findByActiveStatus_PrevAndNext(
		long subbenefit_id, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefit_checksubtype_lkps.
	*
	* @return the benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefit_checksubtype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @return the range of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefit_checksubtype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefit_checksubtype_lkps where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByActiveStatus(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefit_checksubtype_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefit_checksubtype_lkps where active = &#63;.
	*
	* @param active the active
	* @return the number of matching benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countByActiveStatus(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefit_checksubtype_lkps.
	*
	* @return the number of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}