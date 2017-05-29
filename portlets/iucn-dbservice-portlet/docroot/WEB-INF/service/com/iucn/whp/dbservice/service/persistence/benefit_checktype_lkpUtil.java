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

import com.iucn.whp.dbservice.model.benefit_checktype_lkp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the benefit_checktype_lkp service. This utility wraps {@link benefit_checktype_lkpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefit_checktype_lkpPersistence
 * @see benefit_checktype_lkpPersistenceImpl
 * @generated
 */
public class benefit_checktype_lkpUtil {
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
	public static void clearCache(benefit_checktype_lkp benefit_checktype_lkp) {
		getPersistence().clearCache(benefit_checktype_lkp);
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
	public static List<benefit_checktype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<benefit_checktype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<benefit_checktype_lkp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static benefit_checktype_lkp update(
		benefit_checktype_lkp benefit_checktype_lkp, boolean merge)
		throws SystemException {
		return getPersistence().update(benefit_checktype_lkp, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static benefit_checktype_lkp update(
		benefit_checktype_lkp benefit_checktype_lkp, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(benefit_checktype_lkp, merge, serviceContext);
	}

	/**
	* Caches the benefit_checktype_lkp in the entity cache if it is enabled.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp) {
		getPersistence().cacheResult(benefit_checktype_lkp);
	}

	/**
	* Caches the benefit_checktype_lkps in the entity cache if it is enabled.
	*
	* @param benefit_checktype_lkps the benefit_checktype_lkps
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> benefit_checktype_lkps) {
		getPersistence().cacheResult(benefit_checktype_lkps);
	}

	/**
	* Creates a new benefit_checktype_lkp with the primary key. Does not add the benefit_checktype_lkp to the database.
	*
	* @param benefit_id the primary key for the new benefit_checktype_lkp
	* @return the new benefit_checktype_lkp
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp create(
		long benefit_id) {
		return getPersistence().create(benefit_id);
	}

	/**
	* Removes the benefit_checktype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was removed
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp remove(
		long benefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(benefit_id);
	}

	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp updateImpl(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(benefit_checktype_lkp, merge);
	}

	/**
	* Returns the benefit_checktype_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException} if it could not be found.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp findByPrimaryKey(
		long benefit_id)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(benefit_id);
	}

	/**
	* Returns the benefit_checktype_lkp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp, or <code>null</code> if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp fetchByPrimaryKey(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(benefit_id);
	}

	/**
	* Returns all the benefit_checktype_lkps where active = &#63;.
	*
	* @param active the active
	* @return the matching benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findByActiveStatus(
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActiveStatus(active);
	}

	/**
	* Returns a range of all the benefit_checktype_lkps where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @return the range of matching benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findByActiveStatus(
		boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActiveStatus(active, start, end);
	}

	/**
	* Returns an ordered range of all the benefit_checktype_lkps where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findByActiveStatus(
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActiveStatus(active, start, end, orderByComparator);
	}

	/**
	* Returns the first benefit_checktype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefit_checktype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a matching benefit_checktype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp findByActiveStatus_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActiveStatus_First(active, orderByComparator);
	}

	/**
	* Returns the first benefit_checktype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching benefit_checktype_lkp, or <code>null</code> if a matching benefit_checktype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp fetchByActiveStatus_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByActiveStatus_First(active, orderByComparator);
	}

	/**
	* Returns the last benefit_checktype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefit_checktype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a matching benefit_checktype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp findByActiveStatus_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActiveStatus_Last(active, orderByComparator);
	}

	/**
	* Returns the last benefit_checktype_lkp in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching benefit_checktype_lkp, or <code>null</code> if a matching benefit_checktype_lkp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp fetchByActiveStatus_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByActiveStatus_Last(active, orderByComparator);
	}

	/**
	* Returns the benefit_checktype_lkps before and after the current benefit_checktype_lkp in the ordered set where active = &#63;.
	*
	* @param benefit_id the primary key of the current benefit_checktype_lkp
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next benefit_checktype_lkp
	* @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp[] findByActiveStatus_PrevAndNext(
		long benefit_id, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActiveStatus_PrevAndNext(benefit_id, active,
			orderByComparator);
	}

	/**
	* Returns all the benefit_checktype_lkps.
	*
	* @return the benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the benefit_checktype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @return the range of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the benefit_checktype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the benefit_checktype_lkps where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByActiveStatus(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByActiveStatus(active);
	}

	/**
	* Removes all the benefit_checktype_lkps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of benefit_checktype_lkps where active = &#63;.
	*
	* @param active the active
	* @return the number of matching benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByActiveStatus(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByActiveStatus(active);
	}

	/**
	* Returns the number of benefit_checktype_lkps.
	*
	* @return the number of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	*
	* @param pk the primary key of the benefit_checktype_lkp
	* @return the benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefit_checksubtype_lkps(pk);
	}

	/**
	* Returns a range of all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the benefit_checktype_lkp
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @return the range of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefit_checksubtype_lkps(pk, start, end);
	}

	/**
	* Returns an ordered range of all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the benefit_checktype_lkp
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getbenefit_checksubtype_lkps(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	*
	* @param pk the primary key of the benefit_checktype_lkp
	* @return the number of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefit_checksubtype_lkpsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getbenefit_checksubtype_lkpsSize(pk);
	}

	/**
	* Returns <code>true</code> if the benefit_checksubtype_lkp is associated with the benefit_checktype_lkp.
	*
	* @param pk the primary key of the benefit_checktype_lkp
	* @param benefit_checksubtype_lkpPK the primary key of the benefit_checksubtype_lkp
	* @return <code>true</code> if the benefit_checksubtype_lkp is associated with the benefit_checktype_lkp; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefit_checksubtype_lkp(long pk,
		long benefit_checksubtype_lkpPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsbenefit_checksubtype_lkp(pk,
			benefit_checksubtype_lkpPK);
	}

	/**
	* Returns <code>true</code> if the benefit_checktype_lkp has any benefit_checksubtype_lkps associated with it.
	*
	* @param pk the primary key of the benefit_checktype_lkp to check for associations with benefit_checksubtype_lkps
	* @return <code>true</code> if the benefit_checktype_lkp has any benefit_checksubtype_lkps associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsbenefit_checksubtype_lkps(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsbenefit_checksubtype_lkps(pk);
	}

	public static benefit_checktype_lkpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (benefit_checktype_lkpPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					benefit_checktype_lkpPersistence.class.getName());

			ReferenceRegistry.registerReference(benefit_checktype_lkpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(benefit_checktype_lkpPersistence persistence) {
	}

	private static benefit_checktype_lkpPersistence _persistence;
}