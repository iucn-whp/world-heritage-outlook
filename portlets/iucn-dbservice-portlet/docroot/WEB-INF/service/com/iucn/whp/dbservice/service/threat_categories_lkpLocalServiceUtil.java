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
 * The utility for the threat_categories_lkp local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.threat_categories_lkpLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see threat_categories_lkpLocalService
 * @see com.iucn.whp.dbservice.service.base.threat_categories_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.threat_categories_lkpLocalServiceImpl
 * @generated
 */
public class threat_categories_lkpLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.threat_categories_lkpLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the threat_categories_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp addthreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addthreat_categories_lkp(threat_categories_lkp);
	}

	/**
	* Creates a new threat_categories_lkp with the primary key. Does not add the threat_categories_lkp to the database.
	*
	* @param threatCategoryid the primary key for the new threat_categories_lkp
	* @return the new threat_categories_lkp
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp createthreat_categories_lkp(
		long threatCategoryid) {
		return getService().createthreat_categories_lkp(threatCategoryid);
	}

	/**
	* Deletes the threat_categories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threatCategoryid the primary key of the threat_categories_lkp
	* @return the threat_categories_lkp that was removed
	* @throws PortalException if a threat_categories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp deletethreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletethreat_categories_lkp(threatCategoryid);
	}

	/**
	* Deletes the threat_categories_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp deletethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletethreat_categories_lkp(threat_categories_lkp);
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

	public static com.iucn.whp.dbservice.model.threat_categories_lkp fetchthreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchthreat_categories_lkp(threatCategoryid);
	}

	/**
	* Returns the threat_categories_lkp with the primary key.
	*
	* @param threatCategoryid the primary key of the threat_categories_lkp
	* @return the threat_categories_lkp
	* @throws PortalException if a threat_categories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp getthreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_categories_lkp(threatCategoryid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_categories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_categories_lkps
	* @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	* @return the range of threat_categories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.threat_categories_lkp> getthreat_categories_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_categories_lkps(start, end);
	}

	/**
	* Returns the number of threat_categories_lkps.
	*
	* @return the number of threat_categories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int getthreat_categories_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getthreat_categories_lkpsCount();
	}

	/**
	* Updates the threat_categories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp updatethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatethreat_categories_lkp(threat_categories_lkp);
	}

	/**
	* Updates the threat_categories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @param merge whether to merge the threat_categories_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_categories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.threat_categories_lkp updatethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatethreat_categories_lkp(threat_categories_lkp, merge);
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

	public static threat_categories_lkpLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					threat_categories_lkpLocalService.class.getName());

			if (invokableLocalService instanceof threat_categories_lkpLocalService) {
				_service = (threat_categories_lkpLocalService)invokableLocalService;
			}
			else {
				_service = new threat_categories_lkpLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(threat_categories_lkpLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(threat_categories_lkpLocalService service) {
	}

	private static threat_categories_lkpLocalService _service;
}