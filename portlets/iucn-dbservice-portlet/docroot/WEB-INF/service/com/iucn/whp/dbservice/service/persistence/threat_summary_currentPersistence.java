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

import com.iucn.whp.dbservice.model.threat_summary_current;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the threat_summary_current service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_currentPersistenceImpl
 * @see threat_summary_currentUtil
 * @generated
 */
public interface threat_summary_currentPersistence extends BasePersistence<threat_summary_current> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link threat_summary_currentUtil} to access the threat_summary_current persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the threat_summary_current in the entity cache if it is enabled.
	*
	* @param threat_summary_current the threat_summary_current
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current);

	/**
	* Caches the threat_summary_currents in the entity cache if it is enabled.
	*
	* @param threat_summary_currents the threat_summary_currents
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> threat_summary_currents);

	/**
	* Creates a new threat_summary_current with the primary key. Does not add the threat_summary_current to the database.
	*
	* @param threat_sum_cur_id the primary key for the new threat_summary_current
	* @return the new threat_summary_current
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current create(
		long threat_sum_cur_id);

	/**
	* Removes the threat_summary_current with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_sum_cur_id the primary key of the threat_summary_current
	* @return the threat_summary_current that was removed
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current remove(
		long threat_sum_cur_id)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.threat_summary_current updateImpl(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the threat_summary_current with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_summary_currentException} if it could not be found.
	*
	* @param threat_sum_cur_id the primary key of the threat_summary_current
	* @return the threat_summary_current
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current findByPrimaryKey(
		long threat_sum_cur_id)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the threat_summary_current with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param threat_sum_cur_id the primary key of the threat_summary_current
	* @return the threat_summary_current, or <code>null</code> if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current fetchByPrimaryKey(
		long threat_sum_cur_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the threat_summary_currents where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the threat_summary_currents where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of threat_summary_currents
	* @param end the upper bound of the range of threat_summary_currents (not inclusive)
	* @return the range of matching threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the threat_summary_currents where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of threat_summary_currents
	* @param end the upper bound of the range of threat_summary_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first threat_summary_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching threat_summary_current
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException if a matching threat_summary_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first threat_summary_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching threat_summary_current, or <code>null</code> if a matching threat_summary_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last threat_summary_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching threat_summary_current
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException if a matching threat_summary_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last threat_summary_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching threat_summary_current, or <code>null</code> if a matching threat_summary_current could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the threat_summary_currents before and after the current threat_summary_current in the ordered set where assessment_version_id = &#63;.
	*
	* @param threat_sum_cur_id the primary key of the current threat_summary_current
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next threat_summary_current
	* @throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current[] findByassessment_version_id_PrevAndNext(
		long threat_sum_cur_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchthreat_summary_currentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the threat_summary_currents.
	*
	* @return the threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the threat_summary_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_currents
	* @param end the upper bound of the range of threat_summary_currents (not inclusive)
	* @return the range of threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the threat_summary_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_currents
	* @param end the upper bound of the range of threat_summary_currents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the threat_summary_currents where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the threat_summary_currents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of threat_summary_currents where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of threat_summary_currents.
	*
	* @return the number of threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}