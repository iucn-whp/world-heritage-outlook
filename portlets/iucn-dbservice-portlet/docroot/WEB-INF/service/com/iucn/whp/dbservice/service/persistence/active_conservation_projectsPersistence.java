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

import com.iucn.whp.dbservice.model.active_conservation_projects;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the active_conservation_projects service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see active_conservation_projectsPersistenceImpl
 * @see active_conservation_projectsUtil
 * @generated
 */
public interface active_conservation_projectsPersistence extends BasePersistence<active_conservation_projects> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link active_conservation_projectsUtil} to access the active_conservation_projects persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the active_conservation_projects in the entity cache if it is enabled.
	*
	* @param active_conservation_projects the active_conservation_projects
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects);

	/**
	* Caches the active_conservation_projectses in the entity cache if it is enabled.
	*
	* @param active_conservation_projectses the active_conservation_projectses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> active_conservation_projectses);

	/**
	* Creates a new active_conservation_projects with the primary key. Does not add the active_conservation_projects to the database.
	*
	* @param acpid the primary key for the new active_conservation_projects
	* @return the new active_conservation_projects
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects create(
		long acpid);

	/**
	* Removes the active_conservation_projects with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param acpid the primary key of the active_conservation_projects
	* @return the active_conservation_projects that was removed
	* @throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects remove(
		long acpid)
		throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.active_conservation_projects updateImpl(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the active_conservation_projects with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException} if it could not be found.
	*
	* @param acpid the primary key of the active_conservation_projects
	* @return the active_conservation_projects
	* @throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects findByPrimaryKey(
		long acpid)
		throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the active_conservation_projects with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param acpid the primary key of the active_conservation_projects
	* @return the active_conservation_projects, or <code>null</code> if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects fetchByPrimaryKey(
		long acpid) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the active_conservation_projectses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the active_conservation_projectses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of active_conservation_projectses
	* @param end the upper bound of the range of active_conservation_projectses (not inclusive)
	* @return the range of matching active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the active_conservation_projectses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of active_conservation_projectses
	* @param end the upper bound of the range of active_conservation_projectses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first active_conservation_projects in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching active_conservation_projects
	* @throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException if a matching active_conservation_projects could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first active_conservation_projects in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching active_conservation_projects, or <code>null</code> if a matching active_conservation_projects could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last active_conservation_projects in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching active_conservation_projects
	* @throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException if a matching active_conservation_projects could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last active_conservation_projects in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching active_conservation_projects, or <code>null</code> if a matching active_conservation_projects could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the active_conservation_projectses before and after the current active_conservation_projects in the ordered set where assessment_version_id = &#63;.
	*
	* @param acpid the primary key of the current active_conservation_projects
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next active_conservation_projects
	* @throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.active_conservation_projects[] findByassessment_version_id_PrevAndNext(
		long acpid, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchactive_conservation_projectsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the active_conservation_projectses.
	*
	* @return the active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the active_conservation_projectses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of active_conservation_projectses
	* @param end the upper bound of the range of active_conservation_projectses (not inclusive)
	* @return the range of active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the active_conservation_projectses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of active_conservation_projectses
	* @param end the upper bound of the range of active_conservation_projectses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the active_conservation_projectses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the active_conservation_projectses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of active_conservation_projectses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of active_conservation_projectses.
	*
	* @return the number of active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}