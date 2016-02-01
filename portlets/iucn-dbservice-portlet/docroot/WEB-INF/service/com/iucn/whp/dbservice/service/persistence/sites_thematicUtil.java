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

import com.iucn.whp.dbservice.model.sites_thematic;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the sites_thematic service. This utility wraps {@link sites_thematicPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see sites_thematicPersistence
 * @see sites_thematicPersistenceImpl
 * @generated
 */
public class sites_thematicUtil {
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
	public static void clearCache(sites_thematic sites_thematic) {
		getPersistence().clearCache(sites_thematic);
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
	public static List<sites_thematic> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<sites_thematic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<sites_thematic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static sites_thematic update(sites_thematic sites_thematic,
		boolean merge) throws SystemException {
		return getPersistence().update(sites_thematic, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static sites_thematic update(sites_thematic sites_thematic,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sites_thematic, merge, serviceContext);
	}

	/**
	* Caches the sites_thematic in the entity cache if it is enabled.
	*
	* @param sites_thematic the sites_thematic
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic) {
		getPersistence().cacheResult(sites_thematic);
	}

	/**
	* Caches the sites_thematics in the entity cache if it is enabled.
	*
	* @param sites_thematics the sites_thematics
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.sites_thematic> sites_thematics) {
		getPersistence().cacheResult(sites_thematics);
	}

	/**
	* Creates a new sites_thematic with the primary key. Does not add the sites_thematic to the database.
	*
	* @param sitethematicid the primary key for the new sites_thematic
	* @return the new sites_thematic
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic create(
		long sitethematicid) {
		return getPersistence().create(sitethematicid);
	}

	/**
	* Removes the sites_thematic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic that was removed
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic remove(
		long sitethematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(sitethematicid);
	}

	public static com.iucn.whp.dbservice.model.sites_thematic updateImpl(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sites_thematic, merge);
	}

	/**
	* Returns the sites_thematic with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic findByPrimaryKey(
		long sitethematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(sitethematicid);
	}

	/**
	* Returns the sites_thematic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic, or <code>null</code> if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic fetchByPrimaryKey(
		long sitethematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sitethematicid);
	}

	/**
	* Returns all the sites_thematics where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId(site_id);
	}

	/**
	* Returns a range of all the sites_thematics where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of sites_thematics
	* @param end the upper bound of the range of sites_thematics (not inclusive)
	* @return the range of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId(site_id, start, end);
	}

	/**
	* Returns an ordered range of all the sites_thematics where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of sites_thematics
	* @param end the upper bound of the range of sites_thematics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteId(site_id, start, end, orderByComparator);
	}

	/**
	* Returns the first sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic findBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the first sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic fetchBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the last sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic findBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the last sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic fetchBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the sites_thematics before and after the current sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param sitethematicid the primary key of the current sites_thematic
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic[] findBysiteId_PrevAndNext(
		long sitethematicid, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteId_PrevAndNext(sitethematicid, site_id,
			orderByComparator);
	}

	/**
	* Returns the sites_thematic where thematicid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	*
	* @param thematicid the thematicid
	* @return the matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic findBythematicId(
		long thematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBythematicId(thematicid);
	}

	/**
	* Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thematicid the thematicid
	* @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic fetchBythematicId(
		long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythematicId(thematicid);
	}

	/**
	* Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thematicid the thematicid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic fetchBythematicId(
		long thematicid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythematicId(thematicid, retrieveFromCache);
	}

	/**
	* Returns all the sites_thematics.
	*
	* @return the sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sites_thematics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sites_thematics
	* @param end the upper bound of the range of sites_thematics (not inclusive)
	* @return the range of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sites_thematics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sites_thematics
	* @param end the upper bound of the range of sites_thematics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sites_thematics where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBysiteId(site_id);
	}

	/**
	* Removes the sites_thematic where thematicid = &#63; from the database.
	*
	* @param thematicid the thematicid
	* @return the sites_thematic that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic removeBythematicId(
		long thematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBythematicId(thematicid);
	}

	/**
	* Removes all the sites_thematics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sites_thematics where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysiteId(site_id);
	}

	/**
	* Returns the number of sites_thematics where thematicid = &#63;.
	*
	* @param thematicid the thematicid
	* @return the number of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static int countBythematicId(long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBythematicId(thematicid);
	}

	/**
	* Returns the number of sites_thematics.
	*
	* @return the number of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static sites_thematicPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (sites_thematicPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					sites_thematicPersistence.class.getName());

			ReferenceRegistry.registerReference(sites_thematicUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(sites_thematicPersistence persistence) {
	}

	private static sites_thematicPersistence _persistence;
}