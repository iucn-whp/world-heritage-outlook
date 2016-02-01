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
 * This class is a wrapper for {@link thematic_lkpLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       thematic_lkpLocalService
 * @generated
 */
public class thematic_lkpLocalServiceWrapper implements thematic_lkpLocalService,
	ServiceWrapper<thematic_lkpLocalService> {
	public thematic_lkpLocalServiceWrapper(
		thematic_lkpLocalService thematic_lkpLocalService) {
		_thematic_lkpLocalService = thematic_lkpLocalService;
	}

	/**
	* Adds the thematic_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp addthematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.addthematic_lkp(thematic_lkp);
	}

	/**
	* Creates a new thematic_lkp with the primary key. Does not add the thematic_lkp to the database.
	*
	* @param thematicid the primary key for the new thematic_lkp
	* @return the new thematic_lkp
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp createthematic_lkp(
		long thematicid) {
		return _thematic_lkpLocalService.createthematic_lkp(thematicid);
	}

	/**
	* Deletes the thematic_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp that was removed
	* @throws PortalException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp deletethematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.deletethematic_lkp(thematicid);
	}

	/**
	* Deletes the thematic_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp deletethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.deletethematic_lkp(thematic_lkp);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thematic_lkpLocalService.dynamicQuery();
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
		return _thematic_lkpLocalService.dynamicQuery(dynamicQuery);
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
		return _thematic_lkpLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _thematic_lkpLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _thematic_lkpLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.thematic_lkp fetchthematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.fetchthematic_lkp(thematicid);
	}

	/**
	* Returns the thematic_lkp with the primary key.
	*
	* @param thematicid the primary key of the thematic_lkp
	* @return the thematic_lkp
	* @throws PortalException if a thematic_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp getthematic_lkp(
		long thematicid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.getthematic_lkp(thematicid);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the thematic_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of thematic_lkps
	* @param end the upper bound of the range of thematic_lkps (not inclusive)
	* @return the range of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> getthematic_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.getthematic_lkps(start, end);
	}

	/**
	* Returns the number of thematic_lkps.
	*
	* @return the number of thematic_lkps
	* @throws SystemException if a system exception occurred
	*/
	public int getthematic_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.getthematic_lkpsCount();
	}

	/**
	* Updates the thematic_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @return the thematic_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp updatethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.updatethematic_lkp(thematic_lkp);
	}

	/**
	* Updates the thematic_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thematic_lkp the thematic_lkp
	* @param merge whether to merge the thematic_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the thematic_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.thematic_lkp updatethematic_lkp(
		com.iucn.whp.dbservice.model.thematic_lkp thematic_lkp, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.updatethematic_lkp(thematic_lkp, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _thematic_lkpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thematic_lkpLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thematic_lkpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Get All Other Designation
	*/
	public java.util.List<com.iucn.whp.dbservice.model.thematic_lkp> getAllThematic()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thematic_lkpLocalService.getAllThematic();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public thematic_lkpLocalService getWrappedthematic_lkpLocalService() {
		return _thematic_lkpLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedthematic_lkpLocalService(
		thematic_lkpLocalService thematic_lkpLocalService) {
		_thematic_lkpLocalService = thematic_lkpLocalService;
	}

	public thematic_lkpLocalService getWrappedService() {
		return _thematic_lkpLocalService;
	}

	public void setWrappedService(
		thematic_lkpLocalService thematic_lkpLocalService) {
		_thematic_lkpLocalService = thematic_lkpLocalService;
	}

	private thematic_lkpLocalService _thematic_lkpLocalService;
}