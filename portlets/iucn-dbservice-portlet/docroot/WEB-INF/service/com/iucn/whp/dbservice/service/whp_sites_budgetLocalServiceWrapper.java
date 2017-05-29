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
 * This class is a wrapper for {@link whp_sites_budgetLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_budgetLocalService
 * @generated
 */
public class whp_sites_budgetLocalServiceWrapper
	implements whp_sites_budgetLocalService,
		ServiceWrapper<whp_sites_budgetLocalService> {
	public whp_sites_budgetLocalServiceWrapper(
		whp_sites_budgetLocalService whp_sites_budgetLocalService) {
		_whp_sites_budgetLocalService = whp_sites_budgetLocalService;
	}

	/**
	* Adds the whp_sites_budget to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_budget the whp_sites_budget
	* @return the whp_sites_budget that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget addwhp_sites_budget(
		com.iucn.whp.dbservice.model.whp_sites_budget whp_sites_budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.addwhp_sites_budget(whp_sites_budget);
	}

	/**
	* Creates a new whp_sites_budget with the primary key. Does not add the whp_sites_budget to the database.
	*
	* @param whp_sites_budget_id the primary key for the new whp_sites_budget
	* @return the new whp_sites_budget
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget createwhp_sites_budget(
		long whp_sites_budget_id) {
		return _whp_sites_budgetLocalService.createwhp_sites_budget(whp_sites_budget_id);
	}

	/**
	* Deletes the whp_sites_budget with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_budget_id the primary key of the whp_sites_budget
	* @return the whp_sites_budget that was removed
	* @throws PortalException if a whp_sites_budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget deletewhp_sites_budget(
		long whp_sites_budget_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.deletewhp_sites_budget(whp_sites_budget_id);
	}

	/**
	* Deletes the whp_sites_budget from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_budget the whp_sites_budget
	* @return the whp_sites_budget that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget deletewhp_sites_budget(
		com.iucn.whp.dbservice.model.whp_sites_budget whp_sites_budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.deletewhp_sites_budget(whp_sites_budget);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_budgetLocalService.dynamicQuery();
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
		return _whp_sites_budgetLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_budgetLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_sites_budgetLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_sites_budgetLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_budget fetchwhp_sites_budget(
		long whp_sites_budget_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.fetchwhp_sites_budget(whp_sites_budget_id);
	}

	/**
	* Returns the whp_sites_budget with the primary key.
	*
	* @param whp_sites_budget_id the primary key of the whp_sites_budget
	* @return the whp_sites_budget
	* @throws PortalException if a whp_sites_budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget getwhp_sites_budget(
		long whp_sites_budget_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.getwhp_sites_budget(whp_sites_budget_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_budgets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_budgets
	* @param end the upper bound of the range of whp_sites_budgets (not inclusive)
	* @return the range of whp_sites_budgets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.getwhp_sites_budgets(start, end);
	}

	/**
	* Returns the number of whp_sites_budgets.
	*
	* @return the number of whp_sites_budgets
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_budgetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.getwhp_sites_budgetsCount();
	}

	/**
	* Updates the whp_sites_budget in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_budget the whp_sites_budget
	* @return the whp_sites_budget that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget updatewhp_sites_budget(
		com.iucn.whp.dbservice.model.whp_sites_budget whp_sites_budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.updatewhp_sites_budget(whp_sites_budget);
	}

	/**
	* Updates the whp_sites_budget in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_budget the whp_sites_budget
	* @param merge whether to merge the whp_sites_budget with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_budget that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_budget updatewhp_sites_budget(
		com.iucn.whp.dbservice.model.whp_sites_budget whp_sites_budget,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_budgetLocalService.updatewhp_sites_budget(whp_sites_budget,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_budgetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_budgetLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_budgetLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_budgetLocalService getWrappedwhp_sites_budgetLocalService() {
		return _whp_sites_budgetLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_budgetLocalService(
		whp_sites_budgetLocalService whp_sites_budgetLocalService) {
		_whp_sites_budgetLocalService = whp_sites_budgetLocalService;
	}

	public whp_sites_budgetLocalService getWrappedService() {
		return _whp_sites_budgetLocalService;
	}

	public void setWrappedService(
		whp_sites_budgetLocalService whp_sites_budgetLocalService) {
		_whp_sites_budgetLocalService = whp_sites_budgetLocalService;
	}

	private whp_sites_budgetLocalService _whp_sites_budgetLocalService;
}