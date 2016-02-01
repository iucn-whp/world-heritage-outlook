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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the effective_prot_mgmt_iothreats service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see effective_prot_mgmt_iothreatsPersistenceImpl
 * @see effective_prot_mgmt_iothreatsUtil
 * @generated
 */
public interface effective_prot_mgmt_iothreatsPersistence
	extends BasePersistence<effective_prot_mgmt_iothreats> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link effective_prot_mgmt_iothreatsUtil} to access the effective_prot_mgmt_iothreats persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the effective_prot_mgmt_iothreats in the entity cache if it is enabled.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats);

	/**
	* Caches the effective_prot_mgmt_iothreatses in the entity cache if it is enabled.
	*
	* @param effective_prot_mgmt_iothreatses the effective_prot_mgmt_iothreatses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatses);

	/**
	* Creates a new effective_prot_mgmt_iothreats with the primary key. Does not add the effective_prot_mgmt_iothreats to the database.
	*
	* @param id the primary key for the new effective_prot_mgmt_iothreats
	* @return the new effective_prot_mgmt_iothreats
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats create(
		long id);

	/**
	* Removes the effective_prot_mgmt_iothreats with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was removed
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats remove(
		long id)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats updateImpl(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the effective_prot_mgmt_iothreats with the primary key or throws a {@link com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException} if it could not be found.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the effective_prot_mgmt_iothreats with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats, or <code>null</code> if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findByassversionId(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching effective_prot_mgmt_iothreats, or <code>null</code> if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByassversionId_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching effective_prot_mgmt_iothreats
	* @throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats findByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last effective_prot_mgmt_iothreats in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching effective_prot_mgmt_iothreats, or <code>null</code> if a matching effective_prot_mgmt_iothreats could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetchByassversionId_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats[] findByassversionId_PrevAndNext(
		long id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSucheffective_prot_mgmt_iothreatsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the effective_prot_mgmt_iothreatses.
	*
	* @return the effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the effective_prot_mgmt_iothreatses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the effective_prot_mgmt_iothreatses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of effective_prot_mgmt_iothreatses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassversionId(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of effective_prot_mgmt_iothreatses.
	*
	* @return the number of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}