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

import com.iucn.whp.dbservice.model.assessing_threats_current;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessing_threats_current service. This utility wraps {@link assessing_threats_currentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_currentPersistence
 * @see assessing_threats_currentPersistenceImpl
 * @generated
 */
public class assessing_threats_currentUtil {
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
		assessing_threats_current assessing_threats_current) {
		getPersistence().clearCache(assessing_threats_current);
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
	public static List<assessing_threats_current> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessing_threats_current> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessing_threats_current> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessing_threats_current update(
		assessing_threats_current assessing_threats_current, boolean merge)
		throws SystemException {
		return getPersistence().update(assessing_threats_current, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessing_threats_current update(
		assessing_threats_current assessing_threats_current, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessing_threats_current, merge, serviceContext);
	}

	/**
	* Caches the assessing_threats_current in the entity cache if it is enabled.
	*
	* @param assessing_threats_current the assessing_threats_current
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current) {
		getPersistence().cacheResult(assessing_threats_current);
	}

	/**
	* Caches the assessing_threats_currents in the entity cache if it is enabled.
	*
	* @param assessing_threats_currents the assessing_threats_currents
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> assessing_threats_currents) {
		getPersistence().cacheResult(assessing_threats_currents);
	}

	/**
	* Creates a new assessing_threats_current with the primary key. Does not add the assessing_threats_current to the database.
	*
	* @param current_threat_id the primary key for the new assessing_threats_current
	* @return the new assessing_threats_current
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current create(
		long current_threat_id) {
		return getPersistence().create(current_threat_id);
	}

	/**
	* Removes the assessing_threats_current with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current remove(
		long current_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(current_threat_id);
	}

	public static com.iucn.whp.dbservice.model.assessing_threats_current updateImpl(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessing_threats_current, merge);
	}

	/**
	* Returns the assessing_threats_current with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessing_threats_currentException} if it could not be found.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current findByPrimaryKey(
		long current_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(current_threat_id);
	}

	/**
	* Returns the assessing_threats_current with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current, or <code>null</code> if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current fetchByPrimaryKey(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(current_threat_id);
	}

	/**
	* Returns all the assessing_threats_currents where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findByassesment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByassesment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the assessing_threats_currents where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of matching assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findByassesment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassesment_version_id(assessment_version_id, start, end);
	}

	/**
	* Returns an ordered range of all the assessing_threats_currents where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findByassesment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassesment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_current
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a matching assessing_threats_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current findByassesment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassesment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_current, or <code>null</code> if a matching assessing_threats_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current fetchByassesment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassesment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_current
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a matching assessing_threats_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current findByassesment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassesment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_current, or <code>null</code> if a matching assessing_threats_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current fetchByassesment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassesment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the assessing_threats_currents before and after the current assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param current_threat_id the primary key of the current assessing_threats_current
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessing_threats_current
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current[] findByassesment_version_id_PrevAndNext(
		long current_threat_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassesment_version_id_PrevAndNext(current_threat_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the assessing_threats_currents.
	*
	* @return the assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessing_threats_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessing_threats_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessing_threats_currents where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassesment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassesment_version_id(assessment_version_id);
	}

	/**
	* Removes all the assessing_threats_currents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessing_threats_currents where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassesment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassesment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of assessing_threats_currents.
	*
	* @return the number of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the current_threat_assessment_cats associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @return the current_threat_assessment_cats associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_assessment_cats(pk);
	}

	/**
	* Returns a range of all the current_threat_assessment_cats associated with the assessing_threats_current.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_current
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of current_threat_assessment_cats associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_assessment_cats(pk, start, end);
	}

	/**
	* Returns an ordered range of all the current_threat_assessment_cats associated with the assessing_threats_current.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_current
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_threat_assessment_cats associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getcurrent_threat_assessment_cats(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of current_threat_assessment_cats associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @return the number of current_threat_assessment_cats associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_threat_assessment_catsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_assessment_catsSize(pk);
	}

	/**
	* Returns <code>true</code> if the current_threat_assessment_cat is associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @param current_threat_assessment_catPK the primary key of the current_threat_assessment_cat
	* @return <code>true</code> if the current_threat_assessment_cat is associated with the assessing_threats_current; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_threat_assessment_cat(long pk,
		long current_threat_assessment_catPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containscurrent_threat_assessment_cat(pk,
			current_threat_assessment_catPK);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_current has any current_threat_assessment_cats associated with it.
	*
	* @param pk the primary key of the assessing_threats_current to check for associations with current_threat_assessment_cats
	* @return <code>true</code> if the assessing_threats_current has any current_threat_assessment_cats associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_threat_assessment_cats(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containscurrent_threat_assessment_cats(pk);
	}

	/**
	* Returns all the current_threat_valueses associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @return the current_threat_valueses associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_valueses(pk);
	}

	/**
	* Returns a range of all the current_threat_valueses associated with the assessing_threats_current.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_current
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of current_threat_valueses associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_valueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the current_threat_valueses associated with the assessing_threats_current.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_current
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_threat_valueses associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getcurrent_threat_valueses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of current_threat_valueses associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @return the number of current_threat_valueses associated with the assessing_threats_current
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_threat_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_threat_valuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the current_threat_values is associated with the assessing_threats_current.
	*
	* @param pk the primary key of the assessing_threats_current
	* @param current_threat_valuesPK the primary key of the current_threat_values
	* @return <code>true</code> if the current_threat_values is associated with the assessing_threats_current; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_threat_values(long pk,
		long current_threat_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containscurrent_threat_values(pk, current_threat_valuesPK);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_current has any current_threat_valueses associated with it.
	*
	* @param pk the primary key of the assessing_threats_current to check for associations with current_threat_valueses
	* @return <code>true</code> if the assessing_threats_current has any current_threat_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_threat_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containscurrent_threat_valueses(pk);
	}

	public static assessing_threats_currentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessing_threats_currentPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessing_threats_currentPersistence.class.getName());

			ReferenceRegistry.registerReference(assessing_threats_currentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessing_threats_currentPersistence persistence) {
	}

	private static assessing_threats_currentPersistence _persistence;
}