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

import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the whp_sites_iucn_recommendation service. This utility wraps {@link whp_sites_iucn_recommendationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_iucn_recommendationPersistence
 * @see whp_sites_iucn_recommendationPersistenceImpl
 * @generated
 */
public class whp_sites_iucn_recommendationUtil {
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
		whp_sites_iucn_recommendation whp_sites_iucn_recommendation) {
		getPersistence().clearCache(whp_sites_iucn_recommendation);
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
	public static List<whp_sites_iucn_recommendation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<whp_sites_iucn_recommendation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<whp_sites_iucn_recommendation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static whp_sites_iucn_recommendation update(
		whp_sites_iucn_recommendation whp_sites_iucn_recommendation,
		boolean merge) throws SystemException {
		return getPersistence().update(whp_sites_iucn_recommendation, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static whp_sites_iucn_recommendation update(
		whp_sites_iucn_recommendation whp_sites_iucn_recommendation,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(whp_sites_iucn_recommendation, merge, serviceContext);
	}

	/**
	* Caches the whp_sites_iucn_recommendation in the entity cache if it is enabled.
	*
	* @param whp_sites_iucn_recommendation the whp_sites_iucn_recommendation
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation whp_sites_iucn_recommendation) {
		getPersistence().cacheResult(whp_sites_iucn_recommendation);
	}

	/**
	* Caches the whp_sites_iucn_recommendations in the entity cache if it is enabled.
	*
	* @param whp_sites_iucn_recommendations the whp_sites_iucn_recommendations
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> whp_sites_iucn_recommendations) {
		getPersistence().cacheResult(whp_sites_iucn_recommendations);
	}

	/**
	* Creates a new whp_sites_iucn_recommendation with the primary key. Does not add the whp_sites_iucn_recommendation to the database.
	*
	* @param whp_sites_iucn_recommendation_id the primary key for the new whp_sites_iucn_recommendation
	* @return the new whp_sites_iucn_recommendation
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation create(
		long whp_sites_iucn_recommendation_id) {
		return getPersistence().create(whp_sites_iucn_recommendation_id);
	}

	/**
	* Removes the whp_sites_iucn_recommendation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_recommendation_id the primary key of the whp_sites_iucn_recommendation
	* @return the whp_sites_iucn_recommendation that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a whp_sites_iucn_recommendation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation remove(
		long whp_sites_iucn_recommendation_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(whp_sites_iucn_recommendation_id);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation whp_sites_iucn_recommendation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(whp_sites_iucn_recommendation, merge);
	}

	/**
	* Returns the whp_sites_iucn_recommendation with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException} if it could not be found.
	*
	* @param whp_sites_iucn_recommendation_id the primary key of the whp_sites_iucn_recommendation
	* @return the whp_sites_iucn_recommendation
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a whp_sites_iucn_recommendation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation findByPrimaryKey(
		long whp_sites_iucn_recommendation_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(whp_sites_iucn_recommendation_id);
	}

	/**
	* Returns the whp_sites_iucn_recommendation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_iucn_recommendation_id the primary key of the whp_sites_iucn_recommendation
	* @return the whp_sites_iucn_recommendation, or <code>null</code> if a whp_sites_iucn_recommendation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation fetchByPrimaryKey(
		long whp_sites_iucn_recommendation_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(whp_sites_iucn_recommendation_id);
	}

	/**
	* Returns the whp_sites_iucn_recommendation where recommendation_type = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException} if it could not be found.
	*
	* @param recommendation_type the recommendation_type
	* @return the matching whp_sites_iucn_recommendation
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation findByrecommendationtype(
		int recommendation_type)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrecommendationtype(recommendation_type);
	}

	/**
	* Returns the whp_sites_iucn_recommendation where recommendation_type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param recommendation_type the recommendation_type
	* @return the matching whp_sites_iucn_recommendation, or <code>null</code> if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation fetchByrecommendationtype(
		int recommendation_type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByrecommendationtype(recommendation_type);
	}

	/**
	* Returns the whp_sites_iucn_recommendation where recommendation_type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param recommendation_type the recommendation_type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_iucn_recommendation, or <code>null</code> if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation fetchByrecommendationtype(
		int recommendation_type, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrecommendationtype(recommendation_type,
			retrieveFromCache);
	}

	/**
	* Returns all the whp_sites_iucn_recommendations where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the matching whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findBysiteId(
		long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId(site_id);
	}

	/**
	* Returns a range of all the whp_sites_iucn_recommendations where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_iucn_recommendations
	* @param end the upper bound of the range of whp_sites_iucn_recommendations (not inclusive)
	* @return the range of matching whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findBysiteId(
		long site_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId(site_id, start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_iucn_recommendations where site_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param site_id the site_id
	* @param start the lower bound of the range of whp_sites_iucn_recommendations
	* @param end the upper bound of the range of whp_sites_iucn_recommendations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findBysiteId(
		long site_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteId(site_id, start, end, orderByComparator);
	}

	/**
	* Returns the first whp_sites_iucn_recommendation in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_iucn_recommendation
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation findBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the first whp_sites_iucn_recommendation in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching whp_sites_iucn_recommendation, or <code>null</code> if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation fetchBysiteId_First(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteId_First(site_id, orderByComparator);
	}

	/**
	* Returns the last whp_sites_iucn_recommendation in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_iucn_recommendation
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation findBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the last whp_sites_iucn_recommendation in the ordered set where site_id = &#63;.
	*
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching whp_sites_iucn_recommendation, or <code>null</code> if a matching whp_sites_iucn_recommendation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation fetchBysiteId_Last(
		long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysiteId_Last(site_id, orderByComparator);
	}

	/**
	* Returns the whp_sites_iucn_recommendations before and after the current whp_sites_iucn_recommendation in the ordered set where site_id = &#63;.
	*
	* @param whp_sites_iucn_recommendation_id the primary key of the current whp_sites_iucn_recommendation
	* @param site_id the site_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next whp_sites_iucn_recommendation
	* @throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException if a whp_sites_iucn_recommendation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation[] findBysiteId_PrevAndNext(
		long whp_sites_iucn_recommendation_id, long site_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysiteId_PrevAndNext(whp_sites_iucn_recommendation_id,
			site_id, orderByComparator);
	}

	/**
	* Returns all the whp_sites_iucn_recommendations.
	*
	* @return the whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the whp_sites_iucn_recommendations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_iucn_recommendations
	* @param end the upper bound of the range of whp_sites_iucn_recommendations (not inclusive)
	* @return the range of whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the whp_sites_iucn_recommendations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_iucn_recommendations
	* @param end the upper bound of the range of whp_sites_iucn_recommendations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the whp_sites_iucn_recommendation where recommendation_type = &#63; from the database.
	*
	* @param recommendation_type the recommendation_type
	* @return the whp_sites_iucn_recommendation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation removeByrecommendationtype(
		int recommendation_type)
		throws com.iucn.whp.dbservice.NoSuch_sites_iucn_recommendationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByrecommendationtype(recommendation_type);
	}

	/**
	* Removes all the whp_sites_iucn_recommendations where site_id = &#63; from the database.
	*
	* @param site_id the site_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBysiteId(site_id);
	}

	/**
	* Removes all the whp_sites_iucn_recommendations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of whp_sites_iucn_recommendations where recommendation_type = &#63;.
	*
	* @param recommendation_type the recommendation_type
	* @return the number of matching whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrecommendationtype(int recommendation_type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrecommendationtype(recommendation_type);
	}

	/**
	* Returns the number of whp_sites_iucn_recommendations where site_id = &#63;.
	*
	* @param site_id the site_id
	* @return the number of matching whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysiteId(long site_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysiteId(site_id);
	}

	/**
	* Returns the number of whp_sites_iucn_recommendations.
	*
	* @return the number of whp_sites_iucn_recommendations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static whp_sites_iucn_recommendationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (whp_sites_iucn_recommendationPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					whp_sites_iucn_recommendationPersistence.class.getName());

			ReferenceRegistry.registerReference(whp_sites_iucn_recommendationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		whp_sites_iucn_recommendationPersistence persistence) {
	}

	private static whp_sites_iucn_recommendationPersistence _persistence;
}