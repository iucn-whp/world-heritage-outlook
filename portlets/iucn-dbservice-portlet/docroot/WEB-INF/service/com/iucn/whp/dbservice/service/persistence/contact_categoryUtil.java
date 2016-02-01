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

import com.iucn.whp.dbservice.model.contact_category;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the contact_category service. This utility wraps {@link contact_categoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see contact_categoryPersistence
 * @see contact_categoryPersistenceImpl
 * @generated
 */
public class contact_categoryUtil {
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
	public static void clearCache(contact_category contact_category) {
		getPersistence().clearCache(contact_category);
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
	public static List<contact_category> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<contact_category> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<contact_category> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static contact_category update(contact_category contact_category,
		boolean merge) throws SystemException {
		return getPersistence().update(contact_category, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static contact_category update(contact_category contact_category,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(contact_category, merge, serviceContext);
	}

	/**
	* Caches the contact_category in the entity cache if it is enabled.
	*
	* @param contact_category the contact_category
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.contact_category contact_category) {
		getPersistence().cacheResult(contact_category);
	}

	/**
	* Caches the contact_categories in the entity cache if it is enabled.
	*
	* @param contact_categories the contact_categories
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.contact_category> contact_categories) {
		getPersistence().cacheResult(contact_categories);
	}

	/**
	* Creates a new contact_category with the primary key. Does not add the contact_category to the database.
	*
	* @param contact_category_id the primary key for the new contact_category
	* @return the new contact_category
	*/
	public static com.iucn.whp.dbservice.model.contact_category create(
		int contact_category_id) {
		return getPersistence().create(contact_category_id);
	}

	/**
	* Removes the contact_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_category_id the primary key of the contact_category
	* @return the contact_category that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcontact_categoryException if a contact_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.contact_category remove(
		int contact_category_id)
		throws com.iucn.whp.dbservice.NoSuchcontact_categoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(contact_category_id);
	}

	public static com.iucn.whp.dbservice.model.contact_category updateImpl(
		com.iucn.whp.dbservice.model.contact_category contact_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(contact_category, merge);
	}

	/**
	* Returns the contact_category with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcontact_categoryException} if it could not be found.
	*
	* @param contact_category_id the primary key of the contact_category
	* @return the contact_category
	* @throws com.iucn.whp.dbservice.NoSuchcontact_categoryException if a contact_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.contact_category findByPrimaryKey(
		int contact_category_id)
		throws com.iucn.whp.dbservice.NoSuchcontact_categoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(contact_category_id);
	}

	/**
	* Returns the contact_category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contact_category_id the primary key of the contact_category
	* @return the contact_category, or <code>null</code> if a contact_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.contact_category fetchByPrimaryKey(
		int contact_category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(contact_category_id);
	}

	/**
	* Returns all the contact_categories.
	*
	* @return the contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.contact_category> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contact_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contact_categories
	* @param end the upper bound of the range of contact_categories (not inclusive)
	* @return the range of contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.contact_category> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contact_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contact_categories
	* @param end the upper bound of the range of contact_categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.contact_category> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the contact_categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contact_categories.
	*
	* @return the number of contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static contact_categoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (contact_categoryPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					contact_categoryPersistence.class.getName());

			ReferenceRegistry.registerReference(contact_categoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(contact_categoryPersistence persistence) {
	}

	private static contact_categoryPersistence _persistence;
}