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
 * This class is a wrapper for {@link benefit_checksubtype_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefit_checksubtype_lkpLocalService
 * @generated
 */
public class benefit_checksubtype_lkpLocalServiceWrapper
	implements benefit_checksubtype_lkpLocalService,
		ServiceWrapper<benefit_checksubtype_lkpLocalService> {
	public benefit_checksubtype_lkpLocalServiceWrapper(
		benefit_checksubtype_lkpLocalService benefit_checksubtype_lkpLocalService) {
		_benefit_checksubtype_lkpLocalService = benefit_checksubtype_lkpLocalService;
	}

	/**
	* Adds the benefit_checksubtype_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp addbenefit_checksubtype_lkp(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.addbenefit_checksubtype_lkp(benefit_checksubtype_lkp);
	}

	/**
	* Creates a new benefit_checksubtype_lkp with the primary key. Does not add the benefit_checksubtype_lkp to the database.
	*
	* @param subbenefit_id the primary key for the new benefit_checksubtype_lkp
	* @return the new benefit_checksubtype_lkp
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp createbenefit_checksubtype_lkp(
		long subbenefit_id) {
		return _benefit_checksubtype_lkpLocalService.createbenefit_checksubtype_lkp(subbenefit_id);
	}

	/**
	* Deletes the benefit_checksubtype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was removed
	* @throws PortalException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp deletebenefit_checksubtype_lkp(
		long subbenefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.deletebenefit_checksubtype_lkp(subbenefit_id);
	}

	/**
	* Deletes the benefit_checksubtype_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp deletebenefit_checksubtype_lkp(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.deletebenefit_checksubtype_lkp(benefit_checksubtype_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefit_checksubtype_lkpLocalService.dynamicQuery();
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
		return _benefit_checksubtype_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _benefit_checksubtype_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _benefit_checksubtype_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _benefit_checksubtype_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp fetchbenefit_checksubtype_lkp(
		long subbenefit_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.fetchbenefit_checksubtype_lkp(subbenefit_id);
	}

	/**
	* Returns the benefit_checksubtype_lkp with the primary key.
	*
	* @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp
	* @throws PortalException if a benefit_checksubtype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp getbenefit_checksubtype_lkp(
		long subbenefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.getbenefit_checksubtype_lkp(subbenefit_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefit_checksubtype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checksubtype_lkps
	* @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	* @return the range of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.getbenefit_checksubtype_lkps(start,
			end);
	}

	/**
	* Returns the number of benefit_checksubtype_lkps.
	*
	* @return the number of benefit_checksubtype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefit_checksubtype_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.getbenefit_checksubtype_lkpsCount();
	}

	/**
	* Updates the benefit_checksubtype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	* @return the benefit_checksubtype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp updatebenefit_checksubtype_lkp(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.updatebenefit_checksubtype_lkp(benefit_checksubtype_lkp);
	}

	/**
	* Updates the benefit_checksubtype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	* @param merge whether to merge the benefit_checksubtype_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefit_checksubtype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp updatebenefit_checksubtype_lkp(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.updatebenefit_checksubtype_lkp(benefit_checksubtype_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _benefit_checksubtype_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_benefit_checksubtype_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _benefit_checksubtype_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findBenefitCheckSubTypeByActiveStatus(
		boolean active_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.findBenefitCheckSubTypeByActiveStatus(active_);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checksubtype_lkpLocalService.findAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public benefit_checksubtype_lkpLocalService getWrappedbenefit_checksubtype_lkpLocalService() {
		return _benefit_checksubtype_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbenefit_checksubtype_lkpLocalService(
		benefit_checksubtype_lkpLocalService benefit_checksubtype_lkpLocalService) {
		_benefit_checksubtype_lkpLocalService = benefit_checksubtype_lkpLocalService;
	}

	public benefit_checksubtype_lkpLocalService getWrappedService() {
		return _benefit_checksubtype_lkpLocalService;
	}

	public void setWrappedService(
		benefit_checksubtype_lkpLocalService benefit_checksubtype_lkpLocalService) {
		_benefit_checksubtype_lkpLocalService = benefit_checksubtype_lkpLocalService;
	}

	private benefit_checksubtype_lkpLocalService _benefit_checksubtype_lkpLocalService;
}