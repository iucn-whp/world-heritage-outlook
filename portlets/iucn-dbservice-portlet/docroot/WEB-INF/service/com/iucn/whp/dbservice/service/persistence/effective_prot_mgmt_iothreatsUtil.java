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

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the effective_prot_mgmt_iothreats service. This utility wraps {@link effective_prot_mgmt_iothreatsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see effective_prot_mgmt_iothreatsPersistence
 * @see effective_prot_mgmt_iothreatsPersistenceImpl
 * @generated
 */
public class effective_prot_mgmt_iothreatsUtil {
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
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		getPersistence().clearCache(effective_prot_mgmt_iothreats);
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
	public static List<effective_prot_mgmt_iothreats> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<effective_prot_mgmt_iothreats> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<effective_prot_mgmt_iothreats> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static effective_prot_mgmt_iothreats update(
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats,
		boolean merge) throws SystemException {
		return getPersistence().update(effective_prot_mgmt_iothreats, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static effective_prot_mgmt_iothreats update(
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(effective_prot_mgmt_iothreats, merge, serviceContext);
	}

	/**
	* Caches the effective_prot_mgmt_iothreats in the entity cache if it is enabled.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		getPersistence().cacheResult(effective_prot_mgmt_iothreats);
	}

	/**
	* Caches the effective_prot_mgmt_iothreatses in the entity cache if it is enabled.
	*
	* @param effective_prot_mgmt_iothreatses the effective_prot_mgmt_iothreatses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatses) {
		getPersistence().cacheResult(effective_prot_mgmt_iothreatses);
	}

	/**
	* Creates a new effective_prot_mgmt_iothreats with the primary key. Does not add the effective_prot_mgmt_iothreats to the database.
	*
	* @param id the primary key for the new effective_prot_mgmt_iothreats
	* @return the new effective_prot_mgmt_iothreats
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the effective_prot_mgmt_iothreats with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was removed
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats remove(
		long id)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats updateImpl(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(effective_prot_mgmt_iothreats, merge);
	}

	/**
	* Returns the effective_prot_mgmt_iothreats with the primary key or throws a {@link com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException} if it could not be found.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the effective_prot_mgmt_iothreats with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats, or <code>null</code> if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassversionId(assessment_version_id);
	}

	/**
	* Returns a range of all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of effective_prot_mgmt_iothreatses
	* @param end the upper bound of the range of effective_prot_mgmt_iothreatses (not inclusive)
	* @return the range of matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of effective_prot_mgmt_iothreatses
	* @param end the upper bound of the range of effective_prot_mgmt_iothreatses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId(assessment_version_id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching effective_prot_mgmt_iothreats, or <code>null</code> if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching effective_prot_mgmt_iothreats, or <code>null</code> if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassversionId_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the effective_prot_mgmt_iothreatses before and after the current effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param id the primary key of the current effective_prot_mgmt_iothreats
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats[] findByassversionId_PrevAndNext(
		long id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassversionId_PrevAndNext(id, assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns all the effective_prot_mgmt_iothreatses.
	*
	* @return the effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the effective_prot_mgmt_iothreatses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of effective_prot_mgmt_iothreatses
	* @param end the upper bound of the range of effective_prot_mgmt_iothreatses (not inclusive)
	* @return the range of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the effective_prot_mgmt_iothreatses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of effective_prot_mgmt_iothreatses
	* @param end the upper bound of the range of effective_prot_mgmt_iothreatses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassversionId(assessment_version_id);
	}

	/**
	* Removes all the effective_prot_mgmt_iothreatses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassversionId(assessment_version_id);
	}

	/**
	* Returns the number of effective_prot_mgmt_iothreatses.
	*
	* @return the number of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static effective_prot_mgmt_iothreatsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (effective_prot_mgmt_iothreatsPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					effective_prot_mgmt_iothreatsPersistence.class.getName());

			ReferenceRegistry.registerReference(effective_prot_mgmt_iothreatsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		effective_prot_mgmt_iothreatsPersistence persistence) {
	}

	private static effective_prot_mgmt_iothreatsPersistence _persistence;
}