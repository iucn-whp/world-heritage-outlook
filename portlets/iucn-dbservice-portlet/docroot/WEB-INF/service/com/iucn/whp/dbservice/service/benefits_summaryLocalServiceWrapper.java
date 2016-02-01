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
 * This class is a wrapper for {@link benefits_summaryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefits_summaryLocalService
 * @generated
 */
public class benefits_summaryLocalServiceWrapper
	implements benefits_summaryLocalService,
		ServiceWrapper<benefits_summaryLocalService> {
	public benefits_summaryLocalServiceWrapper(
		benefits_summaryLocalService benefits_summaryLocalService) {
		_benefits_summaryLocalService = benefits_summaryLocalService;
	}

	/**
	* Adds the benefits_summary to the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary addbenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.addbenefits_summary(benefits_summary);
	}

	/**
	* Creates a new benefits_summary with the primary key. Does not add the benefits_summary to the database.
	*
	* @param benefits_summary_id the primary key for the new benefits_summary
	* @return the new benefits_summary
	*/
	public com.iucn.whp.dbservice.model.benefits_summary createbenefits_summary(
		long benefits_summary_id) {
		return _benefits_summaryLocalService.createbenefits_summary(benefits_summary_id);
	}

	/**
	* Deletes the benefits_summary with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary that was removed
	* @throws PortalException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary deletebenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.deletebenefits_summary(benefits_summary_id);
	}

	/**
	* Deletes the benefits_summary from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary deletebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.deletebenefits_summary(benefits_summary);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefits_summaryLocalService.dynamicQuery();
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
		return _benefits_summaryLocalService.dynamicQuery(dynamicQuery);
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
		return _benefits_summaryLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _benefits_summaryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _benefits_summaryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.benefits_summary fetchbenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.fetchbenefits_summary(benefits_summary_id);
	}

	/**
	* Returns the benefits_summary with the primary key.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary
	* @throws PortalException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary getbenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.getbenefits_summary(benefits_summary_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefits_summaries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @return the range of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.getbenefits_summaries(start, end);
	}

	/**
	* Returns the number of benefits_summaries.
	*
	* @return the number of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefits_summariesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.getbenefits_summariesCount();
	}

	/**
	* Updates the benefits_summary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary updatebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.updatebenefits_summary(benefits_summary);
	}

	/**
	* Updates the benefits_summary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @param merge whether to merge the benefits_summary with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefits_summary that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_summary updatebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.updatebenefits_summary(benefits_summary,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _benefits_summaryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_benefits_summaryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _benefits_summaryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getEntriesFromAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_summaryLocalService.getEntriesFromAssessmentId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public benefits_summaryLocalService getWrappedbenefits_summaryLocalService() {
		return _benefits_summaryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbenefits_summaryLocalService(
		benefits_summaryLocalService benefits_summaryLocalService) {
		_benefits_summaryLocalService = benefits_summaryLocalService;
	}

	public benefits_summaryLocalService getWrappedService() {
		return _benefits_summaryLocalService;
	}

	public void setWrappedService(
		benefits_summaryLocalService benefits_summaryLocalService) {
		_benefits_summaryLocalService = benefits_summaryLocalService;
	}

	private benefits_summaryLocalService _benefits_summaryLocalService;
}