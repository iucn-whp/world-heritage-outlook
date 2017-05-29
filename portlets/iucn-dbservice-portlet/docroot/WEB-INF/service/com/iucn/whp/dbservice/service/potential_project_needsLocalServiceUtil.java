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
 * The utility for the potential_project_needs local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.potential_project_needsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see potential_project_needsLocalService
 * @see com.iucn.whp.dbservice.service.base.potential_project_needsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.potential_project_needsLocalServiceImpl
 * @generated
 */
public class potential_project_needsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.potential_project_needsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the potential_project_needs to the database. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs addpotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addpotential_project_needs(potential_project_needs);
	}

	/**
	* Creates a new potential_project_needs with the primary key. Does not add the potential_project_needs to the database.
	*
	* @param ppn_id the primary key for the new potential_project_needs
	* @return the new potential_project_needs
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs createpotential_project_needs(
		long ppn_id) {
		return getService().createpotential_project_needs(ppn_id);
	}

	/**
	* Deletes the potential_project_needs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws PortalException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs deletepotential_project_needs(
		long ppn_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletepotential_project_needs(ppn_id);
	}

	/**
	* Deletes the potential_project_needs from the database. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs deletepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletepotential_project_needs(potential_project_needs);
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

	public static com.iucn.whp.dbservice.model.potential_project_needs fetchpotential_project_needs(
		long ppn_id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchpotential_project_needs(ppn_id);
	}

	/**
	* Returns the potential_project_needs with the primary key.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs
	* @throws PortalException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs getpotential_project_needs(
		long ppn_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getpotential_project_needs(ppn_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the potential_project_needses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @return the range of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getpotential_project_needses(start, end);
	}

	/**
	* Returns the number of potential_project_needses.
	*
	* @return the number of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public static int getpotential_project_needsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getpotential_project_needsesCount();
	}

	/**
	* Updates the potential_project_needs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs updatepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatepotential_project_needs(potential_project_needs);
	}

	/**
	* Updates the potential_project_needs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @param merge whether to merge the potential_project_needs with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the potential_project_needs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.potential_project_needs updatepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatepotential_project_needs(potential_project_needs, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_projectsByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getpotential_projectsByVersion(versionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static potential_project_needsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					potential_project_needsLocalService.class.getName());

			if (invokableLocalService instanceof potential_project_needsLocalService) {
				_service = (potential_project_needsLocalService)invokableLocalService;
			}
			else {
				_service = new potential_project_needsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(potential_project_needsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(potential_project_needsLocalService service) {
	}

	private static potential_project_needsLocalService _service;
}