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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the assessing_threats_potential service. This utility wraps {@link assessing_threats_potentialPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_potentialPersistence
 * @see assessing_threats_potentialPersistenceImpl
 * @generated
 */
public class assessing_threats_potentialUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		assessing_threats_potential assessing_threats_potential) {
		getPersistence().clearCache(assessing_threats_potential);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<assessing_threats_potential> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<assessing_threats_potential> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<assessing_threats_potential> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static assessing_threats_potential update(
		assessing_threats_potential assessing_threats_potential, boolean merge)
		throws SystemException {
		return getPersistence().update(assessing_threats_potential, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static assessing_threats_potential update(
		assessing_threats_potential assessing_threats_potential, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessing_threats_potential, merge, serviceContext);
	}

	/**
	* Caches the assessing_threats_potential in the entity cache if it is enabled.
	*
	* @param assessing_threats_potential the assessing_threats_potential
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential) {
		getPersistence().cacheResult(assessing_threats_potential);
	}

	/**
	* Caches the assessing_threats_potentials in the entity cache if it is enabled.
	*
	* @param assessing_threats_potentials the assessing_threats_potentials
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> assessing_threats_potentials) {
		getPersistence().cacheResult(assessing_threats_potentials);
	}

	/**
	* Creates a new assessing_threats_potential with the primary key. Does not add the assessing_threats_potential to the database.
	*
	* @param potential_threat_id the primary key for the new assessing_threats_potential
	* @return the new assessing_threats_potential
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential create(
		long potential_threat_id) {
		return getPersistence().create(potential_threat_id);
	}

	/**
	* Removes the assessing_threats_potential with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential that was removed
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential remove(
		long potential_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(potential_threat_id);
	}

	public static com.iucn.whp.dbservice.model.assessing_threats_potential updateImpl(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessing_threats_potential, merge);
	}

	/**
	* Returns the assessing_threats_potential with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException} if it could not be found.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential findByPrimaryKey(
		long potential_threat_id)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(potential_threat_id);
	}

	/**
	* Returns the assessing_threats_potential with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param potential_threat_id the primary key of the assessing_threats_potential
	* @return the assessing_threats_potential, or <code>null</code> if a assessing_threats_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential fetchByPrimaryKey(
		long potential_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(potential_threat_id);
	}

	/**
	* Returns all the assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id(assessment_version_id, start,
			end, orderByComparator);
	}

	/**
	* Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_First(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_potential
	* @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

	/**
	* Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_potential fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByassessment_version_id_Last(assessment_version_id,
			orderByComparator);
	}

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
	public static com.iucn.whp.dbservice.model.assessing_threats_potential[] findByassessment_version_id_PrevAndNext(
		long potential_threat_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByassessment_version_id_PrevAndNext(potential_threat_id,
			assessment_version_id, orderByComparator);
	}

	/**
	* Returns all the assessing_threats_potentials.
	*
	* @return the assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessing_threats_potentials where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByassessment_version_id(assessment_version_id);
	}

	/**
	* Removes all the assessing_threats_potentials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessing_threats_potentials where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByassessment_version_id(assessment_version_id);
	}

	/**
	* Returns the number of assessing_threats_potentials.
	*
	* @return the number of assessing_threats_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the potential_threat_valueses associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_threat_valueses(pk);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_threat_valueses(pk, start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getpotential_threat_valueses(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of potential_threat_valueses associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the number of potential_threat_valueses associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public static int getpotential_threat_valuesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_threat_valuesesSize(pk);
	}

	/**
	* Returns <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param potential_threat_valuesPK the primary key of the potential_threat_values
	* @return <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_threat_values(long pk,
		long potential_threat_valuesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containspotential_threat_values(pk,
			potential_threat_valuesPK);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it.
	*
	* @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_valueses
	* @return <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_threat_valueses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containspotential_threat_valueses(pk);
	}

	/**
	* Returns all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_threat_assessment_cats(pk);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getpotential_threat_assessment_cats(pk, start, end);
	}

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
	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getpotential_threat_assessment_cats(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of potential_threat_assessment_cats associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @return the number of potential_threat_assessment_cats associated with the assessing_threats_potential
	* @throws SystemException if a system exception occurred
	*/
	public static int getpotential_threat_assessment_catsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getpotential_threat_assessment_catsSize(pk);
	}

	/**
	* Returns <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential.
	*
	* @param pk the primary key of the assessing_threats_potential
	* @param potential_threat_assessment_catPK the primary key of the potential_threat_assessment_cat
	* @return <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_threat_assessment_cat(long pk,
		long potential_threat_assessment_catPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containspotential_threat_assessment_cat(pk,
			potential_threat_assessment_catPK);
	}

	/**
	* Returns <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it.
	*
	* @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_assessment_cats
	* @return <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containspotential_threat_assessment_cats(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containspotential_threat_assessment_cats(pk);
	}

	public static assessing_threats_potentialPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (assessing_threats_potentialPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					assessing_threats_potentialPersistence.class.getName());

			ReferenceRegistry.registerReference(assessing_threats_potentialUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		assessing_threats_potentialPersistence persistence) {
	}

	private static assessing_threats_potentialPersistence _persistence;
}