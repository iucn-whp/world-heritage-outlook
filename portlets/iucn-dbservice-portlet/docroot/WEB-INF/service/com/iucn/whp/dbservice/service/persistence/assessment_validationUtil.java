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

import com.iucn.whp.dbservice.model.assessment_validation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_validation service. This utility wraps {@link assessment_validationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_validationPersistence
 * @see assessment_validationPersistenceImpl
 * @generated
 */
public class assessment_validationUtil {
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
	public static void clearCache(assessment_validation assessment_validation) {
		getPersistence().clearCache(assessment_validation);
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
	public static List<assessment_validation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_validation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_validation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_validation update(
		assessment_validation assessment_validation, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_validation, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_validation update(
		assessment_validation assessment_validation, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessment_validation, merge, serviceContext);
	}

	/**
	* Caches the assessment_validation in the entity cache if it is enabled.
	*
	* @param assessment_validation the assessment_validation
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation) {
		getPersistence().cacheResult(assessment_validation);
	}

	/**
	* Caches the assessment_validations in the entity cache if it is enabled.
	*
	* @param assessment_validations the assessment_validations
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_validation> assessment_validations) {
		getPersistence().cacheResult(assessment_validations);
	}

	/**
	* Creates a new assessment_validation with the primary key. Does not add the assessment_validation to the database.
	*
	* @param assessment_ver_val_id the primary key for the new assessment_validation
	* @return the new assessment_validation
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation create(
		long assessment_ver_val_id) {
		return getPersistence().create(assessment_ver_val_id);
	}

	/**
	* Removes the assessment_validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation remove(
		long assessment_ver_val_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(assessment_ver_val_id);
	}

	public static com.iucn.whp.dbservice.model.assessment_validation updateImpl(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_validation, merge);
	}

	/**
	* Returns the assessment_validation with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation findByPrimaryKey(
		long assessment_ver_val_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(assessment_ver_val_id);
	}

	/**
	* Returns the assessment_validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation, or <code>null</code> if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation fetchByPrimaryKey(
		long assessment_ver_val_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(assessment_ver_val_id);
	}

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation findByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id,
			assessment_step);
	}

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id(assessment_version_id,
			assessment_step);
	}

	/**
	* Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id(assessment_version_id,
			assessment_step, retrieveFromCache);
	}

	/**
	* Returns all the assessment_validations where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassessment_verId(assessment_version_id);
	}

	/**
	* Returns a range of all the assessment_validations where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @return the range of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_verId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_validations where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_verId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation findByassessment_verId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_verId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_verId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_verId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation findByassessment_verId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_verId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation fetchByassessment_verId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_verId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the assessment_validations before and after the current assessment_validation in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_ver_val_id the primary key of the current assessment_validation
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_validation
	* @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation[] findByassessment_verId_PrevAndNext(
		long assessment_ver_val_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_verId_PrevAndNext(assessment_ver_val_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the assessment_validations.
	*
	* @return the assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @return the range of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the assessment_validation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation removeByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws com.iucn.whp.dbservice.NoSuchassessment_validationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByassessment_version_id(assessment_version_id,
			assessment_step);
	}

	/**
	* Removes all the assessment_validations where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_verId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_verId(assessment_version_id);
	}

	/**
	* Removes all the assessment_validations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_validations where assessment_version_id = &#63; and assessment_step = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param assessment_step the assessment_step
	* @return the number of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id,
		long assessment_step)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id,
			assessment_step);
	}

	/**
	* Returns the number of assessment_validations where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_verId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassessment_verId(assessment_version_id);
	}

	/**
	* Returns the number of assessment_validations.
	*
	* @return the number of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_validationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_validationPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_validationPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_validationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_validationPersistence persistence) {
	}

	private static assessment_validationPersistence _persistence;
}