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
 * This class is a wrapper for {@link assessment_whvalues_whcriterionLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_whvalues_whcriterionLocalService
 * @generated
 */
public class assessment_whvalues_whcriterionLocalServiceWrapper
	implements assessment_whvalues_whcriterionLocalService,
		ServiceWrapper<assessment_whvalues_whcriterionLocalService> {
	public assessment_whvalues_whcriterionLocalServiceWrapper(
		assessment_whvalues_whcriterionLocalService assessment_whvalues_whcriterionLocalService) {
		_assessment_whvalues_whcriterionLocalService = assessment_whvalues_whcriterionLocalService;
	}

	/**
	* Adds the assessment_whvalues_whcriterion to the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion addassessment_whvalues_whcriterion(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.addassessment_whvalues_whcriterion(assessment_whvalues_whcriterion);
	}

	/**
	* Creates a new assessment_whvalues_whcriterion with the primary key. Does not add the assessment_whvalues_whcriterion to the database.
	*
	* @param wh_criteria_id the primary key for the new assessment_whvalues_whcriterion
	* @return the new assessment_whvalues_whcriterion
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion createassessment_whvalues_whcriterion(
		long wh_criteria_id) {
		return _assessment_whvalues_whcriterionLocalService.createassessment_whvalues_whcriterion(wh_criteria_id);
	}

	/**
	* Deletes the assessment_whvalues_whcriterion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was removed
	* @throws PortalException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion deleteassessment_whvalues_whcriterion(
		long wh_criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.deleteassessment_whvalues_whcriterion(wh_criteria_id);
	}

	/**
	* Deletes the assessment_whvalues_whcriterion from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion deleteassessment_whvalues_whcriterion(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.deleteassessment_whvalues_whcriterion(assessment_whvalues_whcriterion);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessment_whvalues_whcriterionLocalService.dynamicQuery();
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
		return _assessment_whvalues_whcriterionLocalService.dynamicQuery(dynamicQuery);
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
		return _assessment_whvalues_whcriterionLocalService.dynamicQuery(dynamicQuery,
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
		return _assessment_whvalues_whcriterionLocalService.dynamicQuery(dynamicQuery,
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
		return _assessment_whvalues_whcriterionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion fetchassessment_whvalues_whcriterion(
		long wh_criteria_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.fetchassessment_whvalues_whcriterion(wh_criteria_id);
	}

	/**
	* Returns the assessment_whvalues_whcriterion with the primary key.
	*
	* @param wh_criteria_id the primary key of the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion
	* @throws PortalException if a assessment_whvalues_whcriterion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion getassessment_whvalues_whcriterion(
		long wh_criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.getassessment_whvalues_whcriterion(wh_criteria_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment_whvalues_whcriterions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_whvalues_whcriterions
	* @param end the upper bound of the range of assessment_whvalues_whcriterions (not inclusive)
	* @return the range of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.getassessment_whvalues_whcriterions(start,
			end);
	}

	/**
	* Returns the number of assessment_whvalues_whcriterions.
	*
	* @return the number of assessment_whvalues_whcriterions
	* @throws SystemException if a system exception occurred
	*/
	public int getassessment_whvalues_whcriterionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.getassessment_whvalues_whcriterionsCount();
	}

	/**
	* Updates the assessment_whvalues_whcriterion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	* @return the assessment_whvalues_whcriterion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion updateassessment_whvalues_whcriterion(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.updateassessment_whvalues_whcriterion(assessment_whvalues_whcriterion);
	}

	/**
	* Updates the assessment_whvalues_whcriterion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_whvalues_whcriterion the assessment_whvalues_whcriterion
	* @param merge whether to merge the assessment_whvalues_whcriterion with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessment_whvalues_whcriterion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion updateassessment_whvalues_whcriterion(
		com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion assessment_whvalues_whcriterion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.updateassessment_whvalues_whcriterion(assessment_whvalues_whcriterion,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _assessment_whvalues_whcriterionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessment_whvalues_whcriterionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessment_whvalues_whcriterionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getAssessment_whvalues_whcriterionsBywhValue(
		long whValueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessment_whvalues_whcriterionLocalService.getAssessment_whvalues_whcriterionsBywhValue(whValueId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public assessment_whvalues_whcriterionLocalService getWrappedassessment_whvalues_whcriterionLocalService() {
		return _assessment_whvalues_whcriterionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedassessment_whvalues_whcriterionLocalService(
		assessment_whvalues_whcriterionLocalService assessment_whvalues_whcriterionLocalService) {
		_assessment_whvalues_whcriterionLocalService = assessment_whvalues_whcriterionLocalService;
	}

	public assessment_whvalues_whcriterionLocalService getWrappedService() {
		return _assessment_whvalues_whcriterionLocalService;
	}

	public void setWrappedService(
		assessment_whvalues_whcriterionLocalService assessment_whvalues_whcriterionLocalService) {
		_assessment_whvalues_whcriterionLocalService = assessment_whvalues_whcriterionLocalService;
	}

	private assessment_whvalues_whcriterionLocalService _assessment_whvalues_whcriterionLocalService;
}