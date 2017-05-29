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

import com.iucn.whp.dbservice.model.assessing_threats_potential;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the assessing_threats_potential service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_potentialPersistenceImpl
 * @see assessing_threats_potentialUtil
 * @generated
 */
public interface assessing_threats_potentialPersistence extends BasePersistence<assessing_threats_potential> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link assessing_threats_potentialUtil} to access the assessing_threats_potential persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the assessing_threats_potential in the entity cache if it is enabled.
	*
	* @param assessing_threats_potential the assessing_threats_potential
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential);

	/**
	* Caches the assessing_threats_potentials in the entity cache if it is enabled.
	*
	* @param assessing_threats_potentials the assessing_threats_potentials
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> assessing_threats_potentials);

	/**
	* Creates a new assessing_threats_potential with the primary key. Does not add the assessing_threats_potential to the database.
	*
	* @param potential_threat_id the primary key for the new assessing_threats_potential
	* @return the new assessing_threats_potential
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential create(
		long potential_threat_id);

	/**
	* Removes the assessing_threats_potential with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential remove(
		long potential_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.assessing_threats_potential updateImpl(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessing_threats_potential with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException} if it could not be found.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential findByPrimaryKey(
		long potential_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessing_threats_potential with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential, or <code>null</code> if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential fetchByPrimaryKey(
		long potential_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @return the range of matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessing_threats_potentials before and after the current assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param potential_threat_id the primary key of the current assessing_threats_potential
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_potential[] findByassessment_version_id_PrevAndNext(
		long potential_threat_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessing_threats_potentials.
	*
	* @return the assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessing_threats_potentials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @return the range of assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessing_threats_potentials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessing_threats_potentials where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessing_threats_potentials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessing_threats_potentials.
	*
	* @return the number of assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the potential_threat_valueses associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the potential_threat_valueses associated with the assessing_threats_potential.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @return the range of potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the potential_threat_valueses associated with the assessing_threats_potential.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of potential_threat_valueses associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the number of potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public int getpotential_threat_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param potential_threat_valuesPK the primary key of the potential_threat_values
	* @return <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containspotential_threat_values(long pk,
		long potential_threat_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it.
	*
	* @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_valueses
	* @return <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containspotential_threat_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @return the range of potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param start the lower bound of the range of assessing_threats_potentials
	* @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the number of potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public int getpotential_threat_assessment_catsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param potential_threat_assessment_catPK the primary key of the potential_threat_assessment_cat
	* @return <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containspotential_threat_assessment_cat(long pk,
		long potential_threat_assessment_catPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it.
	*
	* @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_assessment_cats
	* @return <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containspotential_threat_assessment_cats(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}