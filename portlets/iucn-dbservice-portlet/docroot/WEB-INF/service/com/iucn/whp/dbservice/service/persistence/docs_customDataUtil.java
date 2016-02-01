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

import com.iucn.whp.dbservice.model.docs_customData;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the docs_custom data service. This utility wraps {@link docs_customDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_customDataPersistence
 * @see docs_customDataPersistenceImpl
 * @generated
 */
public class docs_customDataUtil {
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
	public static void clearCache(docs_customData docs_customData) {
		getPersistence().clearCache(docs_customData);
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
	public static List<docs_customData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<docs_customData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<docs_customData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static docs_customData update(docs_customData docs_customData,
		boolean merge) throws SystemException {
		return getPersistence().update(docs_customData, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static docs_customData update(docs_customData docs_customData,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(docs_customData, merge, serviceContext);
	}

	/**
	* Caches the docs_custom data in the entity cache if it is enabled.
	*
	* @param docs_customData the docs_custom data
	*/
	public static void cacheResult(
		com.iucn.whp.dbservice.model.docs_customData docs_customData) {
		getPersistence().cacheResult(docs_customData);
	}

	/**
	* Caches the docs_custom datas in the entity cache if it is enabled.
	*
	* @param docs_customDatas the docs_custom datas
	*/
	public static void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.docs_customData> docs_customDatas) {
		getPersistence().cacheResult(docs_customDatas);
	}

	/**
	* Creates a new docs_custom data with the primary key. Does not add the docs_custom data to the database.
	*
	* @param docs_customDataId the primary key for the new docs_custom data
	* @return the new docs_custom data
	*/
	public static com.iucn.whp.dbservice.model.docs_customData create(
		int docs_customDataId) {
		return getPersistence().create(docs_customDataId);
	}

	/**
	* Removes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data that was removed
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData remove(
		int docs_customDataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(docs_customDataId);
	}

	public static com.iucn.whp.dbservice.model.docs_customData updateImpl(
		com.iucn.whp.dbservice.model.docs_customData docs_customData,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(docs_customData, merge);
	}

	/**
	* Returns the docs_custom data with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByPrimaryKey(
		int docs_customDataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(docs_customDataId);
	}

	/**
	* Returns the docs_custom data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data, or <code>null</code> if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByPrimaryKey(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docs_customDataId);
	}

	/**
	* Returns all the docs_custom datas where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileid(publish_date);
	}

	/**
	* Returns a range of all the docs_custom datas where publish_date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publish_date the publish_date
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileid(publish_date, start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas where publish_date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publish_date the publish_date
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileid(publish_date, start, end, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileid_First(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileid_First(publish_date, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileid_First(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileid_First(publish_date, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileid_Last(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileid_Last(publish_date, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileid_Last(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileid_Last(publish_date, orderByComparator);
	}

	/**
	* Returns the docs_custom datas before and after the current docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param docs_customDataId the primary key of the current docs_custom data
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData[] findByfileid_PrevAndNext(
		int docs_customDataId, java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileid_PrevAndNext(docs_customDataId, publish_date,
			orderByComparator);
	}

	/**
	* Returns all the docs_custom datas where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidupload(upload_date);
	}

	/**
	* Returns a range of all the docs_custom datas where upload_date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param upload_date the upload_date
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidupload(upload_date, start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas where upload_date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param upload_date the upload_date
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidupload(upload_date, start, end,
			orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileidupload_First(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidupload_First(upload_date, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileidupload_First(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileidupload_First(upload_date, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileidupload_Last(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidupload_Last(upload_date, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileidupload_Last(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileidupload_Last(upload_date, orderByComparator);
	}

	/**
	* Returns the docs_custom datas before and after the current docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param docs_customDataId the primary key of the current docs_custom data
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData[] findByfileidupload_PrevAndNext(
		int docs_customDataId, java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidupload_PrevAndNext(docs_customDataId,
			upload_date, orderByComparator);
	}

	/**
	* Returns all the docs_custom datas where author = &#63;.
	*
	* @param author the author
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidauth(author);
	}

	/**
	* Returns a range of all the docs_custom datas where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidauth(author, start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidauth(author, start, end, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileidauth_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidauth_First(author, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileidauth_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileidauth_First(author, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileidauth_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileidauth_Last(author, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileidauth_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileidauth_Last(author, orderByComparator);
	}

	/**
	* Returns the docs_custom datas before and after the current docs_custom data in the ordered set where author = &#63;.
	*
	* @param docs_customDataId the primary key of the current docs_custom data
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData[] findByfileidauth_PrevAndNext(
		int docs_customDataId, java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileidauth_PrevAndNext(docs_customDataId, author,
			orderByComparator);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfileobj(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileobj(fileentryid);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileobj(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileobj(fileentryid);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfileobj(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfileobj(fileentryid, retrieveFromCache);
	}

	/**
	* Returns all the docs_custom datas where category = &#63;.
	*
	* @param category the category
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfilecategory(category);
	}

	/**
	* Returns a range of all the docs_custom datas where category = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param category the category
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfilecategory(category, start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas where category = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param category the category
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfilecategory(category, start, end, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfilecategory_First(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfilecategory_First(category, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfilecategory_First(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfilecategory_First(category, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfilecategory_Last(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfilecategory_Last(category, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfilecategory_Last(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfilecategory_Last(category, orderByComparator);
	}

	/**
	* Returns the docs_custom datas before and after the current docs_custom data in the ordered set where category = &#63;.
	*
	* @param docs_customDataId the primary key of the current docs_custom data
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData[] findByfilecategory_PrevAndNext(
		int docs_customDataId, java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfilecategory_PrevAndNext(docs_customDataId, category,
			orderByComparator);
	}

	/**
	* Returns all the docs_custom datas where type = &#63;.
	*
	* @param type the type
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiletype(type);
	}

	/**
	* Returns a range of all the docs_custom datas where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiletype(type, start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiletype(type, start, end, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfiletype_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiletype_First(type, orderByComparator);
	}

	/**
	* Returns the first docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfiletype_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfiletype_First(type, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByfiletype_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiletype_Last(type, orderByComparator);
	}

	/**
	* Returns the last docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByfiletype_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfiletype_Last(type, orderByComparator);
	}

	/**
	* Returns the docs_custom datas before and after the current docs_custom data in the ordered set where type = &#63;.
	*
	* @param docs_customDataId the primary key of the current docs_custom data
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData[] findByfiletype_PrevAndNext(
		int docs_customDataId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiletype_PrevAndNext(docs_customDataId, type,
			orderByComparator);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData findByFileEntryId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFileEntryId(fileentryid);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByFileEntryId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFileEntryId(fileentryid);
	}

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData fetchByFileEntryId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFileEntryId(fileentryid, retrieveFromCache);
	}

	/**
	* Returns all the docs_custom datas.
	*
	* @return the docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the docs_custom datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @return the range of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the docs_custom datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of docs_custom datas
	* @param end the upper bound of the range of docs_custom datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the docs_custom datas where publish_date = &#63; from the database.
	*
	* @param publish_date the publish_date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfileid(java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfileid(publish_date);
	}

	/**
	* Removes all the docs_custom datas where upload_date = &#63; from the database.
	*
	* @param upload_date the upload_date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfileidupload(java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfileidupload(upload_date);
	}

	/**
	* Removes all the docs_custom datas where author = &#63; from the database.
	*
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfileidauth(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfileidauth(author);
	}

	/**
	* Removes the docs_custom data where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData removeByfileobj(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByfileobj(fileentryid);
	}

	/**
	* Removes all the docs_custom datas where category = &#63; from the database.
	*
	* @param category the category
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfilecategory(java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfilecategory(category);
	}

	/**
	* Removes all the docs_custom datas where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfiletype(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfiletype(type);
	}

	/**
	* Removes the docs_custom data where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData removeByFileEntryId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByFileEntryId(fileentryid);
	}

	/**
	* Removes all the docs_custom datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of docs_custom datas where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileid(java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileid(publish_date);
	}

	/**
	* Returns the number of docs_custom datas where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileidupload(java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileidupload(upload_date);
	}

	/**
	* Returns the number of docs_custom datas where author = &#63;.
	*
	* @param author the author
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileidauth(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileidauth(author);
	}

	/**
	* Returns the number of docs_custom datas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileobj(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileobj(fileentryid);
	}

	/**
	* Returns the number of docs_custom datas where category = &#63;.
	*
	* @param category the category
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfilecategory(java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfilecategory(category);
	}

	/**
	* Returns the number of docs_custom datas where type = &#63;.
	*
	* @param type the type
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfiletype(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfiletype(type);
	}

	/**
	* Returns the number of docs_custom datas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFileEntryId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFileEntryId(fileentryid);
	}

	/**
	* Returns the number of docs_custom datas.
	*
	* @return the number of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static docs_customDataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (docs_customDataPersistence)PortletBeanLocatorUtil.locate(com.iucn.whp.dbservice.service.ClpSerializer.getServletContextName(),
					docs_customDataPersistence.class.getName());

			ReferenceRegistry.registerReference(docs_customDataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(docs_customDataPersistence persistence) {
	}

	private static docs_customDataPersistence _persistence;
}