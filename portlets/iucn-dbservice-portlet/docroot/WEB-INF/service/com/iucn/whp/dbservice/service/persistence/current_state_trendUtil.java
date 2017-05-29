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

import com.iucn.whp.dbservice.model.current_state_trend;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the current_state_trend service. This utility wraps {@link current_state_trendPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_state_trendPersistence
 * @see current_state_trendPersistenceImpl
 * @generated
 */
public class current_state_trendUtil {
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
	public static void clearCache(current_state_trend current_state_trend) {
		getPersistence().clearCache(current_state_trend);
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
	public static List<current_state_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<current_state_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<current_state_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static current_state_trend update(
		current_state_trend current_state_trend, boolean merge)
		throws SystemException {
		return getPersistence().update(current_state_trend, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static current_state_trend update(
		current_state_trend current_state_trend, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(current_state_trend, merge, serviceContext);
	}

	/**
	* Caches the current_state_trend in the entity cache if it is enabled.
	*
	* @param current_state_trend the current_state_trend
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.current_state_trend current_state_trend) {
		getPersistence().cacheResult(current_state_trend);
	}

	/**
	* Caches the current_state_trends in the entity cache if it is enabled.
	*
	* @param current_state_trends the current_state_trends
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_state_trend> current_state_trends) {
		getPersistence().cacheResult(current_state_trends);
	}

	/**
	* Creates a new current_state_trend with the primary key. Does not add the current_state_trend to the database.
	*
	* @param state_trend_id the primary key for the new current_state_trend
	* @return the new current_state_trend
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend create(
		long state_trend_id) {
		return getPersistence().create(state_trend_id);
	}

	/**
	* Removes the current_state_trend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend remove(
		long state_trend_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(state_trend_id);
	}

	public static com.iucn.whp.dbservice.model.current_state_trend updateImpl(
		com.iucn.whp.dbservice.model.current_state_trend current_state_trend,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(current_state_trend, merge);
	}

	/**
	* Returns the current_state_trend with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_state_trendException} if it could not be found.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend findByPrimaryKey(
		long state_trend_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(state_trend_id);
	}

	/**
	* Returns the current_state_trend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend, or <code>null</code> if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend fetchByPrimaryKey(
		long state_trend_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(state_trend_id);
	}

	/**
	* Returns all the current_state_trends where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the current_state_trends where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @return the range of matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the current_state_trends where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_state_trend, or <code>null</code> if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_state_trend, or <code>null</code> if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the current_state_trends before and after the current current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param state_trend_id the primary key of the current current_state_trend
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend[] findByassessment_version_id_PrevAndNext(
		long state_trend_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(state_trend_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the current_state_trends.
	*
	* @return the current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the current_state_trends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @return the range of current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the current_state_trends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the current_state_trends where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the current_state_trends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of current_state_trends where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of current_state_trends.
	*
	* @return the number of current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the current_state_trend_valueses associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @return the current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valueses(pk);
	}

	/**
	* Returns a range of all the current_state_trend_valueses associated with the current_state_trend.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the current_state_trend
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @return the range of current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the current_state_trend_valueses associated with the current_state_trend.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the current_state_trend
	* @param start the lower bound of the range of current_state_trends
	* @param end the upper bound of the range of current_state_trends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getcurrent_state_trend_valueses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of current_state_trend_valueses associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @return the number of current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_state_trend_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the current_state_trend_values is associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @param current_state_trend_valuesPK the primary key of the current_state_trend_values
	* @return <code>true</code> if the current_state_trend_values is associated with the current_state_trend; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trend_values(long pk,
		long current_state_trend_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containscurrent_state_trend_values(pk,
			current_state_trend_valuesPK);
	}

	/**
	* Returns <code>true</code> if the current_state_trend has any current_state_trend_valueses associated with it.
	*
	* @param pk the primary key of the current_state_trend to check for associations with current_state_trend_valueses
	* @return <code>true</code> if the current_state_trend has any current_state_trend_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trend_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containscurrent_state_trend_valueses(pk);
	}

	public static current_state_trendPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (current_state_trendPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					current_state_trendPersistence.class.getName());

			ReferenceRegistry.registerReference(current_state_trendUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(current_state_trendPersistence persistence) {
	}

	private static current_state_trendPersistence _persistence;
}