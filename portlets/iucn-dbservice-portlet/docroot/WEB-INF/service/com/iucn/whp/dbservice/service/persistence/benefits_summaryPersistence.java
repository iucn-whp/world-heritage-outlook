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

import com.iucn.whp.dbservice.model.benefits_summary;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the benefits_summary service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefits_summaryPersistenceImpl
 * @see benefits_summaryUtil
 * @generated
 */
public interface benefits_summaryPersistence extends BasePersistence<benefits_summary> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link benefits_summaryUtil} to access the benefits_summary persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the benefits_summary in the entity cache if it is enabled.
	*
	* @param benefits_summary the benefits_summary
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary);

	/**
	* Caches the benefits_summaries in the entity cache if it is enabled.
	*
	* @param benefits_summaries the benefits_summaries
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefits_summary> benefits_summaries);

	/**
	* Creates a new benefits_summary with the primary key. Does not add the benefits_summary to the database.
	*
	* @param benefits_summary_id the primary key for the new benefits_summary
	* @return the new benefits_summary
	*/
	public com.iucn.whp.dbservice.model.benefits_summary create(
		long benefits_summary_id);

	/**
	* Removes the benefits_summary with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary remove(
		long benefits_summary_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.benefits_summary updateImpl(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_summary with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefits_summaryException} if it could not be found.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary findByPrimaryKey(
		long benefits_summary_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_summary with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary, or <code>null</code> if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary fetchByPrimaryKey(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_summaries where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_summaries where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @return the range of matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_summaries where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary findByassessmentId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_summary, or <code>null</code> if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary fetchByassessmentId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary findByassessmentId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_summary, or <code>null</code> if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary fetchByassessmentId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits_summaries before and after the current benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param benefits_summary_id the primary key of the current benefits_summary
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary[] findByassessmentId_PrevAndNext(
		long benefits_summary_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_summaries.
	*
	* @return the benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_summaries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @return the range of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_summaries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefits_summaries where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessmentId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefits_summaries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_summaries where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessmentId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_summaries.
	*
	* @return the number of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}