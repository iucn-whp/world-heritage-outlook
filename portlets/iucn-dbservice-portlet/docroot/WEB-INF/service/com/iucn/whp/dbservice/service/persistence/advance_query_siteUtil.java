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

import com.iucn.whp.dbservice.model.advance_query_site;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the advance_query_site service. This utility wraps {@link advance_query_sitePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see advance_query_sitePersistence
 * @see advance_query_sitePersistenceImpl
 * @generated
 */
public class advance_query_siteUtil {
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
	public static void clearCache(advance_query_site advance_query_site) {
		getPersistence().clearCache(advance_query_site);
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
	public static List<advance_query_site> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<advance_query_site> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<advance_query_site> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static advance_query_site update(
		advance_query_site advance_query_site, boolean merge)
		throws SystemException {
		return getPersistence().update(advance_query_site, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static advance_query_site update(
		advance_query_site advance_query_site, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(advance_query_site, merge, serviceContext);
	}

	/**
	* Caches the advance_query_site in the entity cache if it is enabled.
	*
	* @param advance_query_site the advance_query_site
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site) {
		getPersistence().cacheResult(advance_query_site);
	}

	/**
	* Caches the advance_query_sites in the entity cache if it is enabled.
	*
	* @param advance_query_sites the advance_query_sites
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.advance_query_site> advance_query_sites) {
		getPersistence().cacheResult(advance_query_sites);
	}

	/**
	* Creates a new advance_query_site with the primary key. Does not add the advance_query_site to the database.
	*
	* @param id the primary key for the new advance_query_site
	* @return the new advance_query_site
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the advance_query_site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site that was removed
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site remove(
		long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.iucn.whp.dbservice.model.advance_query_site updateImpl(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(advance_query_site, merge);
	}

	/**
	* Returns the advance_query_site with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchadvance_query_siteException} if it could not be found.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the advance_query_site with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site, or <code>null</code> if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the advance_query_sites where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @return the matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBybase_cat_tab_name(base_tab_name);
	}

	/**
	* Returns a range of all the advance_query_sites where base_tab_name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param base_tab_name the base_tab_name
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @return the range of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_cat_tab_name(base_tab_name, start, end);
	}

	/**
	* Returns an ordered range of all the advance_query_sites where base_tab_name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param base_tab_name the base_tab_name
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_cat_tab_name(base_tab_name, start, end,
			orderByComparator);
	}

	/**
	* Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site findBybase_cat_tab_name_First(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_cat_tab_name_First(base_tab_name,
			orderByComparator);
	}

	/**
	* Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site fetchBybase_cat_tab_name_First(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybase_cat_tab_name_First(base_tab_name,
			orderByComparator);
	}

	/**
	* Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site findBybase_cat_tab_name_Last(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_cat_tab_name_Last(base_tab_name,
			orderByComparator);
	}

	/**
	* Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site fetchBybase_cat_tab_name_Last(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybase_cat_tab_name_Last(base_tab_name,
			orderByComparator);
	}

	/**
	* Returns the advance_query_sites before and after the current advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param id the primary key of the current advance_query_site
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site[] findBybase_cat_tab_name_PrevAndNext(
		long id, java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_cat_tab_name_PrevAndNext(id, base_tab_name,
			orderByComparator);
	}

	/**
	* Returns all the advance_query_sites where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @return the matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBybase_tab_diplay_name(base_search_val);
	}

	/**
	* Returns a range of all the advance_query_sites where base_search_val = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param base_search_val the base_search_val
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @return the range of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_tab_diplay_name(base_search_val, start, end);
	}

	/**
	* Returns an ordered range of all the advance_query_sites where base_search_val = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param base_search_val the base_search_val
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_tab_diplay_name(base_search_val, start, end,
			orderByComparator);
	}

	/**
	* Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site findBybase_tab_diplay_name_First(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_tab_diplay_name_First(base_search_val,
			orderByComparator);
	}

	/**
	* Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site fetchBybase_tab_diplay_name_First(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybase_tab_diplay_name_First(base_search_val,
			orderByComparator);
	}

	/**
	* Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site findBybase_tab_diplay_name_Last(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_tab_diplay_name_Last(base_search_val,
			orderByComparator);
	}

	/**
	* Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site fetchBybase_tab_diplay_name_Last(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybase_tab_diplay_name_Last(base_search_val,
			orderByComparator);
	}

	/**
	* Returns the advance_query_sites before and after the current advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param id the primary key of the current advance_query_site
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_site[] findBybase_tab_diplay_name_PrevAndNext(
		long id, java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybase_tab_diplay_name_PrevAndNext(id, base_search_val,
			orderByComparator);
	}

	/**
	* Returns all the advance_query_sites.
	*
	* @return the advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the advance_query_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @return the range of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the advance_query_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the advance_query_sites where base_tab_name = &#63; from the database.
	*
	* @param base_tab_name the base_tab_name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBybase_cat_tab_name(java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBybase_cat_tab_name(base_tab_name);
	}

	/**
	* Removes all the advance_query_sites where base_search_val = &#63; from the database.
	*
	* @param base_search_val the base_search_val
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBybase_tab_diplay_name(base_search_val);
	}

	/**
	* Removes all the advance_query_sites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of advance_query_sites where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @return the number of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static int countBybase_cat_tab_name(java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBybase_cat_tab_name(base_tab_name);
	}

	/**
	* Returns the number of advance_query_sites where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @return the number of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static int countBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBybase_tab_diplay_name(base_search_val);
	}

	/**
	* Returns the number of advance_query_sites.
	*
	* @return the number of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static advance_query_sitePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (advance_query_sitePersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					advance_query_sitePersistence.class.getName());

			ReferenceRegistry.registerReference(advance_query_siteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(advance_query_sitePersistence persistence) {
	}

	private static advance_query_sitePersistence _persistence;
}