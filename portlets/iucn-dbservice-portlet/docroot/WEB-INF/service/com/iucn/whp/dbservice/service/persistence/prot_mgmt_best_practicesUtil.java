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

import com.iucn.whp.dbservice.model.prot_mgmt_best_practices;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the prot_mgmt_best_practices service. This utility wraps {@link prot_mgmt_best_practicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see prot_mgmt_best_practicesPersistence
 * @see prot_mgmt_best_practicesPersistenceImpl
 * @generated
 */
public class prot_mgmt_best_practicesUtil {
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
		prot_mgmt_best_practices prot_mgmt_best_practices) {
		getPersistence().clearCache(prot_mgmt_best_practices);
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
	public static List<prot_mgmt_best_practices> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prot_mgmt_best_practices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prot_mgmt_best_practices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static prot_mgmt_best_practices update(
		prot_mgmt_best_practices prot_mgmt_best_practices, boolean merge)
		throws SystemException {
		return getPersistence().update(prot_mgmt_best_practices, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static prot_mgmt_best_practices update(
		prot_mgmt_best_practices prot_mgmt_best_practices, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(prot_mgmt_best_practices, merge, serviceContext);
	}

	/**
	* Caches the prot_mgmt_best_practices in the entity cache if it is enabled.
	*
	* @param prot_mgmt_best_practices the prot_mgmt_best_practices
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices) {
		getPersistence().cacheResult(prot_mgmt_best_practices);
	}

	/**
	* Caches the prot_mgmt_best_practiceses in the entity cache if it is enabled.
	*
	* @param prot_mgmt_best_practiceses the prot_mgmt_best_practiceses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> prot_mgmt_best_practiceses) {
		getPersistence().cacheResult(prot_mgmt_best_practiceses);
	}

	/**
	* Creates a new prot_mgmt_best_practices with the primary key. Does not add the prot_mgmt_best_practices to the database.
	*
	* @param best_practice_id the primary key for the new prot_mgmt_best_practices
	* @return the new prot_mgmt_best_practices
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices create(
		long best_practice_id) {
		return getPersistence().create(best_practice_id);
	}

	/**
	* Removes the prot_mgmt_best_practices with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param best_practice_id the primary key of the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices that was removed
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices remove(
		long best_practice_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(best_practice_id);
	}

	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices updateImpl(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prot_mgmt_best_practices, merge);
	}

	/**
	* Returns the prot_mgmt_best_practices with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException} if it could not be found.
	*
	* @param best_practice_id the primary key of the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices findByPrimaryKey(
		long best_practice_id)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(best_practice_id);
	}

	/**
	* Returns the prot_mgmt_best_practices with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param best_practice_id the primary key of the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices, or <code>null</code> if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices fetchByPrimaryKey(
		long best_practice_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(best_practice_id);
	}

	/**
	* Returns all the prot_mgmt_best_practiceses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findByassversionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassversionId(assessment_version_id);
	}

	/**
	* Returns a range of all the prot_mgmt_best_practiceses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_best_practiceses
	* @param end the upper bound of the range of prot_mgmt_best_practiceses (not inclusive)
	* @return the range of matching prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findByassversionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_best_practiceses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of prot_mgmt_best_practiceses
	* @param end the upper bound of the range of prot_mgmt_best_practiceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findByassversionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_best_practices in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_best_practices
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException if a matching prot_mgmt_best_practices could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices findByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first prot_mgmt_best_practices in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prot_mgmt_best_practices, or <code>null</code> if a matching prot_mgmt_best_practices could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices fetchByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_best_practices in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_best_practices
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException if a matching prot_mgmt_best_practices could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices findByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last prot_mgmt_best_practices in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prot_mgmt_best_practices, or <code>null</code> if a matching prot_mgmt_best_practices could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices fetchByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the prot_mgmt_best_practiceses before and after the current prot_mgmt_best_practices in the ordered set where assessment_version_id = &#63;.
	*
	* @param best_practice_id the primary key of the current prot_mgmt_best_practices
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prot_mgmt_best_practices
	* @throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.prot_mgmt_best_practices[] findByassversionId_PrevAndNext(
		long best_practice_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchprot_mgmt_best_practicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_PrevAndNext(best_practice_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the prot_mgmt_best_practiceses.
	*
	* @return the prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prot_mgmt_best_practiceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_best_practiceses
	* @param end the upper bound of the range of prot_mgmt_best_practiceses (not inclusive)
	* @return the range of prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prot_mgmt_best_practiceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_best_practiceses
	* @param end the upper bound of the range of prot_mgmt_best_practiceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the prot_mgmt_best_practiceses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassversionId(assessment_version_id);
	}

	/**
	* Removes all the prot_mgmt_best_practiceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prot_mgmt_best_practiceses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassversionId(assessment_version_id);
	}

	/**
	* Returns the number of prot_mgmt_best_practiceses.
	*
	* @return the number of prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static prot_mgmt_best_practicesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (prot_mgmt_best_practicesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					prot_mgmt_best_practicesPersistence.class.getName());

			ReferenceRegistry.registerReference(prot_mgmt_best_practicesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(prot_mgmt_best_practicesPersistence persistence) {
	}

	private static prot_mgmt_best_practicesPersistence _persistence;
}