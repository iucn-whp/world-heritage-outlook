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

import com.iucn.whp.dbservice.model.site_assessment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the site_assessment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see site_assessmentPersistenceImpl
 * @see site_assessmentUtil
 * @generated
 */
public interface site_assessmentPersistence extends BasePersistence<site_assessment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link site_assessmentUtil} to access the site_assessment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the site_assessment in the entity cache if it is enabled.
	*
	* @param site_assessment the site_assessment
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.site_assessment site_assessment);

	/**
	* Caches the site_assessments in the entity cache if it is enabled.
	*
	* @param site_assessments the site_assessments
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.site_assessment> site_assessments);

	/**
	* Creates a new site_assessment with the primary key. Does not add the site_assessment to the database.
	*
	* @param assessment_id the primary key for the new site_assessment
	* @return the new site_assessment
	*/
	public com.iucn.whp.dbservice.model.site_assessment create(
		long assessment_id);

	/**
	* Removes the site_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment that was removed
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment remove(
		long assessment_id)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.site_assessment updateImpl(
		com.iucn.whp.dbservice.model.site_assessment site_assessment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessment with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsite_assessmentException} if it could not be found.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findByPrimaryKey(
		long assessment_id)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment, or <code>null</code> if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchByPrimaryKey(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessments where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @return the matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBycurrentuserid(
		long current_userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessments where current_userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_userid the current_userid
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBycurrentuserid(
		long current_userid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessments where current_userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_userid the current_userid
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBycurrentuserid(
		long current_userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBycurrentuserid_First(
		long current_userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBycurrentuserid_First(
		long current_userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBycurrentuserid_Last(
		long current_userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBycurrentuserid_Last(
		long current_userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessments before and after the current site_assessment in the ordered set where current_userid = &#63;.
	*
	* @param assessment_id the primary key of the current site_assessment
	* @param current_userid the current_userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment[] findBycurrentuserid_PrevAndNext(
		long assessment_id, long current_userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessments where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBywip_siteids(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessments where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBywip_siteids(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessments where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBywip_siteids(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBywip_siteids_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBywip_siteids_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBywip_siteids_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBywip_siteids_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessments before and after the current site_assessment in the ordered set where site_id = &#63;.
	*
	* @param assessment_id the primary key of the current site_assessment
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment[] findBywip_siteids_PrevAndNext(
		long assessment_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessments where archived = &#63;.
	*
	* @param archived the archived
	* @return the matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findByAllActiveSiteAssessment(
		boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessments where archived = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param archived the archived
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findByAllActiveSiteAssessment(
		boolean archived, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessments where archived = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param archived the archived
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findByAllActiveSiteAssessment(
		boolean archived, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where archived = &#63;.
	*
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findByAllActiveSiteAssessment_First(
		boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where archived = &#63;.
	*
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchByAllActiveSiteAssessment_First(
		boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where archived = &#63;.
	*
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findByAllActiveSiteAssessment_Last(
		boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where archived = &#63;.
	*
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchByAllActiveSiteAssessment_Last(
		boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessments before and after the current site_assessment in the ordered set where archived = &#63;.
	*
	* @param assessment_id the primary key of the current site_assessment
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment[] findByAllActiveSiteAssessment_PrevAndNext(
		long assessment_id, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessments where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @return the matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBysiteAssessmentByFlag(
		boolean is_active, boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessments where is_active = &#63; and archived = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBysiteAssessmentByFlag(
		boolean is_active, boolean archived, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessments where is_active = &#63; and archived = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findBysiteAssessmentByFlag(
		boolean is_active, boolean archived, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBysiteAssessmentByFlag_First(
		boolean is_active, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBysiteAssessmentByFlag_First(
		boolean is_active, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment findBysiteAssessmentByFlag_Last(
		boolean is_active, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment fetchBysiteAssessmentByFlag_Last(
		boolean is_active, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessments before and after the current site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	*
	* @param assessment_id the primary key of the current site_assessment
	* @param is_active the is_active
	* @param archived the archived
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment[] findBysiteAssessmentByFlag_PrevAndNext(
		long assessment_id, boolean is_active, boolean archived,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessments.
	*
	* @return the site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the site_assessments where current_userid = &#63; from the database.
	*
	* @param current_userid the current_userid
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycurrentuserid(long current_userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the site_assessments where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBywip_siteids(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the site_assessments where archived = &#63; from the database.
	*
	* @param archived the archived
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAllActiveSiteAssessment(boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the site_assessments where is_active = &#63; and archived = &#63; from the database.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysiteAssessmentByFlag(boolean is_active, boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the site_assessments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessments where current_userid = &#63;.
	*
	* @param current_userid the current_userid
	* @return the number of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int countBycurrentuserid(long current_userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessments where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int countBywip_siteids(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessments where archived = &#63;.
	*
	* @param archived the archived
	* @return the number of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int countByAllActiveSiteAssessment(boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessments where is_active = &#63; and archived = &#63;.
	*
	* @param is_active the is_active
	* @param archived the archived
	* @return the number of matching site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int countBysiteAssessmentByFlag(boolean is_active, boolean archived)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessments.
	*
	* @return the number of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the site_assessment_versionses associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @return the site_assessment_versionses associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the site_assessment_versionses associated with the site_assessment.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of site_assessment_versionses associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the site_assessment_versionses associated with the site_assessment.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of site_assessment_versionses associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessment_versionses associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @return the number of site_assessment_versionses associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public int getsite_assessment_versionsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the site_assessment_versions is associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @param site_assessment_versionsPK the primary key of the site_assessment_versions
	* @return <code>true</code> if the site_assessment_versions is associated with the site_assessment; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containssite_assessment_versions(long pk,
		long site_assessment_versionsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the site_assessment has any site_assessment_versionses associated with it.
	*
	* @param pk the primary key of the site_assessment to check for associations with site_assessment_versionses
	* @return <code>true</code> if the site_assessment has any site_assessment_versionses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containssite_assessment_versionses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_lang_versions associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @return the assessment_lang_versions associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_lang_versions associated with the site_assessment.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of assessment_lang_versions associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_lang_versions associated with the site_assessment.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_lang_versions associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_lang_versions associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @return the number of assessment_lang_versions associated with the site_assessment
	* @throws SystemException if a system exception occurred
	*/
	public int getassessment_lang_versionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessment_lang_version is associated with the site_assessment.
	*
	* @param pk the primary key of the site_assessment
	* @param assessment_lang_versionPK the primary key of the assessment_lang_version
	* @return <code>true</code> if the assessment_lang_version is associated with the site_assessment; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsassessment_lang_version(long pk,
		long assessment_lang_versionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the site_assessment has any assessment_lang_versions associated with it.
	*
	* @param pk the primary key of the site_assessment to check for associations with assessment_lang_versions
	* @return <code>true</code> if the site_assessment has any assessment_lang_versions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsassessment_lang_versions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}