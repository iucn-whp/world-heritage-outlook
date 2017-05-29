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

import com.iucn.whp.dbservice.model.whp_sites_indigenous_communities;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_sites_indigenous_communities service. This utility wraps {@link whp_sites_indigenous_communitiesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_indigenous_communitiesPersistence
 * @see whp_sites_indigenous_communitiesPersistenceImpl
 * @generated
 */
public class whp_sites_indigenous_communitiesUtil {
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
		whp_sites_indigenous_communities whp_sites_indigenous_communities) {
		getPersistence().clearCache(whp_sites_indigenous_communities);
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
	public static List<whp_sites_indigenous_communities> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_sites_indigenous_communities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_sites_indigenous_communities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_sites_indigenous_communities update(
		whp_sites_indigenous_communities whp_sites_indigenous_communities,
		boolean merge) throws SystemException {
		return getPersistence().update(whp_sites_indigenous_communities, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_sites_indigenous_communities update(
		whp_sites_indigenous_communities whp_sites_indigenous_communities,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(whp_sites_indigenous_communities, merge,
			serviceContext);
	}

	/**
	* Caches the whp_sites_indigenous_communities in the entity cache if it is enabled.
	*
	* @param whp_sites_indigenous_communities the whp_sites_indigenous_communities
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities) {
		getPersistence().cacheResult(whp_sites_indigenous_communities);
	}

	/**
	* Caches the whp_sites_indigenous_communitieses in the entity cache if it is enabled.
	*
	* @param whp_sites_indigenous_communitieses the whp_sites_indigenous_communitieses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> whp_sites_indigenous_communitieses) {
		getPersistence().cacheResult(whp_sites_indigenous_communitieses);
	}

	/**
	* Creates a new whp_sites_indigenous_communities with the primary key. Does not add the whp_sites_indigenous_communities to the database.
	*
	* @param whp_sites_indigenous_communities_id the primary key for the new whp_sites_indigenous_communities
	* @return the new whp_sites_indigenous_communities
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_indigenous_communities create(
		long whp_sites_indigenous_communities_id) {
		return getPersistence().create(whp_sites_indigenous_communities_id);
	}

	/**
	* Removes the whp_sites_indigenous_communities with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities_id the primary key of the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException if a whp_sites_indigenous_communities with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_indigenous_communities remove(
		long whp_sites_indigenous_communities_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_indigenous_communities_id);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_indigenous_communities updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .updateImpl(whp_sites_indigenous_communities, merge);
	}

	/**
	* Returns the whp_sites_indigenous_communities with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException} if it could not be found.
	*
	* @param whp_sites_indigenous_communities_id the primary key of the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities
	* @throws com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException if a whp_sites_indigenous_communities with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_indigenous_communities findByPrimaryKey(
		long whp_sites_indigenous_communities_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_indigenous_communitiesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(whp_sites_indigenous_communities_id);
	}

	/**
	* Returns the whp_sites_indigenous_communities with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_indigenous_communities_id the primary key of the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities, or <code>null</code> if a whp_sites_indigenous_communities with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_indigenous_communities fetchByPrimaryKey(
		long whp_sites_indigenous_communities_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(whp_sites_indigenous_communities_id);
	}

	/**
	* Returns all the whp_sites_indigenous_communitieses.
	*
	* @return the whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the whp_sites_indigenous_communitieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_indigenous_communitieses
	* @param end the upper bound of the range of whp_sites_indigenous_communitieses (not inclusive)
	* @return the range of whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_indigenous_communitieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_indigenous_communitieses
	* @param end the upper bound of the range of whp_sites_indigenous_communitieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the whp_sites_indigenous_communitieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_sites_indigenous_communitieses.
	*
	* @return the number of whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_sites_indigenous_communitiesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_sites_indigenous_communitiesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sites_indigenous_communitiesPersistence.class.getName());

			ReferenceRegistry.registerReference(whp_sites_indigenous_communitiesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		whp_sites_indigenous_communitiesPersistence persistence) {
	}

	private static whp_sites_indigenous_communitiesPersistence _persistence;
}