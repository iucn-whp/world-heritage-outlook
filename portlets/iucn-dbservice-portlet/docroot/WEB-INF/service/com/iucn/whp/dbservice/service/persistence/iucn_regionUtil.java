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

import com.iucn.whp.dbservice.model.iucn_region;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the iucn_region service. This utility wraps {@link iucn_regionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see iucn_regionPersistence
 * @see iucn_regionPersistenceImpl
 * @generated
 */
public class iucn_regionUtil {
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
	public static void clearCache(iucn_region iucn_region) {
		getPersistence().clearCache(iucn_region);
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
	public static List<iucn_region> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<iucn_region> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<iucn_region> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static iucn_region update(iucn_region iucn_region, boolean merge)
		throws SystemException {
		return getPersistence().update(iucn_region, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static iucn_region update(iucn_region iucn_region, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(iucn_region, merge, serviceContext);
	}

	/**
	* Caches the iucn_region in the entity cache if it is enabled.
	*
	* @param iucn_region the iucn_region
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.iucn_region iucn_region) {
		getPersistence().cacheResult(iucn_region);
	}

	/**
	* Caches the iucn_regions in the entity cache if it is enabled.
	*
	* @param iucn_regions the iucn_regions
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.iucn_region> iucn_regions) {
		getPersistence().cacheResult(iucn_regions);
	}

	/**
	* Creates a new iucn_region with the primary key. Does not add the iucn_region to the database.
	*
	* @param iucn_region_id the primary key for the new iucn_region
	* @return the new iucn_region
	*/
	public static com.iucn.whp.dbservice.model.iucn_region create(
		int iucn_region_id) {
		return getPersistence().create(iucn_region_id);
	}

	/**
	* Removes the iucn_region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region that was removed
	* @throws com.iucn.whp.dbservice.NoSuchiucn_regionException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region remove(
		int iucn_region_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_regionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(iucn_region_id);
	}

	public static com.iucn.whp.dbservice.model.iucn_region updateImpl(
		com.iucn.whp.dbservice.model.iucn_region iucn_region, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(iucn_region, merge);
	}

	/**
	* Returns the iucn_region with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchiucn_regionException} if it could not be found.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region
	* @throws com.iucn.whp.dbservice.NoSuchiucn_regionException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region findByPrimaryKey(
		int iucn_region_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_regionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(iucn_region_id);
	}

	/**
	* Returns the iucn_region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region, or <code>null</code> if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region fetchByPrimaryKey(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(iucn_region_id);
	}

	/**
	* Returns all the iucn_regions.
	*
	* @return the iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the iucn_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_regions
	* @param end the upper bound of the range of iucn_regions (not inclusive)
	* @return the range of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the iucn_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_regions
	* @param end the upper bound of the range of iucn_regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the iucn_regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of iucn_regions.
	*
	* @return the number of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static iucn_regionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (iucn_regionPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					iucn_regionPersistence.class.getName());

			ReferenceRegistry.registerReference(iucn_regionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(iucn_regionPersistence persistence) {
	}

	private static iucn_regionPersistence _persistence;
}