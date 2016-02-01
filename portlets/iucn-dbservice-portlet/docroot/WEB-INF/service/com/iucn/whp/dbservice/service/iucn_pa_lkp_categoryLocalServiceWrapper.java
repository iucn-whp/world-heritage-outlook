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
 * This class is a wrapper for {@link iucn_pa_lkp_categoryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       iucn_pa_lkp_categoryLocalService
 * @generated
 */
public class iucn_pa_lkp_categoryLocalServiceWrapper
	implements iucn_pa_lkp_categoryLocalService,
		ServiceWrapper<iucn_pa_lkp_categoryLocalService> {
	public iucn_pa_lkp_categoryLocalServiceWrapper(
		iucn_pa_lkp_categoryLocalService iucn_pa_lkp_categoryLocalService) {
		_iucn_pa_lkp_categoryLocalService = iucn_pa_lkp_categoryLocalService;
	}

	/**
	* Adds the iucn_pa_lkp_category to the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category addiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.addiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	/**
	* Creates a new iucn_pa_lkp_category with the primary key. Does not add the iucn_pa_lkp_category to the database.
	*
	* @param iucn_pa_category_id the primary key for the new iucn_pa_lkp_category
	* @return the new iucn_pa_lkp_category
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category createiucn_pa_lkp_category(
		int iucn_pa_category_id) {
		return _iucn_pa_lkp_categoryLocalService.createiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Deletes the iucn_pa_lkp_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was removed
	* @throws PortalException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category deleteiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.deleteiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Deletes the iucn_pa_lkp_category from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category deleteiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.deleteiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _iucn_pa_lkp_categoryLocalService.dynamicQuery();
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
		return _iucn_pa_lkp_categoryLocalService.dynamicQuery(dynamicQuery);
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
		return _iucn_pa_lkp_categoryLocalService.dynamicQuery(dynamicQuery,
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
		return _iucn_pa_lkp_categoryLocalService.dynamicQuery(dynamicQuery,
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
		return _iucn_pa_lkp_categoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category fetchiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.fetchiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Returns the iucn_pa_lkp_category with the primary key.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category
	* @throws PortalException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category getiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.getiucn_pa_lkp_category(iucn_pa_category_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the iucn_pa_lkp_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_pa_lkp_categories
	* @param end the upper bound of the range of iucn_pa_lkp_categories (not inclusive)
	* @return the range of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> getiucn_pa_lkp_categories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.getiucn_pa_lkp_categories(start,
			end);
	}

	/**
	* Returns the number of iucn_pa_lkp_categories.
	*
	* @return the number of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public int getiucn_pa_lkp_categoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.getiucn_pa_lkp_categoriesCount();
	}

	/**
	* Updates the iucn_pa_lkp_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category updateiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.updateiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	/**
	* Updates the iucn_pa_lkp_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @param merge whether to merge the iucn_pa_lkp_category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the iucn_pa_lkp_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_pa_lkp_category updateiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.updateiucn_pa_lkp_category(iucn_pa_lkp_category,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _iucn_pa_lkp_categoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_iucn_pa_lkp_categoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _iucn_pa_lkp_categoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Get All PA catogary
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> getAllIucnPaCategory()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_pa_lkp_categoryLocalService.getAllIucnPaCategory();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public iucn_pa_lkp_categoryLocalService getWrappediucn_pa_lkp_categoryLocalService() {
		return _iucn_pa_lkp_categoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappediucn_pa_lkp_categoryLocalService(
		iucn_pa_lkp_categoryLocalService iucn_pa_lkp_categoryLocalService) {
		_iucn_pa_lkp_categoryLocalService = iucn_pa_lkp_categoryLocalService;
	}

	public iucn_pa_lkp_categoryLocalService getWrappedService() {
		return _iucn_pa_lkp_categoryLocalService;
	}

	public void setWrappedService(
		iucn_pa_lkp_categoryLocalService iucn_pa_lkp_categoryLocalService) {
		_iucn_pa_lkp_categoryLocalService = iucn_pa_lkp_categoryLocalService;
	}

	private iucn_pa_lkp_categoryLocalService _iucn_pa_lkp_categoryLocalService;
}