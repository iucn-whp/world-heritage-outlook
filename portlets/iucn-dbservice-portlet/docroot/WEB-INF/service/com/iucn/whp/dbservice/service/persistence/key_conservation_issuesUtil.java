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

import com.iucn.whp.dbservice.model.key_conservation_issues;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the key_conservation_issues service. This utility wraps {@link key_conservation_issuesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see key_conservation_issuesPersistence
 * @see key_conservation_issuesPersistenceImpl
 * @generated
 */
public class key_conservation_issuesUtil {
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
		key_conservation_issues key_conservation_issues) {
		getPersistence().clearCache(key_conservation_issues);
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
	public static List<key_conservation_issues> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<key_conservation_issues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<key_conservation_issues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static key_conservation_issues update(
		key_conservation_issues key_conservation_issues, boolean merge)
		throws SystemException {
		return getPersistence().update(key_conservation_issues, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static key_conservation_issues update(
		key_conservation_issues key_conservation_issues, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(key_conservation_issues, merge, serviceContext);
	}

	/**
	* Caches the key_conservation_issues in the entity cache if it is enabled.
	*
	* @param key_conservation_issues the key_conservation_issues
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues) {
		getPersistence().cacheResult(key_conservation_issues);
	}

	/**
	* Caches the key_conservation_issueses in the entity cache if it is enabled.
	*
	* @param key_conservation_issueses the key_conservation_issueses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> key_conservation_issueses) {
		getPersistence().cacheResult(key_conservation_issueses);
	}

	/**
	* Creates a new key_conservation_issues with the primary key. Does not add the key_conservation_issues to the database.
	*
	* @param key_conservation_issues_id the primary key for the new key_conservation_issues
	* @return the new key_conservation_issues
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues create(
		long key_conservation_issues_id) {
		return getPersistence().create(key_conservation_issues_id);
	}

	/**
	* Removes the key_conservation_issues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues remove(
		long key_conservation_issues_id)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(key_conservation_issues_id);
	}

	public static com.iucn.whp.dbservice.model.key_conservation_issues updateImpl(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(key_conservation_issues, merge);
	}

	/**
	* Returns the key_conservation_issues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException} if it could not be found.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues findByPrimaryKey(
		long key_conservation_issues_id)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(key_conservation_issues_id);
	}

	/**
	* Returns the key_conservation_issues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues, or <code>null</code> if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues fetchByPrimaryKey(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(key_conservation_issues_id);
	}

	/**
	* Returns all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching key_conservation_issues, or <code>null</code> if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching key_conservation_issues, or <code>null</code> if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the key_conservation_issueses before and after the current key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param key_conservation_issues_id the primary key of the current key_conservation_issues
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues[] findByassessment_version_id_PrevAndNext(
		long key_conservation_issues_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(key_conservation_issues_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the key_conservation_issueses.
	*
	* @return the key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the key_conservation_issueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the key_conservation_issueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of key_conservation_issueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of key_conservation_issueses.
	*
	* @return the number of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static key_conservation_issuesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (key_conservation_issuesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					key_conservation_issuesPersistence.class.getName());

			ReferenceRegistry.registerReference(key_conservation_issuesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(key_conservation_issuesPersistence persistence) {
	}

	private static key_conservation_issuesPersistence _persistence;
}