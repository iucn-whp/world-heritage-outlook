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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the state_trend_whvalues service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see state_trend_whvaluesPersistenceImpl
 * @see state_trend_whvaluesUtil
 * @generated
 */
public interface state_trend_whvaluesPersistence extends BasePersistence<state_trend_whvalues> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link state_trend_whvaluesUtil} to access the state_trend_whvalues persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the state_trend_whvalues in the entity cache if it is enabled.
	*
	* @param state_trend_whvalues the state_trend_whvalues
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.state_trend_whvalues state_trend_whvalues);

	/**
	* Caches the state_trend_whvalueses in the entity cache if it is enabled.
	*
	* @param state_trend_whvalueses the state_trend_whvalueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> state_trend_whvalueses);

	/**
	* Creates a new state_trend_whvalues with the primary key. Does not add the state_trend_whvalues to the database.
	*
	* @param state_trend_whval_id the primary key for the new state_trend_whvalues
	* @return the new state_trend_whvalues
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues create(
		long state_trend_whval_id);

	/**
	* Removes the state_trend_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues remove(
		long state_trend_whval_id)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.state_trend_whvalues updateImpl(
		com.iucn.whp.dbservice.model.state_trend_whvalues state_trend_whvalues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the state_trend_whvalues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException} if it could not be found.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues findByPrimaryKey(
		long state_trend_whval_id)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the state_trend_whvalues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_trend_whval_id the primary key of the state_trend_whvalues
	* @return the state_trend_whvalues, or <code>null</code> if a state_trend_whvalues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues fetchByPrimaryKey(
		long state_trend_whval_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_trend_whvalues, or <code>null</code> if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_trend_whvalues
	* @throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last state_trend_whvalues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_trend_whvalues, or <code>null</code> if a matching state_trend_whvalues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.state_trend_whvalues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.state_trend_whvalues[] findByassessment_version_id_PrevAndNext(
		long state_trend_whval_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchstate_trend_whvaluesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the state_trend_whvalueses.
	*
	* @return the state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the state_trend_whvalueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the state_trend_whvalueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of state_trend_whvalueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of state_trend_whvalueses.
	*
	* @return the number of state_trend_whvalueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}