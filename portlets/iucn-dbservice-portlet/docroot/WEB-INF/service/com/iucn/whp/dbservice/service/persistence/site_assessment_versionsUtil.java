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

import com.iucn.whp.dbservice.model.site_assessment_versions;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the site_assessment_versions service. This utility wraps {@link site_assessment_versionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see site_assessment_versionsPersistence
 * @see site_assessment_versionsPersistenceImpl
 * @generated
 */
public class site_assessment_versionsUtil {
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
		site_assessment_versions site_assessment_versions) {
		getPersistence().clearCache(site_assessment_versions);
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
	public static List<site_assessment_versions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<site_assessment_versions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<site_assessment_versions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static site_assessment_versions update(
		site_assessment_versions site_assessment_versions, boolean merge)
		throws SystemException {
		return getPersistence().update(site_assessment_versions, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static site_assessment_versions update(
		site_assessment_versions site_assessment_versions, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(site_assessment_versions, merge, serviceContext);
	}

	/**
	* Caches the site_assessment_versions in the entity cache if it is enabled.
	*
	* @param site_assessment_versions the site_assessment_versions
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions) {
		getPersistence().cacheResult(site_assessment_versions);
	}

	/**
	* Caches the site_assessment_versionses in the entity cache if it is enabled.
	*
	* @param site_assessment_versionses the site_assessment_versionses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> site_assessment_versionses) {
		getPersistence().cacheResult(site_assessment_versionses);
	}

	/**
	* Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	*
	* @param assessment_version_id the primary key for the new site_assessment_versions
	* @return the new site_assessment_versions
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions create(
		long assessment_version_id) {
		return getPersistence().create(assessment_version_id);
	}

	/**
	* Removes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions remove(
		long assessment_version_id)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(assessment_version_id);
	}

	public static com.iucn.whp.dbservice.model.site_assessment_versions updateImpl(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(site_assessment_versions, merge);
	}

	/**
	* Returns the site_assessment_versions with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException} if it could not be found.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByPrimaryKey(
		long assessment_version_id)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(assessment_version_id);
	}

	/**
	* Returns the site_assessment_versions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions, or <code>null</code> if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByPrimaryKey(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(assessment_version_id);
	}

	/**
	* Returns all the site_assessment_versionses where userid = &#63;.
	*
	* @param userid the userid
	* @return the matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByuserid(
		long userid) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserid(userid);
	}

	/**
	* Returns a range of all the site_assessment_versionses where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByuserid(
		long userid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserid(userid, start, end);
	}

	/**
	* Returns an ordered range of all the site_assessment_versionses where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByuserid(
		long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserid(userid, start, end, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByuserid_First(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserid_First(userid, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByuserid_First(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserid_First(userid, orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByuserid_Last(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserid_Last(userid, orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByuserid_Last(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserid_Last(userid, orderByComparator);
	}

	/**
	* Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where userid = &#63;.
	*
	* @param assessment_version_id the primary key of the current site_assessment_versions
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions[] findByuserid_PrevAndNext(
		long assessment_version_id, long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserid_PrevAndNext(assessment_version_id, userid,
			orderByComparator);
	}

	/**
	* Returns all the site_assessment_versionses where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @return the matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssessmentId(assessment_id);
	}

	/**
	* Returns a range of all the site_assessment_versionses where assessment_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_id the assessment_id
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessment_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssessmentId(assessment_id, start, end);
	}

	/**
	* Returns an ordered range of all the site_assessment_versionses where assessment_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_id the assessment_id
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessment_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentId(assessment_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByAssessmentId_First(
		long assessment_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentId_First(assessment_id, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByAssessmentId_First(
		long assessment_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentId_First(assessment_id, orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByAssessmentId_Last(
		long assessment_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentId_Last(assessment_id, orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByAssessmentId_Last(
		long assessment_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentId_Last(assessment_id, orderByComparator);
	}

	/**
	* Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where assessment_id = &#63;.
	*
	* @param assessment_version_id the primary key of the current site_assessment_versions
	* @param assessment_id the assessment_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions[] findByAssessmentId_PrevAndNext(
		long assessment_version_id, long assessment_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentId_PrevAndNext(assessment_version_id,
			assessment_id, orderByComparator);
	}

	/**
	* Returns all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @return the matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode(assessment_id, version_code);
	}

	/**
	* Returns a range of all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode(assessment_id, version_code,
			start, end);
	}

	/**
	* Returns an ordered range of all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode(assessment_id, version_code,
			start, end, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findBypreviousVersionCode_First(
		long assessment_id, double version_code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode_First(assessment_id,
			version_code, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchBypreviousVersionCode_First(
		long assessment_id, double version_code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBypreviousVersionCode_First(assessment_id,
			version_code, orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findBypreviousVersionCode_Last(
		long assessment_id, double version_code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode_Last(assessment_id, version_code,
			orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchBypreviousVersionCode_Last(
		long assessment_id, double version_code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBypreviousVersionCode_Last(assessment_id,
			version_code, orderByComparator);
	}

	/**
	* Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_version_id the primary key of the current site_assessment_versions
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions[] findBypreviousVersionCode_PrevAndNext(
		long assessment_version_id, long assessment_id, double version_code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypreviousVersionCode_PrevAndNext(assessment_version_id,
			assessment_id, version_code, orderByComparator);
	}

	/**
	* Returns all the site_assessment_versionses where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @return the matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByversionByuserIdAndStageId(
		long userid, long stage_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByversionByuserIdAndStageId(userid, stage_id);
	}

	/**
	* Returns a range of all the site_assessment_versionses where userid = &#63; and stage_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByversionByuserIdAndStageId(
		long userid, long stage_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByversionByuserIdAndStageId(userid, stage_id, start, end);
	}

	/**
	* Returns an ordered range of all the site_assessment_versionses where userid = &#63; and stage_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByversionByuserIdAndStageId(
		long userid, long stage_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByversionByuserIdAndStageId(userid, stage_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByversionByuserIdAndStageId_First(
		long userid, long stage_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByversionByuserIdAndStageId_First(userid, stage_id,
			orderByComparator);
	}

	/**
	* Returns the first site_assessment_versions in the ordered set where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByversionByuserIdAndStageId_First(
		long userid, long stage_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByversionByuserIdAndStageId_First(userid, stage_id,
			orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions findByversionByuserIdAndStageId_Last(
		long userid, long stage_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByversionByuserIdAndStageId_Last(userid, stage_id,
			orderByComparator);
	}

	/**
	* Returns the last site_assessment_versions in the ordered set where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchByversionByuserIdAndStageId_Last(
		long userid, long stage_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByversionByuserIdAndStageId_Last(userid, stage_id,
			orderByComparator);
	}

	/**
	* Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where userid = &#63; and stage_id = &#63;.
	*
	* @param assessment_version_id the primary key of the current site_assessment_versions
	* @param userid the userid
	* @param stage_id the stage_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next site_assessment_versions
	* @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions[] findByversionByuserIdAndStageId_PrevAndNext(
		long assessment_version_id, long userid, long stage_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByversionByuserIdAndStageId_PrevAndNext(assessment_version_id,
			userid, stage_id, orderByComparator);
	}

	/**
	* Returns all the site_assessment_versionses.
	*
	* @return the site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the site_assessment_versionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the site_assessment_versionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the site_assessment_versionses where userid = &#63; from the database.
	*
	* @param userid the userid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserid(long userid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByuserid(userid);
	}

	/**
	* Removes all the site_assessment_versionses where assessment_id = &#63; from the database.
	*
	* @param assessment_id the assessment_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentId(long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssessmentId(assessment_id);
	}

	/**
	* Removes all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63; from the database.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBypreviousVersionCode(long assessment_id,
		double version_code)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBypreviousVersionCode(assessment_id, version_code);
	}

	/**
	* Removes all the site_assessment_versionses where userid = &#63; and stage_id = &#63; from the database.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByversionByuserIdAndStageId(long userid,
		long stage_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByversionByuserIdAndStageId(userid, stage_id);
	}

	/**
	* Removes all the site_assessment_versionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of site_assessment_versionses where userid = &#63;.
	*
	* @param userid the userid
	* @return the number of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserid(long userid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserid(userid);
	}

	/**
	* Returns the number of site_assessment_versionses where assessment_id = &#63;.
	*
	* @param assessment_id the assessment_id
	* @return the number of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentId(long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssessmentId(assessment_id);
	}

	/**
	* Returns the number of site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	*
	* @param assessment_id the assessment_id
	* @param version_code the version_code
	* @return the number of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBypreviousVersionCode(long assessment_id,
		double version_code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBypreviousVersionCode(assessment_id, version_code);
	}

	/**
	* Returns the number of site_assessment_versionses where userid = &#63; and stage_id = &#63;.
	*
	* @param userid the userid
	* @param stage_id the stage_id
	* @return the number of matching site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByversionByuserIdAndStageId(long userid,
		long stage_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByversionByuserIdAndStageId(userid, stage_id);
	}

	/**
	* Returns the number of site_assessment_versionses.
	*
	* @return the number of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the active_conservation_projectses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the active_conservation_projectses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getactive_conservation_projectses(pk);
	}

	/**
	* Returns a range of all the active_conservation_projectses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of active_conservation_projectses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getactive_conservation_projectses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the active_conservation_projectses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of active_conservation_projectses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getactive_conservation_projectses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of active_conservation_projectses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of active_conservation_projectses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getactive_conservation_projectsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getactive_conservation_projectsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the active_conservation_projects is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param active_conservation_projectsPK the primary key of the active_conservation_projects
	* @return <code>true</code> if the active_conservation_projects is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsactive_conservation_projects(long pk,
		long active_conservation_projectsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsactive_conservation_projects(pk,
			active_conservation_projectsPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any active_conservation_projectses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with active_conservation_projectses
	* @return <code>true</code> if the site_assessment_versions has any active_conservation_projectses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsactive_conservation_projectses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsactive_conservation_projectses(pk);
	}

	/**
	* Returns all the assessment_whvalueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the assessment_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessment_whvalueses(pk);
	}

	/**
	* Returns a range of all the assessment_whvalueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of assessment_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessment_whvalueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getassessment_whvalueses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of assessment_whvalueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of assessment_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessment_whvaluesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessment_whvaluesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the assessment_whvalues is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param assessment_whvaluesPK the primary key of the assessment_whvalues
	* @return <code>true</code> if the assessment_whvalues is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessment_whvalues(long pk,
		long assessment_whvaluesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsassessment_whvalues(pk, assessment_whvaluesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any assessment_whvalueses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with assessment_whvalueses
	* @return <code>true</code> if the site_assessment_versions has any assessment_whvalueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessment_whvalueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsassessment_whvalueses(pk);
	}

	/**
	* Returns all the biodiversity_valueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the biodiversity_valueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbiodiversity_valueses(pk);
	}

	/**
	* Returns a range of all the biodiversity_valueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of biodiversity_valueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbiodiversity_valueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the biodiversity_valueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of biodiversity_valueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getbiodiversity_valueses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of biodiversity_valueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of biodiversity_valueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getbiodiversity_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbiodiversity_valuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the biodiversity_values is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param biodiversity_valuesPK the primary key of the biodiversity_values
	* @return <code>true</code> if the biodiversity_values is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbiodiversity_values(long pk,
		long biodiversity_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsbiodiversity_values(pk, biodiversity_valuesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any biodiversity_valueses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with biodiversity_valueses
	* @return <code>true</code> if the site_assessment_versions has any biodiversity_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbiodiversity_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbiodiversity_valueses(pk);
	}

	/**
	* Returns all the current_state_trends associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the current_state_trends associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trends(pk);
	}

	/**
	* Returns a range of all the current_state_trends associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of current_state_trends associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trends(pk, start, end);
	}

	/**
	* Returns an ordered range of all the current_state_trends associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trends associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getcurrent_state_trends(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of current_state_trends associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of current_state_trends associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_state_trendsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trendsSize(pk);
	}

	/**
	* Returns <code>true</code> if the current_state_trend is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param current_state_trendPK the primary key of the current_state_trend
	* @return <code>true</code> if the current_state_trend is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trend(long pk,
		long current_state_trendPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containscurrent_state_trend(pk, current_state_trendPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any current_state_trends associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with current_state_trends
	* @return <code>true</code> if the site_assessment_versions has any current_state_trends associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trends(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containscurrent_state_trends(pk);
	}

	/**
	* Returns all the state_trend_whvalueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the state_trend_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_whvalueses(pk);
	}

	/**
	* Returns a range of all the state_trend_whvalueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of state_trend_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_whvalueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the state_trend_whvalueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_trend_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getstate_trend_whvalueses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of state_trend_whvalueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of state_trend_whvalueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getstate_trend_whvaluesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_whvaluesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the state_trend_whvalues is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param state_trend_whvaluesPK the primary key of the state_trend_whvalues
	* @return <code>true</code> if the state_trend_whvalues is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsstate_trend_whvalues(long pk,
		long state_trend_whvaluesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsstate_trend_whvalues(pk, state_trend_whvaluesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any state_trend_whvalueses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with state_trend_whvalueses
	* @return <code>true</code> if the site_assessment_versions has any state_trend_whvalueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsstate_trend_whvalueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsstate_trend_whvalueses(pk);
	}

	/**
	* Returns all the referenceses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the referenceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getreferenceses(pk);
	}

	/**
	* Returns a range of all the referenceses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of referenceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getreferenceses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the referenceses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of referenceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getreferenceses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of referenceses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of referenceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getreferencesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getreferencesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the references is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param referencesPK the primary key of the references
	* @return <code>true</code> if the references is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsreferences(long pk, long referencesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsreferences(pk, referencesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any referenceses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with referenceses
	* @return <code>true</code> if the site_assessment_versions has any referenceses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsreferenceses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsreferenceses(pk);
	}

	/**
	* Returns all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().geteffective_prot_mgmt_iothreatses(pk);
	}

	/**
	* Returns a range of all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .geteffective_prot_mgmt_iothreatses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .geteffective_prot_mgmt_iothreatses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int geteffective_prot_mgmt_iothreatsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().geteffective_prot_mgmt_iothreatsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the effective_prot_mgmt_iothreats is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param effective_prot_mgmt_iothreatsPK the primary key of the effective_prot_mgmt_iothreats
	* @return <code>true</code> if the effective_prot_mgmt_iothreats is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containseffective_prot_mgmt_iothreats(long pk,
		long effective_prot_mgmt_iothreatsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containseffective_prot_mgmt_iothreats(pk,
			effective_prot_mgmt_iothreatsPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any effective_prot_mgmt_iothreatses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with effective_prot_mgmt_iothreatses
	* @return <code>true</code> if the site_assessment_versions has any effective_prot_mgmt_iothreatses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containseffective_prot_mgmt_iothreatses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containseffective_prot_mgmt_iothreatses(pk);
	}

	/**
	* Returns all the potential_project_needses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the potential_project_needses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_project_needses(pk);
	}

	/**
	* Returns a range of all the potential_project_needses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of potential_project_needses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_project_needses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the potential_project_needses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of potential_project_needses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getpotential_project_needses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of potential_project_needses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of potential_project_needses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getpotential_project_needsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_project_needsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the potential_project_needs is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param potential_project_needsPK the primary key of the potential_project_needs
	* @return <code>true</code> if the potential_project_needs is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_project_needs(long pk,
		long potential_project_needsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containspotential_project_needs(pk,
			potential_project_needsPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any potential_project_needses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with potential_project_needses
	* @return <code>true</code> if the site_assessment_versions has any potential_project_needses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_project_needses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containspotential_project_needses(pk);
	}

	/**
	* Returns all the state_trend_biodivvalses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the state_trend_biodivvalses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_biodivvalses(pk);
	}

	/**
	* Returns a range of all the state_trend_biodivvalses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of state_trend_biodivvalses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_biodivvalses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the state_trend_biodivvalses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_trend_biodivvalses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getstate_trend_biodivvalses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of state_trend_biodivvalses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of state_trend_biodivvalses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getstate_trend_biodivvalsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getstate_trend_biodivvalsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the state_trend_biodivvals is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param state_trend_biodivvalsPK the primary key of the state_trend_biodivvals
	* @return <code>true</code> if the state_trend_biodivvals is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsstate_trend_biodivvals(long pk,
		long state_trend_biodivvalsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsstate_trend_biodivvals(pk, state_trend_biodivvalsPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any state_trend_biodivvalses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with state_trend_biodivvalses
	* @return <code>true</code> if the site_assessment_versions has any state_trend_biodivvalses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsstate_trend_biodivvalses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsstate_trend_biodivvalses(pk);
	}

	/**
	* Returns all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the prot_mgmt_best_practiceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_best_practiceses(pk);
	}

	/**
	* Returns a range of all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of prot_mgmt_best_practiceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_best_practiceses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prot_mgmt_best_practiceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getprot_mgmt_best_practiceses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of prot_mgmt_best_practiceses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of prot_mgmt_best_practiceses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getprot_mgmt_best_practicesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_best_practicesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the prot_mgmt_best_practices is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param prot_mgmt_best_practicesPK the primary key of the prot_mgmt_best_practices
	* @return <code>true</code> if the prot_mgmt_best_practices is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprot_mgmt_best_practices(long pk,
		long prot_mgmt_best_practicesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsprot_mgmt_best_practices(pk,
			prot_mgmt_best_practicesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any prot_mgmt_best_practiceses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with prot_mgmt_best_practiceses
	* @return <code>true</code> if the site_assessment_versions has any prot_mgmt_best_practiceses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprot_mgmt_best_practiceses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsprot_mgmt_best_practiceses(pk);
	}

	/**
	* Returns all the prot_mgmt_overalls associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the prot_mgmt_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_overalls(pk);
	}

	/**
	* Returns a range of all the prot_mgmt_overalls associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of prot_mgmt_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_overalls(pk, start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_overalls associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prot_mgmt_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getprot_mgmt_overalls(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of prot_mgmt_overalls associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of prot_mgmt_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getprot_mgmt_overallsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprot_mgmt_overallsSize(pk);
	}

	/**
	* Returns <code>true</code> if the prot_mgmt_overall is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param prot_mgmt_overallPK the primary key of the prot_mgmt_overall
	* @return <code>true</code> if the prot_mgmt_overall is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprot_mgmt_overall(long pk,
		long prot_mgmt_overallPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsprot_mgmt_overall(pk, prot_mgmt_overallPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any prot_mgmt_overalls associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with prot_mgmt_overalls
	* @return <code>true</code> if the site_assessment_versions has any prot_mgmt_overalls associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprot_mgmt_overalls(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsprot_mgmt_overalls(pk);
	}

	/**
	* Returns all the protection_managements associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the protection_managements associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprotection_managements(pk);
	}

	/**
	* Returns a range of all the protection_managements associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of protection_managements associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprotection_managements(pk, start, end);
	}

	/**
	* Returns an ordered range of all the protection_managements associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protection_managements associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getprotection_managements(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of protection_managements associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of protection_managements associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getprotection_managementsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getprotection_managementsSize(pk);
	}

	/**
	* Returns <code>true</code> if the protection_management is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param protection_managementPK the primary key of the protection_management
	* @return <code>true</code> if the protection_management is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprotection_management(long pk,
		long protection_managementPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsprotection_management(pk, protection_managementPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any protection_managements associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with protection_managements
	* @return <code>true</code> if the site_assessment_versions has any protection_managements associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsprotection_managements(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsprotection_managements(pk);
	}

	/**
	* Returns all the benefits_summaries associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the benefits_summaries associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefits_summaries(pk);
	}

	/**
	* Returns a range of all the benefits_summaries associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of benefits_summaries associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefits_summaries(pk, start, end);
	}

	/**
	* Returns an ordered range of all the benefits_summaries associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefits_summaries associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getbenefits_summaries(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of benefits_summaries associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of benefits_summaries associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefits_summariesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefits_summariesSize(pk);
	}

	/**
	* Returns <code>true</code> if the benefits_summary is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param benefits_summaryPK the primary key of the benefits_summary
	* @return <code>true</code> if the benefits_summary is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefits_summary(long pk,
		long benefits_summaryPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbenefits_summary(pk, benefits_summaryPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any benefits_summaries associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with benefits_summaries
	* @return <code>true</code> if the site_assessment_versions has any benefits_summaries associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefits_summaries(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbenefits_summaries(pk);
	}

	/**
	* Returns all the key_conservation_issueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the key_conservation_issueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getkey_conservation_issueses(pk);
	}

	/**
	* Returns a range of all the key_conservation_issueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of key_conservation_issueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getkey_conservation_issueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the key_conservation_issueses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of key_conservation_issueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getkey_conservation_issueses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of key_conservation_issueses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of key_conservation_issueses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getkey_conservation_issuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getkey_conservation_issuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the key_conservation_issues is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param key_conservation_issuesPK the primary key of the key_conservation_issues
	* @return <code>true</code> if the key_conservation_issues is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containskey_conservation_issues(long pk,
		long key_conservation_issuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containskey_conservation_issues(pk,
			key_conservation_issuesPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any key_conservation_issueses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with key_conservation_issueses
	* @return <code>true</code> if the site_assessment_versions has any key_conservation_issueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containskey_conservation_issueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containskey_conservation_issueses(pk);
	}

	/**
	* Returns all the conservation_outlooks associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the conservation_outlooks associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getconservation_outlooks(pk);
	}

	/**
	* Returns a range of all the conservation_outlooks associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of conservation_outlooks associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getconservation_outlooks(pk, start, end);
	}

	/**
	* Returns an ordered range of all the conservation_outlooks associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conservation_outlooks associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getconservation_outlooks(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of conservation_outlooks associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of conservation_outlooks associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getconservation_outlooksSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getconservation_outlooksSize(pk);
	}

	/**
	* Returns <code>true</code> if the conservation_outlook is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param conservation_outlookPK the primary key of the conservation_outlook
	* @return <code>true</code> if the conservation_outlook is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsconservation_outlook(long pk,
		long conservation_outlookPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsconservation_outlook(pk, conservation_outlookPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any conservation_outlooks associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with conservation_outlooks
	* @return <code>true</code> if the site_assessment_versions has any conservation_outlooks associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsconservation_outlooks(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsconservation_outlooks(pk);
	}

	/**
	* Returns all the benefitses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the benefitses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits> getbenefitses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefitses(pk);
	}

	/**
	* Returns a range of all the benefitses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of benefitses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits> getbenefitses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefitses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the benefitses associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefitses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits> getbenefitses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefitses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of benefitses associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of benefitses associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefitsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefitsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the benefits is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param benefitsPK the primary key of the benefits
	* @return <code>true</code> if the benefits is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefits(long pk, long benefitsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbenefits(pk, benefitsPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any benefitses associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with benefitses
	* @return <code>true</code> if the site_assessment_versions has any benefitses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefitses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbenefitses(pk);
	}

	/**
	* Returns all the assessing_threats_currents associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the assessing_threats_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_currents(pk);
	}

	/**
	* Returns a range of all the assessing_threats_currents associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of assessing_threats_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_currents(pk, start, end);
	}

	/**
	* Returns an ordered range of all the assessing_threats_currents associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessing_threats_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getassessing_threats_currents(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of assessing_threats_currents associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of assessing_threats_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessing_threats_currentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_currentsSize(pk);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_current is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param assessing_threats_currentPK the primary key of the assessing_threats_current
	* @return <code>true</code> if the assessing_threats_current is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessing_threats_current(long pk,
		long assessing_threats_currentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsassessing_threats_current(pk,
			assessing_threats_currentPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any assessing_threats_currents associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with assessing_threats_currents
	* @return <code>true</code> if the site_assessment_versions has any assessing_threats_currents associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessing_threats_currents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsassessing_threats_currents(pk);
	}

	/**
	* Returns all the threat_summary_currents associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the threat_summary_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_currents(pk);
	}

	/**
	* Returns a range of all the threat_summary_currents associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of threat_summary_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_currents(pk, start, end);
	}

	/**
	* Returns an ordered range of all the threat_summary_currents associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_summary_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getthreat_summary_currents(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of threat_summary_currents associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of threat_summary_currents associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getthreat_summary_currentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_currentsSize(pk);
	}

	/**
	* Returns <code>true</code> if the threat_summary_current is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param threat_summary_currentPK the primary key of the threat_summary_current
	* @return <code>true</code> if the threat_summary_current is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_current(long pk,
		long threat_summary_currentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsthreat_summary_current(pk, threat_summary_currentPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any threat_summary_currents associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_currents
	* @return <code>true</code> if the site_assessment_versions has any threat_summary_currents associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_currents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsthreat_summary_currents(pk);
	}

	/**
	* Returns all the threat_summary_potentials associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the threat_summary_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_potentials(pk);
	}

	/**
	* Returns a range of all the threat_summary_potentials associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of threat_summary_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_potentials(pk, start, end);
	}

	/**
	* Returns an ordered range of all the threat_summary_potentials associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_summary_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getthreat_summary_potentials(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of threat_summary_potentials associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of threat_summary_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getthreat_summary_potentialsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_potentialsSize(pk);
	}

	/**
	* Returns <code>true</code> if the threat_summary_potential is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param threat_summary_potentialPK the primary key of the threat_summary_potential
	* @return <code>true</code> if the threat_summary_potential is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_potential(long pk,
		long threat_summary_potentialPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsthreat_summary_potential(pk,
			threat_summary_potentialPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any threat_summary_potentials associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_potentials
	* @return <code>true</code> if the site_assessment_versions has any threat_summary_potentials associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_potentials(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsthreat_summary_potentials(pk);
	}

	/**
	* Returns all the assessing_threats_potentials associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the assessing_threats_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_potentials(pk);
	}

	/**
	* Returns a range of all the assessing_threats_potentials associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of assessing_threats_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_potentials(pk, start, end);
	}

	/**
	* Returns an ordered range of all the assessing_threats_potentials associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessing_threats_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getassessing_threats_potentials(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of assessing_threats_potentials associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of assessing_threats_potentials associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessing_threats_potentialsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessing_threats_potentialsSize(pk);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_potential is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param assessing_threats_potentialPK the primary key of the assessing_threats_potential
	* @return <code>true</code> if the assessing_threats_potential is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessing_threats_potential(long pk,
		long assessing_threats_potentialPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsassessing_threats_potential(pk,
			assessing_threats_potentialPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any assessing_threats_potentials associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with assessing_threats_potentials
	* @return <code>true</code> if the site_assessment_versions has any assessing_threats_potentials associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessing_threats_potentials(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsassessing_threats_potentials(pk);
	}

	/**
	* Returns all the threat_summary_overalls associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the threat_summary_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_overalls(pk);
	}

	/**
	* Returns a range of all the threat_summary_overalls associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of threat_summary_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_overalls(pk, start, end);
	}

	/**
	* Returns an ordered range of all the threat_summary_overalls associated with the site_assessment_versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the site_assessment_versions
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_summary_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getthreat_summary_overalls(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of threat_summary_overalls associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @return the number of threat_summary_overalls associated with the site_assessment_versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getthreat_summary_overallsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getthreat_summary_overallsSize(pk);
	}

	/**
	* Returns <code>true</code> if the threat_summary_overall is associated with the site_assessment_versions.
	*
	* @param pk the primary key of the site_assessment_versions
	* @param threat_summary_overallPK the primary key of the threat_summary_overall
	* @return <code>true</code> if the threat_summary_overall is associated with the site_assessment_versions; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_overall(long pk,
		long threat_summary_overallPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsthreat_summary_overall(pk, threat_summary_overallPK);
	}

	/**
	* Returns <code>true</code> if the site_assessment_versions has any threat_summary_overalls associated with it.
	*
	* @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_overalls
	* @return <code>true</code> if the site_assessment_versions has any threat_summary_overalls associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsthreat_summary_overalls(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsthreat_summary_overalls(pk);
	}

	public static site_assessment_versionsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (site_assessment_versionsPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					site_assessment_versionsPersistence.class.getName());

			ReferenceRegistry.registerReference(site_assessment_versionsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(site_assessment_versionsPersistence persistence) {
	}

	private static site_assessment_versionsPersistence _persistence;
}