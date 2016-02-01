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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link site_assessment_versionsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       site_assessment_versionsLocalService
 * @generated
 */
public class site_assessment_versionsLocalServiceWrapper
	implements site_assessment_versionsLocalService,
		ServiceWrapper<site_assessment_versionsLocalService> {
	public site_assessment_versionsLocalServiceWrapper(
		site_assessment_versionsLocalService site_assessment_versionsLocalService) {
		_site_assessment_versionsLocalService = site_assessment_versionsLocalService;
	}

	/**
	* Adds the site_assessment_versions to the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions addsite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.addsite_assessment_versions(site_assessment_versions);
	}

	/**
	* Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	*
	* @param assessment_version_id the primary key for the new site_assessment_versions
	* @return the new site_assessment_versions
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions createsite_assessment_versions(
		long assessment_version_id) {
		return _site_assessment_versionsLocalService.createsite_assessment_versions(assessment_version_id);
	}

	/**
	* Deletes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws PortalException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions deletesite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.deletesite_assessment_versions(assessment_version_id);
	}

	/**
	* Deletes the site_assessment_versions from the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions deletesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.deletesite_assessment_versions(site_assessment_versions);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _site_assessment_versionsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.site_assessment_versions fetchsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.fetchsite_assessment_versions(assessment_version_id);
	}

	/**
	* Returns the site_assessment_versions with the primary key.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions
	* @throws PortalException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions getsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.getsite_assessment_versions(assessment_version_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.getsite_assessment_versionses(start,
			end);
	}

	/**
	* Returns the number of site_assessment_versionses.
	*
	* @return the number of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	public int getsite_assessment_versionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.getsite_assessment_versionsesCount();
	}

	/**
	* Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions updatesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.updatesite_assessment_versions(site_assessment_versions);
	}

	/**
	* Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @param merge whether to merge the site_assessment_versions with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the site_assessment_versions that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions updatesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessment_versionsLocalService.updatesite_assessment_versions(site_assessment_versions,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _site_assessment_versionsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_site_assessment_versionsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _site_assessment_versionsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByUserId(
		long userId) {
		return _site_assessment_versionsLocalService.findByUserId(userId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessmentId) {
		return _site_assessment_versionsLocalService.findByAssessmentId(assessmentId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByPrevAssementCodeId(
		long assessmentId, java.lang.Double versionCode) {
		return _site_assessment_versionsLocalService.findByPrevAssementCodeId(assessmentId,
			versionCode);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findSite_assessment_versionsByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException {
		return _site_assessment_versionsLocalService.findSite_assessment_versionsByCustomQuery(query,
			begin, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public site_assessment_versionsLocalService getWrappedsite_assessment_versionsLocalService() {
		return _site_assessment_versionsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedsite_assessment_versionsLocalService(
		site_assessment_versionsLocalService site_assessment_versionsLocalService) {
		_site_assessment_versionsLocalService = site_assessment_versionsLocalService;
	}

	public site_assessment_versionsLocalService getWrappedService() {
		return _site_assessment_versionsLocalService;
	}

	public void setWrappedService(
		site_assessment_versionsLocalService site_assessment_versionsLocalService) {
		_site_assessment_versionsLocalService = site_assessment_versionsLocalService;
	}

	private site_assessment_versionsLocalService _site_assessment_versionsLocalService;
}