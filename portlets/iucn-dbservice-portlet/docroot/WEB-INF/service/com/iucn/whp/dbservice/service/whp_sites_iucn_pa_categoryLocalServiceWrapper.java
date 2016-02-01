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
 * This class is a wrapper for {@link whp_sites_iucn_pa_categoryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_iucn_pa_categoryLocalService
 * @generated
 */
public class whp_sites_iucn_pa_categoryLocalServiceWrapper
	implements whp_sites_iucn_pa_categoryLocalService,
		ServiceWrapper<whp_sites_iucn_pa_categoryLocalService> {
	public whp_sites_iucn_pa_categoryLocalServiceWrapper(
		whp_sites_iucn_pa_categoryLocalService whp_sites_iucn_pa_categoryLocalService) {
		_whp_sites_iucn_pa_categoryLocalService = whp_sites_iucn_pa_categoryLocalService;
	}

	/**
	* Adds the whp_sites_iucn_pa_category to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_pa_category the whp_sites_iucn_pa_category
	* @return the whp_sites_iucn_pa_category that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category addwhp_sites_iucn_pa_category(
		com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category whp_sites_iucn_pa_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.addwhp_sites_iucn_pa_category(whp_sites_iucn_pa_category);
	}

	/**
	* Creates a new whp_sites_iucn_pa_category with the primary key. Does not add the whp_sites_iucn_pa_category to the database.
	*
	* @param whp_sites_iucn_pa_category_id the primary key for the new whp_sites_iucn_pa_category
	* @return the new whp_sites_iucn_pa_category
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category createwhp_sites_iucn_pa_category(
		long whp_sites_iucn_pa_category_id) {
		return _whp_sites_iucn_pa_categoryLocalService.createwhp_sites_iucn_pa_category(whp_sites_iucn_pa_category_id);
	}

	/**
	* Deletes the whp_sites_iucn_pa_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_pa_category_id the primary key of the whp_sites_iucn_pa_category
	* @return the whp_sites_iucn_pa_category that was removed
	* @throws PortalException if a whp_sites_iucn_pa_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category deletewhp_sites_iucn_pa_category(
		long whp_sites_iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.deletewhp_sites_iucn_pa_category(whp_sites_iucn_pa_category_id);
	}

	/**
	* Deletes the whp_sites_iucn_pa_category from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_pa_category the whp_sites_iucn_pa_category
	* @return the whp_sites_iucn_pa_category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category deletewhp_sites_iucn_pa_category(
		com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category whp_sites_iucn_pa_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.deletewhp_sites_iucn_pa_category(whp_sites_iucn_pa_category);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_iucn_pa_categoryLocalService.dynamicQuery();
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
		return _whp_sites_iucn_pa_categoryLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_iucn_pa_categoryLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_iucn_pa_categoryLocalService.dynamicQuery(dynamicQuery,
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
		return _whp_sites_iucn_pa_categoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category fetchwhp_sites_iucn_pa_category(
		long whp_sites_iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.fetchwhp_sites_iucn_pa_category(whp_sites_iucn_pa_category_id);
	}

	/**
	* Returns the whp_sites_iucn_pa_category with the primary key.
	*
	* @param whp_sites_iucn_pa_category_id the primary key of the whp_sites_iucn_pa_category
	* @return the whp_sites_iucn_pa_category
	* @throws PortalException if a whp_sites_iucn_pa_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category getwhp_sites_iucn_pa_category(
		long whp_sites_iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.getwhp_sites_iucn_pa_category(whp_sites_iucn_pa_category_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_iucn_pa_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_iucn_pa_categories
	* @param end the upper bound of the range of whp_sites_iucn_pa_categories (not inclusive)
	* @return the range of whp_sites_iucn_pa_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.getwhp_sites_iucn_pa_categories(start,
			end);
	}

	/**
	* Returns the number of whp_sites_iucn_pa_categories.
	*
	* @return the number of whp_sites_iucn_pa_categories
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_iucn_pa_categoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.getwhp_sites_iucn_pa_categoriesCount();
	}

	/**
	* Updates the whp_sites_iucn_pa_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_pa_category the whp_sites_iucn_pa_category
	* @return the whp_sites_iucn_pa_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category updatewhp_sites_iucn_pa_category(
		com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category whp_sites_iucn_pa_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.updatewhp_sites_iucn_pa_category(whp_sites_iucn_pa_category);
	}

	/**
	* Updates the whp_sites_iucn_pa_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_iucn_pa_category the whp_sites_iucn_pa_category
	* @param merge whether to merge the whp_sites_iucn_pa_category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_iucn_pa_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category updatewhp_sites_iucn_pa_category(
		com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category whp_sites_iucn_pa_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.updatewhp_sites_iucn_pa_category(whp_sites_iucn_pa_category,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_iucn_pa_categoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_iucn_pa_categoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_iucn_pa_categoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* WHP_IUCN PA CATEGORY
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getWhpSiteIUCNPACategoryBySiteId(
		long siteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_iucn_pa_categoryLocalService.getWhpSiteIUCNPACategoryBySiteId(siteId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_iucn_pa_categoryLocalService getWrappedwhp_sites_iucn_pa_categoryLocalService() {
		return _whp_sites_iucn_pa_categoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_iucn_pa_categoryLocalService(
		whp_sites_iucn_pa_categoryLocalService whp_sites_iucn_pa_categoryLocalService) {
		_whp_sites_iucn_pa_categoryLocalService = whp_sites_iucn_pa_categoryLocalService;
	}

	public whp_sites_iucn_pa_categoryLocalService getWrappedService() {
		return _whp_sites_iucn_pa_categoryLocalService;
	}

	public void setWrappedService(
		whp_sites_iucn_pa_categoryLocalService whp_sites_iucn_pa_categoryLocalService) {
		_whp_sites_iucn_pa_categoryLocalService = whp_sites_iucn_pa_categoryLocalService;
	}

	private whp_sites_iucn_pa_categoryLocalService _whp_sites_iucn_pa_categoryLocalService;
}