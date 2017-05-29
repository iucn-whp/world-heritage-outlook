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

import com.iucn.whp.dbservice.model.current_threat_assessment_cat;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the current_threat_assessment_cat service. This utility wraps {@link current_threat_assessment_catPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_threat_assessment_catPersistence
 * @see current_threat_assessment_catPersistenceImpl
 * @generated
 */
public class current_threat_assessment_catUtil {
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
		current_threat_assessment_cat current_threat_assessment_cat) {
		getPersistence().clearCache(current_threat_assessment_cat);
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
	public static List<current_threat_assessment_cat> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<current_threat_assessment_cat> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<current_threat_assessment_cat> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static current_threat_assessment_cat update(
		current_threat_assessment_cat current_threat_assessment_cat,
		boolean merge) throws SystemException {
		return getPersistence().update(current_threat_assessment_cat, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static current_threat_assessment_cat update(
		current_threat_assessment_cat current_threat_assessment_cat,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(current_threat_assessment_cat, merge, serviceContext);
	}

	/**
	* Caches the current_threat_assessment_cat in the entity cache if it is enabled.
	*
	* @param current_threat_assessment_cat the current_threat_assessment_cat
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.current_threat_assessment_cat current_threat_assessment_cat) {
		getPersistence().cacheResult(current_threat_assessment_cat);
	}

	/**
	* Caches the current_threat_assessment_cats in the entity cache if it is enabled.
	*
	* @param current_threat_assessment_cats the current_threat_assessment_cats
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> current_threat_assessment_cats) {
		getPersistence().cacheResult(current_threat_assessment_cats);
	}

	/**
	* Creates a new current_threat_assessment_cat with the primary key. Does not add the current_threat_assessment_cat to the database.
	*
	* @param cur_threat_cat_id the primary key for the new current_threat_assessment_cat
	* @return the new current_threat_assessment_cat
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat create(
		long cur_threat_cat_id) {
		return getPersistence().create(cur_threat_cat_id);
	}

	/**
	* Removes the current_threat_assessment_cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat remove(
		long cur_threat_cat_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cur_threat_cat_id);
	}

	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat updateImpl(
		com.iucn.whp.dbservice.model.current_threat_assessment_cat current_threat_assessment_cat,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(current_threat_assessment_cat, merge);
	}

	/**
	* Returns the current_threat_assessment_cat with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException} if it could not be found.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat findByPrimaryKey(
		long cur_threat_cat_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cur_threat_cat_id);
	}

	/**
	* Returns the current_threat_assessment_cat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat, or <code>null</code> if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchByPrimaryKey(
		long cur_threat_cat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cur_threat_cat_id);
	}

	/**
	* Returns all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycurrent_threat_id(current_threat_id);
	}

	/**
	* Returns a range of all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycurrent_threat_id(current_threat_id, start, end);
	}

	/**
	* Returns an ordered range of all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycurrent_threat_id(current_threat_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat findBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycurrent_threat_id_First(current_threat_id,
			orderByComparator);
	}

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycurrent_threat_id_First(current_threat_id,
			orderByComparator);
	}

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat findBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycurrent_threat_id_Last(current_threat_id,
			orderByComparator);
	}

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycurrent_threat_id_Last(current_threat_id,
			orderByComparator);
	}

	/**
	* Returns the current_threat_assessment_cats before and after the current current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param cur_threat_cat_id the primary key of the current current_threat_assessment_cat
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat[] findBycurrent_threat_id_PrevAndNext(
		long cur_threat_cat_id, long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycurrent_threat_id_PrevAndNext(cur_threat_cat_id,
			current_threat_id, orderByComparator);
	}

	/**
	* Returns all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @return the matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysub_cat_id(current_threat_id, category_id);
	}

	/**
	* Returns a range of all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysub_cat_id(current_threat_id, category_id, start, end);
	}

	/**
	* Returns an ordered range of all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysub_cat_id(current_threat_id, category_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat findBysub_cat_id_First(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysub_cat_id_First(current_threat_id, category_id,
			orderByComparator);
	}

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBysub_cat_id_First(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBysub_cat_id_First(current_threat_id, category_id,
			orderByComparator);
	}

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat findBysub_cat_id_Last(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysub_cat_id_Last(current_threat_id, category_id,
			orderByComparator);
	}

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBysub_cat_id_Last(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBysub_cat_id_Last(current_threat_id, category_id,
			orderByComparator);
	}

	/**
	* Returns the current_threat_assessment_cats before and after the current current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param cur_threat_cat_id the primary key of the current current_threat_assessment_cat
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_assessment_cat[] findBysub_cat_id_PrevAndNext(
		long cur_threat_cat_id, long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysub_cat_id_PrevAndNext(cur_threat_cat_id,
			current_threat_id, category_id, orderByComparator);
	}

	/**
	* Returns all the current_threat_assessment_cats.
	*
	* @return the current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the current_threat_assessment_cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the current_threat_assessment_cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the current_threat_assessment_cats where current_threat_id = &#63; from the database.
	*
	* @param current_threat_id the current_threat_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycurrent_threat_id(current_threat_id);
	}

	/**
	* Removes all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63; from the database.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBysub_cat_id(long current_threat_id,
		long category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBysub_cat_id(current_threat_id, category_id);
	}

	/**
	* Removes all the current_threat_assessment_cats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the number of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycurrent_threat_id(current_threat_id);
	}

	/**
	* Returns the number of current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @return the number of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysub_cat_id(long current_threat_id, long category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysub_cat_id(current_threat_id, category_id);
	}

	/**
	* Returns the number of current_threat_assessment_cats.
	*
	* @return the number of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static current_threat_assessment_catPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (current_threat_assessment_catPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					current_threat_assessment_catPersistence.class.getName());

			ReferenceRegistry.registerReference(current_threat_assessment_catUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		current_threat_assessment_catPersistence persistence) {
	}

	private static current_threat_assessment_catPersistence _persistence;
}