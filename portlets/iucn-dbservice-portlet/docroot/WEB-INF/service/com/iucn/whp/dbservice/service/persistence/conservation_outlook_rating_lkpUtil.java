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

import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the conservation_outlook_rating_lkp service. This utility wraps {@link conservation_outlook_rating_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see conservation_outlook_rating_lkpPersistence
 * @see conservation_outlook_rating_lkpPersistenceImpl
 * @generated
 */
public class conservation_outlook_rating_lkpUtil {
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
		conservation_outlook_rating_lkp conservation_outlook_rating_lkp) {
		getPersistence().clearCache(conservation_outlook_rating_lkp);
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
	public static List<conservation_outlook_rating_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<conservation_outlook_rating_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<conservation_outlook_rating_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static conservation_outlook_rating_lkp update(
		conservation_outlook_rating_lkp conservation_outlook_rating_lkp,
		boolean merge) throws SystemException {
		return getPersistence().update(conservation_outlook_rating_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static conservation_outlook_rating_lkp update(
		conservation_outlook_rating_lkp conservation_outlook_rating_lkp,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(conservation_outlook_rating_lkp, merge,
			serviceContext);
	}

	/**
	* Caches the conservation_outlook_rating_lkp in the entity cache if it is enabled.
	*
	* @param conservation_outlook_rating_lkp the conservation_outlook_rating_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp) {
		getPersistence().cacheResult(conservation_outlook_rating_lkp);
	}

	/**
	* Caches the conservation_outlook_rating_lkps in the entity cache if it is enabled.
	*
	* @param conservation_outlook_rating_lkps the conservation_outlook_rating_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> conservation_outlook_rating_lkps) {
		getPersistence().cacheResult(conservation_outlook_rating_lkps);
	}

	/**
	* Creates a new conservation_outlook_rating_lkp with the primary key. Does not add the conservation_outlook_rating_lkp to the database.
	*
	* @param co_rating_id the primary key for the new conservation_outlook_rating_lkp
	* @return the new conservation_outlook_rating_lkp
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp create(
		long co_rating_id) {
		return getPersistence().create(co_rating_id);
	}

	/**
	* Removes the conservation_outlook_rating_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param co_rating_id the primary key of the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException if a conservation_outlook_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp remove(
		long co_rating_id)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(co_rating_id);
	}

	public static com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp updateImpl(
		com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp conservation_outlook_rating_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .updateImpl(conservation_outlook_rating_lkp, merge);
	}

	/**
	* Returns the conservation_outlook_rating_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException} if it could not be found.
	*
	* @param co_rating_id the primary key of the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException if a conservation_outlook_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp findByPrimaryKey(
		long co_rating_id)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlook_rating_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(co_rating_id);
	}

	/**
	* Returns the conservation_outlook_rating_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param co_rating_id the primary key of the conservation_outlook_rating_lkp
	* @return the conservation_outlook_rating_lkp, or <code>null</code> if a conservation_outlook_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp fetchByPrimaryKey(
		long co_rating_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(co_rating_id);
	}

	/**
	* Returns all the conservation_outlook_rating_lkps.
	*
	* @return the conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the conservation_outlook_rating_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlook_rating_lkps
	* @param end the upper bound of the range of conservation_outlook_rating_lkps (not inclusive)
	* @return the range of conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the conservation_outlook_rating_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlook_rating_lkps
	* @param end the upper bound of the range of conservation_outlook_rating_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the conservation_outlook_rating_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of conservation_outlook_rating_lkps.
	*
	* @return the number of conservation_outlook_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static conservation_outlook_rating_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (conservation_outlook_rating_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					conservation_outlook_rating_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(conservation_outlook_rating_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		conservation_outlook_rating_lkpPersistence persistence) {
	}

	private static conservation_outlook_rating_lkpPersistence _persistence;
}