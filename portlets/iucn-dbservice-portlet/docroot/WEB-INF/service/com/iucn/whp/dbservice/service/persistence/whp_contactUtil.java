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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_contact service. This utility wraps {@link whp_contactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_contactPersistence
 * @see whp_contactPersistenceImpl
 * @generated
 */
public class whp_contactUtil {
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
	public static void clearCache(whp_contact whp_contact) {
		getPersistence().clearCache(whp_contact);
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
	public static List<whp_contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_contact update(whp_contact whp_contact, boolean merge)
		throws SystemException {
		return getPersistence().update(whp_contact, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_contact update(whp_contact whp_contact, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(whp_contact, merge, serviceContext);
	}

	/**
	* Caches the whp_contact in the entity cache if it is enabled.
	*
	* @param whp_contact the whp_contact
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_contact whp_contact) {
		getPersistence().cacheResult(whp_contact);
	}

	/**
	* Caches the whp_contacts in the entity cache if it is enabled.
	*
	* @param whp_contacts the whp_contacts
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_contact> whp_contacts) {
		getPersistence().cacheResult(whp_contacts);
	}

	/**
	* Creates a new whp_contact with the primary key. Does not add the whp_contact to the database.
	*
	* @param contact_id the primary key for the new whp_contact
	* @return the new whp_contact
	*/
	public static com.iucn.whp.dbservice.model.whp_contact create(
		int contact_id) {
		return getPersistence().create(contact_id);
	}

	/**
	* Removes the whp_contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact remove(
		int contact_id)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(contact_id);
	}

	public static com.iucn.whp.dbservice.model.whp_contact updateImpl(
		com.iucn.whp.dbservice.model.whp_contact whp_contact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(whp_contact, merge);
	}

	/**
	* Returns the whp_contact with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact findByPrimaryKey(
		int contact_id)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(contact_id);
	}

	/**
	* Returns the whp_contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact, or <code>null</code> if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact fetchByPrimaryKey(
		int contact_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(contact_id);
	}

	/**
	* Returns the whp_contact where categoryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	*
	* @param categoryid the categoryid
	* @return the matching whp_contact
	* @throws com.iucn.whp.dbservice.NoSuch_contactException if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact findBycategory(
		int categoryid)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycategory(categoryid);
	}

	/**
	* Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param categoryid the categoryid
	* @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact fetchBycategory(
		int categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycategory(categoryid);
	}

	/**
	* Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param categoryid the categoryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact fetchBycategory(
		int categoryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycategory(categoryid, retrieveFromCache);
	}

	/**
	* Returns all the whp_contacts.
	*
	* @return the whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the whp_contact where categoryid = &#63; from the database.
	*
	* @param categoryid the categoryid
	* @return the whp_contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact removeBycategory(
		int categoryid)
		throws com.iucn.whp.dbservice.NoSuch_contactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBycategory(categoryid);
	}

	/**
	* Removes all the whp_contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_contacts where categoryid = &#63;.
	*
	* @param categoryid the categoryid
	* @return the number of matching whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycategory(int categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycategory(categoryid);
	}

	/**
	* Returns the number of whp_contacts.
	*
	* @return the number of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_contactPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_contactPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_contactPersistence.class.getName());

			ReferenceRegistry.registerReference(whp_contactUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(whp_contactPersistence persistence) {
	}

	private static whp_contactPersistence _persistence;
}