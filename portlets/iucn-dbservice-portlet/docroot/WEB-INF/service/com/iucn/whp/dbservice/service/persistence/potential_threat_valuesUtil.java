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

import com.iucn.whp.dbservice.model.potential_threat_values;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the potential_threat_values service. This utility wraps {@link potential_threat_valuesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see potential_threat_valuesPersistence
 * @see potential_threat_valuesPersistenceImpl
 * @generated
 */
public class potential_threat_valuesUtil {
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
		potential_threat_values potential_threat_values) {
		getPersistence().clearCache(potential_threat_values);
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
	public static List<potential_threat_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<potential_threat_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<potential_threat_values> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static potential_threat_values update(
		potential_threat_values potential_threat_values, boolean merge)
		throws SystemException {
		return getPersistence().update(potential_threat_values, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static potential_threat_values update(
		potential_threat_values potential_threat_values, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(potential_threat_values, merge, serviceContext);
	}

	/**
	* Caches the potential_threat_values in the entity cache if it is enabled.
	*
	* @param potential_threat_values the potential_threat_values
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.potential_threat_values potential_threat_values) {
		getPersistence().cacheResult(potential_threat_values);
	}

	/**
	* Caches the potential_threat_valueses in the entity cache if it is enabled.
	*
	* @param potential_threat_valueses the potential_threat_valueses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> potential_threat_valueses) {
		getPersistence().cacheResult(potential_threat_valueses);
	}

	/**
	* Creates a new potential_threat_values with the primary key. Does not add the potential_threat_values to the database.
	*
	* @param potential_threat_values_id the primary key for the new potential_threat_values
	* @return the new potential_threat_values
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values create(
		long potential_threat_values_id) {
		return getPersistence().create(potential_threat_values_id);
	}

	/**
	* Removes the potential_threat_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param potential_threat_values_id the primary key of the potential_threat_values
	* @return the potential_threat_values that was removed
	* @throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException if a potential_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values remove(
		long potential_threat_values_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(potential_threat_values_id);
	}

	public static com.iucn.whp.dbservice.model.potential_threat_values updateImpl(
		com.iucn.whp.dbservice.model.potential_threat_values potential_threat_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(potential_threat_values, merge);
	}

	/**
	* Returns the potential_threat_values with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException} if it could not be found.
	*
	* @param potential_threat_values_id the primary key of the potential_threat_values
	* @return the potential_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException if a potential_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values findByPrimaryKey(
		long potential_threat_values_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(potential_threat_values_id);
	}

	/**
	* Returns the potential_threat_values with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param potential_threat_values_id the primary key of the potential_threat_values
	* @return the potential_threat_values, or <code>null</code> if a potential_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values fetchByPrimaryKey(
		long potential_threat_values_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(potential_threat_values_id);
	}

	/**
	* Returns all the potential_threat_valueses where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @return the matching potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findBypotential_threat_id(
		long potential_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBypotential_threat_id(potential_threat_id);
	}

	/**
	* Returns a range of all the potential_threat_valueses where potential_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param potential_threat_id the potential_threat_id
	* @param start the lower bound of the range of potential_threat_valueses
	* @param end the upper bound of the range of potential_threat_valueses (not inclusive)
	* @return the range of matching potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findBypotential_threat_id(
		long potential_threat_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypotential_threat_id(potential_threat_id, start, end);
	}

	/**
	* Returns an ordered range of all the potential_threat_valueses where potential_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param potential_threat_id the potential_threat_id
	* @param start the lower bound of the range of potential_threat_valueses
	* @param end the upper bound of the range of potential_threat_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findBypotential_threat_id(
		long potential_threat_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypotential_threat_id(potential_threat_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first potential_threat_values in the ordered set where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException if a matching potential_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values findBypotential_threat_id_First(
		long potential_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypotential_threat_id_First(potential_threat_id,
			orderByComparator);
	}

	/**
	* Returns the first potential_threat_values in the ordered set where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_threat_values, or <code>null</code> if a matching potential_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values fetchBypotential_threat_id_First(
		long potential_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBypotential_threat_id_First(potential_threat_id,
			orderByComparator);
	}

	/**
	* Returns the last potential_threat_values in the ordered set where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException if a matching potential_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values findBypotential_threat_id_Last(
		long potential_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypotential_threat_id_Last(potential_threat_id,
			orderByComparator);
	}

	/**
	* Returns the last potential_threat_values in the ordered set where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_threat_values, or <code>null</code> if a matching potential_threat_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values fetchBypotential_threat_id_Last(
		long potential_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBypotential_threat_id_Last(potential_threat_id,
			orderByComparator);
	}

	/**
	* Returns the potential_threat_valueses before and after the current potential_threat_values in the ordered set where potential_threat_id = &#63;.
	*
	* @param potential_threat_values_id the primary key of the current potential_threat_values
	* @param potential_threat_id the potential_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next potential_threat_values
	* @throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException if a potential_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_threat_values[] findBypotential_threat_id_PrevAndNext(
		long potential_threat_values_id, long potential_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_threat_valuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypotential_threat_id_PrevAndNext(potential_threat_values_id,
			potential_threat_id, orderByComparator);
	}

	/**
	* Returns all the potential_threat_valueses.
	*
	* @return the potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the potential_threat_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_threat_valueses
	* @param end the upper bound of the range of potential_threat_valueses (not inclusive)
	* @return the range of potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the potential_threat_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_threat_valueses
	* @param end the upper bound of the range of potential_threat_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the potential_threat_valueses where potential_threat_id = &#63; from the database.
	*
	* @param potential_threat_id the potential_threat_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBypotential_threat_id(long potential_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBypotential_threat_id(potential_threat_id);
	}

	/**
	* Removes all the potential_threat_valueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of potential_threat_valueses where potential_threat_id = &#63;.
	*
	* @param potential_threat_id the potential_threat_id
	* @return the number of matching potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBypotential_threat_id(long potential_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBypotential_threat_id(potential_threat_id);
	}

	/**
	* Returns the number of potential_threat_valueses.
	*
	* @return the number of potential_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static potential_threat_valuesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (potential_threat_valuesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					potential_threat_valuesPersistence.class.getName());

			ReferenceRegistry.registerReference(potential_threat_valuesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(potential_threat_valuesPersistence persistence) {
	}

	private static potential_threat_valuesPersistence _persistence;
}