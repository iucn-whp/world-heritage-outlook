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
 * This class is a wrapper for {@link potential_project_needsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       potential_project_needsLocalService
 * @generated
 */
public class potential_project_needsLocalServiceWrapper
	implements potential_project_needsLocalService,
		ServiceWrapper<potential_project_needsLocalService> {
	public potential_project_needsLocalServiceWrapper(
		potential_project_needsLocalService potential_project_needsLocalService) {
		_potential_project_needsLocalService = potential_project_needsLocalService;
	}

	/**
	* Adds the potential_project_needs to the database. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs addpotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.addpotential_project_needs(potential_project_needs);
	}

	/**
	* Creates a new potential_project_needs with the primary key. Does not add the potential_project_needs to the database.
	*
	* @param ppn_id the primary key for the new potential_project_needs
	* @return the new potential_project_needs
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs createpotential_project_needs(
		long ppn_id) {
		return _potential_project_needsLocalService.createpotential_project_needs(ppn_id);
	}

	/**
	* Deletes the potential_project_needs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws PortalException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs deletepotential_project_needs(
		long ppn_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.deletepotential_project_needs(ppn_id);
	}

	/**
	* Deletes the potential_project_needs from the database. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs deletepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.deletepotential_project_needs(potential_project_needs);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _potential_project_needsLocalService.dynamicQuery();
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
		return _potential_project_needsLocalService.dynamicQuery(dynamicQuery);
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
		return _potential_project_needsLocalService.dynamicQuery(dynamicQuery,
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
		return _potential_project_needsLocalService.dynamicQuery(dynamicQuery,
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
		return _potential_project_needsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.potential_project_needs fetchpotential_project_needs(
		long ppn_id) throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.fetchpotential_project_needs(ppn_id);
	}

	/**
	* Returns the potential_project_needs with the primary key.
	*
	* @param ppn_id the primary key of the potential_project_needs
	* @return the potential_project_needs
	* @throws PortalException if a potential_project_needs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs getpotential_project_needs(
		long ppn_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.getpotential_project_needs(ppn_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the potential_project_needses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of potential_project_needses
	* @param end the upper bound of the range of potential_project_needses (not inclusive)
	* @return the range of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.getpotential_project_needses(start,
			end);
	}

	/**
	* Returns the number of potential_project_needses.
	*
	* @return the number of potential_project_needses
	* @throws SystemException if a system exception occurred
	*/
	public int getpotential_project_needsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.getpotential_project_needsesCount();
	}

	/**
	* Updates the potential_project_needs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @return the potential_project_needs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs updatepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.updatepotential_project_needs(potential_project_needs);
	}

	/**
	* Updates the potential_project_needs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param potential_project_needs the potential_project_needs
	* @param merge whether to merge the potential_project_needs with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the potential_project_needs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.potential_project_needs updatepotential_project_needs(
		com.iucn.whp.dbservice.model.potential_project_needs potential_project_needs,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.updatepotential_project_needs(potential_project_needs,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _potential_project_needsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_potential_project_needsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _potential_project_needsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_projectsByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _potential_project_needsLocalService.getpotential_projectsByVersion(versionId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public potential_project_needsLocalService getWrappedpotential_project_needsLocalService() {
		return _potential_project_needsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedpotential_project_needsLocalService(
		potential_project_needsLocalService potential_project_needsLocalService) {
		_potential_project_needsLocalService = potential_project_needsLocalService;
	}

	public potential_project_needsLocalService getWrappedService() {
		return _potential_project_needsLocalService;
	}

	public void setWrappedService(
		potential_project_needsLocalService potential_project_needsLocalService) {
		_potential_project_needsLocalService = potential_project_needsLocalService;
	}

	private potential_project_needsLocalService _potential_project_needsLocalService;
}