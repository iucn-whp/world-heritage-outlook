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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the sites_thematic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see sites_thematicPersistenceImpl
 * @see sites_thematicUtil
 * @generated
 */
public interface sites_thematicPersistence extends BasePersistence<sites_thematic> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sites_thematicUtil} to access the sites_thematic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sites_thematic in the entity cache if it is enabled.
	*
	* @param sites_thematic the sites_thematic
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic);

	/**
	* Caches the sites_thematics in the entity cache if it is enabled.
	*
	* @param sites_thematics the sites_thematics
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.sites_thematic> sites_thematics);

	/**
	* Creates a new sites_thematic with the primary key. Does not add the sites_thematic to the database.
	*
	* @param sitethematicid the primary key for the new sites_thematic
	* @return the new sites_thematic
	*/
	public com.iucn.whp.dbservice.model.sites_thematic create(
		long sitethematicid);

	/**
	* Removes the sites_thematic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic that was removed
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic remove(
		long sitethematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.sites_thematic updateImpl(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sites_thematic with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic findByPrimaryKey(
		long sitethematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sites_thematic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic, or <code>null</code> if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic fetchByPrimaryKey(
		long sitethematicid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sites_thematics where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findBysiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic findBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic fetchBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic findBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sites_thematic in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic fetchBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.sites_thematic[] findBysiteId_PrevAndNext(
		long sitethematicid, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sites_thematic where thematicid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	*
	* @param thematicid the thematicid
	* @return the matching sites_thematic
	* @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic findBythematicId(
		long thematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thematicid the thematicid
	* @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic fetchBythematicId(
		long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thematicid the thematicid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic fetchBythematicId(
		long thematicid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sites_thematics.
	*
	* @return the sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.sites_thematic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sites_thematics where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the sites_thematic where thematicid = &#63; from the database.
	*
	* @param thematicid the thematicid
	* @return the sites_thematic that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.sites_thematic removeBythematicId(
		long thematicid)
		throws com.iucn.whp.dbservice.NoSuchsites_thematicException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sites_thematics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sites_thematics where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public int countBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sites_thematics where thematicid = &#63;.
	*
	* @param thematicid the thematicid
	* @return the number of matching sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public int countBythematicId(long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sites_thematics.
	*
	* @return the number of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}