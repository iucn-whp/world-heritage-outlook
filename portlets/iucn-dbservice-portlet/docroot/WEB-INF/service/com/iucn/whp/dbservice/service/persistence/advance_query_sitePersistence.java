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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the advance_query_site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see advance_query_sitePersistenceImpl
 * @see advance_query_siteUtil
 * @generated
 */
public interface advance_query_sitePersistence extends BasePersistence<advance_query_site> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link advance_query_siteUtil} to access the advance_query_site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the advance_query_site in the entity cache if it is enabled.
	*
	* @param advance_query_site the advance_query_site
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site);

	/**
	* Caches the advance_query_sites in the entity cache if it is enabled.
	*
	* @param advance_query_sites the advance_query_sites
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.advance_query_site> advance_query_sites);

	/**
	* Creates a new advance_query_site with the primary key. Does not add the advance_query_site to the database.
	*
	* @param id the primary key for the new advance_query_site
	* @return the new advance_query_site
	*/
	public com.iucn.whp.dbservice.model.advance_query_site create(long id);

	/**
	* Removes the advance_query_site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site that was removed
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site remove(long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.advance_query_site updateImpl(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the advance_query_site with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchadvance_query_siteException} if it could not be found.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the advance_query_site with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site, or <code>null</code> if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the advance_query_sites where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @return the matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site findBybase_cat_tab_name_First(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site fetchBybase_cat_tab_name_First(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site findBybase_cat_tab_name_Last(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site fetchBybase_cat_tab_name_Last(
		java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.advance_query_site[] findBybase_cat_tab_name_PrevAndNext(
		long id, java.lang.String base_tab_name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the advance_query_sites where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @return the matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site findBybase_tab_diplay_name_First(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site fetchBybase_tab_diplay_name_First(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site
	* @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site findBybase_tab_diplay_name_Last(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site fetchBybase_tab_diplay_name_Last(
		java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.advance_query_site[] findBybase_tab_diplay_name_PrevAndNext(
		long id, java.lang.String base_search_val,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the advance_query_sites.
	*
	* @return the advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the advance_query_sites where base_tab_name = &#63; from the database.
	*
	* @param base_tab_name the base_tab_name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBybase_cat_tab_name(java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the advance_query_sites where base_search_val = &#63; from the database.
	*
	* @param base_search_val the base_search_val
	* @throws SystemException if a system exception occurred
	*/
	public void removeBybase_tab_diplay_name(java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the advance_query_sites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of advance_query_sites where base_tab_name = &#63;.
	*
	* @param base_tab_name the base_tab_name
	* @return the number of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public int countBybase_cat_tab_name(java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of advance_query_sites where base_search_val = &#63;.
	*
	* @param base_search_val the base_search_val
	* @return the number of matching advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public int countBybase_tab_diplay_name(java.lang.String base_search_val)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of advance_query_sites.
	*
	* @return the number of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}