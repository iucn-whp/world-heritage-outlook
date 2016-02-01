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
 * This class is a wrapper for {@link contact_categoryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       contact_categoryLocalService
 * @generated
 */
public class contact_categoryLocalServiceWrapper
	implements contact_categoryLocalService,
		ServiceWrapper<contact_categoryLocalService> {
	public contact_categoryLocalServiceWrapper(
		contact_categoryLocalService contact_categoryLocalService) {
		_contact_categoryLocalService = contact_categoryLocalService;
	}

	/**
	* Adds the contact_category to the database. Also notifies the appropriate model listeners.
	*
	* @param contact_category the contact_category
	* @return the contact_category that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category addcontact_category(
		com.iucn.whp.dbservice.model.contact_category contact_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.addcontact_category(contact_category);
	}

	/**
	* Creates a new contact_category with the primary key. Does not add the contact_category to the database.
	*
	* @param contact_category_id the primary key for the new contact_category
	* @return the new contact_category
	*/
	public com.iucn.whp.dbservice.model.contact_category createcontact_category(
		int contact_category_id) {
		return _contact_categoryLocalService.createcontact_category(contact_category_id);
	}

	/**
	* Deletes the contact_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_category_id the primary key of the contact_category
	* @return the contact_category that was removed
	* @throws PortalException if a contact_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category deletecontact_category(
		int contact_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.deletecontact_category(contact_category_id);
	}

	/**
	* Deletes the contact_category from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_category the contact_category
	* @return the contact_category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category deletecontact_category(
		com.iucn.whp.dbservice.model.contact_category contact_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.deletecontact_category(contact_category);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contact_categoryLocalService.dynamicQuery();
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
		return _contact_categoryLocalService.dynamicQuery(dynamicQuery);
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
		return _contact_categoryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _contact_categoryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _contact_categoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.contact_category fetchcontact_category(
		int contact_category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.fetchcontact_category(contact_category_id);
	}

	/**
	* Returns the contact_category with the primary key.
	*
	* @param contact_category_id the primary key of the contact_category
	* @return the contact_category
	* @throws PortalException if a contact_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category getcontact_category(
		int contact_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.getcontact_category(contact_category_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the contact_categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contact_categories
	* @param end the upper bound of the range of contact_categories (not inclusive)
	* @return the range of contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.contact_category> getcontact_categories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.getcontact_categories(start, end);
	}

	/**
	* Returns the number of contact_categories.
	*
	* @return the number of contact_categories
	* @throws SystemException if a system exception occurred
	*/
	public int getcontact_categoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.getcontact_categoriesCount();
	}

	/**
	* Updates the contact_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact_category the contact_category
	* @return the contact_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category updatecontact_category(
		com.iucn.whp.dbservice.model.contact_category contact_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.updatecontact_category(contact_category);
	}

	/**
	* Updates the contact_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact_category the contact_category
	* @param merge whether to merge the contact_category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the contact_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.contact_category updatecontact_category(
		com.iucn.whp.dbservice.model.contact_category contact_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.updatecontact_category(contact_category,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _contact_categoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_contact_categoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contact_categoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.contact_category> getContactCategory()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contact_categoryLocalService.getContactCategory();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public contact_categoryLocalService getWrappedcontact_categoryLocalService() {
		return _contact_categoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcontact_categoryLocalService(
		contact_categoryLocalService contact_categoryLocalService) {
		_contact_categoryLocalService = contact_categoryLocalService;
	}

	public contact_categoryLocalService getWrappedService() {
		return _contact_categoryLocalService;
	}

	public void setWrappedService(
		contact_categoryLocalService contact_categoryLocalService) {
		_contact_categoryLocalService = contact_categoryLocalService;
	}

	private contact_categoryLocalService _contact_categoryLocalService;
}