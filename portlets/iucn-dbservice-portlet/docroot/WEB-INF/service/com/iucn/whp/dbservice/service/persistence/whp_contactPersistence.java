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

import com.iucn.whp.dbservice.model.whp_contact;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_contactPersistenceImpl
 * @see whp_contactUtil
 * @generated
 */
public interface whp_contactPersistence extends BasePersistence<whp_contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_contactUtil} to access the whp_contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_contact in the entity cache if it is enabled.
	*
	* @param whp_contact the whp_contact
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_contact whp_contact);

	/**
	* Caches the whp_contacts in the entity cache if it is enabled.
	*
	* @param whp_contacts the whp_contacts
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_contact> whp_contacts);

	/**
	* Creates a new whp_contact with the primary key. Does not add the whp_contact to the database.
	*
	* @param contact_id the primary key for the new whp_contact
	* @return the new whp_contact
	*/
	public com.iucn.whp.dbservice.model.whp_contact create(int contact_id);

	/**
	* Removes the whp_contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact remove(int contact_id)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_contact updateImpl(
		com.iucn.whp.dbservice.model.whp_contact whp_contact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_contact with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact findByPrimaryKey(
		int contact_id)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact, or <code>null</code> if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact fetchByPrimaryKey(
		int contact_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_contact where categoryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	*
	* @param categoryid the categoryid
	* @return the matching whp_contact
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact findBycategory(
		int categoryid)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param categoryid the categoryid
	* @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact fetchBycategory(
		int categoryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param categoryid the categoryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact fetchBycategory(
		int categoryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_contacts.
	*
	* @return the whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_contacts
	* @param end the upper bound of the range of whp_contacts (not inclusive)
	* @return the range of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_contacts
	* @param end the upper bound of the range of whp_contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_contact where categoryid = &#63; from the database.
	*
	* @param categoryid the categoryid
	* @return the whp_contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_contact removeBycategory(
		int categoryid)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_contacts where categoryid = &#63;.
	*
	* @param categoryid the categoryid
	* @return the number of matching whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countBycategory(int categoryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_contacts.
	*
	* @return the number of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}