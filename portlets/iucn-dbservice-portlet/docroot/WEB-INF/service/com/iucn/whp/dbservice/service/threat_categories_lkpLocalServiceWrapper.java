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
 * This class is a wrapper for {@link threat_categories_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_categories_lkpLocalService
 * @generated
 */
public class threat_categories_lkpLocalServiceWrapper
	implements threat_categories_lkpLocalService,
		ServiceWrapper<threat_categories_lkpLocalService> {
	public threat_categories_lkpLocalServiceWrapper(
		threat_categories_lkpLocalService threat_categories_lkpLocalService) {
		_threat_categories_lkpLocalService = threat_categories_lkpLocalService;
	}

	/**
	* Adds the threat_categories_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp addthreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.addthreat_categories_lkp(threat_categories_lkp);
	}

	/**
	* Creates a new threat_categories_lkp with the primary key. Does not add the threat_categories_lkp to the database.
	*
	* @param threatCategoryid the primary key for the new threat_categories_lkp
	* @return the new threat_categories_lkp
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp createthreat_categories_lkp(
		long threatCategoryid) {
		return _threat_categories_lkpLocalService.createthreat_categories_lkp(threatCategoryid);
	}

	/**
	* Deletes the threat_categories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threatCategoryid the primary key of the threat_categories_lkp
	* @return the threat_categories_lkp that was removed
	* @throws PortalException if a threat_categories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp deletethreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.deletethreat_categories_lkp(threatCategoryid);
	}

	/**
	* Deletes the threat_categories_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp deletethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.deletethreat_categories_lkp(threat_categories_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _threat_categories_lkpLocalService.dynamicQuery();
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
		return _threat_categories_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _threat_categories_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_categories_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _threat_categories_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.threat_categories_lkp fetchthreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.fetchthreat_categories_lkp(threatCategoryid);
	}

	/**
	* Returns the threat_categories_lkp with the primary key.
	*
	* @param threatCategoryid the primary key of the threat_categories_lkp
	* @return the threat_categories_lkp
	* @throws PortalException if a threat_categories_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp getthreat_categories_lkp(
		long threatCategoryid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.getthreat_categories_lkp(threatCategoryid);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_categories_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_categories_lkps
	* @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	* @return the range of threat_categories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_categories_lkp> getthreat_categories_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.getthreat_categories_lkps(start,
			end);
	}

	/**
	* Returns the number of threat_categories_lkps.
	*
	* @return the number of threat_categories_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getthreat_categories_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.getthreat_categories_lkpsCount();
	}

	/**
	* Updates the threat_categories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @return the threat_categories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp updatethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.updatethreat_categories_lkp(threat_categories_lkp);
	}

	/**
	* Updates the threat_categories_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_categories_lkp the threat_categories_lkp
	* @param merge whether to merge the threat_categories_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_categories_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_categories_lkp updatethreat_categories_lkp(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_categories_lkpLocalService.updatethreat_categories_lkp(threat_categories_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _threat_categories_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_threat_categories_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _threat_categories_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public threat_categories_lkpLocalService getWrappedthreat_categories_lkpLocalService() {
		return _threat_categories_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthreat_categories_lkpLocalService(
		threat_categories_lkpLocalService threat_categories_lkpLocalService) {
		_threat_categories_lkpLocalService = threat_categories_lkpLocalService;
	}

	public threat_categories_lkpLocalService getWrappedService() {
		return _threat_categories_lkpLocalService;
	}

	public void setWrappedService(
		threat_categories_lkpLocalService threat_categories_lkpLocalService) {
		_threat_categories_lkpLocalService = threat_categories_lkpLocalService;
	}

	private threat_categories_lkpLocalService _threat_categories_lkpLocalService;
}