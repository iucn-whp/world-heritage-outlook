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

import com.iucn.whp.dbservice.model.whp_sites_flagship_species;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_flagship_species service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_flagship_speciesPersistenceImpl
 * @see whp_sites_flagship_speciesUtil
 * @generated
 */
public interface whp_sites_flagship_speciesPersistence extends BasePersistence<whp_sites_flagship_species> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_flagship_speciesUtil} to access the whp_sites_flagship_species persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_flagship_species in the entity cache if it is enabled.
	*
	* @param whp_sites_flagship_species the whp_sites_flagship_species
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species);

	/**
	* Caches the whp_sites_flagship_specieses in the entity cache if it is enabled.
	*
	* @param whp_sites_flagship_specieses the whp_sites_flagship_specieses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> whp_sites_flagship_specieses);

	/**
	* Creates a new whp_sites_flagship_species with the primary key. Does not add the whp_sites_flagship_species to the database.
	*
	* @param whp_sites_flagship_species_id the primary key for the new whp_sites_flagship_species
	* @return the new whp_sites_flagship_species
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species create(
		long whp_sites_flagship_species_id);

	/**
	* Removes the whp_sites_flagship_species with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species_id the primary key of the whp_sites_flagship_species
	* @return the whp_sites_flagship_species that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species remove(
		long whp_sites_flagship_species_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_flagship_species updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_species with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException} if it could not be found.
	*
	* @param whp_sites_flagship_species_id the primary key of the whp_sites_flagship_species
	* @return the whp_sites_flagship_species
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species findByPrimaryKey(
		long whp_sites_flagship_species_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_species with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_flagship_species_id the primary key of the whp_sites_flagship_species
	* @return the whp_sites_flagship_species, or <code>null</code> if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchByPrimaryKey(
		long whp_sites_flagship_species_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_species where flagship_species_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException} if it could not be found.
	*
	* @param flagship_species_id the flagship_species_id
	* @return the matching whp_sites_flagship_species
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species findByspeciesid(
		int flagship_species_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_species where flagship_species_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param flagship_species_id the flagship_species_id
	* @return the matching whp_sites_flagship_species, or <code>null</code> if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchByspeciesid(
		int flagship_species_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_species where flagship_species_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param flagship_species_id the flagship_species_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_flagship_species, or <code>null</code> if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchByspeciesid(
		int flagship_species_id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_flagship_specieses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findBySiteID(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_flagship_specieses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_flagship_specieses
	* @param end the upper bound of the range of whp_sites_flagship_specieses (not inclusive)
	* @return the range of matching whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findBySiteID(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_flagship_specieses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_flagship_specieses
	* @param end the upper bound of the range of whp_sites_flagship_specieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findBySiteID(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_flagship_species in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_flagship_species
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species findBySiteID_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_flagship_species in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_flagship_species, or <code>null</code> if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchBySiteID_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_flagship_species in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_flagship_species
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species findBySiteID_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_flagship_species in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_flagship_species, or <code>null</code> if a matching whp_sites_flagship_species could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchBySiteID_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_flagship_specieses before and after the current whp_sites_flagship_species in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_flagship_species_id the primary key of the current whp_sites_flagship_species
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_flagship_species
	* @throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species[] findBySiteID_PrevAndNext(
		long whp_sites_flagship_species_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_flagship_specieses.
	*
	* @return the whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_flagship_specieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_flagship_specieses
	* @param end the upper bound of the range of whp_sites_flagship_specieses (not inclusive)
	* @return the range of whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_flagship_specieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_flagship_specieses
	* @param end the upper bound of the range of whp_sites_flagship_specieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_flagship_species where flagship_species_id = &#63; from the database.
	*
	* @param flagship_species_id the flagship_species_id
	* @return the whp_sites_flagship_species that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species removeByspeciesid(
		int flagship_species_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_flagship_speciesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_flagship_specieses where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteID(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_flagship_specieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_flagship_specieses where flagship_species_id = &#63;.
	*
	* @param flagship_species_id the flagship_species_id
	* @return the number of matching whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByspeciesid(int flagship_species_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_flagship_specieses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteID(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_flagship_specieses.
	*
	* @return the number of whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}