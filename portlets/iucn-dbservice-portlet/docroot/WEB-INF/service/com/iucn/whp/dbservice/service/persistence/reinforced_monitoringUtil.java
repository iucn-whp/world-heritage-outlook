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

import com.iucn.whp.dbservice.model.reinforced_monitoring;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the reinforced_monitoring service. This utility wraps {@link reinforced_monitoringPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringPersistence
 * @see reinforced_monitoringPersistenceImpl
 * @generated
 */
public class reinforced_monitoringUtil {
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
	public static void clearCache(reinforced_monitoring reinforced_monitoring) {
		getPersistence().clearCache(reinforced_monitoring);
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
	public static List<reinforced_monitoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<reinforced_monitoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<reinforced_monitoring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static reinforced_monitoring update(
		reinforced_monitoring reinforced_monitoring, boolean merge)
		throws SystemException {
		return getPersistence().update(reinforced_monitoring, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static reinforced_monitoring update(
		reinforced_monitoring reinforced_monitoring, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(reinforced_monitoring, merge, serviceContext);
	}

	/**
	* Caches the reinforced_monitoring in the entity cache if it is enabled.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring) {
		getPersistence().cacheResult(reinforced_monitoring);
	}

	/**
	* Caches the reinforced_monitorings in the entity cache if it is enabled.
	*
	* @param reinforced_monitorings the reinforced_monitorings
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> reinforced_monitorings) {
		getPersistence().cacheResult(reinforced_monitorings);
	}

	/**
	* Creates a new reinforced_monitoring with the primary key. Does not add the reinforced_monitoring to the database.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key for the new reinforced_monitoring
	* @return the new reinforced_monitoring
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring create(
		long whp_sites_reinforced_monitoring_id) {
		return getPersistence().create(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Removes the reinforced_monitoring with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring that was removed
	* @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring remove(
		long whp_sites_reinforced_monitoring_id)
		throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_reinforced_monitoring_id);
	}

	public static com.iucn.whp.dbservice.model.reinforced_monitoring updateImpl(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(reinforced_monitoring, merge);
	}

	/**
	* Returns the reinforced_monitoring with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchreinforced_monitoringException} if it could not be found.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring
	* @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring findByPrimaryKey(
		long whp_sites_reinforced_monitoring_id)
		throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Returns the reinforced_monitoring with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring, or <code>null</code> if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring fetchByPrimaryKey(
		long whp_sites_reinforced_monitoring_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Returns all the reinforced_monitorings.
	*
	* @return the reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the reinforced_monitorings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of reinforced_monitorings
	* @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	* @return the range of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the reinforced_monitorings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of reinforced_monitorings
	* @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the reinforced_monitorings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of reinforced_monitorings.
	*
	* @return the number of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static reinforced_monitoringPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (reinforced_monitoringPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					reinforced_monitoringPersistence.class.getName());

			ReferenceRegistry.registerReference(reinforced_monitoringUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(reinforced_monitoringPersistence persistence) {
	}

	private static reinforced_monitoringPersistence _persistence;
}