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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the docs_custom data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_customDataPersistenceImpl
 * @see docs_customDataUtil
 * @generated
 */
public interface docs_customDataPersistence extends BasePersistence<docs_customData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link docs_customDataUtil} to access the docs_custom data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the docs_custom data in the entity cache if it is enabled.
	*
	* @param docs_customData the docs_custom data
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.docs_customData docs_customData);

	/**
	* Caches the docs_custom datas in the entity cache if it is enabled.
	*
	* @param docs_customDatas the docs_custom datas
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.docs_customData> docs_customDatas);

	/**
	* Creates a new docs_custom data with the primary key. Does not add the docs_custom data to the database.
	*
	* @param docs_customDataId the primary key for the new docs_custom data
	* @return the new docs_custom data
	*/
	public com.iucn.whp.dbservice.model.docs_customData create(
		int docs_customDataId);

	/**
	* Removes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data that was removed
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData remove(
		int docs_customDataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.docs_customData updateImpl(
		com.iucn.whp.dbservice.model.docs_customData docs_customData,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByPrimaryKey(
		int docs_customDataId)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data, or <code>null</code> if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByPrimaryKey(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileid(
		java.util.Date publish_date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileid_First(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileid_First(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileid_Last(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileid_Last(
		java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_customData[] findByfileid_PrevAndNext(
		int docs_customDataId, java.util.Date publish_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidupload(
		java.util.Date upload_date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileidupload_First(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileidupload_First(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileidupload_Last(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileidupload_Last(
		java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_customData[] findByfileidupload_PrevAndNext(
		int docs_customDataId, java.util.Date upload_date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas where author = &#63;.
	*
	* @param author the author
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfileidauth(
		java.lang.String author, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileidauth_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileidauth_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileidauth_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileidauth_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_customData[] findByfileidauth_PrevAndNext(
		int docs_customDataId, java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfileobj(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileobj(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfileobj(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas where category = &#63;.
	*
	* @param category the category
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfilecategory(
		java.lang.String category, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfilecategory_First(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfilecategory_First(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfilecategory_Last(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where category = &#63;.
	*
	* @param category the category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfilecategory_Last(
		java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_customData[] findByfilecategory_PrevAndNext(
		int docs_customDataId, java.lang.String category,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas where type = &#63;.
	*
	* @param type the type
	* @return the matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByfiletype(
		java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfiletype_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfiletype_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByfiletype_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last docs_custom data in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByfiletype_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.iucn.whp.dbservice.model.docs_customData[] findByfiletype_PrevAndNext(
		int docs_customDataId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data
	* @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData findByFileEntryId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByFileEntryId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData fetchByFileEntryId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the docs_custom datas.
	*
	* @return the docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas where publish_date = &#63; from the database.
	*
	* @param publish_date the publish_date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfileid(java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas where upload_date = &#63; from the database.
	*
	* @param upload_date the upload_date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfileidupload(java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas where author = &#63; from the database.
	*
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfileidauth(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the docs_custom data where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData removeByfileobj(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas where category = &#63; from the database.
	*
	* @param category the category
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfilecategory(java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfiletype(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the docs_custom data where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData removeByFileEntryId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuchdocs_customDataException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the docs_custom datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where publish_date = &#63;.
	*
	* @param publish_date the publish_date
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileid(java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where upload_date = &#63;.
	*
	* @param upload_date the upload_date
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileidupload(java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where author = &#63;.
	*
	* @param author the author
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileidauth(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileobj(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where category = &#63;.
	*
	* @param category the category
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfilecategory(java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where type = &#63;.
	*
	* @param type the type
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByfiletype(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByFileEntryId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of docs_custom datas.
	*
	* @return the number of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}