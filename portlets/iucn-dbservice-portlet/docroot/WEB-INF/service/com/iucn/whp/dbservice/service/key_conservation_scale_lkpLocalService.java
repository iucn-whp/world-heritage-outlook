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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the key_conservation_scale_lkp local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see key_conservation_scale_lkpLocalServiceUtil
 * @see com.iucn.whp.dbservice.service.base.key_conservation_scale_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.key_conservation_scale_lkpLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface key_conservation_scale_lkpLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link key_conservation_scale_lkpLocalServiceUtil} to access the key_conservation_scale_lkp local service. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.key_conservation_scale_lkpLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the key_conservation_scale_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp addkey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new key_conservation_scale_lkp with the primary key. Does not add the key_conservation_scale_lkp to the database.
	*
	* @param scale_id the primary key for the new key_conservation_scale_lkp
	* @return the new key_conservation_scale_lkp
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp createkey_conservation_scale_lkp(
		long scale_id);

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
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the key_conservation_scale_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp deletekey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp fetchkey_conservation_scale_lkp(
		long scale_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the key_conservation_scale_lkp with the primary key.
	*
	* @param scale_id the primary key of the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp
	* @throws PortalException if a key_conservation_scale_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp getkey_conservation_scale_lkp(
		long scale_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.key_conservation_scale_lkp> getkey_conservation_scale_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of key_conservation_scale_lkps.
	*
	* @return the number of key_conservation_scale_lkps
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getkey_conservation_scale_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the key_conservation_scale_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_scale_lkp the key_conservation_scale_lkp
	* @return the key_conservation_scale_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.key_conservation_scale_lkp updatekey_conservation_scale_lkp(
		com.iucn.whp.dbservice.model.key_conservation_scale_lkp key_conservation_scale_lkp)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}