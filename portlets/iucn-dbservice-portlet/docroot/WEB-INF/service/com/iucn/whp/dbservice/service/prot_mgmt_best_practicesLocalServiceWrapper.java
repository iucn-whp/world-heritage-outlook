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
 * This class is a wrapper for {@link prot_mgmt_best_practicesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       prot_mgmt_best_practicesLocalService
 * @generated
 */
public class prot_mgmt_best_practicesLocalServiceWrapper
	implements prot_mgmt_best_practicesLocalService,
		ServiceWrapper<prot_mgmt_best_practicesLocalService> {
	public prot_mgmt_best_practicesLocalServiceWrapper(
		prot_mgmt_best_practicesLocalService prot_mgmt_best_practicesLocalService) {
		_prot_mgmt_best_practicesLocalService = prot_mgmt_best_practicesLocalService;
	}

	/**
	* Adds the prot_mgmt_best_practices to the database. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_best_practices the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices addprot_mgmt_best_practices(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.addprot_mgmt_best_practices(prot_mgmt_best_practices);
	}

	/**
	* Creates a new prot_mgmt_best_practices with the primary key. Does not add the prot_mgmt_best_practices to the database.
	*
	* @param best_practice_id the primary key for the new prot_mgmt_best_practices
	* @return the new prot_mgmt_best_practices
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices createprot_mgmt_best_practices(
		long best_practice_id) {
		return _prot_mgmt_best_practicesLocalService.createprot_mgmt_best_practices(best_practice_id);
	}

	/**
	* Deletes the prot_mgmt_best_practices with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param best_practice_id the primary key of the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices that was removed
	* @throws PortalException if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices deleteprot_mgmt_best_practices(
		long best_practice_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.deleteprot_mgmt_best_practices(best_practice_id);
	}

	/**
	* Deletes the prot_mgmt_best_practices from the database. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_best_practices the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices deleteprot_mgmt_best_practices(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.deleteprot_mgmt_best_practices(prot_mgmt_best_practices);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prot_mgmt_best_practicesLocalService.dynamicQuery();
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
		return _prot_mgmt_best_practicesLocalService.dynamicQuery(dynamicQuery);
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
		return _prot_mgmt_best_practicesLocalService.dynamicQuery(dynamicQuery,
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
		return _prot_mgmt_best_practicesLocalService.dynamicQuery(dynamicQuery,
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
		return _prot_mgmt_best_practicesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices fetchprot_mgmt_best_practices(
		long best_practice_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.fetchprot_mgmt_best_practices(best_practice_id);
	}

	/**
	* Returns the prot_mgmt_best_practices with the primary key.
	*
	* @param best_practice_id the primary key of the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices
	* @throws PortalException if a prot_mgmt_best_practices with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices getprot_mgmt_best_practices(
		long best_practice_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.getprot_mgmt_best_practices(best_practice_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the prot_mgmt_best_practiceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of prot_mgmt_best_practiceses
	* @param end the upper bound of the range of prot_mgmt_best_practiceses (not inclusive)
	* @return the range of prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.getprot_mgmt_best_practiceses(start,
			end);
	}

	/**
	* Returns the number of prot_mgmt_best_practiceses.
	*
	* @return the number of prot_mgmt_best_practiceses
	* @throws SystemException if a system exception occurred
	*/
	public int getprot_mgmt_best_practicesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.getprot_mgmt_best_practicesesCount();
	}

	/**
	* Updates the prot_mgmt_best_practices in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_best_practices the prot_mgmt_best_practices
	* @return the prot_mgmt_best_practices that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices updateprot_mgmt_best_practices(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.updateprot_mgmt_best_practices(prot_mgmt_best_practices);
	}

	/**
	* Updates the prot_mgmt_best_practices in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prot_mgmt_best_practices the prot_mgmt_best_practices
	* @param merge whether to merge the prot_mgmt_best_practices with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the prot_mgmt_best_practices that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices updateprot_mgmt_best_practices(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.updateprot_mgmt_best_practices(prot_mgmt_best_practices,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _prot_mgmt_best_practicesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_prot_mgmt_best_practicesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _prot_mgmt_best_practicesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getBestpractEntriesByAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prot_mgmt_best_practicesLocalService.getBestpractEntriesByAssessmentId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public prot_mgmt_best_practicesLocalService getWrappedprot_mgmt_best_practicesLocalService() {
		return _prot_mgmt_best_practicesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedprot_mgmt_best_practicesLocalService(
		prot_mgmt_best_practicesLocalService prot_mgmt_best_practicesLocalService) {
		_prot_mgmt_best_practicesLocalService = prot_mgmt_best_practicesLocalService;
	}

	public prot_mgmt_best_practicesLocalService getWrappedService() {
		return _prot_mgmt_best_practicesLocalService;
	}

	public void setWrappedService(
		prot_mgmt_best_practicesLocalService prot_mgmt_best_practicesLocalService) {
		_prot_mgmt_best_practicesLocalService = prot_mgmt_best_practicesLocalService;
	}

	private prot_mgmt_best_practicesLocalService _prot_mgmt_best_practicesLocalService;
}