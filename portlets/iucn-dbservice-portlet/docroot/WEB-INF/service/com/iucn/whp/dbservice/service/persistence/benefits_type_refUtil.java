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

import com.iucn.whp.dbservice.model.benefits_type_ref;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the benefits_type_ref service. This utility wraps {@link benefits_type_refPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_refPersistence
 * @see benefits_type_refPersistenceImpl
 * @generated
 */
public class benefits_type_refUtil {
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
	public static void clearCache(benefits_type_ref benefits_type_ref) {
		getPersistence().clearCache(benefits_type_ref);
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
	public static List<benefits_type_ref> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<benefits_type_ref> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<benefits_type_ref> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static benefits_type_ref update(
		benefits_type_ref benefits_type_ref, boolean merge)
		throws SystemException {
		return getPersistence().update(benefits_type_ref, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static benefits_type_ref update(
		benefits_type_ref benefits_type_ref, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(benefits_type_ref, merge, serviceContext);
	}

	/**
	* Caches the benefits_type_ref in the entity cache if it is enabled.
	*
	* @param benefits_type_ref the benefits_type_ref
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref) {
		getPersistence().cacheResult(benefits_type_ref);
	}

	/**
	* Caches the benefits_type_refs in the entity cache if it is enabled.
	*
	* @param benefits_type_refs the benefits_type_refs
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> benefits_type_refs) {
		getPersistence().cacheResult(benefits_type_refs);
	}

	/**
	* Creates a new benefits_type_ref with the primary key. Does not add the benefits_type_ref to the database.
	*
	* @param benefits_type_ref_id the primary key for the new benefits_type_ref
	* @return the new benefits_type_ref
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref create(
		long benefits_type_ref_id) {
		return getPersistence().create(benefits_type_ref_id);
	}

	/**
	* Removes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref remove(
		long benefits_type_ref_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(benefits_type_ref_id);
	}

	public static com.iucn.whp.dbservice.model.benefits_type_ref updateImpl(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(benefits_type_ref, merge);
	}

	/**
	* Returns the benefits_type_ref with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefits_type_refException} if it could not be found.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref findByPrimaryKey(
		long benefits_type_ref_id)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(benefits_type_ref_id);
	}

	/**
	* Returns the benefits_type_ref with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref, or <code>null</code> if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchByPrimaryKey(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(benefits_type_ref_id);
	}

	/**
	* Returns all the benefits_type_refs where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @return the matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByByBenefits_id(benefits_id);
	}

	/**
	* Returns a range of all the benefits_type_refs where benefits_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByByBenefits_id(benefits_id, start, end);
	}

	/**
	* Returns an ordered range of all the benefits_type_refs where benefits_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByByBenefits_id(
		long benefits_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByByBenefits_id(benefits_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref findByByBenefits_id_First(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByByBenefits_id_First(benefits_id, orderByComparator);
	}

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchByByBenefits_id_First(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByByBenefits_id_First(benefits_id, orderByComparator);
	}

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref findByByBenefits_id_Last(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByByBenefits_id_Last(benefits_id, orderByComparator);
	}

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchByByBenefits_id_Last(
		long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByByBenefits_id_Last(benefits_id, orderByComparator);
	}

	/**
	* Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63;.
	*
	* @param benefits_type_ref_id the primary key of the current benefits_type_ref
	* @param benefits_id the benefits_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref[] findByByBenefits_id_PrevAndNext(
		long benefits_type_ref_id, long benefits_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByByBenefits_id_PrevAndNext(benefits_type_ref_id,
			benefits_id, orderByComparator);
	}

	/**
	* Returns all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @return the matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytypeId(benefits_id, benefit_checktype);
	}

	/**
	* Returns a range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytypeId(benefits_id, benefit_checktype, start, end);
	}

	/**
	* Returns an ordered range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findBytypeId(
		long benefits_id, long benefit_checktype, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytypeId(benefits_id, benefit_checktype, start, end,
			orderByComparator);
	}

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref findBytypeId_First(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytypeId_First(benefits_id, benefit_checktype,
			orderByComparator);
	}

	/**
	* Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchBytypeId_First(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBytypeId_First(benefits_id, benefit_checktype,
			orderByComparator);
	}

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref findBytypeId_Last(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytypeId_Last(benefits_id, benefit_checktype,
			orderByComparator);
	}

	/**
	* Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchBytypeId_Last(
		long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBytypeId_Last(benefits_id, benefit_checktype,
			orderByComparator);
	}

	/**
	* Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_type_ref_id the primary key of the current benefits_type_ref
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits_type_ref
	* @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref[] findBytypeId_PrevAndNext(
		long benefits_type_ref_id, long benefits_id, long benefit_checktype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytypeId_PrevAndNext(benefits_type_ref_id, benefits_id,
			benefit_checktype, orderByComparator);
	}

	/**
	* Returns all the benefits_type_refs.
	*
	* @return the benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the benefits_type_refs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the benefits_type_refs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the benefits_type_refs where benefits_id = &#63; from the database.
	*
	* @param benefits_id the benefits_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByByBenefits_id(long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByByBenefits_id(benefits_id);
	}

	/**
	* Removes all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63; from the database.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBytypeId(long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBytypeId(benefits_id, benefit_checktype);
	}

	/**
	* Removes all the benefits_type_refs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of benefits_type_refs where benefits_id = &#63;.
	*
	* @param benefits_id the benefits_id
	* @return the number of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByByBenefits_id(long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByByBenefits_id(benefits_id);
	}

	/**
	* Returns the number of benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	*
	* @param benefits_id the benefits_id
	* @param benefit_checktype the benefit_checktype
	* @return the number of matching benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBytypeId(long benefits_id, long benefit_checktype)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBytypeId(benefits_id, benefit_checktype);
	}

	/**
	* Returns the number of benefits_type_refs.
	*
	* @return the number of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static benefits_type_refPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (benefits_type_refPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					benefits_type_refPersistence.class.getName());

			ReferenceRegistry.registerReference(benefits_type_refUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(benefits_type_refPersistence persistence) {
	}

	private static benefits_type_refPersistence _persistence;
}