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
 * This class is a wrapper for {@link effective_prot_mgmt_iothreatsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       effective_prot_mgmt_iothreatsLocalService
 * @generated
 */
public class effective_prot_mgmt_iothreatsLocalServiceWrapper
	implements effective_prot_mgmt_iothreatsLocalService,
		ServiceWrapper<effective_prot_mgmt_iothreatsLocalService> {
	public effective_prot_mgmt_iothreatsLocalServiceWrapper(
		effective_prot_mgmt_iothreatsLocalService effective_prot_mgmt_iothreatsLocalService) {
		_effective_prot_mgmt_iothreatsLocalService = effective_prot_mgmt_iothreatsLocalService;
	}

	/**
	* Adds the effective_prot_mgmt_iothreats to the database. Also notifies the appropriate model listeners.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats addeffective_prot_mgmt_iothreats(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.addeffective_prot_mgmt_iothreats(effective_prot_mgmt_iothreats);
	}

	/**
	* Creates a new effective_prot_mgmt_iothreats with the primary key. Does not add the effective_prot_mgmt_iothreats to the database.
	*
	* @param id the primary key for the new effective_prot_mgmt_iothreats
	* @return the new effective_prot_mgmt_iothreats
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats createeffective_prot_mgmt_iothreats(
		long id) {
		return _effective_prot_mgmt_iothreatsLocalService.createeffective_prot_mgmt_iothreats(id);
	}

	/**
	* Deletes the effective_prot_mgmt_iothreats with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was removed
	* @throws PortalException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats deleteeffective_prot_mgmt_iothreats(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.deleteeffective_prot_mgmt_iothreats(id);
	}

	/**
	* Deletes the effective_prot_mgmt_iothreats from the database. Also notifies the appropriate model listeners.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats deleteeffective_prot_mgmt_iothreats(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.deleteeffective_prot_mgmt_iothreats(effective_prot_mgmt_iothreats);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _effective_prot_mgmt_iothreatsLocalService.dynamicQuery();
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
		return _effective_prot_mgmt_iothreatsLocalService.dynamicQuery(dynamicQuery);
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
		return _effective_prot_mgmt_iothreatsLocalService.dynamicQuery(dynamicQuery,
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
		return _effective_prot_mgmt_iothreatsLocalService.dynamicQuery(dynamicQuery,
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
		return _effective_prot_mgmt_iothreatsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats fetcheffective_prot_mgmt_iothreats(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.fetcheffective_prot_mgmt_iothreats(id);
	}

	/**
	* Returns the effective_prot_mgmt_iothreats with the primary key.
	*
	* @param id the primary key of the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats
	* @throws PortalException if a effective_prot_mgmt_iothreats with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats geteffective_prot_mgmt_iothreats(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.geteffective_prot_mgmt_iothreats(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the effective_prot_mgmt_iothreatses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of effective_prot_mgmt_iothreatses
	* @param end the upper bound of the range of effective_prot_mgmt_iothreatses (not inclusive)
	* @return the range of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.geteffective_prot_mgmt_iothreatses(start,
			end);
	}

	/**
	* Returns the number of effective_prot_mgmt_iothreatses.
	*
	* @return the number of effective_prot_mgmt_iothreatses
	* @throws SystemException if a system exception occurred
	*/
	public int geteffective_prot_mgmt_iothreatsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.geteffective_prot_mgmt_iothreatsesCount();
	}

	/**
	* Updates the effective_prot_mgmt_iothreats in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	* @return the effective_prot_mgmt_iothreats that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats updateeffective_prot_mgmt_iothreats(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.updateeffective_prot_mgmt_iothreats(effective_prot_mgmt_iothreats);
	}

	/**
	* Updates the effective_prot_mgmt_iothreats in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param effective_prot_mgmt_iothreats the effective_prot_mgmt_iothreats
	* @param merge whether to merge the effective_prot_mgmt_iothreats with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the effective_prot_mgmt_iothreats that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats updateeffective_prot_mgmt_iothreats(
		com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.updateeffective_prot_mgmt_iothreats(effective_prot_mgmt_iothreats,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _effective_prot_mgmt_iothreatsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_effective_prot_mgmt_iothreatsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _effective_prot_mgmt_iothreatsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffectivemanagthreatByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.geteffectivemanagthreatByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.protection_management_ratings_lkp> getprotectingmanagmentrating()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _effective_prot_mgmt_iothreatsLocalService.getprotectingmanagmentrating();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public effective_prot_mgmt_iothreatsLocalService getWrappedeffective_prot_mgmt_iothreatsLocalService() {
		return _effective_prot_mgmt_iothreatsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedeffective_prot_mgmt_iothreatsLocalService(
		effective_prot_mgmt_iothreatsLocalService effective_prot_mgmt_iothreatsLocalService) {
		_effective_prot_mgmt_iothreatsLocalService = effective_prot_mgmt_iothreatsLocalService;
	}

	public effective_prot_mgmt_iothreatsLocalService getWrappedService() {
		return _effective_prot_mgmt_iothreatsLocalService;
	}

	public void setWrappedService(
		effective_prot_mgmt_iothreatsLocalService effective_prot_mgmt_iothreatsLocalService) {
		_effective_prot_mgmt_iothreatsLocalService = effective_prot_mgmt_iothreatsLocalService;
	}

	private effective_prot_mgmt_iothreatsLocalService _effective_prot_mgmt_iothreatsLocalService;
}