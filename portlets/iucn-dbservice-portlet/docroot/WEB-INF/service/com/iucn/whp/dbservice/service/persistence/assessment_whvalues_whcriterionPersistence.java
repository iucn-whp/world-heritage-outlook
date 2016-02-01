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

import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessment_whvalues_whcriterion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_whvalues_whcriterionPersistenceImpl
 * @see assessment_whvalues_whcriterionUtil
 * @generated
 */
public interface assessment_whvalues_whcriterionPersistence
	extends BasePersistence<assessment_whvalues_whcriterion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessment_whvalues_whcriterionUtil} to access the assessment_whvalues_whcriterion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessment_whvalues_whcriterion in the entity cache if it is enabled.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion);

	/**
	* Caches the assessment_whvalues_whcriterions in the entity cache if it is enabled.
	*
	* @param assessment_whvalues_whcriterions the assessment_whvalues_whcriterions
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> assessment_whvalues_whcriterions);

	/**
	* Creates a new assessment_whvalues_whcriterion with the primary key. Does not add the assessment_whvalues_whcriterion to the database.
	*
	* @param wh_criteria_id the primary key for the new assessment_whvalues_whcriterion
	* @return the new assessment_whvalues_whcriterion
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion create(
		long wh_criteria_id);

	/**
	* Removes the assessment_whvalues_whcriterion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion remove(
		long wh_criteria_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion updateImpl(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_whvalues_whcriterion with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException} if it could not be found.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findByPrimaryKey(
		long wh_criteria_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_whvalues_whcriterion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion, or <code>null</code> if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchByPrimaryKey(
		long wh_criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @return the matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param whvalues_id the whvalues_id
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @return the range of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param whvalues_id the whvalues_id
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findBywhvalues_id_First(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues_whcriterion, or <code>null</code> if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchBywhvalues_id_First(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findBywhvalues_id_Last(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues_whcriterion, or <code>null</code> if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchBywhvalues_id_Last(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_whvalues_whcriterions before and after the current assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param wh_criteria_id the primary key of the current assessment_whvalues_whcriterion
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion[] findBywhvalues_id_PrevAndNext(
		long wh_criteria_id, long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_whvalues_whcriterions.
	*
	* @return the assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_whvalues_whcriterions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @return the range of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_whvalues_whcriterions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_whvalues_whcriterions where whvalues_id = &#63; from the database.
	*
	* @param whvalues_id the whvalues_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBywhvalues_id(long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_whvalues_whcriterions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @return the number of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public int countBywhvalues_id(long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_whvalues_whcriterions.
	*
	* @return the number of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}