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

import com.iucn.whp.dbservice.model.conservation_outlook;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the conservation_outlook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see conservation_outlookPersistenceImpl
 * @see conservation_outlookUtil
 * @generated
 */
public interface conservation_outlookPersistence extends BasePersistence<conservation_outlook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link conservation_outlookUtil} to access the conservation_outlook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the conservation_outlook in the entity cache if it is enabled.
	*
	* @param conservation_outlook the conservation_outlook
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook);

	/**
	* Caches the conservation_outlooks in the entity cache if it is enabled.
	*
	* @param conservation_outlooks the conservation_outlooks
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> conservation_outlooks);

	/**
	* Creates a new conservation_outlook with the primary key. Does not add the conservation_outlook to the database.
	*
	* @param conservation_outlook_id the primary key for the new conservation_outlook
	* @return the new conservation_outlook
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook create(
		long conservation_outlook_id);

	/**
	* Removes the conservation_outlook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook that was removed
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlookException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook remove(
		long conservation_outlook_id)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlookException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.conservation_outlook updateImpl(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the conservation_outlook with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchconservation_outlookException} if it could not be found.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlookException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook findByPrimaryKey(
		long conservation_outlook_id)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlookException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the conservation_outlook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook, or <code>null</code> if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook fetchByPrimaryKey(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the conservation_outlooks where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the conservation_outlooks where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @return the range of matching conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the conservation_outlooks where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first conservation_outlook in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conservation_outlook
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlookException if a matching conservation_outlook could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlookException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first conservation_outlook in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conservation_outlook, or <code>null</code> if a matching conservation_outlook could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last conservation_outlook in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conservation_outlook
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlookException if a matching conservation_outlook could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlookException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last conservation_outlook in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conservation_outlook, or <code>null</code> if a matching conservation_outlook could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the conservation_outlooks before and after the current conservation_outlook in the ordered set where assessment_version_id = &#63;.
	*
	* @param conservation_outlook_id the primary key of the current conservation_outlook
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conservation_outlook
	* @throws com.iucn.whp.dbservice.NoSuchconservation_outlookException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.conservation_outlook[] findByassessment_version_id_PrevAndNext(
		long conservation_outlook_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchconservation_outlookException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the conservation_outlooks.
	*
	* @return the conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the conservation_outlooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @return the range of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the conservation_outlooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the conservation_outlooks where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the conservation_outlooks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of conservation_outlooks where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of conservation_outlooks.
	*
	* @return the number of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}