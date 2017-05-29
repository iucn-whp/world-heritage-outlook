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
 * This class is a wrapper for {@link whp_sites_indigenous_communitiesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_indigenous_communitiesLocalService
 * @generated
 */
public class whp_sites_indigenous_communitiesLocalServiceWrapper
	implements whp_sites_indigenous_communitiesLocalService,
		ServiceWrapper<whp_sites_indigenous_communitiesLocalService> {
	public whp_sites_indigenous_communitiesLocalServiceWrapper(
		whp_sites_indigenous_communitiesLocalService whp_sites_indigenous_communitiesLocalService) {
		_whp_sites_indigenous_communitiesLocalService = whp_sites_indigenous_communitiesLocalService;
	}

	/**
	* Adds the whp_sites_indigenous_communities to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities addwhp_sites_indigenous_communities(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.addwhp_sites_indigenous_communities(whp_sites_indigenous_communities);
	}

	/**
	* Creates a new whp_sites_indigenous_communities with the primary key. Does not add the whp_sites_indigenous_communities to the database.
	*
	* @param whp_sites_indigenous_communities_id the primary key for the new whp_sites_indigenous_communities
	* @return the new whp_sites_indigenous_communities
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities createwhp_sites_indigenous_communities(
		long whp_sites_indigenous_communities_id) {
		return _whp_sites_indigenous_communitiesLocalService.createwhp_sites_indigenous_communities(whp_sites_indigenous_communities_id);
	}

	/**
	* Deletes the whp_sites_indigenous_communities with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities_id the primary key of the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities that was removed
	* @throws PortalException if a whp_sites_indigenous_communities with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities deletewhp_sites_indigenous_communities(
		long whp_sites_indigenous_communities_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.deletewhp_sites_indigenous_communities(whp_sites_indigenous_communities_id);
	}

	/**
	* Deletes the whp_sites_indigenous_communities from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities deletewhp_sites_indigenous_communities(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.deletewhp_sites_indigenous_communities(whp_sites_indigenous_communities);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_indigenous_communitiesLocalService.dynamicQuery();
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
		return _whp_sites_indigenous_communitiesLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_indigenous_communitiesLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_indigenous_communitiesLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_indigenous_communitiesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities fetchwhp_sites_indigenous_communities(
		long whp_sites_indigenous_communities_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.fetchwhp_sites_indigenous_communities(whp_sites_indigenous_communities_id);
	}

	/**
	* Returns the whp_sites_indigenous_communities with the primary key.
	*
	* @param whp_sites_indigenous_communities_id the primary key of the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities
	* @throws PortalException if a whp_sites_indigenous_communities with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities getwhp_sites_indigenous_communities(
		long whp_sites_indigenous_communities_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.getwhp_sites_indigenous_communities(whp_sites_indigenous_communities_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_indigenous_communitieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_indigenous_communitieses
	* @param end the upper bound of the range of whp_sites_indigenous_communitieses (not inclusive)
	* @return the range of whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.getwhp_sites_indigenous_communitieses(start,
			end);
	}

	/**
	* Returns the number of whp_sites_indigenous_communitieses.
	*
	* @return the number of whp_sites_indigenous_communitieses
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_indigenous_communitiesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.getwhp_sites_indigenous_communitiesesCount();
	}

	/**
	* Updates the whp_sites_indigenous_communities in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities the whp_sites_indigenous_communities
	* @return the whp_sites_indigenous_communities that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities updatewhp_sites_indigenous_communities(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.updatewhp_sites_indigenous_communities(whp_sites_indigenous_communities);
	}

	/**
	* Updates the whp_sites_indigenous_communities in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_indigenous_communities the whp_sites_indigenous_communities
	* @param merge whether to merge the whp_sites_indigenous_communities with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_indigenous_communities that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_indigenous_communities updatewhp_sites_indigenous_communities(
		com.iucn.whp.dbservice.model.whp_sites_indigenous_communities whp_sites_indigenous_communities,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_indigenous_communitiesLocalService.updatewhp_sites_indigenous_communities(whp_sites_indigenous_communities,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_indigenous_communitiesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_indigenous_communitiesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_indigenous_communitiesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_indigenous_communitiesLocalService getWrappedwhp_sites_indigenous_communitiesLocalService() {
		return _whp_sites_indigenous_communitiesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_indigenous_communitiesLocalService(
		whp_sites_indigenous_communitiesLocalService whp_sites_indigenous_communitiesLocalService) {
		_whp_sites_indigenous_communitiesLocalService = whp_sites_indigenous_communitiesLocalService;
	}

	public whp_sites_indigenous_communitiesLocalService getWrappedService() {
		return _whp_sites_indigenous_communitiesLocalService;
	}

	public void setWrappedService(
		whp_sites_indigenous_communitiesLocalService whp_sites_indigenous_communitiesLocalService) {
		_whp_sites_indigenous_communitiesLocalService = whp_sites_indigenous_communitiesLocalService;
	}

	private whp_sites_indigenous_communitiesLocalService _whp_sites_indigenous_communitiesLocalService;
}