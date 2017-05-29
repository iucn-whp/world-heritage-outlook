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

import com.iucn.whp.dbservice.model.biodiversity_values;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the biodiversity_values service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see biodiversity_valuesPersistenceImpl
 * @see biodiversity_valuesUtil
 * @generated
 */
public interface biodiversity_valuesPersistence extends BasePersistence<biodiversity_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link biodiversity_valuesUtil} to access the biodiversity_values persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the biodiversity_values in the entity cache if it is enabled.
	*
	* @param biodiversity_values the biodiversity_values
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values);

	/**
	* Caches the biodiversity_valueses in the entity cache if it is enabled.
	*
	* @param biodiversity_valueses the biodiversity_valueses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> biodiversity_valueses);

	/**
	* Creates a new biodiversity_values with the primary key. Does not add the biodiversity_values to the database.
	*
	* @param id the primary key for the new biodiversity_values
	* @return the new biodiversity_values
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values create(long id);

	/**
	* Removes the biodiversity_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values remove(long id)
		throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.biodiversity_values updateImpl(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the biodiversity_values with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException} if it could not be found.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values
	* @throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values findByPrimaryKey(
		long id)
		throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the biodiversity_values with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values, or <code>null</code> if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the biodiversity_valueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the biodiversity_valueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @return the range of matching biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the biodiversity_valueses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first biodiversity_values in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biodiversity_values
	* @throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException if a matching biodiversity_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first biodiversity_values in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biodiversity_values, or <code>null</code> if a matching biodiversity_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last biodiversity_values in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biodiversity_values
	* @throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException if a matching biodiversity_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last biodiversity_values in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biodiversity_values, or <code>null</code> if a matching biodiversity_values could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the biodiversity_valueses before and after the current biodiversity_values in the ordered set where assessment_version_id = &#63;.
	*
	* @param id the primary key of the current biodiversity_values
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next biodiversity_values
	* @throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values[] findByassessment_version_id_PrevAndNext(
		long id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbiodiversity_valuesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the biodiversity_valueses.
	*
	* @return the biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the biodiversity_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @return the range of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the biodiversity_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the biodiversity_valueses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the biodiversity_valueses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of biodiversity_valueses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of biodiversity_valueses.
	*
	* @return the number of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}