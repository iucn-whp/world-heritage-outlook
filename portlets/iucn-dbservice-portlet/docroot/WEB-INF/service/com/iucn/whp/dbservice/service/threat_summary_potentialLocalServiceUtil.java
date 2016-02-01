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
 * The utility for the threat_summary_potential local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.threat_summary_potentialLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_potentialLocalService
 * @see com.iucn.whp.dbservice.service.base.threat_summary_potentialLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.threat_summary_potentialLocalServiceImpl
 * @generated
 */
public class threat_summary_potentialLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.threat_summary_potentialLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the threat_summary_potential to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_potential the threat_summary_potential
	* @return the threat_summary_potential that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential addthreat_summary_potential(
		com.iucn.whp.dbservice.model.threat_summary_potential threat_summary_potential)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addthreat_summary_potential(threat_summary_potential);
	}

	/**
	* Creates a new threat_summary_potential with the primary key. Does not add the threat_summary_potential to the database.
	*
	* @param threat_sum_potential_id the primary key for the new threat_summary_potential
	* @return the new threat_summary_potential
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential createthreat_summary_potential(
		long threat_sum_potential_id) {
		return getService()
				   .createthreat_summary_potential(threat_sum_potential_id);
	}

	/**
	* Deletes the threat_summary_potential with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_sum_potential_id the primary key of the threat_summary_potential
	* @return the threat_summary_potential that was removed
	* @throws PortalException if a threat_summary_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential deletethreat_summary_potential(
		long threat_sum_potential_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletethreat_summary_potential(threat_sum_potential_id);
	}

	/**
	* Deletes the threat_summary_potential from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_potential the threat_summary_potential
	* @return the threat_summary_potential that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential deletethreat_summary_potential(
		com.iucn.whp.dbservice.model.threat_summary_potential threat_summary_potential)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletethreat_summary_potential(threat_summary_potential);
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

	public static com.iucn.whp.dbservice.model.threat_summary_potential fetchthreat_summary_potential(
		long threat_sum_potential_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchthreat_summary_potential(threat_sum_potential_id);
	}

	/**
	* Returns the threat_summary_potential with the primary key.
	*
	* @param threat_sum_potential_id the primary key of the threat_summary_potential
	* @return the threat_summary_potential
	* @throws PortalException if a threat_summary_potential with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential getthreat_summary_potential(
		long threat_sum_potential_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_summary_potential(threat_sum_potential_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_summary_potentials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_potentials
	* @param end the upper bound of the range of threat_summary_potentials (not inclusive)
	* @return the range of threat_summary_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_summary_potentials(start, end);
	}

	/**
	* Returns the number of threat_summary_potentials.
	*
	* @return the number of threat_summary_potentials
	* @throws SystemException if a system exception occurred
	*/
	public static int getthreat_summary_potentialsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_summary_potentialsCount();
	}

	/**
	* Updates the threat_summary_potential in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_potential the threat_summary_potential
	* @return the threat_summary_potential that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential updatethreat_summary_potential(
		com.iucn.whp.dbservice.model.threat_summary_potential threat_summary_potential)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatethreat_summary_potential(threat_summary_potential);
	}

	/**
	* Updates the threat_summary_potential in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_potential the threat_summary_potential
	* @param merge whether to merge the threat_summary_potential with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_summary_potential that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_summary_potential updatethreat_summary_potential(
		com.iucn.whp.dbservice.model.threat_summary_potential threat_summary_potential,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatethreat_summary_potential(threat_summary_potential,
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

	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentialByAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getthreat_summary_potentialByAssessmentId(assessment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static threat_summary_potentialLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					threat_summary_potentialLocalService.class.getName());

			if (invokableLocalService instanceof threat_summary_potentialLocalService) {
				_service = (threat_summary_potentialLocalService)invokableLocalService;
			}
			else {
				_service = new threat_summary_potentialLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(threat_summary_potentialLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(threat_summary_potentialLocalService service) {
	}

	private static threat_summary_potentialLocalService _service;
}