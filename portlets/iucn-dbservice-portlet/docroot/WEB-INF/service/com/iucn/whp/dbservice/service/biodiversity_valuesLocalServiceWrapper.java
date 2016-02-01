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
 * This class is a wrapper for {@link biodiversity_valuesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       biodiversity_valuesLocalService
 * @generated
 */
public class biodiversity_valuesLocalServiceWrapper
	implements biodiversity_valuesLocalService,
		ServiceWrapper<biodiversity_valuesLocalService> {
	public biodiversity_valuesLocalServiceWrapper(
		biodiversity_valuesLocalService biodiversity_valuesLocalService) {
		_biodiversity_valuesLocalService = biodiversity_valuesLocalService;
	}

	/**
	* Adds the biodiversity_values to the database. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values addbiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.addbiodiversity_values(biodiversity_values);
	}

	/**
	* Creates a new biodiversity_values with the primary key. Does not add the biodiversity_values to the database.
	*
	* @param id the primary key for the new biodiversity_values
	* @return the new biodiversity_values
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values createbiodiversity_values(
		long id) {
		return _biodiversity_valuesLocalService.createbiodiversity_values(id);
	}

	/**
	* Deletes the biodiversity_values with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values that was removed
	* @throws PortalException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values deletebiodiversity_values(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.deletebiodiversity_values(id);
	}

	/**
	* Deletes the biodiversity_values from the database. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values deletebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.deletebiodiversity_values(biodiversity_values);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _biodiversity_valuesLocalService.dynamicQuery();
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
		return _biodiversity_valuesLocalService.dynamicQuery(dynamicQuery);
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
		return _biodiversity_valuesLocalService.dynamicQuery(dynamicQuery,
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
		return _biodiversity_valuesLocalService.dynamicQuery(dynamicQuery,
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
		return _biodiversity_valuesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.biodiversity_values fetchbiodiversity_values(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.fetchbiodiversity_values(id);
	}

	/**
	* Returns the biodiversity_values with the primary key.
	*
	* @param id the primary key of the biodiversity_values
	* @return the biodiversity_values
	* @throws PortalException if a biodiversity_values with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values getbiodiversity_values(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.getbiodiversity_values(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the biodiversity_valueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of biodiversity_valueses
	* @param end the upper bound of the range of biodiversity_valueses (not inclusive)
	* @return the range of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.getbiodiversity_valueses(start,
			end);
	}

	/**
	* Returns the number of biodiversity_valueses.
	*
	* @return the number of biodiversity_valueses
	* @throws SystemException if a system exception occurred
	*/
	public int getbiodiversity_valuesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.getbiodiversity_valuesesCount();
	}

	/**
	* Updates the biodiversity_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @return the biodiversity_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values updatebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.updatebiodiversity_values(biodiversity_values);
	}

	/**
	* Updates the biodiversity_values in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biodiversity_values the biodiversity_values
	* @param merge whether to merge the biodiversity_values with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the biodiversity_values that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.biodiversity_values updatebiodiversity_values(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.updatebiodiversity_values(biodiversity_values,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _biodiversity_valuesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_biodiversity_valuesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _biodiversity_valuesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getValeusByAssessment_VersionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _biodiversity_valuesLocalService.getValeusByAssessment_VersionId(assessment_version_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public biodiversity_valuesLocalService getWrappedbiodiversity_valuesLocalService() {
		return _biodiversity_valuesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbiodiversity_valuesLocalService(
		biodiversity_valuesLocalService biodiversity_valuesLocalService) {
		_biodiversity_valuesLocalService = biodiversity_valuesLocalService;
	}

	public biodiversity_valuesLocalService getWrappedService() {
		return _biodiversity_valuesLocalService;
	}

	public void setWrappedService(
		biodiversity_valuesLocalService biodiversity_valuesLocalService) {
		_biodiversity_valuesLocalService = biodiversity_valuesLocalService;
	}

	private biodiversity_valuesLocalService _biodiversity_valuesLocalService;
}