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
 * The utility for the assessing_threats_current local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.assessing_threats_currentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_currentLocalService
 * @see com.iucn.whp.dbservice.service.base.assessing_threats_currentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.assessing_threats_currentLocalServiceImpl
 * @generated
 */
public class assessing_threats_currentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.assessing_threats_currentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessing_threats_current to the database. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current addassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addassessing_threats_current(assessing_threats_current);
	}

	/**
	* Creates a new assessing_threats_current with the primary key. Does not add the assessing_threats_current to the database.
	*
	* @param current_threat_id the primary key for the new assessing_threats_current
	* @return the new assessing_threats_current
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current createassessing_threats_current(
		long current_threat_id) {
		return getService().createassessing_threats_current(current_threat_id);
	}

	/**
	* Deletes the assessing_threats_current with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current that was removed
	* @throws PortalException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current deleteassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteassessing_threats_current(current_threat_id);
	}

	/**
	* Deletes the assessing_threats_current from the database. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current deleteassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteassessing_threats_current(assessing_threats_current);
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

	public static com.iucn.whp.dbservice.model.assessing_threats_current fetchassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchassessing_threats_current(current_threat_id);
	}

	/**
	* Returns the assessing_threats_current with the primary key.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current
	* @throws PortalException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current getassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessing_threats_current(current_threat_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessing_threats_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessing_threats_currents(start, end);
	}

	/**
	* Returns the number of assessing_threats_currents.
	*
	* @return the number of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessing_threats_currentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessing_threats_currentsCount();
	}

	/**
	* Updates the assessing_threats_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current updateassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateassessing_threats_current(assessing_threats_current);
	}

	/**
	* Updates the assessing_threats_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @param merge whether to merge the assessing_threats_current with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessing_threats_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessing_threats_current updateassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateassessing_threats_current(assessing_threats_current,
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

	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getEntriesByAssessment_versionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEntriesByAssessment_versionId(assessment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static assessing_threats_currentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					assessing_threats_currentLocalService.class.getName());

			if (invokableLocalService instanceof assessing_threats_currentLocalService) {
				_service = (assessing_threats_currentLocalService)invokableLocalService;
			}
			else {
				_service = new assessing_threats_currentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(assessing_threats_currentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(assessing_threats_currentLocalService service) {
	}

	private static assessing_threats_currentLocalService _service;
}