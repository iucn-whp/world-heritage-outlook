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

import com.iucn.whp.dbservice.model.whp_sites_contacts;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_contacts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_contactsPersistenceImpl
 * @see whp_sites_contactsUtil
 * @generated
 */
public interface whp_sites_contactsPersistence extends BasePersistence<whp_sites_contacts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_contactsUtil} to access the whp_sites_contacts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_contacts in the entity cache if it is enabled.
	*
	* @param whp_sites_contacts the whp_sites_contacts
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts);

	/**
	* Caches the whp_sites_contactses in the entity cache if it is enabled.
	*
	* @param whp_sites_contactses the whp_sites_contactses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> whp_sites_contactses);

	/**
	* Creates a new whp_sites_contacts with the primary key. Does not add the whp_sites_contacts to the database.
	*
	* @param whp_sites_contacts_id the primary key for the new whp_sites_contacts
	* @return the new whp_sites_contacts
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts create(
		long whp_sites_contacts_id);

	/**
	* Removes the whp_sites_contacts with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts_id the primary key of the whp_sites_contacts
	* @return the whp_sites_contacts that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts remove(
		long whp_sites_contacts_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_contacts updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_contacts with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_contactsException} if it could not be found.
	*
	* @param whp_sites_contacts_id the primary key of the whp_sites_contacts
	* @return the whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts findByPrimaryKey(
		long whp_sites_contacts_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_contacts with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_contacts_id the primary key of the whp_sites_contacts
	* @return the whp_sites_contacts, or <code>null</code> if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts fetchByPrimaryKey(
		long whp_sites_contacts_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_contactses where contactid = &#63;.
	*
	* @param contactid the contactid
	* @return the matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBycontactid(
		int contactid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_contactses where contactid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param contactid the contactid
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @return the range of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBycontactid(
		int contactid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_contactses where contactid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param contactid the contactid
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBycontactid(
		int contactid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_contacts in the ordered set where contactid = &#63;.
	*
	* @param contactid the contactid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts findBycontactid_First(
		int contactid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_contacts in the ordered set where contactid = &#63;.
	*
	* @param contactid the contactid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_contacts, or <code>null</code> if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts fetchBycontactid_First(
		int contactid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_contacts in the ordered set where contactid = &#63;.
	*
	* @param contactid the contactid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts findBycontactid_Last(
		int contactid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_contacts in the ordered set where contactid = &#63;.
	*
	* @param contactid the contactid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_contacts, or <code>null</code> if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts fetchBycontactid_Last(
		int contactid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_contactses before and after the current whp_sites_contacts in the ordered set where contactid = &#63;.
	*
	* @param whp_sites_contacts_id the primary key of the current whp_sites_contacts
	* @param contactid the contactid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts[] findBycontactid_PrevAndNext(
		long whp_sites_contacts_id, int contactid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_contactses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBySiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_contactses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @return the range of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBySiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_contactses where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findBySiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_contacts in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts findBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_contacts in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_contacts, or <code>null</code> if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts fetchBySiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_contacts in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts findBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_contacts in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_contacts, or <code>null</code> if a matching whp_sites_contacts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts fetchBySiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_contactses before and after the current whp_sites_contacts in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_contacts_id the primary key of the current whp_sites_contacts
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_contacts
	* @throws com.iucn.whp.dbservice.NoSuch_sites_contactsException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_contacts[] findBySiteId_PrevAndNext(
		long whp_sites_contacts_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_contactsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_contactses.
	*
	* @return the whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_contactses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @return the range of whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_contactses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_contactses where contactid = &#63; from the database.
	*
	* @param contactid the contactid
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycontactid(int contactid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_contactses where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_contactses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_contactses where contactid = &#63;.
	*
	* @param contactid the contactid
	* @return the number of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycontactid(int contactid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_contactses where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_contactses.
	*
	* @return the number of whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}