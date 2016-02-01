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
 * The utility for the conservation_outlook local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.conservation_outlookLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see conservation_outlookLocalService
 * @see com.iucn.whp.dbservice.service.base.conservation_outlookLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.conservation_outlookLocalServiceImpl
 * @generated
 */
public class conservation_outlookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.conservation_outlookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the conservation_outlook to the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook addconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addconservation_outlook(conservation_outlook);
	}

	/**
	* Creates a new conservation_outlook with the primary key. Does not add the conservation_outlook to the database.
	*
	* @param conservation_outlook_id the primary key for the new conservation_outlook
	* @return the new conservation_outlook
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook createconservation_outlook(
		long conservation_outlook_id) {
		return getService().createconservation_outlook(conservation_outlook_id);
	}

	/**
	* Deletes the conservation_outlook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook that was removed
	* @throws PortalException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook deleteconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteconservation_outlook(conservation_outlook_id);
	}

	/**
	* Deletes the conservation_outlook from the database. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook deleteconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteconservation_outlook(conservation_outlook);
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

	public static com.iucn.whp.dbservice.model.conservation_outlook fetchconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchconservation_outlook(conservation_outlook_id);
	}

	/**
	* Returns the conservation_outlook with the primary key.
	*
	* @param conservation_outlook_id the primary key of the conservation_outlook
	* @return the conservation_outlook
	* @throws PortalException if a conservation_outlook with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook getconservation_outlook(
		long conservation_outlook_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getconservation_outlook(conservation_outlook_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the conservation_outlooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conservation_outlooks
	* @param end the upper bound of the range of conservation_outlooks (not inclusive)
	* @return the range of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getconservation_outlooks(start, end);
	}

	/**
	* Returns the number of conservation_outlooks.
	*
	* @return the number of conservation_outlooks
	* @throws SystemException if a system exception occurred
	*/
	public static int getconservation_outlooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getconservation_outlooksCount();
	}

	/**
	* Updates the conservation_outlook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @return the conservation_outlook that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook updateconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateconservation_outlook(conservation_outlook);
	}

	/**
	* Updates the conservation_outlook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conservation_outlook the conservation_outlook
	* @param merge whether to merge the conservation_outlook with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the conservation_outlook that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.conservation_outlook updateconservation_outlook(
		com.iucn.whp.dbservice.model.conservation_outlook conservation_outlook,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateconservation_outlook(conservation_outlook, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getconservationOutllokByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getconservationOutllokByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp> getconservationoutlookrating()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getconservationoutlookrating();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.conservation_outlook> getAllConservationOutlook()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllConservationOutlook();
	}

	public static void clearService() {
		_service = null;
	}

	public static conservation_outlookLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					conservation_outlookLocalService.class.getName());

			if (invokableLocalService instanceof conservation_outlookLocalService) {
				_service = (conservation_outlookLocalService)invokableLocalService;
			}
			else {
				_service = new conservation_outlookLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(conservation_outlookLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(conservation_outlookLocalService service) {
	}

	private static conservation_outlookLocalService _service;
}