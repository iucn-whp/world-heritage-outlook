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
 * The utility for the sites_thematic local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.sites_thematicLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see sites_thematicLocalService
 * @see com.iucn.whp.dbservice.service.base.sites_thematicLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.sites_thematicLocalServiceImpl
 * @generated
 */
public class sites_thematicLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.sites_thematicLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the sites_thematic to the database. Also notifies the appropriate model listeners.
	*
	* @param sites_thematic the sites_thematic
	* @return the sites_thematic that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic addsites_thematic(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addsites_thematic(sites_thematic);
	}

	/**
	* Creates a new sites_thematic with the primary key. Does not add the sites_thematic to the database.
	*
	* @param sitethematicid the primary key for the new sites_thematic
	* @return the new sites_thematic
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic createsites_thematic(
		long sitethematicid) {
		return getService().createsites_thematic(sitethematicid);
	}

	/**
	* Deletes the sites_thematic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic that was removed
	* @throws PortalException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic deletesites_thematic(
		long sitethematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesites_thematic(sitethematicid);
	}

	/**
	* Deletes the sites_thematic from the database. Also notifies the appropriate model listeners.
	*
	* @param sites_thematic the sites_thematic
	* @return the sites_thematic that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic deletesites_thematic(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesites_thematic(sites_thematic);
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

	public static com.iucn.whp.dbservice.model.sites_thematic fetchsites_thematic(
		long sitethematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchsites_thematic(sitethematicid);
	}

	/**
	* Returns the sites_thematic with the primary key.
	*
	* @param sitethematicid the primary key of the sites_thematic
	* @return the sites_thematic
	* @throws PortalException if a sites_thematic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic getsites_thematic(
		long sitethematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getsites_thematic(sitethematicid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sites_thematics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sites_thematics
	* @param end the upper bound of the range of sites_thematics (not inclusive)
	* @return the range of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> getsites_thematics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsites_thematics(start, end);
	}

	/**
	* Returns the number of sites_thematics.
	*
	* @return the number of sites_thematics
	* @throws SystemException if a system exception occurred
	*/
	public static int getsites_thematicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsites_thematicsCount();
	}

	/**
	* Updates the sites_thematic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sites_thematic the sites_thematic
	* @return the sites_thematic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic updatesites_thematic(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesites_thematic(sites_thematic);
	}

	/**
	* Updates the sites_thematic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sites_thematic the sites_thematic
	* @param merge whether to merge the sites_thematic with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the sites_thematic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.sites_thematic updatesites_thematic(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesites_thematic(sites_thematic, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.sites_thematic> getSitesThematicBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSitesThematicBySiteId(siteId);
	}

	public static void clearService() {
		_service = null;
	}

	public static sites_thematicLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					sites_thematicLocalService.class.getName());

			if (invokableLocalService instanceof sites_thematicLocalService) {
				_service = (sites_thematicLocalService)invokableLocalService;
			}
			else {
				_service = new sites_thematicLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(sites_thematicLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(sites_thematicLocalService service) {
	}

	private static sites_thematicLocalService _service;
}