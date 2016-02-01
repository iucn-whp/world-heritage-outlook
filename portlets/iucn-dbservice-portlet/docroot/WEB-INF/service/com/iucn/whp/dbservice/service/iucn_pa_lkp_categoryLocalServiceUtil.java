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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the iucn_pa_lkp_category local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.iucn_pa_lkp_categoryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see iucn_pa_lkp_categoryLocalService
 * @see com.iucn.whp.dbservice.service.base.iucn_pa_lkp_categoryLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.iucn_pa_lkp_categoryLocalServiceImpl
 * @generated
 */
public class iucn_pa_lkp_categoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.iucn_pa_lkp_categoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the iucn_pa_lkp_category to the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category addiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	/**
	* Creates a new iucn_pa_lkp_category with the primary key. Does not add the iucn_pa_lkp_category to the database.
	*
	* @param iucn_pa_category_id the primary key for the new iucn_pa_lkp_category
	* @return the new iucn_pa_lkp_category
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category createiucn_pa_lkp_category(
		int iucn_pa_category_id) {
		return getService().createiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Deletes the iucn_pa_lkp_category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was removed
	* @throws PortalException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category deleteiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Deletes the iucn_pa_lkp_category from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category deleteiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category fetchiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchiucn_pa_lkp_category(iucn_pa_category_id);
	}

	/**
	* Returns the iucn_pa_lkp_category with the primary key.
	*
	* @param iucn_pa_category_id the primary key of the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category
	* @throws PortalException if a iucn_pa_lkp_category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category getiucn_pa_lkp_category(
		int iucn_pa_category_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_pa_lkp_category(iucn_pa_category_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> getiucn_pa_lkp_categories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_pa_lkp_categories(start, end);
	}

	/**
	* Returns the number of iucn_pa_lkp_categories.
	*
	* @return the number of iucn_pa_lkp_categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getiucn_pa_lkp_categoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getiucn_pa_lkp_categoriesCount();
	}

	/**
	* Updates the iucn_pa_lkp_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @return the iucn_pa_lkp_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category updateiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateiucn_pa_lkp_category(iucn_pa_lkp_category);
	}

	/**
	* Updates the iucn_pa_lkp_category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_pa_lkp_category the iucn_pa_lkp_category
	* @param merge whether to merge the iucn_pa_lkp_category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the iucn_pa_lkp_category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.iucn_pa_lkp_category updateiucn_pa_lkp_category(
		com.iucn.whp.dbservice.model.iucn_pa_lkp_category iucn_pa_lkp_category,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateiucn_pa_lkp_category(iucn_pa_lkp_category, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Get All PA catogary
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.iucn_pa_lkp_category> getAllIucnPaCategory()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllIucnPaCategory();
	}

	public static void clearService() {
		_service = null;
	}

	public static iucn_pa_lkp_categoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					iucn_pa_lkp_categoryLocalService.class.getName());

			if (invokableLocalService instanceof iucn_pa_lkp_categoryLocalService) {
				_service = (iucn_pa_lkp_categoryLocalService)invokableLocalService;
			}
			else {
				_service = new iucn_pa_lkp_categoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(iucn_pa_lkp_categoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(iucn_pa_lkp_categoryLocalService service) {
	}

	private static iucn_pa_lkp_categoryLocalService _service;
}