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

import com.iucn.whp.dbservice.model.assessment_whvalues;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessment_whvalues service. This utility wraps {@link assessment_whvaluesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_whvaluesPersistence
 * @see assessment_whvaluesPersistenceImpl
 * @generated
 */
public class assessment_whvaluesUtil {
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
	public static void clearCache(assessment_whvalues assessment_whvalues) {
		getPersistence().clearCache(assessment_whvalues);
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
	public static List<assessment_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessment_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessment_whvalues> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessment_whvalues update(
		assessment_whvalues assessment_whvalues, boolean merge)
		throws SystemException {
		return getPersistence().update(assessment_whvalues, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessment_whvalues update(
		assessment_whvalues assessment_whvalues, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessment_whvalues, merge, serviceContext);
	}

	/**
	* Caches the assessment_whvalues in the entity cache if it is enabled.
	*
	* @param assessment_whvalues the assessment_whvalues
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues) {
		getPersistence().cacheResult(assessment_whvalues);
	}

	/**
	* Caches the assessment_whvalueses in the entity cache if it is enabled.
	*
	* @param assessment_whvalueses the assessment_whvalueses
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> assessment_whvalueses) {
		getPersistence().cacheResult(assessment_whvalueses);
	}

	/**
	* Creates a new assessment_whvalues with the primary key. Does not add the assessment_whvalues to the database.
	*
	* @param whvalues_id the primary key for the new assessment_whvalues
	* @return the new assessment_whvalues
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues create(
		long whvalues_id) {
		return getPersistence().create(whvalues_id);
	}

	/**
	* Removes the assessment_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues remove(
		long whvalues_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whvalues_id);
	}

	public static com.iucn.whp.dbservice.model.assessment_whvalues updateImpl(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessment_whvalues, merge);
	}

	/**
	* Returns the assessment_whvalues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_whvaluesException} if it could not be found.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues findByPrimaryKey(
		long whvalues_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(whvalues_id);
	}

	/**
	* Returns the assessment_whvalues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues, or <code>null</code> if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues fetchByPrimaryKey(
		long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(whvalues_id);
	}

	/**
	* Returns all the assessment_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns a range of all the assessment_whvalueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @return the range of matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the assessment_whvalueses before and after the current assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param whvalues_id the primary key of the current assessment_whvalues
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_whvalues[] findByassessment_version_id_PrevAndNext(
		long whvalues_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(whvalues_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the assessment_whvalueses.
	*
	* @return the assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment_whvalueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @return the range of assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment_whvalueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the assessment_whvalueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of assessment_whvalueses.
	*
	* @return the number of assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessment_whvalues_whcriterions(pk);
	}

	/**
	* Returns a range of all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessment_whvalues
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @return the range of assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getassessment_whvalues_whcriterions(pk, start, end);
	}

	/**
	* Returns an ordered range of all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessment_whvalues
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getassessment_whvalues_whcriterions(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the number of assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessment_whvalues_whcriterionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getassessment_whvalues_whcriterionsSize(pk);
	}

	/**
	* Returns <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @param assessment_whvalues_whcriterionPK the primary key of the assessment_whvalues_whcriterion
	* @return <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessment_whvalues_whcriterion(long pk,
		long assessment_whvalues_whcriterionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsassessment_whvalues_whcriterion(pk,
			assessment_whvalues_whcriterionPK);
	}

	/**
	* Returns <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it.
	*
	* @param pk the primary key of the assessment_whvalues to check for associations with assessment_whvalues_whcriterions
	* @return <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsassessment_whvalues_whcriterions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsassessment_whvalues_whcriterions(pk);
	}

	/**
	* Returns all the current_state_trend_valueses associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valueses(pk);
	}

	/**
	* Returns a range of all the current_state_trend_valueses associated with the assessment_whvalues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessment_whvalues
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @return the range of current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valueses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the current_state_trend_valueses associated with the assessment_whvalues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessment_whvalues
	* @param start the lower bound of the range of assessment_whvalueses
	* @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getcurrent_state_trend_valueses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of current_state_trend_valueses associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the number of current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_state_trend_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getcurrent_state_trend_valuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @param current_state_trend_valuesPK the primary key of the current_state_trend_values
	* @return <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trend_values(long pk,
		long current_state_trend_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containscurrent_state_trend_values(pk,
			current_state_trend_valuesPK);
	}

	/**
	* Returns <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it.
	*
	* @param pk the primary key of the assessment_whvalues to check for associations with current_state_trend_valueses
	* @return <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containscurrent_state_trend_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containscurrent_state_trend_valueses(pk);
	}

	public static assessment_whvaluesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessment_whvaluesPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessment_whvaluesPersistence.class.getName());

			ReferenceRegistry.registerReference(assessment_whvaluesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(assessment_whvaluesPersistence persistence) {
	}

	private static assessment_whvaluesPersistence _persistence;
}