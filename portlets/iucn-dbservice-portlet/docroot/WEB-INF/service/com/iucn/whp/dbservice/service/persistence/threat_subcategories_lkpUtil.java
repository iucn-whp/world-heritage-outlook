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

import com.iucn.whp.dbservice.model.threat_subcategories_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the threat_subcategories_lkp service. This utility wraps {@link threat_subcategories_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_subcategories_lkpPersistence
 * @see threat_subcategories_lkpPersistenceImpl
 * @generated
 */
public class threat_subcategories_lkpUtil {
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
		threat_subcategories_lkp threat_subcategories_lkp) {
		getPersistence().clearCache(threat_subcategories_lkp);
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
	public static List<threat_subcategories_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<threat_subcategories_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<threat_subcategories_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static threat_subcategories_lkp update(
		threat_subcategories_lkp threat_subcategories_lkp, boolean merge)
		throws SystemException {
		return getPersistence().update(threat_subcategories_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static threat_subcategories_lkp update(
		threat_subcategories_lkp threat_subcategories_lkp, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(threat_subcategories_lkp, merge, serviceContext);
	}

	/**
	* Caches the threat_subcategories_lkp in the entity cache if it is enabled.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp) {
		getPersistence().cacheResult(threat_subcategories_lkp);
	}

	/**
	* Caches the threat_subcategories_lkps in the entity cache if it is enabled.
	*
	* @param threat_subcategories_lkps the threat_subcategories_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> threat_subcategories_lkps) {
		getPersistence().cacheResult(threat_subcategories_lkps);
	}

	/**
	* Creates a new threat_subcategories_lkp with the primary key. Does not add the threat_subcategories_lkp to the database.
	*
	* @param id the primary key for the new threat_subcategories_lkp
	* @return the new threat_subcategories_lkp
	*/
	public static com.iucn.whp.dbservice.model.threat_subcategories_lkp create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the threat_subcategories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_subcategories_lkp remove(
		long id)
		throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.iucn.whp.dbservice.model.threat_subcategories_lkp updateImpl(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(threat_subcategories_lkp, merge);
	}

	/**
	* Returns the threat_subcategories_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException} if it could not be found.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp
	* @throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_subcategories_lkp findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchthreat_subcategories_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the threat_subcategories_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp, or <code>null</code> if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_subcategories_lkp fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the threat_subcategories_lkps.
	*
	* @return the threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the threat_subcategories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_subcategories_lkps
	* @param end the upper bound of the range of threat_subcategories_lkps (not inclusive)
	* @return the range of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the threat_subcategories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_subcategories_lkps
	* @param end the upper bound of the range of threat_subcategories_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the threat_subcategories_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of threat_subcategories_lkps.
	*
	* @return the number of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static threat_subcategories_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (threat_subcategories_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					threat_subcategories_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(threat_subcategories_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(threat_subcategories_lkpPersistence persistence) {
	}

	private static threat_subcategories_lkpPersistence _persistence;
}