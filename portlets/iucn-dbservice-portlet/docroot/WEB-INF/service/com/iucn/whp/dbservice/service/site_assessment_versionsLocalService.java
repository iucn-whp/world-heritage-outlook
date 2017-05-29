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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the site_assessment_versions local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see site_assessment_versionsLocalServiceUtil
 * @see com.iucn.whp.dbservice.service.base.site_assessment_versionsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface site_assessment_versionsLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link site_assessment_versionsLocalServiceUtil} to access the site_assessment_versions local service. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.site_assessment_versionsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the site_assessment_versions to the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions addsite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	*
	* @param assessment_version_id the primary key for the new site_assessment_versions
	* @return the new site_assessment_versions
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions createsite_assessment_versions(
		long assessment_version_id);

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
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the site_assessment_versions from the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions deletesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.site_assessment_versions fetchsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the site_assessment_versions with the primary key.
	*
	* @param assessment_version_id the primary key of the site_assessment_versions
	* @return the site_assessment_versions
	* @throws PortalException if a site_assessment_versions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.site_assessment_versions getsite_assessment_versions(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of site_assessment_versionses.
	*
	* @return the number of site_assessment_versionses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getsite_assessment_versionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the site_assessment_versions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment_versions the site_assessment_versions
	* @return the site_assessment_versions that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment_versions updatesite_assessment_versions(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByUserId(
		long userId);

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByAssessmentId(
		long assessmentId);

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findByPrevAssementCodeId(
		long assessmentId, java.lang.Double versionCode);

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment_versions> findSite_assessment_versionsByCustomQuery(
		java.lang.String query, int begin, int end)
		throws com.liferay.portal.SystemException;
}