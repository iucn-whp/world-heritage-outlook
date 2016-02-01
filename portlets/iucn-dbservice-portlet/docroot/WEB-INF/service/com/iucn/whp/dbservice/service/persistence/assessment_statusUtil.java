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

import com.iucn.whp.dbservice.model.assessment_status;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_status service. This utility wraps {@link assessment_statusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_statusPersistence
 * @see assessment_statusPersistenceImpl
 * @generated
 */
public class assessment_statusUtil {
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
	public static void clearCache(assessment_status assessment_status) {
		getPersistence().clearCache(assessment_status);
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
	public static List<assessment_status> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_status> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_status> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_status update(
		assessment_status assessment_status, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_status, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_status update(
		assessment_status assessment_status, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assessment_status, merge, serviceContext);
	}

	/**
	* Caches the assessment_status in the entity cache if it is enabled.
	*
	* @param assessment_status the assessment_status
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_status assessment_status) {
		getPersistence().cacheResult(assessment_status);
	}

	/**
	* Caches the assessment_statuses in the entity cache if it is enabled.
	*
	* @param assessment_statuses the assessment_statuses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_status> assessment_statuses) {
		getPersistence().cacheResult(assessment_statuses);
	}

	/**
	* Creates a new assessment_status with the primary key. Does not add the assessment_status to the database.
	*
	* @param statusid the primary key for the new assessment_status
	* @return the new assessment_status
	*/
	public static com.iucn.whp.dbservice.model.assessment_status create(
		long statusid) {
		return getPersistence().create(statusid);
	}

	/**
	* Removes the assessment_status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusid the primary key of the assessment_status
	* @return the assessment_status that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_statusException if a assessment_status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_status remove(
		long statusid)
		throws com.iucn.whp.dbservice.NoSuchassessment_statusException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(statusid);
	}

	public static com.iucn.whp.dbservice.model.assessment_status updateImpl(
		com.iucn.whp.dbservice.model.assessment_status assessment_status,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_status, merge);
	}

	/**
	* Returns the assessment_status with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_statusException} if it could not be found.
	*
	* @param statusid the primary key of the assessment_status
	* @return the assessment_status
	* @throws com.iucn.whp.dbservice.NoSuchassessment_statusException if a assessment_status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_status findByPrimaryKey(
		long statusid)
		throws com.iucn.whp.dbservice.NoSuchassessment_statusException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(statusid);
	}

	/**
	* Returns the assessment_status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusid the primary key of the assessment_status
	* @return the assessment_status, or <code>null</code> if a assessment_status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_status fetchByPrimaryKey(
		long statusid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statusid);
	}

	/**
	* Returns all the assessment_statuses.
	*
	* @return the assessment_statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_status> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_statuses
	* @param end the upper bound of the range of assessment_statuses (not inclusive)
	* @return the range of assessment_statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_status> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_statuses
	* @param end the upper bound of the range of assessment_statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_status> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_statuses.
	*
	* @return the number of assessment_statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_statusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_statusPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_statusPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_statusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_statusPersistence persistence) {
	}

	private static assessment_statusPersistence _persistence;
}