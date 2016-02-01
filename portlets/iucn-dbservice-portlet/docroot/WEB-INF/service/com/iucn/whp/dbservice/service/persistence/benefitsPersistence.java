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

import com.iucn.whp.dbservice.model.benefits;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the benefits service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefitsPersistenceImpl
 * @see benefitsUtil
 * @generated
 */
public interface benefitsPersistence extends BasePersistence<benefits> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link benefitsUtil} to access the benefits persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the benefits in the entity cache if it is enabled.
	*
	* @param benefits the benefits
	*/
	public void cacheResult(com.iucn.whp.dbservice.model.benefits benefits);

	/**
	* Caches the benefitses in the entity cache if it is enabled.
	*
	* @param benefitses the benefitses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefits> benefitses);

	/**
	* Creates a new benefits with the primary key. Does not add the benefits to the database.
	*
	* @param benefits_id the primary key for the new benefits
	* @return the new benefits
	*/
	public com.iucn.whp.dbservice.model.benefits create(long benefits_id);

	/**
	* Removes the benefits with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_id the primary key of the benefits
	* @return the benefits that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefitsException if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits remove(long benefits_id)
		throws com.iucn.whp.dbservice.NoSuchbenefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.benefits updateImpl(
		com.iucn.whp.dbservice.model.benefits benefits, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefitsException} if it could not be found.
	*
	* @param benefits_id the primary key of the benefits
	* @return the benefits
	* @throws com.iucn.whp.dbservice.NoSuchbenefitsException if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits findByPrimaryKey(
		long benefits_id)
		throws com.iucn.whp.dbservice.NoSuchbenefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefits with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefits_id the primary key of the benefits
	* @return the benefits, or <code>null</code> if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits fetchByPrimaryKey(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefitses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the matching benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findByassessment_version_id(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefitses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @return the range of matching benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefitses where assessment_version_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param assessment_version_id the assessment_version_id
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits
	* @throws com.iucn.whp.dbservice.NoSuchbenefitsException if a matching benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits findByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefits, or <code>null</code> if a matching benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits fetchByassessment_version_id_First(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits
	* @throws com.iucn.whp.dbservice.NoSuchbenefitsException if a matching benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits findByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefits, or <code>null</code> if a matching benefits could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits fetchByassessment_version_id_Last(
		long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the benefitses before and after the current benefits in the ordered set where assessment_version_id = &#63;.
	*
	* @param benefits_id the primary key of the current benefits
	* @param assessment_version_id the assessment_version_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefits
	* @throws com.iucn.whp.dbservice.NoSuchbenefitsException if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits[] findByassessment_version_id_PrevAndNext(
		long benefits_id, long assessment_version_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefitsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefitses.
	*
	* @return the benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefitses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @return the range of benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefitses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefitses where assessment_version_id = &#63; from the database.
	*
	* @param assessment_version_id the assessment_version_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the benefitses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefitses where assessment_version_id = &#63;.
	*
	* @param assessment_version_id the assessment_version_id
	* @return the number of matching benefitses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessment_version_id(long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefitses.
	*
	* @return the number of benefitses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the benefits_type_refs associated with the benefits.
	*
	* @param pk the primary key of the benefits
	* @return the benefits_type_refs associated with the benefits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> getbenefits_type_refs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the benefits_type_refs associated with the benefits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the benefits
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @return the range of benefits_type_refs associated with the benefits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> getbenefits_type_refs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the benefits_type_refs associated with the benefits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the benefits
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefits_type_refs associated with the benefits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> getbenefits_type_refs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of benefits_type_refs associated with the benefits.
	*
	* @param pk the primary key of the benefits
	* @return the number of benefits_type_refs associated with the benefits
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefits_type_refsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the benefits_type_ref is associated with the benefits.
	*
	* @param pk the primary key of the benefits
	* @param benefits_type_refPK the primary key of the benefits_type_ref
	* @return <code>true</code> if the benefits_type_ref is associated with the benefits; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsbenefits_type_ref(long pk, long benefits_type_refPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the benefits has any benefits_type_refs associated with it.
	*
	* @param pk the primary key of the benefits to check for associations with benefits_type_refs
	* @return <code>true</code> if the benefits has any benefits_type_refs associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsbenefits_type_refs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}