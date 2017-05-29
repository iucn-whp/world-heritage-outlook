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
 * This class is a wrapper for {@link benefit_checktype_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefit_checktype_lkpLocalService
 * @generated
 */
public class benefit_checktype_lkpLocalServiceWrapper
	implements benefit_checktype_lkpLocalService,
		ServiceWrapper<benefit_checktype_lkpLocalService> {
	public benefit_checktype_lkpLocalServiceWrapper(
		benefit_checktype_lkpLocalService benefit_checktype_lkpLocalService) {
		_benefit_checktype_lkpLocalService = benefit_checktype_lkpLocalService;
	}

	/**
	* Adds the benefit_checktype_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp addbenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.addbenefit_checktype_lkp(benefit_checktype_lkp);
	}

	/**
	* Creates a new benefit_checktype_lkp with the primary key. Does not add the benefit_checktype_lkp to the database.
	*
	* @param benefit_id the primary key for the new benefit_checktype_lkp
	* @return the new benefit_checktype_lkp
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp createbenefit_checktype_lkp(
		long benefit_id) {
		return _benefit_checktype_lkpLocalService.createbenefit_checktype_lkp(benefit_id);
	}

	/**
	* Deletes the benefit_checktype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was removed
	* @throws PortalException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp deletebenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.deletebenefit_checktype_lkp(benefit_id);
	}

	/**
	* Deletes the benefit_checktype_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp deletebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.deletebenefit_checktype_lkp(benefit_checktype_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefit_checktype_lkpLocalService.dynamicQuery();
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
		return _benefit_checktype_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _benefit_checktype_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _benefit_checktype_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _benefit_checktype_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.benefit_checktype_lkp fetchbenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.fetchbenefit_checktype_lkp(benefit_id);
	}

	/**
	* Returns the benefit_checktype_lkp with the primary key.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp
	* @throws PortalException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp getbenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.getbenefit_checktype_lkp(benefit_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefit_checktype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @return the range of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> getbenefit_checktype_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.getbenefit_checktype_lkps(start,
			end);
	}

	/**
	* Returns the number of benefit_checktype_lkps.
	*
	* @return the number of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefit_checktype_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.getbenefit_checktype_lkpsCount();
	}

	/**
	* Updates the benefit_checktype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp updatebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.updatebenefit_checktype_lkp(benefit_checktype_lkp);
	}

	/**
	* Updates the benefit_checktype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @param merge whether to merge the benefit_checktype_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefit_checktype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefit_checktype_lkp updatebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.updatebenefit_checktype_lkp(benefit_checktype_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _benefit_checktype_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_benefit_checktype_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _benefit_checktype_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findBenefitCheckTypeByActiveStatus(
		boolean active_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.findBenefitCheckTypeByActiveStatus(active_);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefit_checktype_lkpLocalService.findAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public benefit_checktype_lkpLocalService getWrappedbenefit_checktype_lkpLocalService() {
		return _benefit_checktype_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbenefit_checktype_lkpLocalService(
		benefit_checktype_lkpLocalService benefit_checktype_lkpLocalService) {
		_benefit_checktype_lkpLocalService = benefit_checktype_lkpLocalService;
	}

	public benefit_checktype_lkpLocalService getWrappedService() {
		return _benefit_checktype_lkpLocalService;
	}

	public void setWrappedService(
		benefit_checktype_lkpLocalService benefit_checktype_lkpLocalService) {
		_benefit_checktype_lkpLocalService = benefit_checktype_lkpLocalService;
	}

	private benefit_checktype_lkpLocalService _benefit_checktype_lkpLocalService;
}