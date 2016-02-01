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

import com.iucn.whp.dbservice.model.prot_mgmt_overall;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the prot_mgmt_overall service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see prot_mgmt_overallPersistenceImpl
 * @see prot_mgmt_overallUtil
 * @generated
 */
public interface prot_mgmt_overallPersistence extends BasePersistence<prot_mgmt_overall> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link prot_mgmt_overallUtil} to access the prot_mgmt_overall persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the prot_mgmt_overall in the entity cache if it is enabled.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall);

	/**
	* Caches the prot_mgmt_overalls in the entity cache if it is enabled.
	*
	* @param prot_mgmt_overalls the prot_mgmt_overalls
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> prot_mgmt_overalls);

	/**
	* Creates a new prot_mgmt_overall with the primary key. Does not add the prot_mgmt_overall to the database.
	*
	* @param pmo_id the primary key for the new prot_mgmt_overall
	* @return the new prot_mgmt_overall
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall create(long pmo_id);

	/**
	* Removes the prot_mgmt_overall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall that was removed
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall remove(long pmo_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.prot_mgmt_overall updateImpl(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prot_mgmt_overall with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException} if it could not be found.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall findByPrimaryKey(
		long pmo_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prot_mgmt_overall with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall, or <code>null</code> if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByPrimaryKey(
		long pmo_id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall findByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall findByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prot_mgmt_overalls before and after the current prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param pmo_id the primary key of the current prot_mgmt_overall
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall[] findByassversionId_PrevAndNext(
		long pmo_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall findByAssessmentVerId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByAssessmentVerId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall findByAssessmentVerId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByAssessmentVerId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prot_mgmt_overalls before and after the current prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param pmo_id the primary key of the current prot_mgmt_overall
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall[] findByAssessmentVerId_PrevAndNext(
		long pmo_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the prot_mgmt_overalls.
	*
	* @return the prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the prot_mgmt_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the prot_mgmt_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prot_mgmt_overalls where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prot_mgmt_overalls where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentVerId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prot_mgmt_overalls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public int countByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentVerId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prot_mgmt_overalls.
	*
	* @return the number of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}