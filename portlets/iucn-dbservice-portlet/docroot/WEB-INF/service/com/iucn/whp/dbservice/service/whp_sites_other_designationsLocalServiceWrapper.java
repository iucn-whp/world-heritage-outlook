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
 * This class is a wrapper for {@link whp_sites_other_designationsLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_other_designationsLocalService
 * @generated
 */
public class whp_sites_other_designationsLocalServiceWrapper
	implements whp_sites_other_designationsLocalService,
		ServiceWrapper<whp_sites_other_designationsLocalService> {
	public whp_sites_other_designationsLocalServiceWrapper(
		whp_sites_other_designationsLocalService whp_sites_other_designationsLocalService) {
		_whp_sites_other_designationsLocalService = whp_sites_other_designationsLocalService;
	}

	/**
	* Adds the whp_sites_other_designations to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations the whp_sites_other_designations
	* @return the whp_sites_other_designations that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations addwhp_sites_other_designations(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.addwhp_sites_other_designations(whp_sites_other_designations);
	}

	/**
	* Creates a new whp_sites_other_designations with the primary key. Does not add the whp_sites_other_designations to the database.
	*
	* @param whp_sites_other_designations_id the primary key for the new whp_sites_other_designations
	* @return the new whp_sites_other_designations
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations createwhp_sites_other_designations(
		long whp_sites_other_designations_id) {
		return _whp_sites_other_designationsLocalService.createwhp_sites_other_designations(whp_sites_other_designations_id);
	}

	/**
	* Deletes the whp_sites_other_designations with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations_id the primary key of the whp_sites_other_designations
	* @return the whp_sites_other_designations that was removed
	* @throws PortalException if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations deletewhp_sites_other_designations(
		long whp_sites_other_designations_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.deletewhp_sites_other_designations(whp_sites_other_designations_id);
	}

	/**
	* Deletes the whp_sites_other_designations from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations the whp_sites_other_designations
	* @return the whp_sites_other_designations that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations deletewhp_sites_other_designations(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.deletewhp_sites_other_designations(whp_sites_other_designations);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_other_designationsLocalService.dynamicQuery();
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
		return _whp_sites_other_designationsLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_other_designationsLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_other_designationsLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_other_designationsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_other_designations fetchwhp_sites_other_designations(
		long whp_sites_other_designations_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.fetchwhp_sites_other_designations(whp_sites_other_designations_id);
	}

	/**
	* Returns the whp_sites_other_designations with the primary key.
	*
	* @param whp_sites_other_designations_id the primary key of the whp_sites_other_designations
	* @return the whp_sites_other_designations
	* @throws PortalException if a whp_sites_other_designations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations getwhp_sites_other_designations(
		long whp_sites_other_designations_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.getwhp_sites_other_designations(whp_sites_other_designations_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_other_designationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_other_designationses
	* @param end the upper bound of the range of whp_sites_other_designationses (not inclusive)
	* @return the range of whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.getwhp_sites_other_designationses(start,
			end);
	}

	/**
	* Returns the number of whp_sites_other_designationses.
	*
	* @return the number of whp_sites_other_designationses
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_other_designationsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.getwhp_sites_other_designationsesCount();
	}

	/**
	* Updates the whp_sites_other_designations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations the whp_sites_other_designations
	* @return the whp_sites_other_designations that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations updatewhp_sites_other_designations(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.updatewhp_sites_other_designations(whp_sites_other_designations);
	}

	/**
	* Updates the whp_sites_other_designations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_other_designations the whp_sites_other_designations
	* @param merge whether to merge the whp_sites_other_designations with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_other_designations that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_other_designations updatewhp_sites_other_designations(
		com.iucn.whp.dbservice.model.whp_sites_other_designations whp_sites_other_designations,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.updatewhp_sites_other_designations(whp_sites_other_designations,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_other_designationsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_other_designationsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_other_designationsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* WHP_IUCN OTHER DESIGNATIOM
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getWhpSiteOtherDesignationsBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_other_designationsLocalService.getWhpSiteOtherDesignationsBySiteId(siteId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_other_designationsLocalService getWrappedwhp_sites_other_designationsLocalService() {
		return _whp_sites_other_designationsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_other_designationsLocalService(
		whp_sites_other_designationsLocalService whp_sites_other_designationsLocalService) {
		_whp_sites_other_designationsLocalService = whp_sites_other_designationsLocalService;
	}

	public whp_sites_other_designationsLocalService getWrappedService() {
		return _whp_sites_other_designationsLocalService;
	}

	public void setWrappedService(
		whp_sites_other_designationsLocalService whp_sites_other_designationsLocalService) {
		_whp_sites_other_designationsLocalService = whp_sites_other_designationsLocalService;
	}

	private whp_sites_other_designationsLocalService _whp_sites_other_designationsLocalService;
}