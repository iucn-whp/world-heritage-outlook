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
 * This class is a wrapper for {@link negative_factors_level_impactLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       negative_factors_level_impactLocalService
 * @generated
 */
public class negative_factors_level_impactLocalServiceWrapper
	implements negative_factors_level_impactLocalService,
		ServiceWrapper<negative_factors_level_impactLocalService> {
	public negative_factors_level_impactLocalServiceWrapper(
		negative_factors_level_impactLocalService negative_factors_level_impactLocalService) {
		_negative_factors_level_impactLocalService = negative_factors_level_impactLocalService;
	}

	/**
	* Adds the negative_factors_level_impact to the database. Also notifies the appropriate model listeners.
	*
	* @param negative_factors_level_impact the negative_factors_level_impact
	* @return the negative_factors_level_impact that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact addnegative_factors_level_impact(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.addnegative_factors_level_impact(negative_factors_level_impact);
	}

	/**
	* Creates a new negative_factors_level_impact with the primary key. Does not add the negative_factors_level_impact to the database.
	*
	* @param level_id the primary key for the new negative_factors_level_impact
	* @return the new negative_factors_level_impact
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact createnegative_factors_level_impact(
		long level_id) {
		return _negative_factors_level_impactLocalService.createnegative_factors_level_impact(level_id);
	}

	/**
	* Deletes the negative_factors_level_impact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param level_id the primary key of the negative_factors_level_impact
	* @return the negative_factors_level_impact that was removed
	* @throws PortalException if a negative_factors_level_impact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact deletenegative_factors_level_impact(
		long level_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.deletenegative_factors_level_impact(level_id);
	}

	/**
	* Deletes the negative_factors_level_impact from the database. Also notifies the appropriate model listeners.
	*
	* @param negative_factors_level_impact the negative_factors_level_impact
	* @return the negative_factors_level_impact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact deletenegative_factors_level_impact(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.deletenegative_factors_level_impact(negative_factors_level_impact);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _negative_factors_level_impactLocalService.dynamicQuery();
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
		return _negative_factors_level_impactLocalService.dynamicQuery(dynamicQuery);
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
		return _negative_factors_level_impactLocalService.dynamicQuery(dynamicQuery,
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
		return _negative_factors_level_impactLocalService.dynamicQuery(dynamicQuery,
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
		return _negative_factors_level_impactLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.negative_factors_level_impact fetchnegative_factors_level_impact(
		long level_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.fetchnegative_factors_level_impact(level_id);
	}

	/**
	* Returns the negative_factors_level_impact with the primary key.
	*
	* @param level_id the primary key of the negative_factors_level_impact
	* @return the negative_factors_level_impact
	* @throws PortalException if a negative_factors_level_impact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact getnegative_factors_level_impact(
		long level_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.getnegative_factors_level_impact(level_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the negative_factors_level_impacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of negative_factors_level_impacts
	* @param end the upper bound of the range of negative_factors_level_impacts (not inclusive)
	* @return the range of negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.negative_factors_level_impact> getnegative_factors_level_impacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.getnegative_factors_level_impacts(start,
			end);
	}

	/**
	* Returns the number of negative_factors_level_impacts.
	*
	* @return the number of negative_factors_level_impacts
	* @throws SystemException if a system exception occurred
	*/
	public int getnegative_factors_level_impactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.getnegative_factors_level_impactsCount();
	}

	/**
	* Updates the negative_factors_level_impact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param negative_factors_level_impact the negative_factors_level_impact
	* @return the negative_factors_level_impact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact updatenegative_factors_level_impact(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.updatenegative_factors_level_impact(negative_factors_level_impact);
	}

	/**
	* Updates the negative_factors_level_impact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param negative_factors_level_impact the negative_factors_level_impact
	* @param merge whether to merge the negative_factors_level_impact with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the negative_factors_level_impact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.negative_factors_level_impact updatenegative_factors_level_impact(
		com.iucn.whp.dbservice.model.negative_factors_level_impact negative_factors_level_impact,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _negative_factors_level_impactLocalService.updatenegative_factors_level_impact(negative_factors_level_impact,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _negative_factors_level_impactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_negative_factors_level_impactLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _negative_factors_level_impactLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public negative_factors_level_impactLocalService getWrappednegative_factors_level_impactLocalService() {
		return _negative_factors_level_impactLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappednegative_factors_level_impactLocalService(
		negative_factors_level_impactLocalService negative_factors_level_impactLocalService) {
		_negative_factors_level_impactLocalService = negative_factors_level_impactLocalService;
	}

	public negative_factors_level_impactLocalService getWrappedService() {
		return _negative_factors_level_impactLocalService;
	}

	public void setWrappedService(
		negative_factors_level_impactLocalService negative_factors_level_impactLocalService) {
		_negative_factors_level_impactLocalService = negative_factors_level_impactLocalService;
	}

	private negative_factors_level_impactLocalService _negative_factors_level_impactLocalService;
}