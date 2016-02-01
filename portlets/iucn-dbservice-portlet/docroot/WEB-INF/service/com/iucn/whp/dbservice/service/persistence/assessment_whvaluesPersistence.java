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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessment_whvalues service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_whvaluesPersistenceImpl
 * @see assessment_whvaluesUtil
 * @generated
 */
public interface assessment_whvaluesPersistence extends BasePersistence<assessment_whvalues> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessment_whvaluesUtil} to access the assessment_whvalues persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessment_whvalues in the entity cache if it is enabled.
	*
	* @param assessment_whvalues the assessment_whvalues
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues);

	/**
	* Caches the assessment_whvalueses in the entity cache if it is enabled.
	*
	* @param assessment_whvalueses the assessment_whvalueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> assessment_whvalueses);

	/**
	* Creates a new assessment_whvalues with the primary key. Does not add the assessment_whvalues to the database.
	*
	* @param whvalues_id the primary key for the new assessment_whvalues
	* @return the new assessment_whvalues
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues create(
		long whvalues_id);

	/**
	* Removes the assessment_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues remove(
		long whvalues_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessment_whvalues updateImpl(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_whvalues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_whvaluesException} if it could not be found.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues findByPrimaryKey(
		long whvalues_id)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_whvalues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whvalues_id the primary key of the assessment_whvalues
	* @return the assessment_whvalues, or <code>null</code> if a assessment_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues fetchByPrimaryKey(
		long whvalues_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.assessment_whvalues[] findByassessment_version_id_PrevAndNext(
		long whvalues_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_whvalueses.
	*
	* @return the assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_whvalueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_whvalueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_whvalueses.
	*
	* @return the number of assessment_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_whvalues_whcriterions associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the number of assessment_whvalues_whcriterions associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public int getassessment_whvalues_whcriterionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @param assessment_whvalues_whcriterionPK the primary key of the assessment_whvalues_whcriterion
	* @return <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsassessment_whvalues_whcriterion(long pk,
		long assessment_whvalues_whcriterionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it.
	*
	* @param pk the primary key of the assessment_whvalues to check for associations with assessment_whvalues_whcriterions
	* @return <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsassessment_whvalues_whcriterions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_state_trend_valueses associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_state_trend_valueses associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @return the number of current_state_trend_valueses associated with the assessment_whvalues
	* @throws SystemException if a system exception occurred
	*/
	public int getcurrent_state_trend_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues.
	*
	* @param pk the primary key of the assessment_whvalues
	* @param current_state_trend_valuesPK the primary key of the current_state_trend_values
	* @return <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containscurrent_state_trend_values(long pk,
		long current_state_trend_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it.
	*
	* @param pk the primary key of the assessment_whvalues to check for associations with current_state_trend_valueses
	* @return <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containscurrent_state_trend_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}