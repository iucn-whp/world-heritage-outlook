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
 * The utility for the whp_sites_component local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_sites_componentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_componentLocalService
 * @see com.iucn.whp.dbservice.service.base.whp_sites_componentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sites_componentLocalServiceImpl
 * @generated
 */
public class whp_sites_componentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sites_componentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the whp_sites_component to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component the whp_sites_component
	* @return the whp_sites_component that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component addwhp_sites_component(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addwhp_sites_component(whp_sites_component);
	}

	/**
	* Creates a new whp_sites_component with the primary key. Does not add the whp_sites_component to the database.
	*
	* @param whp_sites_component_id the primary key for the new whp_sites_component
	* @return the new whp_sites_component
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component createwhp_sites_component(
		long whp_sites_component_id) {
		return getService().createwhp_sites_component(whp_sites_component_id);
	}

	/**
	* Deletes the whp_sites_component with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component_id the primary key of the whp_sites_component
	* @return the whp_sites_component that was removed
	* @throws PortalException if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component deletewhp_sites_component(
		long whp_sites_component_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites_component(whp_sites_component_id);
	}

	/**
	* Deletes the whp_sites_component from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component the whp_sites_component
	* @return the whp_sites_component that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component deletewhp_sites_component(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites_component(whp_sites_component);
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

	public static com.iucn.whp.dbservice.model.whp_sites_component fetchwhp_sites_component(
		long whp_sites_component_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchwhp_sites_component(whp_sites_component_id);
	}

	/**
	* Returns the whp_sites_component with the primary key.
	*
	* @param whp_sites_component_id the primary key of the whp_sites_component
	* @return the whp_sites_component
	* @throws PortalException if a whp_sites_component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component getwhp_sites_component(
		long whp_sites_component_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_component(whp_sites_component_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_components.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_components
	* @param end the upper bound of the range of whp_sites_components (not inclusive)
	* @return the range of whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_components(start, end);
	}

	/**
	* Returns the number of whp_sites_components.
	*
	* @return the number of whp_sites_components
	* @throws SystemException if a system exception occurred
	*/
	public static int getwhp_sites_componentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_componentsCount();
	}

	/**
	* Updates the whp_sites_component in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component the whp_sites_component
	* @return the whp_sites_component that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component updatewhp_sites_component(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites_component(whp_sites_component);
	}

	/**
	* Updates the whp_sites_component in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_component the whp_sites_component
	* @param merge whether to merge the whp_sites_component with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_component that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_component updatewhp_sites_component(
		com.iucn.whp.dbservice.model.whp_sites_component whp_sites_component,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites_component(whp_sites_component, merge);
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

	/**
	* By SiteId
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_component> getWhpSiteComponentBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWhpSiteComponentBySiteId(siteId);
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_sites_componentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_sites_componentLocalService.class.getName());

			if (invokableLocalService instanceof whp_sites_componentLocalService) {
				_service = (whp_sites_componentLocalService)invokableLocalService;
			}
			else {
				_service = new whp_sites_componentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(whp_sites_componentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_sites_componentLocalService service) {
	}

	private static whp_sites_componentLocalService _service;
}