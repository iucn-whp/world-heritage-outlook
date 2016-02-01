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

import com.iucn.whp.dbservice.model.assessment_stages;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_stages service. This utility wraps {@link assessment_stagesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_stagesPersistence
 * @see assessment_stagesPersistenceImpl
 * @generated
 */
public class assessment_stagesUtil {
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
	public static void clearCache(assessment_stages assessment_stages) {
		getPersistence().clearCache(assessment_stages);
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
	public static List<assessment_stages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_stages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_stages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_stages update(
		assessment_stages assessment_stages, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_stages, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_stages update(
		assessment_stages assessment_stages, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assessment_stages, merge, serviceContext);
	}

	/**
	* Caches the assessment_stages in the entity cache if it is enabled.
	*
	* @param assessment_stages the assessment_stages
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages) {
		getPersistence().cacheResult(assessment_stages);
	}

	/**
	* Caches the assessment_stageses in the entity cache if it is enabled.
	*
	* @param assessment_stageses the assessment_stageses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_stages> assessment_stageses) {
		getPersistence().cacheResult(assessment_stageses);
	}

	/**
	* Creates a new assessment_stages with the primary key. Does not add the assessment_stages to the database.
	*
	* @param stageid the primary key for the new assessment_stages
	* @return the new assessment_stages
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages create(
		long stageid) {
		return getPersistence().create(stageid);
	}

	/**
	* Removes the assessment_stages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_stagesException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages remove(
		long stageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_stagesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(stageid);
	}

	public static com.iucn.whp.dbservice.model.assessment_stages updateImpl(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_stages, merge);
	}

	/**
	* Returns the assessment_stages with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_stagesException} if it could not be found.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages
	* @throws com.iucn.whp.dbservice.NoSuchassessment_stagesException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages findByPrimaryKey(
		long stageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_stagesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(stageid);
	}

	/**
	* Returns the assessment_stages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages, or <code>null</code> if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages fetchByPrimaryKey(
		long stageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(stageid);
	}

	/**
	* Returns all the assessment_stageses.
	*
	* @return the assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_stageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_stageses
	* @param end the upper bound of the range of assessment_stageses (not inclusive)
	* @return the range of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_stageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_stageses
	* @param end the upper bound of the range of assessment_stageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_stageses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_stageses.
	*
	* @return the number of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_stagesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_stagesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_stagesPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_stagesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_stagesPersistence persistence) {
	}

	private static assessment_stagesPersistence _persistence;
}