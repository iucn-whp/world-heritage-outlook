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

import com.iucn.whp.dbservice.model.whp_sites_external_documents;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the whp_sites_external_documents service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_external_documentsPersistenceImpl
 * @see whp_sites_external_documentsUtil
 * @generated
 */
public interface whp_sites_external_documentsPersistence extends BasePersistence<whp_sites_external_documents> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link whp_sites_external_documentsUtil} to access the whp_sites_external_documents persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the whp_sites_external_documents in the entity cache if it is enabled.
	*
	* @param whp_sites_external_documents the whp_sites_external_documents
	*/
	public void cacheResult(
		com.iucn.whp.dbservice.model.whp_sites_external_documents whp_sites_external_documents);

	/**
	* Caches the whp_sites_external_documentses in the entity cache if it is enabled.
	*
	* @param whp_sites_external_documentses the whp_sites_external_documentses
	*/
	public void cacheResult(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> whp_sites_external_documentses);

	/**
	* Creates a new whp_sites_external_documents with the primary key. Does not add the whp_sites_external_documents to the database.
	*
	* @param whp_sites_external_documents_id the primary key for the new whp_sites_external_documents
	* @return the new whp_sites_external_documents
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents create(
		long whp_sites_external_documents_id);

	/**
	* Removes the whp_sites_external_documents with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_external_documents_id the primary key of the whp_sites_external_documents
	* @return the whp_sites_external_documents that was removed
	* @throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException if a whp_sites_external_documents with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents remove(
		long whp_sites_external_documents_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.iucn.whp.dbservice.model.whp_sites_external_documents updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_external_documents whp_sites_external_documents,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_external_documents with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_external_documentsException} if it could not be found.
	*
	* @param whp_sites_external_documents_id the primary key of the whp_sites_external_documents
	* @return the whp_sites_external_documents
	* @throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException if a whp_sites_external_documents with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents findByPrimaryKey(
		long whp_sites_external_documents_id)
		throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_external_documents with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param whp_sites_external_documents_id the primary key of the whp_sites_external_documents
	* @return the whp_sites_external_documents, or <code>null</code> if a whp_sites_external_documents with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents fetchByPrimaryKey(
		long whp_sites_external_documents_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_external_documents where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_external_documentsException} if it could not be found.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_external_documents
	* @throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException if a matching whp_sites_external_documents could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents findByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_external_documents where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileentryid the fileentryid
	* @return the matching whp_sites_external_documents, or <code>null</code> if a matching whp_sites_external_documents could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents fetchByfileId(
		long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the whp_sites_external_documents where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileentryid the fileentryid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching whp_sites_external_documents, or <code>null</code> if a matching whp_sites_external_documents could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents fetchByfileId(
		long fileentryid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the whp_sites_external_documentses.
	*
	* @return the whp_sites_external_documentses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the whp_sites_external_documentses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_external_documentses
	* @param end the upper bound of the range of whp_sites_external_documentses (not inclusive)
	* @return the range of whp_sites_external_documentses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the whp_sites_external_documentses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_external_documentses
	* @param end the upper bound of the range of whp_sites_external_documentses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of whp_sites_external_documentses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_external_documents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the whp_sites_external_documents where fileentryid = &#63; from the database.
	*
	* @param fileentryid the fileentryid
	* @return the whp_sites_external_documents that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_external_documents removeByfileId(
		long fileentryid)
		throws com.iucn.whp.dbservice.NoSuch_sites_external_documentsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the whp_sites_external_documentses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_external_documentses where fileentryid = &#63;.
	*
	* @param fileentryid the fileentryid
	* @return the number of matching whp_sites_external_documentses
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileId(long fileentryid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of whp_sites_external_documentses.
	*
	* @return the number of whp_sites_external_documentses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}