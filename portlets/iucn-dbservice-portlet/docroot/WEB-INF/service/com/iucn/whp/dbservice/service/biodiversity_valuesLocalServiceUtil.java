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
 * The utility for the biodiversity_values local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.biodiversity_valuesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see biodiversity_valuesLocalService
 * @see com.iucn.whp.dbservice.service.base.biodiversity_valuesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.biodiversity_valuesLocalServiceImpl
 * @generated
 */
public class biodiversity_valuesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.biodiversity_valuesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the biodiversity_values to the database. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values addbiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addbiodiversity_values(biodiversity_values);
	}

	/**
	* Creates a new biodiversity_values with the primary key. Does not add the biodiversity_values to the database.
	*
	* @param id the primary key for the new biodiversity_values
	* @return the new biodiversity_values
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values createbiodiversity_values(
		long id) {
		return getService().createbiodiversity_values(id);
	}

	/**
	* Deletes the biodiversity_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values that was removed
	* @throws PortalException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values deletebiodiversity_values(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebiodiversity_values(id);
	}

	/**
	* Deletes the biodiversity_values from the database. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values deletebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebiodiversity_values(biodiversity_values);
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

	public static com.iucn.whp.dbservice.model.biodiversity_values fetchbiodiversity_values(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchbiodiversity_values(id);
	}

	/**
	* Returns the biodiversity_values with the primary key.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values
	* @throws PortalException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values getbiodiversity_values(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getbiodiversity_values(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the biodiversity_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @return the range of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbiodiversity_valueses(start, end);
	}

	/**
	* Returns the number of biodiversity_valueses.
	*
	* @return the number of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public static int getbiodiversity_valuesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbiodiversity_valuesesCount();
	}

	/**
	* Updates the biodiversity_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values updatebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebiodiversity_values(biodiversity_values);
	}

	/**
	* Updates the biodiversity_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @param merge whether to merge the biodiversity_values with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the biodiversity_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.biodiversity_values updatebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebiodiversity_values(biodiversity_values, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getValeusByAssessment_VersionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getValeusByAssessment_VersionId(assessment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static biodiversity_valuesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					biodiversity_valuesLocalService.class.getName());

			if (invokableLocalService instanceof biodiversity_valuesLocalService) {
				_service = (biodiversity_valuesLocalService)invokableLocalService;
			}
			else {
				_service = new biodiversity_valuesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(biodiversity_valuesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(biodiversity_valuesLocalService service) {
	}

	private static biodiversity_valuesLocalService _service;
}