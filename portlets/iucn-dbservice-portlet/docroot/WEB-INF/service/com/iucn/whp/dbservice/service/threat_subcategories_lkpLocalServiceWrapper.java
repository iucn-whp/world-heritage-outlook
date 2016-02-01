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
 * This class is a wrapper for {@link threat_subcategories_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_subcategories_lkpLocalService
 * @generated
 */
public class threat_subcategories_lkpLocalServiceWrapper
	implements threat_subcategories_lkpLocalService,
		ServiceWrapper<threat_subcategories_lkpLocalService> {
	public threat_subcategories_lkpLocalServiceWrapper(
		threat_subcategories_lkpLocalService threat_subcategories_lkpLocalService) {
		_threat_subcategories_lkpLocalService = threat_subcategories_lkpLocalService;
	}

	/**
	* Adds the threat_subcategories_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp addthreat_subcategories_lkp(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.addthreat_subcategories_lkp(threat_subcategories_lkp);
	}

	/**
	* Creates a new threat_subcategories_lkp with the primary key. Does not add the threat_subcategories_lkp to the database.
	*
	* @param id the primary key for the new threat_subcategories_lkp
	* @return the new threat_subcategories_lkp
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp createthreat_subcategories_lkp(
		long id) {
		return _threat_subcategories_lkpLocalService.createthreat_subcategories_lkp(id);
	}

	/**
	* Deletes the threat_subcategories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was removed
	* @throws PortalException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp deletethreat_subcategories_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.deletethreat_subcategories_lkp(id);
	}

	/**
	* Deletes the threat_subcategories_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp deletethreat_subcategories_lkp(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.deletethreat_subcategories_lkp(threat_subcategories_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _threat_subcategories_lkpLocalService.dynamicQuery();
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
		return _threat_subcategories_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _threat_subcategories_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_subcategories_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_subcategories_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.threat_subcategories_lkp fetchthreat_subcategories_lkp(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.fetchthreat_subcategories_lkp(id);
	}

	/**
	* Returns the threat_subcategories_lkp with the primary key.
	*
	* @param id the primary key of the threat_subcategories_lkp
	* @return the threat_subcategories_lkp
	* @throws PortalException if a threat_subcategories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp getthreat_subcategories_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.getthreat_subcategories_lkp(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_subcategories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_subcategories_lkps
	* @param end the upper bound of the range of threat_subcategories_lkps (not inclusive)
	* @return the range of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getthreat_subcategories_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.getthreat_subcategories_lkps(start,
			end);
	}

	/**
	* Returns the number of threat_subcategories_lkps.
	*
	* @return the number of threat_subcategories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getthreat_subcategories_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.getthreat_subcategories_lkpsCount();
	}

	/**
	* Updates the threat_subcategories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	* @return the threat_subcategories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp updatethreat_subcategories_lkp(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.updatethreat_subcategories_lkp(threat_subcategories_lkp);
	}

	/**
	* Updates the threat_subcategories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_subcategories_lkp the threat_subcategories_lkp
	* @param merge whether to merge the threat_subcategories_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_subcategories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_subcategories_lkp updatethreat_subcategories_lkp(
		com.iucn.whp.dbservice.model.threat_subcategories_lkp threat_subcategories_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_subcategories_lkpLocalService.updatethreat_subcategories_lkp(threat_subcategories_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _threat_subcategories_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_threat_subcategories_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _threat_subcategories_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public threat_subcategories_lkpLocalService getWrappedthreat_subcategories_lkpLocalService() {
		return _threat_subcategories_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthreat_subcategories_lkpLocalService(
		threat_subcategories_lkpLocalService threat_subcategories_lkpLocalService) {
		_threat_subcategories_lkpLocalService = threat_subcategories_lkpLocalService;
	}

	public threat_subcategories_lkpLocalService getWrappedService() {
		return _threat_subcategories_lkpLocalService;
	}

	public void setWrappedService(
		threat_subcategories_lkpLocalService threat_subcategories_lkpLocalService) {
		_threat_subcategories_lkpLocalService = threat_subcategories_lkpLocalService;
	}

	private threat_subcategories_lkpLocalService _threat_subcategories_lkpLocalService;
}