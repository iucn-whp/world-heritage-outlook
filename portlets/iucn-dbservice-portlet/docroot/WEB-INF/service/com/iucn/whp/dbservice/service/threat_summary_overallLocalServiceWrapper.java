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
 * This class is a wrapper for {@link threat_summary_overallLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_summary_overallLocalService
 * @generated
 */
public class threat_summary_overallLocalServiceWrapper
	implements threat_summary_overallLocalService,
		ServiceWrapper<threat_summary_overallLocalService> {
	public threat_summary_overallLocalServiceWrapper(
		threat_summary_overallLocalService threat_summary_overallLocalService) {
		_threat_summary_overallLocalService = threat_summary_overallLocalService;
	}

	/**
	* Adds the threat_summary_overall to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_overall the threat_summary_overall
	* @return the threat_summary_overall that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall addthreat_summary_overall(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.addthreat_summary_overall(threat_summary_overall);
	}

	/**
	* Creates a new threat_summary_overall with the primary key. Does not add the threat_summary_overall to the database.
	*
	* @param threat_sum_overall_id the primary key for the new threat_summary_overall
	* @return the new threat_summary_overall
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall createthreat_summary_overall(
		long threat_sum_overall_id) {
		return _threat_summary_overallLocalService.createthreat_summary_overall(threat_sum_overall_id);
	}

	/**
	* Deletes the threat_summary_overall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_sum_overall_id the primary key of the threat_summary_overall
	* @return the threat_summary_overall that was removed
	* @throws PortalException if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall deletethreat_summary_overall(
		long threat_sum_overall_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.deletethreat_summary_overall(threat_sum_overall_id);
	}

	/**
	* Deletes the threat_summary_overall from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_overall the threat_summary_overall
	* @return the threat_summary_overall that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall deletethreat_summary_overall(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.deletethreat_summary_overall(threat_summary_overall);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _threat_summary_overallLocalService.dynamicQuery();
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
		return _threat_summary_overallLocalService.dynamicQuery(dynamicQuery);
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
		return _threat_summary_overallLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_summary_overallLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_summary_overallLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.threat_summary_overall fetchthreat_summary_overall(
		long threat_sum_overall_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.fetchthreat_summary_overall(threat_sum_overall_id);
	}

	/**
	* Returns the threat_summary_overall with the primary key.
	*
	* @param threat_sum_overall_id the primary key of the threat_summary_overall
	* @return the threat_summary_overall
	* @throws PortalException if a threat_summary_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall getthreat_summary_overall(
		long threat_sum_overall_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.getthreat_summary_overall(threat_sum_overall_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_summary_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_overalls
	* @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	* @return the range of threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.getthreat_summary_overalls(start,
			end);
	}

	/**
	* Returns the number of threat_summary_overalls.
	*
	* @return the number of threat_summary_overalls
	* @throws SystemException if a system exception occurred
	*/
	public int getthreat_summary_overallsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.getthreat_summary_overallsCount();
	}

	/**
	* Updates the threat_summary_overall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_overall the threat_summary_overall
	* @return the threat_summary_overall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall updatethreat_summary_overall(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.updatethreat_summary_overall(threat_summary_overall);
	}

	/**
	* Updates the threat_summary_overall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_overall the threat_summary_overall
	* @param merge whether to merge the threat_summary_overall with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_summary_overall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_overall updatethreat_summary_overall(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.updatethreat_summary_overall(threat_summary_overall,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _threat_summary_overallLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_threat_summary_overallLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _threat_summary_overallLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreatoverallByAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_overallLocalService.getthreatoverallByAssessmentId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public threat_summary_overallLocalService getWrappedthreat_summary_overallLocalService() {
		return _threat_summary_overallLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthreat_summary_overallLocalService(
		threat_summary_overallLocalService threat_summary_overallLocalService) {
		_threat_summary_overallLocalService = threat_summary_overallLocalService;
	}

	public threat_summary_overallLocalService getWrappedService() {
		return _threat_summary_overallLocalService;
	}

	public void setWrappedService(
		threat_summary_overallLocalService threat_summary_overallLocalService) {
		_threat_summary_overallLocalService = threat_summary_overallLocalService;
	}

	private threat_summary_overallLocalService _threat_summary_overallLocalService;
}