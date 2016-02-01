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

import com.iucn.whp.dbservice.model.assessment_lang_version;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_lang_version service. This utility wraps {@link assessment_lang_versionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_lang_versionPersistence
 * @see assessment_lang_versionPersistenceImpl
 * @generated
 */
public class assessment_lang_versionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		assessment_lang_version assessment_lang_version) {
		getPersistence().clearCache(assessment_lang_version);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<assessment_lang_version> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_lang_version> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_lang_version> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_lang_version update(
		assessment_lang_version assessment_lang_version, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_lang_version, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_lang_version update(
		assessment_lang_version assessment_lang_version, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessment_lang_version, merge, serviceContext);
	}

	/**
	* Caches the assessment_lang_version in the entity cache if it is enabled.
	*
	* @param assessment_lang_version the assessment_lang_version
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_lang_version assessment_lang_version) {
		getPersistence().cacheResult(assessment_lang_version);
	}

	/**
	* Caches the assessment_lang_versions in the entity cache if it is enabled.
	*
	* @param assessment_lang_versions the assessment_lang_versions
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> assessment_lang_versions) {
		getPersistence().cacheResult(assessment_lang_versions);
	}

	/**
	* Creates a new assessment_lang_version with the primary key. Does not add the assessment_lang_version to the database.
	*
	* @param lang_ver_id the primary key for the new assessment_lang_version
	* @return the new assessment_lang_version
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version create(
		long lang_ver_id) {
		return getPersistence().create(lang_ver_id);
	}

	/**
	* Removes the assessment_lang_version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lang_ver_id the primary key of the assessment_lang_version
	* @return the assessment_lang_version that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version remove(
		long lang_ver_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(lang_ver_id);
	}

	public static com.iucn.whp.dbservice.model.assessment_lang_version updateImpl(
		com.iucn.whp.dbservice.model.assessment_lang_version assessment_lang_version,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_lang_version, merge);
	}

	/**
	* Returns the assessment_lang_version with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_lang_versionException} if it could not be found.
	*
	* @param lang_ver_id the primary key of the assessment_lang_version
	* @return the assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByPrimaryKey(
		long lang_ver_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(lang_ver_id);
	}

	/**
	* Returns the assessment_lang_version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lang_ver_id the primary key of the assessment_lang_version
	* @return the assessment_lang_version, or <code>null</code> if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByPrimaryKey(
		long lang_ver_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lang_ver_id);
	}

	/**
	* Returns all the assessment_lang_versions where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @return the matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentId(
		long assessmentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassessmentId(assessmentid);
	}

	/**
	* Returns a range of all the assessment_lang_versions where assessmentid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @return the range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentId(
		long assessmentid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassessmentId(assessmentid, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_lang_versions where assessmentid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentId(
		long assessmentid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId(assessmentid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentId_First(
		long assessmentid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_First(assessmentid, orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentId_First(
		long assessmentid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentId_First(assessmentid, orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentId_Last(
		long assessmentid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_Last(assessmentid, orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentId_Last(
		long assessmentid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentId_Last(assessmentid, orderByComparator);
	}

	/**
	* Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessmentid = &#63;.
	*
	* @param lang_ver_id the primary key of the current assessment_lang_version
	* @param assessmentid the assessmentid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version[] findByassessmentId_PrevAndNext(
		long lang_ver_id, long assessmentid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_PrevAndNext(lang_ver_id, assessmentid,
			orderByComparator);
	}

	/**
	* Returns all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @return the matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId(assessmentid, languageid);
	}

	/**
	* Returns a range of all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @return the range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId(assessmentid, languageid,
			start, end);
	}

	/**
	* Returns an ordered range of all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId(assessmentid, languageid,
			start, end, orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentIdAndLangId_First(
		long assessmentid, long languageid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId_First(assessmentid, languageid,
			orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentIdAndLangId_First(
		long assessmentid, long languageid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentIdAndLangId_First(assessmentid,
			languageid, orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentIdAndLangId_Last(
		long assessmentid, long languageid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId_Last(assessmentid, languageid,
			orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentIdAndLangId_Last(
		long assessmentid, long languageid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentIdAndLangId_Last(assessmentid, languageid,
			orderByComparator);
	}

	/**
	* Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	*
	* @param lang_ver_id the primary key of the current assessment_lang_version
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version[] findByassessmentIdAndLangId_PrevAndNext(
		long lang_ver_id, long assessmentid, long languageid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentIdAndLangId_PrevAndNext(lang_ver_id,
			assessmentid, languageid, orderByComparator);
	}

	/**
	* Returns all the assessment_lang_versions where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassessmentVersionId(assessment_version_id);
	}

	/**
	* Returns a range of all the assessment_lang_versions where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @return the range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentVersionId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_lang_versions where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentVersionId(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentVersionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentVersionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentVersionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentVersionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version findByassessmentVersionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentVersionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version fetchByassessmentVersionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentVersionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	*
	* @param lang_ver_id the primary key of the current assessment_lang_version
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_lang_version
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_version[] findByassessmentVersionId_PrevAndNext(
		long lang_ver_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentVersionId_PrevAndNext(lang_ver_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the assessment_lang_versions.
	*
	* @return the assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_lang_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @return the range of assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_lang_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_versions
	* @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_version> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_lang_versions where assessmentid = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessmentId(long assessmentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessmentId(assessmentid);
	}

	/**
	* Removes all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessmentIdAndLangId(long assessmentid,
		long languageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessmentIdAndLangId(assessmentid, languageid);
	}

	/**
	* Removes all the assessment_lang_versions where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessmentVersionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessmentVersionId(assessment_version_id);
	}

	/**
	* Removes all the assessment_lang_versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_lang_versions where assessmentid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @return the number of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessmentId(long assessmentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassessmentId(assessmentid);
	}

	/**
	* Returns the number of assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param languageid the languageid
	* @return the number of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessmentIdAndLangId(long assessmentid,
		long languageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessmentIdAndLangId(assessmentid, languageid);
	}

	/**
	* Returns the number of assessment_lang_versions where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessmentVersionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassessmentVersionId(assessment_version_id);
	}

	/**
	* Returns the number of assessment_lang_versions.
	*
	* @return the number of assessment_lang_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_lang_versionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_lang_versionPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_lang_versionPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_lang_versionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_lang_versionPersistence persistence) {
	}

	private static assessment_lang_versionPersistence _persistence;
}