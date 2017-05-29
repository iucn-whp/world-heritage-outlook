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

import com.iucn.whp.dbservice.model.negative_factors_level_impact;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the negative_factors_level_impact service. This utility wraps {@link negative_factors_level_impactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see negative_factors_level_impactPersistence
 * @see negative_factors_level_impactPersistenceImpl
 * @generated
 */
public class negative_factors_level_impactUtil {
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
		negative_factors_level_impact negative_factors_level_impact) {
		getPersistence().clearCache(negative_factors_level_impact);
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
	public static List<negative_factors_level_impact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<negative_factors_level_impact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<negative_factors_level_impact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static negative_factors_level_impact update(
		negative_factors_level_impact negative_factors_level_impact,
		boolean merge) throws SystemException {
		return getPersistence().update(negative_factors_level_impact, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static negative_factors_level_impact update(
		negative_factors_level_impact negative_factors_level_impact,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(negative_factors_level_impact, merge, serviceContext);
	}

	/**
	* Caches the negative_factors_level_impact in the entity cache if it is enabled.
	*
	* @param negative_factors_level_impact the negative_factors_level_impact
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact) {
		getPersistence().cacheResult(negative_factors_level_impact);
	}

	/**
	* Caches the negative_factors_level_impacts in the entity cache if it is enabled.
	*
	* @param negative_factors_level_impacts the negative_factors_level_impacts
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.negative_factors_level_impact> negative_factors_level_impacts) {
		getPersistence().cacheResult(negative_factors_level_impacts);
	}

	/**
	* Creates a new negative_factors_level_impact with the primary key. Does not add the negative_factors_level_impact to the database.
	*
	* @param level_id the primary key for the new negative_factors_level_impact
	* @return the new negative_factors_level_impact
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_level_impact create(
		long level_id) {
		return getPersistence().create(level_id);
	}

	/**
	* Removes the negative_factors_level_impact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param level_id the primary key of the negative_factors_level_impact
	* @return the negative_factors_level_impact that was removed
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException if a negative_factors_level_impact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_level_impact remove(
		long level_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(level_id);
	}

	public static com.iucn.whp.dbservice.model.negative_factors_level_impact updateImpl(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(negative_factors_level_impact, merge);
	}

	/**
	* Returns the negative_factors_level_impact with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException} if it could not be found.
	*
	* @param level_id the primary key of the negative_factors_level_impact
	* @return the negative_factors_level_impact
	* @throws com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException if a negative_factors_level_impact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_level_impact findByPrimaryKey(
		long level_id)
		throws com.iucn.whp.dbservice.NoSuchnegative_factors_level_impactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(level_id);
	}

	/**
	* Returns the negative_factors_level_impact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param level_id the primary key of the negative_factors_level_impact
	* @return the negative_factors_level_impact, or <code>null</code> if a negative_factors_level_impact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.negative_factors_level_impact fetchByPrimaryKey(
		long level_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(level_id);
	}

	/**
	* Returns all the negative_factors_level_impacts.
	*
	* @return the negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_level_impact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the negative_factors_level_impacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of negative_factors_level_impacts
	* @param end the upper bound of the range of negative_factors_level_impacts (not inclusive)
	* @return the range of negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_level_impact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the negative_factors_level_impacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of negative_factors_level_impacts
	* @param end the upper bound of the range of negative_factors_level_impacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.negative_factors_level_impact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the negative_factors_level_impacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of negative_factors_level_impacts.
	*
	* @return the number of negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static negative_factors_level_impactPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (negative_factors_level_impactPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					negative_factors_level_impactPersistence.class.getName());

			ReferenceRegistry.registerReference(negative_factors_level_impactUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		negative_factors_level_impactPersistence persistence) {
	}

	private static negative_factors_level_impactPersistence _persistence;
}