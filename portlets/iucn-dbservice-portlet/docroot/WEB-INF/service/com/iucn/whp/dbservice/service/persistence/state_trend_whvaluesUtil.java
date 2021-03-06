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

import com.iucn.whp.dbservice.model.state_trend_whvalues;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the state_trend_whvalues service. This utility wraps {@link state_trend_whvaluesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see state_trend_whvaluesPersistence
 * @see state_trend_whvaluesPersistenceImpl
 * @generated
 */
public class state_trend_whvaluesUtil {
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
	public static void clearCache(state_trend_whvalues state_trend_whvalues) {
		getPersistence().clearCache(state_trend_whvalues);
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
	public static List<state_trend_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<state_trend_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<state_trend_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static state_trend_whvalues update(
		state_trend_whvalues state_trend_whvalues, boolean merge)
		throws SystemException {
		return getPersistence().update(state_trend_whvalues, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static state_trend_whvalues update(
		state_trend_whvalues state_trend_whvalues, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(state_trend_whvalues, merge, serviceContext);
	}

	/**
	* Caches the state_trend_whvalues in the entity cache if it is enabled.
	*
	* @param state_trend_whvalues the state_trend_whvalues
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.state_trend_whvalues state_trend_whvalues) {
		getPersistence().cacheResult(state_trend_whvalues);
	}

	/**
	* Caches the state_trend_whvalueses in the entity cache if it is enabled.
	*
	* @param state_trend_whvalueses the state_trend_whvalueses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> state_trend_whvalueses) {
		getPersistence().cacheResult(state_trend_whvalueses);
	}

	/**
	* Creates a new state_trend_whvalues with the primary key. Does not add the state_trend_whvalues to the database.
	*
	* @param state_trend_whval_id the primary key for the new state_trend_whvalues
	* @return the new state_trend_whvalues
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues create(
		long state_trend_whval_id) {
		return getPersistence().create(state_trend_whval_id);
	}

	/**
	* Removes the state_trend_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues remove(
		long state_trend_whval_id)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(state_trend_whval_id);
	}

	public static com.iucn.whp.dbservice.model.state_trend_whvalues updateImpl(
		com.iucn.whp.dbservice.model.state_trend_whvalues state_trend_whvalues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(state_trend_whvalues, merge);
	}

	/**
	* Returns the state_trend_whvalues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException} if it could not be found.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues findByPrimaryKey(
		long state_trend_whval_id)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(state_trend_whval_id);
	}

	/**
	* Returns the state_trend_whvalues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues, or <code>null</code> if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues fetchByPrimaryKey(
		long state_trend_whval_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(state_trend_whval_id);
	}

	/**
	* Returns all the state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of state_trend_whvalueses
	* @param end the upper bound of the range of state_trend_whvalueses (not inclusive)
	* @return the range of matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of state_trend_whvalueses
	* @param end the upper bound of the range of state_trend_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_trend_whvalues, or <code>null</code> if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_trend_whvalues, or <code>null</code> if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the state_trend_whvalueses before and after the current state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param state_trend_whval_id the primary key of the current state_trend_whvalues
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.state_trend_whvalues[] findByassessment_version_id_PrevAndNext(
		long state_trend_whval_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(state_trend_whval_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the state_trend_whvalueses.
	*
	* @return the state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the state_trend_whvalueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of state_trend_whvalueses
	* @param end the upper bound of the range of state_trend_whvalueses (not inclusive)
	* @return the range of state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the state_trend_whvalueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of state_trend_whvalueses
	* @param end the upper bound of the range of state_trend_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the state_trend_whvalueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the state_trend_whvalueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of state_trend_whvalueses.
	*
	* @return the number of state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static state_trend_whvaluesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (state_trend_whvaluesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					state_trend_whvaluesPersistence.class.getName());

			ReferenceRegistry.registerReference(state_trend_whvaluesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(state_trend_whvaluesPersistence persistence) {
	}

	private static state_trend_whvaluesPersistence _persistence;
}