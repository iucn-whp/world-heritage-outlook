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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the benefits_summary service. This utility wraps {@link benefits_summaryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefits_summaryPersistence
 * @see benefits_summaryPersistenceImpl
 * @generated
 */
public class benefits_summaryUtil {
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
	public static void clearCache(benefits_summary benefits_summary) {
		getPersistence().clearCache(benefits_summary);
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
	public static List<benefits_summary> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<benefits_summary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<benefits_summary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static benefits_summary update(benefits_summary benefits_summary,
		boolean merge) throws SystemException {
		return getPersistence().update(benefits_summary, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static benefits_summary update(benefits_summary benefits_summary,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(benefits_summary, merge, serviceContext);
	}

	/**
	* Caches the benefits_summary in the entity cache if it is enabled.
	*
	* @param benefits_summary the benefits_summary
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary) {
		getPersistence().cacheResult(benefits_summary);
	}

	/**
	* Caches the benefits_summaries in the entity cache if it is enabled.
	*
	* @param benefits_summaries the benefits_summaries
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefits_summary> benefits_summaries) {
		getPersistence().cacheResult(benefits_summaries);
	}

	/**
	* Creates a new benefits_summary with the primary key. Does not add the benefits_summary to the database.
	*
	* @param benefits_summary_id the primary key for the new benefits_summary
	* @return the new benefits_summary
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary create(
		long benefits_summary_id) {
		return getPersistence().create(benefits_summary_id);
	}

	/**
	* Removes the benefits_summary with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary remove(
		long benefits_summary_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(benefits_summary_id);
	}

	public static com.iucn.whp.dbservice.model.benefits_summary updateImpl(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(benefits_summary, merge);
	}

	/**
	* Returns the benefits_summary with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefits_summaryException} if it could not be found.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary findByPrimaryKey(
		long benefits_summary_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(benefits_summary_id);
	}

	/**
	* Returns the benefits_summary with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary, or <code>null</code> if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary fetchByPrimaryKey(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(benefits_summary_id);
	}

	/**
	* Returns all the benefits_summaries where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassessmentId(assessment_version_id);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId(assessment_version_id, start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findByassessmentId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary findByassessmentId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_summary, or <code>null</code> if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary fetchByassessmentId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_summary
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary findByassessmentId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last benefits_summary in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_summary, or <code>null</code> if a matching benefits_summary could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary fetchByassessmentId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessmentId_Last(assessment_version_id,
			orderByComparator);
	}

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
	public static com.iucn.whp.dbservice.model.benefits_summary[] findByassessmentId_PrevAndNext(
		long benefits_summary_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_summaryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessmentId_PrevAndNext(benefits_summary_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the benefits_summaries.
	*
	* @return the benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the benefits_summaries where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessmentId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessmentId(assessment_version_id);
	}

	/**
	* Removes all the benefits_summaries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of benefits_summaries where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessmentId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassessmentId(assessment_version_id);
	}

	/**
	* Returns the number of benefits_summaries.
	*
	* @return the number of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static benefits_summaryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (benefits_summaryPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					benefits_summaryPersistence.class.getName());

			ReferenceRegistry.registerReference(benefits_summaryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(benefits_summaryPersistence persistence) {
	}

	private static benefits_summaryPersistence _persistence;
}