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
 * This class is a wrapper for {@link threat_summary_currentLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_summary_currentLocalService
 * @generated
 */
public class threat_summary_currentLocalServiceWrapper
	implements threat_summary_currentLocalService,
		ServiceWrapper<threat_summary_currentLocalService> {
	public threat_summary_currentLocalServiceWrapper(
		threat_summary_currentLocalService threat_summary_currentLocalService) {
		_threat_summary_currentLocalService = threat_summary_currentLocalService;
	}

	/**
	* Adds the threat_summary_current to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_current the threat_summary_current
	* @return the threat_summary_current that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current addthreat_summary_current(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.addthreat_summary_current(threat_summary_current);
	}

	/**
	* Creates a new threat_summary_current with the primary key. Does not add the threat_summary_current to the database.
	*
	* @param threat_sum_cur_id the primary key for the new threat_summary_current
	* @return the new threat_summary_current
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current createthreat_summary_current(
		long threat_sum_cur_id) {
		return _threat_summary_currentLocalService.createthreat_summary_current(threat_sum_cur_id);
	}

	/**
	* Deletes the threat_summary_current with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_sum_cur_id the primary key of the threat_summary_current
	* @return the threat_summary_current that was removed
	* @throws PortalException if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current deletethreat_summary_current(
		long threat_sum_cur_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.deletethreat_summary_current(threat_sum_cur_id);
	}

	/**
	* Deletes the threat_summary_current from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_current the threat_summary_current
	* @return the threat_summary_current that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current deletethreat_summary_current(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.deletethreat_summary_current(threat_summary_current);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _threat_summary_currentLocalService.dynamicQuery();
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
		return _threat_summary_currentLocalService.dynamicQuery(dynamicQuery);
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
		return _threat_summary_currentLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_summary_currentLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_summary_currentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.threat_summary_current fetchthreat_summary_current(
		long threat_sum_cur_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.fetchthreat_summary_current(threat_sum_cur_id);
	}

	/**
	* Returns the threat_summary_current with the primary key.
	*
	* @param threat_sum_cur_id the primary key of the threat_summary_current
	* @return the threat_summary_current
	* @throws PortalException if a threat_summary_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current getthreat_summary_current(
		long threat_sum_cur_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.getthreat_summary_current(threat_sum_cur_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_summary_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_summary_currents
	* @param end the upper bound of the range of threat_summary_currents (not inclusive)
	* @return the range of threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.getthreat_summary_currents(start,
			end);
	}

	/**
	* Returns the number of threat_summary_currents.
	*
	* @return the number of threat_summary_currents
	* @throws SystemException if a system exception occurred
	*/
	public int getthreat_summary_currentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.getthreat_summary_currentsCount();
	}

	/**
	* Updates the threat_summary_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_current the threat_summary_current
	* @return the threat_summary_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current updatethreat_summary_current(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.updatethreat_summary_current(threat_summary_current);
	}

	/**
	* Updates the threat_summary_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_summary_current the threat_summary_current
	* @param merge whether to merge the threat_summary_current with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_summary_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_summary_current updatethreat_summary_current(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.updatethreat_summary_current(threat_summary_current,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _threat_summary_currentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_threat_summary_currentLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _threat_summary_currentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currentByAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_summary_currentLocalService.getthreat_summary_currentByAssessmentId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public threat_summary_currentLocalService getWrappedthreat_summary_currentLocalService() {
		return _threat_summary_currentLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthreat_summary_currentLocalService(
		threat_summary_currentLocalService threat_summary_currentLocalService) {
		_threat_summary_currentLocalService = threat_summary_currentLocalService;
	}

	public threat_summary_currentLocalService getWrappedService() {
		return _threat_summary_currentLocalService;
	}

	public void setWrappedService(
		threat_summary_currentLocalService threat_summary_currentLocalService) {
		_threat_summary_currentLocalService = threat_summary_currentLocalService;
	}

	private threat_summary_currentLocalService _threat_summary_currentLocalService;
}