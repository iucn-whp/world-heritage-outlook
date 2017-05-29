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

import com.iucn.whp.dbservice.model.potential_project_needs;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the potential_project_needs service. This utility wraps {@link potential_project_needsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see potential_project_needsPersistence
 * @see potential_project_needsPersistenceImpl
 * @generated
 */
public class potential_project_needsUtil {
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
		potential_project_needs potential_project_needs) {
		getPersistence().clearCache(potential_project_needs);
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
	public static List<potential_project_needs> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<potential_project_needs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<potential_project_needs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static potential_project_needs update(
		potential_project_needs potential_project_needs, boolean merge)
		throws SystemException {
		return getPersistence().update(potential_project_needs, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static potential_project_needs update(
		potential_project_needs potential_project_needs, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(potential_project_needs, merge, serviceContext);
	}

	/**
	* Caches the potential_project_needs in the entity cache if it is enabled.
	*
	* @param potential_project_needs the potential_project_needs
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs) {
		getPersistence().cacheResult(potential_project_needs);
	}

	/**
	* Caches the potential_project_needses in the entity cache if it is enabled.
	*
	* @param potential_project_needses the potential_project_needses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> potential_project_needses) {
		getPersistence().cacheResult(potential_project_needses);
	}

	/**
	* Creates a new potential_project_needs with the primary key. Does not add the potential_project_needs to the database.
	*
	* @param ppn_id the primary key for the new potential_project_needs
	* @return the new potential_project_needs
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs create(
		long ppn_id) {
		return getPersistence().create(ppn_id);
	}

	/**
	* Removes the potential_project_needs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs remove(
		long ppn_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ppn_id);
	}

	public static com.iucn.whp.dbservice.model.potential_project_needs updateImpl(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(potential_project_needs, merge);
	}

	/**
	* Returns the potential_project_needs with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchpotential_project_needsException} if it could not be found.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs findByPrimaryKey(
		long ppn_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ppn_id);
	}

	/**
	* Returns the potential_project_needs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs, or <code>null</code> if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs fetchByPrimaryKey(
		long ppn_id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ppn_id);
	}

	/**
	* Returns all the potential_project_needses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the potential_project_needses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @return the range of matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the potential_project_needses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_project_needs, or <code>null</code> if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_project_needs, or <code>null</code> if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the potential_project_needses before and after the current potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param ppn_id the primary key of the current potential_project_needs
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs[] findByassessment_version_id_PrevAndNext(
		long ppn_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(ppn_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the potential_project_needses.
	*
	* @return the potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the potential_project_needses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @return the range of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the potential_project_needses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the potential_project_needses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the potential_project_needses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of potential_project_needses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of potential_project_needses.
	*
	* @return the number of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static potential_project_needsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (potential_project_needsPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					potential_project_needsPersistence.class.getName());

			ReferenceRegistry.registerReference(potential_project_needsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(potential_project_needsPersistence persistence) {
	}

	private static potential_project_needsPersistence _persistence;
}