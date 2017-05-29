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
 * The utility for the iucn_region local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.iucn_regionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see iucn_regionLocalService
 * @see com.iucn.whp.dbservice.service.base.iucn_regionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.iucn_regionLocalServiceImpl
 * @generated
 */
public class iucn_regionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.iucn_regionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the iucn_region to the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region the iucn_region
	* @return the iucn_region that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region addiucn_region(
		com.iucn.whp.dbservice.model.iucn_region iucn_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addiucn_region(iucn_region);
	}

	/**
	* Creates a new iucn_region with the primary key. Does not add the iucn_region to the database.
	*
	* @param iucn_region_id the primary key for the new iucn_region
	* @return the new iucn_region
	*/
	public static com.iucn.whp.dbservice.model.iucn_region createiucn_region(
		int iucn_region_id) {
		return getService().createiucn_region(iucn_region_id);
	}

	/**
	* Deletes the iucn_region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region that was removed
	* @throws PortalException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region deleteiucn_region(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteiucn_region(iucn_region_id);
	}

	/**
	* Deletes the iucn_region from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region the iucn_region
	* @return the iucn_region that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region deleteiucn_region(
		com.iucn.whp.dbservice.model.iucn_region iucn_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteiucn_region(iucn_region);
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

	public static com.iucn.whp.dbservice.model.iucn_region fetchiucn_region(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchiucn_region(iucn_region_id);
	}

	/**
	* Returns the iucn_region with the primary key.
	*
	* @param iucn_region_id the primary key of the iucn_region
	* @return the iucn_region
	* @throws PortalException if a iucn_region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region getiucn_region(
		int iucn_region_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_region(iucn_region_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the iucn_regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_regions
	* @param end the upper bound of the range of iucn_regions (not inclusive)
	* @return the range of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> getiucn_regions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_regions(start, end);
	}

	/**
	* Returns the number of iucn_regions.
	*
	* @return the number of iucn_regions
	* @throws SystemException if a system exception occurred
	*/
	public static int getiucn_regionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_regionsCount();
	}

	/**
	* Updates the iucn_region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_region the iucn_region
	* @return the iucn_region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region updateiucn_region(
		com.iucn.whp.dbservice.model.iucn_region iucn_region)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateiucn_region(iucn_region);
	}

	/**
	* Updates the iucn_region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_region the iucn_region
	* @param merge whether to merge the iucn_region with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the iucn_region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_region updateiucn_region(
		com.iucn.whp.dbservice.model.iucn_region iucn_region, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateiucn_region(iucn_region, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.iucn_region> getAllRegionNames() {
		return getService().getAllRegionNames();
	}

	public static void clearService() {
		_service = null;
	}

	public static iucn_regionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					iucn_regionLocalService.class.getName());

			if (invokableLocalService instanceof iucn_regionLocalService) {
				_service = (iucn_regionLocalService)invokableLocalService;
			}
			else {
				_service = new iucn_regionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(iucn_regionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(iucn_regionLocalService service) {
	}

	private static iucn_regionLocalService _service;
}