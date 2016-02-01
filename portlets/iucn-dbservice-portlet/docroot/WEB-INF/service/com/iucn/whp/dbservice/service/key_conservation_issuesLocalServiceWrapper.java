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
 * This class is a wrapper for {@link key_conservation_issuesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       key_conservation_issuesLocalService
 * @generated
 */
public class key_conservation_issuesLocalServiceWrapper
	implements key_conservation_issuesLocalService,
		ServiceWrapper<key_conservation_issuesLocalService> {
	public key_conservation_issuesLocalServiceWrapper(
		key_conservation_issuesLocalService key_conservation_issuesLocalService) {
		_key_conservation_issuesLocalService = key_conservation_issuesLocalService;
	}

	/**
	* Adds the key_conservation_issues to the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues addkey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.addkey_conservation_issues(key_conservation_issues);
	}

	/**
	* Creates a new key_conservation_issues with the primary key. Does not add the key_conservation_issues to the database.
	*
	* @param key_conservation_issues_id the primary key for the new key_conservation_issues
	* @return the new key_conservation_issues
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues createkey_conservation_issues(
		long key_conservation_issues_id) {
		return _key_conservation_issuesLocalService.createkey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Deletes the key_conservation_issues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws PortalException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues deletekey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.deletekey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Deletes the key_conservation_issues from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues deletekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.deletekey_conservation_issues(key_conservation_issues);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _key_conservation_issuesLocalService.dynamicQuery();
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
		return _key_conservation_issuesLocalService.dynamicQuery(dynamicQuery);
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
		return _key_conservation_issuesLocalService.dynamicQuery(dynamicQuery,
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
		return _key_conservation_issuesLocalService.dynamicQuery(dynamicQuery,
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
		return _key_conservation_issuesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.key_conservation_issues fetchkey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.fetchkey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Returns the key_conservation_issues with the primary key.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues
	* @throws PortalException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues getkey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getkey_conservation_issues(key_conservation_issues_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getkey_conservation_issueses(start,
			end);
	}

	/**
	* Returns the number of key_conservation_issueses.
	*
	* @return the number of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public int getkey_conservation_issuesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getkey_conservation_issuesesCount();
	}

	/**
	* Updates the key_conservation_issues in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues updatekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.updatekey_conservation_issues(key_conservation_issues);
	}

	/**
	* Updates the key_conservation_issues in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @param merge whether to merge the key_conservation_issues with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the key_conservation_issues that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_issues updatekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.updatekey_conservation_issues(key_conservation_issues,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _key_conservation_issuesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_key_conservation_issuesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _key_conservation_issuesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conversionissueByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getkey_conversionissueByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_scale_lkp> getAllconversionScale()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_issuesLocalService.getAllconversionScale();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public key_conservation_issuesLocalService getWrappedkey_conservation_issuesLocalService() {
		return _key_conservation_issuesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedkey_conservation_issuesLocalService(
		key_conservation_issuesLocalService key_conservation_issuesLocalService) {
		_key_conservation_issuesLocalService = key_conservation_issuesLocalService;
	}

	public key_conservation_issuesLocalService getWrappedService() {
		return _key_conservation_issuesLocalService;
	}

	public void setWrappedService(
		key_conservation_issuesLocalService key_conservation_issuesLocalService) {
		_key_conservation_issuesLocalService = key_conservation_issuesLocalService;
	}

	private key_conservation_issuesLocalService _key_conservation_issuesLocalService;
}