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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the current_state_trend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_state_trendPersistenceImpl
 * @see current_state_trendUtil
 * @generated
 */
public interface current_state_trendPersistence extends BasePersistence<current_state_trend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link current_state_trendUtil} to access the current_state_trend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the current_state_trend in the entity cache if it is enabled.
	*
	* @param current_state_trend the current_state_trend
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.current_state_trend current_state_trend);

	/**
	* Caches the current_state_trends in the entity cache if it is enabled.
	*
	* @param current_state_trends the current_state_trends
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_state_trend> current_state_trends);

	/**
	* Creates a new current_state_trend with the primary key. Does not add the current_state_trend to the database.
	*
	* @param state_trend_id the primary key for the new current_state_trend
	* @return the new current_state_trend
	*/
	public com.iucn.whp.dbservice.model.current_state_trend create(
		long state_trend_id);

	/**
	* Removes the current_state_trend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend remove(
		long state_trend_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.current_state_trend updateImpl(
		com.iucn.whp.dbservice.model.current_state_trend current_state_trend,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_state_trend with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_state_trendException} if it could not be found.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend findByPrimaryKey(
		long state_trend_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_state_trend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_trend_id the primary key of the current_state_trend
	* @return the current_state_trend, or <code>null</code> if a current_state_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend fetchByPrimaryKey(
		long state_trend_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_state_trends where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_state_trend, or <code>null</code> if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_state_trend
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_state_trend in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_state_trend, or <code>null</code> if a matching current_state_trend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_state_trend fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.current_state_trend[] findByassessment_version_id_PrevAndNext(
		long state_trend_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_state_trends.
	*
	* @return the current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_state_trends where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_state_trends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_state_trends where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_state_trends.
	*
	* @return the number of current_state_trends
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_state_trend_valueses associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @return the current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_state_trend_valueses associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @return the number of current_state_trend_valueses associated with the current_state_trend
	* @throws SystemException if a system exception occurred
	*/
	public int getcurrent_state_trend_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the current_state_trend_values is associated with the current_state_trend.
	*
	* @param pk the primary key of the current_state_trend
	* @param current_state_trend_valuesPK the primary key of the current_state_trend_values
	* @return <code>true</code> if the current_state_trend_values is associated with the current_state_trend; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containscurrent_state_trend_values(long pk,
		long current_state_trend_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the current_state_trend has any current_state_trend_valueses associated with it.
	*
	* @param pk the primary key of the current_state_trend to check for associations with current_state_trend_valueses
	* @return <code>true</code> if the current_state_trend has any current_state_trend_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containscurrent_state_trend_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}