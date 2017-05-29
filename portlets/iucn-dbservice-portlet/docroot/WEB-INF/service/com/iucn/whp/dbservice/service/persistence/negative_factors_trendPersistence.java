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

import com.iucn.whp.dbservice.model.negative_factors_trend;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the negative_factors_trend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see negative_factors_trendPersistenceImpl
 * @see negative_factors_trendUtil
 * @generated
 */
public interface negative_factors_trendPersistence extends BasePersistence<negative_factors_trend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link negative_factors_trendUtil} to access the negative_factors_trend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the negative_factors_trend in the entity cache if it is enabled.
	*
	* @param negative_factors_trend the negative_factors_trend
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.negative_factors_trend negative_factors_trend);

	/**
	* Caches the negative_factors_trends in the entity cache if it is enabled.
	*
	* @param negative_factors_trends the negative_factors_trends
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> negative_factors_trends);

	/**
	* Creates a new negative_factors_trend with the primary key. Does not add the negative_factors_trend to the database.
	*
	* @param trend_id the primary key for the new negative_factors_trend
	* @return the new negative_factors_trend
	*/
	public com.iucn.whp.dbservice.model.negative_factors_trend create(
		long trend_id);

	/**
	* Removes the negative_factors_trend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend that was removed
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_trend remove(
		long trend_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.negative_factors_trend updateImpl(
		com.iucn.whp.dbservice.model.negative_factors_trend negative_factors_trend,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the negative_factors_trend with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchnegative_factors_trendException} if it could not be found.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_trend findByPrimaryKey(
		long trend_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the negative_factors_trend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend, or <code>null</code> if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_trend fetchByPrimaryKey(
		long trend_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the negative_factors_trends.
	*
	* @return the negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the negative_factors_trends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of negative_factors_trends
	* @param end the upper bound of the range of negative_factors_trends (not inclusive)
	* @return the range of negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the negative_factors_trends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of negative_factors_trends
	* @param end the upper bound of the range of negative_factors_trends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the negative_factors_trends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of negative_factors_trends.
	*
	* @return the number of negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}