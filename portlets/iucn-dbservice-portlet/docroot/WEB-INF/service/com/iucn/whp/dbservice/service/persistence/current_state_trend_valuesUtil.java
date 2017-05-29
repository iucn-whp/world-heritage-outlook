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

import com.iucn.whp.dbservice.model.current_state_trend_values;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the current_state_trend_values service. This utility wraps {@link current_state_trend_valuesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_state_trend_valuesPersistence
 * @see current_state_trend_valuesPersistenceImpl
 * @generated
 */
public class current_state_trend_valuesUtil {
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
		current_state_trend_values current_state_trend_values) {
		getPersistence().clearCache(current_state_trend_values);
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
	public static List<current_state_trend_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<current_state_trend_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<current_state_trend_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static current_state_trend_values update(
		current_state_trend_values current_state_trend_values, boolean merge)
		throws SystemException {
		return getPersistence().update(current_state_trend_values, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static current_state_trend_values update(
		current_state_trend_values current_state_trend_values, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(current_state_trend_values, merge, serviceContext);
	}

	/**
	* Caches the current_state_trend_values in the entity cache if it is enabled.
	*
	* @param current_state_trend_values the current_state_trend_values
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.current_state_trend_values current_state_trend_values) {
		getPersistence().cacheResult(current_state_trend_values);
	}

	/**
	* Caches the current_state_trend_valueses in the entity cache if it is enabled.
	*
	* @param current_state_trend_valueses the current_state_trend_valueses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> current_state_trend_valueses) {
		getPersistence().cacheResult(current_state_trend_valueses);
	}

	/**
	* Creates a new current_state_trend_values with the primary key. Does not add the current_state_trend_values to the database.
	*
	* @param id the primary key for the new current_state_trend_values
	* @return the new current_state_trend_values
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend_values create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the current_state_trend_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend_values remove(
		long id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.iucn.whp.dbservice.model.current_state_trend_values updateImpl(
		com.iucn.whp.dbservice.model.current_state_trend_values current_state_trend_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(current_state_trend_values, merge);
	}

	/**
	* Returns the current_state_trend_values with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException} if it could not be found.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend_values findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_state_trend_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the current_state_trend_values with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the current_state_trend_values
	* @return the current_state_trend_values, or <code>null</code> if a current_state_trend_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_state_trend_values fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the current_state_trend_valueses.
	*
	* @return the current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the current_state_trend_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trend_valueses
	* @param end the upper bound of the range of current_state_trend_valueses (not inclusive)
	* @return the range of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the current_state_trend_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_state_trend_valueses
	* @param end the upper bound of the range of current_state_trend_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the current_state_trend_valueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of current_state_trend_valueses.
	*
	* @return the number of current_state_trend_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static current_state_trend_valuesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (current_state_trend_valuesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					current_state_trend_valuesPersistence.class.getName());

			ReferenceRegistry.registerReference(current_state_trend_valuesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		current_state_trend_valuesPersistence persistence) {
	}

	private static current_state_trend_valuesPersistence _persistence;
}