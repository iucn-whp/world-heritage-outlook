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

import com.iucn.whp.dbservice.model.assessment_lang_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_lang_lkp service. This utility wraps {@link assessment_lang_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_lang_lkpPersistence
 * @see assessment_lang_lkpPersistenceImpl
 * @generated
 */
public class assessment_lang_lkpUtil {
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
	public static void clearCache(assessment_lang_lkp assessment_lang_lkp) {
		getPersistence().clearCache(assessment_lang_lkp);
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
	public static List<assessment_lang_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_lang_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_lang_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_lang_lkp update(
		assessment_lang_lkp assessment_lang_lkp, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_lang_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_lang_lkp update(
		assessment_lang_lkp assessment_lang_lkp, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessment_lang_lkp, merge, serviceContext);
	}

	/**
	* Caches the assessment_lang_lkp in the entity cache if it is enabled.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp) {
		getPersistence().cacheResult(assessment_lang_lkp);
	}

	/**
	* Caches the assessment_lang_lkps in the entity cache if it is enabled.
	*
	* @param assessment_lang_lkps the assessment_lang_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> assessment_lang_lkps) {
		getPersistence().cacheResult(assessment_lang_lkps);
	}

	/**
	* Creates a new assessment_lang_lkp with the primary key. Does not add the assessment_lang_lkp to the database.
	*
	* @param languageid the primary key for the new assessment_lang_lkp
	* @return the new assessment_lang_lkp
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_lkp create(
		long languageid) {
		return getPersistence().create(languageid);
	}

	/**
	* Removes the assessment_lang_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_lkp remove(
		long languageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(languageid);
	}

	public static com.iucn.whp.dbservice.model.assessment_lang_lkp updateImpl(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_lang_lkp, merge);
	}

	/**
	* Returns the assessment_lang_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException} if it could not be found.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_lkp findByPrimaryKey(
		long languageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(languageid);
	}

	/**
	* Returns the assessment_lang_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp, or <code>null</code> if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_lang_lkp fetchByPrimaryKey(
		long languageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(languageid);
	}

	/**
	* Returns all the assessment_lang_lkps.
	*
	* @return the assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_lang_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_lkps
	* @param end the upper bound of the range of assessment_lang_lkps (not inclusive)
	* @return the range of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_lang_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_lkps
	* @param end the upper bound of the range of assessment_lang_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_lang_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_lang_lkps.
	*
	* @return the number of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static assessment_lang_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_lang_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_lang_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_lang_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_lang_lkpPersistence persistence) {
	}

	private static assessment_lang_lkpPersistence _persistence;
}