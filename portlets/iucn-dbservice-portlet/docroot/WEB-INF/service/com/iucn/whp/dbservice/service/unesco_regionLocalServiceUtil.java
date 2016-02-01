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
 * The utility for the unesco_region local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.unesco_regionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see unesco_regionLocalService
 * @see com.iucn.whp.dbservice.service.base.unesco_regionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.unesco_regionLocalServiceImpl
 * @generated
 */
public class unesco_regionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.unesco_regionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the unesco_region to the database. Also notifies the appropriate model listeners.
	*
	* @param unesco_region the unesco_region
	* @return the unesco_region that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region addunesco_region(
		com.iucn.whp.dbservice.model.unesco_region unesco_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addunesco_region(unesco_region);
	}

	/**
	* Creates a new unesco_region with the primary key. Does not add the unesco_region to the database.
	*
	* @param unesco_region_id the primary key for the new unesco_region
	* @return the new unesco_region
	*/
	public static com.iucn.whp.dbservice.model.unesco_region createunesco_region(
		int unesco_region_id) {
		return getService().createunesco_region(unesco_region_id);
	}

	/**
	* Deletes the unesco_region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param unesco_region_id the primary key of the unesco_region
	* @return the unesco_region that was removed
	* @throws PortalException if a unesco_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region deleteunesco_region(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteunesco_region(unesco_region_id);
	}

	/**
	* Deletes the unesco_region from the database. Also notifies the appropriate model listeners.
	*
	* @param unesco_region the unesco_region
	* @return the unesco_region that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region deleteunesco_region(
		com.iucn.whp.dbservice.model.unesco_region unesco_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteunesco_region(unesco_region);
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

	public static com.iucn.whp.dbservice.model.unesco_region fetchunesco_region(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchunesco_region(unesco_region_id);
	}

	/**
	* Returns the unesco_region with the primary key.
	*
	* @param unesco_region_id the primary key of the unesco_region
	* @return the unesco_region
	* @throws PortalException if a unesco_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region getunesco_region(
		int unesco_region_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getunesco_region(unesco_region_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the unesco_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of unesco_regions
	* @param end the upper bound of the range of unesco_regions (not inclusive)
	* @return the range of unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region> getunesco_regions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getunesco_regions(start, end);
	}

	/**
	* Returns the number of unesco_regions.
	*
	* @return the number of unesco_regions
	* @throws SystemException if a system exception occurred
	*/
	public static int getunesco_regionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getunesco_regionsCount();
	}

	/**
	* Updates the unesco_region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param unesco_region the unesco_region
	* @return the unesco_region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region updateunesco_region(
		com.iucn.whp.dbservice.model.unesco_region unesco_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateunesco_region(unesco_region);
	}

	/**
	* Updates the unesco_region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param unesco_region the unesco_region
	* @param merge whether to merge the unesco_region with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the unesco_region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.unesco_region updateunesco_region(
		com.iucn.whp.dbservice.model.unesco_region unesco_region, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateunesco_region(unesco_region, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.unesco_region> getAllRegionNames() {
		return getService().getAllRegionNames();
	}

	public static void clearService() {
		_service = null;
	}

	public static unesco_regionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					unesco_regionLocalService.class.getName());

			if (invokableLocalService instanceof unesco_regionLocalService) {
				_service = (unesco_regionLocalService)invokableLocalService;
			}
			else {
				_service = new unesco_regionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(unesco_regionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(unesco_regionLocalService service) {
	}

	private static unesco_regionLocalService _service;
}