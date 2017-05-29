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

import com.iucn.whp.dbservice.model.iucn_pa_lkp_category;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the iucn_pa_lkp_category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see iucn_pa_lkp_categoryPersistenceImpl
 * @see iucn_pa_lkp_categoryUtil
 * @generated
 */
public interface iucn_pa_lkp_categoryPersistence extends BasePersistence<iucn_pa_lkp_category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link iucn_pa_lkp_categoryUtil} to access the iucn_pa_lkp_category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the iucn_pa_lkp_category in the entity cache if it is enabled.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category);

	/**
	* Caches the iucn_pa_lkp_categories in the entity cache if it is enabled.
	*
	* @param iucn_pa_lkp_categories the iucn_pa_lkp_categories
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> iucn_pa_lkp_categories);

	/**
	* Creates a new iucn_pa_lkp_category with the primary key. Does not add the iucn_pa_lkp_category to the database.
	*
	* @param iucn_pa_category_id the primary key for the new iucn_pa_lkp_category
	* @return the new iucn_pa_lkp_category
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category create(
		int iucn_pa_category_id);

	/**
	* Removes the iucn_pa_lkp_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was removed
	* @throws com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category remove(
		int iucn_pa_category_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category updateImpl(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the iucn_pa_lkp_category with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException} if it could not be found.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category
	* @throws com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category findByPrimaryKey(
		int iucn_pa_category_id)
		throws com.iucn.whp.dbservice.NoSuchiucn_pa_lkp_categoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the iucn_pa_lkp_category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category, or <code>null</code> if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category fetchByPrimaryKey(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the iucn_pa_lkp_categories.
	*
	* @return the iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the iucn_pa_lkp_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_pa_lkp_categories
	* @param end the upper bound of the range of iucn_pa_lkp_categories (not inclusive)
	* @return the range of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the iucn_pa_lkp_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_pa_lkp_categories
	* @param end the upper bound of the range of iucn_pa_lkp_categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the iucn_pa_lkp_categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of iucn_pa_lkp_categories.
	*
	* @return the number of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}