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
 * This class is a wrapper for {@link benefitsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefitsLocalService
 * @generated
 */
public class benefitsLocalServiceWrapper implements benefitsLocalService,
	ServiceWrapper<benefitsLocalService> {
	public benefitsLocalServiceWrapper(
		benefitsLocalService benefitsLocalService) {
		_benefitsLocalService = benefitsLocalService;
	}

	/**
	* Adds the benefits to the database. Also notifies the appropriate model listeners.
	*
	* @param benefits the benefits
	* @return the benefits that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits addbenefits(
		com.iucn.whp.dbservice.model.benefits benefits)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.addbenefits(benefits);
	}

	/**
	* Creates a new benefits with the primary key. Does not add the benefits to the database.
	*
	* @param benefits_id the primary key for the new benefits
	* @return the new benefits
	*/
	public com.iucn.whp.dbservice.model.benefits createbenefits(
		long benefits_id) {
		return _benefitsLocalService.createbenefits(benefits_id);
	}

	/**
	* Deletes the benefits with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_id the primary key of the benefits
	* @return the benefits that was removed
	* @throws PortalException if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits deletebenefits(
		long benefits_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.deletebenefits(benefits_id);
	}

	/**
	* Deletes the benefits from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits the benefits
	* @return the benefits that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits deletebenefits(
		com.iucn.whp.dbservice.model.benefits benefits)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.deletebenefits(benefits);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefitsLocalService.dynamicQuery();
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
		return _benefitsLocalService.dynamicQuery(dynamicQuery);
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
		return _benefitsLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _benefitsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _benefitsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.benefits fetchbenefits(long benefits_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.fetchbenefits(benefits_id);
	}

	/**
	* Returns the benefits with the primary key.
	*
	* @param benefits_id the primary key of the benefits
	* @return the benefits
	* @throws PortalException if a benefits with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits getbenefits(long benefits_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.getbenefits(benefits_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefitses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefitses
	* @param end the upper bound of the range of benefitses (not inclusive)
	* @return the range of benefitses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.benefits> getbenefitses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.getbenefitses(start, end);
	}

	/**
	* Returns the number of benefitses.
	*
	* @return the number of benefitses
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefitsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.getbenefitsesCount();
	}

	/**
	* Updates the benefits in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits the benefits
	* @return the benefits that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits updatebenefits(
		com.iucn.whp.dbservice.model.benefits benefits)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.updatebenefits(benefits);
	}

	/**
	* Updates the benefits in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits the benefits
	* @param merge whether to merge the benefits with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefits that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits updatebenefits(
		com.iucn.whp.dbservice.model.benefits benefits, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.updatebenefits(benefits, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _benefitsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_benefitsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _benefitsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefits> getbenefitByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefitsLocalService.getbenefitByVersion(versionId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public benefitsLocalService getWrappedbenefitsLocalService() {
		return _benefitsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbenefitsLocalService(
		benefitsLocalService benefitsLocalService) {
		_benefitsLocalService = benefitsLocalService;
	}

	public benefitsLocalService getWrappedService() {
		return _benefitsLocalService;
	}

	public void setWrappedService(benefitsLocalService benefitsLocalService) {
		_benefitsLocalService = benefitsLocalService;
	}

	private benefitsLocalService _benefitsLocalService;
}