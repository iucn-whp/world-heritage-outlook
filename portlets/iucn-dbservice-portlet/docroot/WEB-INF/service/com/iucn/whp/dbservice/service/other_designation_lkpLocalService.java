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
 * The interface for the other_designation_lkp local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see other_designation_lkpLocalServiceUtil
 * @see com.iucn.whp.dbservice.service.base.other_designation_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.other_designation_lkpLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface other_designation_lkpLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link other_designation_lkpLocalServiceUtil} to access the other_designation_lkp local service. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.other_designation_lkpLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the other_designation_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param other_designation_lkp the other_designation_lkp
	* @return the other_designation_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp addother_designation_lkp(
		com.iucn.whp.dbservice.model.other_designation_lkp other_designation_lkp)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new other_designation_lkp with the primary key. Does not add the other_designation_lkp to the database.
	*
	* @param other_designations_id the primary key for the new other_designation_lkp
	* @return the new other_designation_lkp
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp createother_designation_lkp(
		int other_designations_id);

	/**
	* Deletes the other_designation_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param other_designations_id the primary key of the other_designation_lkp
	* @return the other_designation_lkp that was removed
	* @throws PortalException if a other_designation_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp deleteother_designation_lkp(
		int other_designations_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the other_designation_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param other_designation_lkp the other_designation_lkp
	* @return the other_designation_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp deleteother_designation_lkp(
		com.iucn.whp.dbservice.model.other_designation_lkp other_designation_lkp)
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
	public com.iucn.whp.dbservice.model.other_designation_lkp fetchother_designation_lkp(
		int other_designations_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the other_designation_lkp with the primary key.
	*
	* @param other_designations_id the primary key of the other_designation_lkp
	* @return the other_designation_lkp
	* @throws PortalException if a other_designation_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.iucn.whp.dbservice.model.other_designation_lkp getother_designation_lkp(
		int other_designations_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the other_designation_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of other_designation_lkps
	* @param end the upper bound of the range of other_designation_lkps (not inclusive)
	* @return the range of other_designation_lkps
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.other_designation_lkp> getother_designation_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of other_designation_lkps.
	*
	* @return the number of other_designation_lkps
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getother_designation_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the other_designation_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param other_designation_lkp the other_designation_lkp
	* @return the other_designation_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp updateother_designation_lkp(
		com.iucn.whp.dbservice.model.other_designation_lkp other_designation_lkp)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the other_designation_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param other_designation_lkp the other_designation_lkp
	* @param merge whether to merge the other_designation_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the other_designation_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.other_designation_lkp updateother_designation_lkp(
		com.iucn.whp.dbservice.model.other_designation_lkp other_designation_lkp,
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

	/**
	* Get All Other Designation
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.iucn.whp.dbservice.model.other_designation_lkp> getAllOtherDesignation()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}