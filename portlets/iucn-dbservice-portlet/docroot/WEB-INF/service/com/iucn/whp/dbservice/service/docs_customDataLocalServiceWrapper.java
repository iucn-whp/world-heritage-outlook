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
 * This class is a wrapper for {@link docs_customDataLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       docs_customDataLocalService
 * @generated
 */
public class docs_customDataLocalServiceWrapper
	implements docs_customDataLocalService,
		ServiceWrapper<docs_customDataLocalService> {
	public docs_customDataLocalServiceWrapper(
		docs_customDataLocalService docs_customDataLocalService) {
		_docs_customDataLocalService = docs_customDataLocalService;
	}

	/**
	* Adds the docs_custom data to the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData adddocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.adddocs_customData(docs_customData);
	}

	/**
	* Creates a new docs_custom data with the primary key. Does not add the docs_custom data to the database.
	*
	* @param docs_customDataId the primary key for the new docs_custom data
	* @return the new docs_custom data
	*/
	public com.iucn.whp.dbservice.model.docs_customData createdocs_customData(
		int docs_customDataId) {
		return _docs_customDataLocalService.createdocs_customData(docs_customDataId);
	}

	/**
	* Deletes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data that was removed
	* @throws PortalException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData deletedocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.deletedocs_customData(docs_customDataId);
	}

	/**
	* Deletes the docs_custom data from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData deletedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.deletedocs_customData(docs_customData);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docs_customDataLocalService.dynamicQuery();
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
		return _docs_customDataLocalService.dynamicQuery(dynamicQuery);
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
		return _docs_customDataLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _docs_customDataLocalService.dynamicQuery(dynamicQuery, start,
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
		return _docs_customDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.docs_customData fetchdocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.fetchdocs_customData(docs_customDataId);
	}

	/**
	* Returns the docs_custom data with the primary key.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data
	* @throws PortalException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData getdocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.getdocs_customData(docs_customDataId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> getdocs_customDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.getdocs_customDatas(start, end);
	}

	/**
	* Returns the number of docs_custom datas.
	*
	* @return the number of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public int getdocs_customDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.getdocs_customDatasCount();
	}

	/**
	* Updates the docs_custom data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData updatedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.updatedocs_customData(docs_customData);
	}

	/**
	* Updates the docs_custom data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @param merge whether to merge the docs_custom data with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the docs_custom data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.docs_customData updatedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.updatedocs_customData(docs_customData,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _docs_customDataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docs_customDataLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docs_customDataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.iucn.whp.dbservice.model.docs_customData adddocs_customData(
		long fileentryid, long versionid, java.util.Date publish_date,
		java.util.Date upload_date, java.lang.String type,
		java.lang.String category, java.lang.String author)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.adddocs_customData(fileentryid,
			versionid, publish_date, upload_date, type, category, author);
	}

	public com.iucn.whp.dbservice.model.docs_customData adddocs_customData1(
		long fileentryid, long versionid, java.util.Date publish_date,
		java.util.Date upload_date, java.lang.String type,
		java.lang.String category, java.lang.String author,
		java.lang.String site, java.lang.String com, java.lang.String full_com,
		java.lang.String copyright, java.lang.String language,
		java.lang.String title)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.adddocs_customData1(fileentryid,
			versionid, publish_date, upload_date, type, category, author, site,
			com, full_com, copyright, language, title);
	}

	public com.iucn.whp.dbservice.model.docs_customData removedocs_customData(
		long fileentryid) {
		return _docs_customDataLocalService.removedocs_customData(fileentryid);
	}

	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBypulicDate(
		java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.findBypulicDate(publish_date);
	}

	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBytype(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.findBytype(type);
	}

	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBycategory(
		java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.findBycategory(category);
	}

	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByuploaddate(
		java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.findByuploaddate(upload_date);
	}

	public java.util.List<com.iucn.whp.dbservice.model.docs_customData> findbyquery(
		java.lang.String query, int begin, int end) {
		return _docs_customDataLocalService.findbyquery(query, begin, end);
	}

	public com.iucn.whp.dbservice.model.docs_customData getfileEntry(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docs_customDataLocalService.getfileEntry(fileEntryId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public docs_customDataLocalService getWrappeddocs_customDataLocalService() {
		return _docs_customDataLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddocs_customDataLocalService(
		docs_customDataLocalService docs_customDataLocalService) {
		_docs_customDataLocalService = docs_customDataLocalService;
	}

	public docs_customDataLocalService getWrappedService() {
		return _docs_customDataLocalService;
	}

	public void setWrappedService(
		docs_customDataLocalService docs_customDataLocalService) {
		_docs_customDataLocalService = docs_customDataLocalService;
	}

	private docs_customDataLocalService _docs_customDataLocalService;
}