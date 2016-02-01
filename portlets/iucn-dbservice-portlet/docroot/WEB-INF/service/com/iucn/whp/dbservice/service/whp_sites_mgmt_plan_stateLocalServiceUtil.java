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
 * The utility for the whp_sites_mgmt_plan_state local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_sites_mgmt_plan_stateLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_mgmt_plan_stateLocalService
 * @see com.iucn.whp.dbservice.service.base.whp_sites_mgmt_plan_stateLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sites_mgmt_plan_stateLocalServiceImpl
 * @generated
 */
public class whp_sites_mgmt_plan_stateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sites_mgmt_plan_stateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the whp_sites_mgmt_plan_state to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state addwhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
	}

	/**
	* Creates a new whp_sites_mgmt_plan_state with the primary key. Does not add the whp_sites_mgmt_plan_state to the database.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key for the new whp_sites_mgmt_plan_state
	* @return the new whp_sites_mgmt_plan_state
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state createwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id) {
		return getService()
				   .createwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Deletes the whp_sites_mgmt_plan_state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key of the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was removed
	* @throws PortalException if a whp_sites_mgmt_plan_state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state deletewhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Deletes the whp_sites_mgmt_plan_state from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state deletewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
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

	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state fetchwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	/**
	* Returns the whp_sites_mgmt_plan_state with the primary key.
	*
	* @param whp_sites_mgmt_plan_state_id the primary key of the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state
	* @throws PortalException if a whp_sites_mgmt_plan_state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state getwhp_sites_mgmt_plan_state(
		long whp_sites_mgmt_plan_state_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getwhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_mgmt_plan_states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_mgmt_plan_states
	* @param end the upper bound of the range of whp_sites_mgmt_plan_states (not inclusive)
	* @return the range of whp_sites_mgmt_plan_states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_mgmt_plan_states(start, end);
	}

	/**
	* Returns the number of whp_sites_mgmt_plan_states.
	*
	* @return the number of whp_sites_mgmt_plan_states
	* @throws SystemException if a system exception occurred
	*/
	public static int getwhp_sites_mgmt_plan_statesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_mgmt_plan_statesCount();
	}

	/**
	* Updates the whp_sites_mgmt_plan_state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @return the whp_sites_mgmt_plan_state that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state updatewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state);
	}

	/**
	* Updates the whp_sites_mgmt_plan_state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_mgmt_plan_state the whp_sites_mgmt_plan_state
	* @param merge whether to merge the whp_sites_mgmt_plan_state with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_mgmt_plan_state that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state updatewhp_sites_mgmt_plan_state(
		com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state whp_sites_mgmt_plan_state,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatewhp_sites_mgmt_plan_state(whp_sites_mgmt_plan_state,
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

	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state addwhp_sites_mgmt_plan_state(
		long siteid, java.lang.String doclink, java.util.Date date_published,
		long fileentryid, java.lang.String docName) {
		return getService()
				   .addwhp_sites_mgmt_plan_state(siteid, doclink,
			date_published, fileentryid, docName);
	}

	public static com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state removewhp_sites_mgmt_plan_state(
		long fileentryid) {
		return getService().removewhp_sites_mgmt_plan_state(fileentryid);
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_sites_mgmt_plan_stateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_sites_mgmt_plan_stateLocalService.class.getName());

			if (invokableLocalService instanceof whp_sites_mgmt_plan_stateLocalService) {
				_service = (whp_sites_mgmt_plan_stateLocalService)invokableLocalService;
			}
			else {
				_service = new whp_sites_mgmt_plan_stateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(whp_sites_mgmt_plan_stateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_sites_mgmt_plan_stateLocalService service) {
	}

	private static whp_sites_mgmt_plan_stateLocalService _service;
}