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
 * This class is a wrapper for {@link prot_mgmt_overallLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       prot_mgmt_overallLocalService
 * @generated
 */
public class prot_mgmt_overallLocalServiceWrapper
	implements prot_mgmt_overallLocalService,
		ServiceWrapper<prot_mgmt_overallLocalService> {
	public prot_mgmt_overallLocalServiceWrapper(
		prot_mgmt_overallLocalService prot_mgmt_overallLocalService) {
		_prot_mgmt_overallLocalService = prot_mgmt_overallLocalService;
	}

	/**
	* Adds the prot_mgmt_overall to the database. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	* @return the prot_mgmt_overall that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall addprot_mgmt_overall(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.addprot_mgmt_overall(prot_mgmt_overall);
	}

	/**
	* Creates a new prot_mgmt_overall with the primary key. Does not add the prot_mgmt_overall to the database.
	*
	* @param pmo_id the primary key for the new prot_mgmt_overall
	* @return the new prot_mgmt_overall
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall createprot_mgmt_overall(
		long pmo_id) {
		return _prot_mgmt_overallLocalService.createprot_mgmt_overall(pmo_id);
	}

	/**
	* Deletes the prot_mgmt_overall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall that was removed
	* @throws PortalException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall deleteprot_mgmt_overall(
		long pmo_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.deleteprot_mgmt_overall(pmo_id);
	}

	/**
	* Deletes the prot_mgmt_overall from the database. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	* @return the prot_mgmt_overall that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall deleteprot_mgmt_overall(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.deleteprot_mgmt_overall(prot_mgmt_overall);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prot_mgmt_overallLocalService.dynamicQuery();
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
		return _prot_mgmt_overallLocalService.dynamicQuery(dynamicQuery);
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
		return _prot_mgmt_overallLocalService.dynamicQuery(dynamicQuery, start,
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
		return _prot_mgmt_overallLocalService.dynamicQuery(dynamicQuery, start,
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
		return _prot_mgmt_overallLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.prot_mgmt_overall fetchprot_mgmt_overall(
		long pmo_id) throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.fetchprot_mgmt_overall(pmo_id);
	}

	/**
	* Returns the prot_mgmt_overall with the primary key.
	*
	* @param pmo_id the primary key of the prot_mgmt_overall
	* @return the prot_mgmt_overall
	* @throws PortalException if a prot_mgmt_overall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall getprot_mgmt_overall(
		long pmo_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.getprot_mgmt_overall(pmo_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the prot_mgmt_overalls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_overalls
	* @param end the upper bound of the range of prot_mgmt_overalls (not inclusive)
	* @return the range of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.getprot_mgmt_overalls(start, end);
	}

	/**
	* Returns the number of prot_mgmt_overalls.
	*
	* @return the number of prot_mgmt_overalls
	* @throws SystemException if a system exception occurred
	*/
	public int getprot_mgmt_overallsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.getprot_mgmt_overallsCount();
	}

	/**
	* Updates the prot_mgmt_overall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	* @return the prot_mgmt_overall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall updateprot_mgmt_overall(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.updateprot_mgmt_overall(prot_mgmt_overall);
	}

	/**
	* Updates the prot_mgmt_overall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_overall the prot_mgmt_overall
	* @param merge whether to merge the prot_mgmt_overall with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the prot_mgmt_overall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_overall updateprot_mgmt_overall(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.updateprot_mgmt_overall(prot_mgmt_overall,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _prot_mgmt_overallLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_prot_mgmt_overallLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _prot_mgmt_overallLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprotmgmtoverallByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_overallLocalService.getprotmgmtoverallByVersion(versionId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public prot_mgmt_overallLocalService getWrappedprot_mgmt_overallLocalService() {
		return _prot_mgmt_overallLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedprot_mgmt_overallLocalService(
		prot_mgmt_overallLocalService prot_mgmt_overallLocalService) {
		_prot_mgmt_overallLocalService = prot_mgmt_overallLocalService;
	}

	public prot_mgmt_overallLocalService getWrappedService() {
		return _prot_mgmt_overallLocalService;
	}

	public void setWrappedService(
		prot_mgmt_overallLocalService prot_mgmt_overallLocalService) {
		_prot_mgmt_overallLocalService = prot_mgmt_overallLocalService;
	}

	private prot_mgmt_overallLocalService _prot_mgmt_overallLocalService;
}