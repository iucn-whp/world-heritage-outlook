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
 * This class is a wrapper for {@link key_conservation_scale_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       key_conservation_scale_lkpLocalService
 * @generated
 */
public class key_conservation_scale_lkpLocalServiceWrapper
	implements key_conservation_scale_lkpLocalService,
		ServiceWrapper<key_conservation_scale_lkpLocalService> {
	public key_conservation_scale_lkpLocalServiceWrapper(
		key_conservation_scale_lkpLocalService key_conservation_scale_lkpLocalService) {
		_key_conservation_scale_lkpLocalService = key_conservation_scale_lkpLocalService;
	}

	/**
	* Adds the key_conservation_scale_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp addkey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.addkey_conservation_scale_lkp(key_conservation_scale_lkp);
	}

	/**
	* Creates a new key_conservation_scale_lkp with the primary key. Does not add the key_conservation_scale_lkp to the database.
	*
	* @param scale_id the primary key for the new key_conservation_scale_lkp
	* @return the new key_conservation_scale_lkp
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp createkey_conservation_scale_lkp(
		long scale_id) {
		return _key_conservation_scale_lkpLocalService.createkey_conservation_scale_lkp(scale_id);
	}

	/**
	* Deletes the key_conservation_scale_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scale_id the primary key of the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was removed
	* @throws PortalException if a key_conservation_scale_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp deletekey_conservation_scale_lkp(
		long scale_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.deletekey_conservation_scale_lkp(scale_id);
	}

	/**
	* Deletes the key_conservation_scale_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp deletekey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.deletekey_conservation_scale_lkp(key_conservation_scale_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _key_conservation_scale_lkpLocalService.dynamicQuery();
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
		return _key_conservation_scale_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _key_conservation_scale_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _key_conservation_scale_lkpLocalService.dynamicQuery(dynamicQuery,
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
		return _key_conservation_scale_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp fetchkey_conservation_scale_lkp(
		long scale_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.fetchkey_conservation_scale_lkp(scale_id);
	}

	/**
	* Returns the key_conservation_scale_lkp with the primary key.
	*
	* @param scale_id the primary key of the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp
	* @throws PortalException if a key_conservation_scale_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp getkey_conservation_scale_lkp(
		long scale_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.getkey_conservation_scale_lkp(scale_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the key_conservation_scale_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_scale_lkps
	* @param end the upper bound of the range of key_conservation_scale_lkps (not inclusive)
	* @return the range of key_conservation_scale_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_scale_lkp> getkey_conservation_scale_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.getkey_conservation_scale_lkps(start,
			end);
	}

	/**
	* Returns the number of key_conservation_scale_lkps.
	*
	* @return the number of key_conservation_scale_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getkey_conservation_scale_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.getkey_conservation_scale_lkpsCount();
	}

	/**
	* Updates the key_conservation_scale_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp updatekey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.updatekey_conservation_scale_lkp(key_conservation_scale_lkp);
	}

	/**
	* Updates the key_conservation_scale_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @param merge whether to merge the key_conservation_scale_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the key_conservation_scale_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp updatekey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _key_conservation_scale_lkpLocalService.updatekey_conservation_scale_lkp(key_conservation_scale_lkp,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _key_conservation_scale_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_key_conservation_scale_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _key_conservation_scale_lkpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public key_conservation_scale_lkpLocalService getWrappedkey_conservation_scale_lkpLocalService() {
		return _key_conservation_scale_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedkey_conservation_scale_lkpLocalService(
		key_conservation_scale_lkpLocalService key_conservation_scale_lkpLocalService) {
		_key_conservation_scale_lkpLocalService = key_conservation_scale_lkpLocalService;
	}

	public key_conservation_scale_lkpLocalService getWrappedService() {
		return _key_conservation_scale_lkpLocalService;
	}

	public void setWrappedService(
		key_conservation_scale_lkpLocalService key_conservation_scale_lkpLocalService) {
		_key_conservation_scale_lkpLocalService = key_conservation_scale_lkpLocalService;
	}

	private key_conservation_scale_lkpLocalService _key_conservation_scale_lkpLocalService;
}