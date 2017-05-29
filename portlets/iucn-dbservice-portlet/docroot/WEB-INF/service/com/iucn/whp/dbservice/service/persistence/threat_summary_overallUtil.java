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

import com.iucn.whp.dbservice.model.threat_summary_overall;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the threat_summary_overall service. This utility wraps {@link threat_summary_overallPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_overallPersistence
 * @see threat_summary_overallPersistenceImpl
 * @generated
 */
public class threat_summary_overallUtil {
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
	public static void clearCache(threat_summary_overall threat_summary_overall) {
		getPersistence().clearCache(threat_summary_overall);
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
	public static List<threat_summary_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<threat_summary_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<threat_summary_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static threat_summary_overall update(
		threat_summary_overall threat_summary_overall, boolean merge)
		throws SystemException {
		return getPersistence().update(threat_summary_overall, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static threat_summary_overall update(
		threat_summary_overall threat_summary_overall, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(threat_summary_overall, merge, serviceContext);
	}

	/**
	* Caches the threat_summary_overall in the entity cache if it is enabled.
	*
	* @param threat_summary_overall the threat_summary_overall
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall) {
		getPersistence().cacheResult(threat_summary_overall);
	}

	/**
	* Caches the threat_summary_overalls in the entity cache if it is enabled.
	*
	* @param threat_summary_overalls the threat_summary_overalls
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> threat_summary_overalls) {
		getPersistence().cacheResult(threat_summary_overalls);
	}

	/**
	* Creates a new threat_summary_overall with the primary key. Does not add the threat_summary_overall to the database.
	*
	* @param threat_sum_overall_id the primary key for the new threat_summary_overall
	* @return the new threat_summary_overall
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall create(
		long threat_sum_overall_id) {
		return getPersistence().create(threat_sum_overall_id);
	}

	/**
	* Removes the threat_summary_overall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_sum_overall_id the primary key of the threat_summary_overall
	* @return the threat_summary_overall that was removed
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall remove(
		long threat_sum_overall_id)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(threat_sum_overall_id);
	}

	public static com.iucn.whp.dbservice.model.threat_summary_overall updateImpl(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(threat_summary_overall, merge);
	}

	/**
	* Returns the threat_summary_overall with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_summary_overallException} if it could not be found.
	*
	* @param threat_sum_overall_id the primary key of the threat_summary_overall
	* @return the threat_summary_overall
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall findByPrimaryKey(
		long threat_sum_overall_id)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(threat_sum_overall_id);
	}

	/**
	* Returns the threat_summary_overall with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param threat_sum_overall_id the primary key of the threat_summary_overall
	* @return the threat_summary_overall, or <code>null</code> if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall fetchByPrimaryKey(
		long threat_sum_overall_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(threat_sum_overall_id);
	}

	/**
	* Returns all the threat_summary_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the threat_summary_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of threat_summary_overalls
	* @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	* @return the range of matching threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the threat_summary_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of threat_summary_overalls
	* @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching threat_summary_overall
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a matching threat_summary_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching threat_summary_overall, or <code>null</code> if a matching threat_summary_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching threat_summary_overall
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a matching threat_summary_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching threat_summary_overall, or <code>null</code> if a matching threat_summary_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the threat_summary_overalls before and after the current threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param threat_sum_overall_id the primary key of the current threat_summary_overall
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next threat_summary_overall
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_overall[] findByassessment_version_id_PrevAndNext(
		long threat_sum_overall_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(threat_sum_overall_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the threat_summary_overalls.
	*
	* @return the threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the threat_summary_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_overalls
	* @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	* @return the range of threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the threat_summary_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_overalls
	* @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the threat_summary_overalls where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the threat_summary_overalls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of threat_summary_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of threat_summary_overalls.
	*
	* @return the number of threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static threat_summary_overallPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (threat_summary_overallPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					threat_summary_overallPersistence.class.getName());

			ReferenceRegistry.registerReference(threat_summary_overallUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(threat_summary_overallPersistence persistence) {
	}

	private static threat_summary_overallPersistence _persistence;
}