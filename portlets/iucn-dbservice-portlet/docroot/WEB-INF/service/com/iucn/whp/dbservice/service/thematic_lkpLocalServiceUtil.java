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
 * The utility for the thematic_lkp local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.thematic_lkpLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see thematic_lkpLocalService
 * @see com.iucn.whp.dbservice.service.base.thematic_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.thematic_lkpLocalServiceImpl
 * @generated
 */
public class thematic_lkpLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.thematic_lkpLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the thematic_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp addthematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addthematic_lkp(thematic_lkp);
	}

	/**
	* Creates a new thematic_lkp with the primary key. Does not add the thematic_lkp to the database.
	*
	* @param thematicid the primary key for the new thematic_lkp
	* @return the new thematic_lkp
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp createthematic_lkp(
		long thematicid) {
		return getService().createthematic_lkp(thematicid);
	}

	/**
	* Deletes the thematic_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp that was removed
	* @throws PortalException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp deletethematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletethematic_lkp(thematicid);
	}

	/**
	* Deletes the thematic_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp deletethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletethematic_lkp(thematic_lkp);
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

	public static com.iucn.whp.dbservice.model.thematic_lkp fetchthematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchthematic_lkp(thematicid);
	}

	/**
	* Returns the thematic_lkp with the primary key.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp
	* @throws PortalException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp getthematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getthematic_lkp(thematicid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the thematic_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of thematic_lkps
	* @param end the upper bound of the range of thematic_lkps (not inclusive)
	* @return the range of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> getthematic_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthematic_lkps(start, end);
	}

	/**
	* Returns the number of thematic_lkps.
	*
	* @return the number of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int getthematic_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthematic_lkpsCount();
	}

	/**
	* Updates the thematic_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp updatethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatethematic_lkp(thematic_lkp);
	}

	/**
	* Updates the thematic_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @param merge whether to merge the thematic_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the thematic_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.thematic_lkp updatethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatethematic_lkp(thematic_lkp, merge);
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
	* Get All Other Designation
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> getAllThematic()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllThematic();
	}

	public static void clearService() {
		_service = null;
	}

	public static thematic_lkpLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					thematic_lkpLocalService.class.getName());

			if (invokableLocalService instanceof thematic_lkpLocalService) {
				_service = (thematic_lkpLocalService)invokableLocalService;
			}
			else {
				_service = new thematic_lkpLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(thematic_lkpLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(thematic_lkpLocalService service) {
	}

	private static thematic_lkpLocalService _service;
}