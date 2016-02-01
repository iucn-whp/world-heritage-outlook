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

import com.iucn.whp.dbservice.model.benefits_type_ref;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the benefits_type_ref service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_refPersistenceImpl
 * @see benefits_type_refUtil
 * @generated
 */
public interface benefits_type_refPersistence extends BasePersistence<benefits_type_ref> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link benefits_type_refUtil} to access the benefits_type_ref persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the benefits_type_ref in the entity cache if it is enabled.
	*
	* @param benefits_type_ref the benefits_type_ref
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref);

	/**
	* Caches the benefits_type_refs in the entity cache if it is enabled.
	*
	* @param benefits_type_refs the benefits_type_refs
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> benefits_type_refs);

	/**
	* Creates a new benefits_type_ref with the primary key. Does not add the benefits_type_ref to the database.
	*
	* @param benefits_type_ref_id the primary key for the new benefits_type_ref
	* @return the new benefits_type_ref
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref create(
		long benefits_type_ref_id);

	/**
	* Removes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref remove(
		long benefits_type_ref_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.benefits_type_ref updateImpl(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_type_ref with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefits_type_refException} if it could not be found.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref findByPrimaryKey(
		long benefits_type_ref_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_type_ref with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref, or <code>null</code> if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref fetchByPrimaryKey(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_type_refs where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @return the matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_type_refs where benefits_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_type_refs where benefits_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref findByByBenefits_id_First(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref fetchByByBenefits_id_First(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref findByByBenefits_id_Last(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref fetchByByBenefits_id_Last(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_type_ref_id the primary key of the current benefits_type_ref
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref[] findByByBenefits_id_PrevAndNext(
		long benefits_type_ref_id, long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @return the matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref findBytypeId_First(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref fetchBytypeId_First(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref findBytypeId_Last(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref fetchBytypeId_Last(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_type_ref_id the primary key of the current benefits_type_ref
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref[] findBytypeId_PrevAndNext(
		long benefits_type_ref_id, long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_type_refs.
	*
	* @return the benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_type_refs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_type_refs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefits_type_refs where benefits_id = &#63; from the database.
	*
	* @param benefits_id the benefits_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByByBenefits_id(long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63; from the database.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @throws SystemException if a system exception occurred
	*/
	public void removeBytypeId(long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefits_type_refs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_type_refs where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @return the number of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public int countByByBenefits_id(long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @return the number of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public int countBytypeId(long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_type_refs.
	*
	* @return the number of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}