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

import com.iucn.whp.dbservice.model.key_conservation_issues;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the key_conservation_issues service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see key_conservation_issuesPersistenceImpl
 * @see key_conservation_issuesUtil
 * @generated
 */
public interface key_conservation_issuesPersistence extends BasePersistence<key_conservation_issues> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link key_conservation_issuesUtil} to access the key_conservation_issues persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the key_conservation_issues in the entity cache if it is enabled.
	*
	* @param key_conservation_issues the key_conservation_issues
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues);

	/**
	* Caches the key_conservation_issueses in the entity cache if it is enabled.
	*
	* @param key_conservation_issueses the key_conservation_issueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> key_conservation_issueses);

	/**
	* Creates a new key_conservation_issues with the primary key. Does not add the key_conservation_issues to the database.
	*
	* @param key_conservation_issues_id the primary key for the new key_conservation_issues
	* @return the new key_conservation_issues
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues create(
		long key_conservation_issues_id);

	/**
	* Removes the key_conservation_issues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues remove(
		long key_conservation_issues_id)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.key_conservation_issues updateImpl(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the key_conservation_issues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException} if it could not be found.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues findByPrimaryKey(
		long key_conservation_issues_id)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the key_conservation_issues with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues, or <code>null</code> if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues fetchByPrimaryKey(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the key_conservation_issueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching key_conservation_issues, or <code>null</code> if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching key_conservation_issues, or <code>null</code> if a matching key_conservation_issues could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the key_conservation_issueses before and after the current key_conservation_issues in the ordered set where assessment_version_id = &#63;.
	*
	* @param key_conservation_issues_id the primary key of the current key_conservation_issues
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next key_conservation_issues
	* @throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues[] findByassessment_version_id_PrevAndNext(
		long key_conservation_issues_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchkey_conservation_issuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the key_conservation_issueses.
	*
	* @return the key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the key_conservation_issueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the key_conservation_issueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of key_conservation_issueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of key_conservation_issueses.
	*
	* @return the number of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}