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

import com.iucn.whp.dbservice.model.whp_sites_inscription_criteria;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_sites_inscription_criteria service. This utility wraps {@link whp_sites_inscription_criteriaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_inscription_criteriaPersistence
 * @see whp_sites_inscription_criteriaPersistenceImpl
 * @generated
 */
public class whp_sites_inscription_criteriaUtil {
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
	public static void clearCache(
		whp_sites_inscription_criteria whp_sites_inscription_criteria) {
		getPersistence().clearCache(whp_sites_inscription_criteria);
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
	public static List<whp_sites_inscription_criteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_sites_inscription_criteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_sites_inscription_criteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_sites_inscription_criteria update(
		whp_sites_inscription_criteria whp_sites_inscription_criteria,
		boolean merge) throws SystemException {
		return getPersistence().update(whp_sites_inscription_criteria, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_sites_inscription_criteria update(
		whp_sites_inscription_criteria whp_sites_inscription_criteria,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(whp_sites_inscription_criteria, merge, serviceContext);
	}

	/**
	* Caches the whp_sites_inscription_criteria in the entity cache if it is enabled.
	*
	* @param whp_sites_inscription_criteria the whp_sites_inscription_criteria
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_inscription_criteria whp_sites_inscription_criteria) {
		getPersistence().cacheResult(whp_sites_inscription_criteria);
	}

	/**
	* Caches the whp_sites_inscription_criterias in the entity cache if it is enabled.
	*
	* @param whp_sites_inscription_criterias the whp_sites_inscription_criterias
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> whp_sites_inscription_criterias) {
		getPersistence().cacheResult(whp_sites_inscription_criterias);
	}

	/**
	* Creates a new whp_sites_inscription_criteria with the primary key. Does not add the whp_sites_inscription_criteria to the database.
	*
	* @param whp_sites_inscription_criteria_id the primary key for the new whp_sites_inscription_criteria
	* @return the new whp_sites_inscription_criteria
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria create(
		long whp_sites_inscription_criteria_id) {
		return getPersistence().create(whp_sites_inscription_criteria_id);
	}

	/**
	* Removes the whp_sites_inscription_criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_inscription_criteria_id the primary key of the whp_sites_inscription_criteria
	* @return the whp_sites_inscription_criteria that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a whp_sites_inscription_criteria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria remove(
		long whp_sites_inscription_criteria_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_inscription_criteria_id);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_inscription_criteria whp_sites_inscription_criteria,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(whp_sites_inscription_criteria, merge);
	}

	/**
	* Returns the whp_sites_inscription_criteria with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException} if it could not be found.
	*
	* @param whp_sites_inscription_criteria_id the primary key of the whp_sites_inscription_criteria
	* @return the whp_sites_inscription_criteria
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a whp_sites_inscription_criteria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria findByPrimaryKey(
		long whp_sites_inscription_criteria_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(whp_sites_inscription_criteria_id);
	}

	/**
	* Returns the whp_sites_inscription_criteria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_inscription_criteria_id the primary key of the whp_sites_inscription_criteria
	* @return the whp_sites_inscription_criteria, or <code>null</code> if a whp_sites_inscription_criteria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria fetchByPrimaryKey(
		long whp_sites_inscription_criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(whp_sites_inscription_criteria_id);
	}

	/**
	* Returns the whp_sites_inscription_criteria where criteria_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException} if it could not be found.
	*
	* @param criteria_id the criteria_id
	* @return the matching whp_sites_inscription_criteria
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria findByinscription_critetia(
		int criteria_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByinscription_critetia(criteria_id);
	}

	/**
	* Returns the whp_sites_inscription_criteria where criteria_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_id the criteria_id
	* @return the matching whp_sites_inscription_criteria, or <code>null</code> if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria fetchByinscription_critetia(
		int criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByinscription_critetia(criteria_id);
	}

	/**
	* Returns the whp_sites_inscription_criteria where criteria_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_inscription_criteria, or <code>null</code> if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria fetchByinscription_critetia(
		int criteria_id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByinscription_critetia(criteria_id, retrieveFromCache);
	}

	/**
	* Returns all the whp_sites_inscription_criterias where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findBywhp_sites_inscription(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBywhp_sites_inscription(site_id);
	}

	/**
	* Returns a range of all the whp_sites_inscription_criterias where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_inscription_criterias
	* @param end the upper bound of the range of whp_sites_inscription_criterias (not inclusive)
	* @return the range of matching whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findBywhp_sites_inscription(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBywhp_sites_inscription(site_id, start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_inscription_criterias where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_inscription_criterias
	* @param end the upper bound of the range of whp_sites_inscription_criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findBywhp_sites_inscription(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhp_sites_inscription(site_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first whp_sites_inscription_criteria in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_inscription_criteria
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria findBywhp_sites_inscription_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhp_sites_inscription_First(site_id, orderByComparator);
	}

	/**
	* Returns the first whp_sites_inscription_criteria in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_inscription_criteria, or <code>null</code> if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria fetchBywhp_sites_inscription_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBywhp_sites_inscription_First(site_id,
			orderByComparator);
	}

	/**
	* Returns the last whp_sites_inscription_criteria in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_inscription_criteria
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria findBywhp_sites_inscription_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhp_sites_inscription_Last(site_id, orderByComparator);
	}

	/**
	* Returns the last whp_sites_inscription_criteria in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_inscription_criteria, or <code>null</code> if a matching whp_sites_inscription_criteria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria fetchBywhp_sites_inscription_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBywhp_sites_inscription_Last(site_id, orderByComparator);
	}

	/**
	* Returns the whp_sites_inscription_criterias before and after the current whp_sites_inscription_criteria in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_inscription_criteria_id the primary key of the current whp_sites_inscription_criteria
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_inscription_criteria
	* @throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException if a whp_sites_inscription_criteria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria[] findBywhp_sites_inscription_PrevAndNext(
		long whp_sites_inscription_criteria_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhp_sites_inscription_PrevAndNext(whp_sites_inscription_criteria_id,
			site_id, orderByComparator);
	}

	/**
	* Returns all the whp_sites_inscription_criterias.
	*
	* @return the whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the whp_sites_inscription_criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_inscription_criterias
	* @param end the upper bound of the range of whp_sites_inscription_criterias (not inclusive)
	* @return the range of whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_inscription_criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_inscription_criterias
	* @param end the upper bound of the range of whp_sites_inscription_criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the whp_sites_inscription_criteria where criteria_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @return the whp_sites_inscription_criteria that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_inscription_criteria removeByinscription_critetia(
		int criteria_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_inscription_criteriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByinscription_critetia(criteria_id);
	}

	/**
	* Removes all the whp_sites_inscription_criterias where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBywhp_sites_inscription(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBywhp_sites_inscription(site_id);
	}

	/**
	* Removes all the whp_sites_inscription_criterias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_sites_inscription_criterias where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @return the number of matching whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static int countByinscription_critetia(int criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByinscription_critetia(criteria_id);
	}

	/**
	* Returns the number of whp_sites_inscription_criterias where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static int countBywhp_sites_inscription(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBywhp_sites_inscription(site_id);
	}

	/**
	* Returns the number of whp_sites_inscription_criterias.
	*
	* @return the number of whp_sites_inscription_criterias
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_sites_inscription_criteriaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_sites_inscription_criteriaPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sites_inscription_criteriaPersistence.class.getName());

			ReferenceRegistry.registerReference(whp_sites_inscription_criteriaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		whp_sites_inscription_criteriaPersistence persistence) {
	}

	private static whp_sites_inscription_criteriaPersistence _persistence;
}