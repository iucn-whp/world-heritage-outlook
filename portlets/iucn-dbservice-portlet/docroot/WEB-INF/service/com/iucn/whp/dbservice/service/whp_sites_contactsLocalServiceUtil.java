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
 * The utility for the whp_sites_contacts local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_sites_contactsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_contactsLocalService
 * @see com.iucn.whp.dbservice.service.base.whp_sites_contactsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_sites_contactsLocalServiceImpl
 * @generated
 */
public class whp_sites_contactsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_sites_contactsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the whp_sites_contacts to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts the whp_sites_contacts
	* @return the whp_sites_contacts that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts addwhp_sites_contacts(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addwhp_sites_contacts(whp_sites_contacts);
	}

	/**
	* Creates a new whp_sites_contacts with the primary key. Does not add the whp_sites_contacts to the database.
	*
	* @param whp_sites_contacts_id the primary key for the new whp_sites_contacts
	* @return the new whp_sites_contacts
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts createwhp_sites_contacts(
		long whp_sites_contacts_id) {
		return getService().createwhp_sites_contacts(whp_sites_contacts_id);
	}

	/**
	* Deletes the whp_sites_contacts with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts_id the primary key of the whp_sites_contacts
	* @return the whp_sites_contacts that was removed
	* @throws PortalException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts deletewhp_sites_contacts(
		long whp_sites_contacts_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites_contacts(whp_sites_contacts_id);
	}

	/**
	* Deletes the whp_sites_contacts from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts the whp_sites_contacts
	* @return the whp_sites_contacts that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts deletewhp_sites_contacts(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_sites_contacts(whp_sites_contacts);
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

	public static com.iucn.whp.dbservice.model.whp_sites_contacts fetchwhp_sites_contacts(
		long whp_sites_contacts_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchwhp_sites_contacts(whp_sites_contacts_id);
	}

	/**
	* Returns the whp_sites_contacts with the primary key.
	*
	* @param whp_sites_contacts_id the primary key of the whp_sites_contacts
	* @return the whp_sites_contacts
	* @throws PortalException if a whp_sites_contacts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts getwhp_sites_contacts(
		long whp_sites_contacts_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_contacts(whp_sites_contacts_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_contactses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_contactses
	* @param end the upper bound of the range of whp_sites_contactses (not inclusive)
	* @return the range of whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_contactses(start, end);
	}

	/**
	* Returns the number of whp_sites_contactses.
	*
	* @return the number of whp_sites_contactses
	* @throws SystemException if a system exception occurred
	*/
	public static int getwhp_sites_contactsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_sites_contactsesCount();
	}

	/**
	* Updates the whp_sites_contacts in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts the whp_sites_contacts
	* @return the whp_sites_contacts that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts updatewhp_sites_contacts(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites_contacts(whp_sites_contacts);
	}

	/**
	* Updates the whp_sites_contacts in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_contacts the whp_sites_contacts
	* @param merge whether to merge the whp_sites_contacts with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_contacts that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_sites_contacts updatewhp_sites_contacts(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_sites_contacts(whp_sites_contacts, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getAllContactCategories(
		java.lang.Long siteid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllContactCategories(siteid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getAllWhpContactsBySiteId(
		java.lang.Long siteid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllWhpContactsBySiteId(siteid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.whp_sites_contacts> getAllWhpSitesByContactId(
		java.lang.Integer contactid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllWhpSitesByContactId(contactid);
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_sites_contactsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_sites_contactsLocalService.class.getName());

			if (invokableLocalService instanceof whp_sites_contactsLocalService) {
				_service = (whp_sites_contactsLocalService)invokableLocalService;
			}
			else {
				_service = new whp_sites_contactsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(whp_sites_contactsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_sites_contactsLocalService service) {
	}

	private static whp_sites_contactsLocalService _service;
}