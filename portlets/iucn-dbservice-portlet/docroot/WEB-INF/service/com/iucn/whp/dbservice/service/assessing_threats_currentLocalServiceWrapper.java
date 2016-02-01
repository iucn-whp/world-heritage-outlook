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
 * This class is a wrapper for {@link assessing_threats_currentLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessing_threats_currentLocalService
 * @generated
 */
public class assessing_threats_currentLocalServiceWrapper
	implements assessing_threats_currentLocalService,
		ServiceWrapper<assessing_threats_currentLocalService> {
	public assessing_threats_currentLocalServiceWrapper(
		assessing_threats_currentLocalService assessing_threats_currentLocalService) {
		_assessing_threats_currentLocalService = assessing_threats_currentLocalService;
	}

	/**
	* Adds the assessing_threats_current to the database. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current addassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.addassessing_threats_current(assessing_threats_current);
	}

	/**
	* Creates a new assessing_threats_current with the primary key. Does not add the assessing_threats_current to the database.
	*
	* @param current_threat_id the primary key for the new assessing_threats_current
	* @return the new assessing_threats_current
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current createassessing_threats_current(
		long current_threat_id) {
		return _assessing_threats_currentLocalService.createassessing_threats_current(current_threat_id);
	}

	/**
	* Deletes the assessing_threats_current with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current that was removed
	* @throws PortalException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current deleteassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.deleteassessing_threats_current(current_threat_id);
	}

	/**
	* Deletes the assessing_threats_current from the database. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current deleteassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.deleteassessing_threats_current(assessing_threats_current);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessing_threats_currentLocalService.dynamicQuery();
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
		return _assessing_threats_currentLocalService.dynamicQuery(dynamicQuery);
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
		return _assessing_threats_currentLocalService.dynamicQuery(dynamicQuery,
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
		return _assessing_threats_currentLocalService.dynamicQuery(dynamicQuery,
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
		return _assessing_threats_currentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.assessing_threats_current fetchassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.fetchassessing_threats_current(current_threat_id);
	}

	/**
	* Returns the assessing_threats_current with the primary key.
	*
	* @param current_threat_id the primary key of the assessing_threats_current
	* @return the assessing_threats_current
	* @throws PortalException if a assessing_threats_current with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current getassessing_threats_current(
		long current_threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.getassessing_threats_current(current_threat_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessing_threats_currents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessing_threats_currents
	* @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	* @return the range of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.getassessing_threats_currents(start,
			end);
	}

	/**
	* Returns the number of assessing_threats_currents.
	*
	* @return the number of assessing_threats_currents
	* @throws SystemException if a system exception occurred
	*/
	public int getassessing_threats_currentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.getassessing_threats_currentsCount();
	}

	/**
	* Updates the assessing_threats_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @return the assessing_threats_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current updateassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.updateassessing_threats_current(assessing_threats_current);
	}

	/**
	* Updates the assessing_threats_current in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessing_threats_current the assessing_threats_current
	* @param merge whether to merge the assessing_threats_current with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessing_threats_current that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.assessing_threats_current updateassessing_threats_current(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.updateassessing_threats_current(assessing_threats_current,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _assessing_threats_currentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessing_threats_currentLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessing_threats_currentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getEntriesByAssessment_versionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessing_threats_currentLocalService.getEntriesByAssessment_versionId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public assessing_threats_currentLocalService getWrappedassessing_threats_currentLocalService() {
		return _assessing_threats_currentLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedassessing_threats_currentLocalService(
		assessing_threats_currentLocalService assessing_threats_currentLocalService) {
		_assessing_threats_currentLocalService = assessing_threats_currentLocalService;
	}

	public assessing_threats_currentLocalService getWrappedService() {
		return _assessing_threats_currentLocalService;
	}

	public void setWrappedService(
		assessing_threats_currentLocalService assessing_threats_currentLocalService) {
		_assessing_threats_currentLocalService = assessing_threats_currentLocalService;
	}

	private assessing_threats_currentLocalService _assessing_threats_currentLocalService;
}