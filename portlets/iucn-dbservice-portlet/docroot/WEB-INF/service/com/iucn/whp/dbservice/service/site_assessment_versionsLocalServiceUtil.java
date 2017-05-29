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
 * The utility for the site_assessment_versions local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see site_assessment_versionsLocalService
 * @see com.iucn.whp.dbservice.service.base.site_assessment_versionsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl
 * @generated
 */
public class site_assessment_versionsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the site_assessment_versions to the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions addsite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addsite_assessment_versions(site_assessment_versions);
	}

	/**
	* Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	*
	* @param assessment_version_id the primary key for the new site_assessment_versions
	* @return the new site_assessment_versions
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions createsite_assessment_versions(
		long assessment_version_id) {
		return getService().createsite_assessment_versions(assessment_version_id);
	}

	/**
	* Deletes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws PortalException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions deletesite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesite_assessment_versions(assessment_version_id);
	}

	/**
	* Deletes the site_assessment_versions from the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions deletesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletesite_assessment_versions(site_assessment_versions);
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

	public static com.iucn.whp.dbservice.model.site_assessment_versions fetchsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchsite_assessment_versions(assessment_version_id);
	}

	/**
	* Returns the site_assessment_versions with the primary key.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions
	* @throws PortalException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions getsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessment_versions(assessment_version_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the site_assessment_versionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessment_versionses
	* @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	* @return the range of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessment_versionses(start, end);
	}

	/**
	* Returns the number of site_assessment_versionses.
	*
	* @return the number of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public static int getsite_assessment_versionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessment_versionsesCount();
	}

	/**
	* Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions updatesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatesite_assessment_versions(site_assessment_versions);
	}

	/**
	* Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @param merge whether to merge the site_assessment_versions with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the site_assessment_versions that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment_versions updatesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatesite_assessment_versions(site_assessment_versions,
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

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByUserId(
		long userId) {
		return getService().findByUserId(userId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessmentId) {
		return getService().findByAssessmentId(assessmentId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByPrevAssementCodeId(
		long assessmentId, java.lang.Double versionCode) {
		return getService().findByPrevAssementCodeId(assessmentId, versionCode);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findSite_assessment_versionsByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getService()
				   .findSite_assessment_versionsByCustomQuery(query, begin, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static site_assessment_versionsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					site_assessment_versionsLocalService.class.getName());

			if (invokableLocalService instanceof site_assessment_versionsLocalService) {
				_service = (site_assessment_versionsLocalService)invokableLocalService;
			}
			else {
				_service = new site_assessment_versionsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(site_assessment_versionsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(site_assessment_versionsLocalService service) {
	}

	private static site_assessment_versionsLocalService _service;
}