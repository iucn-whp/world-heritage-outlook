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

import com.iucn.whp.dbservice.model.understanding_benefits;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the understanding_benefits service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see understanding_benefitsPersistenceImpl
 * @see understanding_benefitsUtil
 * @generated
 */
public interface understanding_benefitsPersistence extends BasePersistence<understanding_benefits> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link understanding_benefitsUtil} to access the understanding_benefits persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the understanding_benefits in the entity cache if it is enabled.
	*
	* @param understanding_benefits the understanding_benefits
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.understanding_benefits understanding_benefits);

	/**
	* Caches the understanding_benefitses in the entity cache if it is enabled.
	*
	* @param understanding_benefitses the understanding_benefitses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> understanding_benefitses);

	/**
	* Creates a new understanding_benefits with the primary key. Does not add the understanding_benefits to the database.
	*
	* @param understanding_benefits_id the primary key for the new understanding_benefits
	* @return the new understanding_benefits
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits create(
		long understanding_benefits_id);

	/**
	* Removes the understanding_benefits with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param understanding_benefits_id the primary key of the understanding_benefits
	* @return the understanding_benefits that was removed
	* @throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException if a understanding_benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits remove(
		long understanding_benefits_id)
		throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.understanding_benefits updateImpl(
		com.iucn.whp.dbservice.model.understanding_benefits understanding_benefits,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the understanding_benefits with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException} if it could not be found.
	*
	* @param understanding_benefits_id the primary key of the understanding_benefits
	* @return the understanding_benefits
	* @throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException if a understanding_benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits findByPrimaryKey(
		long understanding_benefits_id)
		throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the understanding_benefits with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param understanding_benefits_id the primary key of the understanding_benefits
	* @return the understanding_benefits, or <code>null</code> if a understanding_benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits fetchByPrimaryKey(
		long understanding_benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the understanding_benefitses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the understanding_benefitses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of understanding_benefitses
	* @param end the upper bound of the range of understanding_benefitses (not inclusive)
	* @return the range of matching understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the understanding_benefitses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of understanding_benefitses
	* @param end the upper bound of the range of understanding_benefitses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first understanding_benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching understanding_benefits
	* @throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException if a matching understanding_benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first understanding_benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching understanding_benefits, or <code>null</code> if a matching understanding_benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last understanding_benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching understanding_benefits
	* @throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException if a matching understanding_benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last understanding_benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching understanding_benefits, or <code>null</code> if a matching understanding_benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the understanding_benefitses before and after the current understanding_benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param understanding_benefits_id the primary key of the current understanding_benefits
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next understanding_benefits
	* @throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException if a understanding_benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.understanding_benefits[] findByassessment_version_id_PrevAndNext(
		long understanding_benefits_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchunderstanding_benefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the understanding_benefitses.
	*
	* @return the understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the understanding_benefitses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of understanding_benefitses
	* @param end the upper bound of the range of understanding_benefitses (not inclusive)
	* @return the range of understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the understanding_benefitses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of understanding_benefitses
	* @param end the upper bound of the range of understanding_benefitses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.understanding_benefits> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the understanding_benefitses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the understanding_benefitses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of understanding_benefitses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of understanding_benefitses.
	*
	* @return the number of understanding_benefitses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}