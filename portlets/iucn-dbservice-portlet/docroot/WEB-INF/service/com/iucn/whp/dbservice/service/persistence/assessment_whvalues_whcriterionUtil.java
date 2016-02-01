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

import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_whvalues_whcriterion service. This utility wraps {@link assessment_whvalues_whcriterionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_whvalues_whcriterionPersistence
 * @see assessment_whvalues_whcriterionPersistenceImpl
 * @generated
 */
public class assessment_whvalues_whcriterionUtil {
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
		assessment_whvalues_whcriterion assessment_whvalues_whcriterion) {
		getPersistence().clearCache(assessment_whvalues_whcriterion);
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
	public static List<assessment_whvalues_whcriterion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_whvalues_whcriterion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_whvalues_whcriterion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_whvalues_whcriterion update(
		assessment_whvalues_whcriterion assessment_whvalues_whcriterion,
		boolean merge) throws SystemException {
		return getPersistence().update(assessment_whvalues_whcriterion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_whvalues_whcriterion update(
		assessment_whvalues_whcriterion assessment_whvalues_whcriterion,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessment_whvalues_whcriterion, merge,
			serviceContext);
	}

	/**
	* Caches the assessment_whvalues_whcriterion in the entity cache if it is enabled.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion) {
		getPersistence().cacheResult(assessment_whvalues_whcriterion);
	}

	/**
	* Caches the assessment_whvalues_whcriterions in the entity cache if it is enabled.
	*
	* @param assessment_whvalues_whcriterions the assessment_whvalues_whcriterions
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> assessment_whvalues_whcriterions) {
		getPersistence().cacheResult(assessment_whvalues_whcriterions);
	}

	/**
	* Creates a new assessment_whvalues_whcriterion with the primary key. Does not add the assessment_whvalues_whcriterion to the database.
	*
	* @param wh_criteria_id the primary key for the new assessment_whvalues_whcriterion
	* @return the new assessment_whvalues_whcriterion
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion create(
		long wh_criteria_id) {
		return getPersistence().create(wh_criteria_id);
	}

	/**
	* Removes the assessment_whvalues_whcriterion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion remove(
		long wh_criteria_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(wh_criteria_id);
	}

	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion updateImpl(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .updateImpl(assessment_whvalues_whcriterion, merge);
	}

	/**
	* Returns the assessment_whvalues_whcriterion with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException} if it could not be found.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findByPrimaryKey(
		long wh_criteria_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(wh_criteria_id);
	}

	/**
	* Returns the assessment_whvalues_whcriterion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion, or <code>null</code> if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchByPrimaryKey(
		long wh_criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(wh_criteria_id);
	}

	/**
	* Returns all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @return the matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBywhvalues_id(whvalues_id);
	}

	/**
	* Returns a range of all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param whvalues_id the whvalues_id
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @return the range of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBywhvalues_id(whvalues_id, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param whvalues_id the whvalues_id
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findBywhvalues_id(
		long whvalues_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhvalues_id(whvalues_id, start, end, orderByComparator);
	}

	/**
	* Returns the first assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findBywhvalues_id_First(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhvalues_id_First(whvalues_id, orderByComparator);
	}

	/**
	* Returns the first assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues_whcriterion, or <code>null</code> if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchBywhvalues_id_First(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBywhvalues_id_First(whvalues_id, orderByComparator);
	}

	/**
	* Returns the last assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion findBywhvalues_id_Last(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhvalues_id_Last(whvalues_id, orderByComparator);
	}

	/**
	* Returns the last assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues_whcriterion, or <code>null</code> if a matching assessment_whvalues_whcriterion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchBywhvalues_id_Last(
		long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBywhvalues_id_Last(whvalues_id, orderByComparator);
	}

	/**
	* Returns the assessment_whvalues_whcriterions before and after the current assessment_whvalues_whcriterion in the ordered set where whvalues_id = &#63;.
	*
	* @param wh_criteria_id the primary key of the current assessment_whvalues_whcriterion
	* @param whvalues_id the whvalues_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_whvalues_whcriterion
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion[] findBywhvalues_id_PrevAndNext(
		long wh_criteria_id, long whvalues_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvalues_whcriterionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBywhvalues_id_PrevAndNext(wh_criteria_id, whvalues_id,
			orderByComparator);
	}

	/**
	* Returns all the assessment_whvalues_whcriterions.
	*
	* @return the assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_whvalues_whcriterions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @return the range of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalues_whcriterions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_whvalues_whcriterions where whvalues_id = &#63; from the database.
	*
	* @param whvalues_id the whvalues_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBywhvalues_id(long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBywhvalues_id(whvalues_id);
	}

	/**
	* Removes all the assessment_whvalues_whcriterions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_whvalues_whcriterions where whvalues_id = &#63;.
	*
	* @param whvalues_id the whvalues_id
	* @return the number of matching assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static int countBywhvalues_id(long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBywhvalues_id(whvalues_id);
	}

	/**
	* Returns the number of assessment_whvalues_whcriterions.
	*
	* @return the number of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_whvalues_whcriterionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_whvalues_whcriterionPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_whvalues_whcriterionPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_whvalues_whcriterionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		assessment_whvalues_whcriterionPersistence persistence) {
	}

	private static assessment_whvalues_whcriterionPersistence _persistence;
}