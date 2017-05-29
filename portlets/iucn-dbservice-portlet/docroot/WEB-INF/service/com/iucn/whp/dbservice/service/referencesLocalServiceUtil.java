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
 * The utility for the references local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.referencesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see referencesLocalService
 * @see com.iucn.whp.dbservice.service.base.referencesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.referencesLocalServiceImpl
 * @generated
 */
public class referencesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.referencesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the references to the database. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references addreferences(
		com.iucn.whp.dbservice.model.references references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addreferences(references);
	}

	/**
	* Creates a new references with the primary key. Does not add the references to the database.
	*
	* @param reference_id the primary key for the new references
	* @return the new references
	*/
	public static com.iucn.whp.dbservice.model.references createreferences(
		long reference_id) {
		return getService().createreferences(reference_id);
	}

	/**
	* Deletes the references with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reference_id the primary key of the references
	* @return the references that was removed
	* @throws PortalException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references deletereferences(
		long reference_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletereferences(reference_id);
	}

	/**
	* Deletes the references from the database. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references deletereferences(
		com.iucn.whp.dbservice.model.references references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletereferences(references);
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

	public static com.iucn.whp.dbservice.model.references fetchreferences(
		long reference_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchreferences(reference_id);
	}

	/**
	* Returns the references with the primary key.
	*
	* @param reference_id the primary key of the references
	* @return the references
	* @throws PortalException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references getreferences(
		long reference_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getreferences(reference_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the referenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of referenceses
	* @param end the upper bound of the range of referenceses (not inclusive)
	* @return the range of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.references> getreferenceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getreferenceses(start, end);
	}

	/**
	* Returns the number of referenceses.
	*
	* @return the number of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public static int getreferencesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getreferencesesCount();
	}

	/**
	* Updates the references in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references updatereferences(
		com.iucn.whp.dbservice.model.references references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatereferences(references);
	}

	/**
	* Updates the references in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @param merge whether to merge the references with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the references that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.references updatereferences(
		com.iucn.whp.dbservice.model.references references, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatereferences(references, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.references> findByAssessmentId(
		long assesment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAssessmentId(assesment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static referencesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					referencesLocalService.class.getName());

			if (invokableLocalService instanceof referencesLocalService) {
				_service = (referencesLocalService)invokableLocalService;
			}
			else {
				_service = new referencesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(referencesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(referencesLocalService service) {
	}

	private static referencesLocalService _service;
}