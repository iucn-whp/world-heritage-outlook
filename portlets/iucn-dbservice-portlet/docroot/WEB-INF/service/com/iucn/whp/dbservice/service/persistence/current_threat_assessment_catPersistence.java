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

import com.iucn.whp.dbservice.model.current_threat_assessment_cat;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the current_threat_assessment_cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see current_threat_assessment_catPersistenceImpl
 * @see current_threat_assessment_catUtil
 * @generated
 */
public interface current_threat_assessment_catPersistence
	extends BasePersistence<current_threat_assessment_cat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link current_threat_assessment_catUtil} to access the current_threat_assessment_cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the current_threat_assessment_cat in the entity cache if it is enabled.
	*
	* @param current_threat_assessment_cat the current_threat_assessment_cat
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.current_threat_assessment_cat current_threat_assessment_cat);

	/**
	* Caches the current_threat_assessment_cats in the entity cache if it is enabled.
	*
	* @param current_threat_assessment_cats the current_threat_assessment_cats
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> current_threat_assessment_cats);

	/**
	* Creates a new current_threat_assessment_cat with the primary key. Does not add the current_threat_assessment_cat to the database.
	*
	* @param cur_threat_cat_id the primary key for the new current_threat_assessment_cat
	* @return the new current_threat_assessment_cat
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat create(
		long cur_threat_cat_id);

	/**
	* Removes the current_threat_assessment_cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat that was removed
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat remove(
		long cur_threat_cat_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.current_threat_assessment_cat updateImpl(
		com.iucn.whp.dbservice.model.current_threat_assessment_cat current_threat_assessment_cat,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_assessment_cat with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException} if it could not be found.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat findByPrimaryKey(
		long cur_threat_cat_id)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_assessment_cat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cur_threat_cat_id the primary key of the current_threat_assessment_cat
	* @return the current_threat_assessment_cat, or <code>null</code> if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchByPrimaryKey(
		long cur_threat_cat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBycurrent_threat_id(
		long current_threat_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat findBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBycurrent_threat_id_First(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat findBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBycurrent_threat_id_Last(
		long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_assessment_cats before and after the current current_threat_assessment_cat in the ordered set where current_threat_id = &#63;.
	*
	* @param cur_threat_cat_id the primary key of the current current_threat_assessment_cat
	* @param current_threat_id the current_threat_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat[] findBycurrent_threat_id_PrevAndNext(
		long cur_threat_cat_id, long current_threat_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @return the matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findBysub_cat_id(
		long current_threat_id, long category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat findBysub_cat_id_First(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBysub_cat_id_First(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat findBysub_cat_id_Last(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching current_threat_assessment_cat, or <code>null</code> if a matching current_threat_assessment_cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat fetchBysub_cat_id_Last(
		long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the current_threat_assessment_cats before and after the current current_threat_assessment_cat in the ordered set where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param cur_threat_cat_id the primary key of the current current_threat_assessment_cat
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next current_threat_assessment_cat
	* @throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException if a current_threat_assessment_cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.current_threat_assessment_cat[] findBysub_cat_id_PrevAndNext(
		long cur_threat_cat_id, long current_threat_id, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchcurrent_threat_assessment_catException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the current_threat_assessment_cats.
	*
	* @return the current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the current_threat_assessment_cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @return the range of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the current_threat_assessment_cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_assessment_cats
	* @param end the upper bound of the range of current_threat_assessment_cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_threat_assessment_cats where current_threat_id = &#63; from the database.
	*
	* @param current_threat_id the current_threat_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63; from the database.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysub_cat_id(long current_threat_id, long category_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the current_threat_assessment_cats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_threat_assessment_cats where current_threat_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @return the number of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public int countBycurrent_threat_id(long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_threat_assessment_cats where current_threat_id = &#63; and category_id = &#63;.
	*
	* @param current_threat_id the current_threat_id
	* @param category_id the category_id
	* @return the number of matching current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public int countBysub_cat_id(long current_threat_id, long category_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of current_threat_assessment_cats.
	*
	* @return the number of current_threat_assessment_cats
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}