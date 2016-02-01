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

import com.iucn.whp.dbservice.model.protection_management;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the protection_management service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see protection_managementPersistenceImpl
 * @see protection_managementUtil
 * @generated
 */
public interface protection_managementPersistence extends BasePersistence<protection_management> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link protection_managementUtil} to access the protection_management persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the protection_management in the entity cache if it is enabled.
	*
	* @param protection_management the protection_management
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.protection_management protection_management);

	/**
	* Caches the protection_managements in the entity cache if it is enabled.
	*
	* @param protection_managements the protection_managements
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.protection_management> protection_managements);

	/**
	* Creates a new protection_management with the primary key. Does not add the protection_management to the database.
	*
	* @param pm_id the primary key for the new protection_management
	* @return the new protection_management
	*/
	public com.iucn.whp.dbservice.model.protection_management create(long pm_id);

	/**
	* Removes the protection_management with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pm_id the primary key of the protection_management
	* @return the protection_management that was removed
	* @throws com.iucn.whp.dbservice.NoSuchprotection_managementException if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management remove(long pm_id)
		throws com.iucn.whp.dbservice.NoSuchprotection_managementException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.protection_management updateImpl(
		com.iucn.whp.dbservice.model.protection_management protection_management,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the protection_management with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchprotection_managementException} if it could not be found.
	*
	* @param pm_id the primary key of the protection_management
	* @return the protection_management
	* @throws com.iucn.whp.dbservice.NoSuchprotection_managementException if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management findByPrimaryKey(
		long pm_id)
		throws com.iucn.whp.dbservice.NoSuchprotection_managementException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the protection_management with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pm_id the primary key of the protection_management
	* @return the protection_management, or <code>null</code> if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management fetchByPrimaryKey(
		long pm_id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the protection_managements where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the protection_managements where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of protection_managements
	* @param end the upper bound of the range of protection_managements (not inclusive)
	* @return the range of matching protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the protection_managements where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of protection_managements
	* @param end the upper bound of the range of protection_managements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first protection_management in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching protection_management
	* @throws com.iucn.whp.dbservice.NoSuchprotection_managementException if a matching protection_management could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprotection_managementException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first protection_management in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching protection_management, or <code>null</code> if a matching protection_management could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last protection_management in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching protection_management
	* @throws com.iucn.whp.dbservice.NoSuchprotection_managementException if a matching protection_management could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprotection_managementException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last protection_management in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching protection_management, or <code>null</code> if a matching protection_management could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the protection_managements before and after the current protection_management in the ordered set where assessment_version_id = &#63;.
	*
	* @param pm_id the primary key of the current protection_management
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next protection_management
	* @throws com.iucn.whp.dbservice.NoSuchprotection_managementException if a protection_management with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.protection_management[] findByassessment_version_id_PrevAndNext(
		long pm_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprotection_managementException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the protection_managements.
	*
	* @return the protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the protection_managements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_managements
	* @param end the upper bound of the range of protection_managements (not inclusive)
	* @return the range of protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the protection_managements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_managements
	* @param end the upper bound of the range of protection_managements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.protection_management> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the protection_managements where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the protection_managements from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of protection_managements where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of protection_managements.
	*
	* @return the number of protection_managements
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}