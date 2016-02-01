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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the benefit_checksubtype_lkp service. This utility wraps {@link benefit_checksubtype_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkpPersistence
 * @see benefit_checksubtype_lkpPersistenceImpl
 * @generated
 */
public class benefit_checksubtype_lkpUtil {
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
		benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		getPersistence().clearCache(benefit_checksubtype_lkp);
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
	public static List<benefit_checksubtype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<benefit_checksubtype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<benefit_checksubtype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static benefit_checksubtype_lkp update(
		benefit_checksubtype_lkp benefit_checksubtype_lkp, boolean merge)
		throws SystemException {
		return getPersistence().update(benefit_checksubtype_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static benefit_checksubtype_lkp update(
		benefit_checksubtype_lkp benefit_checksubtype_lkp, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(benefit_checksubtype_lkp, merge, serviceContext);
	}

	/**
	* Caches the benefit_checksubtype_lkp in the entity cache if it is enabled.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		getPersistence().cacheResult(benefit_checksubtype_lkp);
	}

	/**
	* Caches the benefit_checksubtype_lkps in the entity cache if it is enabled.
	*
	* @param benefit_checksubtype_lkps the benefit_checksubtype_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> benefit_checksubtype_lkps) {
		getPersistence().cacheResult(benefit_checksubtype_lkps);
	}

	/**
	* Creates a new benefit_checksubtype_lkp with the primary key. Does not add the benefit_checksubtype_lkp to the database.
	*
	* @param subbenefit_id the primary key for the new benefit_checksubtype_lkp
	* @return the new benefit_checksubtype_lkp
	*/
	public static com.iucn.whp.dbservice.model.benefit_checksubtype_lkp create(
		long subbenefit_id) {
		return getPersistence().create(subbenefit_id);
	}

	/**
	* Removes the benefit_checksubtype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checksubtype_lkp remove(
		long subbenefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(subbenefit_id);
	}

	public static com.iucn.whp.dbservice.model.benefit_checksubtype_lkp updateImpl(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(benefit_checksubtype_lkp, merge);
	}

	/**
	* Returns the benefit_checksubtype_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException} if it could not be found.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checksubtype_lkp findByPrimaryKey(
		long subbenefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(subbenefit_id);
	}

	/**
	* Returns the benefit_checksubtype_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp, or <code>null</code> if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checksubtype_lkp fetchByPrimaryKey(
		long subbenefit_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(subbenefit_id);
	}

	/**
	* Returns all the benefit_checksubtype_lkps.
	*
	* @return the benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the benefit_checksubtype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @return the range of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the benefit_checksubtype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the benefit_checksubtype_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of benefit_checksubtype_lkps.
	*
	* @return the number of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static benefit_checksubtype_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (benefit_checksubtype_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					benefit_checksubtype_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(benefit_checksubtype_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(benefit_checksubtype_lkpPersistence persistence) {
	}

	private static benefit_checksubtype_lkpPersistence _persistence;
}