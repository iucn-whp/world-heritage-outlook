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
 * This class is a wrapper for {@link threat_rating_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_rating_lkpLocalService
 * @generated
 */
public class threat_rating_lkpLocalServiceWrapper
	implements threat_rating_lkpLocalService,
		ServiceWrapper<threat_rating_lkpLocalService> {
	public threat_rating_lkpLocalServiceWrapper(
		threat_rating_lkpLocalService threat_rating_lkpLocalService) {
		_threat_rating_lkpLocalService = threat_rating_lkpLocalService;
	}

	/**
	* Adds the threat_rating_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param threat_rating_lkp the threat_rating_lkp
	* @return the threat_rating_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp addthreat_rating_lkp(
		com.iucn.whp.dbservice.model.threat_rating_lkp threat_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.addthreat_rating_lkp(threat_rating_lkp);
	}

	/**
	* Creates a new threat_rating_lkp with the primary key. Does not add the threat_rating_lkp to the database.
	*
	* @param id the primary key for the new threat_rating_lkp
	* @return the new threat_rating_lkp
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp createthreat_rating_lkp(
		long id) {
		return _threat_rating_lkpLocalService.createthreat_rating_lkp(id);
	}

	/**
	* Deletes the threat_rating_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the threat_rating_lkp
	* @return the threat_rating_lkp that was removed
	* @throws PortalException if a threat_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp deletethreat_rating_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.deletethreat_rating_lkp(id);
	}

	/**
	* Deletes the threat_rating_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param threat_rating_lkp the threat_rating_lkp
	* @return the threat_rating_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp deletethreat_rating_lkp(
		com.iucn.whp.dbservice.model.threat_rating_lkp threat_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.deletethreat_rating_lkp(threat_rating_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _threat_rating_lkpLocalService.dynamicQuery();
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
		return _threat_rating_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _threat_rating_lkpLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _threat_rating_lkpLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _threat_rating_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.threat_rating_lkp fetchthreat_rating_lkp(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.fetchthreat_rating_lkp(id);
	}

	/**
	* Returns the threat_rating_lkp with the primary key.
	*
	* @param id the primary key of the threat_rating_lkp
	* @return the threat_rating_lkp
	* @throws PortalException if a threat_rating_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp getthreat_rating_lkp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.getthreat_rating_lkp(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the threat_rating_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of threat_rating_lkps
	* @param end the upper bound of the range of threat_rating_lkps (not inclusive)
	* @return the range of threat_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.threat_rating_lkp> getthreat_rating_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.getthreat_rating_lkps(start, end);
	}

	/**
	* Returns the number of threat_rating_lkps.
	*
	* @return the number of threat_rating_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getthreat_rating_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.getthreat_rating_lkpsCount();
	}

	/**
	* Updates the threat_rating_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_rating_lkp the threat_rating_lkp
	* @return the threat_rating_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp updatethreat_rating_lkp(
		com.iucn.whp.dbservice.model.threat_rating_lkp threat_rating_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.updatethreat_rating_lkp(threat_rating_lkp);
	}

	/**
	* Updates the threat_rating_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param threat_rating_lkp the threat_rating_lkp
	* @param merge whether to merge the threat_rating_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the threat_rating_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.threat_rating_lkp updatethreat_rating_lkp(
		com.iucn.whp.dbservice.model.threat_rating_lkp threat_rating_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.updatethreat_rating_lkp(threat_rating_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _threat_rating_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_threat_rating_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _threat_rating_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.iucn.whp.dbservice.model.threat_rating_lkp getRatingBythreat_ratingId(
		long threat_rating_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _threat_rating_lkpLocalService.getRatingBythreat_ratingId(threat_rating_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public threat_rating_lkpLocalService getWrappedthreat_rating_lkpLocalService() {
		return _threat_rating_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthreat_rating_lkpLocalService(
		threat_rating_lkpLocalService threat_rating_lkpLocalService) {
		_threat_rating_lkpLocalService = threat_rating_lkpLocalService;
	}

	public threat_rating_lkpLocalService getWrappedService() {
		return _threat_rating_lkpLocalService;
	}

	public void setWrappedService(
		threat_rating_lkpLocalService threat_rating_lkpLocalService) {
		_threat_rating_lkpLocalService = threat_rating_lkpLocalService;
	}

	private threat_rating_lkpLocalService _threat_rating_lkpLocalService;
}