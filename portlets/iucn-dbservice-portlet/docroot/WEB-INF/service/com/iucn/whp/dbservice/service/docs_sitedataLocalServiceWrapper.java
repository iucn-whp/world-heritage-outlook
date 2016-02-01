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

package com.iucn.whp.dbservice.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link docs_sitedataLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       docs_sitedataLocalService
 * @generated
 */
public class docs_sitedataLocalServiceWrapper
	implements docs_sitedataLocalService,
		ServiceWrapper<docs_sitedataLocalService> {
	public docs_sitedataLocalServiceWrapper(
		docs_sitedataLocalService docs_sitedataLocalService) {
		_docs_sitedataLocalService = docs_sitedataLocalService;
	}

	/**
	* Adds the docs_sitedata to the database. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedata the docs_sitedata
	* @return the docs_sitedata that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata adddocs_sitedata(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.adddocs_sitedata(docs_sitedata);
	}

	/**
	* Creates a new docs_sitedata with the primary key. Does not add the docs_sitedata to the database.
	*
	* @param docs_sitedataId the primary key for the new docs_sitedata
	* @return the new docs_sitedata
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata createdocs_sitedata(
		long docs_sitedataId) {
		return _docs_sitedataLocalService.createdocs_sitedata(docs_sitedataId);
	}

	/**
	* Deletes the docs_sitedata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata that was removed
	* @throws PortalException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata deletedocs_sitedata(
		long docs_sitedataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.deletedocs_sitedata(docs_sitedataId);
	}

	/**
	* Deletes the docs_sitedata from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedata the docs_sitedata
	* @return the docs_sitedata that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata deletedocs_sitedata(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.deletedocs_sitedata(docs_sitedata);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docs_sitedataLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.docs_sitedata fetchdocs_sitedata(
		long docs_sitedataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.fetchdocs_sitedata(docs_sitedataId);
	}

	/**
	* Returns the docs_sitedata with the primary key.
	*
	* @param docs_sitedataId the primary key of the docs_sitedata
	* @return the docs_sitedata
	* @throws PortalException if a docs_sitedata with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata getdocs_sitedata(
		long docs_sitedataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.getdocs_sitedata(docs_sitedataId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the docs_sitedatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of docs_sitedatas
	* @param end the upper bound of the range of docs_sitedatas (not inclusive)
	* @return the range of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.docs_sitedata> getdocs_sitedatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.getdocs_sitedatas(start, end);
	}

	/**
	* Returns the number of docs_sitedatas.
	*
	* @return the number of docs_sitedatas
	* @throws SystemException if a system exception occurred
	*/
	public int getdocs_sitedatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.getdocs_sitedatasCount();
	}

	/**
	* Updates the docs_sitedata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedata the docs_sitedata
	* @return the docs_sitedata that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata updatedocs_sitedata(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.updatedocs_sitedata(docs_sitedata);
	}

	/**
	* Updates the docs_sitedata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_sitedata the docs_sitedata
	* @param merge whether to merge the docs_sitedata with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the docs_sitedata that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_sitedata updatedocs_sitedata(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.updatedocs_sitedata(docs_sitedata,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _docs_sitedataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docs_sitedataLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docs_sitedataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.iucn.whp.dbservice.model.docs_sitedata adddocs_sitedata(
		long siteid, java.lang.String doclink, java.util.Date date,
		long fileentryid, long fileversion, java.lang.String doc_name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_sitedataLocalService.adddocs_sitedata(siteid, doclink,
			date, fileentryid, fileversion, doc_name);
	}

	public com.iucn.whp.dbservice.model.docs_sitedata removedocs_sitedata(
		long fileentryid) {
		return _docs_sitedataLocalService.removedocs_sitedata(fileentryid);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public docs_sitedataLocalService getWrappeddocs_sitedataLocalService() {
		return _docs_sitedataLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddocs_sitedataLocalService(
		docs_sitedataLocalService docs_sitedataLocalService) {
		_docs_sitedataLocalService = docs_sitedataLocalService;
	}

	public docs_sitedataLocalService getWrappedService() {
		return _docs_sitedataLocalService;
	}

	public void setWrappedService(
		docs_sitedataLocalService docs_sitedataLocalService) {
		_docs_sitedataLocalService = docs_sitedataLocalService;
	}

	private docs_sitedataLocalService _docs_sitedataLocalService;
}