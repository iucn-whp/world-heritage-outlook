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

import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the protection_mgmt_checklist_lkp service. This utility wraps {@link protection_mgmt_checklist_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see protection_mgmt_checklist_lkpPersistence
 * @see protection_mgmt_checklist_lkpPersistenceImpl
 * @generated
 */
public class protection_mgmt_checklist_lkpUtil {
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
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp) {
		getPersistence().clearCache(protection_mgmt_checklist_lkp);
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
	public static List<protection_mgmt_checklist_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<protection_mgmt_checklist_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<protection_mgmt_checklist_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static protection_mgmt_checklist_lkp update(
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp,
		boolean merge) throws SystemException {
		return getPersistence().update(protection_mgmt_checklist_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static protection_mgmt_checklist_lkp update(
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(protection_mgmt_checklist_lkp, merge, serviceContext);
	}

	/**
	* Caches the protection_mgmt_checklist_lkp in the entity cache if it is enabled.
	*
	* @param protection_mgmt_checklist_lkp the protection_mgmt_checklist_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp) {
		getPersistence().cacheResult(protection_mgmt_checklist_lkp);
	}

	/**
	* Caches the protection_mgmt_checklist_lkps in the entity cache if it is enabled.
	*
	* @param protection_mgmt_checklist_lkps the protection_mgmt_checklist_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> protection_mgmt_checklist_lkps) {
		getPersistence().cacheResult(protection_mgmt_checklist_lkps);
	}

	/**
	* Creates a new protection_mgmt_checklist_lkp with the primary key. Does not add the protection_mgmt_checklist_lkp to the database.
	*
	* @param topic_id the primary key for the new protection_mgmt_checklist_lkp
	* @return the new protection_mgmt_checklist_lkp
	*/
	public static com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp create(
		long topic_id) {
		return getPersistence().create(topic_id);
	}

	/**
	* Removes the protection_mgmt_checklist_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param topic_id the primary key of the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException if a protection_mgmt_checklist_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp remove(
		long topic_id)
		throws com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(topic_id);
	}

	public static com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp updateImpl(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(protection_mgmt_checklist_lkp, merge);
	}

	/**
	* Returns the protection_mgmt_checklist_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException} if it could not be found.
	*
	* @param topic_id the primary key of the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp
	* @throws com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException if a protection_mgmt_checklist_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp findByPrimaryKey(
		long topic_id)
		throws com.iucn.whp.dbservice.NoSuchprotection_mgmt_checklist_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(topic_id);
	}

	/**
	* Returns the protection_mgmt_checklist_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param topic_id the primary key of the protection_mgmt_checklist_lkp
	* @return the protection_mgmt_checklist_lkp, or <code>null</code> if a protection_mgmt_checklist_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp fetchByPrimaryKey(
		long topic_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(topic_id);
	}

	/**
	* Returns all the protection_mgmt_checklist_lkps.
	*
	* @return the protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the protection_mgmt_checklist_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_mgmt_checklist_lkps
	* @param end the upper bound of the range of protection_mgmt_checklist_lkps (not inclusive)
	* @return the range of protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the protection_mgmt_checklist_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of protection_mgmt_checklist_lkps
	* @param end the upper bound of the range of protection_mgmt_checklist_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the protection_mgmt_checklist_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of protection_mgmt_checklist_lkps.
	*
	* @return the number of protection_mgmt_checklist_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static protection_mgmt_checklist_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (protection_mgmt_checklist_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					protection_mgmt_checklist_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(protection_mgmt_checklist_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		protection_mgmt_checklist_lkpPersistence persistence) {
	}

	private static protection_mgmt_checklist_lkpPersistence _persistence;
}