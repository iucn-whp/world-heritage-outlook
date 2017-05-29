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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the potential_project_needs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see potential_project_needsPersistenceImpl
 * @see potential_project_needsUtil
 * @generated
 */
public interface potential_project_needsPersistence extends BasePersistence<potential_project_needs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link potential_project_needsUtil} to access the potential_project_needs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the potential_project_needs in the entity cache if it is enabled.
	*
	* @param potential_project_needs the potential_project_needs
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs);

	/**
	* Caches the potential_project_needses in the entity cache if it is enabled.
	*
	* @param potential_project_needses the potential_project_needses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> potential_project_needses);

	/**
	* Creates a new potential_project_needs with the primary key. Does not add the potential_project_needs to the database.
	*
	* @param ppn_id the primary key for the new potential_project_needs
	* @return the new potential_project_needs
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs create(
		long ppn_id);

	/**
	* Removes the potential_project_needs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs remove(
		long ppn_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.potential_project_needs updateImpl(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the potential_project_needs with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchpotential_project_needsException} if it could not be found.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs findByPrimaryKey(
		long ppn_id)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the potential_project_needs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs, or <code>null</code> if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs fetchByPrimaryKey(
		long ppn_id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the potential_project_needses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching potential_project_needs, or <code>null</code> if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_project_needs
	* @throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last potential_project_needs in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching potential_project_needs, or <code>null</code> if a matching potential_project_needs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.potential_project_needs[] findByassessment_version_id_PrevAndNext(
		long ppn_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchpotential_project_needsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the potential_project_needses.
	*
	* @return the potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the potential_project_needses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the potential_project_needses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of potential_project_needses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of potential_project_needses.
	*
	* @return the number of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}