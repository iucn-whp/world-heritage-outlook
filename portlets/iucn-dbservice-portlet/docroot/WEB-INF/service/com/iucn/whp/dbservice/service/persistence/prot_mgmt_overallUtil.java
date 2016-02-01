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

import com.iucn.whp.dbservice.model.prot_mgmt_overall;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the prot_mgmt_overall service. This utility wraps {@link prot_mgmt_overallPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see prot_mgmt_overallPersistence
 * @see prot_mgmt_overallPersistenceImpl
 * @generated
 */
public class prot_mgmt_overallUtil {
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
	public static void clearCache(prot_mgmt_overall prot_mgmt_overall) {
		getPersistence().clearCache(prot_mgmt_overall);
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
	public static List<prot_mgmt_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prot_mgmt_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prot_mgmt_overall> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static prot_mgmt_overall update(
		prot_mgmt_overall prot_mgmt_overall, boolean merge)
		throws SystemException {
		return getPersistence().update(prot_mgmt_overall, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static prot_mgmt_overall update(
		prot_mgmt_overall prot_mgmt_overall, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(prot_mgmt_overall, merge, serviceContext);
	}

	/**
	* Caches the prot_mgmt_overall in the entity cache if it is enabled.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall) {
		getPersistence().cacheResult(prot_mgmt_overall);
	}

	/**
	* Caches the prot_mgmt_overalls in the entity cache if it is enabled.
	*
	* @param prot_mgmt_overalls the prot_mgmt_overalls
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> prot_mgmt_overalls) {
		getPersistence().cacheResult(prot_mgmt_overalls);
	}

	/**
	* Creates a new prot_mgmt_overall with the primary key. Does not add the prot_mgmt_overall to the database.
	*
	* @param pmo_id the primary key for the new prot_mgmt_overall
	* @return the new prot_mgmt_overall
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall create(
		long pmo_id) {
		return getPersistence().create(pmo_id);
	}

	/**
	* Removes the prot_mgmt_overall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall that was removed
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall remove(
		long pmo_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(pmo_id);
	}

	public static com.iucn.whp.dbservice.model.prot_mgmt_overall updateImpl(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prot_mgmt_overall, merge);
	}

	/**
	* Returns the prot_mgmt_overall with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException} if it could not be found.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall findByPrimaryKey(
		long pmo_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(pmo_id);
	}

	/**
	* Returns the prot_mgmt_overall with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall, or <code>null</code> if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByPrimaryKey(
		long pmo_id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(pmo_id);
	}

	/**
	* Returns all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassversionId(assessment_version_id);
	}

	/**
	* Returns a range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByassversionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall findByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall findByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the prot_mgmt_overalls before and after the current prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param pmo_id the primary key of the current prot_mgmt_overall
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall[] findByassversionId_PrevAndNext(
		long pmo_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_PrevAndNext(pmo_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssessmentVerId(assessment_version_id);
	}

	/**
	* Returns a range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentVerId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findByAssessmentVerId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentVerId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall findByAssessmentVerId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentVerId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByAssessmentVerId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentVerId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall findByAssessmentVerId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentVerId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_overall, or <code>null</code> if a matching prot_mgmt_overall could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall fetchByAssessmentVerId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentVerId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the prot_mgmt_overalls before and after the current prot_mgmt_overall in the ordered set where assessment_version_id = &#63;.
	*
	* @param pmo_id the primary key of the current prot_mgmt_overall
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prot_mgmt_overall
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_overall[] findByAssessmentVerId_PrevAndNext(
		long pmo_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_overallException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentVerId_PrevAndNext(pmo_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the prot_mgmt_overalls.
	*
	* @return the prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prot_mgmt_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the prot_mgmt_overalls where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassversionId(assessment_version_id);
	}

	/**
	* Removes all the prot_mgmt_overalls where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentVerId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssessmentVerId(assessment_version_id);
	}

	/**
	* Removes all the prot_mgmt_overalls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassversionId(assessment_version_id);
	}

	/**
	* Returns the number of prot_mgmt_overalls where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentVerId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssessmentVerId(assessment_version_id);
	}

	/**
	* Returns the number of prot_mgmt_overalls.
	*
	* @return the number of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static prot_mgmt_overallPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (prot_mgmt_overallPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					prot_mgmt_overallPersistence.class.getName());

			ReferenceRegistry.registerReference(prot_mgmt_overallUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(prot_mgmt_overallPersistence persistence) {
	}

	private static prot_mgmt_overallPersistence _persistence;
}