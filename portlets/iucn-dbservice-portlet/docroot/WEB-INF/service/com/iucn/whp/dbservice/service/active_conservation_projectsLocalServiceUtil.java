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
 * The utility for the active_conservation_projects local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.active_conservation_projectsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see active_conservation_projectsLocalService
 * @see com.iucn.whp.dbservice.service.base.active_conservation_projectsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.active_conservation_projectsLocalServiceImpl
 * @generated
 */
public class active_conservation_projectsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.active_conservation_projectsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the active_conservation_projects to the database. Also notifies the appropriate model listeners.
	*
	* @param active_conservation_projects the active_conservation_projects
	* @return the active_conservation_projects that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects addactive_conservation_projects(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addactive_conservation_projects(active_conservation_projects);
	}

	/**
	* Creates a new active_conservation_projects with the primary key. Does not add the active_conservation_projects to the database.
	*
	* @param acpid the primary key for the new active_conservation_projects
	* @return the new active_conservation_projects
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects createactive_conservation_projects(
		long acpid) {
		return getService().createactive_conservation_projects(acpid);
	}

	/**
	* Deletes the active_conservation_projects with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param acpid the primary key of the active_conservation_projects
	* @return the active_conservation_projects that was removed
	* @throws PortalException if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects deleteactive_conservation_projects(
		long acpid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteactive_conservation_projects(acpid);
	}

	/**
	* Deletes the active_conservation_projects from the database. Also notifies the appropriate model listeners.
	*
	* @param active_conservation_projects the active_conservation_projects
	* @return the active_conservation_projects that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects deleteactive_conservation_projects(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteactive_conservation_projects(active_conservation_projects);
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

	public static com.iucn.whp.dbservice.model.active_conservation_projects fetchactive_conservation_projects(
		long acpid) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchactive_conservation_projects(acpid);
	}

	/**
	* Returns the active_conservation_projects with the primary key.
	*
	* @param acpid the primary key of the active_conservation_projects
	* @return the active_conservation_projects
	* @throws PortalException if a active_conservation_projects with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects getactive_conservation_projects(
		long acpid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getactive_conservation_projects(acpid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the active_conservation_projectses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of active_conservation_projectses
	* @param end the upper bound of the range of active_conservation_projectses (not inclusive)
	* @return the range of active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getactive_conservation_projectses(start, end);
	}

	/**
	* Returns the number of active_conservation_projectses.
	*
	* @return the number of active_conservation_projectses
	* @throws SystemException if a system exception occurred
	*/
	public static int getactive_conservation_projectsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getactive_conservation_projectsesCount();
	}

	/**
	* Updates the active_conservation_projects in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param active_conservation_projects the active_conservation_projects
	* @return the active_conservation_projects that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects updateactive_conservation_projects(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateactive_conservation_projects(active_conservation_projects);
	}

	/**
	* Updates the active_conservation_projects in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param active_conservation_projects the active_conservation_projects
	* @param merge whether to merge the active_conservation_projects with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the active_conservation_projects that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.active_conservation_projects updateactive_conservation_projects(
		com.iucn.whp.dbservice.model.active_conservation_projects active_conservation_projects,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateactive_conservation_projects(active_conservation_projects,
			merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectsByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getactive_conservation_projectsByVersion(versionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static active_conservation_projectsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					active_conservation_projectsLocalService.class.getName());

			if (invokableLocalService instanceof active_conservation_projectsLocalService) {
				_service = (active_conservation_projectsLocalService)invokableLocalService;
			}
			else {
				_service = new active_conservation_projectsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(active_conservation_projectsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(active_conservation_projectsLocalService service) {
	}

	private static active_conservation_projectsLocalService _service;
}