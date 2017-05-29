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

import com.iucn.whp.dbservice.model.assessment_validation;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessment_validation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_validationPersistenceImpl
 * @see assessment_validationUtil
 * @generated
 */
public interface assessment_validationPersistence extends BasePersistence<assessment_validation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessment_validationUtil} to access the assessment_validation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessment_validation in the entity cache if it is enabled.
	*
	* @param assessment_validation the assessment_validation
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation);

	/**
	* Caches the assessment_validations in the entity cache if it is enabled.
	*
	* @param assessment_validations the assessment_validations
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_validation> assessment_validations);

	/**
	* Creates a new assessment_validation with the primary key. Does not add the assessment_validation to the database.
	*
	* @param assessment_ver_val_id the primary key for the new assessment_validation
	* @return the new assessment_validation
	*/
	public com.iucn.whp.dbservice.model.assessment_validation create(
		long assessment_ver_val_id);

	/**
	* Removes the assessment_validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation remove(
		long assessment_ver_val_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessment_validation updateImpl(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validation with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation findByPrimaryKey(
		long assessment_ver_val_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation, or <code>null</code> if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation fetchByPrimaryKey(
		long assessment_ver_val_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation findByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_validations where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_validations where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @return the range of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_validations where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation findByassessment_verId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_verId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation findByassessment_verId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_verId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_validations before and after the current assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_ver_val_id the primary key of the current assessment_validation
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation[] findByassessment_verId_PrevAndNext(
		long assessment_ver_val_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_validations.
	*
	* @return the assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @return the range of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the assessment_validation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_validation removeByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_validations where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_verId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_validations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_validations where assessment_version_id = &#63; and assessment_step = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the number of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id,
		long assessment_step)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_validations where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_verId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_validations.
	*
	* @return the number of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}