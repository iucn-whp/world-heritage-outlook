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

import com.iucn.whp.dbservice.model.assessment_lang_lkp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessment_lang_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_lang_lkpPersistenceImpl
 * @see assessment_lang_lkpUtil
 * @generated
 */
public interface assessment_lang_lkpPersistence extends BasePersistence<assessment_lang_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessment_lang_lkpUtil} to access the assessment_lang_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessment_lang_lkp in the entity cache if it is enabled.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp);

	/**
	* Caches the assessment_lang_lkps in the entity cache if it is enabled.
	*
	* @param assessment_lang_lkps the assessment_lang_lkps
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> assessment_lang_lkps);

	/**
	* Creates a new assessment_lang_lkp with the primary key. Does not add the assessment_lang_lkp to the database.
	*
	* @param languageid the primary key for the new assessment_lang_lkp
	* @return the new assessment_lang_lkp
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp create(
		long languageid);

	/**
	* Removes the assessment_lang_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp remove(
		long languageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessment_lang_lkp updateImpl(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_lang_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException} if it could not be found.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp
	* @throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp findByPrimaryKey(
		long languageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_lang_lkpException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_lang_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp, or <code>null</code> if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp fetchByPrimaryKey(
		long languageid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_lang_lkps.
	*
	* @return the assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_lang_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_lkps
	* @param end the upper bound of the range of assessment_lang_lkps (not inclusive)
	* @return the range of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_lang_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_lkps
	* @param end the upper bound of the range of assessment_lang_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_lang_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_lang_lkps.
	*
	* @return the number of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}