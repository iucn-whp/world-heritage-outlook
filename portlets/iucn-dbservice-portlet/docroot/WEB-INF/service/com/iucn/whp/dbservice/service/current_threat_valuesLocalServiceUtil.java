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
 * The utility for the current_threat_values local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.current_threat_valuesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see current_threat_valuesLocalService
 * @see com.iucn.whp.dbservice.service.base.current_threat_valuesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.current_threat_valuesLocalServiceImpl
 * @generated
 */
public class current_threat_valuesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.current_threat_valuesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the current_threat_values to the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values the current_threat_values
	* @return the current_threat_values that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values addcurrent_threat_values(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addcurrent_threat_values(current_threat_values);
	}

	/**
	* Creates a new current_threat_values with the primary key. Does not add the current_threat_values to the database.
	*
	* @param current_threat_values_id the primary key for the new current_threat_values
	* @return the new current_threat_values
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values createcurrent_threat_values(
		long current_threat_values_id) {
		return getService().createcurrent_threat_values(current_threat_values_id);
	}

	/**
	* Deletes the current_threat_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values_id the primary key of the current_threat_values
	* @return the current_threat_values that was removed
	* @throws PortalException if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values deletecurrent_threat_values(
		long current_threat_values_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletecurrent_threat_values(current_threat_values_id);
	}

	/**
	* Deletes the current_threat_values from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values the current_threat_values
	* @return the current_threat_values that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values deletecurrent_threat_values(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletecurrent_threat_values(current_threat_values);
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

	public static com.iucn.whp.dbservice.model.current_threat_values fetchcurrent_threat_values(
		long current_threat_values_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchcurrent_threat_values(current_threat_values_id);
	}

	/**
	* Returns the current_threat_values with the primary key.
	*
	* @param current_threat_values_id the primary key of the current_threat_values
	* @return the current_threat_values
	* @throws PortalException if a current_threat_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values getcurrent_threat_values(
		long current_threat_values_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getcurrent_threat_values(current_threat_values_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the current_threat_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of current_threat_valueses
	* @param end the upper bound of the range of current_threat_valueses (not inclusive)
	* @return the range of current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getcurrent_threat_valueses(start, end);
	}

	/**
	* Returns the number of current_threat_valueses.
	*
	* @return the number of current_threat_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static int getcurrent_threat_valuesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getcurrent_threat_valuesesCount();
	}

	/**
	* Updates the current_threat_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values the current_threat_values
	* @return the current_threat_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values updatecurrent_threat_values(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatecurrent_threat_values(current_threat_values);
	}

	/**
	* Updates the current_threat_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param current_threat_values the current_threat_values
	* @param merge whether to merge the current_threat_values with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the current_threat_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.current_threat_values updatecurrent_threat_values(
		com.iucn.whp.dbservice.model.current_threat_values current_threat_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatecurrent_threat_values(current_threat_values, merge);
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

	public static current_threat_valuesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					current_threat_valuesLocalService.class.getName());

			if (invokableLocalService instanceof current_threat_valuesLocalService) {
				_service = (current_threat_valuesLocalService)invokableLocalService;
			}
			else {
				_service = new current_threat_valuesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(current_threat_valuesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(current_threat_valuesLocalService service) {
	}

	private static current_threat_valuesLocalService _service;
}