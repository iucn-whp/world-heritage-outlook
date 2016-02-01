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
 * The utility for the assessment_stages local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.assessment_stagesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see assessment_stagesLocalService
 * @see com.iucn.whp.dbservice.service.base.assessment_stagesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.assessment_stagesLocalServiceImpl
 * @generated
 */
public class assessment_stagesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.assessment_stagesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessment_stages to the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_stages the assessment_stages
	* @return the assessment_stages that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages addassessment_stages(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addassessment_stages(assessment_stages);
	}

	/**
	* Creates a new assessment_stages with the primary key. Does not add the assessment_stages to the database.
	*
	* @param stageid the primary key for the new assessment_stages
	* @return the new assessment_stages
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages createassessment_stages(
		long stageid) {
		return getService().createassessment_stages(stageid);
	}

	/**
	* Deletes the assessment_stages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages that was removed
	* @throws PortalException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages deleteassessment_stages(
		long stageid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteassessment_stages(stageid);
	}

	/**
	* Deletes the assessment_stages from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_stages the assessment_stages
	* @return the assessment_stages that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages deleteassessment_stages(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteassessment_stages(assessment_stages);
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

	public static com.iucn.whp.dbservice.model.assessment_stages fetchassessment_stages(
		long stageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchassessment_stages(stageid);
	}

	/**
	* Returns the assessment_stages with the primary key.
	*
	* @param stageid the primary key of the assessment_stages
	* @return the assessment_stages
	* @throws PortalException if a assessment_stages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages getassessment_stages(
		long stageid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_stages(stageid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment_stageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_stageses
	* @param end the upper bound of the range of assessment_stageses (not inclusive)
	* @return the range of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_stages> getassessment_stageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_stageses(start, end);
	}

	/**
	* Returns the number of assessment_stageses.
	*
	* @return the number of assessment_stageses
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessment_stagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_stagesesCount();
	}

	/**
	* Updates the assessment_stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_stages the assessment_stages
	* @return the assessment_stages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages updateassessment_stages(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateassessment_stages(assessment_stages);
	}

	/**
	* Updates the assessment_stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_stages the assessment_stages
	* @param merge whether to merge the assessment_stages with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessment_stages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_stages updateassessment_stages(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateassessment_stages(assessment_stages, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.assessment_stages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static assessment_stagesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					assessment_stagesLocalService.class.getName());

			if (invokableLocalService instanceof assessment_stagesLocalService) {
				_service = (assessment_stagesLocalService)invokableLocalService;
			}
			else {
				_service = new assessment_stagesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(assessment_stagesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(assessment_stagesLocalService service) {
	}

	private static assessment_stagesLocalService _service;
}