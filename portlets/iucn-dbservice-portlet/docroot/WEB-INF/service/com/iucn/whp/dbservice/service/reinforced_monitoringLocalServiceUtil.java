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
 * The utility for the reinforced_monitoring local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.reinforced_monitoringLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringLocalService
 * @see com.iucn.whp.dbservice.service.base.reinforced_monitoringLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.reinforced_monitoringLocalServiceImpl
 * @generated
 */
public class reinforced_monitoringLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.reinforced_monitoringLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the reinforced_monitoring to the database. Also notifies the appropriate model listeners.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	* @return the reinforced_monitoring that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring addreinforced_monitoring(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addreinforced_monitoring(reinforced_monitoring);
	}

	/**
	* Creates a new reinforced_monitoring with the primary key. Does not add the reinforced_monitoring to the database.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key for the new reinforced_monitoring
	* @return the new reinforced_monitoring
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring createreinforced_monitoring(
		long whp_sites_reinforced_monitoring_id) {
		return getService()
				   .createreinforced_monitoring(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Deletes the reinforced_monitoring with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring that was removed
	* @throws PortalException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring deletereinforced_monitoring(
		long whp_sites_reinforced_monitoring_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletereinforced_monitoring(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Deletes the reinforced_monitoring from the database. Also notifies the appropriate model listeners.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	* @return the reinforced_monitoring that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring deletereinforced_monitoring(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletereinforced_monitoring(reinforced_monitoring);
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

	public static com.iucn.whp.dbservice.model.reinforced_monitoring fetchreinforced_monitoring(
		long whp_sites_reinforced_monitoring_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchreinforced_monitoring(whp_sites_reinforced_monitoring_id);
	}

	/**
	* Returns the reinforced_monitoring with the primary key.
	*
	* @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	* @return the reinforced_monitoring
	* @throws PortalException if a reinforced_monitoring with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring getreinforced_monitoring(
		long whp_sites_reinforced_monitoring_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getreinforced_monitoring(whp_sites_reinforced_monitoring_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the reinforced_monitorings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of reinforced_monitorings
	* @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	* @return the range of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getreinforced_monitorings(start, end);
	}

	/**
	* Returns the number of reinforced_monitorings.
	*
	* @return the number of reinforced_monitorings
	* @throws SystemException if a system exception occurred
	*/
	public static int getreinforced_monitoringsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getreinforced_monitoringsCount();
	}

	/**
	* Updates the reinforced_monitoring in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	* @return the reinforced_monitoring that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring updatereinforced_monitoring(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatereinforced_monitoring(reinforced_monitoring);
	}

	/**
	* Updates the reinforced_monitoring in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param reinforced_monitoring the reinforced_monitoring
	* @param merge whether to merge the reinforced_monitoring with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the reinforced_monitoring that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.reinforced_monitoring updatereinforced_monitoring(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatereinforced_monitoring(reinforced_monitoring, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static reinforced_monitoringLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					reinforced_monitoringLocalService.class.getName());

			if (invokableLocalService instanceof reinforced_monitoringLocalService) {
				_service = (reinforced_monitoringLocalService)invokableLocalService;
			}
			else {
				_service = new reinforced_monitoringLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(reinforced_monitoringLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(reinforced_monitoringLocalService service) {
	}

	private static reinforced_monitoringLocalService _service;
}