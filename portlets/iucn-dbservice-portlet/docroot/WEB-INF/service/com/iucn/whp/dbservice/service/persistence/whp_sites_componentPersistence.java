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

import com.iucn.whp.dbservice.model.whp_sites_component;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_component service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_componentPersistenceImpl
 * @see whp_sites_componentUtil
 * @generated
 */
public interface whp_sites_componentPersistence extends BasePersistence<whp_sites_component> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_componentUtil} to access the whp_sites_component persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_component in the entity cache if it is enabled.
	*
	* @param whp_sites_component the whp_sites_component
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component);

	/**
	* Caches the whp_sites_components in the entity cache if it is enabled.
	*
	* @param whp_sites_components the whp_sites_components
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> whp_sites_components);

	/**
	* Creates a new whp_sites_component with the primary key. Does not add the whp_sites_component to the database.
	*
	* @param whp_sites_component_id the primary key for the new whp_sites_component
	* @return the new whp_sites_component
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component create(
		long whp_sites_component_id);

	/**
	* Removes the whp_sites_component with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component_id the primary key of the whp_sites_component
	* @return the whp_sites_component that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_componentException if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component remove(
		long whp_sites_component_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_componentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_component updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_component with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_componentException} if it could not be found.
	*
	* @param whp_sites_component_id the primary key of the whp_sites_component
	* @return the whp_sites_component
	* @throws com.iucn.whp.dbservice.NoSuch_sites_componentException if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component findByPrimaryKey(
		long whp_sites_component_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_componentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_component with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_component_id the primary key of the whp_sites_component
	* @return the whp_sites_component, or <code>null</code> if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component fetchByPrimaryKey(
		long whp_sites_component_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_components where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findBySiteid(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_components where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_components
	* @param end the upper bound of the range of whp_sites_components (not inclusive)
	* @return the range of matching whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findBySiteid(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_components where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_components
	* @param end the upper bound of the range of whp_sites_components (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findBySiteid(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_component in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_component
	* @throws com.iucn.whp.dbservice.NoSuch_sites_componentException if a matching whp_sites_component could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component findBySiteid_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_componentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first whp_sites_component in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_component, or <code>null</code> if a matching whp_sites_component could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component fetchBySiteid_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_component in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_component
	* @throws com.iucn.whp.dbservice.NoSuch_sites_componentException if a matching whp_sites_component could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component findBySiteid_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_componentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last whp_sites_component in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_component, or <code>null</code> if a matching whp_sites_component could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component fetchBySiteid_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_components before and after the current whp_sites_component in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_component_id the primary key of the current whp_sites_component
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_component
	* @throws com.iucn.whp.dbservice.NoSuch_sites_componentException if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_component[] findBySiteid_PrevAndNext(
		long whp_sites_component_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_componentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_components.
	*
	* @return the whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_components.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_components
	* @param end the upper bound of the range of whp_sites_components (not inclusive)
	* @return the range of whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_components.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_components
	* @param end the upper bound of the range of whp_sites_components (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_components where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySiteid(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_components from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_components where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public int countBySiteid(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_components.
	*
	* @return the number of whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}