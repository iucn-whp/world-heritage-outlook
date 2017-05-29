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

import com.iucn.whp.dbservice.model.whp_sites_soc_reports;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_soc_reports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_soc_reportsPersistenceImpl
 * @see whp_sites_soc_reportsUtil
 * @generated
 */
public interface whp_sites_soc_reportsPersistence extends BasePersistence<whp_sites_soc_reports> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_soc_reportsUtil} to access the whp_sites_soc_reports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_soc_reports in the entity cache if it is enabled.
	*
	* @param whp_sites_soc_reports the whp_sites_soc_reports
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_soc_reports whp_sites_soc_reports);

	/**
	* Caches the whp_sites_soc_reportses in the entity cache if it is enabled.
	*
	* @param whp_sites_soc_reportses the whp_sites_soc_reportses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> whp_sites_soc_reportses);

	/**
	* Creates a new whp_sites_soc_reports with the primary key. Does not add the whp_sites_soc_reports to the database.
	*
	* @param whp_sites_soc_reports_id the primary key for the new whp_sites_soc_reports
	* @return the new whp_sites_soc_reports
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports create(
		long whp_sites_soc_reports_id);

	/**
	* Removes the whp_sites_soc_reports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_soc_reports_id the primary key of the whp_sites_soc_reports
	* @return the whp_sites_soc_reports that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a whp_sites_soc_reports with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports remove(
		long whp_sites_soc_reports_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_soc_reports updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_soc_reports whp_sites_soc_reports,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reports with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException} if it could not be found.
	*
	* @param whp_sites_soc_reports_id the primary key of the whp_sites_soc_reports
	* @return the whp_sites_soc_reports
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a whp_sites_soc_reports with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports findByPrimaryKey(
		long whp_sites_soc_reports_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_soc_reports_id the primary key of the whp_sites_soc_reports
	* @return the whp_sites_soc_reports, or <code>null</code> if a whp_sites_soc_reports with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports fetchByPrimaryKey(
		long whp_sites_soc_reports_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reports where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_soc_reports
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports findByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reports where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_soc_reports, or <code>null</code> if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports fetchByfileId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reports where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_soc_reports, or <code>null</code> if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports fetchByfileId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_soc_reportses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findBySiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_soc_reportses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_soc_reportses
	* @param end the upper bound of the range of whp_sites_soc_reportses (not inclusive)
	* @return the range of matching whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findBySiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_soc_reportses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_soc_reportses
	* @param end the upper bound of the range of whp_sites_soc_reportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findBySiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_soc_reports in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_soc_reports
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports findBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_soc_reports in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_soc_reports, or <code>null</code> if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports fetchBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_soc_reports in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_soc_reports
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports findBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_soc_reports in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_soc_reports, or <code>null</code> if a matching whp_sites_soc_reports could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports fetchBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_soc_reportses before and after the current whp_sites_soc_reports in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_soc_reports_id the primary key of the current whp_sites_soc_reports
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_soc_reports
	* @throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException if a whp_sites_soc_reports with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports[] findBySiteId_PrevAndNext(
		long whp_sites_soc_reports_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_soc_reportses.
	*
	* @return the whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_soc_reportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_soc_reportses
	* @param end the upper bound of the range of whp_sites_soc_reportses (not inclusive)
	* @return the range of whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_soc_reportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_soc_reportses
	* @param end the upper bound of the range of whp_sites_soc_reportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_soc_reports where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the whp_sites_soc_reports that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_soc_reports removeByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_soc_reportses where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_soc_reportses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soc_reportses where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soc_reportses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_soc_reportses.
	*
	* @return the number of whp_sites_soc_reportses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}