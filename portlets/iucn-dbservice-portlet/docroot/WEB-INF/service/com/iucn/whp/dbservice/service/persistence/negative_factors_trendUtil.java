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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the negative_factors_trend service. This utility wraps {@link negative_factors_trendPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see negative_factors_trendPersistence
 * @see negative_factors_trendPersistenceImpl
 * @generated
 */
public class negative_factors_trendUtil {
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
	public static void clearCache(negative_factors_trend negative_factors_trend) {
		getPersistence().clearCache(negative_factors_trend);
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
	public static List<negative_factors_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<negative_factors_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<negative_factors_trend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static negative_factors_trend update(
		negative_factors_trend negative_factors_trend, boolean merge)
		throws SystemException {
		return getPersistence().update(negative_factors_trend, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static negative_factors_trend update(
		negative_factors_trend negative_factors_trend, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(negative_factors_trend, merge, serviceContext);
	}

	/**
	* Caches the negative_factors_trend in the entity cache if it is enabled.
	*
	* @param negative_factors_trend the negative_factors_trend
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.negative_factors_trend negative_factors_trend) {
		getPersistence().cacheResult(negative_factors_trend);
	}

	/**
	* Caches the negative_factors_trends in the entity cache if it is enabled.
	*
	* @param negative_factors_trends the negative_factors_trends
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> negative_factors_trends) {
		getPersistence().cacheResult(negative_factors_trends);
	}

	/**
	* Creates a new negative_factors_trend with the primary key. Does not add the negative_factors_trend to the database.
	*
	* @param trend_id the primary key for the new negative_factors_trend
	* @return the new negative_factors_trend
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_trend create(
		long trend_id) {
		return getPersistence().create(trend_id);
	}

	/**
	* Removes the negative_factors_trend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend that was removed
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_trend remove(
		long trend_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(trend_id);
	}

	public static com.iucn.whp.dbservice.model.negative_factors_trend updateImpl(
		com.iucn.whp.dbservice.model.negative_factors_trend negative_factors_trend,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(negative_factors_trend, merge);
	}

	/**
	* Returns the negative_factors_trend with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchnegative_factors_trendException} if it could not be found.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_trend findByPrimaryKey(
		long trend_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_trendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(trend_id);
	}

	/**
	* Returns the negative_factors_trend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trend_id the primary key of the negative_factors_trend
	* @return the negative_factors_trend, or <code>null</code> if a negative_factors_trend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_trend fetchByPrimaryKey(
		long trend_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(trend_id);
	}

	/**
	* Returns all the negative_factors_trends.
	*
	* @return the negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_trend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the negative_factors_trends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of negative_factors_trends.
	*
	* @return the number of negative_factors_trends
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static negative_factors_trendPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (negative_factors_trendPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					negative_factors_trendPersistence.class.getName());

			ReferenceRegistry.registerReference(negative_factors_trendUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(negative_factors_trendPersistence persistence) {
	}

	private static negative_factors_trendPersistence _persistence;
}