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

import com.iucn.whp.dbservice.model.whp_sites;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sitesPersistenceImpl
 * @see whp_sitesUtil
 * @generated
 */
public interface whp_sitesPersistence extends BasePersistence<whp_sites> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sitesUtil} to access the whp_sites persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites in the entity cache if it is enabled.
	*
	* @param whp_sites the whp_sites
	*/
	public void cacheResult(com.iucn.whp.dbservice.model.whp_sites whp_sites);

	/**
	* Caches the whp_siteses in the entity cache if it is enabled.
	*
	* @param whp_siteses the whp_siteses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites> whp_siteses);

	/**
	* Creates a new whp_sites with the primary key. Does not add the whp_sites to the database.
	*
	* @param site_id the primary key for the new whp_sites
	* @return the new whp_sites
	*/
	public com.iucn.whp.dbservice.model.whp_sites create(long site_id);

	/**
	* Removes the whp_sites with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites remove(long site_id)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites updateImpl(
		com.iucn.whp.dbservice.model.whp_sites whp_sites, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findByPrimaryKey(long site_id)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param site_id the primary key of the whp_sites
	* @return the whp_sites, or <code>null</code> if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchByPrimaryKey(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where name_en = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	*
	* @param name_en the name_en
	* @return the matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findBynameEn(
		java.lang.String name_en)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where name_en = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name_en the name_en
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBynameEn(
		java.lang.String name_en)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where name_en = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name_en the name_en
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBynameEn(
		java.lang.String name_en, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_siteses where active = &#63;.
	*
	* @param active the active
	* @return the matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findByactiveSites(
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_siteses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findByactiveSites(
		boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_siteses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findByactiveSites(
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findByactiveSites_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchByactiveSites_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findByactiveSites_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchByactiveSites_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_siteses before and after the current whp_sites in the ordered set where active = &#63;.
	*
	* @param site_id the primary key of the current whp_sites
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites[] findByactiveSites_PrevAndNext(
		long site_id, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid_small = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	*
	* @param thumbnailid_small the thumbnailid_small
	* @return the matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findBythumbnailid_small(
		long thumbnailid_small)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid_small = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thumbnailid_small the thumbnailid_small
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBythumbnailid_small(
		long thumbnailid_small)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid_small = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thumbnailid_small the thumbnailid_small
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBythumbnailid_small(
		long thumbnailid_small, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	*
	* @param thumbnailid the thumbnailid
	* @return the matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findBythumbnailid(
		long thumbnailid)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thumbnailid the thumbnailid
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBythumbnailid(
		long thumbnailid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where thumbnailid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thumbnailid the thumbnailid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBythumbnailid(
		long thumbnailid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where wdpa_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	*
	* @param wdpa_id the wdpa_id
	* @return the matching whp_sites
	* @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites findBywdpaid(long wdpa_id)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where wdpa_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param wdpa_id the wdpa_id
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBywdpaid(long wdpa_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites where wdpa_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param wdpa_id the wdpa_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites fetchBywdpaid(long wdpa_id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_siteses.
	*
	* @return the whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_siteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_siteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites where name_en = &#63; from the database.
	*
	* @param name_en the name_en
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites removeBynameEn(
		java.lang.String name_en)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_siteses where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByactiveSites(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites where thumbnailid_small = &#63; from the database.
	*
	* @param thumbnailid_small the thumbnailid_small
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites removeBythumbnailid_small(
		long thumbnailid_small)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites where thumbnailid = &#63; from the database.
	*
	* @param thumbnailid the thumbnailid
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites removeBythumbnailid(
		long thumbnailid)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites where wdpa_id = &#63; from the database.
	*
	* @param wdpa_id the wdpa_id
	* @return the whp_sites that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites removeBywdpaid(long wdpa_id)
		throws com.iucn.whp.dbservice.NoSuch_sitesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_siteses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses where name_en = &#63;.
	*
	* @param name_en the name_en
	* @return the number of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countBynameEn(java.lang.String name_en)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countByactiveSites(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses where thumbnailid_small = &#63;.
	*
	* @param thumbnailid_small the thumbnailid_small
	* @return the number of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countBythumbnailid_small(long thumbnailid_small)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses where thumbnailid = &#63;.
	*
	* @param thumbnailid the thumbnailid
	* @return the number of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countBythumbnailid(long thumbnailid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses where wdpa_id = &#63;.
	*
	* @param wdpa_id the wdpa_id
	* @return the number of matching whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countBywdpaid(long wdpa_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_siteses.
	*
	* @return the number of whp_siteses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_countries associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_countries associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_countries associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_countries associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_countries associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_countries associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_countries associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_countries associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_countriesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_country is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_countryPK the primary key of the whp_sites_country
	* @return <code>true</code> if the whp_sites_country is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_country(long pk, long whp_sites_countryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_countries associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_countries
	* @return <code>true</code> if the whp_sites has any whp_sites_countries associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_countries(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_soc_reportses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_soc_reportses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_soc_reportses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_soc_reportses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_soc_reportses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_soc_reportses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soc_reportses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_soc_reportses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_soc_reportsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_soc_reports is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_soc_reportsPK the primary key of the whp_sites_soc_reports
	* @return <code>true</code> if the whp_sites_soc_reports is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_soc_reports(long pk,
		long whp_sites_soc_reportsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_soc_reportses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_soc_reportses
	* @return <code>true</code> if the whp_sites has any whp_sites_soc_reportses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_soc_reportses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_visitorses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_visitorses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_visitorses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_visitorses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_visitorses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_visitorses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_visitorses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_visitorses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_visitorsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_visitors is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_visitorsPK the primary key of the whp_sites_visitors
	* @return <code>true</code> if the whp_sites_visitors is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_visitors(long pk, long whp_sites_visitorsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_visitorses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_visitorses
	* @return <code>true</code> if the whp_sites has any whp_sites_visitorses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_visitorses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_inscription_dates associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_inscription_dates associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_inscription_dates associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_inscription_dates associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_inscription_dates associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_inscription_dates associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_inscription_dates associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_inscription_dates associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_inscription_datesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_inscription_date is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_inscription_datePK the primary key of the whp_sites_inscription_date
	* @return <code>true</code> if the whp_sites_inscription_date is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_inscription_date(long pk,
		long whp_sites_inscription_datePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_inscription_dates associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_inscription_dates
	* @return <code>true</code> if the whp_sites has any whp_sites_inscription_dates associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_inscription_dates(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_budgets associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_budgets associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_budgets associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_budgets associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_budgets associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_budgets associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_budgets associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_budgets associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_budgetsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_budget is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_budgetPK the primary key of the whp_sites_budget
	* @return <code>true</code> if the whp_sites_budget is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_budget(long pk, long whp_sites_budgetPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_budgets associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_budgets
	* @return <code>true</code> if the whp_sites has any whp_sites_budgets associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_budgets(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_flagship_specieses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_flagship_specieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_flagship_specieses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_flagship_specieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_flagship_specieses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_flagship_specieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_flagship_specieses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_flagship_specieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_flagship_speciesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_flagship_species is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_flagship_speciesPK the primary key of the whp_sites_flagship_species
	* @return <code>true</code> if the whp_sites_flagship_species is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_flagship_species(long pk,
		long whp_sites_flagship_speciesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_flagship_specieses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_flagship_specieses
	* @return <code>true</code> if the whp_sites has any whp_sites_flagship_specieses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_flagship_specieses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_mees associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_mees associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_mees associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_mees associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_mees associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_mees associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_mees associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_mees associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_meesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_mee is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_meePK the primary key of the whp_sites_mee
	* @return <code>true</code> if the whp_sites_mee is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_mee(long pk, long whp_sites_meePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_mees associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_mees
	* @return <code>true</code> if the whp_sites has any whp_sites_mees associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_mees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the reinforced_monitorings associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the reinforced_monitorings associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the reinforced_monitorings associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of reinforced_monitorings associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the reinforced_monitorings associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reinforced_monitorings associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of reinforced_monitorings associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of reinforced_monitorings associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getreinforced_monitoringsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the reinforced_monitoring is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param reinforced_monitoringPK the primary key of the reinforced_monitoring
	* @return <code>true</code> if the reinforced_monitoring is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsreinforced_monitoring(long pk,
		long reinforced_monitoringPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any reinforced_monitorings associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with reinforced_monitorings
	* @return <code>true</code> if the whp_sites has any reinforced_monitorings associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsreinforced_monitorings(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_missions associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_missions associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_missions associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_missions associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_missions associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_missions associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_missions associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_missions associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_missionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_mission is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_missionPK the primary key of the whp_sites_mission
	* @return <code>true</code> if the whp_sites_mission is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_mission(long pk, long whp_sites_missionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_missions associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_missions
	* @return <code>true</code> if the whp_sites has any whp_sites_missions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_missions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_external_documentses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_external_documentses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_external_documentses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_external_documentses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_external_documentses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_external_documentses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_external_documentses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_external_documentses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_external_documentsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_external_documents is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_external_documentsPK the primary key of the whp_sites_external_documents
	* @return <code>true</code> if the whp_sites_external_documents is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_external_documents(long pk,
		long whp_sites_external_documentsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_external_documentses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_external_documentses
	* @return <code>true</code> if the whp_sites has any whp_sites_external_documentses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_external_documentses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_contactses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_contactses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_contactses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_contactses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_contactses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_contactses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_contactses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_contactses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_contactsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_contacts is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_contactsPK the primary key of the whp_sites_contacts
	* @return <code>true</code> if the whp_sites_contacts is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_contacts(long pk, long whp_sites_contactsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_contactses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_contactses
	* @return <code>true</code> if the whp_sites has any whp_sites_contactses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_contactses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_iucn_pa_categories associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_iucn_pa_categories associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_iucn_pa_categories associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_iucn_pa_categories associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_iucn_pa_categories associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_iucn_pa_categories associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_iucn_pa_categories associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_iucn_pa_categories associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_iucn_pa_categoriesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_iucn_pa_category is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_iucn_pa_categoryPK the primary key of the whp_sites_iucn_pa_category
	* @return <code>true</code> if the whp_sites_iucn_pa_category is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_iucn_pa_category(long pk,
		long whp_sites_iucn_pa_categoryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_iucn_pa_categories associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_iucn_pa_categories
	* @return <code>true</code> if the whp_sites has any whp_sites_iucn_pa_categories associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_iucn_pa_categories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_other_designationses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_other_designationses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_other_designationses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_other_designationses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_other_designationses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_other_designationses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_other_designationses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_other_designationses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_other_designationsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_other_designations is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_other_designationsPK the primary key of the whp_sites_other_designations
	* @return <code>true</code> if the whp_sites_other_designations is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_other_designations(long pk,
		long whp_sites_other_designationsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_other_designationses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_other_designationses
	* @return <code>true</code> if the whp_sites has any whp_sites_other_designationses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_other_designationses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_indigenous_communitieses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_indigenous_communitieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_indigenous_communitieses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_indigenous_communitieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_indigenous_communitieses associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_indigenous_communitieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_indigenous_communitieses associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_indigenous_communitieses associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_indigenous_communitiesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_indigenous_communities is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_indigenous_communitiesPK the primary key of the whp_sites_indigenous_communities
	* @return <code>true</code> if the whp_sites_indigenous_communities is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_indigenous_communities(long pk,
		long whp_sites_indigenous_communitiesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_indigenous_communitieses associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_indigenous_communitieses
	* @return <code>true</code> if the whp_sites has any whp_sites_indigenous_communitieses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_indigenous_communitieses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_mgmt_plan_states associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_mgmt_plan_states associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_mgmt_plan_states associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_mgmt_plan_states associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_mgmt_plan_states associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_mgmt_plan_states associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_mgmt_plan_states associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_mgmt_plan_states associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_mgmt_plan_statesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_mgmt_plan_state is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_mgmt_plan_statePK the primary key of the whp_sites_mgmt_plan_state
	* @return <code>true</code> if the whp_sites_mgmt_plan_state is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_mgmt_plan_state(long pk,
		long whp_sites_mgmt_plan_statePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_mgmt_plan_states associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_mgmt_plan_states
	* @return <code>true</code> if the whp_sites has any whp_sites_mgmt_plan_states associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_mgmt_plan_states(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_dsocrs associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_dsocrs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_dsocrs associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_dsocrs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_dsocrs associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_dsocrs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_dsocrs associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_dsocrs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_dsocrsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_dsocr is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_dsocrPK the primary key of the whp_sites_dsocr
	* @return <code>true</code> if the whp_sites_dsocr is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_dsocr(long pk, long whp_sites_dsocrPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_dsocrs associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_dsocrs
	* @return <code>true</code> if the whp_sites has any whp_sites_dsocrs associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_dsocrs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_soouvs associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_soouvs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_soouvs associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_soouvs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_soouvs associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_soouvs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soouvs associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_soouvs associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_soouvsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_soouv is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_soouvPK the primary key of the whp_sites_soouv
	* @return <code>true</code> if the whp_sites_soouv is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_soouv(long pk, long whp_sites_soouvPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_soouvs associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_soouvs
	* @return <code>true</code> if the whp_sites has any whp_sites_soouvs associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_soouvs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_components associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_components associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_components associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_components associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_components associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_components associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_components associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_components associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_componentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_component is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_componentPK the primary key of the whp_sites_component
	* @return <code>true</code> if the whp_sites_component is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_component(long pk,
		long whp_sites_componentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_components associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_components
	* @return <code>true</code> if the whp_sites has any whp_sites_components associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_components(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_boundary_modifications associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_boundary_modifications associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_boundary_modifications associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_boundary_modifications associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_boundary_modifications associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_boundary_modifications associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_boundary_modifications associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_boundary_modifications associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_boundary_modificationsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_boundary_modification is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_boundary_modificationPK the primary key of the whp_sites_boundary_modification
	* @return <code>true</code> if the whp_sites_boundary_modification is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_boundary_modification(long pk,
		long whp_sites_boundary_modificationPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_boundary_modifications associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_boundary_modifications
	* @return <code>true</code> if the whp_sites has any whp_sites_boundary_modifications associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_boundary_modifications(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_site_danger_lists associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_site_danger_lists associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_site_danger_lists associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_site_danger_lists associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_site_danger_lists associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_site_danger_lists associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_site_danger_lists associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_site_danger_lists associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_site_danger_listsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_site_danger_list is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_site_danger_listPK the primary key of the whp_site_danger_list
	* @return <code>true</code> if the whp_site_danger_list is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_site_danger_list(long pk,
		long whp_site_danger_listPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_site_danger_lists associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_site_danger_lists
	* @return <code>true</code> if the whp_sites has any whp_site_danger_lists associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_site_danger_lists(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_iucn_recommendations associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_iucn_recommendations associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_iucn_recommendations associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_iucn_recommendations associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_iucn_recommendations associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_iucn_recommendations associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_iucn_recommendations associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_iucn_recommendations associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_iucn_recommendationsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_iucn_recommendation is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_iucn_recommendationPK the primary key of the whp_sites_iucn_recommendation
	* @return <code>true</code> if the whp_sites_iucn_recommendation is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_iucn_recommendation(long pk,
		long whp_sites_iucn_recommendationPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_iucn_recommendations associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_iucn_recommendations
	* @return <code>true</code> if the whp_sites has any whp_sites_iucn_recommendations associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_iucn_recommendations(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_inscription_criterias associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the whp_sites_inscription_criterias associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_inscription_criterias associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @return the range of whp_sites_inscription_criterias associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_inscription_criterias associated with the whp_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the whp_sites
	* @param start the lower bound of the range of whp_siteses
	* @param end the upper bound of the range of whp_siteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_inscription_criterias associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_inscription_criterias associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @return the number of whp_sites_inscription_criterias associated with the whp_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_inscription_criteriasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites_inscription_criteria is associated with the whp_sites.
	*
	* @param pk the primary key of the whp_sites
	* @param whp_sites_inscription_criteriaPK the primary key of the whp_sites_inscription_criteria
	* @return <code>true</code> if the whp_sites_inscription_criteria is associated with the whp_sites; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_inscription_criteria(long pk,
		long whp_sites_inscription_criteriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the whp_sites has any whp_sites_inscription_criterias associated with it.
	*
	* @param pk the primary key of the whp_sites to check for associations with whp_sites_inscription_criterias
	* @return <code>true</code> if the whp_sites has any whp_sites_inscription_criterias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containswhp_sites_inscription_criterias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}