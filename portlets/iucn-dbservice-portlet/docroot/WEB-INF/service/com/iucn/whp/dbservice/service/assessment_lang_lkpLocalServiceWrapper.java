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
 * This class is a wrapper for {@link assessment_lang_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_lang_lkpLocalService
 * @generated
 */
public class assessment_lang_lkpLocalServiceWrapper
	implements assessment_lang_lkpLocalService,
		ServiceWrapper<assessment_lang_lkpLocalService> {
	public assessment_lang_lkpLocalServiceWrapper(
		assessment_lang_lkpLocalService assessment_lang_lkpLocalService) {
		_assessment_lang_lkpLocalService = assessment_lang_lkpLocalService;
	}

	/**
	* Adds the assessment_lang_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	* @return the assessment_lang_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp addassessment_lang_lkp(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.addassessment_lang_lkp(assessment_lang_lkp);
	}

	/**
	* Creates a new assessment_lang_lkp with the primary key. Does not add the assessment_lang_lkp to the database.
	*
	* @param languageid the primary key for the new assessment_lang_lkp
	* @return the new assessment_lang_lkp
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp createassessment_lang_lkp(
		long languageid) {
		return _assessment_lang_lkpLocalService.createassessment_lang_lkp(languageid);
	}

	/**
	* Deletes the assessment_lang_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp that was removed
	* @throws PortalException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp deleteassessment_lang_lkp(
		long languageid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.deleteassessment_lang_lkp(languageid);
	}

	/**
	* Deletes the assessment_lang_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	* @return the assessment_lang_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp deleteassessment_lang_lkp(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.deleteassessment_lang_lkp(assessment_lang_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessment_lang_lkpLocalService.dynamicQuery();
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
		return _assessment_lang_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _assessment_lang_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _assessment_lang_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _assessment_lang_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.assessment_lang_lkp fetchassessment_lang_lkp(
		long languageid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.fetchassessment_lang_lkp(languageid);
	}

	/**
	* Returns the assessment_lang_lkp with the primary key.
	*
	* @param languageid the primary key of the assessment_lang_lkp
	* @return the assessment_lang_lkp
	* @throws PortalException if a assessment_lang_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp getassessment_lang_lkp(
		long languageid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.getassessment_lang_lkp(languageid);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment_lang_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_lang_lkps
	* @param end the upper bound of the range of assessment_lang_lkps (not inclusive)
	* @return the range of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> getassessment_lang_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.getassessment_lang_lkps(start,
			end);
	}

	/**
	* Returns the number of assessment_lang_lkps.
	*
	* @return the number of assessment_lang_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getassessment_lang_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.getassessment_lang_lkpsCount();
	}

	/**
	* Updates the assessment_lang_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	* @return the assessment_lang_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp updateassessment_lang_lkp(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.updateassessment_lang_lkp(assessment_lang_lkp);
	}

	/**
	* Updates the assessment_lang_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_lang_lkp the assessment_lang_lkp
	* @param merge whether to merge the assessment_lang_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessment_lang_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_lang_lkp updateassessment_lang_lkp(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.updateassessment_lang_lkp(assessment_lang_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _assessment_lang_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessment_lang_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessment_lang_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessment_lang_lkp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_lang_lkpLocalService.findAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public assessment_lang_lkpLocalService getWrappedassessment_lang_lkpLocalService() {
		return _assessment_lang_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedassessment_lang_lkpLocalService(
		assessment_lang_lkpLocalService assessment_lang_lkpLocalService) {
		_assessment_lang_lkpLocalService = assessment_lang_lkpLocalService;
	}

	public assessment_lang_lkpLocalService getWrappedService() {
		return _assessment_lang_lkpLocalService;
	}

	public void setWrappedService(
		assessment_lang_lkpLocalService assessment_lang_lkpLocalService) {
		_assessment_lang_lkpLocalService = assessment_lang_lkpLocalService;
	}

	private assessment_lang_lkpLocalService _assessment_lang_lkpLocalService;
}