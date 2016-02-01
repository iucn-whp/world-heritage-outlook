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

import com.iucn.whp.dbservice.model.assessment_stages;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessment_stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_stagesPersistenceImpl
 * @see assessment_stagesUtil
 * @generated
 */
public interface assessment_stagesPersistence extends BasePersistence<assessment_stages> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessment_stagesUtil} to access the assessment_stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessment_stages in the entity cache if it is enabled.
	*
	* @param assessment_stages the assessment_stages
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages);

	/**
	* Caches the assessment_stageses in the entity cache if it is enabled.
	*
	* @param assessment_stageses the assessment_stageses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessment_stages> assessment_stageses);

	/**
	* Creates a new assessment_stages with the primary key. Does not add the assessment_stages to the database.
	*
	* @param stageid the primary key for the new assessment_stages
	* @return the new assessment_stages
	*/
	public com.iucn.whp.dbservice.model.assessment_stages create(long stageid);

	/**
	* Removes the assessment_stages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessment_stagesException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_stages remove(long stageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_stagesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessment_stages updateImpl(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_stages with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_stagesException} if it could not be found.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages
	* @throws com.iucn.whp.dbservice.NoSuchassessment_stagesException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_stages findByPrimaryKey(
		long stageid)
		throws com.iucn.whp.dbservice.NoSuchassessment_stagesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment_stages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages, or <code>null</code> if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_stages fetchByPrimaryKey(
		long stageid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment_stageses.
	*
	* @return the assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment_stageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_stageses
	* @param end the upper bound of the range of assessment_stageses (not inclusive)
	* @return the range of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment_stageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_stageses
	* @param end the upper bound of the range of assessment_stageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment_stageses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment_stageses.
	*
	* @return the number of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}