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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the docs_custom data local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.docs_customDataLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see docs_customDataLocalService
 * @see com.iucn.whp.dbservice.service.base.docs_customDataLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.docs_customDataLocalServiceImpl
 * @generated
 */
public class docs_customDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.docs_customDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the docs_custom data to the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData adddocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().adddocs_customData(docs_customData);
	}

	/**
	* Creates a new docs_custom data with the primary key. Does not add the docs_custom data to the database.
	*
	* @param docs_customDataId the primary key for the new docs_custom data
	* @return the new docs_custom data
	*/
	public static com.iucn.whp.dbservice.model.docs_customData createdocs_customData(
		int docs_customDataId) {
		return getService().createdocs_customData(docs_customDataId);
	}

	/**
	* Deletes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data that was removed
	* @throws PortalException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData deletedocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletedocs_customData(docs_customDataId);
	}

	/**
	* Deletes the docs_custom data from the database. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData deletedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletedocs_customData(docs_customData);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.iucn.whp.dbservice.model.docs_customData fetchdocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchdocs_customData(docs_customDataId);
	}

	/**
	* Returns the docs_custom data with the primary key.
	*
	* @param docs_customDataId the primary key of the docs_custom data
	* @return the docs_custom data
	* @throws PortalException if a docs_custom data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData getdocs_customData(
		int docs_customDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getdocs_customData(docs_customDataId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> getdocs_customDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getdocs_customDatas(start, end);
	}

	/**
	* Returns the number of docs_custom datas.
	*
	* @return the number of docs_custom datas
	* @throws SystemException if a system exception occurred
	*/
	public static int getdocs_customDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getdocs_customDatasCount();
	}

	/**
	* Updates the docs_custom data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @return the docs_custom data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData updatedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatedocs_customData(docs_customData);
	}

	/**
	* Updates the docs_custom data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docs_customData the docs_custom data
	* @param merge whether to merge the docs_custom data with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the docs_custom data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.docs_customData updatedocs_customData(
		com.iucn.whp.dbservice.model.docs_customData docs_customData,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatedocs_customData(docs_customData, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.iucn.whp.dbservice.model.docs_customData adddocs_customData(
		long fileentryid, long versionid, java.util.Date publish_date,
		java.util.Date upload_date, java.lang.String type,
		java.lang.String category, java.lang.String author)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .adddocs_customData(fileentryid, versionid, publish_date,
			upload_date, type, category, author);
	}

	public static com.iucn.whp.dbservice.model.docs_customData adddocs_customData1(
		long fileentryid, long versionid, java.util.Date publish_date,
		java.util.Date upload_date, java.lang.String type,
		java.lang.String category, java.lang.String author,
		java.lang.String site, java.lang.String com, java.lang.String full_com,
		java.lang.String copyright, java.lang.String language,
		java.lang.String title)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .adddocs_customData1(fileentryid, versionid, publish_date,
			upload_date, type, category, author, site, com, full_com,
			copyright, language, title);
	}

	public static com.iucn.whp.dbservice.model.docs_customData removedocs_customData(
		long fileentryid) {
		return getService().removedocs_customData(fileentryid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBypulicDate(
		java.util.Date publish_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBypulicDate(publish_date);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBytype(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBytype(type);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findBycategory(
		java.lang.String category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycategory(category);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findByuploaddate(
		java.util.Date upload_date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByuploaddate(upload_date);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.docs_customData> findbyquery(
		java.lang.String query, int begin, int end) {
		return getService().findbyquery(query, begin, end);
	}

	public static com.iucn.whp.dbservice.model.docs_customData getfileEntry(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getfileEntry(fileEntryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static docs_customDataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					docs_customDataLocalService.class.getName());

			if (invokableLocalService instanceof docs_customDataLocalService) {
				_service = (docs_customDataLocalService)invokableLocalService;
			}
			else {
				_service = new docs_customDataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(docs_customDataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(docs_customDataLocalService service) {
	}

	private static docs_customDataLocalService _service;
}